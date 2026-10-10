package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraIdUtil {
    private CameraIdUtil() {
    }

    public static boolean isBackwardCompatible(CameraManagerCompat cameraManagerCompat, String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) cameraManagerCompat.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e11) {
            throw new InitializationException(CameraUnavailableExceptionHelper.createFrom(e11));
        }
    }
}
