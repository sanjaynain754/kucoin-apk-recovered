package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.C2711C;
import androidx.media3.exoplayer.dash.DashSegmentIndex;

/* JADX INFO: loaded from: classes34.dex */
final class SingleSegmentIndex implements DashSegmentIndex {
    private final RangedUri uri;

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j11, long j12) {
        return 1L;
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
        return 1L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j11, long j12) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j11) {
        return this.uri;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j11) {
        return 0L;
    }

    public SingleSegmentIndex(RangedUri rangedUri) {
        this.uri = rangedUri;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j11, long j12) {
        return C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j11, long j12) {
        return j12;
    }
}
