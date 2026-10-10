package androidx.camera.video;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.C1100n;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.ResolutionInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.SwappedVideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoCapture<T extends VideoOutput> extends UseCase {
    private static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final String SURFACE_UPDATE_KEY = "androidx.camera.video.VideoCapture.streamUpdate";
    private static final String TAG = "VideoCapture";
    private SurfaceEdge mCameraEdge;
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private Rect mCropRect;
    DeferrableSurface mDeferrableSurface;
    private boolean mHasCompensatingTransformation;
    private SurfaceProcessorNode mNode;
    private Map<Quality, List<Size>> mQualityToCustomSizesMap;
    private int mRotationDegrees;
    SessionConfig.Builder mSessionConfigBuilder;
    VideoOutput.SourceState mSourceState;
    private SourceStreamRequirementObserver mSourceStreamRequirementObserver;
    StreamInfo mStreamInfo;
    private final Observable.Observer<StreamInfo> mStreamInfoObserver;
    private SurfaceRequest mSurfaceRequest;
    ListenableFuture<Void> mSurfaceUpdateFuture;

    /* JADX INFO: renamed from: androidx.camera.video.VideoCapture$2 */
    public class C12742 extends CameraCaptureCallback {
        private boolean mIsFirstCaptureResult = true;
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ SessionConfig.Builder val$sessionConfigBuilder;
        final /* synthetic */ AtomicBoolean val$surfaceUpdateComplete;

        public C12742(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, SessionConfig.Builder builder) {
            this.val$surfaceUpdateComplete = atomicBoolean;
            this.val$completer = completer;
            this.val$sessionConfigBuilder = builder;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2151a(C12742 c12742, SessionConfig.Builder builder) {
            c12742.getClass();
            builder.removeCameraCaptureCallback(c12742);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i11, CameraCaptureResult cameraCaptureResult) {
            Object tag;
            super.onCaptureCompleted(i11, cameraCaptureResult);
            if (this.mIsFirstCaptureResult) {
                this.mIsFirstCaptureResult = false;
                Logger.m1866d(VideoCapture.TAG, "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (!this.val$surfaceUpdateComplete.get() && (tag = cameraCaptureResult.getTagBundle().getTag(VideoCapture.SURFACE_UPDATE_KEY)) != null && ((Integer) tag).intValue() == this.val$completer.hashCode() && this.val$completer.set(null) && !this.val$surfaceUpdateComplete.getAndSet(true)) {
                ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                final SessionConfig.Builder builder = this.val$sessionConfigBuilder;
                scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.video.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCapture.C12742.m2151a(this.f2116b, builder);
                    }
                });
            }
        }
    }

    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ImageInputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder(T t11) {
            this(createInitialBundle(t11));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder<? extends VideoOutput> fromConfig(Config config) {
            return new Builder<>(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setCustomOrderedResolutions(List list) {
            return setCustomOrderedResolutions((List<Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            if (!mutableOptionsBundle.containsOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(VideoCapture.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
                setTargetClass((Class) VideoCapture.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <T extends VideoOutput> Builder<T> fromConfig(VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public VideoCapture<T> build() {
            return new VideoCapture<>(getUseCaseConfig());
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public VideoCaptureConfig<T> getUseCaseConfig() {
            return new VideoCaptureConfig<>(OptionsBundle.from(this.mMutableConfig));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCustomOrderedResolutions(List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public Builder<T> setDynamicRange(DynamicRange dynamicRange) {
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setHighResolutionDisabled(boolean z11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z11));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setMirrorMode(int i11) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i11));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setStreamUseCase(StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSurfaceOccupancyPriority(int i11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i11));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetAspectRatio(int i11) {
            throw new UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetClass(Class<VideoCapture<T>> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + C33820nf.f71144W + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetResolution(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetRotation(int i11) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i11));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setZslDisabled(boolean z11) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z11));
            return this;
        }

        private static <T extends VideoOutput> MutableOptionsBundle createInitialBundle(T t11) {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            mutableOptionsBundleCreate.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, t11);
            return mutableOptionsBundleCreate;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSurfaceProcessingForceEnabled() {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_FORCE_ENABLE_SURFACE_PROCESSING, Boolean.TRUE);
            return this;
        }

        public Builder<T> setTargetFrameRate(Range<Integer> range) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        public Builder<T> setVideoEncoderInfoFinder(VideoEncoderInfo.Finder finder) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, finder);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setVideoOutput(VideoOutput videoOutput) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            return this;
        }

        public Builder<T> setVideoStabilizationEnabled(boolean z11) {
            int i11;
            MutableConfig mutableConfig = getMutableConfig();
            Config.Option<Integer> option = UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE;
            if (z11) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            mutableConfig.insertOption(option, Integer.valueOf(i11));
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {
        private static final VideoCaptureConfig<?> DEFAULT_CONFIG;
        static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        static final Range<Integer> DEFAULT_FPS_RANGE;
        static final Range<Integer> DEFAULT_HIGH_SPEED_FPS_RANGE;
        private static final StreamUseCase DEFAULT_STREAM_USE_CASE;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 5;
        private static final VideoEncoderInfo.Finder DEFAULT_VIDEO_ENCODER_INFO_FINDER;
        private static final VideoOutput DEFAULT_VIDEO_OUTPUT;

        static {
            StreamUseCase streamUseCase = StreamUseCase.VIDEO_RECORD;
            DEFAULT_STREAM_USE_CASE = streamUseCase;
            VideoOutput videoOutput = new VideoOutput() { // from class: androidx.camera.video.w0
                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }
            };
            DEFAULT_VIDEO_OUTPUT = videoOutput;
            VideoEncoderInfo.Finder finder = VideoEncoderInfoImpl.FINDER;
            DEFAULT_VIDEO_ENCODER_INFO_FINDER = finder;
            DEFAULT_FPS_RANGE = new Range<>(30, 30);
            DEFAULT_HIGH_SPEED_FPS_RANGE = new Range<>(120, 120);
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new Builder(videoOutput).setSurfaceOccupancyPriority(5).setStreamUseCase(streamUseCase).setVideoEncoderInfoFinder(finder).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public VideoCaptureConfig<?> getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static class SourceStreamRequirementObserver implements Observable.Observer<Boolean> {
        private CameraControlInternal mCameraControl;
        private boolean mIsSourceStreamRequired = false;

        private void updateVideoUsageInCamera(boolean z11) {
            if (this.mIsSourceStreamRequired == z11) {
                return;
            }
            this.mIsSourceStreamRequired = z11;
            CameraControlInternal cameraControlInternal = this.mCameraControl;
            if (cameraControlInternal == null) {
                Logger.m1866d(VideoCapture.TAG, "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z11) {
                cameraControlInternal.incrementVideoUsage();
            } else {
                cameraControlInternal.decrementVideoUsage();
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th2) {
            Logger.m1873w(VideoCapture.TAG, "SourceStreamRequirementObserver#onError", th2);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        @MainThread
        public void onNewData(Boolean bool) {
            Preconditions.checkState(Threads.isMainThread(), "SourceStreamRequirementObserver can be updated from main thread only");
            updateVideoUsageInCamera(Boolean.TRUE.equals(bool));
        }

        public SourceStreamRequirementObserver(CameraControlInternal cameraControlInternal) {
            this.mCameraControl = cameraControlInternal;
        }

        @MainThread
        public void close() {
            Preconditions.checkState(Threads.isMainThread(), "SourceStreamRequirementObserver can be closed from main thread only");
            Logger.m1866d(VideoCapture.TAG, "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.mIsSourceStreamRequired);
            if (this.mCameraControl == null) {
                Logger.m1866d(VideoCapture.TAG, "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                updateVideoUsageInCamera(false);
                this.mCameraControl = null;
            }
        }
    }

    private static int alignDown(int i11, int i12, Range<Integer> range) {
        return align(true, i11, i12, range);
    }

    private static int alignUp(int i11, int i12, Range<Integer> range) {
        return align(false, i11, i12, range);
    }

    private int getSessionType(VideoCaptureConfig<T> videoCaptureConfig) {
        return videoCaptureConfig.getSessionType(0);
    }

    private List<Size> getSupportedResolutions(CameraInfoInternal cameraInfoInternal, int i11, Range<Integer> range) {
        if (i11 == 1) {
            return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range) ? cameraInfoInternal.getSupportedHighSpeedResolutions() : cameraInfoInternal.getSupportedHighSpeedResolutionsFor(range);
        }
        return cameraInfoInternal.getSupportedResolutions(getImageFormat());
    }

    private boolean isCreateNodeNeeded(CameraInternal cameraInternal, VideoCaptureConfig<?> videoCaptureConfig, int i11, Rect rect, Size size, DynamicRange dynamicRange) {
        if (i11 == 1) {
            return false;
        }
        return getEffect() != null || shouldEnableSurfaceProcessingByConfig(cameraInternal, videoCaptureConfig) || shouldEnableSurfaceProcessingByQuirk(cameraInternal) || shouldEnableSurfaceProcessingBasedOnDynamicRangeByQuirk(cameraInternal, dynamicRange) || shouldCrop(rect, size) || shouldMirror(cameraInternal) || shouldCompensateTransformation();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<DynamicRange> getSupportedDynamicRanges(CameraInfoInternal cameraInfoInternal) {
        return getVideoCapabilities(cameraInfoInternal, 0).getSupportedDynamicRanges();
    }

    public Range<Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    private static void addBySupportedSize(Set<Size> set, int i11, int i12, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i11 > size.getWidth() || i12 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i11, ((Integer) videoEncoderInfo.getSupportedHeightsFor(i11).clamp(Integer.valueOf(i12))).intValue()));
        } catch (IllegalArgumentException e11) {
            Logger.m1873w(TAG, "No supportedHeights for width: " + i11, e11);
        }
        try {
            set.add(new Size(((Integer) videoEncoderInfo.getSupportedWidthsFor(i12).clamp(Integer.valueOf(i11))).intValue(), i12));
        } catch (IllegalArgumentException e12) {
            Logger.m1873w(TAG, "No supportedWidths for height: " + i12, e12);
        }
    }

    private static Rect adjustCropRectByQuirk(Rect rect, int i11, boolean z11, VideoEncoderInfo videoEncoderInfo) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) DeviceQuirks.get(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z11) {
            i11 = 0;
        }
        return sizeCannotEncodeVideoQuirk.adjustCropRectForProblematicEncodeSize(rect, i11, videoEncoderInfo);
    }

    private static int align(boolean z11, int i11, int i12, Range<Integer> range) {
        int i13 = i11 % i12;
        if (i13 != 0) {
            i11 = z11 ? i11 - i13 : i11 + (i12 - i13);
        }
        return ((Integer) range.clamp(Integer.valueOf(i11))).intValue();
    }

    @SuppressLint({"WrongConstant"})
    @MainThread
    private SessionConfig.Builder createPipeline(final VideoCaptureConfig<T> videoCaptureConfig, StreamSpec streamSpec) {
        final VideoCapture<T> videoCapture = this;
        Threads.checkMainThread();
        final CameraInternal cameraInternal = (CameraInternal) Preconditions.checkNotNull(videoCapture.getCamera());
        Size resolution = streamSpec.getResolution();
        Runnable runnable = new Runnable() { // from class: androidx.camera.video.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2088b.notifyReset();
            }
        };
        Range<Integer> rangeResolveFrameRate = resolveFrameRate(streamSpec);
        MediaSpec mediaSpec = videoCapture.getMediaSpec();
        Objects.requireNonNull(mediaSpec);
        int sessionType = streamSpec.getSessionType();
        VideoCapabilities videoCapabilities = videoCapture.getVideoCapabilities(cameraInternal.getCameraInfo(), sessionType);
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        VideoEncoderInfo videoEncoderInfoResolveVideoEncoderInfo = resolveVideoEncoderInfo(videoCaptureConfig.getVideoEncoderInfoFinder(), videoCapabilities.findNearestHigherSupportedEncoderProfilesFor(resolution, dynamicRange), mediaSpec, dynamicRange);
        videoCapture.mRotationDegrees = videoCapture.getCompensatedRotation(cameraInternal);
        Rect rectCalculateCropRect = videoCapture.calculateCropRect(resolution, videoEncoderInfoResolveVideoEncoderInfo);
        Rect rectAdjustCropRectWithInProgressTransformation = videoCapture.adjustCropRectWithInProgressTransformation(rectCalculateCropRect, videoCapture.mRotationDegrees);
        videoCapture.mCropRect = rectAdjustCropRectWithInProgressTransformation;
        Size sizeAdjustResolutionWithInProgressTransformation = videoCapture.adjustResolutionWithInProgressTransformation(resolution, rectCalculateCropRect, rectAdjustCropRectWithInProgressTransformation);
        if (videoCapture.shouldCompensateTransformation()) {
            videoCapture.mHasCompensatingTransformation = true;
        }
        Rect rect = videoCapture.mCropRect;
        Rect rectAdjustCropRectByQuirk = adjustCropRectByQuirk(rect, videoCapture.mRotationDegrees, videoCapture.isCreateNodeNeeded(cameraInternal, videoCaptureConfig, sessionType, rect, resolution, dynamicRange), videoEncoderInfoResolveVideoEncoderInfo);
        videoCapture.mCropRect = rectAdjustCropRectByQuirk;
        videoCapture.mNode = videoCapture.createNodeIfNeeded(cameraInternal, videoCaptureConfig, sessionType, rectAdjustCropRectByQuirk, resolution, dynamicRange);
        final boolean z11 = (cameraInternal.getHasTransform() && videoCapture.mNode == null) ? false : true;
        final Timebase timebaseResolveTimebase = resolveTimebase(cameraInternal, videoCapture.mNode);
        Logger.m1866d(TAG, "camera timebase = " + cameraInternal.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebaseResolveTimebase);
        StreamSpec streamSpecBuild = streamSpec.toBuilder().setResolution(sizeAdjustResolutionWithInProgressTransformation).setExpectedFrameRateRange(rangeResolveFrameRate).build();
        Preconditions.checkState(videoCapture.mCameraEdge == null);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, streamSpecBuild, videoCapture.getSensorToBufferTransformMatrix(), cameraInternal.getHasTransform(), videoCapture.mCropRect, videoCapture.mRotationDegrees, videoCapture.getAppTargetRotation(), videoCapture.shouldMirror(cameraInternal));
        videoCapture.mCameraEdge = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(runnable);
        if (videoCapture.mNode != null) {
            OutConfig outConfigM2052of = OutConfig.m2052of(videoCapture.mCameraEdge);
            final SurfaceEdge surfaceEdge2 = videoCapture.mNode.transform(SurfaceProcessorNode.AbstractC1107In.m2034of(videoCapture.mCameraEdge, Collections.singletonList(outConfigM2052of))).get(outConfigM2052of);
            Objects.requireNonNull(surfaceEdge2);
            videoCapture = this;
            surfaceEdge2.addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.video.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2090b.onAppEdgeInvalidated(surfaceEdge2, cameraInternal, videoCaptureConfig, timebaseResolveTimebase, z11);
                }
            });
            videoCapture.mSurfaceRequest = surfaceEdge2.createSurfaceRequest(cameraInternal);
            final DeferrableSurface deferrableSurface = videoCapture.mCameraEdge.getDeferrableSurface();
            videoCapture.mDeferrableSurface = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.o0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.m2147d(this.f2097b, deferrableSurface);
                }
            }, CameraXExecutors.mainThreadExecutor());
        } else {
            SurfaceRequest surfaceRequestCreateSurfaceRequest = videoCapture.mCameraEdge.createSurfaceRequest(cameraInternal);
            videoCapture.mSurfaceRequest = surfaceRequestCreateSurfaceRequest;
            videoCapture.mDeferrableSurface = surfaceRequestCreateSurfaceRequest.getDeferrableSurface();
        }
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(videoCapture.mSurfaceRequest, timebaseResolveTimebase, z11);
        videoCapture.sendTransformationInfoIfReady();
        videoCapture.mDeferrableSurface.setContainerClass(MediaCodec.class);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(videoCaptureConfig, streamSpec.getResolution());
        builderCreateFrom.setSessionType(sessionType);
        videoCapture.applyExpectedFrameRateRange(builderCreateFrom, streamSpec);
        builderCreateFrom.setVideoStabilization(videoCaptureConfig.getVideoStabilizationMode());
        SessionConfig.CloseableErrorListener closeableErrorListener = videoCapture.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.video.p0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f2100a.resetPipeline();
            }
        });
        videoCapture.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return builderCreateFrom;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2147d(VideoCapture videoCapture, DeferrableSurface deferrableSurface) {
        if (deferrableSurface == videoCapture.mDeferrableSurface) {
            videoCapture.clearPipeline();
        }
    }

    private Range<Integer> getTargetFrameRate(VideoCaptureConfig<T> videoCaptureConfig) {
        Range<Integer> targetFrameRate = videoCaptureConfig.getTargetFrameRate(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        Objects.requireNonNull(targetFrameRate);
        return targetFrameRate;
    }

    private static Timebase resolveTimebase(CameraInternal cameraInternal, SurfaceProcessorNode surfaceProcessorNode) {
        return (surfaceProcessorNode == null && cameraInternal.getHasTransform()) ? Timebase.UPTIME : cameraInternal.getCameraInfoInternal().getTimebase();
    }

    private void setCustomOrderedResolutions(UseCaseConfig.Builder<?, ?, ?> builder, LinkedHashMap<Quality, List<Size>> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        Logger.m1866d(TAG, "Set custom ordered resolutions = " + arrayList);
        builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList);
        this.mQualityToCustomSizesMap = linkedHashMap;
    }

    @MainThread
    private void setupSurfaceUpdateNotifier(final SessionConfig.Builder builder, final boolean z11) {
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m1866d(TAG, "A newer surface update is requested. Previous surface update cancelled.");
        }
        final ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.s0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoCapture.m2150g(this.f2111a, builder, completer);
            }
        });
        this.mSurfaceUpdateFuture = future;
        Futures.addCallback(future, new FutureCallback<Void>() { // from class: androidx.camera.video.VideoCapture.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (th2 instanceof CancellationException) {
                    return;
                }
                Logger.m1869e(VideoCapture.TAG, "Surface update completed with unexpected exception", th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
                ListenableFuture<Void> listenableFuture2 = future;
                VideoCapture videoCapture = VideoCapture.this;
                if (listenableFuture2 != videoCapture.mSurfaceUpdateFuture || videoCapture.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                videoCapture.setSourceState(z11 ? VideoOutput.SourceState.ACTIVE_STREAMING : VideoOutput.SourceState.ACTIVE_NON_STREAMING);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private boolean shouldCompensateTransformation() {
        return this.mStreamInfo.getInProgressTransformationInfo() != null;
    }

    private static boolean shouldEnableSurfaceProcessingBasedOnDynamicRangeByQuirk(CameraInternal cameraInternal, DynamicRange dynamicRange) {
        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) DeviceQuirks.get(HdrRepeatingRequestFailureQuirk.class);
        return cameraInternal.getHasTransform() && hdrRepeatingRequestFailureQuirk != null && hdrRepeatingRequestFailureQuirk.workaroundBySurfaceProcessing(dynamicRange);
    }

    public static <T extends VideoOutput> VideoCapture<T> withOutput(T t11) {
        return new Builder((VideoOutput) Preconditions.checkNotNull(t11)).build();
    }

    @VisibleForTesting
    public SurfaceEdge getCameraEdge() {
        return this.mCameraEdge;
    }

    @VisibleForTesting
    public Rect getCropRect() {
        return this.mCropRect;
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

    @VisibleForTesting
    public SurfaceProcessorNode getNode() {
        return this.mNode;
    }

    @VisibleForTesting
    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @VisibleForTesting
    public SurfaceRequest getSurfaceRequest() {
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        Objects.requireNonNull(surfaceRequest);
        return surfaceRequest;
    }

    public boolean isStreamIdChanged(int i11, int i12) {
        Set<Integer> set = StreamInfo.NON_SURFACE_STREAM_ID;
        return (set.contains(Integer.valueOf(i11)) || set.contains(Integer.valueOf(i12)) || i11 == i12) ? false : true;
    }

    @Override // androidx.camera.core.UseCase
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onSessionStop() {
        Logger.m1866d(TAG, "VideoCapture#onStateDetached");
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        if (this.mSourceStreamRequirementObserver != null) {
            getOutput().isSourceStreamRequired().removeObserver(this.mSourceStreamRequirementObserver);
            this.mSourceStreamRequirementObserver.close();
            this.mSourceStreamRequirementObserver = null;
        }
        setSourceState(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.mStreamInfoObserver);
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m1866d(TAG, "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        clearPipeline();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(C1100n.m2002a(new Object[]{this.mSessionConfigBuilder.build()}));
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        Objects.requireNonNull(attachedStreamSpec);
        return attachedStreamSpec.toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec, StreamSpec streamSpec2) {
        Logger.m1866d(TAG, "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + streamSpec + ", secondaryStreamSpec " + streamSpec2);
        List<Size> customOrderedResolutions = ((VideoCaptureConfig) getCurrentConfig()).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(streamSpec.getResolution())) {
            Logger.m1872w(TAG, "suggested resolution " + streamSpec.getResolution() + " is not in custom ordered resolutions " + customOrderedResolutions);
        }
        return streamSpec;
    }

    @MainThread
    public void setSourceState(VideoOutput.SourceState sourceState) {
        if (sourceState != this.mSourceState) {
            this.mSourceState = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    public boolean shouldResetCompensatingTransformation(StreamInfo streamInfo, StreamInfo streamInfo2) {
        return this.mHasCompensatingTransformation && streamInfo.getInProgressTransformationInfo() != null && streamInfo2.getInProgressTransformationInfo() == null;
    }

    public String toString() {
        return "VideoCapture:" + getName();
    }

    public VideoCapture(VideoCaptureConfig<T> videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mSurfaceUpdateFuture = null;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mHasCompensatingTransformation = false;
        this.mQualityToCustomSizesMap = Collections.EMPTY_MAP;
        this.mStreamInfoObserver = new Observable.Observer<StreamInfo>() { // from class: androidx.camera.video.VideoCapture.1
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th2) {
                Logger.m1873w(VideoCapture.TAG, "Receive onError from StreamState observer", th2);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(StreamInfo streamInfo) {
                if (streamInfo == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                if (VideoCapture.this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                Logger.m1866d(VideoCapture.TAG, "Stream info update: old: " + VideoCapture.this.mStreamInfo + " new: " + streamInfo);
                VideoCapture videoCapture = VideoCapture.this;
                StreamInfo streamInfo2 = videoCapture.mStreamInfo;
                videoCapture.mStreamInfo = streamInfo;
                StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(videoCapture.getAttachedStreamSpec());
                if (VideoCapture.this.isStreamIdChanged(streamInfo2.getId(), streamInfo.getId()) || VideoCapture.this.shouldResetCompensatingTransformation(streamInfo2, streamInfo)) {
                    VideoCapture.this.resetPipeline();
                    return;
                }
                if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                    VideoCapture videoCapture2 = VideoCapture.this;
                    videoCapture2.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture2.mSessionConfigBuilder, streamInfo, streamSpec);
                    VideoCapture videoCapture3 = VideoCapture.this;
                    videoCapture3.updateSessionConfig(C1100n.m2002a(new Object[]{videoCapture3.mSessionConfigBuilder.build()}));
                    VideoCapture.this.notifyReset();
                    return;
                }
                if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                    VideoCapture videoCapture4 = VideoCapture.this;
                    videoCapture4.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture4.mSessionConfigBuilder, streamInfo, streamSpec);
                    VideoCapture videoCapture5 = VideoCapture.this;
                    videoCapture5.updateSessionConfig(C1100n.m2002a(new Object[]{videoCapture5.mSessionConfigBuilder.build()}));
                    VideoCapture.this.notifyUpdated();
                }
            }
        };
    }

    private static Rect adjustCropRectToValidSize(final Rect rect, Size size, VideoEncoderInfo videoEncoderInfo) {
        boolean z11;
        Logger.m1866d(TAG, String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(rect), Integer.valueOf(videoEncoderInfo.getWidthAlignment()), Integer.valueOf(videoEncoderInfo.getHeightAlignment()), videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
        if ((!videoEncoderInfo.getSupportedWidths().contains(Integer.valueOf(rect.width())) || !videoEncoderInfo.getSupportedHeights().contains(Integer.valueOf(rect.height()))) && videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.getSupportedHeights().contains(Integer.valueOf(rect.width())) && videoEncoderInfo.getSupportedWidths().contains(Integer.valueOf(rect.height()))) {
            videoEncoderInfo = new SwappedVideoEncoderInfo(videoEncoderInfo);
        }
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
        Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
        int iAlignDown = alignDown(rect.width(), widthAlignment, supportedWidths);
        int iAlignUp = alignUp(rect.width(), widthAlignment, supportedWidths);
        int iAlignDown2 = alignDown(rect.height(), heightAlignment, supportedHeights);
        int iAlignUp2 = alignUp(rect.height(), heightAlignment, supportedHeights);
        HashSet hashSet = new HashSet();
        addBySupportedSize(hashSet, iAlignDown, iAlignDown2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignDown, iAlignUp2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignUp, iAlignDown2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignUp, iAlignUp2, size, videoEncoderInfo);
        if (hashSet.isEmpty()) {
            Logger.m1872w(TAG, "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Logger.m1866d(TAG, "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.r0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VideoCapture.m2146c(rect, (Size) obj, (Size) obj2);
            }
        });
        Logger.m1866d(TAG, "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            Logger.m1866d(TAG, "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        if (width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int iMax = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = iMax;
            int i11 = iMax + width;
            rect2.right = i11;
            if (i11 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int iMax2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = iMax2;
            int i12 = iMax2 + height;
            rect2.bottom = i12;
            if (i12 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        Logger.m1866d(TAG, String.format("Adjust cropRect from %s to %s", TransformUtils.rectToString(rect), TransformUtils.rectToString(rect2)));
        return rect2;
    }

    private Rect adjustCropRectWithInProgressTransformation(Rect rect, int i11) {
        if (shouldCompensateTransformation()) {
            return TransformUtils.sizeToRect(TransformUtils.getRotatedSize(((SurfaceRequest.TransformationInfo) Preconditions.checkNotNull(this.mStreamInfo.getInProgressTransformationInfo())).getCropRect(), i11));
        }
        return rect;
    }

    private Size adjustResolutionWithInProgressTransformation(Size size, Rect rect, Rect rect2) {
        if (shouldCompensateTransformation() && !rect2.equals(rect)) {
            float fHeight = rect2.height() / rect.height();
            return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
        }
        return size;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m2146c(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    private Rect calculateCropRect(Size size, VideoEncoderInfo videoEncoderInfo) {
        Rect rect;
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (videoEncoderInfo != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(rect.width(), rect.height())) {
            return adjustCropRectToValidSize(rect, size, videoEncoderInfo);
        }
        return rect;
    }

    @MainThread
    private void clearPipeline() {
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
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
        this.mCropRect = null;
        this.mSurfaceRequest = null;
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mRotationDegrees = 0;
        this.mHasCompensatingTransformation = false;
    }

    private SurfaceProcessorNode createNodeIfNeeded(CameraInternal cameraInternal, VideoCaptureConfig<T> videoCaptureConfig, int i11, Rect rect, Size size, DynamicRange dynamicRange) {
        SurfaceProcessorInternal surfaceProcessorInternalNewInstance;
        if (isCreateNodeNeeded(cameraInternal, videoCaptureConfig, i11, rect, size, dynamicRange)) {
            Logger.m1866d(TAG, "Surface processing is enabled.");
            CameraInternal camera = getCamera();
            Objects.requireNonNull(camera);
            CameraInternal cameraInternal2 = camera;
            if (getEffect() != null) {
                surfaceProcessorInternalNewInstance = getEffect().createSurfaceProcessorInternal();
            } else {
                surfaceProcessorInternalNewInstance = DefaultSurfaceProcessor.Factory.newInstance(dynamicRange);
            }
            return new SurfaceProcessorNode(cameraInternal2, surfaceProcessorInternalNewInstance);
        }
        return null;
    }

    private LinkedHashMap<Quality, List<Size>> createOrderedQualityToSizesMap(CameraInfoInternal cameraInfoInternal, MediaSpec mediaSpec, DynamicRange dynamicRange, VideoCapabilities videoCapabilities, int i11, Range<Integer> range, VideoEncoderInfo.Finder finder, List<Quality> list) {
        int aspectRatio = mediaSpec.getVideoSpec().getAspectRatio();
        Map<Quality, Size> qualityToResolutionMap = QualitySelector.getQualityToResolutionMap(videoCapabilities, dynamicRange);
        QualityRatioToResolutionsTable qualityRatioToResolutionsTable = new QualityRatioToResolutionsTable(getSupportedResolutions(cameraInfoInternal, i11, range), qualityToResolutionMap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Quality quality : list) {
            linkedHashMap.put(quality, qualityRatioToResolutionsTable.getResolutions(quality, aspectRatio));
        }
        return filterOutEncoderUnsupportedResolutions(finder, mediaSpec, dynamicRange, videoCapabilities, linkedHashMap, qualityToResolutionMap);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2149f(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    private static <T> T fetchObservableValue(Observable<T> observable, T t11) {
        ListenableFuture<T> listenableFutureFetchData = observable.fetchData();
        if (!listenableFutureFetchData.isDone()) {
            return t11;
        }
        try {
            return listenableFutureFetchData.get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static LinkedHashMap<Quality, List<Size>> filterOutEncoderUnsupportedResolutions(VideoEncoderInfo.Finder finder, MediaSpec mediaSpec, DynamicRange dynamicRange, VideoCapabilities videoCapabilities, LinkedHashMap<Quality, List<Size>> linkedHashMap, Map<Quality, Size> map) {
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor;
        VideoEncoderInfo videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo;
        if (linkedHashMap.isEmpty()) {
            return new LinkedHashMap<>();
        }
        LinkedHashMap<Quality, List<Size>> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry<Quality, List<Size>> entry : linkedHashMap.entrySet()) {
            ArrayList arrayList = new ArrayList(entry.getValue());
            Iterator<Size> it = arrayList.iterator();
            while (it.hasNext()) {
                Size next = it.next();
                if (!map.containsValue(next) && (videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor = videoCapabilities.findNearestHigherSupportedEncoderProfilesFor(next, dynamicRange)) != null && (videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo = findLargestSupportedSizeVideoEncoderInfo(finder, videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor, dynamicRange, mediaSpec)) != null && !videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo.isSizeSupportedAllowSwapping(next.getWidth(), next.getHeight())) {
                    it.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put(entry.getKey(), arrayList);
            }
        }
        return linkedHashMap2;
    }

    private static VideoEncoderInfo findLargestSupportedSizeVideoEncoderInfo(VideoEncoderInfo.Finder finder, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, DynamicRange dynamicRange, MediaSpec mediaSpec) {
        VideoEncoderInfo videoEncoderInfoResolveVideoEncoderInfo;
        int area;
        if (dynamicRange.isFullySpecified()) {
            return resolveVideoEncoderInfo(finder, videoValidatedEncoderProfilesProxy, mediaSpec, dynamicRange);
        }
        VideoEncoderInfo videoEncoderInfo = null;
        int i11 = Integer.MIN_VALUE;
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : videoValidatedEncoderProfilesProxy.getVideoProfiles()) {
            if (DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange) && (videoEncoderInfoResolveVideoEncoderInfo = resolveVideoEncoderInfo(finder, videoValidatedEncoderProfilesProxy, mediaSpec, new DynamicRange(DynamicRangeUtil.videoProfileHdrFormatsToDynamicRangeEncoding(videoProfileProxy.getHdrFormat()), DynamicRangeUtil.videoProfileBitDepthToDynamicRangeBitDepth(videoProfileProxy.getBitDepth())))) != null && (area = SizeUtil.getArea(((Integer) videoEncoderInfoResolveVideoEncoderInfo.getSupportedWidths().getUpper()).intValue(), ((Integer) videoEncoderInfoResolveVideoEncoderInfo.getSupportedHeights().getUpper()).intValue())) > i11) {
                videoEncoderInfo = videoEncoderInfoResolveVideoEncoderInfo;
                i11 = area;
            }
        }
        return videoEncoderInfo;
    }

    private static Quality findNearestSizeFor(Map<Quality, List<Size>> map, Size size) {
        int area = SizeUtil.getArea(size);
        Quality key = null;
        int i11 = Integer.MAX_VALUE;
        for (Map.Entry<Quality, List<Size>> entry : map.entrySet()) {
            Iterator<Size> it = entry.getValue().iterator();
            while (it.hasNext()) {
                int iAbs = Math.abs(SizeUtil.getArea(it.next()) - area);
                if (iAbs < i11) {
                    key = entry.getKey();
                    i11 = iAbs;
                }
            }
        }
        return key;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m2150g(VideoCapture videoCapture, final SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        videoCapture.getClass();
        builder.addTag(SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C12742 c12742 = new C12742(atomicBoolean, completer, builder);
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.q0
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.m2149f(atomicBoolean, builder, c12742);
            }
        }, CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(c12742);
        return String.format("%s[0x%x]", SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
    }

    private int getCompensatedRotation(CameraInternal cameraInternal) {
        boolean zIsMirroringRequired = isMirroringRequired(cameraInternal);
        int relativeRotation = getRelativeRotation(cameraInternal, zIsMirroringRequired);
        if (shouldCompensateTransformation()) {
            SurfaceRequest.TransformationInfo inProgressTransformationInfo = this.mStreamInfo.getInProgressTransformationInfo();
            Objects.requireNonNull(inProgressTransformationInfo);
            int rotationDegrees = inProgressTransformationInfo.getRotationDegrees();
            if (zIsMirroringRequired != inProgressTransformationInfo.isMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            return TransformUtils.within360(relativeRotation - rotationDegrees);
        }
        return relativeRotation;
    }

    private MediaSpec getMediaSpec() {
        return (MediaSpec) fetchObservableValue(getOutput().getMediaSpec(), null);
    }

    private MediaSpec getMediaSpecOrThrow() throws IllegalArgumentException {
        MediaSpec mediaSpec = getMediaSpec();
        if (mediaSpec != null) {
            return mediaSpec;
        }
        throw new IllegalArgumentException("MediaSpec can't be null");
    }

    private List<Quality> getSelectedQualityOrThrow(List<Quality> list, QualitySelector qualitySelector) throws IllegalArgumentException {
        List<Quality> prioritizedQualities = qualitySelector.getPrioritizedQualities(list);
        Logger.m1866d(TAG, "Found selectedQualities " + prioritizedQualities + " by " + qualitySelector);
        if (!prioritizedQualities.isEmpty()) {
            return prioritizedQualities;
        }
        throw new IllegalArgumentException("Unable to find selected quality");
    }

    private List<Quality> getSupportedQualitiesOrThrow(DynamicRange dynamicRange, VideoCapabilities videoCapabilities, int i11) throws IllegalArgumentException {
        List<Quality> supportedQualities = videoCapabilities.getSupportedQualities(dynamicRange);
        Logger.m1866d(TAG, "supportedQualities = " + supportedQualities);
        if (supportedQualities.isEmpty() && i11 == 1) {
            throw new IllegalArgumentException("No supported quality on the device for high-speed capture.");
        }
        return supportedQualities;
    }

    private VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo, int i11) {
        return getOutput().getMediaCapabilities(cameraInfo, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAppEdgeInvalidated(SurfaceEdge surfaceEdge, CameraInternal cameraInternal, VideoCaptureConfig<T> videoCaptureConfig, Timebase timebase, boolean z11) {
        if (cameraInternal == getCamera()) {
            this.mSurfaceRequest = surfaceEdge.createSurfaceRequest(cameraInternal);
            videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.mSurfaceRequest, timebase, z11);
            sendTransformationInfoIfReady();
        }
    }

    private static Range<Integer> resolveFrameRate(StreamSpec streamSpec) {
        Range<Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        if (Objects.equals(expectedFrameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            if (streamSpec.getSessionType() == 1) {
                return Defaults.DEFAULT_HIGH_SPEED_FPS_RANGE;
            }
            return Defaults.DEFAULT_FPS_RANGE;
        }
        return expectedFrameRateRange;
    }

    private static VideoEncoderInfo resolveVideoEncoderInfo(VideoEncoderInfo.Finder finder, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, DynamicRange dynamicRange) {
        VideoEncoderInfo videoEncoderInfoFind = finder.find(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy).getMimeType());
        Size resolution = null;
        if (videoEncoderInfoFind == null) {
            Logger.m1872w(TAG, "Can't find videoEncoderInfo");
            return null;
        }
        if (videoValidatedEncoderProfilesProxy != null) {
            resolution = videoValidatedEncoderProfilesProxy.getDefaultVideoProfile().getResolution();
        }
        return VideoEncoderInfoWrapper.from(videoEncoderInfoFind, resolution);
    }

    private void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera != null && surfaceEdge != null) {
            int compensatedRotation = getCompensatedRotation(camera);
            this.mRotationDegrees = compensatedRotation;
            surfaceEdge.updateTransformation(compensatedRotation, getAppTargetRotation());
        }
    }

    private static boolean shouldCrop(Rect rect, Size size) {
        if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return false;
        }
        return true;
    }

    private static <T extends VideoOutput> boolean shouldEnableSurfaceProcessingByConfig(CameraInternal cameraInternal, VideoCaptureConfig<T> videoCaptureConfig) {
        if (cameraInternal.getHasTransform() && videoCaptureConfig.isSurfaceProcessingForceEnabled()) {
            return true;
        }
        return false;
    }

    private static boolean shouldEnableSurfaceProcessingByQuirk(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform()) {
            if (SurfaceProcessingQuirk.workaroundBySurfaceProcessing(DeviceQuirks.getAll()) || SurfaceProcessingQuirk.workaroundBySurfaceProcessing(cameraInternal.getCameraInfoInternal().getCameraQuirks())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean shouldMirror(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal)) {
            return true;
        }
        return false;
    }

    private void updateCustomOrderedResolutionsByQuality(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) throws IllegalArgumentException {
        boolean z11;
        MediaSpec mediaSpecOrThrow = getMediaSpecOrThrow();
        QualitySelector qualitySelector = mediaSpecOrThrow.getVideoSpec().getQualitySelector();
        VideoCaptureConfig<T> videoCaptureConfig = (VideoCaptureConfig) builder.getUseCaseConfig();
        if (videoCaptureConfig.containsOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS)) {
            if (qualitySelector == VideoSpec.QUALITY_SELECTOR_AUTO) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "Custom ordered resolutions and QualitySelector can't both be set");
            return;
        }
        DynamicRange dynamicRange = videoCaptureConfig.getDynamicRange();
        int sessionType = getSessionType(videoCaptureConfig);
        Range<Integer> targetFrameRate = getTargetFrameRate(videoCaptureConfig);
        VideoCapabilities videoCapabilities = getVideoCapabilities(cameraInfoInternal, sessionType);
        Logger.m1866d(TAG, "Update custom order resolutions: requestedDynamicRange = " + dynamicRange + ", sessionType = " + sessionType + ", targetFrameRate = " + targetFrameRate);
        List<Quality> supportedQualitiesOrThrow = getSupportedQualitiesOrThrow(dynamicRange, videoCapabilities, sessionType);
        if (supportedQualitiesOrThrow.isEmpty()) {
            Logger.m1872w(TAG, "Can't find any supported quality on the device.");
        } else {
            setCustomOrderedResolutions(builder, createOrderedQualityToSizesMap(cameraInfoInternal, mediaSpecOrThrow, dynamicRange, videoCapabilities, sessionType, targetFrameRate, videoCaptureConfig.getVideoEncoderInfoFinder(), getSelectedQualityOrThrow(supportedQualitiesOrThrow, qualitySelector)));
        }
    }

    @MainThread
    public void applyStreamInfoAndStreamSpecToSessionConfigBuilder(SessionConfig.Builder builder, StreamInfo streamInfo, StreamSpec streamSpec) {
        boolean z11;
        DeferrableSurface deferrableSurface;
        boolean z12 = false;
        if (streamInfo.getId() == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (streamInfo.getStreamState() == StreamInfo.StreamState.ACTIVE) {
            z12 = true;
        }
        if (z11 && z12) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        if (!z11 && (deferrableSurface = this.mDeferrableSurface) != null) {
            if (z12) {
                builder.addSurface(deferrableSurface, dynamicRange, null, -1);
            } else {
                builder.addNonRepeatingSurface(deferrableSurface, dynamicRange);
            }
        }
        setupSurfaceUpdateNotifier(builder, z12);
    }

    public DynamicRange getDynamicRange() {
        if (getCurrentConfig().hasDynamicRange()) {
            return getCurrentConfig().getDynamicRange();
        }
        return Defaults.DEFAULT_DYNAMIC_RANGE;
    }

    public int getMirrorMode() {
        int mirrorModeInternal = getMirrorModeInternal();
        if (mirrorModeInternal == -1) {
            return 0;
        }
        return mirrorModeInternal;
    }

    public T getOutput() {
        return (T) ((VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Rect rect = this.mCropRect;
        int i11 = this.mRotationDegrees;
        if (camera != null && attachedSurfaceResolution != null && rect != null) {
            return new ResolutionInfo(attachedSurfaceResolution, rect, i11);
        }
        return null;
    }

    public Quality getSelectedQuality() {
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        if (attachedStreamSpec == null) {
            return null;
        }
        Size originalConfiguredResolution = attachedStreamSpec.getOriginalConfiguredResolution();
        for (Map.Entry<Quality, List<Size>> entry : this.mQualityToCustomSizesMap.entrySet()) {
            if (entry.getValue().contains(originalConfiguredResolution)) {
                return entry.getKey();
            }
        }
        Logger.m1872w(TAG, "Can't find matched Quality for " + originalConfiguredResolution);
        return findNearestSizeFor(this.mQualityToCustomSizesMap, originalConfiguredResolution);
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isVideoStabilizationEnabled() {
        if (getCurrentConfig().getVideoStabilizationMode() == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        updateCustomOrderedResolutionsByQuality(cameraInfoInternal, builder);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onSessionStart() {
        super.onSessionStart();
        Logger.m1866d(TAG, "VideoCapture#onStateAttached: cameraID = " + getCameraId());
        if (getAttachedStreamSpec() != null && this.mSurfaceRequest == null) {
            StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(getAttachedStreamSpec());
            this.mStreamInfo = (StreamInfo) fetchObservableValue(getOutput().getStreamInfo(), StreamInfo.STREAM_INFO_ANY_INACTIVE);
            SessionConfig.Builder builderCreatePipeline = createPipeline((VideoCaptureConfig) getCurrentConfig(), streamSpec);
            this.mSessionConfigBuilder = builderCreatePipeline;
            applyStreamInfoAndStreamSpecToSessionConfigBuilder(builderCreatePipeline, this.mStreamInfo, streamSpec);
            updateSessionConfig(C1100n.m2002a(new Object[]{this.mSessionConfigBuilder.build()}));
            notifyActive();
            getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.mStreamInfoObserver);
            SourceStreamRequirementObserver sourceStreamRequirementObserver = this.mSourceStreamRequirementObserver;
            if (sourceStreamRequirementObserver != null) {
                sourceStreamRequirementObserver.close();
            }
            this.mSourceStreamRequirementObserver = new SourceStreamRequirementObserver(getCameraControl());
            getOutput().isSourceStreamRequired().addObserver(CameraXExecutors.mainThreadExecutor(), this.mSourceStreamRequirementObserver);
            setSourceState(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
        }
    }

    @MainThread
    public void resetPipeline() {
        if (getCamera() == null) {
            return;
        }
        clearPipeline();
        SessionConfig.Builder builderCreatePipeline = createPipeline((VideoCaptureConfig) getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(getAttachedStreamSpec()));
        this.mSessionConfigBuilder = builderCreatePipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(builderCreatePipeline, this.mStreamInfo, getAttachedStreamSpec());
        updateSessionConfig(C1100n.m2002a(new Object[]{this.mSessionConfigBuilder.build()}));
        notifyReset();
    }

    public void setTargetRotation(int i11) {
        if (setTargetRotationInternal(i11)) {
            sendTransformationInfoIfReady();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }
}
