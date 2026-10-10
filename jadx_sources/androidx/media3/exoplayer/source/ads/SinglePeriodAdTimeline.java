package androidx.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C2711C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ForwardingTimeline;

/* JADX INFO: loaded from: classes34.dex */
@VisibleForTesting(otherwise = 3)
@UnstableApi
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
        this.timeline.getPeriod(i11, period, z11);
        long j11 = period.durationUs;
        if (j11 == C2711C.TIME_UNSET) {
            j11 = this.adPlaybackState.contentDurationUs;
        }
        period.set(period.f2792id, period.uid, period.windowIndex, j11, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        boolean z11;
        super(timeline);
        if (timeline.getPeriodCount() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }
}
