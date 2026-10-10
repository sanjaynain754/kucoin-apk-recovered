package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Supplier;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class BasePreloadManager<T> {
    private final Handler applicationHandler;
    private final ListenerSet<Listener> listeners;
    private final Object lock = new Object();
    private final Map<MediaItem, BasePreloadManager<T>.MediaSourceHolder> mediaItemMediaSourceHolderMap;
    private final MediaSource.Factory mediaSourceFactory;
    protected final Comparator<T> rankingDataComparator;

    @GuardedBy("lock")
    private final PriorityQueue<BasePreloadManager<T>.MediaSourceHolder> sourceHolderPriorityQueue;
    private final TargetPreloadStatusControl<T> targetPreloadStatusControl;

    @Nullable
    @GuardedBy("lock")
    private TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;

    public interface Listener {
        void onCompleted(MediaItem mediaItem);

        void onError(PreloadException preloadException);
    }

    public final class MediaSourceHolder implements Comparable<BasePreloadManager<T>.MediaSourceHolder> {
        public final MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public MediaSourceHolder(BasePreloadManager basePreloadManager, MediaSource mediaSource, T t11) {
            this(mediaSource, t11, C2711C.TIME_UNSET);
        }

        public MediaSourceHolder(MediaSource mediaSource, T t11, long j11) {
            this.mediaSource = mediaSource;
            this.rankingData = t11;
            this.startPositionUs = j11;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }

    public final void add(MediaItem mediaItem, T t11) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), t11);
    }

    public abstract void clearSourceInternal(MediaSource mediaSource);

    public abstract void preloadSourceInternal(MediaSource mediaSource, long j11);

    public abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public static abstract class BuilderBase<T> {
        protected Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        protected final Comparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public abstract BasePreloadManager<T> build();

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, Supplier<MediaSource.Factory> supplier) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = supplier;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3434b(BasePreloadManager basePreloadManager, final MediaSource mediaSource) {
        basePreloadManager.listeners.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.a
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((BasePreloadManager.Listener) obj).onCompleted(mediaSource.getMediaItem());
            }
        });
        basePreloadManager.maybeAdvanceToNextSource(mediaSource);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3436d(BasePreloadManager basePreloadManager, final PreloadException preloadException, MediaSource mediaSource) {
        basePreloadManager.listeners.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.b
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((BasePreloadManager.Listener) obj).onError(preloadException);
            }
        });
        basePreloadManager.maybeAdvanceToNextSource(mediaSource);
    }

    @GuardedBy("lock")
    private boolean isPreloading(MediaSource mediaSource) {
        return !this.sourceHolderPriorityQueue.isEmpty() && ((MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeAdvanceToNextSource(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    do {
                        this.sourceHolderPriorityQueue.poll();
                        if (this.sourceHolderPriorityQueue.isEmpty()) {
                            break;
                        }
                    } while (!maybeStartPreloadNextSource());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void add(MediaSource mediaSource, T t11) {
        MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new MediaSourceHolder(this, mediaSourceCreateMediaSourceForPreloading, t11));
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Nullable
    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    @Nullable
    public final TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (!isPreloading(mediaSource)) {
                    return null;
                }
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                this.sourceHolderPriorityQueue.clear();
                this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
                while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.sourceHolderPriorityQueue.poll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPreloadCompleted(final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.m3434b(this.f3366b, mediaSource);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPreloadError(final PreloadException preloadException, final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.m3436d(this.f3370b, preloadException, mediaSource);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPreloadSkipped(final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3368b.maybeAdvanceToNextSource(mediaSource);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reset() {
        Iterator<BasePreloadManager<T>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new ListenerSet<>(handlerCreateHandlerForCurrentOrMainLooper.getLooper(), Clock.DEFAULT, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.source.preload.f
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                BasePreloadManager.m3438f((BasePreloadManager.Listener) obj, flagSet);
            }
        });
        this.mediaItemMediaSourceHolderMap = new HashMap();
        this.sourceHolderPriorityQueue = new PriorityQueue<>();
    }

    @GuardedBy("lock")
    private boolean maybeStartPreloadNextSource() {
        if (shouldStartPreloadingNextSource()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
            TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
            this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
            if (targetPreloadStatus != null) {
                preloadSourceInternal(mediaSourceHolder.mediaSource, mediaSourceHolder.startPositionUs);
                return true;
            }
            clearSourceInternal(mediaSourceHolder.mediaSource);
            return false;
        }
        return false;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() == this.applicationHandler.getLooper()) {
        } else {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    public void removeListener(Listener listener) {
        verifyApplicationThread();
        this.listeners.remove(listener);
    }

    public final boolean remove(MediaSource mediaSource) {
        MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public void releaseInternal() {
    }

    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3438f(Listener listener, FlagSet flagSet) {
    }
}
