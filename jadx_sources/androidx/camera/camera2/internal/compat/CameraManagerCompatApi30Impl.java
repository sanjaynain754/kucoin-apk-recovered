package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(30)
class CameraManagerCompatApi30Impl extends CameraManagerCompatApi29Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getConcurrentCameraIds();
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }

    public CameraManagerCompatApi30Impl(Context context) {
        super(context);
    }
}
