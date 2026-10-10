package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class AudioProcessingPipeline {
    private final ImmutableList<AudioProcessor> audioProcessors;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final List<AudioProcessor> activeAudioProcessors = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];

    private void processData(ByteBuffer byteBuffer) {
        boolean z11;
        for (boolean z12 = true; z12; z12 = z11) {
            z11 = false;
            for (int i11 = 0; i11 <= getFinalOutputBufferIndex(); i11++) {
                if (!this.outputBuffers[i11].hasRemaining()) {
                    AudioProcessor audioProcessor = this.activeAudioProcessors.get(i11);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i11 > 0 ? this.outputBuffers[i11 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.EMPTY_BUFFER;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i11] = audioProcessor.getOutput();
                        z11 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i11].hasRemaining();
                    } else if (!this.outputBuffers[i11].hasRemaining() && i11 < getFinalOutputBufferIndex()) {
                        this.activeAudioProcessors.get(i11 + 1).queueEndOfStream();
                    }
                }
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.audioProcessors.size(); i11++) {
            if (this.audioProcessors.get(i11) != audioProcessingPipeline.audioProcessors.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public void reset() {
        for (int i11 = 0; i11 < this.audioProcessors.size(); i11++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i11);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.outputBuffers = new ByteBuffer[0];
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }

    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i11 = 0; i11 < this.audioProcessors.size(); i11++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i11);
            AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                Assertions.checkState(!audioFormatConfigure.equals(AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = audioFormatConfigure;
            }
        }
        this.pendingOutputAudioFormat = audioFormat;
        return audioFormat;
    }

    public void flush() {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i11 = 0; i11 < this.audioProcessors.size(); i11++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i11);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new ByteBuffer[this.activeAudioProcessors.size()];
        for (int i12 = 0; i12 <= getFinalOutputBufferIndex(); i12++) {
            this.outputBuffers[i12] = this.activeAudioProcessors.get(i12).getOutput();
        }
    }

    public AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public int hashCode() {
        return this.audioProcessors.hashCode();
    }

    public boolean isEnded() {
        return this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public AudioProcessingPipeline(ImmutableList<AudioProcessor> immutableList) {
        this.audioProcessors = immutableList;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return AudioProcessor.EMPTY_BUFFER;
        }
        ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        processData(AudioProcessor.EMPTY_BUFFER);
        return this.outputBuffers[getFinalOutputBufferIndex()];
    }

    public void queueEndOfStream() {
        if (isOperational() && !this.inputEnded) {
            this.inputEnded = true;
            this.activeAudioProcessors.get(0).queueEndOfStream();
        }
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (isOperational() && !this.inputEnded) {
            processData(byteBuffer);
        }
    }
}
