package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class HlsSampleStream implements SampleStream {
    private int sampleQueueIndex = -1;
    private final HlsSampleStreamWrapper sampleStreamWrapper;
    private final int trackGroupIndex;

    private boolean hasValidSampleQueueIndex() {
        int i11 = this.sampleQueueIndex;
        return (i11 == -1 || i11 == -3 || i11 == -2) ? false : true;
    }

    public void bindSampleQueue() {
        Assertions.checkArgument(this.sampleQueueIndex == -1);
        this.sampleQueueIndex = this.sampleStreamWrapper.bindSampleQueueToSampleStream(this.trackGroupIndex);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        if (this.sampleQueueIndex != -3) {
            return hasValidSampleQueueIndex() && this.sampleStreamWrapper.isReady(this.sampleQueueIndex);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws IOException {
        int i11 = this.sampleQueueIndex;
        if (i11 == -2) {
            throw new SampleQueueMappingException(this.sampleStreamWrapper.getTrackGroups().get(this.trackGroupIndex).getFormat(0).sampleMimeType);
        }
        if (i11 == -1) {
            this.sampleStreamWrapper.maybeThrowError();
        } else if (i11 != -3) {
            this.sampleStreamWrapper.maybeThrowError(i11);
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (this.sampleQueueIndex == -3) {
            decoderInputBuffer.addFlag(4);
            return -4;
        }
        if (hasValidSampleQueueIndex()) {
            return this.sampleStreamWrapper.readData(this.sampleQueueIndex, formatHolder, decoderInputBuffer, i11);
        }
        return -3;
    }

    public void unbindSampleQueue() {
        if (this.sampleQueueIndex != -1) {
            this.sampleStreamWrapper.unbindSampleQueue(this.trackGroupIndex);
            this.sampleQueueIndex = -1;
        }
    }

    public HlsSampleStream(HlsSampleStreamWrapper hlsSampleStreamWrapper, int i11) {
        this.sampleStreamWrapper = hlsSampleStreamWrapper;
        this.trackGroupIndex = i11;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j11) {
        if (hasValidSampleQueueIndex()) {
            return this.sampleStreamWrapper.skipData(this.sampleQueueIndex, j11);
        }
        return 0;
    }
}
