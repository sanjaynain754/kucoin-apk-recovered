package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;

/* JADX INFO: loaded from: classes23.dex */
public class StopCodecAfterSurfaceRemovalCrashMediaServerQuirk implements Quirk {
    private static boolean isMotoC() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        return isMotoC();
    }
}
