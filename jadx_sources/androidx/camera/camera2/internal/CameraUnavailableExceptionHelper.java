package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    public static CameraUnavailableException createFrom(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i11 = 1;
        if (reason != 1) {
            i11 = 2;
            if (reason != 2) {
                i11 = 3;
                if (reason != 3) {
                    i11 = 4;
                    if (reason != 4) {
                        i11 = 5;
                        if (reason != 5) {
                            if (reason != 10001) {
                                i11 = 0;
                            } else {
                                i11 = 6;
                            }
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i11, cameraAccessExceptionCompat);
    }
}
