package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
final class TrimmingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int OUTPUT_ENCODING = 2;
    private byte[] endBuffer = Util.EMPTY_BYTE_ARRAY;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j11) {
        return j11 - Util.sampleCountToDurationUs(this.trimEndFrames + this.trimStartFrames, this.inputAudioFormat.sampleRate);
    }

    public long getTrimmedFrameCount() {
        return this.trimmedFrameCount;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.reconfigurationPending = true;
        return (this.trimStartFrames == 0 && this.trimEndFrames == 0) ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        if (this.reconfigurationPending) {
            this.reconfigurationPending = false;
            int i11 = this.trimEndFrames;
            int i12 = this.inputAudioFormat.bytesPerFrame;
            this.endBuffer = new byte[i11 * i12];
            this.pendingTrimStartBytes = this.trimStartFrames * i12;
        }
        this.endBufferSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.reconfigurationPending) {
            int i11 = this.endBufferSize;
            if (i11 > 0) {
                this.trimmedFrameCount += (long) (i11 / this.inputAudioFormat.bytesPerFrame);
            }
            this.endBufferSize = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.endBuffer = Util.EMPTY_BYTE_ARRAY;
    }

    public void resetTrimmedFrameCount() {
        this.trimmedFrameCount = 0L;
    }

    public void setTrimFrameCount(int i11, int i12) {
        this.trimStartFrames = i11;
        this.trimEndFrames = i12;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i11;
        if (super.isEnded() && (i11 = this.endBufferSize) > 0) {
            replaceOutputBuffer(i11).put(this.endBuffer, 0, this.endBufferSize).flip();
            this.endBufferSize = 0;
        }
        return super.getOutput();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.endBufferSize == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        if (i11 != 0) {
            int iMin = Math.min(i11, this.pendingTrimStartBytes);
            this.trimmedFrameCount += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
            this.pendingTrimStartBytes -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.pendingTrimStartBytes > 0) {
                return;
            }
            int i12 = i11 - iMin;
            int length = (this.endBufferSize + i12) - this.endBuffer.length;
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
            int iConstrainValue = Util.constrainValue(length, 0, this.endBufferSize);
            byteBufferReplaceOutputBuffer.put(this.endBuffer, 0, iConstrainValue);
            int iConstrainValue2 = Util.constrainValue(length - iConstrainValue, 0, i12);
            byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
            byteBufferReplaceOutputBuffer.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i13 = i12 - iConstrainValue2;
            int i14 = this.endBufferSize - iConstrainValue;
            this.endBufferSize = i14;
            byte[] bArr = this.endBuffer;
            System.arraycopy(bArr, iConstrainValue, bArr, 0, i14);
            byteBuffer.get(this.endBuffer, this.endBufferSize, i13);
            this.endBufferSize += i13;
            byteBufferReplaceOutputBuffer.flip();
        }
    }
}
