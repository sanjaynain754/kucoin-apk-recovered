package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Quirk;

/* JADX INFO: loaded from: classes23.dex */
public class HdrRepeatingRequestFailureQuirk implements Quirk {
    public boolean workaroundBySurfaceProcessing(DynamicRange dynamicRange) {
        return isSamsungS25Ultra() && (dynamicRange != DynamicRange.SDR);
    }

    private static boolean isSamsungS25Ultra() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "pa3q".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        return isSamsungS25Ultra();
    }
}
