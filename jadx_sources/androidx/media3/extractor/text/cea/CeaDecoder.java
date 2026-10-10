package androidx.media3.extractor.text.cea;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes34.dex */
abstract class CeaDecoder implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<CeaInputBuffer> availableInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;

    @Nullable
    private CeaInputBuffer dequeuedInputBuffer;
    private long outputStartTimeUs;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final ArrayDeque<CeaInputBuffer> queuedInputBuffers;

    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
        }

        @Override // java.lang.Comparable
        public int compareTo(CeaInputBuffer ceaInputBuffer) {
            if (isEndOfStream() != ceaInputBuffer.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j11 = this.timeUs - ceaInputBuffer.timeUs;
            if (j11 == 0) {
                j11 = this.queuedInputBufferCount - ceaInputBuffer.queuedInputBufferCount;
                if (j11 == 0) {
                    return 0;
                }
            }
            return j11 > 0 ? 1 : -1;
        }
    }

    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        private DecoderOutputBuffer.Owner<CeaOutputBuffer> owner;

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        public final void release() {
            this.owner.releaseOutputBuffer(this);
        }

        public CeaOutputBuffer(DecoderOutputBuffer.Owner<CeaOutputBuffer> owner) {
            this.owner = owner;
        }
    }

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer subtitleInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    public abstract String getName();

    public abstract boolean isNewSubtitleDataAvailable();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBufferPollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = ceaInputBufferPollFirst;
        return ceaInputBufferPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((CeaInputBuffer) Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) Util.castNonNull(this.queuedInputBuffers.poll());
            if (ceaInputBuffer.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer;
            }
            decode(ceaInputBuffer);
            if (isNewSubtitleDataAvailable()) {
                Subtitle subtitleCreateSubtitle = createSubtitle();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(ceaInputBuffer.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer2;
            }
            releaseInputBuffer(ceaInputBuffer);
        }
        return null;
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBuffer((CeaInputBuffer) Util.castNonNull(this.queuedInputBuffers.poll()));
        }
        CeaInputBuffer ceaInputBuffer = this.dequeuedInputBuffer;
        if (ceaInputBuffer != null) {
            releaseInputBuffer(ceaInputBuffer);
            this.dequeuedInputBuffer = null;
        }
    }

    @Nullable
    public final SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    public final long getPositionUs() {
        return this.playbackPositionUs;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // androidx.media3.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer;
        long j11 = ceaInputBuffer.timeUs;
        if (j11 != Long.MIN_VALUE) {
            long j12 = this.outputStartTimeUs;
            if (j12 == C2711C.TIME_UNSET || j11 >= j12) {
                long j13 = this.queuedInputBufferCount;
                this.queuedInputBufferCount = 1 + j13;
                ceaInputBuffer.queuedInputBufferCount = j13;
                this.queuedInputBuffers.add(ceaInputBuffer);
            } else {
                releaseInputBuffer(ceaInputBuffer);
            }
        } else {
            long j14 = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j14;
            ceaInputBuffer.queuedInputBufferCount = j14;
            this.queuedInputBuffers.add(ceaInputBuffer);
        }
        this.dequeuedInputBuffer = null;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j11) {
        this.outputStartTimeUs = j11;
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j11) {
        this.playbackPositionUs = j11;
    }

    public CeaDecoder() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.availableInputBuffers.add(new CeaInputBuffer());
        }
        this.availableOutputBuffers = new ArrayDeque<>();
        for (int i12 = 0; i12 < 2; i12++) {
            this.availableOutputBuffers.add(new CeaOutputBuffer(new DecoderOutputBuffer.Owner() { // from class: androidx.media3.extractor.text.cea.b
                @Override // androidx.media3.decoder.DecoderOutputBuffer.Owner
                public final void releaseOutputBuffer(DecoderOutputBuffer decoderOutputBuffer) {
                    this.f3531a.releaseOutputBuffer((CeaDecoder.CeaOutputBuffer) decoderOutputBuffer);
                }
            }));
        }
        this.queuedInputBuffers = new ArrayDeque<>();
        this.outputStartTimeUs = C2711C.TIME_UNSET;
    }

    private void releaseInputBuffer(CeaInputBuffer ceaInputBuffer) {
        ceaInputBuffer.clear();
        this.availableInputBuffers.add(ceaInputBuffer);
    }

    public void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
    }
}
