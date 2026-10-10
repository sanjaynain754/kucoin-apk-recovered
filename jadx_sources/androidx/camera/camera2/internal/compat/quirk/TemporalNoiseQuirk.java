package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* JADX INFO: loaded from: classes23.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean isPixel8() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (isPixel8() && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
