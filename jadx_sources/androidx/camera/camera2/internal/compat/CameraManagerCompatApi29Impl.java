package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(29)
class CameraManagerCompatApi29Impl extends CameraManagerCompatApi28Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }

    public CameraManagerCompatApi29Impl(Context context) {
        super(context);
    }
}
