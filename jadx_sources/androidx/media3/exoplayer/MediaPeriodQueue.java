package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper analyticsCollectorHandler;
    private int length;

    @Nullable
    private MediaPeriodHolder loading;
    private final MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;

    @Nullable
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;

    @Nullable
    private MediaPeriodHolder playing;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;

    @Nullable
    private MediaPeriodHolder preloading;

    @Nullable
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();
    private List<MediaPeriodHolder> preloadPriorityList = new ArrayList();

    private void releaseAndResetPreloadPriorityList(List<MediaPeriodHolder> list) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            this.preloadPriorityList.get(i11).release();
        }
        this.preloadPriorityList = list;
        this.preloading = null;
        maybeUpdatePreloadMediaPeriodHolder();
    }

    @Nullable
    private MediaPeriodHolder removePreloadedMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            if (this.preloadPriorityList.get(i11).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i11);
            }
        }
        return null;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i11);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.f2934id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    @Nullable
    public MediaPeriodHolder getPreloadHolderByMediaPeriod(MediaPeriod mediaPeriod) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i11);
            if (mediaPeriodHolder.mediaPeriod == mediaPeriod) {
                return mediaPeriodHolder;
            }
        }
        return null;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j11) {
        return resolveMediaPeriodIdForAds(timeline, obj, j11, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.f2934id.equals(mediaPeriodInfo2.f2934id);
    }

    @Nullable
    private Pair<Object, Long> getDefaultPeriodPositionOfNextWindow(Timeline timeline, Object obj, long j11) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, C2711C.TIME_UNSET, j11);
        }
        return null;
    }

    @Nullable
    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    @Nullable
    private MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j11) {
        Object obj;
        long j12;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.f2934id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i11 = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        Object objCheckNotNull = Assertions.checkNotNull(this.period.uid);
        long j13 = mediaPeriodInfo.f2934id.windowSequenceNumber;
        long j14 = 0;
        if (timeline.getWindow(i11, this.window).firstPeriodIndex == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i11, C2711C.TIME_UNSET, Math.max(0L, j11));
            if (periodPositionUs == null) {
                return null;
            }
            Object obj2 = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next == null || !next.uid.equals(obj2)) {
                long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj2);
                if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
                j13 = jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            } else {
                j13 = next.info.f2934id.windowSequenceNumber;
            }
            obj = obj2;
            j12 = jLongValue;
            j14 = -9223372036854775807L;
        } else {
            obj = objCheckNotNull;
            j12 = 0;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j12, j13, this.window, this.period);
        if (j14 != C2711C.TIME_UNSET && mediaPeriodInfo.requestedContentPositionUs != C2711C.TIME_UNSET) {
            boolean zHasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.f2934id.periodUid, timeline);
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd() && zHasServerSideInsertedAds) {
                j14 = mediaPeriodInfo.requestedContentPositionUs;
            } else if (zHasServerSideInsertedAds) {
                j12 = mediaPeriodInfo.requestedContentPositionUs;
            }
        }
        return getMediaPeriodInfo(timeline, mediaPeriodIdResolveMediaPeriodIdForAds, j14, j12);
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j11) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j11;
        return mediaPeriodInfo.isLastInTimelinePeriod ? getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, mediaPeriodHolder, rendererOffset);
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j11) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f2934id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            int i11 = mediaPeriodId.nextAdGroupIndex;
            if (i11 != -1 && this.period.isLivePostrollPlaceholder(i11)) {
                return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, j11);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
            boolean z11 = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z11) {
                return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        int i12 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i12);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i12, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i12, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long jLongValue = mediaPeriodInfo.requestedContentPositionUs;
        if (jLongValue == C2711C.TIME_UNSET) {
            Timeline.Window window = this.window;
            Timeline.Period period = this.period;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, C2711C.TIME_UNSET, Math.max(0L, j11));
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return mediaPeriodId.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j11, mediaPeriodId.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j12, j11, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i11, int i12, long j11, long j12) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i11, i12, j12);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i12 == this.period.getFirstAdIndexToPlay(i11) ? this.period.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        if (adDurationUs != C2711C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, adResumePositionUs, j11, C2711C.TIME_UNSET, adDurationUs, zIsServerSideInsertedAdGroup, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    private MediaPeriodInfo getMediaPeriodInfoForContent(Timeline timeline, Object obj, long j11, long j12, long j13) {
        boolean z11;
        long j14;
        long adGroupTimeUs;
        long j15;
        long jMax = j11;
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(jMax);
        boolean z12 = adGroupIndexAfterPositionUs != -1 && this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.period.getAdGroupCount() > 0) {
                Timeline.Period period = this.period;
                if (period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else if (this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs)) {
            long adGroupTimeUs2 = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
            Timeline.Period period2 = this.period;
            if (adGroupTimeUs2 == period2.durationUs && period2.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                z11 = true;
                adGroupIndexAfterPositionUs = -1;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j13, adGroupIndexAfterPositionUs);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        boolean z13 = (adGroupIndexAfterPositionUs == -1 || !this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) || z12) ? false : true;
        if (adGroupIndexAfterPositionUs == -1 || z12) {
            if (z11) {
                adGroupTimeUs = this.period.durationUs;
            } else {
                j14 = -9223372036854775807L;
            }
            if (j14 != C2711C.TIME_UNSET || j14 == Long.MIN_VALUE) {
                j15 = this.period.durationUs;
            } else {
                j15 = j14;
            }
            if (j15 != C2711C.TIME_UNSET && jMax >= j15) {
                jMax = Math.max(0L, j15 - ((long) ((zIsLastInTimeline && z11) ? 0 : 1)));
            }
            return new MediaPeriodInfo(mediaPeriodId, jMax, j12, j14, j15, z13, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
        }
        adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        j14 = adGroupTimeUs;
        if (j14 != C2711C.TIME_UNSET) {
            j15 = this.period.durationUs;
        } else {
            j15 = this.period.durationUs;
        }
        if (j15 != C2711C.TIME_UNSET) {
            jMax = Math.max(0L, j15 - ((long) ((zIsLastInTimeline && z11) ? 0 : 1)));
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j12, j14, j15, z13, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(Timeline timeline, Object obj, long j11, long j12) {
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j11, j12, this.window, this.period);
        return mediaPeriodIdResolveMediaPeriodIdForAds.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, mediaPeriodIdResolveMediaPeriodIdForAds.adGroupIndex, mediaPeriodIdResolveMediaPeriodIdForAds.adIndexInAdGroup, j11, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, j11, C2711C.TIME_UNSET, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object obj, int i11) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i11);
        return adGroupTimeUs == Long.MIN_VALUE ? this.period.durationUs : adGroupTimeUs + this.period.getContentResumeOffsetUs(i11);
    }

    private boolean hasServerSideInsertedAds(Object obj, Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        if (adGroupCount <= 0 || !this.period.isServerSideInsertedAdGroup(removedAdGroupCount)) {
            return false;
        }
        return adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE;
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z11) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z11;
    }

    private long resolvePeriodUidToWindowSequenceNumber(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i11 = timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i11) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            if (next.uid.equals(obj)) {
                return next.info.f2934id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder next2 = this.playing; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(next2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i11) {
                return next2.info.f2934id.windowSequenceNumber;
            }
        }
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j11 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j11;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j11;
        }
        return j11;
    }

    private boolean updateForPlaybackModeChange(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder next = this.playing;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(next.uid);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (((MediaPeriodHolder) Assertions.checkNotNull(next)).getNext() != null && !next.info.isLastInTimelinePeriod) {
                next = next.getNext();
            }
            MediaPeriodHolder next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || timeline2.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
            timeline = timeline2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.info = getUpdatedMediaPeriodInfo(timeline2, next.info);
        return !zRemoveAfter;
    }

    @Nullable
    public MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        this.playing.release();
        int i11 = this.length - 1;
        this.length = i11;
        if (i11 == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.info.f2934id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        this.reading = ((MediaPeriodHolder) Assertions.checkStateNotNull(this.reading)).getNext();
        notifyQueueUpdate();
        return (MediaPeriodHolder) Assertions.checkStateNotNull(this.reading);
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder next = (MediaPeriodHolder) Assertions.checkStateNotNull(this.playing);
        this.oldFrontPeriodUid = next.uid;
        this.oldFrontPeriodWindowSequenceNumber = next.info.f2934id.windowSequenceNumber;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? INITIAL_RENDERER_POSITION_OFFSET_US : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs;
        MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        } else {
            this.playing = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
            this.reading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
    }

    @Nullable
    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    @Nullable
    public MediaPeriodInfo getNextMediaPeriodInfo(long j11, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder, j11);
    }

    @Nullable
    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    @Nullable
    public MediaPeriodHolder getPreloadingPeriod() {
        return this.preloading;
    }

    @Nullable
    public MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    public MediaPeriodInfo getUpdatedMediaPeriodInfo(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        long durationUs;
        long j11;
        int i11;
        boolean zIsServerSideInsertedAdGroup;
        int i12;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f2934id;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        timeline.getPeriodByUid(mediaPeriodInfo.f2934id.periodUid, this.period);
        long adGroupTimeUs = (mediaPeriodId.isAd() || (i12 = mediaPeriodId.nextAdGroupIndex) == -1) ? -9223372036854775807L : this.period.getAdGroupTimeUs(i12);
        if (!mediaPeriodId.isAd()) {
            if (adGroupTimeUs == C2711C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) {
                durationUs = this.period.getDurationUs();
            } else {
                j11 = adGroupTimeUs;
            }
            if (mediaPeriodId.isAd()) {
                zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
            } else {
                i11 = mediaPeriodId.nextAdGroupIndex;
                if (i11 == -1 && this.period.isServerSideInsertedAdGroup(i11)) {
                    zIsServerSideInsertedAdGroup = true;
                } else {
                    zIsServerSideInsertedAdGroup = false;
                }
            }
            return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j11, zIsServerSideInsertedAdGroup, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
        }
        durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        j11 = durationUs;
        if (mediaPeriodId.isAd()) {
            zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        } else {
            i11 = mediaPeriodId.nextAdGroupIndex;
            if (i11 == -1) {
                zIsServerSideInsertedAdGroup = false;
            } else {
                zIsServerSideInsertedAdGroup = false;
            }
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j11, zIsServerSideInsertedAdGroup, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    public void invalidatePreloadPool(Timeline timeline) {
        MediaPeriodHolder mediaPeriodHolder;
        if (this.preloadConfiguration.targetPreloadDurationUs == C2711C.TIME_UNSET || (mediaPeriodHolder = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(timeline, mediaPeriodHolder.info.f2934id.periodUid, 0L);
        if (defaultPeriodPositionOfNextWindow != null && !timeline.getWindow(timeline.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).windowIndex, this.window).isLive()) {
            long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            MediaPeriodInfo mediaPeriodInfoForPeriodPosition = getMediaPeriodInfoForPeriodPosition(timeline, defaultPeriodPositionOfNextWindow.first, ((Long) defaultPeriodPositionOfNextWindow.second).longValue(), jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
                mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        }
        releaseAndResetPreloadPriorityList(arrayList);
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public boolean isPreloading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void maybeUpdatePreloadMediaPeriodHolder() {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        if (mediaPeriodHolder == null || mediaPeriodHolder.isFullyPreloaded()) {
            this.preloading = null;
            for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
                MediaPeriodHolder mediaPeriodHolder2 = this.preloadPriorityList.get(i11);
                if (!mediaPeriodHolder2.isFullyPreloaded()) {
                    this.preloading = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public void reevaluateBuffer(long j11) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j11);
        }
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new ArrayList());
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != C2711C.TIME_UNSET && this.length < 100;
        }
        return true;
    }

    public void updatePreloadConfiguration(Timeline timeline, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    public boolean updateQueuedPeriods(Timeline timeline, long j11, long j12) {
        MediaPeriodInfo updatedMediaPeriodInfo;
        MediaPeriodHolder next = this.playing;
        MediaPeriodHolder mediaPeriodHolder = null;
        while (next != null) {
            MediaPeriodInfo mediaPeriodInfo = next.info;
            if (mediaPeriodHolder == null) {
                updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo);
            } else {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder, j11);
                if (followingMediaPeriodInfo == null) {
                    return !removeAfter(mediaPeriodHolder);
                }
                if (!canKeepMediaPeriodHolder(mediaPeriodInfo, followingMediaPeriodInfo)) {
                    return !removeAfter(mediaPeriodHolder);
                }
                updatedMediaPeriodInfo = followingMediaPeriodInfo;
            }
            next.info = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(mediaPeriodInfo.requestedContentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo.durationUs, updatedMediaPeriodInfo.durationUs)) {
                next.updateClipping();
                long j13 = updatedMediaPeriodInfo.durationUs;
                return (removeAfter(next) || (next == this.reading && !next.info.isFollowedByTransitionToSameStream && ((j12 > Long.MIN_VALUE ? 1 : (j12 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j12 > ((j13 > C2711C.TIME_UNSET ? 1 : (j13 == C2711C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j13)) ? 1 : (j12 == ((j13 > C2711C.TIME_UNSET ? 1 : (j13 == C2711C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j13)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(Timeline timeline, int i11) {
        this.repeatMode = i11;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean updateShuffleModeEnabled(Timeline timeline, boolean z11) {
        this.shuffleModeEnabled = z11;
        return updateForPlaybackModeChange(timeline);
    }

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, MediaPeriodHolder.Factory factory, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1) {
            return true;
        }
        return false;
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!isLastInPeriod(mediaPeriodId)) {
            return false;
        }
        int i11 = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex;
        if (timeline.getWindow(i11, this.window).lastPeriodIndex != timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
            return false;
        }
        return true;
    }

    private static boolean isSkippableAdPeriod(Timeline.Period period) {
        int i11;
        int adGroupCount = period.getAdGroupCount();
        if (adGroupCount != 0 && ((adGroupCount != 1 || !period.isLivePostrollPlaceholder(0)) && period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount()))) {
            long contentResumeOffsetUs = 0;
            if (period.getAdGroupIndexForPositionUs(0L) == -1) {
                if (period.durationUs == 0) {
                    return true;
                }
                if (period.isLivePostrollPlaceholder(adGroupCount - 1)) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                int i12 = adGroupCount - i11;
                for (int i13 = 0; i13 <= i12; i13++) {
                    contentResumeOffsetUs += period.getContentResumeOffsetUs(i13);
                }
                if (period.durationUs <= contentResumeOffsetUs) {
                    return true;
                }
            }
        }
        return false;
    }

    private void notifyQueueUpdate() {
        final MediaSource.MediaPeriodId mediaPeriodId;
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            builder.add(next.info.f2934id);
        }
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        if (mediaPeriodHolder == null) {
            mediaPeriodId = null;
        } else {
            mediaPeriodId = mediaPeriodHolder.info.f2934id;
        }
        this.analyticsCollectorHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.u2
            @Override // java.lang.Runnable
            public final void run() {
                this.f3429b.analyticsCollector.updateMediaPeriodQueueInfo(builder.build(), mediaPeriodId);
            }
        });
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j11, long j12, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            obj = Assertions.checkNotNull(period.uid);
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j11);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(obj, j12, period.getAdGroupIndexAfterPositionUs(j11));
        }
        return new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j12);
    }

    public boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        Assertions.checkStateNotNull(mediaPeriodHolder);
        boolean z11 = false;
        if (mediaPeriodHolder.equals(this.loading)) {
            return false;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(mediaPeriodHolder.getNext());
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z11 = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        ((MediaPeriodHolder) Assertions.checkNotNull(this.loading)).setNext(null);
        notifyQueueUpdate();
        return z11;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Timeline timeline, Object obj, long j11) {
        long jResolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z11 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            boolean z12 = true;
            timeline.getPeriod(indexOfPeriod, this.period, true);
            if (this.period.getAdGroupCount() <= 0) {
                z12 = false;
            }
            z11 |= z12;
            Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = Assertions.checkNotNull(this.period.uid);
            }
            if (z11 && (!z12 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j11, jResolvePeriodUidToWindowSequenceNumber, this.window, this.period);
    }

    public static boolean areDurationsCompatible(long j11, long j12) {
        if (j11 != C2711C.TIME_UNSET && j11 != j12) {
            return false;
        }
        return true;
    }
}
