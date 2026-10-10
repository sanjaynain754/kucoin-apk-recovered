package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.imagecapture.ImagePipeline;
import androidx.camera.core.imagecapture.PostviewSettings;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.core.internal.SupportedOutputSizesSorter;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.bugly.proguard.C33820nf;
import java.io.File;
import java.io.OutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageCapture extends UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;

    @ExperimentalZeroShutterLag
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    private static final String ERROR_MSG_SCREEN_FLASH_NOT_SET = "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.";
    public static final int ERROR_UNKNOWN = 0;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    public static final int FLASH_MODE_SCREEN = 3;
    private static final int FLASH_MODE_UNKNOWN = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;
    public static final int OUTPUT_FORMAT_JPEG = 0;
    public static final int OUTPUT_FORMAT_JPEG_ULTRA_HDR = 1;
    public static final int OUTPUT_FORMAT_RAW = 2;
    public static final int OUTPUT_FORMAT_RAW_JPEG = 3;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final long SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS = 3;
    private static final String TAG = "ImageCapture";
    private final int mCaptureMode;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private final ImageReaderProxy.OnImageAvailableListener mClosingListener;
    private Rational mCropAspectRatio;

    @GuardedBy("mLockedFlashMode")
    private int mFlashMode;
    private final int mFlashType;
    private final ImageCaptureControl mImageCaptureControl;
    private ImagePipeline mImagePipeline;

    @GuardedBy("mLockedFlashMode")
    private final AtomicReference<Integer> mLockedFlashMode;
    private ScreenFlashWrapper mScreenFlashWrapper;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private TakePictureManager mTakePictureManager;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();

    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder>, ImageInputConfig.Builder<Builder> {
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
            return setTargetClass((Class<ImageCapture>) cls);
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(ImageCapture.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
                setTargetClass(ImageCapture.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromConfig(ImageCaptureConfig imageCaptureConfig) {
            return new Builder(MutableOptionsBundle.from((Config) imageCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public ImageCapture build() {
            Integer num = (Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
            } else if (ImageCapture.isOutputFormatRaw(getMutableConfig())) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
            } else if (ImageCapture.isOutputFormatRawJpeg(getMutableConfig())) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
                getMutableConfig().insertOption(ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 256);
            } else if (ImageCapture.isOutputFormatUltraHdr(getMutableConfig())) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, Integer.valueOf(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY));
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
            } else {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            }
            ImageCaptureConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.validateConfig(useCaseConfig);
            ImageCapture imageCapture = new ImageCapture(useCaseConfig);
            Size size = (Size) getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                imageCapture.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
            }
            Preconditions.checkNotNull((Executor) getMutableConfig().retrieveOption(IoConfig.OPTION_IO_EXECUTOR, CameraXExecutors.ioExecutor()), "The IO executor can't be null");
            MutableConfig mutableConfig = getMutableConfig();
            Config.Option<Integer> option = ImageCaptureConfig.OPTION_FLASH_MODE;
            if (mutableConfig.containsOption(option)) {
                Integer num2 = (Integer) getMutableConfig().retrieveOption(option);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_SCREEN_FLASH, null) == null) {
                    throw new IllegalArgumentException(ImageCapture.ERROR_MSG_SCREEN_FLASH_NOT_SET);
                }
            }
            return imageCapture;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public ImageCaptureConfig getUseCaseConfig() {
            return new ImageCaptureConfig(OptionsBundle.from(this.mMutableConfig));
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
        @Override // androidx.camera.core.internal.IoConfig.Builder
        public Builder setIoExecutor(Executor executor) {
            getMutableConfig().insertOption(IoConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        public Builder setJpegQuality(@IntRange(from = 1, m1553to = 100) int i11) {
            Preconditions.checkArgumentInRange(i11, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i11));
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
        public Builder setTargetClass(Class<ImageCapture> cls) {
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

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setBufferFormat(int i11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, Integer.valueOf(i11));
            return this;
        }

        public Builder setCaptureMode(int i11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i11));
            return this;
        }

        public Builder setFlashMode(int i11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, Integer.valueOf(i11));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setFlashType(int i11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_TYPE, Integer.valueOf(i11));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setOutputFormat(int i11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, Integer.valueOf(i11));
            return this;
        }

        public Builder setPostviewEnabled(boolean z11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.valueOf(z11));
            return this;
        }

        public Builder setPostviewResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        public Builder setScreenFlash(ScreenFlash screenFlash) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SCREEN_FLASH, screenFlash);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSoftwareJpegEncoderRequested(boolean z11) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.valueOf(z11));
            return this;
        }
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CaptureMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageCaptureConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final int DEFAULT_OUTPUT_FORMAT = 0;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final StreamUseCase DEFAULT_STREAM_USE_CASE;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        static {
            StreamUseCase streamUseCase = StreamUseCase.STILL_CAPTURE;
            DEFAULT_STREAM_USE_CASE = streamUseCase;
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            DEFAULT_RESOLUTION_SELECTOR = resolutionSelectorBuild;
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(4).setStreamUseCase(streamUseCase).setTargetAspectRatio(0).setResolutionSelector(resolutionSelectorBuild).setOutputFormat(0).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FlashType {
    }

    public static class ImageCaptureCapabilitiesImpl implements ImageCaptureCapabilities {
        private final CameraInfo mCameraInfo;

        private Set<Integer> getSupportedOutputFormatsFromAdapterCameraInfo() {
            CameraInfo cameraInfo = this.mCameraInfo;
            HashSet hashSet = null;
            if (!(cameraInfo instanceof AdapterCameraInfo)) {
                return null;
            }
            Config config = ((AdapterCameraInfo) cameraInfo).getCameraConfig().getUseCaseConfigFactory().getConfig(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, 1);
            if (config != null) {
                Config.Option<List<Pair<Integer, Size[]>>> option = ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS;
                if (config.containsOption(option)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) config.retrieveOption(option)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        private boolean isRawSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (!(cameraInfo instanceof CameraInfoInternal)) {
                return false;
            }
            CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
            if (cameraInfoInternal.getAvailableCapabilities().contains(3)) {
                return cameraInfoInternal.getSupportedOutputFormats().contains(32);
            }
            return false;
        }

        private boolean isUltraHdrSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof CameraInfoInternal) {
                return ((CameraInfoInternal) cameraInfo).getSupportedOutputFormats().contains(Integer.valueOf(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY));
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isCaptureProcessProgressSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof CameraInfoInternal) {
                return ((CameraInfoInternal) cameraInfo).isCaptureProcessProgressSupported();
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isPostviewSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof CameraInfoInternal) {
                return ((CameraInfoInternal) cameraInfo).isPostviewSupported();
            }
            return false;
        }

        public ImageCaptureCapabilitiesImpl(CameraInfo cameraInfo) {
            this.mCameraInfo = cameraInfo;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public Set<Integer> getSupportedOutputFormats() {
            Set<Integer> supportedOutputFormatsFromAdapterCameraInfo = getSupportedOutputFormatsFromAdapterCameraInfo();
            if (supportedOutputFormatsFromAdapterCameraInfo != null) {
                return supportedOutputFormatsFromAdapterCameraInfo;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (isUltraHdrSupported()) {
                hashSet.add(1);
            }
            if (isRawSupported()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImageCaptureError {
    }

    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet = false;
        private boolean mIsReversedVertical;
        private Location mLocation;

        public Location getLocation() {
            return this.mLocation;
        }

        public boolean isReversedHorizontal() {
            return this.mIsReversedHorizontal;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean isReversedHorizontalSet() {
            return this.mIsReversedHorizontalSet;
        }

        public boolean isReversedVertical() {
            return this.mIsReversedVertical;
        }

        public void setLocation(Location location) {
            this.mLocation = location;
        }

        public void setReversedHorizontal(boolean z11) {
            this.mIsReversedHorizontal = z11;
            this.mIsReversedHorizontalSet = true;
        }

        public void setReversedVertical(boolean z11) {
            this.mIsReversedVertical = z11;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.mIsReversedHorizontal + ", mIsReversedVertical=" + this.mIsReversedVertical + ", mLocation=" + this.mLocation + "}";
        }
    }

    public static final class OutputFileOptions {
        private final ContentResolver mContentResolver;
        private final ContentValues mContentValues;
        private final File mFile;
        private final Metadata mMetadata;
        private final OutputStream mOutputStream;
        private final Uri mSaveCollection;

        public static final class Builder {
            private ContentResolver mContentResolver;
            private ContentValues mContentValues;
            private File mFile;
            private Metadata mMetadata;
            private OutputStream mOutputStream;
            private Uri mSaveCollection;

            public Builder(File file) {
                this.mFile = file;
            }

            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mOutputStream, this.mMetadata);
            }

            public Builder setMetadata(Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public Builder(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder(OutputStream outputStream) {
                this.mOutputStream = outputStream;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public ContentValues getContentValues() {
            return this.mContentValues;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public File getFile() {
            return this.mFile;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Metadata getMetadata() {
            return this.mMetadata;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OutputStream getOutputStream() {
            return this.mOutputStream;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.mFile + ", mContentResolver=" + this.mContentResolver + ", mSaveCollection=" + this.mSaveCollection + ", mContentValues=" + this.mContentValues + ", mOutputStream=" + this.mOutputStream + ", mMetadata=" + this.mMetadata + "}";
        }

        public OutputFileOptions(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, Metadata metadata) {
            this.mFile = file;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mOutputStream = outputStream;
            this.mMetadata = metadata == null ? new Metadata() : metadata;
        }
    }

    public static class OutputFileResults {
        private final int mImageFormat;
        private final Uri mSavedUri;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OutputFileResults(Uri uri) {
            this(uri, 256);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OutputFileResults(Uri uri, int i11) {
            this.mSavedUri = uri;
            this.mImageFormat = i11;
        }

        public int getImageFormat() {
            return this.mImageFormat;
        }

        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OutputFormat {
    }

    public interface ScreenFlash {
        @UiThread
        void apply(long j11, ScreenFlashListener screenFlashListener);

        @UiThread
        void clear();
    }

    public interface ScreenFlashListener {
        void onCompleted();
    }

    @MainThread
    private void clearPipeline() {
        clearPipeline(false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Void m1862e(List list) {
        return null;
    }

    private static boolean isImageFormatSupported(List<Pair<Integer, Size[]>> list, int i11) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i11))) {
                return true;
            }
        }
        return false;
    }

    private void setScreenFlashToCameraControl() {
        setScreenFlashToCameraControl(this.mScreenFlashWrapper);
    }

    public void takePicture(final Executor executor, final OnImageCapturedCallback onImageCapturedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1567b.takePicture(executor, onImageCapturedCallback);
                }
            });
        } else {
            takePictureInternal(executor, onImageCapturedCallback, null, null, null);
        }
    }

    @UiThread
    private void abortImageCaptureRequests() {
        this.mScreenFlashWrapper.completePendingTasks();
        TakePictureManager takePictureManager = this.mTakePictureManager;
        if (takePictureManager != null) {
            takePictureManager.abortRequests();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1859b(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            try {
                Log.d(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxyAcquireLatestImage);
                if (imageProxyAcquireLatestImage != null) {
                    imageProxyAcquireLatestImage.close();
                }
            } catch (Throwable th2) {
                if (imageProxyAcquireLatestImage != null) {
                    try {
                        imageProxyAcquireLatestImage.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IllegalStateException e11) {
            Log.e(TAG, "Failed to acquire latest image.", e11);
        }
    }

    @MainThread
    private void clearPipeline(boolean z11) {
        TakePictureManager takePictureManager;
        Log.d(TAG, "clearPipeline");
        Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        ImagePipeline imagePipeline = this.mImagePipeline;
        if (imagePipeline != null) {
            imagePipeline.close();
            this.mImagePipeline = null;
        }
        if (!z11 && (takePictureManager = this.mTakePictureManager) != null) {
            takePictureManager.abortRequests();
            this.mTakePictureManager = null;
        }
        getCameraControl().clearZslConfig();
    }

    public static Rect computeDispatchCropRect(Rect rect, Rational rational, int i11, Size size, int i12) {
        if (rect != null) {
            return ImageUtil.computeCropRectFromDispatchInfo(rect, i11, size, i12);
        }
        if (rational != null) {
            if (i12 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.isAspectRatioValid(size, rational)) {
                Rect rectComputeCropRectFromAspectRatio = ImageUtil.computeCropRectFromAspectRatio(size, rational);
                Objects.requireNonNull(rectComputeCropRectFromAspectRatio);
                return rectComputeCropRectFromAspectRatio;
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static int getError(Throwable th2) {
        if (th2 instanceof CameraClosedException) {
            return 3;
        }
        if (th2 instanceof ImageCaptureException) {
            return ((ImageCaptureException) th2).getImageCaptureError();
        }
        return 0;
    }

    public static ImageCaptureCapabilities getImageCaptureCapabilities(CameraInfo cameraInfo) {
        return new ImageCaptureCapabilitiesImpl(cameraInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOutputFormatRaw(MutableConfig mutableConfig) {
        return Objects.equals(mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOutputFormatRawJpeg(MutableConfig mutableConfig) {
        return Objects.equals(mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOutputFormatUltraHdr(MutableConfig mutableConfig) {
        return Objects.equals(mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 1);
    }

    private void sendInvalidCameraError(Executor executor, OnImageCapturedCallback onImageCapturedCallback, OnImageSavedCallback onImageSavedCallback) {
        ImageCaptureException imageCaptureException = new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
        if (onImageCapturedCallback != null) {
            onImageCapturedCallback.onError(imageCaptureException);
        } else {
            if (onImageSavedCallback == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            onImageSavedCallback.onError(imageCaptureException);
        }
    }

    private void setScreenFlashToCameraControl(ScreenFlash screenFlash) {
        getCameraControl().setScreenFlash(screenFlash);
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            try {
                if (this.mLockedFlashMode.get() != null) {
                    return;
                }
                getCameraControl().setFlashMode(getFlashMode());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean enforceSoftwareJpegConstraints(MutableConfig mutableConfig) {
        boolean z11;
        Boolean bool = Boolean.TRUE;
        Config.Option<Boolean> option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        Boolean bool2 = Boolean.FALSE;
        boolean z12 = false;
        if (bool.equals(mutableConfig.retrieveOption(option, bool2))) {
            if (isSessionProcessorEnabledInCurrentCamera()) {
                Logger.m1872w(TAG, "Software JPEG cannot be used with Extensions.");
                z11 = false;
            } else {
                z11 = true;
            }
            Integer num = (Integer) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z12 = z11;
            } else {
                Logger.m1872w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z12) {
                Logger.m1872w(TAG, "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(option, bool2);
            }
        }
        return z12;
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> getDefaultConfig(boolean z11, UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), getCaptureMode());
        if (z11) {
            config = Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getFlashMode() {
        int flashMode;
        synchronized (this.mLockedFlashMode) {
            flashMode = this.mFlashMode;
            if (flashMode == -1) {
                flashMode = ((ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return flashMode;
    }

    @VisibleForTesting
    public ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    public ScreenFlash getScreenFlash() {
        return this.mScreenFlashWrapper.getScreenFlash();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @VisibleForTesting
    public TakePictureManager getTakePictureManager() {
        TakePictureManager takePictureManager = this.mTakePictureManager;
        Objects.requireNonNull(takePictureManager);
        return takePictureManager;
    }

    @VisibleForTesting
    public boolean isProcessingPipelineEnabled() {
        return (this.mImagePipeline == null || this.mTakePictureManager == null) ? false : true;
    }

    public void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            try {
                if (this.mLockedFlashMode.get() != null) {
                    return;
                }
                this.mLockedFlashMode.set(Integer.valueOf(getFlashMode()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onCameraControlReady() {
        Logger.m1866d(TAG, "onCameraControlReady");
        trySetFlashModeToCameraControl();
        setScreenFlashToCameraControl();
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
        androidx.camera.core.impl.SessionConfig.Builder builderCreatePipeline = createPipeline(getCameraId(), (ImageCaptureConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        updateSessionConfig(C1100n.m2002a(new Object[]{builderCreatePipeline.build()}));
        notifyActive();
        return streamSpec;
    }

    public void setCropAspectRatio(Rational rational) {
        this.mCropAspectRatio = rational;
    }

    public void setFlashMode(int i11) {
        Logger.m1866d(TAG, "setFlashMode: flashMode = " + i11);
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i11);
            }
            if (this.mScreenFlashWrapper.getScreenFlash() == null) {
                throw new IllegalArgumentException(ERROR_MSG_SCREEN_FLASH_NOT_SET);
            }
            if (getCamera() != null && getCameraLens() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.mLockedFlashMode) {
            this.mFlashMode = i11;
            trySetFlashModeToCameraControl();
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    public void unlockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            try {
                Integer andSet = this.mLockedFlashMode.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != getFlashMode()) {
                    trySetFlashModeToCameraControl();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.mClosingListener = new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.d0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ImageCapture.m1859b(imageReaderProxy);
            }
        };
        this.mLockedFlashMode = new AtomicReference<>(null);
        this.mFlashMode = -1;
        this.mCropAspectRatio = null;
        this.mImageCaptureControl = new ImageCaptureControl() { // from class: androidx.camera.core.ImageCapture.1
            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            @MainThread
            public void lockFlashMode() {
                ImageCapture.this.lockFlashMode();
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            @MainThread
            public ListenableFuture<Void> submitStillCaptureRequests(List<CaptureConfig> list) {
                return ImageCapture.this.submitStillCaptureRequest(list);
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            @MainThread
            public void unlockFlashMode() {
                ImageCapture.this.unlockFlashMode();
            }
        };
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig2.containsOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = imageCaptureConfig2.getFlashType(0);
        this.mScreenFlashWrapper = ScreenFlashWrapper.from(imageCaptureConfig2.getScreenFlash());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1858a(ImageCapture imageCapture, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (imageCapture.getCamera() == null) {
            return;
        }
        imageCapture.mTakePictureManager.pause();
        imageCapture.clearPipeline(true);
        androidx.camera.core.impl.SessionConfig.Builder builderCreatePipeline = imageCapture.createPipeline(imageCapture.getCameraId(), (ImageCaptureConfig) imageCapture.getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(imageCapture.getAttachedStreamSpec()));
        imageCapture.mSessionConfigBuilder = builderCreatePipeline;
        imageCapture.updateSessionConfig(C1100n.m2002a(new Object[]{builderCreatePipeline.build()}));
        imageCapture.notifyReset();
        imageCapture.mTakePictureManager.resume();
    }

    @OptIn(markerClass = {ExperimentalSessionConfig.class})
    private void applyFeatureGroupToConfig(UseCaseConfig.Builder<?, ?, ?> builder) {
        Set<GroupableFeature> featureGroup = getFeatureGroup();
        if (featureGroup != null) {
            int imageCaptureOutputFormat = 0;
            for (GroupableFeature groupableFeature : featureGroup) {
                if (groupableFeature instanceof ImageFormatFeature) {
                    imageCaptureOutputFormat = ((ImageFormatFeature) groupableFeature).getImageCaptureOutputFormat();
                }
            }
            builder.getMutableConfig().insertOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, Integer.valueOf(imageCaptureOutputFormat));
        }
    }

    private PostviewSettings calculatePostviewSettings(int i11, Size size) {
        int iSelect;
        SessionProcessor sessionProcessor = getSessionProcessor();
        if (sessionProcessor == null) {
            return null;
        }
        Map<Integer, List<Size>> supportedPostviewSize = sessionProcessor.getSupportedPostviewSize(size);
        ArrayList arrayList = new ArrayList();
        if (isPostviewImageFormatSupported(supportedPostviewSize, 35)) {
            arrayList.add(35);
        }
        if (isPostviewImageFormatSupported(supportedPostviewSize, 256)) {
            arrayList.add(256);
        }
        if (isPostviewImageFormatSupported(supportedPostviewSize, JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY)) {
            arrayList.add(Integer.valueOf(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY));
        }
        if (!arrayList.isEmpty()) {
            iSelect = getCamera().getExtendedConfig().getPostviewFormatSelector().select(i11, arrayList);
        } else {
            iSelect = 0;
        }
        if (iSelect == 0) {
            return null;
        }
        List<Size> list = supportedPostviewSize.get(Integer.valueOf(iSelect));
        ResolutionSelector resolutionSelector = (ResolutionSelector) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
        if (resolutionSelector != null) {
            Collections.sort(list, new CompareSizesByArea(true));
            CameraInternal camera = getCamera();
            Rect sensorRect = camera.getCameraInfoInternal().getSensorRect();
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            List<Size> listSortSupportedOutputSizesByResolutionSelector = SupportedOutputSizesSorter.sortSupportedOutputSizesByResolutionSelector(resolutionSelector, list, null, getTargetRotation(), new Rational(sensorRect.width(), sensorRect.height()), cameraInfoInternal.getSensorRotationDegrees(), cameraInfoInternal.getLensFacing());
            if (!listSortSupportedOutputSizesByResolutionSelector.isEmpty()) {
                return PostviewSettings.create(listSortSupportedOutputSizesByResolutionSelector.get(0), iSelect);
            }
            throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
        }
        return PostviewSettings.create((Size) Collections.max(list, new CompareSizesByArea()), iSelect);
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    @MainThread
    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(String str, ImageCaptureConfig imageCaptureConfig, StreamSpec streamSpec) {
        PostviewSettings postviewSettingsCalculatePostviewSettings;
        Threads.checkMainThread();
        Log.d(TAG, String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, streamSpec));
        Size resolution = streamSpec.getResolution();
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        boolean z11 = !camera.getHasTransform();
        if (this.mImagePipeline != null) {
            Preconditions.checkState(z11);
            this.mImagePipeline.close();
        }
        Set<Integer> supportedOutputFormats = getImageCaptureCapabilities(getCamera().getCameraInfo()).getSupportedOutputFormats();
        Preconditions.checkArgument(supportedOutputFormats.contains(Integer.valueOf(getOutputFormat())), "The specified output format (" + getOutputFormat() + ") is not supported by current configuration. Supported output formats: " + supportedOutputFormats);
        CameraCharacteristics cameraCharacteristics = null;
        if (isPostviewEnabled()) {
            postviewSettingsCalculatePostviewSettings = calculatePostviewSettings(imageCaptureConfig.getInputFormat(), resolution);
        } else {
            postviewSettingsCalculatePostviewSettings = null;
        }
        if (getCamera() != null) {
            try {
                Object cameraCharacteristics2 = getCamera().getCameraInfoInternal().getCameraCharacteristics();
                if (cameraCharacteristics2 instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) cameraCharacteristics2;
                }
            } catch (Exception e11) {
                Log.e(TAG, "getCameraCharacteristics failed", e11);
            }
        }
        this.mImagePipeline = new ImagePipeline(imageCaptureConfig, resolution, cameraCharacteristics, getEffect(), z11, postviewSettingsCalculatePostviewSettings);
        if (this.mTakePictureManager == null) {
            this.mTakePictureManager = getCurrentConfig().getTakePictureManagerProvider().newInstance(this.mImageCaptureControl);
        }
        this.mTakePictureManager.setImagePipeline(this.mImagePipeline);
        androidx.camera.core.impl.SessionConfig.Builder builderCreateSessionConfigBuilder = this.mImagePipeline.createSessionConfigBuilder(streamSpec.getResolution());
        builderCreateSessionConfigBuilder.setSessionType(streamSpec.getSessionType());
        if (getCaptureMode() == 2 && !streamSpec.getZslDisabled()) {
            getCameraControl().addZslConfig(builderCreateSessionConfigBuilder);
        }
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateSessionConfigBuilder.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.a0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                ImageCapture.m1858a(this.f1561a, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateSessionConfigBuilder.setErrorListener(closeableErrorListener2);
        return builderCreateSessionConfigBuilder;
    }

    private int getCameraLens() {
        CameraInternal camera = getCamera();
        if (camera != null) {
            return camera.getCameraInfo().getLensFacing();
        }
        return -1;
    }

    @IntRange(from = 1, m1553to = 100)
    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    private int getJpegQualityInternal() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig.containsOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i11 = this.mCaptureMode;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("CaptureMode " + this.mCaptureMode + " is invalid");
            }
            return 95;
        }
        return 100;
    }

    private SessionProcessor getSessionProcessor() {
        return getCamera().getExtendedConfig().getSessionProcessor(null);
    }

    private Rect getTakePictureCropRect() {
        Rect viewPortCropRect = getViewPortCropRect();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Objects.requireNonNull(attachedSurfaceResolution);
        if (viewPortCropRect != null) {
            return viewPortCropRect;
        }
        if (ImageUtil.isAspectRatioValid(this.mCropAspectRatio)) {
            CameraInternal camera = getCamera();
            Objects.requireNonNull(camera);
            int relativeRotation = getRelativeRotation(camera);
            Rational rational = new Rational(this.mCropAspectRatio.getDenominator(), this.mCropAspectRatio.getNumerator());
            if (!TransformUtils.is90or270(relativeRotation)) {
                rational = this.mCropAspectRatio;
            }
            Rect rectComputeCropRectFromAspectRatio = ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
            Objects.requireNonNull(rectComputeCropRectFromAspectRatio);
            return rectComputeCropRectFromAspectRatio;
        }
        return new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
    }

    private boolean isPostviewImageFormatSupported(Map<Integer, List<Size>> map, int i11) {
        if (map.containsKey(Integer.valueOf(i11)) && !map.get(Integer.valueOf(i11)).isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isSessionProcessorEnabledInCurrentCamera() {
        if (getCamera() == null || getCamera().getExtendedConfig().getSessionProcessor(null) == null) {
            return false;
        }
        return true;
    }

    @MainThread
    private void takePictureInternal(Executor executor, OnImageCapturedCallback onImageCapturedCallback, OnImageSavedCallback onImageSavedCallback, OutputFileOptions outputFileOptions, OutputFileOptions outputFileOptions2) {
        boolean z11;
        Threads.checkMainThread();
        if (getFlashMode() == 3 && this.mScreenFlashWrapper.getScreenFlash() == null) {
            throw new IllegalArgumentException(ERROR_MSG_SCREEN_FLASH_NOT_SET);
        }
        Log.d(TAG, "takePictureInternal");
        CameraInternal camera = getCamera();
        if (camera != null && isInSession()) {
            if (getCurrentConfig().getSecondaryInputFormat() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11;
            if (z12 && outputFileOptions2 == null) {
                throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
            }
            if (!z12 && outputFileOptions2 != null) {
                throw new IllegalArgumentException("Non simultaneous capture cannot have two output file options");
            }
            TakePictureManager takePictureManager = this.mTakePictureManager;
            Objects.requireNonNull(takePictureManager);
            takePictureManager.offerRequest(TakePictureRequest.m1933of(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, outputFileOptions2, getTakePictureCropRect(), getSensorToBufferTransformMatrix(), getRelativeRotation(camera), getJpegQualityInternal(), getCaptureMode(), z12, this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks()));
            return;
        }
        sendInvalidCameraError(executor, onImageCapturedCallback, onImageSavedCallback);
    }

    @IntRange(from = 1, m1553to = 100)
    public int getJpegQuality() {
        return getJpegQualityInternal();
    }

    public int getOutputFormat() {
        return ((Integer) Preconditions.checkNotNull((Integer) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, 0))).intValue();
    }

    public ResolutionSelector getPostviewResolutionSelector() {
        return (ResolutionSelector) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
    }

    public ImageCaptureLatencyEstimate getRealtimeCaptureLatencyEstimate() {
        CameraInternal camera = getCamera();
        if (camera == null) {
            return ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY;
        }
        Pair<Long, Long> realtimeCaptureLatency = null;
        SessionProcessor sessionProcessor = camera.getExtendedConfig().getSessionProcessor(null);
        if (sessionProcessor != null) {
            realtimeCaptureLatency = sessionProcessor.getRealtimeCaptureLatency();
        }
        if (realtimeCaptureLatency == null) {
            return ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY;
        }
        return new ImageCaptureLatencyEstimate(((Long) realtimeCaptureLatency.first).longValue(), ((Long) realtimeCaptureLatency.second).longValue());
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera != null && attachedSurfaceResolution != null) {
            Rect viewPortCropRect = getViewPortCropRect();
            Rational rational = this.mCropAspectRatio;
            if (viewPortCropRect == null) {
                if (rational != null) {
                    viewPortCropRect = ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
                } else {
                    viewPortCropRect = new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
                }
            }
            int relativeRotation = getRelativeRotation(camera);
            Objects.requireNonNull(viewPortCropRect);
            return new ResolutionInfo(attachedSurfaceResolution, viewPortCropRect, relativeRotation);
        }
        return null;
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

    public boolean isPostviewEnabled() {
        return ((Boolean) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onBind() {
        Preconditions.checkNotNull(getCamera(), "Attached camera cannot be null");
        if (getFlashMode() == 3 && getCameraLens() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        boolean z11;
        applyFeatureGroupToConfig(builder);
        if (cameraInfoInternal.getCameraQuirks().contains(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableConfig mutableConfig = builder.getMutableConfig();
            Config.Option<Boolean> option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfig.retrieveOption(option, bool2))) {
                Logger.m1872w(TAG, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                Logger.m1870i(TAG, "Requesting software JPEG due to device quirk.");
                builder.getMutableConfig().insertOption(option, bool2);
            }
        }
        boolean zEnforceSoftwareJpegConstraints = enforceSoftwareJpegConstraints(builder.getMutableConfig());
        Integer num = (Integer) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        int iIntValue = 35;
        if (num != null) {
            if (isSessionProcessorEnabledInCurrentCamera() && num.intValue() != 256) {
                z11 = false;
            } else {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "Cannot set non-JPEG buffer format with Extensions enabled.");
            MutableConfig mutableConfig2 = builder.getMutableConfig();
            Config.Option<Integer> option2 = ImageInputConfig.OPTION_INPUT_FORMAT;
            if (!zEnforceSoftwareJpegConstraints) {
                iIntValue = num.intValue();
            }
            mutableConfig2.insertOption(option2, Integer.valueOf(iIntValue));
        } else if (isOutputFormatRaw(builder.getMutableConfig())) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
        } else if (isOutputFormatRawJpeg(builder.getMutableConfig())) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 256);
        } else if (isOutputFormatUltraHdr(builder.getMutableConfig())) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, Integer.valueOf(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY));
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
        } else if (zEnforceSoftwareJpegConstraints) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
        } else {
            List list = (List) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
            if (list == null || isImageFormatSupported(list, 256)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (isImageFormatSupported(list, 35)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onSessionStop() {
        abortImageCaptureRequests();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
        abortImageCaptureRequests();
        clearPipeline();
        setScreenFlashToCameraControl(null);
    }

    public void setScreenFlash(ScreenFlash screenFlash) {
        this.mScreenFlashWrapper = ScreenFlashWrapper.from(screenFlash);
        setScreenFlashToCameraControl();
    }

    public void setTargetRotation(int i11) {
        int targetRotation = getTargetRotation();
        if (setTargetRotationInternal(i11) && this.mCropAspectRatio != null) {
            this.mCropAspectRatio = ImageUtil.getRotatedAspectRatio(Math.abs(CameraOrientationUtil.surfaceRotationToDegrees(i11) - CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.mCropAspectRatio);
        }
    }

    @MainThread
    public ListenableFuture<Void> submitStillCaptureRequest(List<CaptureConfig> list) {
        Threads.checkMainThread();
        return Futures.transform(getCameraControl().submitStillCaptureRequests(list, this.mCaptureMode, this.mFlashType), new Function() { // from class: androidx.camera.core.e0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ImageCapture.m1862e((List) obj);
            }
        }, CameraXExecutors.directExecutor());
    }

    public void takePicture(final OutputFileOptions outputFileOptions, final Executor executor, final OnImageSavedCallback onImageSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1572b.takePicture(outputFileOptions, executor, onImageSavedCallback);
                }
            });
        } else {
            takePictureInternal(executor, null, onImageSavedCallback, outputFileOptions, null);
        }
    }

    public void takePicture(final OutputFileOptions outputFileOptions, final OutputFileOptions outputFileOptions2, final Executor executor, final OnImageSavedCallback onImageSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1583b.takePicture(outputFileOptions, outputFileOptions2, executor, onImageSavedCallback);
                }
            });
        } else {
            takePictureInternal(executor, null, onImageSavedCallback, outputFileOptions, outputFileOptions2);
        }
    }

    public static abstract class OnImageCapturedCallback {
        public void onCaptureStarted() {
        }

        public void onCaptureProcessProgressed(int i11) {
        }

        public void onCaptureSuccess(ImageProxy imageProxy) {
        }

        public void onError(ImageCaptureException imageCaptureException) {
        }

        public void onPostviewBitmapAvailable(Bitmap bitmap) {
        }
    }

    public interface OnImageSavedCallback {
        void onError(ImageCaptureException imageCaptureException);

        void onImageSaved(OutputFileResults outputFileResults);

        default void onCaptureStarted() {
        }

        default void onCaptureProcessProgressed(int i11) {
        }

        default void onPostviewBitmapAvailable(Bitmap bitmap) {
        }
    }
}
