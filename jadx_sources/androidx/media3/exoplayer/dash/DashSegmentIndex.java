package androidx.media3.exoplayer.dash;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.dash.manifest.RangedUri;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getAvailableSegmentCount(long j11, long j12);

    long getDurationUs(long j11, long j12);

    long getFirstAvailableSegmentNum(long j11, long j12);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j11, long j12);

    long getSegmentCount(long j11);

    long getSegmentNum(long j11, long j12);

    RangedUri getSegmentUrl(long j11);

    long getTimeUs(long j11);

    boolean isExplicit();
}
