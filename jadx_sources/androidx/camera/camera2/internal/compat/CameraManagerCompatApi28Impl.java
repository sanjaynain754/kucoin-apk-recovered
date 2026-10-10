package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(28)
class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    public CameraManagerCompatApi28Impl(Context context) {
        super(context, null);
    }

    public static CameraManagerCompatApi28Impl create(Context context) {
        return new CameraManagerCompatApi28Impl(context);
    }

    private boolean isDndFailCase(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && isDndRuntimeException(th2);
    }

    private void throwDndException(Throwable th2) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th2);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        } catch (IllegalArgumentException e12) {
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            if (isDndFailCase(e14)) {
                throwDndException(e14);
            }
            throw e14;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallback);
    }

    private static boolean isDndRuntimeException(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e11) {
            if (isDndFailCase(e11)) {
                throwDndException(e11);
            }
            throw e11;
        }
    }
}
