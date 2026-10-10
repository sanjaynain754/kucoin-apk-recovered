package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    public static final class MediaPeriodQueueTracker {

        @Nullable
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue = ImmutableList.m13439of();
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines = ImmutableMap.m13458of();
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        private void addTimelineForMediaPeriodId(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                builder.put(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.put(mediaPeriodId, timeline2);
            }
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object obj, boolean z11, int i11, int i12, int i13) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z11 && mediaPeriodId.adGroupIndex == i11 && mediaPeriodId.adIndexInAdGroup == i12) {
                return true;
            }
            return !z11 && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i13;
        }

        @Nullable
        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) Iterables.getLast(this.mediaPeriodQueue);
        }

        @Nullable
        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        @Nullable
        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
        }

        @Nullable
        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Object uidOfPeriod;
            int adGroupIndexAfterPositionUs;
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            if (currentTimeline.isEmpty()) {
                uidOfPeriod = null;
            } else {
                uidOfPeriod = currentTimeline.getUidOfPeriod(currentPeriodIndex);
            }
            if (!player.isPlayingAd() && !currentTimeline.isEmpty()) {
                adGroupIndexAfterPositionUs = currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            } else {
                adGroupIndexAfterPositionUs = -1;
            }
            int i11 = adGroupIndexAfterPositionUs;
            for (int i12 = 0; i12 < immutableList.size(); i12++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i12);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), i11)) {
                    return mediaPeriodId2;
                }
            }
            if (!immutableList.isEmpty() || mediaPeriodId == null || !isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), i11)) {
                return null;
            }
            return mediaPeriodId;
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder = ImmutableMap.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(builder, this.playingMediaPeriod, timeline);
                if (!Objects.equal(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equal(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equal(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i11 = 0; i11 < this.mediaPeriodQueue.size(); i11++) {
                    addTimelineForMediaPeriodId(builder, this.mediaPeriodQueue.get(i11), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = builder.buildOrThrow();
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean z11 = timeline.equals(this.player.getCurrentTimeline()) && i11 == this.player.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z11) {
                defaultPositionMs = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                defaultPositionMs = timeline.getWindow(i11, this.window).getDefaultPositionMs();
            }
        } else if (z11 && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            defaultPositionMs = this.player.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i11, mediaPeriodId2, defaultPositionMs, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(final List<Cue> list) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.f0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, (List<Cue>) list);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i11) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onRenderedFirstFrame() {
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(Timeline.EMPTY, i11, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i11 >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i11, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(@Nullable PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.z0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekStarted(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i11) {
        if (i11 == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.b1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m3119O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i11, positionInfo, positionInfo2, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final Object obj, final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.g1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame(eventTimeGenerateReadingMediaPeriodEventTime, obj, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, final int i11) {
        this.mediaPeriodQueueTracker.onTimelineChanged((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void release() {
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.analytics.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f2976b.releaseInternal();
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i11, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i11, eventTime);
        this.listeners.sendEvent(i11, event);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void setPlayer(final Player player, Looper looper) {
        Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (Player) Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.analytics.q
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.f3052a.eventTimes));
            }
        });
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z11) {
        this.listeners.setThrowsWhenUsingWrongThread(z11);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (Player) Assertions.checkNotNull(this.player));
    }

    public DefaultAnalyticsCollector(Clock clock) {
        this.clock = (Clock) Assertions.checkNotNull(clock);
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.analytics.g0
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                DefaultAnalyticsCollector.m3160o0((AnalyticsListener) obj, flagSet);
            }
        });
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m3110F(AnalyticsListener.EventTime eventTime, boolean z11, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z11);
        analyticsListener.onIsLoadingChanged(eventTime, z11);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m3119O(AnalyticsListener.EventTime eventTime, int i11, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i11);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3137d(AnalyticsListener.EventTime eventTime, int i11, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i11);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3141f(AnalyticsListener.EventTime eventTime, String str, long j11, long j12, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j11);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j12, j11);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3159o(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, 0, videoSize.pixelWidthHeightRatio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1028, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.b
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
        this.listeners.release();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m3175y(AnalyticsListener.EventTime eventTime, String str, long j11, long j12, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j11);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j12, j11);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void addListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(final AudioAttributes audioAttributes) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.s
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioAttributesChanged(eventTimeGenerateReadingMediaPeriodEventTime, audioAttributes);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1029, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioCodecError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(final String str, final long j11, final long j12) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1008, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.x
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m3141f(eventTimeGenerateReadingMediaPeriodEventTime, str, j12, j11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(final String str) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1012, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.f
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(eventTimeGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1013, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.l0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDisabled(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1007, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioEnabled(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1009, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.a1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioInputFormatChanged(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1010, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.u
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(eventTimeGenerateReadingMediaPeriodEventTime, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.w0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSessionIdChanged(eventTimeGenerateReadingMediaPeriodEventTime, i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1014, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.n1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(final AudioSink.AudioTrackConfig audioTrackConfig) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1031, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.u0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioTrackInitialized(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(final AudioSink.AudioTrackConfig audioTrackConfig) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1032, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.l1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioTrackReleased(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i11, final long j11, final long j12) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1011, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(eventTimeGenerateReadingMediaPeriodEventTime, i11, j11, j12);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onAvailableCommandsChanged(final Player.Commands commands) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAvailableCommandsChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, commands);
            }
        });
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i11, final long j11, final long j12) {
        final AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, 1006, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.l
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(eventTimeGenerateLoadingMediaPeriodEventTime, i11, j11, j12);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(final CueGroup cueGroup) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.d1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, cueGroup);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceInfoChanged(final DeviceInfo deviceInfo) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceInfoChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, deviceInfo);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceVolumeChanged(final int i11, final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceVolumeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i11, z11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(eventTimeGenerateMediaPeriodEventTime, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1023, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.k1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1026, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.p0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1025, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.v0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int i12) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1022, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.n0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m3137d(eventTimeGenerateMediaPeriodEventTime, i12, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.q0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(eventTimeGenerateMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1027, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.m1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(final int i11, final long j11) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1018, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.a0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(eventTimeGeneratePlayingMediaPeriodEventTime, i11, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.e
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m3110F(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.v
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.r0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.p
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.g
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadStarted(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.s1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(@Nullable final MediaItem mediaItem, final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(final Metadata metadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.t
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(final boolean z11, final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.d0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z11, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.a
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.m0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.y
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.k0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(eventTimeForErrorEvent, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerErrorChanged(@Nullable final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.b0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerErrorChanged(eventTimeForErrorEvent, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(final boolean z11, final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.r
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z11, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaylistMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.x0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onRendererReadyChanged(final int i11, final int i12, final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1033, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.e0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRendererReadyChanged(eventTimeGenerateReadingMediaPeriodEventTime, i11, i12, z11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.f1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.r1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.d
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.p1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(final boolean z11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.k
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(eventTimeGenerateReadingMediaPeriodEventTime, z11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(final int i11, final int i12) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.q1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i11, i12);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTrackSelectionParametersChanged(final TrackSelectionParameters trackSelectionParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.t1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(final Tracks tracks) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.w
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, tracks);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1005, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(eventTimeGenerateMediaPeriodEventTime, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1030, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.n
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoCodecError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(final String str, final long j11, final long j12) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1016, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m3175y(eventTimeGenerateReadingMediaPeriodEventTime, str, j12, j11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(final String str) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1019, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.z
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(eventTimeGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1020, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.s0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDisabled(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1015, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoEnabled(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(final long j11, final int i11) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1021, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(eventTimeGeneratePlayingMediaPeriodEventTime, j11, i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1017, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.t0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoInputFormatChanged(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(final VideoSize videoSize) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.y0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m3159o(eventTimeGenerateReadingMediaPeriodEventTime, videoSize, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(final float f11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.m
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f11);
            }
        });
    }

    private AnalyticsListener.EventTime generateEventTime(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z11) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m3160o0(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }
}
