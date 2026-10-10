package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
final class TorchControl {
    static final int DEFAULT_TORCH_STATE = 0;
    static final int OFF = 0;

    /* JADX INFO: renamed from: ON */
    static final int f1230ON = 1;
    private static final String TAG = "TorchControl";
    static final int USED_AS_FLASH = 2;
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private int mDefaultTorchStrength;
    CallbackToFutureAdapter.Completer<Void> mEnableTorchCompleter;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    private boolean mIsTorchStrengthSupported;
    boolean mTargetTorchEnabled;
    private int mTargetTorchStrength;
    private final MutableLiveData<Integer> mTorchState;
    private final MutableLiveData<Integer> mTorchStrength;
    private CallbackToFutureAdapter.Completer<Void> mTorchStrengthCompleter;

    private void setTorchState(int i11) {
        setLiveDataValue(this.mTorchState, Integer.valueOf(i11 != 1 ? 0 : 1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m1767b(TorchControl torchControl, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (torchControl.mEnableTorchCompleter != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == torchControl.mTargetTorchEnabled) {
                torchControl.mEnableTorchCompleter.set(null);
                torchControl.mEnableTorchCompleter = null;
            }
        }
        if (torchControl.mIsTorchStrengthSupported && Build.VERSION.SDK_INT >= 35 && torchControl.mTorchStrengthCompleter != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == torchControl.mTargetTorchStrength) {
            torchControl.mTorchStrengthCompleter.set(null);
            torchControl.mTorchStrengthCompleter = null;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m1768c(final TorchControl torchControl, final int i11, final CallbackToFutureAdapter.Completer completer) {
        torchControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k4
            @Override // java.lang.Runnable
            public final void run() {
                this.f1387b.setTorchStrengthLevelInternal(completer, i11);
            }
        });
        return "setTorchStrength: " + i11;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m1769d(final TorchControl torchControl, final int i11, boolean z11, final CallbackToFutureAdapter.Completer completer) {
        torchControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l4
            @Override // java.lang.Runnable
            public final void run() {
                this.f1398b.enableTorchInternal(completer, i11);
            }
        });
        return "enableTorch: " + z11;
    }

    public ListenableFuture<Void> enableTorch(final boolean z11) {
        if (!this.mHasFlashUnit) {
            Logger.m1866d(TAG, "Unable to enableTorch due to there is no flash unit.");
            return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
        }
        setTorchState(z11 ? 1 : 0);
        final int i11 = z11 ? 1 : 0;
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return TorchControl.m1769d(this.f1373a, i11, z11, completer);
            }
        });
    }

    public void enableTorchInternal(CallbackToFutureAdapter.Completer<Void> completer, int i11) {
        if (!this.mHasFlashUnit) {
            if (completer != null) {
                completer.setException(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.mIsActive) {
            setTorchState(0);
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        if (this.mCamera2CameraControlImpl.isLowLightBoostOn()) {
            if (completer != null) {
                completer.setException(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.mTargetTorchEnabled = i11 != 0;
        this.mCamera2CameraControlImpl.enableTorchInternal(i11);
        setTorchState(i11);
        CallbackToFutureAdapter.Completer<Void> completer2 = this.mEnableTorchCompleter;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.mEnableTorchCompleter = completer;
    }

    public void forceUpdateTorchStateToOff() {
        if (this.mTargetTorchEnabled) {
            this.mTargetTorchEnabled = false;
            setTorchState(0);
        }
    }

    public LiveData<Integer> getTorchState() {
        return this.mTorchState;
    }

    public LiveData<Integer> getTorchStrengthLevel() {
        return this.mTorchStrength;
    }

    public void setActive(boolean z11) {
        if (this.mIsActive == z11) {
            return;
        }
        this.mIsActive = z11;
        if (z11) {
            return;
        }
        if (this.mTargetTorchEnabled) {
            this.mTargetTorchEnabled = false;
            this.mTargetTorchStrength = this.mDefaultTorchStrength;
            this.mCamera2CameraControlImpl.enableTorchInternal(0);
            setTorchState(0);
            setLiveDataValue(this.mTorchStrength, Integer.valueOf(this.mDefaultTorchStrength));
        }
        CallbackToFutureAdapter.Completer<Void> completer = this.mEnableTorchCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mEnableTorchCompleter = null;
        }
        CallbackToFutureAdapter.Completer<Void> completer2 = this.mTorchStrengthCompleter;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mTorchStrengthCompleter = null;
        }
    }

    public ListenableFuture<Void> setTorchStrengthLevel(@IntRange(from = 1) final int i11) {
        if (!this.mIsTorchStrengthSupported) {
            return Futures.immediateFailedFuture(new UnsupportedOperationException("Setting torch strength is not supported on the device."));
        }
        setLiveDataValue(this.mTorchStrength, Integer.valueOf(i11));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.i4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return TorchControl.m1768c(this.f1366a, i11, completer);
            }
        });
    }

    public void setTorchStrengthLevelInternal(CallbackToFutureAdapter.Completer<Void> completer, @IntRange(from = 1) int i11) {
        if (!this.mIsTorchStrengthSupported) {
            if (completer != null) {
                completer.setException(new UnsupportedOperationException("Setting torch strength is not supported on the device."));
                return;
            }
            return;
        }
        if (!this.mIsActive) {
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.mTargetTorchStrength = i11;
        this.mCamera2CameraControlImpl.setTorchStrengthLevelInternal(i11);
        if (!this.mCamera2CameraControlImpl.isTorchOn() && completer != null) {
            completer.set(null);
            return;
        }
        CallbackToFutureAdapter.Completer<Void> completer2 = this.mTorchStrengthCompleter;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("There is a new torch strength being set."));
        }
        this.mTorchStrengthCompleter = completer;
    }

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        int defaultTorchStrengthLevel;
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        Objects.requireNonNull(cameraCharacteristicsCompat);
        boolean zIsFlashAvailable = FlashAvailabilityChecker.isFlashAvailable(new C0879v0(cameraCharacteristicsCompat));
        this.mHasFlashUnit = zIsFlashAvailable;
        boolean zIsTorchStrengthLevelSupported = cameraCharacteristicsCompat.isTorchStrengthLevelSupported();
        this.mIsTorchStrengthSupported = zIsTorchStrengthLevelSupported;
        if (zIsFlashAvailable && zIsTorchStrengthLevelSupported) {
            defaultTorchStrengthLevel = cameraCharacteristicsCompat.getDefaultTorchStrengthLevel();
        } else {
            defaultTorchStrengthLevel = 0;
        }
        this.mDefaultTorchStrength = defaultTorchStrengthLevel;
        this.mTargetTorchStrength = defaultTorchStrengthLevel;
        this.mTorchState = new MutableLiveData<>(0);
        this.mTorchStrength = new MutableLiveData<>(Integer.valueOf(this.mDefaultTorchStrength));
        camera2CameraControlImpl.addCaptureResultListener(new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.m4
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return TorchControl.m1767b(this.f1406a, totalCaptureResult);
            }
        });
    }

    private <T> void setLiveDataValue(MutableLiveData<T> mutableLiveData, T t11) {
        if (Threads.isMainThread()) {
            mutableLiveData.setValue(t11);
        } else {
            mutableLiveData.postValue(t11);
        }
    }
}
