package androidx.camera.core.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraMode {
    public static final int CONCURRENT_CAMERA = 1;
    public static final int DEFAULT = 0;
    public static final int ULTRA_HIGH_RESOLUTION_CAMERA = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public static String toLabelString(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
        }
        return "CONCURRENT_CAMERA";
    }

    private CameraMode() {
    }
}
