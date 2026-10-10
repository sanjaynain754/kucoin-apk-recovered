package androidx.media3.exoplayer.dash;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private final Format upstreamFormat;
    private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
    private long pendingSeekPositionUs = C2711C.TIME_UNSET;

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    public String eventStreamId() {
        return this.eventStream.m3273id();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        int i12 = this.currentIndex;
        boolean z11 = i12 == this.eventTimesUs.length;
        if (z11 && !this.eventStreamAppendable) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        if ((i11 & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        if (z11) {
            return -3;
        }
        if ((i11 & 1) == 0) {
            this.currentIndex = i12 + 1;
        }
        if ((i11 & 4) == 0) {
            byte[] bArrEncode = this.eventMessageEncoder.encode(this.eventStream.events[i12]);
            decoderInputBuffer.ensureSpaceForWrite(bArrEncode.length);
            decoderInputBuffer.data.put(bArrEncode);
        }
        decoderInputBuffer.timeUs = this.eventTimesUs[i12];
        decoderInputBuffer.setFlags(1);
        return -4;
    }

    public void seekToUs(long j11) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j11, true, false);
        this.currentIndex = iBinarySearchCeil;
        if (!this.eventStreamAppendable || iBinarySearchCeil != this.eventTimesUs.length) {
            j11 = C2711C.TIME_UNSET;
        }
        this.pendingSeekPositionUs = j11;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j11) {
        int iMax = Math.max(this.currentIndex, Util.binarySearchCeil(this.eventTimesUs, j11, true, false));
        int i11 = iMax - this.currentIndex;
        this.currentIndex = iMax;
        return i11;
    }

    public void updateEventStream(EventStream eventStream, boolean z11) {
        int i11 = this.currentIndex;
        long j11 = i11 == 0 ? -9223372036854775807L : this.eventTimesUs[i11 - 1];
        this.eventStreamAppendable = z11;
        this.eventStream = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j12 = this.pendingSeekPositionUs;
        if (j12 != C2711C.TIME_UNSET) {
            seekToUs(j12);
        } else if (j11 != C2711C.TIME_UNSET) {
            this.currentIndex = Util.binarySearchCeil(jArr, j11, false, false);
        }
    }

    public EventSampleStream(EventStream eventStream, Format format, boolean z11) {
        this.upstreamFormat = format;
        this.eventStream = eventStream;
        this.eventTimesUs = eventStream.presentationTimesUs;
        updateEventStream(eventStream, z11);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws IOException {
    }
}
