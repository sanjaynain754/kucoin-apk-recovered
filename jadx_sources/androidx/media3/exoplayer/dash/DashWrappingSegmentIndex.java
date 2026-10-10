package androidx.media3.exoplayer.dash;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.extractor.ChunkIndex;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j11, long j12) {
        return this.chunkIndex.length;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j11, long j12) {
        return this.chunkIndex.durationsUs[(int) j11];
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j11, long j12) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j11) {
        return this.chunkIndex.length;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j11, long j12) {
        return this.chunkIndex.getChunkIndex(j11 + this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j11) {
        ChunkIndex chunkIndex = this.chunkIndex;
        int i11 = (int) j11;
        return new RangedUri(null, chunkIndex.offsets[i11], chunkIndex.sizes[i11]);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j11) {
        return this.chunkIndex.timesUs[(int) j11] - this.timeOffsetUs;
    }

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j11) {
        this.chunkIndex = chunkIndex;
        this.timeOffsetUs = j11;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j11, long j12) {
        return C2711C.TIME_UNSET;
    }
}
