package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SinglePeriodTimeline extends Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;

    @Nullable
    private final MediaItem.LiveConfiguration liveConfiguration;

    @Nullable
    private final Object manifest;

    @Nullable
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final Object UID = new Object();
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    @Deprecated
    public SinglePeriodTimeline(long j11, boolean z11, boolean z12, boolean z13, @Nullable Object obj, @Nullable Object obj2) {
        this(j11, j11, 0L, 0L, z11, z12, z13, obj, obj2);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
        Assertions.checkIndex(i11, 0, 1);
        return period.set(null, z11 ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public Object getUidOfPeriod(int i11) {
        Assertions.checkIndex(i11, 0, 1);
        return UID;
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j11, boolean z11, boolean z12, boolean z13, @Nullable Object obj, MediaItem mediaItem) {
        this(j11, j11, 0L, 0L, z11, z12, z13, obj, mediaItem);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.Timeline
    public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
        long j12;
        Assertions.checkIndex(i11, 0, 1);
        long j13 = this.windowDefaultStartPositionUs;
        boolean z11 = this.isDynamic;
        if (!z11 || this.suppressPositionProjection || j11 == 0) {
            j12 = j13;
        } else {
            long j14 = this.windowDurationUs;
            if (j14 != C2711C.TIME_UNSET) {
                j13 += j11;
                if (j13 <= j14) {
                    j12 = j13;
                }
            }
            j12 = -9223372036854775807L;
        }
        return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, z11, this.liveConfiguration, j12, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Deprecated
    public SinglePeriodTimeline(long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, @Nullable Object obj, @Nullable Object obj2) {
        this(C2711C.TIME_UNSET, C2711C.TIME_UNSET, C2711C.TIME_UNSET, j11, j12, j13, j14, z11, z12, z13, obj, obj2);
    }

    public SinglePeriodTimeline(long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, @Nullable Object obj, MediaItem mediaItem) {
        this(C2711C.TIME_UNSET, C2711C.TIME_UNSET, C2711C.TIME_UNSET, j11, j12, j13, j14, z11, z12, false, obj, mediaItem, z13 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, boolean z13, @Nullable Object obj, @Nullable Object obj2) {
        MediaItem mediaItem = MEDIA_ITEM;
        this(j11, j12, j13, j14, j15, j16, j17, z11, z12, false, obj, mediaItem.buildUpon().setTag(obj2).build(), z13 ? mediaItem.liveConfiguration : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this(j11, j12, j13, j14, j15, j16, j17, z11, z12, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, boolean z13, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j11;
        this.windowStartTimeMs = j12;
        this.elapsedRealtimeEpochOffsetMs = j13;
        this.periodDurationUs = j14;
        this.windowDurationUs = j15;
        this.windowPositionInPeriodUs = j16;
        this.windowDefaultStartPositionUs = j17;
        this.isSeekable = z11;
        this.isDynamic = z12;
        this.suppressPositionProjection = z13;
        this.manifest = obj;
        this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }
}
