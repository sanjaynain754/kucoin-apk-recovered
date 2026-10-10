package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
final class ToFloatPcmAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i11 = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i11)) {
            return i11 != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferReplaceOutputBuffer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.inputAudioFormat.encoding;
        if (i12 != 21) {
            if (i12 != 22) {
                if (i12 != 1342177280) {
                    if (i12 == 1610612736) {
                        byteBufferReplaceOutputBuffer = replaceOutputBuffer(i11);
                        while (iPosition < iLimit) {
                            writePcm32BitFloat((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferReplaceOutputBuffer);
                            iPosition += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    byteBufferReplaceOutputBuffer = replaceOutputBuffer((i11 / 3) * 4);
                    while (iPosition < iLimit) {
                        writePcm32BitFloat(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferReplaceOutputBuffer);
                        iPosition += 3;
                    }
                }
            } else {
                byteBufferReplaceOutputBuffer = replaceOutputBuffer(i11);
                while (iPosition < iLimit) {
                    writePcm32BitFloat((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferReplaceOutputBuffer);
                    iPosition += 4;
                }
            }
        } else {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i11 / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }

    private static void writePcm32BitFloat(int i11, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i11) * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (iFloatToIntBits == FLOAT_NAN_AS_INT) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
