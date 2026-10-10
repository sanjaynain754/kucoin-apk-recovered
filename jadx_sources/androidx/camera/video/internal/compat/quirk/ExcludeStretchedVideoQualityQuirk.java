package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;

/* JADX INFO: loaded from: classes23.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    private static boolean isSamsungJ2() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J260F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungJ4() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungJ5() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J530F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungJ6() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "sm-j600g".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungJ7Api27Above() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean isSamsungJ7Nxt() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J701F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean load() {
        if (!isSamsungJ2() && !isSamsungJ4() && !isSamsungJ5() && !isSamsungJ6() && !isSamsungJ7Nxt() && !isSamsungJ7PrimeApi27Above() && !isSamsungJ7Api27Above()) {
            return false;
        }
        return true;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, Quality quality) {
        if (isSamsungJ4()) {
            if (quality == Quality.FHD || quality == Quality.UHD) {
                return true;
            }
            return false;
        }
        if ((isSamsungJ2() || isSamsungJ5() || isSamsungJ6() || isSamsungJ7Nxt() || isSamsungJ7PrimeApi27Above() || isSamsungJ7Api27Above()) && quality == Quality.FHD) {
            return true;
        }
        return false;
    }
}
