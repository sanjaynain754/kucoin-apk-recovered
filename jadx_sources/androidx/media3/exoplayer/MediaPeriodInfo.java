package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes34.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* JADX INFO: renamed from: id */
    public final MediaSource.MediaPeriodId f2934id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Util.areEqual(this.f2934id, mediaPeriodInfo.f2934id)) {
                return true;
            }
        }
        return false;
    }

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        Assertions.checkArgument(!z14 || z12);
        Assertions.checkArgument(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        Assertions.checkArgument(z15);
        this.f2934id = mediaPeriodId;
        this.startPositionUs = j11;
        this.requestedContentPositionUs = j12;
        this.endPositionUs = j13;
        this.durationUs = j14;
        this.isFollowedByTransitionToSameStream = z11;
        this.isLastInTimelinePeriod = z12;
        this.isLastInTimelineWindow = z13;
        this.isFinal = z14;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j11) {
        return j11 == this.requestedContentPositionUs ? this : new MediaPeriodInfo(this.f2934id, this.startPositionUs, j11, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j11) {
        return j11 == this.startPositionUs ? this : new MediaPeriodInfo(this.f2934id, j11, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f2934id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
