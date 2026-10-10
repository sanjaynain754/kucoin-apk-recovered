package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class AudioMixingUtil {
    private static final float FLOAT_PCM_MAX_VALUE = 1.0f;
    private static final float FLOAT_PCM_MIN_VALUE = -1.0f;

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        int i11 = audioFormat.encoding;
        return i11 == 2 || i11 == 4;
    }

    private static float floatSampleToInt16Pcm(float f11) {
        return Util.constrainValue(f11 * (f11 < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    private static float int16SampleToFloatPcm(short s11) {
        return s11 / (s11 < 0 ? 32768 : 32767);
    }

    private static float getPcmSample(ByteBuffer byteBuffer, boolean z11, boolean z12) {
        if (z12) {
            return z11 ? byteBuffer.getShort() : floatSampleToInt16Pcm(byteBuffer.getFloat());
        }
        return z11 ? int16SampleToFloatPcm(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    public static ByteBuffer mix(ByteBuffer byteBuffer, AudioProcessor.AudioFormat audioFormat, ByteBuffer byteBuffer2, AudioProcessor.AudioFormat audioFormat2, ChannelMixingMatrix channelMixingMatrix, int i11, boolean z11, boolean z12) {
        boolean z13 = audioFormat.encoding == 2;
        boolean z14 = audioFormat2.encoding == 2;
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i12 = 0; i12 < i11; i12++) {
            if (z11) {
                int iPosition = byteBuffer2.position();
                for (int i13 = 0; i13 < outputChannelCount; i13++) {
                    fArr2[i13] = getPcmSample(byteBuffer2, z14, z14);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i14 = 0; i14 < inputChannelCount; i14++) {
                fArr[i14] = getPcmSample(byteBuffer, z13, z14);
            }
            for (int i15 = 0; i15 < outputChannelCount; i15++) {
                for (int i16 = 0; i16 < inputChannelCount; i16++) {
                    fArr2[i15] = fArr2[i15] + (fArr[i16] * channelMixingMatrix.getMixingCoefficient(i16, i15));
                }
                if (z14) {
                    byteBuffer2.putShort((short) Util.constrainValue(fArr2[i15], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z12 ? Util.constrainValue(fArr2[i15], -1.0f, 1.0f) : fArr2[i15]);
                }
                fArr2[i15] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    private AudioMixingUtil() {
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat, AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }
}
