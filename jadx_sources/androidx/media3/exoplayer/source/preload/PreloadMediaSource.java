package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class PreloadMediaSource extends WrappingMediaSource {
    private static final long CHECK_FOR_PRELOAD_ERROR_INTERVAL_MS = 100;
    private static final String TAG = "PreloadMediaSource";
    private final Allocator allocator;
    private final BandwidthMeter bandwidthMeter;
    private boolean onSourcePreparedNotified;
    private boolean onUsedByPlayerNotified;

    @Nullable
    private Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> playingPreloadedMediaPeriodAndId;
    private boolean preloadCalled;
    private final PreloadControl preloadControl;
    private final Handler preloadHandler;

    @Nullable
    private Pair<PreloadMediaPeriod, MediaPeriodKey> preloadingMediaPeriodAndKey;
    private boolean prepareChildSourceCalled;
    private final Handler releaseHandler;
    private final RendererCapabilities[] rendererCapabilities;
    private long startPositionUs;

    @Nullable
    private Timeline timeline;
    private final TrackSelector trackSelector;

    public static final class Factory implements MediaSource.Factory {
        private final Allocator allocator;
        private final BandwidthMeter bandwidthMeter;
        private final MediaSource.Factory mediaSourceFactory;
        private final PreloadControl preloadControl;
        private final Looper preloadLooper;
        private final RendererCapabilities[] rendererCapabilities;
        private final TrackSelector trackSelector;

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public PreloadMediaSource createMediaSource(MediaItem mediaItem) {
            return new PreloadMediaSource(this.mediaSourceFactory.createMediaSource(mediaItem), this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return this.mediaSourceFactory.getSupportedTypes();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.mediaSourceFactory.setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        public Factory(MediaSource.Factory factory, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, Allocator allocator, Looper looper) {
            this.mediaSourceFactory = factory;
            this.preloadControl = preloadControl;
            this.trackSelector = trackSelector;
            this.bandwidthMeter = bandwidthMeter;
            this.rendererCapabilities = (RendererCapabilities[]) Arrays.copyOf(rendererCapabilitiesArr, rendererCapabilitiesArr.length);
            this.allocator = allocator;
            this.preloadLooper = looper;
        }

        public PreloadMediaSource createMediaSource(MediaSource mediaSource) {
            return new PreloadMediaSource(mediaSource, this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }
    }

    public static class MediaPeriodKey {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final Long startPositionUs;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.mediaPeriodId, mediaPeriodKey.mediaPeriodId) && this.startPositionUs.equals(mediaPeriodKey.startPositionUs);
        }

        public int hashCode() {
            int iHashCode = (527 + this.mediaPeriodId.periodUid.hashCode()) * 31;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return ((((((iHashCode + mediaPeriodId.adGroupIndex) * 31) + mediaPeriodId.adIndexInAdGroup) * 31) + mediaPeriodId.nextAdGroupIndex) * 31) + this.startPositionUs.intValue();
        }

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j11) {
            this.mediaPeriodId = mediaPeriodId;
            this.startPositionUs = Long.valueOf(j11);
        }
    }

    public class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        private final long periodStartPositionUs;
        private boolean prepared;

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(final MediaPeriod mediaPeriod) {
            this.prepared = true;
            PreloadMediaSource.this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.y
                @Override // java.lang.Runnable
                public final void run() {
                    PreloadMediaSource.PreloadMediaPeriodCallback.m3457b(this.f3389b, mediaPeriod);
                }
            });
        }

        public PreloadMediaPeriodCallback(long j11) {
            this.periodStartPositionUs = j11;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3456a(PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod) {
            if (PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            long bufferedPositionUs = mediaPeriod.getBufferedPositionUs();
            boolean z11 = preloadMediaPeriodCallback.prepared;
            if (z11 && bufferedPositionUs == Long.MIN_VALUE) {
                PreloadMediaSource.this.preloadControl.onLoadedToTheEndOfSource(PreloadMediaSource.this);
                PreloadMediaSource.this.stopPreloading();
            } else if (!z11 || PreloadMediaSource.this.preloadControl.onContinueLoadingRequested(PreloadMediaSource.this, bufferedPositionUs - preloadMediaPeriodCallback.periodStartPositionUs)) {
                preloadMediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadMediaPeriodCallback.periodStartPositionUs).build());
            } else {
                PreloadMediaSource.this.stopPreloading();
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m3457b(PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod) {
            TrackSelectorResult trackSelectorResultSelectTracks;
            if (PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            try {
                trackSelectorResultSelectTracks = PreloadMediaSource.this.trackSelector.selectTracks(PreloadMediaSource.this.rendererCapabilities, preloadMediaPeriod.getTrackGroups(), ((MediaPeriodKey) ((Pair) Assertions.checkNotNull(PreloadMediaSource.this.preloadingMediaPeriodAndKey)).second).mediaPeriodId, (Timeline) Assertions.checkNotNull(PreloadMediaSource.this.timeline));
            } catch (ExoPlaybackException e11) {
                Log.m2958e(PreloadMediaSource.TAG, "Failed to select tracks", e11);
                trackSelectorResultSelectTracks = null;
            }
            if (trackSelectorResultSelectTracks == null) {
                PreloadMediaSource.this.stopPreloading();
                return;
            }
            preloadMediaPeriod.selectTracksForPreloading(trackSelectorResultSelectTracks.selections, preloadMediaPeriodCallback.periodStartPositionUs);
            if (PreloadMediaSource.this.preloadControl.onTracksSelected(PreloadMediaSource.this)) {
                preloadMediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadMediaPeriodCallback.periodStartPositionUs).build());
            } else {
                PreloadMediaSource.this.stopPreloading();
            }
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(final MediaPeriod mediaPeriod) {
            PreloadMediaSource.this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.z
                @Override // java.lang.Runnable
                public final void run() {
                    PreloadMediaSource.PreloadMediaPeriodCallback.m3456a(this.f3391b, mediaPeriod);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3451b(PreloadMediaSource preloadMediaSource) {
        preloadMediaSource.preloadCalled = false;
        preloadMediaSource.startPositionUs = C2711C.TIME_UNSET;
        preloadMediaSource.onSourcePreparedNotified = false;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = preloadMediaSource.preloadingMediaPeriodAndKey;
        if (pair != null) {
            preloadMediaSource.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            preloadMediaSource.preloadingMediaPeriodAndKey = null;
        }
        preloadMediaSource.releaseSourceInternal();
        preloadMediaSource.preloadHandler.removeCallbacksAndMessages(null);
        preloadMediaSource.releaseHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3454e(PreloadMediaSource preloadMediaSource, long j11) {
        preloadMediaSource.preloadCalled = true;
        preloadMediaSource.startPositionUs = j11;
        preloadMediaSource.onSourcePreparedNotified = false;
        if (preloadMediaSource.isUsedByPlayer()) {
            preloadMediaSource.onUsedByPlayer();
            return;
        }
        preloadMediaSource.setPlayerId(PlayerId.UNSET);
        preloadMediaSource.prepareSourceInternal(preloadMediaSource.bandwidthMeter.getTransferListener());
        preloadMediaSource.checkForPreloadError();
    }

    private PreloadMediaSource(MediaSource mediaSource, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, Allocator allocator, Looper looper) {
        super(mediaSource);
        this.preloadControl = preloadControl;
        this.trackSelector = trackSelector;
        this.bandwidthMeter = bandwidthMeter;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.allocator = allocator;
        this.preloadHandler = Util.createHandler(looper, null);
        this.releaseHandler = Util.createHandler(looper, null);
        this.startPositionUs = C2711C.TIME_UNSET;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3452c(PreloadMediaSource preloadMediaSource) {
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = preloadMediaSource.preloadingMediaPeriodAndKey;
        if (pair != null) {
            preloadMediaSource.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            preloadMediaSource.preloadingMediaPeriodAndKey = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid) && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup && mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex;
    }

    private void onUsedByPlayer() {
        this.preloadControl.onUsedByPlayer(this);
        stopPreloading();
        this.onUsedByPlayerNotified = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPreloading() {
        this.preloadHandler.removeCallbacksAndMessages(null);
    }

    public void clear() {
        Util.postOrRun(this.preloadHandler, new Runnable() { // from class: androidx.media3.exoplayer.source.preload.u
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.m3452c(this.f3383b);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public PreloadMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j11);
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) ((Pair) Assertions.checkNotNull(this.preloadingMediaPeriodAndKey)).first;
            if (isUsedByPlayer()) {
                this.preloadingMediaPeriodAndKey = null;
                this.playingPreloadedMediaPeriodAndId = new Pair<>(preloadMediaPeriod, mediaPeriodId);
            }
            return preloadMediaPeriod;
        }
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair2 = this.preloadingMediaPeriodAndKey;
        if (pair2 != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) ((Pair) Assertions.checkNotNull(pair2)).first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j11));
        if (!isUsedByPlayer()) {
            this.preloadingMediaPeriodAndKey = new Pair<>(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair = this.playingPreloadedMediaPeriodAndId;
        return (pair == null || !mediaPeriodIdEqualsWithoutWindowSequenceNumber(mediaPeriodId, (MediaSource.MediaPeriodId) ((Pair) Assertions.checkNotNull(pair)).second)) ? mediaPeriodId : (MediaSource.MediaPeriodId) ((Pair) Assertions.checkNotNull(this.playingPreloadedMediaPeriodAndId)).second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(final Timeline timeline) {
        this.timeline = timeline;
        refreshSourceInfo(timeline);
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.x
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.m3455f(this.f3387b, timeline);
            }
        });
    }

    public void preload(final long j11) {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.w
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.m3454e(this.f3385b, j11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair == null || preloadMediaPeriod != ((Pair) Assertions.checkNotNull(pair)).first) {
            Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
            if (pair2 != null && preloadMediaPeriod == ((Pair) Assertions.checkNotNull(pair2)).first) {
                this.playingPreloadedMediaPeriodAndId = null;
            }
        } else {
            this.preloadingMediaPeriodAndKey = null;
        }
        this.mediaSource.releasePeriod(preloadMediaPeriod.mediaPeriod);
    }

    public void releasePreloadMediaSource() {
        this.releaseHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.t
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.m3451b(this.f3382b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForPreloadError() {
        try {
            maybeThrowSourceInfoRefreshError();
            Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
            if (pair != null) {
                PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair.first;
                if (!preloadMediaPeriod.prepared) {
                    preloadMediaPeriod.maybeThrowPrepareError();
                } else {
                    preloadMediaPeriod.maybeThrowStreamError();
                }
            }
            this.preloadHandler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3384b.checkForPreloadError();
                }
            }, CHECK_FOR_PRELOAD_ERROR_INTERVAL_MS);
        } catch (IOException e11) {
            this.preloadControl.onPreloadError(new PreloadException(getMediaItem(), null, e11), this);
            stopPreloading();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3455f(PreloadMediaSource preloadMediaSource, Timeline timeline) {
        if (!preloadMediaSource.isUsedByPlayer() && !preloadMediaSource.onSourcePreparedNotified) {
            preloadMediaSource.onSourcePreparedNotified = true;
            if (!preloadMediaSource.preloadControl.onSourcePrepared(preloadMediaSource)) {
                preloadMediaSource.stopPreloading();
            } else {
                Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(new Timeline.Window(), new Timeline.Period(), 0, preloadMediaSource.startPositionUs);
                preloadMediaSource.createPeriod(new MediaSource.MediaPeriodId(periodPositionUs.first), preloadMediaSource.allocator, ((Long) periodPositionUs.second).longValue()).preload(preloadMediaSource.new PreloadMediaPeriodCallback(((Long) periodPositionUs.second).longValue()), ((Long) periodPositionUs.second).longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return prepareSourceCalled();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (isUsedByPlayer() && !this.onUsedByPlayerNotified) {
            onUsedByPlayer();
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            onChildSourceInfoRefreshed(timeline);
        } else if (!this.prepareChildSourceCalled) {
            this.prepareChildSourceCalled = true;
            prepareChildSource();
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        if (!isUsedByPlayer()) {
            this.onUsedByPlayerNotified = false;
            if (!this.preloadCalled) {
                this.timeline = null;
                this.prepareChildSourceCalled = false;
                super.releaseSourceInternal();
            }
        }
    }

    public interface PreloadControl {
        boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, long j11);

        void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource);

        boolean onSourcePrepared(PreloadMediaSource preloadMediaSource);

        boolean onTracksSelected(PreloadMediaSource preloadMediaSource);

        void onUsedByPlayer(PreloadMediaSource preloadMediaSource);

        default void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
        }
    }
}
