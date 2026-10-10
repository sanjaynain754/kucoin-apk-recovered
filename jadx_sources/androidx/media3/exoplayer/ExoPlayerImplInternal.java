package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes34.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = Util.usToMs(10000);
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper applicationLooperHandler;
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final boolean dynamicSchedulingEnabled;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;

    @Nullable
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;

    @Nullable
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final PlaybackLooperProvider playbackLooperProvider;
    private final PlayerId playerId;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final Renderer[] renderers;
    private final Set<Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private long playbackMaybeBecameStuckAtMs = C2711C.TIME_UNSET;
    private long lastRebufferRealtimeMs = C2711C.TIME_UNSET;
    private Timeline lastPreloadPoolInvalidationTimeline = Timeline.EMPTY;

    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i11, long j11) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i11;
            this.positionUs = j11;
        }
    }

    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;

        @Nullable
        public Object resolvedPeriodUid;

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i11 = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i11 != 0 ? i11 : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }

        public void setResolvedPosition(int i11, long j11, Object obj) {
            this.resolvedPeriodIndex = i11;
            this.resolvedPeriodTimeUs = j11;
            this.resolvedPeriodUid = obj;
        }

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public void incrementPendingOperationAcks(int i11) {
            this.hasPendingChange |= i11 > 0;
            this.operationAcks += i11;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i11) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(i11 == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i11;
        }

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }
    }

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i11, boolean z11, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j11, boolean z12, boolean z13, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, @Nullable PlaybackLooperProvider playbackLooperProvider, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i11;
        this.shuffleModeEnabled = z11;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j11;
        this.setForegroundModeTimeoutMs = j11;
        this.pauseAtEndOfWindow = z12;
        this.dynamicSchedulingEnabled = z13;
        this.clock = clock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = analyticsCollector;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        PlaybackInfo playbackInfoCreateDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = playbackInfoCreateDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(playbackInfoCreateDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        this.rendererReportedReady = new boolean[rendererArr.length];
        RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        for (int i12 = 0; i12 < rendererArr.length; i12++) {
            rendererArr[i12].init(i12, playerId, clock);
            this.rendererCapabilities[i12] = rendererArr[i12].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i12].setListener(rendererCapabilitiesListener);
            }
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.renderersToReset = Sets.newIdentityHashSet();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        HandlerWrapper handlerWrapperCreateHandler = clock.createHandler(looper, null);
        this.applicationLooperHandler = handlerWrapperCreateHandler;
        this.queue = new MediaPeriodQueue(analyticsCollector, handlerWrapperCreateHandler, new MediaPeriodHolder.Factory() { // from class: androidx.media3.exoplayer.p2
            @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
            public final MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j12) {
                return this.f3294a.createMediaPeriodHolder(mediaPeriodInfo, j12);
            }
        }, preloadConfiguration);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, handlerWrapperCreateHandler, playerId);
        PlaybackLooperProvider playbackLooperProvider2 = playbackLooperProvider == null ? new PlaybackLooperProvider() : playbackLooperProvider;
        this.playbackLooperProvider = playbackLooperProvider2;
        Looper looperObtainLooper = playbackLooperProvider2.obtainLooper();
        this.playbackLooper = looperObtainLooper;
        this.handler = clock.createHandler(looperObtainLooper, this);
    }

    private void enableRenderers() throws ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i11 = 0; i11 < length; i11++) {
            formatArr[i11] = exoTrackSelection.getFormat(i11);
        }
        return formatArr;
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z11) throws ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z11);
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z11, MediaSource.MediaPeriodId mediaPeriodId, long j11, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j12) {
        if (!z11 && j11 == j12 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            if (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) {
                return (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
        boolean z11;
        boolean z12 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z12) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.advancePlayingPeriod());
            if (this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolder.info.f2934id.periodUid)) {
                MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
                if (mediaPeriodId.adGroupIndex == -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolder.info.f2934id;
                    if (mediaPeriodId2.adGroupIndex != -1 || mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.f2934id;
            long j11 = mediaPeriodInfo.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, j11, mediaPeriodInfo.requestedContentPositionUs, j11, !z11, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            if (this.playbackInfo.playbackState == 3) {
                startRenderers();
            }
            allowRenderersToRenderStartOfStreams();
            z12 = true;
        }
    }

    private void releaseInternal() {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            setState(1);
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void releaseRenderers() {
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            this.rendererCapabilities[i11].clearListener();
            this.renderers[i11].release();
        }
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j11, boolean z11) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j11, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z11);
    }

    private void stopInternal(boolean z11, boolean z12) {
        resetInternal(z11 || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z12 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        setState(1);
    }

    private synchronized void waitUninterruptibly(Supplier<Boolean> supplier, long j11) {
        long jElapsedRealtime = this.clock.elapsedRealtime() + j11;
        boolean z11 = false;
        while (!supplier.get().booleanValue() && j11 > 0) {
            try {
                this.clock.onThreadBlocked();
                wait(j11);
            } catch (InterruptedException unused) {
                z11 = true;
            }
            j11 = jElapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean release() {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new Supplier() { // from class: androidx.media3.exoplayer.n2
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return Boolean.valueOf(this.f3271b.released);
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        Log.m2961w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z11) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            if (z11) {
                this.handler.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new Supplier() { // from class: androidx.media3.exoplayer.r2
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i11, int i12, int i13, ShuffleOrder shuffleOrder) {
            this.fromIndex = i11;
            this.toIndex = i12;
            this.newFromIndex = i13;
            this.shuffleOrder = shuffleOrder;
        }
    }

    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j11;
            this.requestedContentPositionUs = j12;
            this.forceBufferingState = z11;
            this.endPlayback = z12;
            this.setTargetLiveOffset = z13;
        }
    }

    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i11, long j11) {
            this.timeline = timeline;
            this.windowIndex = i11;
            this.windowPositionUs = j11;
        }
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i11) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i11 == -1) {
            i11 = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i11, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void allowRenderersToRenderStartOfStreams() {
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11)) {
                this.renderers[i11].enableMayRenderStartOfStream();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPeriodHolder createMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, long j11) {
        return new MediaPeriodHolder(this.rendererCapabilities, j11, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult, this.preloadConfiguration.targetPreloadDurationUs);
    }

    private void disableRenderer(int i11) throws ExoPlaybackException {
        Renderer renderer = this.renderers[i11];
        if (isRendererEnabled(renderer)) {
            maybeTriggerOnRendererReadyChanged(i11, false);
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:106:0x017b  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01db  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:152:0x0175 A[EDGE_INSN: B:152:0x0175->B:104:0x0175 BREAK  A[LOOP:1: B:96:0x0154->B:103:0x0172], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0172 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x0153  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159  */
    private void doSomeWork() throws ExoPlaybackException, IOException {
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        boolean z14;
        boolean z15;
        PlaybackInfo playbackInfo;
        int i11;
        int i12;
        Renderer[] rendererArr;
        PlaybackInfo playbackInfo2;
        long jUptimeMillis = this.clock.uptimeMillis();
        this.handler.removeMessages(2);
        updatePeriods();
        int i13 = this.playbackInfo.playbackState;
        if (i13 == 1 || i13 == 4) {
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(jUptimeMillis);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            this.rendererPositionElapsedRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            z11 = true;
            z12 = true;
            int i14 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.renderers;
                if (i14 >= rendererArr2.length) {
                    break;
                }
                Renderer renderer = rendererArr2[i14];
                if (isRendererEnabled(renderer)) {
                    renderer.render(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs);
                    z11 = z11 && renderer.isEnded();
                    boolean z16 = playingPeriod.sampleStreams[i14] != renderer.getStream();
                    boolean z17 = z16 || (!z16 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    maybeTriggerOnRendererReadyChanged(i14, z17);
                    z12 = z12 && z17;
                    if (!z17) {
                        maybeThrowRendererStreamError(i14);
                    }
                } else {
                    maybeTriggerOnRendererReadyChanged(i14, false);
                }
                i14++;
            }
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z11 = true;
            z12 = true;
        }
        long j12 = playingPeriod.info.durationUs;
        if (z11 && playingPeriod.prepared) {
            if (j12 != C2711C.TIME_UNSET) {
                j11 = -9223372036854775807L;
                if (j12 <= this.playbackInfo.positionUs) {
                }
                if (z13 && this.pendingPauseAtEndOfPeriod) {
                    this.pendingPauseAtEndOfPeriod = false;
                    setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
                }
                if (!z13 && playingPeriod.info.isFinal) {
                    setState(4);
                    stopRenderers();
                } else if (this.playbackInfo.playbackState != 2 && shouldTransitionToReadyState(z12)) {
                    setState(3);
                    this.pendingRecoverableRendererError = null;
                    if (shouldPlayWhenReady()) {
                        updateRebufferingState(false, false);
                        this.mediaClock.start();
                        startRenderers();
                    }
                } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z12 : !isTimelineReady())) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
                if (this.playbackInfo.playbackState == 2) {
                    i12 = 0;
                    while (true) {
                        rendererArr = this.renderers;
                        if (i12 >= rendererArr.length) {
                            break;
                        }
                        if (!isRendererEnabled(rendererArr[i12]) && this.renderers[i12].getStream() == playingPeriod.sampleStreams[i12]) {
                            maybeThrowRendererStreamError(i12);
                        }
                        i12++;
                    }
                    playbackInfo2 = this.playbackInfo;
                    if (!playbackInfo2.isLoading || playbackInfo2.totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US || !isLoadingPossible(this.queue.getLoadingPeriod())) {
                        this.playbackMaybeBecameStuckAtMs = j11;
                    } else if (this.playbackMaybeBecameStuckAtMs == j11) {
                        this.playbackMaybeBecameStuckAtMs = this.clock.elapsedRealtime();
                    } else if (this.clock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= PLAYBACK_STUCK_AFTER_MS) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                } else {
                    this.playbackMaybeBecameStuckAtMs = j11;
                }
                if (shouldPlayWhenReady() || this.playbackInfo.playbackState != 3) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                z15 = !this.offloadSchedulingEnabled && this.requestForRendererSleep && z14;
                playbackInfo = this.playbackInfo;
                if (playbackInfo.sleepingForOffload != z15) {
                    this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z15);
                }
                this.requestForRendererSleep = false;
                if (!z15 && (i11 = this.playbackInfo.playbackState) != 4 && (z14 || i11 == 2 || (i11 == 3 && this.enabledRendererCount != 0))) {
                    scheduleNextWork(jUptimeMillis);
                }
                TraceUtil.endSection();
            }
            j11 = -9223372036854775807L;
            z13 = true;
            if (z13) {
                this.pendingPauseAtEndOfPeriod = false;
                setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
            }
            if (!z13) {
                if (this.playbackInfo.playbackState != 2) {
                    if (this.playbackInfo.playbackState == 3) {
                        updateRebufferingState(shouldPlayWhenReady(), false);
                        setState(2);
                        if (this.isRebuffering) {
                            notifyTrackSelectionRebuffer();
                            this.livePlaybackSpeedControl.notifyRebuffer();
                        }
                        stopRenderers();
                    }
                } else if (this.playbackInfo.playbackState == 3) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
            } else if (this.playbackInfo.playbackState != 2) {
                if (this.playbackInfo.playbackState == 3) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
            } else if (this.playbackInfo.playbackState == 3) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
            if (this.playbackInfo.playbackState == 2) {
                i12 = 0;
                while (true) {
                    rendererArr = this.renderers;
                    if (i12 >= rendererArr.length) {
                        break;
                        break;
                    } else {
                        if (!isRendererEnabled(rendererArr[i12])) {
                        }
                        i12++;
                    }
                }
                playbackInfo2 = this.playbackInfo;
                if (!playbackInfo2.isLoading) {
                    this.playbackMaybeBecameStuckAtMs = j11;
                } else {
                    this.playbackMaybeBecameStuckAtMs = j11;
                }
            } else {
                this.playbackMaybeBecameStuckAtMs = j11;
            }
            if (shouldPlayWhenReady()) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (this.offloadSchedulingEnabled) {
            }
            playbackInfo = this.playbackInfo;
            if (playbackInfo.sleepingForOffload != z15) {
                this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z15);
            }
            this.requestForRendererSleep = false;
            if (!z15) {
                scheduleNextWork(jUptimeMillis);
            }
            TraceUtil.endSection();
        }
        j11 = -9223372036854775807L;
        z13 = false;
        if (z13) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (!z13) {
            if (this.playbackInfo.playbackState != 2) {
                if (this.playbackInfo.playbackState == 3) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
            } else if (this.playbackInfo.playbackState == 3) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
        } else if (this.playbackInfo.playbackState != 2) {
            if (this.playbackInfo.playbackState == 3) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3) {
            updateRebufferingState(shouldPlayWhenReady(), false);
            setState(2);
            if (this.isRebuffering) {
                notifyTrackSelectionRebuffer();
                this.livePlaybackSpeedControl.notifyRebuffer();
            }
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            i12 = 0;
            while (true) {
                rendererArr = this.renderers;
                if (i12 >= rendererArr.length) {
                    break;
                    break;
                } else {
                    if (!isRendererEnabled(rendererArr[i12])) {
                    }
                    i12++;
                }
            }
            playbackInfo2 = this.playbackInfo;
            if (!playbackInfo2.isLoading) {
                this.playbackMaybeBecameStuckAtMs = j11;
            } else {
                this.playbackMaybeBecameStuckAtMs = j11;
            }
        } else {
            this.playbackMaybeBecameStuckAtMs = j11;
        }
        if (shouldPlayWhenReady()) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (this.offloadSchedulingEnabled) {
        }
        playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload != z15) {
            this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z15);
        }
        this.requestForRendererSleep = false;
        if (!z15) {
            scheduleNextWork(jUptimeMillis);
        }
        TraceUtil.endSection();
    }

    private void enableRenderer(int i11, boolean z11, long j11) throws ExoPlaybackException {
        Renderer renderer = this.renderers[i11];
        if (isRendererEnabled(renderer)) {
            return;
        }
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z12 = readingPeriod == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i11];
        Format[] formats = getFormats(trackSelectorResult.selections[i11]);
        boolean z13 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z14 = !z11 && z13;
        this.enabledRendererCount++;
        this.renderersToReset.add(renderer);
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i11], this.rendererPositionUs, z14, z12, j11, readingPeriod.getRendererOffset(), readingPeriod.info.f2934id);
        renderer.handleMessage(11, new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (ExoPlayerImplInternal.this.dynamicSchedulingEnabled || ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z13 && z12) {
            renderer.start();
        }
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z11 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    builder.add(new Metadata(new Metadata.Entry[0]));
                } else {
                    builder.add(metadata);
                    z11 = true;
                }
            }
        }
        return z11 ? builder.build() : ImmutableList.m13439of();
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j11) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != C2711C.TIME_UNSET && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j11 + this.period.getPositionInWindowUs());
            }
        }
        return C2711C.TIME_UNSET;
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i11 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i11 >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i11]) && this.renderers[i11].getStream() == readingPeriod.sampleStreams[i11]) {
                long readingPositionUs = this.renderers[i11].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i11++;
        }
    }

    private long getTotalBufferedDurationUs(long j11) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j11 - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        } else if (this.queue.isPreloading(mediaPeriod)) {
            maybeContinuePreloading();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z11) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.f2934id;
        boolean zEquals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!zEquals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!zEquals || z11) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.f2934id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleLoadingPeriodPrepared(MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        if (!mediaPeriodHolder.prepared) {
            float f11 = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f11, playbackInfo.timeline, playbackInfo.playWhenReady);
        }
        updateLoadControlTrackSelection(mediaPeriodHolder.info.f2934id, mediaPeriodHolder.getTrackGroups(), mediaPeriodHolder.getTrackSelectorResult());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            resetRendererPosition(mediaPeriodHolder.info.startPositionUs);
            enableRenderers();
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
            long j11 = mediaPeriodHolder.info.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j11, playbackInfo2.requestedContentPositionUs, j11, false, 5);
        }
        maybeContinueLoading();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
    private void handleMediaSourceListInfoRefreshed(Timeline timeline, boolean z11) throws Throwable {
        int i11;
        Timeline timeline2;
        long j11;
        Object obj;
        boolean z12;
        int i12;
        timeline = timeline;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChangeResolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        MediaSource.MediaPeriodId mediaPeriodId = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodId;
        long j12 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z13 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.forceBufferingState;
        long jSeekToPeriodPosition = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionUs;
        int i13 = 1;
        boolean z14 = (this.playbackInfo.periodId.equals(mediaPeriodId) && jSeekToPeriodPosition == this.playbackInfo.positionUs) ? false : true;
        try {
            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            for (Renderer renderer : this.renderers) {
                renderer.setTimeline(timeline);
            }
            try {
                if (z14) {
                    i11 = 4;
                    i13 = -1;
                    if (!timeline.isEmpty()) {
                        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.info.f2934id.equals(mediaPeriodId)) {
                                playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline, playingPeriod.info);
                                playingPeriod.updateClipping();
                            }
                        }
                        jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, jSeekToPeriodPosition, z13);
                    }
                } else {
                    try {
                        try {
                            i11 = 4;
                            i13 = -1;
                            try {
                                timeline = timeline;
                                if (!this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                                    seekToCurrentPosition(false);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                timeline = timeline;
                                timeline2 = timeline;
                                PlaybackInfo playbackInfo = this.playbackInfo;
                                Timeline timeline3 = playbackInfo.timeline;
                                MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
                                if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset) {
                                    j11 = jSeekToPeriodPosition;
                                } else {
                                    j11 = -9223372036854775807L;
                                }
                                updatePlaybackSpeedSettingsForNewPeriod(timeline2, mediaPeriodId, timeline3, mediaPeriodId2, j11, false);
                                if (z14 || j12 != this.playbackInfo.requestedContentPositionUs) {
                                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                                    obj = playbackInfo2.periodId.periodUid;
                                    Timeline timeline4 = playbackInfo2.timeline;
                                    if (z14 || !z11 || timeline4.isEmpty() || timeline4.getPeriodByUid(obj, this.period).isPlaceholder) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    long j13 = this.playbackInfo.discontinuityStartPositionUs;
                                    if (timeline2.getIndexOfPeriod(obj) == i13) {
                                        i12 = i11;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j12, j13, z12, i12);
                                }
                                resetPendingPauseAtEndOfPeriod();
                                resolvePendingMessagePositions(timeline2, this.playbackInfo.timeline);
                                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2);
                                if (!timeline2.isEmpty()) {
                                    this.pendingInitialSeekPosition = null;
                                }
                                handleLoadingMediaPeriodChanged(false);
                                this.handler.sendEmptyMessage(2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i11 = 4;
                            i13 = -1;
                            timeline2 = timeline;
                            PlaybackInfo playbackInfo3 = this.playbackInfo;
                            Timeline timeline5 = playbackInfo3.timeline;
                            MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo3.periodId;
                            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset) {
                                j11 = jSeekToPeriodPosition;
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            updatePlaybackSpeedSettingsForNewPeriod(timeline2, mediaPeriodId, timeline5, mediaPeriodId3, j11, false);
                            if (z14) {
                                PlaybackInfo playbackInfo4 = this.playbackInfo;
                                obj = playbackInfo4.periodId.periodUid;
                                Timeline timeline6 = playbackInfo4.timeline;
                                if (z14) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                long j14 = this.playbackInfo.discontinuityStartPositionUs;
                                if (timeline2.getIndexOfPeriod(obj) == i13) {
                                    i12 = i11;
                                } else {
                                    i12 = 3;
                                }
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j12, j14, z12, i12);
                            } else {
                                PlaybackInfo playbackInfo5 = this.playbackInfo;
                                obj = playbackInfo5.periodId.periodUid;
                                Timeline timeline7 = playbackInfo5.timeline;
                                if (z14) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                long j15 = this.playbackInfo.discontinuityStartPositionUs;
                                if (timeline2.getIndexOfPeriod(obj) == i13) {
                                    i12 = i11;
                                } else {
                                    i12 = 3;
                                }
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j12, j15, z12, i12);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline2, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2);
                            if (!timeline2.isEmpty()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(false);
                            this.handler.sendEmptyMessage(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i11 = 4;
                    }
                }
                PlaybackInfo playbackInfo6 = this.playbackInfo;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, playbackInfo6.timeline, playbackInfo6.periodId, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : -9223372036854775807L, false);
                if (z14 || j12 != this.playbackInfo.requestedContentPositionUs) {
                    PlaybackInfo playbackInfo7 = this.playbackInfo;
                    Object obj2 = playbackInfo7.periodId.periodUid;
                    Timeline timeline8 = playbackInfo7.timeline;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j12, this.playbackInfo.discontinuityStartPositionUs, z14 && z11 && !timeline8.isEmpty() && !timeline8.getPeriodByUid(obj2, this.period).isPlaceholder, timeline.getIndexOfPeriod(obj2) == i13 ? i11 : 3);
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                if (!timeline.isEmpty()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(false);
                this.handler.sendEmptyMessage(2);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i11 = 4;
            i13 = -1;
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            handleLoadingPeriodPrepared((MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod()));
            return;
        }
        MediaPeriodHolder preloadHolderByMediaPeriod = this.queue.getPreloadHolderByMediaPeriod(mediaPeriod);
        if (preloadHolderByMediaPeriod != null) {
            Assertions.checkState(!preloadHolderByMediaPeriod.prepared);
            float f11 = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            preloadHolderByMediaPeriod.handlePrepared(f11, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (this.queue.isPreloading(mediaPeriod)) {
                maybeContinuePreloading();
            }
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f11, boolean z11, boolean z12) throws ExoPlaybackException {
        if (z11) {
            if (z12) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f11, playbackParameters.speed);
            }
        }
    }

    @CheckResult
    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, long j13, boolean z11, int i11) {
        List<Metadata> list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j11 == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        List<Metadata> listM13439of = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            TrackGroupArray trackGroups = playingPeriod == null ? TrackGroupArray.EMPTY : playingPeriod.getTrackGroups();
            TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            ImmutableList<Metadata> immutableListExtractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j12) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j12);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = immutableListExtractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.emptyTrackSelectorResult;
                listM13439of = ImmutableList.m13439of();
            }
            list = listM13439of;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z11) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i11);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j11, j12, j13, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i11 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i11 >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i11];
            SampleStream sampleStream = readingPeriod.sampleStreams[i11];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(renderer, readingPeriod))) {
                return false;
            }
            i11++;
        }
    }

    private boolean isLoadingPossible(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        return (mediaPeriodHolder == null || mediaPeriodHolder.hasLoadingError() || mediaPeriodHolder.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j11 = playingPeriod.info.durationUs;
        if (playingPeriod.prepared) {
            return j11 == C2711C.TIME_UNSET || this.playbackInfo.positionUs < j11 || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private void maybeContinuePreloading() {
        this.queue.maybeUpdatePreloadMediaPeriodHolder();
        MediaPeriodHolder preloadingPeriod = this.queue.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            if ((!preloadingPeriod.prepareCalled || preloadingPeriod.prepared) && !preloadingPeriod.mediaPeriod.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playbackInfo.timeline, preloadingPeriod.info.f2934id, preloadingPeriod.prepared ? preloadingPeriod.mediaPeriod.getBufferedPositionUs() : 0L)) {
                    if (preloadingPeriod.prepareCalled) {
                        preloadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
                    } else {
                        preloadingPeriod.prepare(this, preloadingPeriod.info.startPositionUs);
                    }
                }
            }
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void maybeThrowRendererStreamError(int i11) throws ExoPlaybackException, IOException {
        Renderer renderer = this.renderers[i11];
        try {
            renderer.maybeThrowStreamError();
        } catch (IOException | RuntimeException e11) {
            int trackType = renderer.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e11;
            }
            TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
            Log.m2958e(TAG, "Disabling track due to error: " + Format.toLogString(trackSelectorResult.selections[i11].getSelectedFormat()), e11);
            TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
            trackSelectorResult2.rendererConfigurations[i11] = null;
            trackSelectorResult2.selections[i11] = null;
            disableRenderer(i11);
            this.queue.getPlayingPeriod().applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false);
        }
    }

    private void maybeTriggerOnRendererReadyChanged(final int i11, final boolean z11) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i11] != z11) {
            zArr[i11] = z11;
            this.applicationLooperHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.o2
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal exoPlayerImplInternal = this.f3274b;
                    int i12 = i11;
                    exoPlayerImplInternal.analyticsCollector.onRendererReadyChanged(i12, exoPlayerImplInternal.renderers[i12].getTrackType(), z11);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j11, long j12) throws ExoPlaybackException {
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j11--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        int iMin = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        PendingMessageInfo pendingMessageInfo = iMin > 0 ? this.pendingMessages.get(iMin - 1) : null;
        while (pendingMessageInfo != null) {
            int i11 = pendingMessageInfo.resolvedPeriodIndex;
            if (i11 <= indexOfPeriod && (i11 != indexOfPeriod || pendingMessageInfo.resolvedPeriodTimeUs <= j11)) {
                break;
            }
            int i12 = iMin - 1;
            pendingMessageInfo = i12 > 0 ? this.pendingMessages.get(iMin - 2) : null;
            iMin = i12;
        }
        if (iMin < this.pendingMessages.size()) {
            PendingMessageInfo pendingMessageInfo2 = this.pendingMessages.get(iMin);
            while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null) {
                int i13 = pendingMessageInfo2.resolvedPeriodIndex;
                if (i13 >= indexOfPeriod && (i13 != indexOfPeriod || pendingMessageInfo2.resolvedPeriodTimeUs > j11)) {
                    break;
                }
                iMin++;
                pendingMessageInfo2 = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
            }
            while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null && pendingMessageInfo2.resolvedPeriodIndex == indexOfPeriod) {
                long j13 = pendingMessageInfo2.resolvedPeriodTimeUs;
                if (j13 <= j11 || j13 > j12) {
                    break;
                }
                try {
                    sendMessageToTarget(pendingMessageInfo2.message);
                    if (pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    } else {
                        iMin++;
                    }
                    pendingMessageInfo2 = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
                } catch (Throwable th2) {
                    if (pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    }
                    throw th2;
                }
            }
            this.nextPendingMessageIndexHint = iMin;
        }
    }

    private boolean maybeUpdateLoadingPeriod() throws ExoPlaybackException {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z11 = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder mediaPeriodHolderEnqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            if (!mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepareCalled) {
                mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepare(this, nextMediaPeriodInfo.startPositionUs);
            } else if (mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepared) {
                this.handler.obtainMessage(8, mediaPeriodHolderEnqueueNextMediaPeriodHolder.mediaPeriod).sendToTarget();
            }
            if (this.queue.getPlayingPeriod() == mediaPeriodHolderEnqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
            z11 = true;
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
            return z11;
        }
        this.shouldContinueLoading = isLoadingPossible(this.queue.getLoadingPeriod());
        updateIsLoading();
        return z11;
    }

    private void maybeUpdateOffloadScheduling() {
        boolean z11;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z12 = false;
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                if (i11 >= this.renderers.length) {
                    z11 = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i11)) {
                    if (this.renderers[i11].getTrackType() != 1) {
                        z11 = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i11].offloadModePreferred != 0) {
                        z13 = true;
                    }
                }
                i11++;
            }
            if (z13 && z11) {
                z12 = true;
            }
            setOffloadSchedulingEnabled(z12);
        }
    }

    private void maybeUpdatePreloadPeriods(boolean z11) {
        if (this.preloadConfiguration.targetPreloadDurationUs == C2711C.TIME_UNSET) {
            return;
        }
        if (z11 || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
            Timeline timeline = this.playbackInfo.timeline;
            this.lastPreloadPoolInvalidationTimeline = timeline;
            this.queue.invalidatePreloadPool(timeline);
        }
        maybeContinuePreloading();
    }

    private void maybeUpdateReadingPeriod() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i11 = 0;
        if (readingPeriod.getNext() != null && !this.pendingPauseAtEndOfPeriod) {
            if (hasReadingPeriodFinishedReading()) {
                if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                    TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    MediaPeriodHolder mediaPeriodHolderAdvanceReadingPeriod = this.queue.advanceReadingPeriod();
                    TrackSelectorResult trackSelectorResult2 = mediaPeriodHolderAdvanceReadingPeriod.getTrackSelectorResult();
                    Timeline timeline = this.playbackInfo.timeline;
                    updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodHolderAdvanceReadingPeriod.info.f2934id, timeline, readingPeriod.info.f2934id, C2711C.TIME_UNSET, false);
                    if (mediaPeriodHolderAdvanceReadingPeriod.prepared && mediaPeriodHolderAdvanceReadingPeriod.mediaPeriod.readDiscontinuity() != C2711C.TIME_UNSET) {
                        setAllRendererStreamsFinal(mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                        if (mediaPeriodHolderAdvanceReadingPeriod.isFullyBuffered()) {
                            return;
                        }
                        this.queue.removeAfter(mediaPeriodHolderAdvanceReadingPeriod);
                        handleLoadingMediaPeriodChanged(false);
                        maybeContinueLoading();
                        return;
                    }
                    for (int i12 = 0; i12 < this.renderers.length; i12++) {
                        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i12);
                        boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i12);
                        if (zIsRendererEnabled && !this.renderers[i12].isCurrentStreamFinal()) {
                            boolean z11 = this.rendererCapabilities[i12].getTrackType() == -2;
                            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i12];
                            RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i12];
                            if (!zIsRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z11) {
                                setCurrentStreamFinal(this.renderers[i12], mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!readingPeriod.info.isFinal && !this.pendingPauseAtEndOfPeriod) {
            return;
        }
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i11 >= rendererArr.length) {
                return;
            }
            Renderer renderer = rendererArr[i11];
            SampleStream sampleStream = readingPeriod.sampleStreams[i11];
            if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                long j11 = readingPeriod.info.durationUs;
                setCurrentStreamFinal(renderer, (j11 == C2711C.TIME_UNSET || j11 == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
            }
            i11++;
        }
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private void mediaSourceListUpdateRequestedInternal() throws Throwable {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z11) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z11);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void removeMediaItemsInternal(int i11, int i12, ShuffleOrder shuffleOrder) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i11, i12, shuffleOrder), false);
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i11 >= rendererArr.length) {
                return !z11;
            }
            Renderer renderer = rendererArr[i11];
            if (isRendererEnabled(renderer)) {
                boolean z12 = renderer.getStream() != readingPeriod.sampleStreams[i11];
                if (!trackSelectorResult.isRendererEnabled(i11) || z12) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i11]), readingPeriod.sampleStreams[i11], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset(), readingPeriod.info.f2934id);
                        if (this.offloadSchedulingEnabled) {
                            setOffloadSchedulingEnabled(false);
                        }
                    } else if (renderer.isEnded()) {
                        disableRenderer(i11);
                    } else {
                        z11 = true;
                    }
                }
            }
            i11++;
        }
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        float f11 = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = null;
        boolean z11 = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            TrackSelectorResult trackSelectorResultSelectTracks = playingPeriod.selectTracks(f11, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (playingPeriod == this.queue.getPlayingPeriod()) {
                trackSelectorResult = trackSelectorResultSelectTracks;
            }
            int i11 = 0;
            if (!trackSelectorResultSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z11) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean zRemoveAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection((TrackSelectorResult) Assertions.checkNotNull(trackSelectorResult), this.playbackInfo.positionUs, zRemoveAfter, zArr);
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    boolean z12 = (playbackInfo2.playbackState == 4 || jApplyTrackSelection == playbackInfo2.positionUs) ? false : true;
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, jApplyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z12, 5);
                    if (z12) {
                        resetRendererPosition(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i11 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i11];
                        boolean zIsRendererEnabled = isRendererEnabled(renderer);
                        zArr2[i11] = zIsRendererEnabled;
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i11];
                        if (zIsRendererEnabled) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(i11);
                            } else if (zArr[i11]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i11++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(trackSelectorResultSelectTracks, Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z11 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[PHI: r5 r6 r8
      0x00a0: PHI (r5v4 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId) = 
      (r5v3 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
      (r5v7 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
     binds: [B:29:0x0076, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:29:0x0076, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:29:0x0076, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[PHI: r0
      0x00e7: PHI (r0v11 androidx.media3.common.Timeline) = 
      (r0v10 androidx.media3.common.Timeline)
      (r0v10 androidx.media3.common.Timeline)
      (r0v21 androidx.media3.common.Timeline)
      (r0v21 androidx.media3.common.Timeline)
     binds: [B:35:0x00ad, B:37:0x00b1, B:39:0x00c2, B:41:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    private void resetInternal(boolean z11, boolean z12, boolean z13, boolean z14) {
        Renderer[] rendererArr;
        boolean z15;
        Timeline timeline;
        MediaSource.MediaPeriodId mediaPeriodId;
        this.handler.removeMessages(2);
        this.pendingRecoverableRendererError = null;
        updateRebufferingState(false, true);
        this.mediaClock.stop();
        this.rendererPositionUs = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        int i11 = 0;
        while (true) {
            rendererArr = this.renderers;
            if (i11 >= rendererArr.length) {
                break;
            }
            try {
                disableRenderer(i11);
            } catch (ExoPlaybackException | RuntimeException e11) {
                Log.m2958e(TAG, "Disable failed.", e11);
            }
            i11++;
        }
        if (z11) {
            for (Renderer renderer : rendererArr) {
                if (this.renderersToReset.remove(renderer)) {
                    try {
                        renderer.reset();
                    } catch (RuntimeException e12) {
                        Log.m2958e(TAG, "Reset failed.", e12);
                    }
                }
            }
        }
        this.enabledRendererCount = 0;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        long jLongValue = playbackInfo.positionUs;
        long j11 = (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) ? this.playbackInfo.requestedContentPositionUs : this.playbackInfo.positionUs;
        if (z12) {
            this.pendingInitialSeekPosition = null;
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            mediaPeriodId2 = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            jLongValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            boolean zEquals = mediaPeriodId2.equals(this.playbackInfo.periodId);
            j11 = C2711C.TIME_UNSET;
            z15 = zEquals ? false : true;
        }
        long j12 = jLongValue;
        long j13 = j11;
        this.queue.clear();
        this.shouldContinueLoading = false;
        Timeline timelineCopyWithPlaceholderTimeline = this.playbackInfo.timeline;
        if (z13 && (timelineCopyWithPlaceholderTimeline instanceof PlaylistTimeline)) {
            timelineCopyWithPlaceholderTimeline = ((PlaylistTimeline) timelineCopyWithPlaceholderTimeline).copyWithPlaceholderTimeline(this.mediaSourceList.getShuffleOrder());
            if (mediaPeriodId2.adGroupIndex != -1) {
                timelineCopyWithPlaceholderTimeline.getPeriodByUid(mediaPeriodId2.periodUid, this.period);
                if (timelineCopyWithPlaceholderTimeline.getWindow(this.period.windowIndex, this.window).isLive()) {
                    timeline = timelineCopyWithPlaceholderTimeline;
                    mediaPeriodId = new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber);
                } else {
                    timeline = timelineCopyWithPlaceholderTimeline;
                    mediaPeriodId = mediaPeriodId2;
                }
            } else {
                timeline = timelineCopyWithPlaceholderTimeline;
                mediaPeriodId = mediaPeriodId2;
            }
        } else {
            timeline = timelineCopyWithPlaceholderTimeline;
            mediaPeriodId = mediaPeriodId2;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        int i12 = playbackInfo2.playbackState;
        ExoPlaybackException exoPlaybackException = z14 ? null : playbackInfo2.playbackError;
        TrackGroupArray trackGroupArray = z15 ? TrackGroupArray.EMPTY : playbackInfo2.trackGroups;
        TrackSelectorResult trackSelectorResult = z15 ? this.emptyTrackSelectorResult : playbackInfo2.trackSelectorResult;
        List listM13439of = z15 ? ImmutableList.m13439of() : playbackInfo2.staticMetadata;
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        this.playbackInfo = new PlaybackInfo(timeline, mediaPeriodId, j13, j12, i12, exoPlaybackException, false, trackGroupArray, trackSelectorResult, listM13439of, mediaPeriodId, playbackInfo3.playWhenReady, playbackInfo3.playWhenReadyChangeReason, playbackInfo3.playbackSuppressionReason, playbackInfo3.playbackParameters, j12, 0L, j12, 0L, false);
        if (z13) {
            this.queue.releasePreloadPool();
            this.mediaSourceList.release();
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j11) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j11 + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : playingPeriod.toRendererTime(j11);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i11 = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i11, period, true).uid;
        long j11 = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i11, j11 != C2711C.TIME_UNSET ? j11 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i11, boolean z11, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? C2711C.TIME_UNSET : Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i11, z11, window, period);
            if (pairResolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(pairResolveSeekPositionUs.first), ((Long) pairResolveSeekPositionUs.second).longValue(), pairResolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, pendingMessageInfo.resolvedPeriodTimeUs + period.getPositionInWindowUs());
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, @Nullable SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i11, boolean z11, Timeline.Window window, Timeline.Period period) {
        int i12;
        long j11;
        int firstWindowIndex;
        long jLongValue;
        boolean z12;
        boolean z13;
        boolean z14;
        int firstWindowIndex2;
        boolean z15;
        Timeline timeline2;
        Timeline.Period period2;
        long j12;
        int i13;
        long jLongValue2;
        int firstWindowIndex3;
        boolean z16;
        boolean z17;
        boolean z18;
        if (timeline.isEmpty()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, C2711C.TIME_UNSET, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Object obj = mediaPeriodId.periodUid;
        boolean zIsUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, period);
        long adResumePositionUs = (playbackInfo.periodId.isAd() || zIsUsingPlaceholderPeriod) ? playbackInfo.requestedContentPositionUs : playbackInfo.positionUs;
        if (seekPosition != null) {
            i12 = -1;
            j11 = C2711C.TIME_UNSET;
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(timeline, seekPosition, true, i11, z11, window, period);
            if (pairResolveSeekPositionUs == null) {
                firstWindowIndex3 = timeline.getFirstWindowIndex(z11);
                jLongValue2 = adResumePositionUs;
                z16 = false;
                z17 = false;
                z18 = true;
            } else {
                if (seekPosition.windowPositionUs == C2711C.TIME_UNSET) {
                    firstWindowIndex3 = timeline.getPeriodByUid(pairResolveSeekPositionUs.first, period).windowIndex;
                    jLongValue2 = adResumePositionUs;
                    z16 = false;
                } else {
                    obj = pairResolveSeekPositionUs.first;
                    jLongValue2 = ((Long) pairResolveSeekPositionUs.second).longValue();
                    firstWindowIndex3 = -1;
                    z16 = true;
                }
                z17 = playbackInfo.playbackState == 4;
                z18 = false;
            }
            firstWindowIndex = firstWindowIndex3;
            adResumePositionUs = jLongValue2;
            z14 = z16;
            z12 = z17;
            z13 = z18;
        } else {
            i12 = -1;
            j11 = C2711C.TIME_UNSET;
            if (playbackInfo.timeline.isEmpty()) {
                firstWindowIndex = timeline.getFirstWindowIndex(z11);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                int iResolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i11, z11, obj, playbackInfo.timeline, timeline);
                if (iResolveSubsequentPeriod == -1) {
                    firstWindowIndex2 = timeline.getFirstWindowIndex(z11);
                    z15 = true;
                } else {
                    firstWindowIndex2 = iResolveSubsequentPeriod;
                    z15 = false;
                }
                firstWindowIndex = firstWindowIndex2;
                obj = obj;
                adResumePositionUs = adResumePositionUs;
                z13 = z15;
                z12 = false;
                z14 = false;
            } else if (adResumePositionUs == C2711C.TIME_UNSET) {
                firstWindowIndex = timeline.getPeriodByUid(obj, period).windowIndex;
                obj = obj;
            } else if (zIsUsingPlaceholderPeriod) {
                playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
                if (playbackInfo.timeline.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, period.getPositionInWindowUs() + adResumePositionUs);
                    obj = periodPositionUs.first;
                    jLongValue = ((Long) periodPositionUs.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = adResumePositionUs;
                }
                adResumePositionUs = jLongValue;
                firstWindowIndex = -1;
                z12 = false;
                z13 = false;
                z14 = true;
            } else {
                obj = obj;
                firstWindowIndex = -1;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (firstWindowIndex != i12) {
            period2 = period;
            Pair<Object, Long> periodPositionUs2 = timeline.getPeriodPositionUs(window, period2, firstWindowIndex, C2711C.TIME_UNSET);
            timeline2 = timeline;
            obj = periodPositionUs2.first;
            adResumePositionUs = ((Long) periodPositionUs2.second).longValue();
            j12 = j11;
        } else {
            timeline2 = timeline;
            period2 = period;
            j12 = adResumePositionUs;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline2, obj, adResumePositionUs);
        int i14 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        boolean z19 = mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && (i14 == i12 || ((i13 = mediaPeriodId.nextAdGroupIndex) != i12 && i14 >= i13));
        long j13 = j12;
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        boolean zIsIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(zIsUsingPlaceholderPeriod, mediaPeriodId, adResumePositionUs, mediaPeriodId2, timeline2.getPeriodByUid(obj, period2), j13);
        if (z19 || zIsIgnorableServerSideAdInsertionPeriodChange) {
            mediaPeriodId2 = mediaPeriodId;
        }
        if (mediaPeriodId2.isAd()) {
            if (mediaPeriodId2.equals(mediaPeriodId)) {
                adResumePositionUs = playbackInfo.positionUs;
            } else {
                timeline2.getPeriodByUid(mediaPeriodId2.periodUid, period2);
                adResumePositionUs = mediaPeriodId2.adIndexInAdGroup == period2.getFirstAdIndexToPlay(mediaPeriodId2.adGroupIndex) ? period2.getAdResumePositionUs() : 0L;
            }
        }
        return new PositionUpdateForPlaylistChange(mediaPeriodId2, adResumePositionUs, j13, z12, z13, z14);
    }

    @Nullable
    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z11, int i11, boolean z12, Timeline.Window window, Timeline.Period period) {
        Timeline timeline2;
        int iResolveSubsequentPeriod;
        Timeline timeline3 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline3.isEmpty()) {
            timeline2 = timeline3;
            timeline2 = timeline;
        }
        try {
            timeline2 = timeline3;
            Pair<Object, Long> periodPositionUs = timeline2.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            Timeline timeline4 = timeline2;
            if (timeline.equals(timeline4)) {
                return periodPositionUs;
            }
            if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (timeline4.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline4.getWindow(period.windowIndex, window).firstPeriodIndex == timeline4.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
            }
            if (z11 && (iResolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i11, z12, periodPositionUs.first, timeline4, timeline)) != -1) {
                return timeline.getPeriodPositionUs(window, period, iResolveSubsequentPeriod, C2711C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void scheduleNextWork(long j11) {
        long jMin = (this.playbackInfo.playbackState != 3 || (!this.dynamicSchedulingEnabled && shouldPlayWhenReady())) ? BUFFERING_MAXIMUM_INTERVAL_MS : 1000L;
        if (this.dynamicSchedulingEnabled && shouldPlayWhenReady()) {
            for (Renderer renderer : this.renderers) {
                if (isRendererEnabled(renderer)) {
                    jMin = Math.min(jMin, Util.usToMs(renderer.getDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
                }
            }
        }
        this.handler.sendEmptyMessageAtTime(2, j11 + jMin);
    }

    private void seekToCurrentPosition(boolean z11) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.f2934id;
        long jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (jSeekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z11, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void seekToInternal(SeekPosition seekPosition) throws Throwable {
        long jLongValue;
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        long j11;
        boolean z11;
        long j12;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j13;
        MediaSource.MediaPeriodId mediaPeriodId2;
        MediaPeriodHolder playingPeriod;
        long adjustedSeekPositionUs;
        PlaybackInfo playbackInfo;
        int i11;
        int i12;
        long j14;
        MediaSource.MediaPeriodId mediaPeriodId3;
        long j15;
        boolean z12;
        long jSeekToPeriodPosition;
        MediaSource.MediaPeriodId mediaPeriodId4;
        long j16;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.timeline, seekPosition, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        try {
            if (pairResolveSeekPositionUs != null) {
                Object obj = pairResolveSeekPositionUs.first;
                jLongValue = ((Long) pairResolveSeekPositionUs.second).longValue();
                long j17 = seekPosition.windowPositionUs == C2711C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = exoPlayerImplInternal.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(exoPlayerImplInternal.playbackInfo.timeline, obj, jLongValue);
                if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                    exoPlayerImplInternal.playbackInfo.timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, exoPlayerImplInternal.period);
                    jLongValue = exoPlayerImplInternal.period.getFirstAdIndexToPlay(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? exoPlayerImplInternal.period.getAdResumePositionUs() : 0L;
                    z11 = true;
                    j12 = j17;
                } else {
                    j11 = 0;
                    z11 = seekPosition.windowPositionUs == C2711C.TIME_UNSET;
                    j12 = j17;
                }
                if (exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                    if (pairResolveSeekPositionUs == null) {
                        if (exoPlayerImplInternal.playbackInfo.playbackState != 1) {
                            exoPlayerImplInternal.setState(4);
                        }
                        exoPlayerImplInternal.resetInternal(false, true, false, true);
                    } else {
                        if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(exoPlayerImplInternal.playbackInfo.periodId)) {
                            try {
                                playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                                if (playingPeriod == null && playingPeriod.prepared && jLongValue != j11) {
                                    adjustedSeekPositionUs = playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(jLongValue, exoPlayerImplInternal.seekParameters);
                                } else {
                                    adjustedSeekPositionUs = jLongValue;
                                }
                                mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                try {
                                    if (Util.usToMs(adjustedSeekPositionUs) != Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs) && ((i11 = (playbackInfo = exoPlayerImplInternal.playbackInfo).playbackState) == 2 || i11 == 3)) {
                                        long j18 = playbackInfo.positionUs;
                                        i12 = 2;
                                        z11 = z11;
                                        j14 = j18;
                                        mediaPeriodId3 = mediaPeriodId2;
                                        j15 = j18;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = z11;
                                    mediaPeriodId = mediaPeriodId2;
                                    j13 = jLongValue;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j13, j12, j13, z11, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = z11;
                                mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                            }
                        } else {
                            mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                            adjustedSeekPositionUs = jLongValue;
                        }
                        try {
                            if (exoPlayerImplInternal.playbackInfo.playbackState == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            jSeekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodId2, adjustedSeekPositionUs, z12);
                            z11 |= jLongValue != jSeekToPeriodPosition;
                            try {
                                PlaybackInfo playbackInfo2 = exoPlayerImplInternal.playbackInfo;
                                Timeline timeline = playbackInfo2.timeline;
                                mediaPeriodId4 = mediaPeriodId2;
                                j16 = j12;
                                try {
                                    exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId4, timeline, playbackInfo2.periodId, j16, true);
                                    mediaPeriodId3 = mediaPeriodId4;
                                    j12 = j16;
                                    j15 = jSeekToPeriodPosition;
                                    i12 = 2;
                                    j14 = j15;
                                    exoPlayerImplInternal = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    mediaPeriodId = mediaPeriodId4;
                                    j12 = j16;
                                    j13 = jSeekToPeriodPosition;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j13, j12, j13, z11, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                mediaPeriodId = mediaPeriodId2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            mediaPeriodId = mediaPeriodId2;
                            j13 = jLongValue;
                            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j13, j12, j13, z11, 2);
                            throw th;
                        }
                    }
                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j15, j12, j14, z11, i12);
                    return;
                }
                exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
                z11 = z11;
                mediaPeriodId3 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                j15 = jLongValue;
                i12 = 2;
                j14 = j15;
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j15, j12, j14, z11, i12);
                return;
            }
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.timeline);
            mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            jLongValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            z11 = !exoPlayerImplInternal.playbackInfo.timeline.isEmpty();
            j12 = -9223372036854775807L;
            if (exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                if (pairResolveSeekPositionUs == null) {
                    if (exoPlayerImplInternal.playbackInfo.playbackState != 1) {
                        exoPlayerImplInternal.setState(4);
                    }
                    exoPlayerImplInternal.resetInternal(false, true, false, true);
                } else {
                    if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(exoPlayerImplInternal.playbackInfo.periodId)) {
                        playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                        if (playingPeriod == null) {
                            adjustedSeekPositionUs = jLongValue;
                        } else {
                            adjustedSeekPositionUs = jLongValue;
                        }
                        mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                        if (Util.usToMs(adjustedSeekPositionUs) != Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs)) {
                        }
                    } else {
                        mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                        adjustedSeekPositionUs = jLongValue;
                    }
                    if (exoPlayerImplInternal.playbackInfo.playbackState == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    jSeekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodId2, adjustedSeekPositionUs, z12);
                    z11 |= jLongValue != jSeekToPeriodPosition;
                    PlaybackInfo playbackInfo3 = exoPlayerImplInternal.playbackInfo;
                    Timeline timeline2 = playbackInfo3.timeline;
                    mediaPeriodId4 = mediaPeriodId2;
                    j16 = j12;
                    exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline2, mediaPeriodId4, timeline2, playbackInfo3.periodId, j16, true);
                    mediaPeriodId3 = mediaPeriodId4;
                    j12 = j16;
                    j15 = jSeekToPeriodPosition;
                    i12 = 2;
                    j14 = j15;
                    exoPlayerImplInternal = this;
                }
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j15, j12, j14, z11, i12);
                return;
            }
            exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
            z11 = z11;
            mediaPeriodId3 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
            j15 = jLongValue;
            i12 = 2;
            j14 = j15;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j15, j12, j14, z11, i12);
            return;
        } catch (Throwable th7) {
            th = th7;
            z11 = z11;
            mediaPeriodId = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        }
        j11 = 0;
    }

    private void setAllRendererStreamsFinal(long j11) {
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j11);
            }
        }
    }

    private void setForegroundModeInternal(boolean z11, @Nullable AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z11) {
            this.foregroundMode = z11;
            if (!z11) {
                for (Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer) && this.renderersToReset.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaClockPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void setOffloadSchedulingEnabled(boolean z11) {
        if (z11 == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z11;
        if (z11 || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z11) throws ExoPlaybackException {
        this.pauseAtEndOfWindow = z11;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z11, int i11, boolean z12, int i12) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z12 ? 1 : 0);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z11, i12, i11);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z11);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i13 = this.playbackInfo.playbackState;
        if (i13 == 3) {
            this.mediaClock.start();
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i13 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPreloadConfigurationInternal(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void setRepeatModeInternal(int i11) throws ExoPlaybackException {
        this.repeatMode = i11;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i11)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z11) throws ExoPlaybackException {
        this.shuffleModeEnabled = z11;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z11)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void setState(int i11) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i11) {
            if (i11 != 2) {
                this.playbackMaybeBecameStuckAtMs = C2711C.TIME_UNSET;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i11);
        }
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible(this.queue.getLoadingPeriod())) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        LoadControl.Parameters parameters = new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.f2934id, loadingPeriod == this.queue.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.rendererPositionUs) : loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.f2934id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C2711C.TIME_UNSET);
        boolean zShouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (zShouldContinueLoading || !playingPeriod.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return zShouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return zShouldContinueLoading;
        }
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z11) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z12 = false;
        if (!z11) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.f2934id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C2711C.TIME_UNSET;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z13 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        if (loadingPeriod.info.f2934id.isAd() && !loadingPeriod.prepared) {
            z12 = true;
        }
        if (z13 || z12) {
            return true;
        }
        return this.loadControl.shouldStartPlayback(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.f2934id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs));
    }

    private void startRenderers() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11) && this.renderers[i11].getState() == 1) {
                this.renderers[i11].start();
            }
        }
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z11 = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z11 != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z11);
        }
    }

    private void updateLoadControlTrackSelection(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod());
        this.loadControl.onTracksSelected(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, mediaPeriodId, mediaPeriodHolder == this.queue.getPlayingPeriod() ? mediaPeriodHolder.toPeriodTime(this.rendererPositionUs) : mediaPeriodHolder.toPeriodTime(this.rendererPositionUs) - mediaPeriodHolder.info.startPositionUs, getTotalBufferedDurationUs(mediaPeriodHolder.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, mediaPeriodHolder.info.f2934id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C2711C.TIME_UNSET), trackGroupArray, trackSelectorResult.selections);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i11, int i12, List<MediaItem> list) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i11, i12, list), false);
    }

    private void updatePeriods() throws ExoPlaybackException {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean zMaybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(zMaybeUpdateLoadingPeriod);
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C2711C.TIME_UNSET) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(discontinuity);
            if (discontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                long j11 = discontinuity;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, j11, playbackInfo.requestedContentPositionUs, j11, true, 5);
            }
        } else {
            long jSyncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z11 = !this.playbackInfoUpdate.positionDiscontinuity;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, periodTime, playbackInfo2.requestedContentPositionUs, periodTime, z11, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.playWhenReady && playbackInfo3.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo3.timeline, playbackInfo3.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), this.playbackInfo.totalBufferedDurationUs);
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void updateRebufferingState(boolean z11, boolean z12) {
        this.isRebuffering = z11;
        this.lastRebufferRealtimeMs = (!z11 || z12) ? C2711C.TIME_UNSET : this.clock.elapsedRealtime();
    }

    private void updateTrackSelectionPlaybackSpeed(float f11) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f11);
                }
            }
        }
    }

    public void addMediaSources(int i11, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i11, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, C2711C.TIME_UNSET)).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j11) {
        this.setForegroundModeTimeoutMs = j11;
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i11;
        MediaPeriodHolder readingPeriod;
        int i12;
        int i13 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i14 = message.arg2;
                    setPlayWhenReadyInternal(z11, i14 >> 4, true, i14 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
            }
        } catch (ParserException e11) {
            int i15 = e11.dataType;
            if (i15 == 1) {
                i12 = e11.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i15 == 4) {
                    i12 = e11.contentIsMalformed ? 3002 : 3004;
                }
                handleIoException(e11, i13);
            }
            i13 = i12;
            handleIoException(e11, i13);
        } catch (DataSourceException e12) {
            handleIoException(e12, e12.reason);
        } catch (ExoPlaybackException e13) {
            e = e13;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.f2934id);
            }
            if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i11 = e.errorCode) == 5004 || i11 == 5003)) {
                Log.m2962w(TAG, "Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                } else {
                    this.pendingRecoverableRendererError = e;
                }
                HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.pendingRecoverableRendererError;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                Log.m2958e(TAG, "Playback error", e);
                if (e.type == 1 && this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                        this.queue.advancePlayingPeriod();
                    }
                    MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getPlayingPeriod());
                    maybeNotifyPlaybackInfoChanged();
                    MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                    MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f2934id;
                    long j11 = mediaPeriodInfo.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j11, mediaPeriodInfo.requestedContentPositionUs, j11, true, 0);
                }
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
        } catch (DrmSession.DrmSessionException e14) {
            handleIoException(e14, e14.errorCode);
        } catch (BehindLiveWindowException e15) {
            handleIoException(e15, 1002);
        } catch (IOException e16) {
            handleIoException(e16, 2000);
        } catch (RuntimeException e17) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.m2958e(TAG, "Playback error", exoPlaybackExceptionCreateForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i11, int i12, int i13, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i11, i12, i13, shuffleOrder)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    public void prepare() {
        this.handler.obtainMessage(29).sendToTarget();
    }

    public void removeMediaSources(int i11, int i12, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i11, i12, shuffleOrder).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i11, long j11) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i11, j11)).sendToTarget();
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i11, long j11, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i11, j11)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z11) {
        this.handler.obtainMessage(23, z11 ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z11, int i11, int i12) {
        this.handler.obtainMessage(1, z11 ? 1 : 0, i11 | (i12 << 4)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.handler.obtainMessage(28, preloadConfiguration).sendToTarget();
    }

    public void setRepeatMode(int i11) {
        this.handler.obtainMessage(11, i11, 0).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z11) {
        this.handler.obtainMessage(12, z11 ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void updateMediaSourcesWithMediaItems(int i11, int i12, List<MediaItem> list) {
        this.handler.obtainMessage(27, i11, i12, list).sendToTarget();
    }

    private void attemptRendererErrorRecovery() throws ExoPlaybackException {
        reselectTracksInternalAndSeek();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3085c(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        exoPlayerImplInternal.getClass();
        try {
            exoPlayerImplInternal.deliverMessage(playerMessage);
        } catch (ExoPlaybackException e11) {
            Log.m2958e(TAG, "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        long adResumePositionUs = 0;
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), C2711C.TIME_UNSET);
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex)) {
                adResumePositionUs = this.period.getAdResumePositionUs();
            }
            jLongValue = adResumePositionUs;
        }
        return Pair.create(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(jLongValue));
    }

    private void handleIoException(IOException iOException, int i11) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i11);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(playingPeriod.info.f2934id);
        }
        Log.m2958e(TAG, "Playback error", exoPlaybackExceptionCreateForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForSource);
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next.prepared) {
            if ((renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        if (renderer.getState() != 0) {
            return true;
        }
        return false;
    }

    private void maybeContinueLoading() {
        boolean zShouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod());
            mediaPeriodHolder.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(mediaPeriodHolder.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
        }
        updateIsLoading();
    }

    private void reselectTracksInternalAndSeek() throws ExoPlaybackException {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (size >= 0) {
            Timeline timeline3 = timeline;
            Timeline timeline4 = timeline2;
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline3, timeline4, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
            size--;
            timeline = timeline3;
            timeline2 = timeline4;
        }
        Collections.sort(this.pendingMessages);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static int resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i11, boolean z11, Object obj, Timeline timeline, Timeline timeline2) {
        Timeline.Period period2;
        Object obj2 = timeline.getWindow(timeline.getPeriodByUid(obj, period).windowIndex, window).uid;
        int i12 = 0;
        for (int i13 = 0; i13 < timeline2.getWindowCount(); i13++) {
            if (timeline2.getWindow(i13, window).uid.equals(obj2)) {
                return i13;
            }
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i12 < periodCount && indexOfPeriod2 == -1) {
            Timeline.Window window2 = window;
            period2 = period;
            int i14 = i11;
            boolean z12 = z11;
            Timeline timeline3 = timeline;
            nextPeriodIndex = timeline3.getNextPeriodIndex(nextPeriodIndex, period2, window2, i14, z12);
            if (nextPeriodIndex != -1) {
                indexOfPeriod2 = timeline2.getIndexOfPeriod(timeline3.getUidOfPeriod(nextPeriodIndex));
                i12++;
                timeline = timeline3;
                period = period2;
                window = window2;
                i11 = i14;
                z11 = z12;
            } else {
                if (indexOfPeriod2 == -1) {
                    return -1;
                }
                return timeline2.getPeriod(indexOfPeriod2, period2).windowIndex;
            }
        }
        period2 = period;
        if (indexOfPeriod2 == -1) {
            return -1;
        }
        return timeline2.getPeriod(indexOfPeriod2, period2).windowIndex;
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == C2711C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        Timeline timeline = this.playbackInfo.timeline;
        if (resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        } else {
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getLooper() == this.playbackLooper) {
            deliverMessage(playerMessage);
            int i11 = this.playbackInfo.playbackState;
            if (i11 != 3 && i11 != 2) {
                return;
            }
            this.handler.sendEmptyMessage(2);
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            Log.m2961w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        } else {
            this.clock.createHandler(looper, null).post(new Runnable() { // from class: androidx.media3.exoplayer.q2
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.m3085c(this.f3297b, playerMessage);
                }
            });
        }
    }

    private void setCurrentStreamFinal(Renderer renderer, long j11) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j11);
        }
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        if (!shouldPlayWhenReady() || this.pendingPauseAtEndOfPeriod || (playingPeriod = this.queue.getPlayingPeriod()) == null || (next = playingPeriod.getNext()) == null || this.rendererPositionUs < next.getStartPositionRendererTime() || !next.allRenderersInCorrectState) {
            return false;
        }
        return true;
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            if (this.window.isLive()) {
                Timeline.Window window = this.window;
                if (window.isDynamic && window.windowStartTimeMs != C2711C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j11, boolean z11) throws ExoPlaybackException {
        Object obj;
        PlaybackParameters playbackParameters;
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            if (mediaPeriodId.isAd()) {
                playbackParameters = PlaybackParameters.DEFAULT;
            } else {
                playbackParameters = this.playbackInfo.playbackParameters;
            }
            if (!this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                setMediaClockPlaybackParameters(playbackParameters);
                handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
                return;
            }
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
        if (j11 != C2711C.TIME_UNSET) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j11));
            return;
        }
        Object obj2 = this.window.uid;
        if (!timeline2.isEmpty()) {
            obj = timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid;
        } else {
            obj = null;
        }
        if (Util.areEqual(obj, obj2) && !z11) {
            return;
        }
        this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(C2711C.TIME_UNSET);
    }

    private void enableRenderers(boolean[] zArr, long j11) throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (!trackSelectorResult.isRendererEnabled(i11) && this.renderersToReset.remove(this.renderers[i11])) {
                this.renderers[i11].reset();
            }
        }
        for (int i12 = 0; i12 < this.renderers.length; i12++) {
            if (trackSelectorResult.isRendererEnabled(i12)) {
                enableRenderer(i12, zArr[i12], j11);
            }
        }
        readingPeriod.allRenderersInCorrectState = true;
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j11, boolean z11, boolean z12) throws ExoPlaybackException {
        stopRenderers();
        updateRebufferingState(false, true);
        if (z12 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder next = playingPeriod;
        while (next != null && !mediaPeriodId.equals(next.info.f2934id)) {
            next = next.getNext();
        }
        if (z11 || playingPeriod != next || (next != null && next.toRendererTime(j11) < 0)) {
            for (int i11 = 0; i11 < this.renderers.length; i11++) {
                disableRenderer(i11);
            }
            if (next != null) {
                while (this.queue.getPlayingPeriod() != next) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(next);
                next.setRendererOffset(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                enableRenderers();
            }
        }
        if (next != null) {
            this.queue.removeAfter(next);
            if (!next.prepared) {
                next.info = next.info.copyWithStartPositionUs(j11);
            } else if (next.hasEnabledTracks) {
                j11 = next.mediaPeriod.seekToUs(j11);
                next.mediaPeriod.discardBuffer(j11 - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j11);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j11);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j11;
    }
}
