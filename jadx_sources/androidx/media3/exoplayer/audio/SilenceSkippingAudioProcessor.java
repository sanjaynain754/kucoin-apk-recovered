package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SilenceSkippingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int AVOID_TRUNCATION_FACTOR = 1000;
    public static final long DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US = 2000000;
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 100000;
    public static final int DEFAULT_MIN_VOLUME_TO_KEEP_PERCENTAGE = 10;

    @Deprecated
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final float DEFAULT_SILENCE_RETENTION_RATIO = 0.2f;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int DO_NOT_CHANGE_VOLUME = 3;
    private static final int FADE_IN = 2;
    private static final int FADE_OUT = 0;
    private static final int MUTE = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SHORTENING_SILENCE = 1;
    private int bytesPerFrame;
    private byte[] contiguousOutputBuffer;
    private boolean enabled;
    private final long maxSilenceToKeepDurationUs;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferContentsSize;
    private int maybeSilenceBufferStartIndex;
    private final int minVolumeToKeepPercentageWhenMuting;
    private final long minimumSilenceDurationUs;
    private int outputSilenceFramesSinceNoise;
    private final float silenceRetentionRatio;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    private int alignToBytePerFrameBoundary(int i11) {
        int i12 = this.bytesPerFrame;
        return (i11 / i12) * i12;
    }

    private void modifyVolume(byte[] bArr, int i11, int i12) {
        if (i12 == 3) {
            return;
        }
        for (int i13 = 0; i13 < i11; i13 += 2) {
            sampleIntToTwoBigEndianBytes(bArr, i13, (twoByteSampleToInt(bArr[i13 + 1], bArr[i13]) * (i12 == 0 ? calculateFadeOutPercentage(i13, i11 - 1) : i12 == 2 ? calculateFadeInPercentage(i13, i11 - 1) : this.minVolumeToKeepPercentageWhenMuting)) / 100);
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.enabled = false;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    @Deprecated
    public SilenceSkippingAudioProcessor(long j11, long j12, short s11) {
        this(j11, j12 / j11, j11, 0, s11);
    }

    private int alignToBytePerFrameBoundary(float f11) {
        return alignToBytePerFrameBoundary((int) f11);
    }

    private int calculateFadeInPercentage(int i11, int i12) {
        int i13 = this.minVolumeToKeepPercentageWhenMuting;
        return i13 + ((((100 - i13) * (i11 * 1000)) / i12) / 1000);
    }

    private int calculateFadeOutPercentage(int i11, int i12) {
        return (((this.minVolumeToKeepPercentageWhenMuting - 100) * ((i11 * 1000) / i12)) / 1000) + 100;
    }

    private int calculateShortenedSilenceLength(int i11) {
        int iDurationUsToFrames = ((durationUsToFrames(this.maxSilenceToKeepDurationUs) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length / 2);
        Assertions.checkState(iDurationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(Math.min((i11 * this.silenceRetentionRatio) + 0.5f, iDurationUsToFrames));
    }

    private int durationUsToFrames(long j11) {
        return (int) ((j11 * ((long) this.inputAudioFormat.sampleRate)) / 1000000);
    }

    private void outputRange(byte[] bArr, int i11, int i12) {
        Assertions.checkArgument(i11 % this.bytesPerFrame == 0, "byteOutput size is not aligned to frame size " + i11);
        modifyVolume(bArr, i11, i12);
        replaceOutputBuffer(i11).put(bArr, 0, i11).flip();
    }

    private void outputShortenedSilenceBuffer(boolean z11) {
        int length;
        int iCalculateShortenedSilenceLength;
        int i11 = this.maybeSilenceBufferContentsSize;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i11 == bArr.length || z11) {
            if (this.outputSilenceFramesSinceNoise == 0) {
                if (z11) {
                    outputSilence(i11, 3);
                    length = i11;
                } else {
                    Assertions.checkState(i11 >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    outputSilence(length, 0);
                }
                iCalculateShortenedSilenceLength = length;
            } else if (z11) {
                int length2 = i11 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iCalculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.maybeSilenceBuffer.length / 2);
                outputSilence(iCalculateShortenedSilenceLength2, 2);
                iCalculateShortenedSilenceLength = iCalculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i11 - (bArr.length / 2);
                iCalculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(iCalculateShortenedSilenceLength, 1);
            }
            Assertions.checkState(length % this.bytesPerFrame == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            Assertions.checkState(i11 >= iCalculateShortenedSilenceLength);
            this.maybeSilenceBufferContentsSize -= length;
            int i12 = this.maybeSilenceBufferStartIndex + length;
            this.maybeSilenceBufferStartIndex = i12;
            this.maybeSilenceBufferStartIndex = i12 % this.maybeSilenceBuffer.length;
            int i13 = this.outputSilenceFramesSinceNoise;
            int i14 = this.bytesPerFrame;
            this.outputSilenceFramesSinceNoise = i13 + (iCalculateShortenedSilenceLength / i14);
            this.skippedFrames += (long) ((length - iCalculateShortenedSilenceLength) / i14);
        }
    }

    private void outputSilence(int i11, int i12) {
        if (i11 == 0) {
            return;
        }
        Assertions.checkArgument(this.maybeSilenceBufferContentsSize >= i11);
        if (i12 == 2) {
            int i13 = this.maybeSilenceBufferStartIndex;
            int i14 = this.maybeSilenceBufferContentsSize;
            int i15 = i13 + i14;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i15 <= bArr.length) {
                System.arraycopy(bArr, (i13 + i14) - i11, this.contiguousOutputBuffer, 0, i11);
            } else {
                int length = i14 - (bArr.length - i13);
                if (length >= i11) {
                    System.arraycopy(bArr, length - i11, this.contiguousOutputBuffer, 0, i11);
                } else {
                    int i16 = i11 - length;
                    System.arraycopy(bArr, bArr.length - i16, this.contiguousOutputBuffer, 0, i16);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i16, length);
                }
            }
        } else {
            int i17 = this.maybeSilenceBufferStartIndex;
            int i18 = i17 + i11;
            byte[] bArr2 = this.maybeSilenceBuffer;
            if (i18 <= bArr2.length) {
                System.arraycopy(bArr2, i17, this.contiguousOutputBuffer, 0, i11);
            } else {
                int length2 = bArr2.length - i17;
                System.arraycopy(bArr2, i17, this.contiguousOutputBuffer, 0, length2);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length2, i11 - length2);
            }
        }
        Assertions.checkArgument(i11 % this.bytesPerFrame == 0, "sizeToOutput is not aligned to frame size: " + i11);
        Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        outputRange(this.contiguousOutputBuffer, i11, i12);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i11, int i12) {
        if (i12 >= 32767) {
            bArr[i11] = -1;
            bArr[i11 + 1] = 127;
        } else if (i12 <= -32768) {
            bArr[i11] = 0;
            bArr[i11 + 1] = -128;
        } else {
            bArr[i11] = (byte) (i12 & 255);
            bArr[i11 + 1] = (byte) (i12 >> 8);
        }
    }

    private void shortenSilenceSilenceUntilNoise(ByteBuffer byteBuffer) {
        int length;
        int i11;
        Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        int i12 = this.maybeSilenceBufferStartIndex;
        int i13 = this.maybeSilenceBufferContentsSize;
        int i14 = i12 + i13;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i14 < bArr.length) {
            length = bArr.length - (i13 + i12);
            i11 = i12 + i13;
        } else {
            int length2 = i13 - (bArr.length - i12);
            length = i12 - length2;
            i11 = length2;
        }
        boolean z11 = iFindNoisePosition < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, i11, iMin);
        int i15 = this.maybeSilenceBufferContentsSize + iMin;
        this.maybeSilenceBufferContentsSize = i15;
        Assertions.checkState(i15 <= this.maybeSilenceBuffer.length);
        boolean z12 = z11 && iPosition < length;
        outputShortenedSilenceBuffer(z12);
        if (z12) {
            this.state = 0;
            this.outputSilenceFramesSinceNoise = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int twoByteSampleToInt(byte b11, byte b12) {
        return (b11 << 8) | (b12 & 255);
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return audioFormat.sampleRate == -1 ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    public void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public SilenceSkippingAudioProcessor(long j11, float f11, long j12, int i11, short s11) {
        boolean z11 = false;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
        if (f11 >= 0.0f && f11 <= 1.0f) {
            z11 = true;
        }
        Assertions.checkArgument(z11);
        this.minimumSilenceDurationUs = j11;
        this.silenceRetentionRatio = f11;
        this.maxSilenceToKeepDurationUs = j12;
        this.minVolumeToKeepPercentageWhenMuting = i11;
        this.silenceThresholdLevel = s11;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (isNoise(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i11 = this.bytesPerFrame;
                return ((iLimit / i11) * i11) + i11;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (isNoise(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i11 = this.bytesPerFrame;
                return i11 * (iPosition / i11);
            }
        }
        return byteBuffer.limit();
    }

    private boolean isNoise(byte b11, byte b12) {
        if (Math.abs(twoByteSampleToInt(b11, b12)) > this.silenceThresholdLevel) {
            return true;
        }
        return false;
    }

    private void output(ByteBuffer byteBuffer) {
        replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(Math.min(iFindNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        if (super.isActive() && this.enabled) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        if (isActive()) {
            this.bytesPerFrame = this.inputAudioFormat.channelCount * 2;
            int iAlignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.minimumSilenceDurationUs) / 2) * 2;
            if (this.maybeSilenceBuffer.length != iAlignToBytePerFrameBoundary) {
                this.maybeSilenceBuffer = new byte[iAlignToBytePerFrameBoundary];
                this.contiguousOutputBuffer = new byte[iAlignToBytePerFrameBoundary];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i11 = this.state;
            if (i11 != 0) {
                if (i11 == 1) {
                    shortenSilenceSilenceUntilNoise(byteBuffer);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                processNoisy(byteBuffer);
            }
        }
    }
}
