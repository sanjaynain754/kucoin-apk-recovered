package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(28)
class CameraCharacteristicsApi28Impl extends CameraCharacteristicsBaseImpl {
    private static final String TAG = "CameraCharacteristicsImpl";

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Set<String> getPhysicalCameraIds() {
        try {
            return this.mCameraCharacteristics.getPhysicalCameraIds();
        } catch (Exception e11) {
            Logger.m1869e(TAG, "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e11);
            return Collections.EMPTY_SET;
        }
    }

    public CameraCharacteristicsApi28Impl(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }
}
