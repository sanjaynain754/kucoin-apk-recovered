package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnknownNull;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener<T>> childSources = new HashMap<>();

    @Nullable
    private Handler eventHandler;

    @Nullable
    private TransferListener mediaTransferListener;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        private DrmSessionEventListener.EventDispatcher drmEventDispatcher;

        /* JADX INFO: renamed from: id */
        @UnknownNull
        private final T f3322id;
        private MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;

        public ForwardingEventListener(T t11) {
            this.mediaSourceEventDispatcher = CompositeMediaSource.this.createEventDispatcher(null);
            this.drmEventDispatcher = CompositeMediaSource.this.createDrmEventDispatcher(null);
            this.f3322id = t11;
        }

        private boolean maybeUpdateEventDispatcher(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.f3322id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.f3322id, i11);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                this.mediaSourceEventDispatcher = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.drmEventDispatcher;
            if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.drmEventDispatcher = CompositeMediaSource.this.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            return true;
        }

        private MediaLoadData maybeUpdateMediaLoadData(MediaLoadData mediaLoadData, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f3322id, mediaLoadData.mediaStartTimeMs, mediaPeriodId);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f3322id, mediaLoadData.mediaEndTimeMs, mediaPeriodId);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysLoaded();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRemoved();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRestored();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i12) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionAcquired(i12);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionManagerError(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionReleased();
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCanceled(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCompleted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z11) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId), iOException, z11);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadStarted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i11, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }
    }

    public abstract void onChildSourceInfoRefreshed(@UnknownNull T t11, MediaSource mediaSource, Timeline timeline);

    public static final class MediaSourceAndListener<T> {
        public final MediaSource.MediaSourceCaller caller;
        public final CompositeMediaSource<T>.ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, CompositeMediaSource<T>.ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    public final void disableChildSource(@UnknownNull T t11) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.get(t11));
        mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    public void disableInternal() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    public final void enableChildSource(@UnknownNull T t11) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.get(t11));
        mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    public void enableInternal() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener<T>> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    public final void prepareChildSource(@UnknownNull final T t11, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t11));
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.source.b
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline) {
                this.f3341b.onChildSourceInfoRefreshed(t11, mediaSource2, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t11);
        this.childSources.put(t11, new MediaSourceAndListener<>(mediaSource, mediaSourceCaller, forwardingEventListener));
        mediaSource.addEventListener((Handler) Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.addDrmEventListener((Handler) Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, getPlayerId());
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = Util.createHandlerForCurrentLooper();
    }

    public final void releaseChildSource(@UnknownNull T t11) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.remove(t11));
        mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
        mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    public void releaseSourceInternal() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
    }

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@UnknownNull T t11, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public int getWindowIndexForChildWindowIndex(@UnknownNull T t11, int i11) {
        return i11;
    }

    public long getMediaTimeForChildMediaTime(@UnknownNull T t11, long j11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return j11;
    }
}
