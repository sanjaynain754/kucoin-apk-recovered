package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalLensFacing;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.LiveDataUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.MediaStoreOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.video.AudioConfig;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CameraController {
    private static final float AE_SIZE = 0.25f;
    private static final float AF_SIZE = 0.16666667f;
    private static final String CAMERA_NOT_ATTACHED = "Use cases not attached to camera.";
    private static final String CAMERA_NOT_INITIALIZED = "Camera not initialized.";

    @Deprecated
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int IMAGE_ANALYSIS = 2;
    public static final int IMAGE_CAPTURE = 1;
    private static final String IMAGE_CAPTURE_DISABLED = "ImageCapture disabled.";
    private static final ImageCapture.ScreenFlash NO_OP_SCREEN_FLASH = new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.CameraController.1
        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void apply(long j11, ImageCapture.ScreenFlashListener screenFlashListener) {
            screenFlashListener.onCompleted();
        }

        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void clear() {
        }
    };
    private static final String PREVIEW_VIEW_NOT_ATTACHED = "PreviewView not attached to CameraController.";
    private static final String TAG = "CameraController";
    public static final int TAP_TO_FOCUS_FAILED = 4;
    public static final int TAP_TO_FOCUS_FOCUSED = 2;
    public static final int TAP_TO_FOCUS_NOT_FOCUSED = 3;
    public static final int TAP_TO_FOCUS_NOT_STARTED = 0;
    public static final int TAP_TO_FOCUS_STARTED = 1;
    public static final int VIDEO_CAPTURE = 4;
    private static final String VIDEO_CAPTURE_DISABLED = "VideoCapture disabled.";
    private static final String VIDEO_RECORDING_UNFINISHED = "Recording video. Only one recording can be active at a time.";
    Recording mActiveRecording;
    private ImageAnalysis.Analyzer mAnalysisAnalyzer;
    private Executor mAnalysisBackgroundExecutor;
    private Executor mAnalysisExecutor;
    private final Context mAppContext;
    Camera mCamera;
    ProcessCameraProviderWrapper mCameraProvider;
    CameraSelector mCameraSelector;

    @VisibleForTesting
    final RotationProvider.Listener mDeviceRotationListener;
    private final Set<CameraEffect> mEffects;
    private int mEnabledUseCases;
    private FocusMeteringResultCallback mFocusMeteringResultCallback;
    ImageAnalysis mImageAnalysis;
    ResolutionSelector mImageAnalysisResolutionSelector;
    OutputSize mImageAnalysisTargetSize;
    ImageCapture mImageCapture;
    Executor mImageCaptureIoExecutor;
    ResolutionSelector mImageCaptureResolutionSelector;
    OutputSize mImageCaptureTargetSize;
    private final ListenableFuture<Void> mInitializationFuture;
    private int mLastKnownRotation;
    private final PendingValue<Boolean> mPendingEnableTorch;
    private final PendingValue<Float> mPendingLinearZoom;
    private final PendingValue<Float> mPendingZoomRatio;
    private boolean mPinchToZoomEnabled;
    Preview mPreview;
    private DynamicRange mPreviewDynamicRange;
    ResolutionSelector mPreviewResolutionSelector;
    OutputSize mPreviewTargetSize;
    Map<Consumer<VideoRecordEvent>, Recording> mRecordingMap;
    private final RotationProvider mRotationProvider;
    private final Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> mScreenFlashUiInfoMap;
    Preview.SurfaceProvider mSurfaceProvider;
    private long mTapToFocusAutoCancelDurationNanos;
    private boolean mTapToFocusEnabled;
    final MutableLiveData<TapToFocusInfo> mTapToFocusInfoState;
    final LiveData<Integer> mTapToFocusState;
    private final ForwardingLiveData<Integer> mTorchState;
    VideoCapture<Recorder> mVideoCapture;
    private DynamicRange mVideoCaptureDynamicRange;
    private int mVideoCaptureMirrorMode;
    QualitySelector mVideoCaptureQualitySelector;
    private Range<Integer> mVideoCaptureTargetFrameRate;
    ViewPort mViewPort;
    private final ForwardingLiveData<ZoomState> mZoomState;

    /* JADX INFO: renamed from: androidx.camera.view.CameraController$2 */
    public class C14162 implements Consumer<VideoRecordEvent> {
        final /* synthetic */ Consumer val$listener;
        final /* synthetic */ Executor val$mainExecutor;

        public C14162(Executor executor, Consumer consumer) {
            this.val$mainExecutor = executor;
            this.val$listener = consumer;
        }

        @Override // androidx.core.util.Consumer
        public void accept(VideoRecordEvent videoRecordEvent) {
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                if (Threads.isMainThread()) {
                    CameraController.this.deactivateRecordingByListener(this);
                } else {
                    this.val$mainExecutor.execute(new Runnable() { // from class: androidx.camera.view.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraController.C14162 c14162 = this.f2156b;
                            CameraController.this.deactivateRecordingByListener(c14162);
                        }
                    });
                }
            }
            this.val$listener.accept(videoRecordEvent);
        }
    }

    public static class FocusMeteringResultCallback implements FutureCallback<FocusMeteringResult> {
        private boolean mIsCanceled = false;
        private final Object mLock = new Object();
        private final PointF mTapPoint;
        private final MutableLiveData<TapToFocusInfo> mTapToFocusInfoState;

        public void close() {
            synchronized (this.mLock) {
                this.mIsCanceled = true;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            synchronized (this.mLock) {
                try {
                    if (this.mIsCanceled) {
                        return;
                    }
                    if (!(th2 instanceof CameraControl.OperationCanceledException)) {
                        Logger.m1867d(CameraController.TAG, "Tap-to-focus failed.", th2);
                        this.mTapToFocusInfoState.postValue(new TapToFocusInfo(4, this.mTapPoint));
                    } else {
                        Logger.m1867d(CameraController.TAG, "Tap-to-focus canceled", th2);
                        this.mTapToFocusInfoState.postValue(new TapToFocusInfo(0, null));
                        close();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(FocusMeteringResult focusMeteringResult) {
            synchronized (this.mLock) {
                try {
                    if (this.mIsCanceled) {
                        return;
                    }
                    if (focusMeteringResult == null) {
                        return;
                    }
                    Logger.m1866d(CameraController.TAG, "Tap-to-focus onSuccess: " + focusMeteringResult.isFocusSuccessful());
                    this.mTapToFocusInfoState.postValue(new TapToFocusInfo(focusMeteringResult.isFocusSuccessful() ? 2 : 3, this.mTapPoint));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void resetStateAndClose() {
            synchronized (this.mLock) {
                try {
                    if (this.mIsCanceled) {
                        return;
                    }
                    Logger.m1866d(CameraController.TAG, "Tap-to-focus reset.");
                    this.mTapToFocusInfoState.postValue(new TapToFocusInfo(0, null));
                    this.mIsCanceled = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public FocusMeteringResultCallback(PointF pointF, MutableLiveData<TapToFocusInfo> mutableLiveData) {
            this.mTapPoint = pointF;
            this.mTapToFocusInfoState = mutableLiveData;
        }
    }

    @Deprecated
    public static final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;
        private final int mAspectRatio;
        private final Size mResolution;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface OutputAspectRatio {
        }

        public OutputSize(int i11) {
            Preconditions.checkArgument(i11 != -1);
            this.mAspectRatio = i11;
            this.mResolution = null;
        }

        public int getAspectRatio() {
            return this.mAspectRatio;
        }

        public Size getResolution() {
            return this.mResolution;
        }

        public String toString() {
            return "aspect ratio: " + this.mAspectRatio + " resolution: " + this.mResolution;
        }

        public OutputSize(Size size) {
            Preconditions.checkNotNull(size);
            this.mAspectRatio = -1;
            this.mResolution = size;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface UseCases {
    }

    public CameraController(Context context) {
        this(context, Futures.transform(ProcessCameraProvider.getInstance(context), new Function() { // from class: androidx.camera.view.h
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new ProcessCameraProviderWrapperImpl((ProcessCameraProvider) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
    private int getViewportAspectRatioInt(ViewPort viewPort) {
        int sensorRotationDegrees;
        boolean z11;
        int relativeImageRotation;
        Rational aspectRatio;
        int iSurfaceRotationToDegrees = viewPort == null ? 0 : CameraOrientationUtil.surfaceRotationToDegrees(viewPort.getRotation());
        try {
            ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
            if (processCameraProviderWrapper != null) {
                CameraInfo cameraInfo = processCameraProviderWrapper.getCameraInfo(this.mCameraSelector);
                sensorRotationDegrees = cameraInfo.getSensorRotationDegrees();
                try {
                    if (cameraInfo.getLensFacing() != 1) {
                        z11 = false;
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    Logger.m1873w(TAG, "Failed to retrieve CameraInfo for selector: " + getReadableSelectorString(this.mCameraSelector), e);
                }
                relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(iSurfaceRotationToDegrees, sensorRotationDegrees, z11);
                aspectRatio = viewPort.getAspectRatio();
                if (relativeImageRotation != 90 || relativeImageRotation == 270) {
                    aspectRatio = new Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
                }
                if (aspectRatio.equals(AspectRatioUtil.ASPECT_RATIO_4_3)) {
                    return 0;
                }
                if (aspectRatio.equals(AspectRatioUtil.ASPECT_RATIO_16_9)) {
                    return 1;
                }
                return -1;
            }
            sensorRotationDegrees = 0;
        } catch (IllegalArgumentException e12) {
            e = e12;
            sensorRotationDegrees = 0;
        }
        z11 = true;
        relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(iSurfaceRotationToDegrees, sensorRotationDegrees, z11);
        aspectRatio = viewPort.getAspectRatio();
        if (relativeImageRotation != 90) {
            aspectRatio = new Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
        } else {
            aspectRatio = new Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
        }
        if (aspectRatio.equals(AspectRatioUtil.ASPECT_RATIO_4_3)) {
            return 0;
        }
        if (aspectRatio.equals(AspectRatioUtil.ASPECT_RATIO_16_9)) {
            return 1;
        }
        return -1;
    }

    private boolean isOutputSizeEqual(OutputSize outputSize, OutputSize outputSize2) {
        if (outputSize == outputSize2) {
            return true;
        }
        return outputSize != null && outputSize.equals(outputSize2);
    }

    private void restartCameraIfAnalyzerResolutionChanged(ImageAnalysis.Analyzer analyzer, ImageAnalysis.Analyzer analyzer2) {
        if (Objects.equals(analyzer == null ? null : analyzer.getDefaultTargetResolution(), analyzer2 != null ? analyzer2.getDefaultTargetResolution() : null)) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setCameraSelector(CameraSelector cameraSelector) {
        Threads.checkMainThread();
        if (this.mCameraSelector == cameraSelector) {
            return;
        }
        Integer lensFacing = cameraSelector.getLensFacing();
        if (this.mImageCapture.getFlashMode() == 3 && lensFacing != null && lensFacing.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        final CameraSelector cameraSelector2 = this.mCameraSelector;
        this.mCameraSelector = cameraSelector;
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper == null) {
            return;
        }
        processCameraProviderWrapper.unbind(this.mPreview, this.mImageCapture, this.mImageAnalysis, this.mVideoCapture);
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f2152b.mCameraSelector = cameraSelector2;
            }
        });
    }

    public abstract Camera startCamera();

    public void startCameraAndTrackStates() {
        startCameraAndTrackStates(null);
    }

    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(FileOutputOptions fileOutputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(fileOutputOptions, audioConfig, executor, consumer);
    }

    @MainThread
    public void takePicture(ImageCapture.OutputFileOptions outputFileOptions, Executor executor, ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isImageCaptureEnabled(), IMAGE_CAPTURE_DISABLED);
        throwExceptionForInvalidScreenFlashCapture();
        updateMirroringFlagInOutputFileOptions(outputFileOptions);
        this.mImageCapture.takePicture(outputFileOptions, executor, onImageSavedCallback);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m2230a(CameraController cameraController, ProcessCameraProviderWrapper processCameraProviderWrapper) {
        cameraController.mCameraProvider = processCameraProviderWrapper;
        cameraController.unbindAllAndRecreate();
        cameraController.startCameraAndTrackStates();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2231b(CameraController cameraController, int i11) {
        cameraController.mLastKnownRotation = i11;
        cameraController.mImageAnalysis.setTargetRotation(i11);
        cameraController.mImageCapture.setTargetRotation(i11);
        cameraController.mVideoCapture.setTargetRotation(i11);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2232c(CameraController cameraController, int i11, int i12) {
        cameraController.mEnabledUseCases = i11;
        Logger.m1872w(TAG, "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(i12) + ", restoring back previous values " + Integer.toBinaryString(i11));
    }

    private void checkAudioPermissionGranted() {
        if (PermissionChecker.checkSelfPermission(this.mAppContext, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
        }
    }

    private void configureResolution(ImageOutputConfig.Builder<?> builder, ResolutionSelector resolutionSelector, OutputSize outputSize) {
        AspectRatioStrategy viewportAspectRatioStrategy;
        if (resolutionSelector != null) {
            builder.setResolutionSelector(resolutionSelector);
            return;
        }
        if (outputSize != null) {
            setTargetOutputSize(builder, outputSize);
            return;
        }
        ViewPort viewPort = this.mViewPort;
        if (viewPort == null || (viewportAspectRatioStrategy = getViewportAspectRatioStrategy(viewPort)) == null) {
            return;
        }
        builder.setResolutionSelector(new ResolutionSelector.Builder().setAspectRatioStrategy(viewportAspectRatioStrategy).build());
    }

    private FocusMeteringAction createFocusMeteringAction(MeteringPointFactory meteringPointFactory, PointF pointF) {
        FocusMeteringAction.Builder builderAddPoint = new FocusMeteringAction.Builder(meteringPointFactory.createPoint(pointF.x, pointF.y, AF_SIZE), 1).addPoint(meteringPointFactory.createPoint(pointF.x, pointF.y, AE_SIZE), 2);
        long j11 = this.mTapToFocusAutoCancelDurationNanos;
        return (j11 > 0 ? builderAddPoint.setAutoCancelDuration(j11, TimeUnit.NANOSECONDS) : builderAddPoint.disableAutoCancel()).build();
    }

    @SuppressLint({"WrongConstant"})
    private ImageAnalysis createImageAnalysis(Integer num, Integer num2, Integer num3) {
        ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
        if (num != null) {
            builder.setBackpressureStrategy(num.intValue());
        }
        if (num2 != null) {
            builder.setImageQueueDepth(num2.intValue());
        }
        if (num3 != null) {
            builder.setOutputImageFormat(num3.intValue());
        }
        configureResolution(builder, this.mImageAnalysisResolutionSelector, this.mImageAnalysisTargetSize);
        Executor executor = this.mAnalysisBackgroundExecutor;
        if (executor != null) {
            builder.setBackgroundExecutor(executor);
        }
        int i11 = this.mLastKnownRotation;
        if (i11 != -1) {
            builder.setTargetRotation(i11);
        }
        return builder.build();
    }

    @SuppressLint({"WrongConstant"})
    private ImageCapture createImageCapture(Integer num) {
        ImageCapture.Builder builder = new ImageCapture.Builder();
        if (num != null) {
            builder.setCaptureMode(num.intValue());
        }
        configureResolution(builder, this.mImageCaptureResolutionSelector, this.mImageCaptureTargetSize);
        Executor executor = this.mImageCaptureIoExecutor;
        if (executor != null) {
            builder.setIoExecutor(executor);
        }
        int i11 = this.mLastKnownRotation;
        if (i11 != -1) {
            builder.setTargetRotation(i11);
        }
        return builder.build();
    }

    private Preview createPreview() {
        Preview.Builder builder = new Preview.Builder();
        configureResolution(builder, this.mPreviewResolutionSelector, this.mPreviewTargetSize);
        builder.setDynamicRange(this.mPreviewDynamicRange);
        return builder.build();
    }

    @SuppressLint({"WrongConstant"})
    private VideoCapture<Recorder> createVideoCapture() {
        int viewportAspectRatioInt;
        Recorder.Builder qualitySelector = new Recorder.Builder().setQualitySelector(this.mVideoCaptureQualitySelector);
        ViewPort viewPort = this.mViewPort;
        if (viewPort != null && this.mVideoCaptureQualitySelector == Recorder.DEFAULT_QUALITY_SELECTOR && (viewportAspectRatioInt = getViewportAspectRatioInt(viewPort)) != -1) {
            qualitySelector.setAspectRatio(viewportAspectRatioInt);
        }
        VideoCapture.Builder dynamicRange = new VideoCapture.Builder(qualitySelector.build()).setTargetFrameRate(this.mVideoCaptureTargetFrameRate).setMirrorMode(this.mVideoCaptureMirrorMode).setDynamicRange(this.mVideoCaptureDynamicRange);
        int i11 = this.mLastKnownRotation;
        if (i11 != -1) {
            dynamicRange.setTargetRotation(i11);
        }
        return dynamicRange.build();
    }

    @MainThread
    private void deactivateRecording(Recording recording) {
        if (this.mActiveRecording == recording) {
            this.mActiveRecording = null;
        }
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    private String getReadableSelectorString(CameraSelector cameraSelector) {
        if (cameraSelector == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder("CameraSelector{");
        Integer lensFacing = cameraSelector.getLensFacing();
        if (lensFacing != null) {
            int iIntValue = lensFacing.intValue();
            if (iIntValue == 0) {
                sb2.append("lensFacing=FRONT");
            } else if (iIntValue == 1) {
                sb2.append("lensFacing=BACK");
            } else if (iIntValue != 2) {
                sb2.append("lensFacing=UNKNOWN(");
                sb2.append(lensFacing);
                sb2.append(")");
            } else {
                sb2.append("lensFacing=EXTERNAL");
            }
        } else {
            sb2.append("lensFacing=NOT_SPECIFIED");
        }
        sb2.append("}");
        return sb2.toString();
    }

    private boolean isCameraAttached() {
        return this.mCamera != null;
    }

    private boolean isCameraInitialized() {
        return this.mCameraProvider != null;
    }

    private boolean isPreviewViewAttached() {
        return (this.mSurfaceProvider == null || this.mViewPort == null) ? false : true;
    }

    private boolean isUseCaseEnabled(int i11) {
        return (i11 & this.mEnabledUseCases) != 0;
    }

    @MainThread
    private PendingRecording prepareRecording(OutputOptions outputOptions) {
        Recorder recorder = (Recorder) this.mVideoCapture.getOutput();
        if (outputOptions instanceof FileOutputOptions) {
            return recorder.prepareRecording(this.mAppContext, (FileOutputOptions) outputOptions);
        }
        if (outputOptions instanceof FileDescriptorOutputOptions) {
            if (Build.VERSION.SDK_INT >= 26) {
                return recorder.prepareRecording(this.mAppContext, (FileDescriptorOutputOptions) outputOptions);
            }
            throw new UnsupportedOperationException("File descriptors are not supported on pre-Android O (API 26) devices.");
        }
        if (outputOptions instanceof MediaStoreOutputOptions) {
            return recorder.prepareRecording(this.mAppContext, (MediaStoreOutputOptions) outputOptions);
        }
        throw new IllegalArgumentException("Unsupported OutputOptions type.");
    }

    @MainThread
    private void setActiveRecording(Recording recording, Consumer<VideoRecordEvent> consumer) {
        this.mRecordingMap.put(consumer, recording);
        this.mActiveRecording = recording;
    }

    private void setTargetOutputSize(ImageOutputConfig.Builder<?> builder, OutputSize outputSize) {
        if (outputSize == null) {
            return;
        }
        if (outputSize.getResolution() != null) {
            builder.setTargetResolution(outputSize.getResolution());
            return;
        }
        if (outputSize.getAspectRatio() != -1) {
            builder.setTargetAspectRatio(outputSize.getAspectRatio());
            return;
        }
        Logger.m1868e(TAG, "Invalid target surface size. " + outputSize);
    }

    private float speedUpZoomBy2X(float f11) {
        return f11 > 1.0f ? ((f11 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f11) * 2.0f);
    }

    private void startListeningToRotationEvents() {
        if (this.mRotationProvider.addListener(CameraXExecutors.mainThreadExecutor(), this.mDeviceRotationListener)) {
            return;
        }
        Logger.m1872w(TAG, "The device cannot detect rotation changes.");
    }

    private void stopListeningToRotationEvents() {
        this.mRotationProvider.removeListener(this.mDeviceRotationListener);
    }

    private Consumer<VideoRecordEvent> wrapListenerToDeactivateRecordingOnFinalized(Consumer<VideoRecordEvent> consumer) {
        return new C14162(ContextCompat.getMainExecutor(this.mAppContext), consumer);
    }

    @MainThread
    public void deactivateRecordingByListener(Consumer<VideoRecordEvent> consumer) {
        Recording recordingRemove = this.mRecordingMap.remove(consumer);
        if (recordingRemove != null) {
            deactivateRecording(recordingRemove);
        }
    }

    public ListenableFuture<Void> getInitializationFuture() {
        return this.mInitializationFuture;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ScreenFlashUiInfo getScreenFlashUiInfoByPriority() {
        Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> map = this.mScreenFlashUiInfoMap;
        ScreenFlashUiInfo.ProviderType providerType = ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW;
        if (map.get(providerType) != null) {
            return this.mScreenFlashUiInfoMap.get(providerType);
        }
        Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> map2 = this.mScreenFlashUiInfoMap;
        ScreenFlashUiInfo.ProviderType providerType2 = ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW;
        if (map2.get(providerType2) != null) {
            return this.mScreenFlashUiInfoMap.get(providerType2);
        }
        return null;
    }

    @MainThread
    public void setTapToFocusAutoCancelDuration(@IntRange(from = 0) long j11, TimeUnit timeUnit) {
        Preconditions.checkArgument(j11 >= 0, "Tap-to-focus auto-cancellation duration must be at least 0");
        this.mTapToFocusAutoCancelDurationNanos = timeUnit.toNanos(j11);
        Logger.m1866d(TAG, "setTapToFocusAutoCancelDuration: " + this.mTapToFocusAutoCancelDurationNanos + " ns set!");
    }

    public void startCameraAndTrackStates(Runnable runnable) {
        try {
            this.mCamera = startCamera();
            if (!isCameraAttached()) {
                Logger.m1866d(TAG, CAMERA_NOT_ATTACHED);
                return;
            }
            this.mZoomState.setSource(this.mCamera.getCameraInfo().getZoomState());
            this.mTorchState.setSource(this.mCamera.getCameraInfo().getTorchState());
            this.mPendingEnableTorch.propagateIfHasValue(new Function() { // from class: androidx.camera.view.a
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f2127a.enableTorch(((Boolean) obj).booleanValue());
                }
            });
            this.mPendingLinearZoom.propagateIfHasValue(new Function() { // from class: androidx.camera.view.b
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f2129a.setLinearZoom(((Float) obj).floatValue());
                }
            });
            this.mPendingZoomRatio.propagateIfHasValue(new Function() { // from class: androidx.camera.view.c
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f2133a.setZoomRatio(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e11) {
            if (runnable != null) {
                runnable.run();
            }
            throw e11;
        }
    }

    @RequiresApi(26)
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(FileDescriptorOutputOptions fileDescriptorOutputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(fileDescriptorOutputOptions, audioConfig, executor, consumer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void updateMirroringFlagInOutputFileOptions(ImageCapture.OutputFileOptions outputFileOptions) {
        if (this.mCameraSelector.getLensFacing() == null || outputFileOptions.getMetadata().isReversedHorizontalSet()) {
            return;
        }
        outputFileOptions.getMetadata().setReversedHorizontal(this.mCameraSelector.getLensFacing().intValue() == 0);
    }

    private AspectRatioStrategy getViewportAspectRatioStrategy(ViewPort viewPort) {
        int viewportAspectRatioInt = getViewportAspectRatioInt(viewPort);
        if (viewportAspectRatioInt != -1) {
            return new AspectRatioStrategy(viewportAspectRatioInt, 1);
        }
        return null;
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    @MainThread
    private Recording startRecordingInternal(OutputOptions outputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isVideoCaptureEnabled(), VIDEO_CAPTURE_DISABLED);
        Preconditions.checkState(!isRecording(), VIDEO_RECORDING_UNFINISHED);
        Consumer<VideoRecordEvent> consumerWrapListenerToDeactivateRecordingOnFinalized = wrapListenerToDeactivateRecordingOnFinalized(consumer);
        PendingRecording pendingRecordingPrepareRecording = prepareRecording(outputOptions);
        if (audioConfig.getAudioEnabled()) {
            checkAudioPermissionGranted();
            pendingRecordingPrepareRecording.withAudioEnabled();
        }
        Recording recordingStart = pendingRecordingPrepareRecording.start(executor, consumerWrapListenerToDeactivateRecordingOnFinalized);
        setActiveRecording(recordingStart, consumerWrapListenerToDeactivateRecordingOnFinalized);
        return recordingStart;
    }

    @MainThread
    private void stopRecording() {
        Threads.checkMainThread();
        Recording recording = this.mActiveRecording;
        if (recording != null) {
            recording.stop();
            deactivateRecording(this.mActiveRecording);
        }
    }

    private void throwExceptionForInvalidScreenFlashCapture() {
        if (getImageCaptureFlashMode() == 3) {
            if (getScreenFlashUiInfoByPriority() == null || getScreenFlashUiInfoByPriority().getScreenFlash() == null) {
                throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
            }
        }
    }

    @MainThread
    private void unbindAllAndRecreate() {
        unbindPreviewAndRecreate();
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        unbindVideoAndRecreate();
    }

    @MainThread
    private void unbindAllUseCases() {
        if (!isCameraInitialized()) {
            return;
        }
        this.mCameraProvider.unbind(this.mPreview, this.mImageCapture, this.mImageAnalysis, this.mVideoCapture);
    }

    @MainThread
    private void unbindImageAnalysisAndRecreate(Integer num, Integer num2, Integer num3) {
        ImageAnalysis.Analyzer analyzer;
        Threads.checkMainThread();
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mImageAnalysis);
        }
        ImageAnalysis imageAnalysisCreateImageAnalysis = createImageAnalysis(num, num2, num3);
        this.mImageAnalysis = imageAnalysisCreateImageAnalysis;
        Executor executor = this.mAnalysisExecutor;
        if (executor != null && (analyzer = this.mAnalysisAnalyzer) != null) {
            imageAnalysisCreateImageAnalysis.setAnalyzer(executor, analyzer);
        }
    }

    @MainThread
    private void unbindImageCaptureAndRecreate(Integer num) {
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mImageCapture);
        }
        int flashMode = this.mImageCapture.getFlashMode();
        this.mImageCapture = createImageCapture(num);
        setImageCaptureFlashMode(flashMode);
    }

    @MainThread
    private void unbindPreviewAndRecreate() {
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mPreview);
        }
        Preview previewCreatePreview = createPreview();
        this.mPreview = previewCreatePreview;
        Preview.SurfaceProvider surfaceProvider = this.mSurfaceProvider;
        if (surfaceProvider != null) {
            previewCreatePreview.setSurfaceProvider(surfaceProvider);
        }
    }

    @MainThread
    private void unbindVideoAndRecreate() {
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mVideoCapture);
        }
        this.mVideoCapture = createVideoCapture();
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    @MainThread
    public void attachPreviewSurface(Preview.SurfaceProvider surfaceProvider, ViewPort viewPort) {
        boolean z11;
        Threads.checkMainThread();
        if (this.mSurfaceProvider != surfaceProvider) {
            this.mSurfaceProvider = surfaceProvider;
            this.mPreview.setSurfaceProvider(surfaceProvider);
        }
        if (this.mViewPort != null && getViewportAspectRatioStrategy(viewPort) == getViewportAspectRatioStrategy(this.mViewPort)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.mViewPort = viewPort;
        startListeningToRotationEvents();
        if (z11) {
            unbindAllAndRecreate();
        }
        startCameraAndTrackStates();
    }

    @MainThread
    public void clearEffects() {
        Threads.checkMainThread();
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbindAll();
        }
        this.mEffects.clear();
        startCameraAndTrackStates();
    }

    @MainThread
    public void clearImageAnalysisAnalyzer() {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.mAnalysisAnalyzer;
        this.mAnalysisExecutor = null;
        this.mAnalysisAnalyzer = null;
        this.mImageAnalysis.clearAnalyzer();
        restartCameraIfAnalyzerResolutionChanged(analyzer, null);
    }

    @MainThread
    public void clearPreviewSurface() {
        Threads.checkMainThread();
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbind(this.mPreview, this.mImageCapture, this.mImageAnalysis, this.mVideoCapture);
        }
        this.mPreview.setSurfaceProvider(null);
        this.mCamera = null;
        this.mSurfaceProvider = null;
        this.mViewPort = null;
        stopListeningToRotationEvents();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseGroup createUseCaseGroup() {
        if (!isCameraInitialized()) {
            Logger.m1866d(TAG, CAMERA_NOT_INITIALIZED);
            return null;
        }
        if (!isPreviewViewAttached()) {
            Logger.m1866d(TAG, PREVIEW_VIEW_NOT_ATTACHED);
            return null;
        }
        unbindAllUseCases();
        UseCaseGroup.Builder builderAddUseCase = new UseCaseGroup.Builder().addUseCase(this.mPreview);
        if (isImageCaptureEnabled()) {
            builderAddUseCase.addUseCase(this.mImageCapture);
        }
        if (isImageAnalysisEnabled()) {
            builderAddUseCase.addUseCase(this.mImageAnalysis);
        }
        if (isVideoCaptureEnabled()) {
            builderAddUseCase.addUseCase(this.mVideoCapture);
        }
        builderAddUseCase.setViewPort(this.mViewPort);
        Iterator<CameraEffect> it = this.mEffects.iterator();
        while (it.hasNext()) {
            builderAddUseCase.addEffect(it.next());
        }
        return builderAddUseCase.build();
    }

    @MainThread
    public ListenableFuture<Void> enableTorch(boolean z11) {
        Threads.checkMainThread();
        if (!isCameraAttached()) {
            return this.mPendingEnableTorch.setValue(Boolean.valueOf(z11));
        }
        return this.mCamera.getCameraControl().enableTorch(z11);
    }

    @MainThread
    public CameraControl getCameraControl() {
        Threads.checkMainThread();
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getCameraControl();
    }

    @MainThread
    public CameraInfo getCameraInfo() {
        Threads.checkMainThread();
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getCameraInfo();
    }

    @MainThread
    public CameraSelector getCameraSelector() {
        Threads.checkMainThread();
        return this.mCameraSelector;
    }

    @MainThread
    public Executor getImageAnalysisBackgroundExecutor() {
        Threads.checkMainThread();
        return this.mAnalysisBackgroundExecutor;
    }

    @MainThread
    public int getImageAnalysisBackpressureStrategy() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getBackpressureStrategy();
    }

    @MainThread
    public int getImageAnalysisImageQueueDepth() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getImageQueueDepth();
    }

    @MainThread
    public int getImageAnalysisOutputImageFormat() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getOutputImageFormat();
    }

    @MainThread
    public ResolutionSelector getImageAnalysisResolutionSelector() {
        Threads.checkMainThread();
        return this.mImageAnalysisResolutionSelector;
    }

    @MainThread
    @Deprecated
    public OutputSize getImageAnalysisTargetSize() {
        Threads.checkMainThread();
        return this.mImageAnalysisTargetSize;
    }

    @MainThread
    public int getImageCaptureFlashMode() {
        Threads.checkMainThread();
        return this.mImageCapture.getFlashMode();
    }

    @MainThread
    public Executor getImageCaptureIoExecutor() {
        Threads.checkMainThread();
        return this.mImageCaptureIoExecutor;
    }

    @MainThread
    public int getImageCaptureMode() {
        Threads.checkMainThread();
        return this.mImageCapture.getCaptureMode();
    }

    @MainThread
    public ResolutionSelector getImageCaptureResolutionSelector() {
        Threads.checkMainThread();
        return this.mImageCaptureResolutionSelector;
    }

    @MainThread
    @Deprecated
    public OutputSize getImageCaptureTargetSize() {
        Threads.checkMainThread();
        return this.mImageCaptureTargetSize;
    }

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DynamicRange getPreviewDynamicRange() {
        Threads.checkMainThread();
        return this.mPreviewDynamicRange;
    }

    @MainThread
    public ResolutionSelector getPreviewResolutionSelector() {
        Threads.checkMainThread();
        return this.mPreviewResolutionSelector;
    }

    @MainThread
    @Deprecated
    public OutputSize getPreviewTargetSize() {
        Threads.checkMainThread();
        return this.mPreviewTargetSize;
    }

    @MainThread
    public LiveData<TapToFocusInfo> getTapToFocusInfoState() {
        Threads.checkMainThread();
        return this.mTapToFocusInfoState;
    }

    @MainThread
    @Deprecated
    public LiveData<Integer> getTapToFocusState() {
        Threads.checkMainThread();
        return this.mTapToFocusState;
    }

    @MainThread
    public LiveData<Integer> getTorchState() {
        Threads.checkMainThread();
        return this.mTorchState;
    }

    @MainThread
    public DynamicRange getVideoCaptureDynamicRange() {
        Threads.checkMainThread();
        return this.mVideoCaptureDynamicRange;
    }

    @MainThread
    public int getVideoCaptureMirrorMode() {
        Threads.checkMainThread();
        return this.mVideoCaptureMirrorMode;
    }

    @MainThread
    public QualitySelector getVideoCaptureQualitySelector() {
        Threads.checkMainThread();
        return this.mVideoCaptureQualitySelector;
    }

    @MainThread
    public Range<Integer> getVideoCaptureTargetFrameRate() {
        Threads.checkMainThread();
        return this.mVideoCaptureTargetFrameRate;
    }

    @MainThread
    public LiveData<ZoomState> getZoomState() {
        Threads.checkMainThread();
        return this.mZoomState;
    }

    @MainThread
    public boolean hasCamera(CameraSelector cameraSelector) {
        Threads.checkMainThread();
        Preconditions.checkNotNull(cameraSelector);
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            try {
                return processCameraProviderWrapper.hasCamera(cameraSelector);
            } catch (CameraInfoUnavailableException e11) {
                Logger.m1873w(TAG, "Failed to check camera availability", e11);
                return false;
            }
        }
        throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
    }

    @MainThread
    public boolean isImageAnalysisEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(2);
    }

    @MainThread
    public boolean isImageCaptureEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(1);
    }

    @MainThread
    public boolean isPinchToZoomEnabled() {
        Threads.checkMainThread();
        return this.mPinchToZoomEnabled;
    }

    @MainThread
    public boolean isRecording() {
        Threads.checkMainThread();
        Recording recording = this.mActiveRecording;
        if (recording != null && !recording.isClosed()) {
            return true;
        }
        return false;
    }

    @MainThread
    public boolean isTapToFocusEnabled() {
        Threads.checkMainThread();
        return this.mTapToFocusEnabled;
    }

    @MainThread
    public boolean isVideoCaptureEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(4);
    }

    public void onPinchToZoom(float f11) {
        if (!isCameraAttached()) {
            Logger.m1872w(TAG, CAMERA_NOT_ATTACHED);
            return;
        }
        if (!this.mPinchToZoomEnabled) {
            Logger.m1866d(TAG, "Pinch to zoom disabled.");
            return;
        }
        Logger.m1866d(TAG, "Pinch to zoom with scale: " + f11);
        ZoomState value = getZoomState().getValue();
        if (value == null) {
            return;
        }
        setZoomRatio(Math.min(Math.max(value.getZoomRatio() * speedUpZoomBy2X(f11), value.getMinZoomRatio()), value.getMaxZoomRatio()));
    }

    public void onTapToFocus(MeteringPointFactory meteringPointFactory, float f11, float f12) {
        if (!isCameraAttached()) {
            Logger.m1872w(TAG, CAMERA_NOT_ATTACHED);
            return;
        }
        if (!this.mTapToFocusEnabled) {
            Logger.m1866d(TAG, "Tap to focus disabled. ");
            return;
        }
        PointF pointF = new PointF(f11, f12);
        FocusMeteringAction focusMeteringActionCreateFocusMeteringAction = createFocusMeteringAction(meteringPointFactory, pointF);
        Logger.m1866d(TAG, "Tap to focus started: " + f11 + ", " + f12);
        FocusMeteringResultCallback focusMeteringResultCallback = this.mFocusMeteringResultCallback;
        if (focusMeteringResultCallback != null) {
            focusMeteringResultCallback.close();
        }
        this.mTapToFocusInfoState.postValue(new TapToFocusInfo(1, pointF));
        final FocusMeteringResultCallback focusMeteringResultCallback2 = new FocusMeteringResultCallback(pointF, this.mTapToFocusInfoState);
        this.mFocusMeteringResultCallback = focusMeteringResultCallback2;
        Futures.addCallback(this.mCamera.getCameraControl().startFocusAndMetering(focusMeteringActionCreateFocusMeteringAction), focusMeteringResultCallback2, CameraXExecutors.directExecutor());
        long millis = TimeUnit.NANOSECONDS.toMillis(this.mTapToFocusAutoCancelDurationNanos);
        Logger.m1866d(TAG, "Tap to focus auto cancel duration: " + millis + " ms");
        if (millis > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: androidx.camera.view.d
                @Override // java.lang.Runnable
                public final void run() {
                    focusMeteringResultCallback2.resetStateAndClose();
                }
            }, millis);
        }
    }

    @MainThread
    public void setEffects(Set<CameraEffect> set) {
        Threads.checkMainThread();
        if (Objects.equals(this.mEffects, set)) {
            return;
        }
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbindAll();
        }
        this.mEffects.clear();
        this.mEffects.addAll(set);
        startCameraAndTrackStates();
    }

    @MainThread
    public void setEnabledUseCases(final int i11) {
        Threads.checkMainThread();
        final int i12 = this.mEnabledUseCases;
        if (i11 == i12) {
            return;
        }
        this.mEnabledUseCases = i11;
        if (!isVideoCaptureEnabled() && isRecording()) {
            stopRecording();
        }
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.i
            @Override // java.lang.Runnable
            public final void run() {
                CameraController.m2232c(this.f2145b, i12, i11);
            }
        });
    }

    @MainThread
    public void setImageAnalysisAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer2 = this.mAnalysisAnalyzer;
        if (analyzer2 == analyzer && this.mAnalysisExecutor == executor) {
            return;
        }
        this.mAnalysisExecutor = executor;
        this.mAnalysisAnalyzer = analyzer;
        this.mImageAnalysis.setAnalyzer(executor, analyzer);
        restartCameraIfAnalyzerResolutionChanged(analyzer2, analyzer);
    }

    @MainThread
    public void setImageAnalysisBackgroundExecutor(Executor executor) {
        Threads.checkMainThread();
        if (this.mAnalysisBackgroundExecutor == executor) {
            return;
        }
        this.mAnalysisBackgroundExecutor = executor;
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageAnalysisBackpressureStrategy(int i11) {
        Threads.checkMainThread();
        if (this.mImageAnalysis.getBackpressureStrategy() == i11) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(i11), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageAnalysisImageQueueDepth(int i11) {
        Threads.checkMainThread();
        if (this.mImageAnalysis.getImageQueueDepth() == i11) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(i11), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageAnalysisOutputImageFormat(int i11) {
        Threads.checkMainThread();
        if (i11 == this.mImageAnalysis.getOutputImageFormat()) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(i11));
    }

    @MainThread
    public void setImageAnalysisResolutionSelector(ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        if (this.mImageAnalysisResolutionSelector == resolutionSelector) {
            return;
        }
        this.mImageAnalysisResolutionSelector = resolutionSelector;
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    @Deprecated
    public void setImageAnalysisTargetSize(OutputSize outputSize) {
        Threads.checkMainThread();
        if (isOutputSizeEqual(this.mImageAnalysisTargetSize, outputSize)) {
            return;
        }
        this.mImageAnalysisTargetSize = outputSize;
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageCaptureFlashMode(int i11) {
        Threads.checkMainThread();
        if (i11 == 3) {
            Integer lensFacing = this.mCameraSelector.getLensFacing();
            if (lensFacing != null && lensFacing.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            updateScreenFlashToImageCapture();
        }
        this.mImageCapture.setFlashMode(i11);
    }

    @MainThread
    public void setImageCaptureIoExecutor(Executor executor) {
        Threads.checkMainThread();
        if (this.mImageCaptureIoExecutor == executor) {
            return;
        }
        this.mImageCaptureIoExecutor = executor;
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageCaptureMode(int i11) {
        Threads.checkMainThread();
        if (this.mImageCapture.getCaptureMode() == i11) {
            return;
        }
        unbindImageCaptureAndRecreate(Integer.valueOf(i11));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageCaptureResolutionSelector(ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        if (this.mImageCaptureResolutionSelector == resolutionSelector) {
            return;
        }
        this.mImageCaptureResolutionSelector = resolutionSelector;
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        startCameraAndTrackStates();
    }

    @MainThread
    @Deprecated
    public void setImageCaptureTargetSize(OutputSize outputSize) {
        Threads.checkMainThread();
        if (isOutputSizeEqual(this.mImageCaptureTargetSize, outputSize)) {
            return;
        }
        this.mImageCaptureTargetSize = outputSize;
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        startCameraAndTrackStates();
    }

    @MainThread
    public ListenableFuture<Void> setLinearZoom(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        Threads.checkMainThread();
        if (!isCameraAttached()) {
            return this.mPendingLinearZoom.setValue(Float.valueOf(f11));
        }
        return this.mCamera.getCameraControl().setLinearZoom(f11);
    }

    @MainThread
    public void setPinchToZoomEnabled(boolean z11) {
        Threads.checkMainThread();
        this.mPinchToZoomEnabled = z11;
    }

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPreviewDynamicRange(DynamicRange dynamicRange) {
        Threads.checkMainThread();
        this.mPreviewDynamicRange = dynamicRange;
        unbindPreviewAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setPreviewResolutionSelector(ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        if (this.mPreviewResolutionSelector == resolutionSelector) {
            return;
        }
        this.mPreviewResolutionSelector = resolutionSelector;
        unbindPreviewAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    @Deprecated
    public void setPreviewTargetSize(OutputSize outputSize) {
        Threads.checkMainThread();
        if (isOutputSizeEqual(this.mPreviewTargetSize, outputSize)) {
            return;
        }
        this.mPreviewTargetSize = outputSize;
        unbindPreviewAndRecreate();
        startCameraAndTrackStates();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setScreenFlashUiInfo(ScreenFlashUiInfo screenFlashUiInfo) {
        ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        this.mScreenFlashUiInfoMap.put(screenFlashUiInfo.getProviderType(), screenFlashUiInfo);
        ScreenFlashUiInfo screenFlashUiInfoByPriority2 = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority2 != null && !screenFlashUiInfoByPriority2.equals(screenFlashUiInfoByPriority)) {
            updateScreenFlashToImageCapture();
        }
    }

    @MainThread
    public void setTapToFocusEnabled(boolean z11) {
        Threads.checkMainThread();
        this.mTapToFocusEnabled = z11;
    }

    @MainThread
    public void setVideoCaptureDynamicRange(DynamicRange dynamicRange) {
        Threads.checkMainThread();
        this.mVideoCaptureDynamicRange = dynamicRange;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setVideoCaptureMirrorMode(int i11) {
        Threads.checkMainThread();
        this.mVideoCaptureMirrorMode = i11;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setVideoCaptureQualitySelector(QualitySelector qualitySelector) {
        Threads.checkMainThread();
        this.mVideoCaptureQualitySelector = qualitySelector;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setVideoCaptureTargetFrameRate(Range<Integer> range) {
        Threads.checkMainThread();
        this.mVideoCaptureTargetFrameRate = range;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public ListenableFuture<Void> setZoomRatio(float f11) {
        Threads.checkMainThread();
        if (!isCameraAttached()) {
            return this.mPendingZoomRatio.setValue(Float.valueOf(f11));
        }
        return this.mCamera.getCameraControl().setZoomRatio(f11);
    }

    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(MediaStoreOutputOptions mediaStoreOutputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(mediaStoreOutputOptions, audioConfig, executor, consumer);
    }

    @OptIn(markerClass = {TransformExperimental.class})
    @MainThread
    public void updatePreviewViewTransform(Matrix matrix) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.mAnalysisAnalyzer;
        if (analyzer != null && analyzer.getTargetCoordinateSystem() == 1) {
            this.mAnalysisAnalyzer.updateTransform(matrix);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void updateScreenFlashToImageCapture() {
        ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority == null) {
            Logger.m1866d(TAG, "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.mImageCapture.setScreenFlash(NO_OP_SCREEN_FLASH);
            return;
        }
        this.mImageCapture.setScreenFlash(screenFlashUiInfoByPriority.getScreenFlash());
        Logger.m1866d(TAG, "Set ScreenFlash instance to ImageCapture, provided by " + screenFlashUiInfoByPriority.getProviderType().name());
    }

    public CameraController(Context context, ListenableFuture<ProcessCameraProviderWrapper> listenableFuture) {
        this.mCameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        this.mEnabledUseCases = 3;
        this.mActiveRecording = null;
        this.mRecordingMap = new HashMap();
        this.mVideoCaptureQualitySelector = Recorder.DEFAULT_QUALITY_SELECTOR;
        this.mVideoCaptureMirrorMode = 0;
        DynamicRange dynamicRange = DynamicRange.UNSPECIFIED;
        this.mVideoCaptureDynamicRange = dynamicRange;
        this.mPreviewDynamicRange = dynamicRange;
        this.mVideoCaptureTargetFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        this.mLastKnownRotation = -1;
        this.mPinchToZoomEnabled = true;
        this.mTapToFocusEnabled = true;
        this.mZoomState = new ForwardingLiveData<>();
        this.mTorchState = new ForwardingLiveData<>();
        MutableLiveData<TapToFocusInfo> mutableLiveData = new MutableLiveData<>(new TapToFocusInfo(0, null));
        this.mTapToFocusInfoState = mutableLiveData;
        this.mTapToFocusState = LiveDataUtil.map(mutableLiveData, new Function() { // from class: androidx.camera.view.e
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((TapToFocusInfo) obj).getFocusState());
            }
        });
        this.mPendingEnableTorch = new PendingValue<>();
        this.mPendingLinearZoom = new PendingValue<>();
        this.mPendingZoomRatio = new PendingValue<>();
        this.mEffects = new HashSet();
        this.mScreenFlashUiInfoMap = new HashMap();
        this.mTapToFocusAutoCancelDurationNanos = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context applicationContext = ContextUtil.getApplicationContext(context);
        this.mAppContext = applicationContext;
        this.mPreview = createPreview();
        this.mImageCapture = createImageCapture(null);
        this.mImageAnalysis = createImageAnalysis(null, null, null);
        this.mVideoCapture = createVideoCapture();
        this.mInitializationFuture = Futures.transform(listenableFuture, new Function() { // from class: androidx.camera.view.f
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return CameraController.m2230a(this.f2138a, (ProcessCameraProviderWrapper) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
        this.mRotationProvider = new RotationProvider(applicationContext);
        this.mDeviceRotationListener = new RotationProvider.Listener() { // from class: androidx.camera.view.g
            @Override // androidx.camera.view.RotationProvider.Listener
            public final void onRotationChanged(int i11) {
                CameraController.m2231b(this.f2141a, i11);
            }
        };
    }

    @MainThread
    public void takePicture(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isImageCaptureEnabled(), IMAGE_CAPTURE_DISABLED);
        throwExceptionForInvalidScreenFlashCapture();
        this.mImageCapture.takePicture(executor, onImageCapturedCallback);
    }
}
