package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
public class Camera2CameraControlImpl implements CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final String TAG = "Camera2CameraControlImp";
    static final String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final Camera2CameraControl mCamera2CameraControl;
    private final Camera2CapturePipeline mCamera2CapturePipeline;
    private final CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private final CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    final Executor mExecutor;
    private final ExposureControl mExposureControl;
    private volatile int mFlashMode;
    private volatile ListenableFuture<Void> mFlashModeChangeSessionUpdateFuture;
    private final FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsLowLightBoostOn;
    private boolean mIsRepeatingRequestAvailable;
    private final Object mLock;
    private final LowLightBoostControl mLowLightBoostControl;
    private final AtomicLong mNextSessionUpdateId;
    private ImageCapture.ScreenFlash mScreenFlash;

    @VisibleForTesting
    final CameraControlSessionCallback mSessionCallback;
    private final SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final TorchControl mTorchControl;
    private volatile int mTorchState;

    @IntRange(from = 1)
    private volatile int mTorchStrength;

    @GuardedBy("mLock")
    private int mUseCount;
    private final VideoUsageControl mVideoUsageControl;
    private final ZoomControl mZoomControl;

    @VisibleForTesting
    ZslControl mZslControl;

    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {
        Set<CameraCaptureCallback> mCallbacks = new HashSet();
        Map<CameraCaptureCallback, Executor> mCallbackExecutors = new ArrayMap();

        public void addCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(final int i11) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.onCaptureCancelled(i11);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.m1869e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCancelled.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(final int i11, final CameraCaptureResult cameraCaptureResult) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.onCaptureCompleted(i11, cameraCaptureResult);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.m1869e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCompleted.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(final int i11, final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.onCaptureFailed(i11, cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.m1869e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureFailed.", e11);
                }
            }
        }

        public void removeCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        final Set<CaptureResultListener> mResultListeners = new HashSet();

        public void addListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraControlImpl.CameraControlSessionCallback.m1658a(this.f1481b, totalCaptureResult);
                }
            });
        }

        public void removeListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }

        public CameraControlSessionCallback(Executor executor) {
            this.mExecutor = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1658a(CameraControlSessionCallback cameraControlSessionCallback, TotalCaptureResult totalCaptureResult) {
            cameraControlSessionCallback.getClass();
            HashSet hashSet = new HashSet();
            for (CaptureResultListener captureResultListener : cameraControlSessionCallback.mResultListeners) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (!hashSet.isEmpty()) {
                cameraControlSessionCallback.mResultListeners.removeAll(hashSet);
            }
        }
    }

    public interface CaptureResultListener {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    @VisibleForTesting
    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback) {
        this(cameraCharacteristicsCompat, scheduledExecutorService, executor, controlUpdateCallback, new Quirks(new ArrayList()));
    }

    private static boolean isModeInList(int i11, int[] iArr) {
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public int getSupportedAeMode(int i11) {
        return getSupportedAeMode(this.mCameraCharacteristics, i11);
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        this.mLock = new Object();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mTorchState = 0;
        this.mIsLowLightBoostOn = false;
        this.mFlashMode = 2;
        this.mIsRepeatingRequestAvailable = true;
        this.mNextSessionUpdateId = new AtomicLong(0L);
        this.mFlashModeChangeSessionUpdateFuture = Futures.immediateFuture(null);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0L;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        this.mVideoUsageControl = new VideoUsageControl(executor);
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.mZoomControl = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchStrength = cameraCharacteristicsCompat.getDefaultTorchStrengthLevel();
        this.mLowLightBoostControl = new LowLightBoostControl(this, cameraCharacteristicsCompat, executor);
        this.mZslControl = new ZslControlImpl(cameraCharacteristicsCompat, executor);
        this.mAutoFlashAEModeDisabler = new AutoFlashAEModeDisabler(quirks);
        this.mCamera2CameraControl = new Camera2CameraControl(this, executor);
        this.mCamera2CapturePipeline = new Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor, scheduledExecutorService);
    }

    public static int getSupportedAeMode(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i11, iArr)) {
            return i11;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    private int getSupportedAwbMode(int i11) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i11, iArr)) {
            return i11;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m1651i(final Camera2CameraControlImpl camera2CameraControlImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl camera2CameraControlImpl2 = this.f1368b;
                Futures.propagate(camera2CameraControlImpl2.waitForSessionUpdateId(camera2CameraControlImpl2.updateSessionConfigSynchronous()), completer);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    private boolean isRepeatingRequestAvailable() {
        try {
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.h
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraControlImpl.m1643a(this.f1356a, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException("Unable to check if repeating request is available.", e11);
        }
    }

    private void resetAeFlashState() {
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(1)));
        builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
        builder.addImplementationOptions(builder2.build());
        submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
    }

    private ListenableFuture<Void> waitForSessionUpdateId(final long j11) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.o
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.m1649g(this.f1417a, j11, completer);
            }
        });
    }

    public void addCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m1644b();
            }
        }, CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(final Executor executor, final CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f1390b.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(SessionConfig.Builder builder) {
        this.mZslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m1645c();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearZslConfig() {
        this.mZslControl.clearZslConfig();
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i11 = this.mUseCount;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.mUseCount = i11 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mVideoUsageControl.decrementUsage();
    }

    public void enableLowLightBoostInternal(boolean z11) {
        if (this.mIsLowLightBoostOn == z11) {
            return;
        }
        if (z11 && isTorchOn()) {
            resetAeFlashState();
            this.mTorchState = 0;
            this.mTorchControl.forceUpdateTorchStateToOff();
        }
        this.mIsLowLightBoostOn = z11;
        updateSessionConfigSynchronous();
    }

    public void enableTorchInternal(int i11) {
        if (this.mIsLowLightBoostOn) {
            return;
        }
        this.mTorchState = i11;
        if (i11 == 0) {
            resetAeFlashState();
        }
        updateSessionConfigSynchronous();
    }

    public Camera2CameraControl getCamera2CameraControl() {
        return this.mCamera2CameraControl;
    }

    public Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    @VisibleForTesting
    public long getCurrentSessionUpdateId() {
        return this.mCurrentSessionUpdateId;
    }

    public ExposureControl getExposureControl() {
        return this.mExposureControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mFlashMode;
    }

    public FocusMeteringControl getFocusMeteringControl() {
        return this.mFocusMeteringControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public LowLightBoostControl getLowLightBoostControl() {
        return this.mLowLightBoostControl;
    }

    public int getMaxAeRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        this.mSessionConfigBuilder.addTag(TAG_SESSION_UPDATE_ID, Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    @VisibleForTesting
    public Config getSessionOptions() {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, 1, optionPriority);
        this.mFocusMeteringControl.addFocusMeteringOptions(builder);
        this.mZoomControl.addZoomOption(builder);
        int correctedAeMode = this.mFocusMeteringControl.isExternalFlashAeModeEnabled() ? 5 : 1;
        if (this.mIsLowLightBoostOn) {
            correctedAeMode = 6;
        } else if (isTorchOn()) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.FLASH_MODE, 2, optionPriority);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.mTorchState == 1) {
                    builder.setCaptureRequestOptionWithPriority(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.mTorchStrength), optionPriority);
                } else if (this.mTorchState == 2) {
                    builder.setCaptureRequestOptionWithPriority(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.mCameraCharacteristics.getDefaultTorchStrengthLevel()), optionPriority);
                }
            }
        } else {
            int i11 = this.mFlashMode;
            if (i11 == 0) {
                correctedAeMode = this.mAutoFlashAEModeDisabler.getCorrectedAeMode(2);
            } else if (i11 == 1) {
                correctedAeMode = 3;
            } else if (i11 == 2) {
                correctedAeMode = 1;
            }
        }
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(correctedAeMode)), optionPriority);
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(getSupportedAwbMode(1)), optionPriority);
        this.mExposureControl.setCaptureRequestOption(builder);
        this.mCamera2CameraControl.applyOptionsToBuilder(builder);
        return builder.build();
    }

    public int getSupportedAfMode(int i11) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i11, iArr)) {
            return i11;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    public TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    @VisibleForTesting
    public int getUseCount() {
        int i11;
        synchronized (this.mLock) {
            i11 = this.mUseCount;
        }
        return i11;
    }

    public ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    public ZslControl getZslControl() {
        return this.mZslControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mVideoUsageControl.incrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        int usage = this.mVideoUsageControl.getUsage();
        Logger.m1866d(TAG, "isInVideoUsage: mVideoUsageControl value = " + usage);
        return usage > 0;
    }

    public boolean isLowLightBoostOn() {
        return this.mIsLowLightBoostOn;
    }

    public boolean isTorchOn() {
        return this.mTorchState != 0;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mZslControl.isZslDisabledByUserCaseConfig();
    }

    public void removeCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(final CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f1431b.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
            }
        });
    }

    public void setActive(boolean z11) {
        Logger.m1866d(TAG, "setActive: isActive = " + z11);
        this.mFocusMeteringControl.setActive(z11);
        this.mZoomControl.setActive(z11);
        this.mLowLightBoostControl.setActive(z11);
        this.mTorchControl.setActive(z11);
        this.mExposureControl.setActive(z11);
        this.mCamera2CameraControl.setActive(z11);
        if (z11) {
            return;
        }
        this.mScreenFlash = null;
        this.mVideoUsageControl.resetDirectly();
    }

    public void setIsRepeatingRequestAvailable(boolean z11) {
        this.mIsRepeatingRequestAvailable = z11;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setLowLightBoostDisabledByUseCaseSessionConfig(boolean z11) {
        this.mLowLightBoostControl.setLowLightBoostDisabledByUseCaseSessionConfig(z11);
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.mScreenFlash = screenFlash;
    }

    public void setTemplate(int i11) {
        this.mTemplate = i11;
        this.mFocusMeteringControl.setTemplate(i11);
        this.mCamera2CapturePipeline.setTemplate(this.mTemplate);
    }

    public void setTorchStrengthLevelInternal(@IntRange(from = 1) int i11) {
        this.mTorchStrength = i11;
        if (isTorchOn()) {
            updateSessionConfigSynchronous();
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z11) {
        this.mZslControl.setZslDisabledByUserCaseConfig(z11);
    }

    public void submitCaptureRequestsInternal(List<CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1334b.updateSessionConfigSynchronous();
            }
        });
    }

    public ListenableFuture<Void> updateSessionConfigAsync() {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.d
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.m1651i(this.f1324a, completer);
            }
        }));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1643a(final Camera2CameraControlImpl camera2CameraControlImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.getClass();
        try {
            camera2CameraControlImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.g
                @Override // java.lang.Runnable
                public final void run() {
                    completer.set(Boolean.valueOf(this.f1347b.mIsRepeatingRequestAvailable));
                }
            });
            return "isRepeatingRequestAvailable";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
            return "isRepeatingRequestAvailable";
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m1649g(Camera2CameraControlImpl camera2CameraControlImpl, final long j11, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.getClass();
        camera2CameraControlImpl.addCaptureResultListener(new CaptureResultListener() { // from class: androidx.camera.camera2.internal.i
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return Camera2CameraControlImpl.m1654l(j11, completer, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j11;
    }

    private boolean isControlInUse() {
        if (getUseCount() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isSessionUpdated(TotalCaptureResult totalCaptureResult, long j11) {
        Long l11;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof TagBundle) || (l11 = (Long) ((TagBundle) tag).getTag(TAG_SESSION_UPDATE_ID)) == null || l11.longValue() < j11) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m1654l(long j11, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        if (isSessionUpdated(totalCaptureResult, j11)) {
            completer.set(null);
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> cancelFocusAndMetering() {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        if (!isRepeatingRequestAvailable()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Repeating request is not available possibly because it's disable for the ImageCapture."));
        }
        return Futures.nonCancellationPropagating(this.mFocusMeteringControl.cancelFocusAndMetering());
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> enableLowLightBoostAsync(boolean z11) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.mLowLightBoostControl.enableLowLightBoost(z11));
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> enableTorch(boolean z11) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z11));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture<CameraCapturePipeline> getCameraCapturePipelineAsync(final int i11, final int i12) {
        if (!isControlInUse()) {
            Logger.m1872w(TAG, "Camera is not active.");
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final int flashMode = getFlashMode();
        return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.n
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return Futures.immediateFuture(this.f1407a.mCamera2CapturePipeline.getCameraCapturePipeline(i11, flashMode, i12));
            }
        }, this.mExecutor);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Integer> setExposureCompensationIndex(int i11) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return this.mExposureControl.setExposureCompensationIndex(i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i11) {
        if (!isControlInUse()) {
            Logger.m1872w(TAG, "Camera is not active.");
            return;
        }
        this.mFlashMode = i11;
        Logger.m1866d(TAG, "setFlashMode: mFlashMode = " + this.mFlashMode);
        ZslControl zslControl = this.mZslControl;
        boolean z11 = true;
        if (this.mFlashMode != 1 && this.mFlashMode != 0) {
            z11 = false;
        }
        zslControl.setZslDisabledByFlashMode(z11);
        this.mFlashModeChangeSessionUpdateFuture = updateSessionConfigAsync();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> setLinearZoom(float f11) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.mZoomControl.setLinearZoom(f11));
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> setTorchStrengthLevel(@IntRange(from = 1) int i11) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        if (!this.mCameraCharacteristics.isTorchStrengthLevelSupported()) {
            return Futures.immediateFailedFuture(new UnsupportedOperationException("The device doesn't support configuring torch strength level."));
        }
        if (i11 >= 1 && i11 <= this.mCameraCharacteristics.getMaxTorchStrengthLevel()) {
            return Futures.nonCancellationPropagating(this.mTorchControl.setTorchStrengthLevel(Math.min(i11, this.mCameraCharacteristics.getMaxTorchStrengthLevel())));
        }
        return Futures.immediateFailedFuture(new IllegalArgumentException("The specified torch strength is not within the valid range."));
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> setZoomRatio(float f11) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.mZoomControl.setZoomRatio(f11));
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        if (!isRepeatingRequestAvailable()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Repeating request is not available possibly because it's disable for the ImageCapture."));
        }
        return Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture<List<Void>> submitStillCaptureRequests(final List<CaptureConfig> list, final int i11, final int i12) {
        if (!isControlInUse()) {
            Logger.m1872w(TAG, "Camera is not active.");
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final int flashMode = getFlashMode();
        return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.k
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return this.f1376a.mCamera2CapturePipeline.submitStillCaptures(list, i11, flashMode, i12);
            }
        }, this.mExecutor);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1644b() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1645c() {
    }
}
