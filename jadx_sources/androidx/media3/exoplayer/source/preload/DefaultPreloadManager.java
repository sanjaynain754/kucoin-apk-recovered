package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.C3455u0;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.PlaybackLooperProvider;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DefaultPreloadManager extends BasePreloadManager<Integer> {
    private final boolean deprecatedConstructorCalled;
    private final Handler preloadHandler;
    private final PlaybackLooperProvider preloadLooperProvider;
    private final PreloadMediaSource.Factory preloadMediaSourceFactory;
    private final RendererCapabilitiesList rendererCapabilitiesList;
    private final TrackSelector trackSelector;

    public static final class Builder extends BasePreloadManager.BuilderBase<Integer> {
        private Supplier<BandwidthMeter> bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private final Context context;
        private Supplier<LoadControl> loadControlSupplier;
        private PlaybackLooperProvider preloadLooperProvider;
        private Supplier<RenderersFactory> renderersFactorySupplier;
        private TrackSelector.Factory trackSelectorFactory;

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.Builder(this.context));
        }

        public Builder(final Context context, TargetPreloadStatusControl<Integer> targetPreloadStatusControl) {
            super(new RankingDataComparator(), targetPreloadStatusControl, Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.source.preload.l
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultPreloadManager.Builder.m3444d(context);
                }
            }));
            this.context = context;
            this.preloadLooperProvider = new PlaybackLooperProvider();
            this.trackSelectorFactory = new TrackSelector.Factory() { // from class: androidx.media3.exoplayer.source.preload.m
                @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
                public final TrackSelector createTrackSelector(Context context2) {
                    return new DefaultTrackSelector(context2);
                }
            };
            this.bandwidthMeterSupplier = new Supplier() { // from class: androidx.media3.exoplayer.source.preload.n
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            };
            this.renderersFactorySupplier = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.source.preload.o
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultPreloadManager.Builder.m3445e(context);
                }
            });
            this.loadControlSupplier = Suppliers.memoize(new C3455u0());
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ MediaSource.Factory m3444d(Context context) {
            return new DefaultMediaSourceFactory(context);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ RenderersFactory m3445e(Context context) {
            return new DefaultRenderersFactory(context);
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public BasePreloadManager<Integer> build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new DefaultPreloadManager(this);
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            return builder.setMediaSourceFactory(this.mediaSourceFactorySupplier.get()).setBandwidthMeter(this.bandwidthMeterSupplier.get()).setRenderersFactory(this.renderersFactorySupplier.get()).setLoadControl(this.loadControlSupplier.get()).setPlaybackLooperProvider(this.preloadLooperProvider).setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context)).build();
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.bandwidthMeterSupplier = new Supplier() { // from class: androidx.media3.exoplayer.source.preload.k
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultPreloadManager.Builder.m3441a(bandwidthMeter);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.loadControlSupplier = new Supplier() { // from class: androidx.media3.exoplayer.source.preload.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultPreloadManager.Builder.m3446f(loadControl);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: androidx.media3.exoplayer.source.preload.p
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultPreloadManager.Builder.m3443c(factory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPreloadLooper(Looper looper) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.preloadLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.renderersFactorySupplier = new Supplier() { // from class: androidx.media3.exoplayer.source.preload.j
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultPreloadManager.Builder.m3447g(renderersFactory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTrackSelectorFactory(TrackSelector.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.trackSelectorFactory = factory;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ BandwidthMeter m3441a(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ MediaSource.Factory m3443c(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ LoadControl m3446f(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ RenderersFactory m3447g(RenderersFactory renderersFactory) {
            return renderersFactory;
        }
    }

    public static final class RankingDataComparator implements Comparator<Integer> {
        public int currentPlayingIndex = -1;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.currentPlayingIndex), Math.abs(num2.intValue() - this.currentPlayingIndex));
        }
    }

    public final class SourcePreloadControl implements PreloadMediaSource.PreloadControl {
        private SourcePreloadControl() {
        }

        private boolean continueOrCompletePreloading(PreloadMediaSource preloadMediaSource, Predicate<Status> predicate, boolean z11) {
            TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = DefaultPreloadManager.this.getTargetPreloadStatus(preloadMediaSource);
            if (targetPreloadStatus == null) {
                DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
                return false;
            }
            if (predicate.apply((Status) Assertions.checkNotNull((Status) targetPreloadStatus))) {
                return true;
            }
            if (z11) {
                DefaultPreloadManager.this.clearSourceInternal(preloadMediaSource);
            }
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
            return false;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, final long j11) {
            return continueOrCompletePreloading(preloadMediaSource, new Predicate() { // from class: androidx.media3.exoplayer.source.preload.s
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.m3448a(j11, (DefaultPreloadManager.Status) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadError(preloadException, preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new Predicate() { // from class: androidx.media3.exoplayer.source.preload.r
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.m3450c((DefaultPreloadManager.Status) obj);
                }
            }, true);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new Predicate() { // from class: androidx.media3.exoplayer.source.preload.q
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.m3449b((DefaultPreloadManager.Status) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m3448a(long j11, Status status) {
            if (status.getStage() == 2 && status.getValue() > Util.usToMs(j11)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m3449b(Status status) {
            if (status.getStage() > 1) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m3450c(Status status) {
            if (status.getStage() > 0) {
                return true;
            }
            return false;
        }
    }

    public static class Status implements TargetPreloadStatusControl.PreloadStatus {
        public static final int STAGE_LOADED_FOR_DURATION_MS = 2;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_TRACKS_SELECTED = 1;
        private final int stage;
        private final long value;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        public Status(int i11, long j11) {
            this.stage = i11;
            this.value = j11;
        }

        @Override // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public int getStage() {
            return this.stage;
        }

        @Override // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public long getValue() {
            return this.value;
        }

        public Status(int i11) {
            this(i11, C2711C.TIME_UNSET);
        }
    }

    private DefaultPreloadManager(Builder builder) {
        super(new RankingDataComparator(), builder.targetPreloadStatusControl, builder.mediaSourceFactorySupplier.get());
        DefaultRendererCapabilitiesList defaultRendererCapabilitiesListCreateRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory((RenderersFactory) builder.renderersFactorySupplier.get()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = defaultRendererCapabilitiesListCreateRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        TrackSelector trackSelectorCreateTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = trackSelectorCreateTrackSelector;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
        trackSelectorCreateTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.source.preload.h
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DefaultPreloadManager.m3439g();
            }
        }, bandwidthMeter);
        Looper looperObtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory(builder.mediaSourceFactorySupplier.get(), new SourcePreloadControl(), trackSelectorCreateTrackSelector, bandwidthMeter, defaultRendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), ((LoadControl) builder.loadControlSupplier.get()).getAllocator(), looperObtainLooper);
        this.preloadHandler = Util.createHandler(looperObtainLooper, null);
        this.deprecatedConstructorCalled = false;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m3440h(DefaultPreloadManager defaultPreloadManager) {
        defaultPreloadManager.rendererCapabilitiesList.release();
        if (!defaultPreloadManager.deprecatedConstructorCalled) {
            defaultPreloadManager.trackSelector.release();
        }
        defaultPreloadManager.preloadLooperProvider.releaseLooper();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void clearSourceInternal(MediaSource mediaSource) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).clear();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return this.preloadMediaSourceFactory.createMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void preloadSourceInternal(MediaSource mediaSource, long j11) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).preload(j11);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseInternal() {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.g
            @Override // java.lang.Runnable
            public final void run() {
                DefaultPreloadManager.m3440h(this.f3373b);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseSourceInternal(MediaSource mediaSource) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).releasePreloadMediaSource();
    }

    public void setCurrentPlayingIndex(int i11) {
        ((RankingDataComparator) this.rankingDataComparator).currentPlayingIndex = i11;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3439g() {
    }

    @Deprecated
    public DefaultPreloadManager(TargetPreloadStatusControl<Integer> targetPreloadStatusControl, MediaSource.Factory factory, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilitiesList.Factory factory2, Allocator allocator, Looper looper) {
        super(new RankingDataComparator(), targetPreloadStatusControl, factory);
        RendererCapabilitiesList rendererCapabilitiesListCreateRendererCapabilitiesList = factory2.createRendererCapabilitiesList();
        this.rendererCapabilitiesList = rendererCapabilitiesListCreateRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = new PlaybackLooperProvider(looper);
        this.preloadLooperProvider = playbackLooperProvider;
        this.trackSelector = trackSelector;
        Looper looperObtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory(factory, new SourcePreloadControl(), trackSelector, bandwidthMeter, rendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), allocator, looperObtainLooper);
        this.preloadHandler = Util.createHandler(looperObtainLooper, null);
        this.deprecatedConstructorCalled = true;
    }
}
