package androidx.camera.camera2.internal;

import androidx.annotation.OptIn;
import androidx.camera.core.ExperimentalLensFacing;
import androidx.camera.core.Logger;

/* JADX INFO: loaded from: classes23.dex */
public class LensFacingUtil {
    private static final String TAG = "LensFacingUtil";

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getCameraSelectorLensFacing(int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                Logger.m1872w(TAG, "The given lens facing integer: " + i11 + " can not be recognized.");
                return -1;
            }
        }
        return i12;
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getLensFacingInt(int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                Logger.m1872w(TAG, "The given lens facing: " + i11 + " can not be recognized.");
                return -1;
            }
        }
        return i12;
    }

    private LensFacingUtil() {
    }
}
