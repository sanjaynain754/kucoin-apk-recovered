package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoStabilizationUtil {
    public static boolean isPreviewStabilizationSupported(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i11 : iArr) {
                if (i11 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private VideoStabilizationUtil() {
    }
}
