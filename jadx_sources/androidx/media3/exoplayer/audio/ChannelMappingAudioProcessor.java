package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
final class ChannelMappingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    @Nullable
    private int[] outputChannels;

    @Nullable
    private int[] pendingOutputChannels;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z11 = audioFormat.channelCount != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= audioFormat.channelCount) {
                throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
            }
            z11 |= i12 != i11;
            i11++;
        }
        return z11 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, 2) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) Assertions.checkNotNull(this.outputChannels);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (iPosition < iLimit) {
            for (int i11 : iArr) {
                byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort((i11 * 2) + iPosition));
            }
            iPosition += this.inputAudioFormat.bytesPerFrame;
        }
        byteBuffer.position(iLimit);
        byteBufferReplaceOutputBuffer.flip();
    }

    public void setChannelMap(@Nullable int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
