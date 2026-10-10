package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

/* JADX INFO: loaded from: classes23.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements Quirk {
    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return shouldLoadForMotoE20(cameraCharacteristicsCompat);
    }

    private static boolean shouldLoadForMotoE20(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && cameraCharacteristicsCompat.getCameraId().equals("1")) {
            return true;
        }
        return false;
    }
}
