package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* JADX INFO: loaded from: classes23.dex */
final class ZslUtil {
    public static boolean isCapabilitySupported(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    private ZslUtil() {
    }
}
