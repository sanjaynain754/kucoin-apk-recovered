package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i11 = audioFormat.encoding;
        if (i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4) {
            return i11 != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.inputAudioFormat.encoding;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 21) {
                    if (i12 != 22) {
                        if (i12 != 268435456) {
                            if (i12 != 1342177280) {
                                if (i12 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                                i11 /= 2;
                            }
                        }
                    } else {
                        i11 /= 2;
                    }
                }
                i11 /= 3;
                i11 *= 2;
            } else {
                i11 /= 2;
            }
        } else {
            i11 *= 2;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i11);
        int i13 = this.inputAudioFormat.encoding;
        if (i13 != 3) {
            if (i13 != 4) {
                if (i13 != 21) {
                    if (i13 != 22) {
                        if (i13 != 268435456) {
                            if (i13 != 1342177280) {
                                if (i13 == 1610612736) {
                                    while (iPosition < iLimit) {
                                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                        iPosition += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (iPosition < iLimit) {
                                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                    iPosition += 3;
                                }
                            }
                        } else {
                            while (iPosition < iLimit) {
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                iPosition += 2;
                            }
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                            iPosition += 4;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    short sConstrainValue = (short) (Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                    byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                    byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
