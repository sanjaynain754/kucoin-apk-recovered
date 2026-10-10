package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
final class LowLightBoostControl {
    static final int DEFAULT_LLB_STATE = -1;
    private static final String TAG = "LowLightBoostControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;

    @VisibleForTesting
    final Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener;
    CallbackToFutureAdapter.Completer<Void> mEnableLlbCompleter;
    private final Executor mExecutor;
    private boolean mIsActive;
    private final boolean mIsLowLightBoostSupported;
    private final MutableLiveData<Integer> mLowLightBoostState;
    boolean mTargetLlbEnabled;
    private final AtomicInteger mLowLightBoostStateAtomic = new AtomicInteger(-1);
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mLowLightBoostDisabledByUseCaseSessionConfig = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1745b(final LowLightBoostControl lowLightBoostControl, final boolean z11, final CallbackToFutureAdapter.Completer completer) {
        lowLightBoostControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l3
            @Override // java.lang.Runnable
            public final void run() {
                this.f1395b.enableLowLightBoostInternal(completer, z11);
            }
        });
        return "enableLowLightBoost: " + z11;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m1746c(LowLightBoostControl lowLightBoostControl, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (lowLightBoostControl.mEnableLlbCompleter != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == lowLightBoostControl.mTargetLlbEnabled) {
                    lowLightBoostControl.mEnableLlbCompleter.set(null);
                    lowLightBoostControl.mEnableLlbCompleter = null;
                    if (Build.VERSION.SDK_INT >= 35) {
                        lowLightBoostControl.setLiveDataValue(lowLightBoostControl.mLowLightBoostState, num.intValue());
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 35 && lowLightBoostControl.mTargetLlbEnabled && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            lowLightBoostControl.setLiveDataValue(lowLightBoostControl.mLowLightBoostState, num.intValue());
        }
        return false;
    }

    public static boolean checkLowLightBoostAvailability(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i11 : iArr) {
                if (i11 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    private void setLiveDataValue(MutableLiveData<Integer> mutableLiveData, int i11) {
        if (this.mLowLightBoostStateAtomic.getAndSet(i11) != i11) {
            if (Threads.isMainThread()) {
                mutableLiveData.setValue(Integer.valueOf(i11));
            } else {
                mutableLiveData.postValue(Integer.valueOf(i11));
            }
        }
    }

    public ListenableFuture<Void> enableLowLightBoost(final boolean z11) {
        if (this.mIsLowLightBoostSupported) {
            setLiveDataValue(this.mLowLightBoostState, z11 ? 0 : -1);
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.m3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return LowLightBoostControl.m1745b(this.f1404a, z11, completer);
                }
            });
        }
        Logger.m1866d(TAG, "Unable to enable low-light boost due to it is not supported.");
        return Futures.immediateFailedFuture(new IllegalStateException("Low-light boost is not supported"));
    }

    public void enableLowLightBoostInternal(CallbackToFutureAdapter.Completer<Void> completer, boolean z11) {
        synchronized (this.mLock) {
            try {
                if (this.mLowLightBoostDisabledByUseCaseSessionConfig) {
                    setLiveDataValue(this.mLowLightBoostState, -1);
                    if (completer != null) {
                        completer.setException(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                    }
                } else {
                    if (!this.mIsActive) {
                        setLiveDataValue(this.mLowLightBoostState, -1);
                        if (completer != null) {
                            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                            return;
                        }
                        return;
                    }
                    this.mTargetLlbEnabled = z11;
                    this.mCamera2CameraControlImpl.enableLowLightBoostInternal(z11);
                    setLiveDataValue(this.mLowLightBoostState, z11 ? 0 : -1);
                    CallbackToFutureAdapter.Completer<Void> completer2 = this.mEnableLlbCompleter;
                    if (completer2 != null) {
                        completer2.setException(new CameraControl.OperationCanceledException("There is a new enableLowLightBoost being set"));
                    }
                    this.mEnableLlbCompleter = completer;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LiveData<Integer> getLowLightBoostState() {
        return this.mLowLightBoostState;
    }

    public boolean isLowLightBoostDisabledByUseCaseSessionConfig() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mLowLightBoostDisabledByUseCaseSessionConfig;
        }
        return z11;
    }

    public boolean isLowLightBoostSupported() {
        return this.mIsLowLightBoostSupported;
    }

    public void setActive(boolean z11) {
        if (this.mIsActive == z11) {
            return;
        }
        this.mIsActive = z11;
        if (z11) {
            return;
        }
        if (this.mTargetLlbEnabled) {
            this.mTargetLlbEnabled = false;
            this.mCamera2CameraControlImpl.enableLowLightBoostInternal(false);
            setLiveDataValue(this.mLowLightBoostState, -1);
        }
        CallbackToFutureAdapter.Completer<Void> completer = this.mEnableLlbCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mEnableLlbCompleter = null;
        }
    }

    public void setLowLightBoostDisabledByUseCaseSessionConfig(boolean z11) {
        synchronized (this.mLock) {
            try {
                this.mLowLightBoostDisabledByUseCaseSessionConfig = z11;
                if (z11) {
                    if (this.mTargetLlbEnabled) {
                        this.mTargetLlbEnabled = false;
                        this.mCamera2CameraControlImpl.enableLowLightBoostInternal(false);
                        setLiveDataValue(this.mLowLightBoostState, -1);
                        CallbackToFutureAdapter.Completer<Void> completer = this.mEnableLlbCompleter;
                        if (completer != null) {
                            completer.setException(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.mEnableLlbCompleter = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LowLightBoostControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        boolean zCheckLowLightBoostAvailability = checkLowLightBoostAvailability(cameraCharacteristicsCompat);
        this.mIsLowLightBoostSupported = zCheckLowLightBoostAvailability;
        this.mLowLightBoostState = new MutableLiveData<>(-1);
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.k3
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return LowLightBoostControl.m1746c(this.f1386a, totalCaptureResult);
            }
        };
        this.mCaptureResultListener = captureResultListener;
        if (zCheckLowLightBoostAvailability) {
            camera2CameraControlImpl.addCaptureResultListener(captureResultListener);
        }
    }
}
