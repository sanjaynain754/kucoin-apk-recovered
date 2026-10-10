package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.capability.PreviewCapabilitiesImpl;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class Preview extends UseCase {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final Executor DEFAULT_SURFACE_PROVIDER_EXECUTOR = CameraXExecutors.mainThreadExecutor();
    private static final String TAG = "Preview";
    private SurfaceEdge mCameraEdge;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;

    @VisibleForTesting
    SurfaceRequest mCurrentSurfaceRequest;
    private SurfaceProcessorNode mNode;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private DeferrableSurface mSessionDeferrableSurface;
    private SurfaceProvider mSurfaceProvider;
    private Executor mSurfaceProviderExecutor;

    public static final class Builder implements UseCaseConfig.Builder<Preview, PreviewConfig, Builder>, ImageOutputConfig.Builder<Builder>, ImageInputConfig.Builder<Builder>, ThreadConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Builder setCustomOrderedResolutions(List list) {
            return setCustomOrderedResolutions((List<Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<Preview>) cls);
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(Preview.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setCaptureType(UseCaseConfigFactory.CaptureType.PREVIEW);
            setTargetClass(Preview.class);
            Config.Option<Integer> option = ImageOutputConfig.OPTION_MIRROR_MODE;
            if (((Integer) mutableOptionsBundle.retrieveOption(option, -1)).intValue() == -1) {
                mutableOptionsBundle.insertOption(option, 2);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromConfig(PreviewConfig previewConfig) {
            return new Builder(MutableOptionsBundle.from((Config) previewConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public Preview build() {
            PreviewConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.validateConfig(useCaseConfig);
            return new Preview(useCaseConfig);
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public PreviewConfig getUseCaseConfig() {
            return new PreviewConfig(OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCustomOrderedResolutions(List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public Builder setDynamicRange(DynamicRange dynamicRange) {
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setHighResolutionDisabled(boolean z11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @ExperimentalMirrorMode
        public Builder setMirrorMode(int i11) {
            if (Build.VERSION.SDK_INT >= 33) {
                getMutableConfig().insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i11));
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setStreamUseCase(StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSurfaceOccupancyPriority(int i11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetAspectRatio(int i11) {
            if (i11 == -1) {
                i11 = 0;
            }
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i11));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(Class<Preview> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + C33820nf.f71144W + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetRotation(int i11) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i11));
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_APP_TARGET_ROTATION, Integer.valueOf(i11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setZslDisabled(boolean z11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z11));
            return this;
        }

        public Builder setPreviewStabilizationEnabled(boolean z11) {
            int i11;
            MutableConfig mutableConfig = getMutableConfig();
            Config.Option<Integer> option = UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE;
            if (z11) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            mutableConfig.insertOption(option, Integer.valueOf(i11));
            return this;
        }

        public Builder setTargetFrameRate(Range<Integer> range) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<PreviewConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final PreviewConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final int DEFAULT_MIRROR_MODE = 2;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 2;

        static {
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            DEFAULT_RESOLUTION_SELECTOR = resolutionSelectorBuild;
            DynamicRange dynamicRange = DynamicRange.UNSPECIFIED;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(2).setTargetAspectRatio(0).setResolutionSelector(resolutionSelectorBuild).setHighResolutionDisabled(true).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public PreviewConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public interface SurfaceProvider {
        void onSurfaceRequested(SurfaceRequest surfaceRequest);
    }

    @UiThread
    public void setSurfaceProvider(Executor executor, SurfaceProvider surfaceProvider) {
        Threads.checkMainThread();
        if (surfaceProvider == null) {
            this.mSurfaceProvider = null;
            notifyInactive();
            return;
        }
        this.mSurfaceProvider = surfaceProvider;
        this.mSurfaceProviderExecutor = executor;
        if (getAttachedSurfaceResolution() != null) {
            updateConfigAndOutput((PreviewConfig) getCurrentConfig(), getAttachedStreamSpec());
            notifyReset();
        }
        notifyActive();
    }

    private void addCameraSurfaceAndErrorListener(androidx.camera.core.impl.SessionConfig.Builder builder, StreamSpec streamSpec) {
        if (this.mSurfaceProvider != null) {
            builder.addSurface(this.mSessionDeferrableSurface, streamSpec.getDynamicRange(), getPhysicalCameraId(), getMirrorModeInternal());
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.p0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                Preview.m1876a(this.f1752a, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builder.setErrorListener(closeableErrorListener2);
    }

    private void clearPipeline() {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mSessionDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mSessionDeferrableSurface = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.mNode;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.mNode = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        SurfaceRequest surfaceRequest = this.mCurrentSurfaceRequest;
        if (surfaceRequest != null) {
            surfaceRequest.clearTransformationInfoListener();
        }
        this.mCurrentSurfaceRequest = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public SurfaceEdge getCameraEdge() {
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> getDefaultConfig(boolean z11, UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z11) {
            config = Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(C1100n.m2002a(new Object[]{this.mSessionConfigBuilder.build()}));
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec, StreamSpec streamSpec2) {
        Logger.m1866d(TAG, "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + streamSpec + ", secondaryStreamSpec " + streamSpec2);
        updateConfigAndOutput((PreviewConfig) getCurrentConfig(), streamSpec);
        return streamSpec;
    }

    public String toString() {
        return "Preview:" + getName();
    }

    @MainThread
    public Preview(PreviewConfig previewConfig) {
        super(previewConfig);
        this.mSurfaceProviderExecutor = DEFAULT_SURFACE_PROVIDER_EXECUTOR;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1876a(Preview preview, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (preview.getCamera() == null) {
            return;
        }
        preview.updateConfigAndOutput((PreviewConfig) preview.getCurrentConfig(), preview.getAttachedStreamSpec());
        preview.notifyReset();
    }

    @MainThread
    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(PreviewConfig previewConfig, StreamSpec streamSpec) {
        boolean z11;
        Threads.checkMainThread();
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        final CameraInternal cameraInternal = camera;
        clearPipeline();
        if (this.mCameraEdge == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        boolean hasTransform = cameraInternal.getHasTransform();
        Rect cropRect = getCropRect(streamSpec.getResolution());
        Objects.requireNonNull(cropRect);
        this.mCameraEdge = new SurfaceEdge(1, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, cropRect, getRelativeRotation(cameraInternal, isMirroringRequired(cameraInternal)), getAppTargetRotation(), shouldMirror(cameraInternal));
        CameraEffect effect = getEffect();
        if (effect != null) {
            this.mNode = new SurfaceProcessorNode(cameraInternal, effect.createSurfaceProcessorInternal());
            this.mCameraEdge.addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1745b.notifyReset();
                }
            });
            OutConfig outConfigM2052of = OutConfig.m2052of(this.mCameraEdge);
            SurfaceEdge surfaceEdge = this.mNode.transform(SurfaceProcessorNode.AbstractC1107In.m2034of(this.mCameraEdge, Collections.singletonList(outConfigM2052of))).get(outConfigM2052of);
            Objects.requireNonNull(surfaceEdge);
            surfaceEdge.addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.o0
                @Override // java.lang.Runnable
                public final void run() {
                    Preview preview = this.f1748b;
                    preview.onAppEdgeInvalidated(preview.mCameraEdge, cameraInternal);
                }
            });
            this.mCurrentSurfaceRequest = surfaceEdge.createSurfaceRequest(cameraInternal);
            this.mSessionDeferrableSurface = this.mCameraEdge.getDeferrableSurface();
        } else {
            this.mCameraEdge.addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1745b.notifyReset();
                }
            });
            SurfaceRequest surfaceRequestCreateSurfaceRequest = this.mCameraEdge.createSurfaceRequest(cameraInternal);
            this.mCurrentSurfaceRequest = surfaceRequestCreateSurfaceRequest;
            this.mSessionDeferrableSurface = surfaceRequestCreateSurfaceRequest.getDeferrableSurface();
        }
        if (this.mSurfaceProvider != null) {
            sendSurfaceRequest();
        }
        androidx.camera.core.impl.SessionConfig.Builder builderCreateFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(previewConfig, streamSpec.getResolution());
        builderCreateFrom.setSessionType(streamSpec.getSessionType());
        applyExpectedFrameRateRange(builderCreateFrom, streamSpec);
        builderCreateFrom.setPreviewStabilization(previewConfig.getPreviewStabilizationMode());
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        addCameraSurfaceAndErrorListener(builderCreateFrom, streamSpec);
        return builderCreateFrom;
    }

    private Rect getCropRect(Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public static PreviewCapabilities getPreviewCapabilities(CameraInfo cameraInfo) {
        return PreviewCapabilitiesImpl.from(cameraInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void onAppEdgeInvalidated(SurfaceEdge surfaceEdge, CameraInternal cameraInternal) {
        Threads.checkMainThread();
        if (cameraInternal == getCamera()) {
            surfaceEdge.invalidate();
        }
    }

    private void sendSurfaceRequest() {
        sendTransformationInfoIfReady();
        final SurfaceProvider surfaceProvider = (SurfaceProvider) Preconditions.checkNotNull(this.mSurfaceProvider);
        final SurfaceRequest surfaceRequest = (SurfaceRequest) Preconditions.checkNotNull(this.mCurrentSurfaceRequest);
        this.mSurfaceProviderExecutor.execute(new Runnable() { // from class: androidx.camera.core.m0
            @Override // java.lang.Runnable
            public final void run() {
                surfaceProvider.onSurfaceRequested(surfaceRequest);
            }
        });
    }

    private void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera != null && surfaceEdge != null) {
            surfaceEdge.updateTransformation(getRelativeRotation(camera, isMirroringRequired(camera)), getAppTargetRotation());
        }
    }

    private boolean shouldMirror(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal)) {
            return true;
        }
        return false;
    }

    private void updateConfigAndOutput(PreviewConfig previewConfig, StreamSpec streamSpec) {
        androidx.camera.core.impl.SessionConfig.Builder builderCreatePipeline = createPipeline(previewConfig, streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        updateSessionConfig(C1100n.m2002a(new Object[]{builderCreatePipeline.build()}));
    }

    public DynamicRange getDynamicRange() {
        if (!getCurrentConfig().hasDynamicRange()) {
            return Defaults.DEFAULT_DYNAMIC_RANGE;
        }
        return getCurrentConfig().getDynamicRange();
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public ResolutionSelector getResolutionSelector() {
        return ((ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    @VisibleForTesting
    public SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    public Range<Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isPreviewStabilizationEnabled() {
        if (getCurrentConfig().getPreviewStabilizationMode() == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
        clearPipeline();
    }

    public void setTargetRotation(int i11) {
        if (setTargetRotationInternal(i11)) {
            sendTransformationInfoIfReady();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }

    @UiThread
    public void setSurfaceProvider(SurfaceProvider surfaceProvider) {
        setSurfaceProvider(DEFAULT_SURFACE_PROVIDER_EXECUTOR, surfaceProvider);
    }
}
