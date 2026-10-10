package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C2711C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @UnstableApi
    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z11);

        @Deprecated
        void setAudioSessionId(int i11);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z11);

        @Deprecated
        void setVolume(float f11);
    }

    public static final class Builder {
        Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        Supplier<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier<LoadControl> loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        Supplier<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;

        @Nullable
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        Supplier<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(final Context context) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.f0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3025b(context);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.g0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3028e(context);
                }
            });
        }

        @UnstableApi
        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.k0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3040q(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.l0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3027d(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ RenderersFactory m3025b(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ MediaSource.Factory m3027d(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ MediaSource.Factory m3028e(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ RenderersFactory m3034k(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ TrackSelector m3044u(Context context) {
            return new DefaultTrackSelector(context);
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.suitableOutputChecker == null && Util.SDK_INT >= 35 && this.suppressPlaybackOnUnsuitableOutput) {
                this.suitableOutputChecker = new DefaultSuitableOutputChecker(this.context, new Handler(this.looper));
            }
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder experimentalSetForegroundModeTimeoutMs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new Function() { // from class: androidx.media3.exoplayer.e0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.m3041r(analyticsCollector, (Clock) obj);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new Supplier() { // from class: androidx.media3.exoplayer.o0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3043t(bandwidthMeter);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @VisibleForTesting
        @UnstableApi
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setDetachSurfaceTimeoutMs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setDeviceVolumeControlEnabled(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHandleAudioBecomingNoisy(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new Supplier() { // from class: androidx.media3.exoplayer.d0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3030g(loadControl);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setMaxSeekToPreviousPositionMs(@IntRange(from = 0) long j11) {
            Assertions.checkArgument(j11 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: androidx.media3.exoplayer.a1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3031h(factory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPauseAtEndOfMediaItems(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @CanIgnoreReturnValue
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @UnstableApi
        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPriority(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setReleaseTimeoutMs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new Supplier() { // from class: androidx.media3.exoplayer.h0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3024a(renderersFactory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j11) {
            Assertions.checkArgument(j11 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j11) {
            Assertions.checkArgument(j11 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSkipSilenceEnabled(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z11;
            return this;
        }

        @VisibleForTesting
        @CanIgnoreReturnValue
        @RequiresApi(35)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @UnstableApi
        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            Assertions.checkState(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new Supplier() { // from class: androidx.media3.exoplayer.z0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3036m(trackSelector);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setUseLazyPreparation(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setUsePlatformDiagnostics(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setVideoChangeFrameRateStrategy(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setVideoScalingMode(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWakeMode(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i11;
            return this;
        }

        @UnstableApi
        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.x0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3034k(context);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.y0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3026c(factory);
                }
            });
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.i0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3029f(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.j0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3033j(factory);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.m0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3037n(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.n0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3039p(factory);
                }
            }, (Supplier<TrackSelector>) new Supplier() { // from class: androidx.media3.exoplayer.p0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3042s(trackSelector);
                }
            }, (Supplier<LoadControl>) new Supplier() { // from class: androidx.media3.exoplayer.q0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3045v(loadControl);
                }
            }, (Supplier<BandwidthMeter>) new Supplier() { // from class: androidx.media3.exoplayer.r0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3032i(bandwidthMeter);
                }
            }, (Function<Clock, AnalyticsCollector>) new Function() { // from class: androidx.media3.exoplayer.s0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.m3038o(analyticsCollector, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, (Supplier<TrackSelector>) new Supplier() { // from class: androidx.media3.exoplayer.t0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m3044u(context);
                }
            }, new C3455u0(), (Supplier<BandwidthMeter>) new Supplier() { // from class: androidx.media3.exoplayer.v0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (Function<Clock, AnalyticsCollector>) new Function() { // from class: androidx.media3.exoplayer.w0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2, Supplier<TrackSelector> supplier3, Supplier<LoadControl> supplier4, Supplier<BandwidthMeter> supplier5, Function<Clock, AnalyticsCollector> function) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ RenderersFactory m3024a(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ MediaSource.Factory m3026c(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ RenderersFactory m3029f(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ LoadControl m3030g(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ MediaSource.Factory m3031h(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ BandwidthMeter m3032i(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ MediaSource.Factory m3033j(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ TrackSelector m3036m(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ RenderersFactory m3037n(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ MediaSource.Factory m3039p(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ RenderersFactory m3040q(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ TrackSelector m3042s(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: renamed from: t */
        public static /* synthetic */ BandwidthMeter m3043t(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ LoadControl m3045v(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ AnalyticsCollector m3038o(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ AnalyticsCollector m3041r(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }
    }

    @UnstableApi
    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z11);

        @Deprecated
        void setDeviceVolume(int i11);
    }

    @UnstableApi
    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @UnstableApi
    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(@Nullable Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(@Nullable TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i11);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i11);

        @Deprecated
        void setVideoSurface(@Nullable Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @UnstableApi
    void addMediaSource(int i11, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i11, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @UnstableApi
    @Deprecated
    AudioComponent getAudioComponent();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    Clock getClock();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Nullable
    @UnstableApi
    @Deprecated
    DeviceComponent getDeviceComponent();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @UnstableApi
    Renderer getRenderer(int i11);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i11);

    @UnstableApi
    SeekParameters getSeekParameters();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Nullable
    @UnstableApi
    @Deprecated
    TextComponent getTextComponent();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    @Deprecated
    VideoComponent getVideoComponent();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z11, boolean z12);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i11, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i11, int i12, List<MediaItem> list);

    @UnstableApi
    void setAudioSessionId(int i11);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void setForegroundMode(boolean z11);

    void setHandleAudioBecomingNoisy(boolean z11);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j11);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z11);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i11, long j11);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z11);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z11);

    @RequiresApi(23)
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i11);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z11);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i11);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i11);

    void setWakeMode(int i11);

    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(C2711C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j11) {
            this.targetPreloadDurationUs = j11;
        }
    }

    @UnstableApi
    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z11) {
        }

        default void onSleepingForOffloadChanged(boolean z11) {
        }
    }
}
