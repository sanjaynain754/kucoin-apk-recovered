package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageAnalysis extends UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    public static final int COORDINATE_SYSTEM_SENSOR = 2;
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    private static final int DEFAULT_BACKPRESSURE_STRATEGY = 0;
    private static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
    private static final int DEFAULT_OUTPUT_IMAGE_FORMAT = 1;
    private static final boolean DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED = false;
    private static final int NON_BLOCKING_IMAGE_DEPTH = 4;
    public static final int OUTPUT_IMAGE_FORMAT_NV21 = 3;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    private static final String TAG = "ImageAnalysis";
    private final Object mAnalysisLock;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private DeferrableSurface mDeferrableSurface;

    @GuardedBy("mAnalysisLock")
    ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;

    @GuardedBy("mAnalysisLock")
    private Matrix mSensorToBufferTransformMatrix;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;

    @GuardedBy("mAnalysisLock")
    private Analyzer mSubscribedAnalyzer;

    @GuardedBy("mAnalysisLock")
    private Executor mSubscribedAnalyzerExecutor;

    @GuardedBy("mAnalysisLock")
    private Rect mViewPortCropRect;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface BackpressureStrategy {
    }

    public static final class Builder implements ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder>, UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder>, ImageInputConfig.Builder<Builder> {
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
            return setTargetClass((Class<ImageAnalysis>) cls);
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(ImageAnalysis.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
                setTargetClass(ImageAnalysis.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromConfig(ImageAnalysisConfig imageAnalysisConfig) {
            return new Builder(MutableOptionsBundle.from((Config) imageAnalysisConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public ImageAnalysis build() {
            ImageAnalysisConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.validateConfig(useCaseConfig);
            return new ImageAnalysis(useCaseConfig);
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public ImageAnalysisConfig getUseCaseConfig() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
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
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setDynamicRange(DynamicRange dynamicRange) {
            if (!Objects.equals(DynamicRange.SDR, dynamicRange)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
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
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setMirrorMode(int i11) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
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
        public Builder setTargetClass(Class<ImageAnalysis> cls) {
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
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setZslDisabled(boolean z11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z11));
            return this;
        }

        public Builder setBackpressureStrategy(int i11) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i11));
            return this;
        }

        public Builder setImageQueueDepth(int i11) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i11));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setOnePixelShiftEnabled(boolean z11) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, Boolean.valueOf(z11));
            return this;
        }

        public Builder setOutputImageFormat(int i11) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i11));
            return this;
        }

        @RequiresApi(23)
        public Builder setOutputImageRotationEnabled(boolean z11) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.valueOf(z11));
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<ImageAnalysisConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageAnalysisConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        private static final Size DEFAULT_TARGET_RESOLUTION;

        static {
            Size size = new Size(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P);
            DEFAULT_TARGET_RESOLUTION = size;
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(new ResolutionStrategy(SizeUtil.RESOLUTION_VGA, 1)).build();
            DEFAULT_RESOLUTION_SELECTOR = resolutionSelectorBuild;
            DEFAULT_CONFIG = new Builder().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).setResolutionSelector(resolutionSelectorBuild).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OutputImageFormat {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m1853d(Size size, List list, int i11) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private void recreateImageAnalysisAbstractAnalyzer() {
        Analyzer analyzer;
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) getCurrentConfig();
                if (imageAnalysisConfig.getBackpressureStrategy(0) == 1) {
                    this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
                } else {
                    this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer(imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor()));
                }
                this.mImageAnalysisAbstractAnalyzer.setOutputImageFormat(getOutputImageFormat());
                this.mImageAnalysisAbstractAnalyzer.setOutputImageRotationEnabled(isOutputImageRotationEnabled());
                CameraInternal camera = getCamera();
                Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
                boolean zContains = camera != null ? camera.getCameraInfoInternal().getCameraQuirks().contains(OnePixelShiftQuirk.class) : false;
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (onePixelShiftEnabled != null) {
                    zContains = onePixelShiftEnabled.booleanValue();
                }
                imageAnalysisAbstractAnalyzer.setOnePixelShiftEnabled(zContains);
                if (camera != null) {
                    this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
                }
                Rect rect = this.mViewPortCropRect;
                if (rect != null) {
                    this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
                }
                Matrix matrix = this.mSensorToBufferTransformMatrix;
                if (matrix != null) {
                    this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
                }
                Executor executor = this.mSubscribedAnalyzerExecutor;
                if (executor != null && (analyzer = this.mSubscribedAnalyzer) != null) {
                    this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, analyzer);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void tryUpdateRelativeRotation() {
        synchronized (this.mAnalysisLock) {
            try {
                CameraInternal camera = getCamera();
                if (camera != null) {
                    this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearAnalyzer() {
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setAnalyzer(null, null);
                }
                if (this.mSubscribedAnalyzer != null) {
                    notifyInactive();
                }
                this.mSubscribedAnalyzerExecutor = null;
                this.mSubscribedAnalyzer = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        final Size defaultTargetResolution;
        synchronized (this.mAnalysisLock) {
            try {
                Analyzer analyzer = this.mSubscribedAnalyzer;
                defaultTargetResolution = analyzer != null ? analyzer.getDefaultTargetResolution() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((Integer) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        UseCaseConfig useCaseConfig = builder.getUseCaseConfig();
        Config.Option<Size> option = ImageOutputConfig.OPTION_TARGET_RESOLUTION;
        if (!useCaseConfig.containsOption(option)) {
            builder.getMutableConfig().insertOption(option, defaultTargetResolution);
        }
        UseCaseConfig useCaseConfig2 = builder.getUseCaseConfig();
        Config.Option option2 = ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (useCaseConfig2.containsOption(option2)) {
            ResolutionSelector resolutionSelector = (ResolutionSelector) getAppConfig().retrieveOption(option2, null);
            ResolutionSelector.Builder builder2 = resolutionSelector == null ? new ResolutionSelector.Builder() : ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
            if (resolutionSelector == null || resolutionSelector.getResolutionStrategy() == null) {
                builder2.setResolutionStrategy(new ResolutionStrategy(defaultTargetResolution, 1));
            }
            if (resolutionSelector == null) {
                builder2.setResolutionFilter(new ResolutionFilter() { // from class: androidx.camera.core.s
                    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
                    public final List filter(List list, int i11) {
                        return ImageAnalysis.m1853d(defaultTargetResolution, list, i11);
                    }
                });
            }
            builder.getMutableConfig().insertOption(option2, builder2.build());
        }
        return builder.getUseCaseConfig();
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
        androidx.camera.core.impl.SessionConfig.Builder builderCreatePipeline = createPipeline(getCameraId(), (ImageAnalysisConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        updateSessionConfig(C1100n.m2002a(new Object[]{builderCreatePipeline.build()}));
        return streamSpec;
    }

    public void setAnalyzer(Executor executor, final Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setAnalyzer(executor, new Analyzer() { // from class: androidx.camera.core.q
                        @Override // androidx.camera.core.ImageAnalysis.Analyzer
                        public final void analyze(ImageProxy imageProxy) {
                            analyzer.analyze(imageProxy);
                        }
                    });
                }
                if (this.mSubscribedAnalyzer == null) {
                    notifyActive();
                }
                this.mSubscribedAnalyzerExecutor = executor;
                this.mSubscribedAnalyzer = analyzer;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + getName();
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mAnalysisLock = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1850a(SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1851b(ImageAnalysis imageAnalysis, ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (imageAnalysis.getCamera() == null) {
            return;
        }
        imageAnalysis.clearPipeline();
        imageAnalysisAbstractAnalyzer.clearCache();
        androidx.camera.core.impl.SessionConfig.Builder builderCreatePipeline = imageAnalysis.createPipeline(imageAnalysis.getCameraId(), (ImageAnalysisConfig) imageAnalysis.getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(imageAnalysis.getAttachedStreamSpec()));
        imageAnalysis.mSessionConfigBuilder = builderCreatePipeline;
        imageAnalysis.updateSessionConfig(C1100n.m2002a(new Object[]{builderCreatePipeline.build()}));
        imageAnalysis.notifyReset();
    }

    private boolean isFlipWH(CameraInternal cameraInternal) {
        if (!isOutputImageRotationEnabled() || getRelativeRotation(cameraInternal) % 180 == 0) {
            return false;
        }
        return true;
    }

    public void clearPipeline() {
        Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    public androidx.camera.core.impl.SessionConfig.Builder createPipeline(String str, ImageAnalysisConfig imageAnalysisConfig, StreamSpec streamSpec) {
        int imageQueueDepth;
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        final ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer;
        boolean zIsFlipWH;
        int width;
        int height;
        int i11;
        boolean z11;
        boolean z12;
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy2;
        Threads.checkMainThread();
        Size resolution = streamSpec.getResolution();
        Executor executor = (Executor) Preconditions.checkNotNull(imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor()));
        boolean z13 = true;
        if (getBackpressureStrategy() == 1) {
            imageQueueDepth = getImageQueueDepth();
        } else {
            imageQueueDepth = 4;
        }
        int i12 = imageQueueDepth;
        if (imageAnalysisConfig.getImageReaderProxyProvider() != null) {
            safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(resolution.getWidth(), resolution.getHeight(), getImageFormat(), i12, 0L));
        } else {
            safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(resolution.getWidth(), resolution.getHeight(), getImageFormat(), i12));
        }
        synchronized (this.mAnalysisLock) {
            recreateImageAnalysisAbstractAnalyzer();
            imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
        }
        if (getCamera() != null) {
            zIsFlipWH = isFlipWH(getCamera());
        } else {
            zIsFlipWH = false;
        }
        if (zIsFlipWH) {
            width = resolution.getHeight();
        } else {
            width = resolution.getWidth();
        }
        if (zIsFlipWH) {
            height = resolution.getWidth();
        } else {
            height = resolution.getHeight();
        }
        if (getOutputImageFormat() == 2) {
            i11 = 1;
        } else {
            i11 = 35;
        }
        if (getImageFormat() == 35 && getOutputImageFormat() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getImageFormat() == 35 && getOutputImageFormat() == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getImageFormat() != 35 || ((getCamera() == null || getRelativeRotation(getCamera()) == 0) && !Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z13 = false;
        }
        if (!z11 && (!z13 || z12)) {
            safeCloseImageReaderProxy2 = null;
        } else {
            safeCloseImageReaderProxy2 = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(width, height, i11, safeCloseImageReaderProxy.getMaxImages()));
        }
        if (safeCloseImageReaderProxy2 != null) {
            imageAnalysisAbstractAnalyzer.setProcessedImageReaderProxy(safeCloseImageReaderProxy2);
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(imageAnalysisAbstractAnalyzer, executor);
        androidx.camera.core.impl.SessionConfig.Builder builderCreateFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.o
            @Override // java.lang.Runnable
            public final void run() {
                ImageAnalysis.m1850a(safeCloseImageReaderProxy, safeCloseImageReaderProxy2);
            }
        }, CameraXExecutors.mainThreadExecutor());
        builderCreateFrom.setSessionType(streamSpec.getSessionType());
        applyExpectedFrameRateRange(builderCreateFrom, streamSpec);
        builderCreateFrom.addSurface(this.mDeferrableSurface, streamSpec.getDynamicRange(), null, -1);
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.p
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                ImageAnalysis.m1851b(this.f1750a, imageAnalysisAbstractAnalyzer, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        return builderCreateFrom;
    }

    @ExperimentalUseCaseApi
    public Executor getBackgroundExecutor() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackgroundExecutor(null);
    }

    public int getBackpressureStrategy() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    public int getImageQueueDepth() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Boolean getOnePixelShiftEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(DEFAULT_ONE_PIXEL_SHIFT_ENABLED);
    }

    public int getOutputImageFormat() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public ResolutionSelector getResolutionSelector() {
        return ((ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isOutputImageRotationEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(Boolean.FALSE).booleanValue();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
        clearPipeline();
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.detach();
            this.mImageAnalysisAbstractAnalyzer = null;
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
                }
                this.mSensorToBufferTransformMatrix = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setTargetRotation(int i11) {
        if (setTargetRotationInternal(i11)) {
            tryUpdateRelativeRotation();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        synchronized (this.mAnalysisLock) {
            try {
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
                if (imageAnalysisAbstractAnalyzer != null) {
                    imageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
                }
                this.mViewPortCropRect = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public interface Analyzer {
        void analyze(ImageProxy imageProxy);

        default Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(Matrix matrix) {
        }
    }
}
