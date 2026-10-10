package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: loaded from: classes23.dex */
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    private static boolean isMotorolaMotoG3() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean isSamsungSMA920F() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean isSamsungSMG532F() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean isSamsungSMJ415F() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean isSamsungSMJ700F() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean isXiaomiMiA1() {
        if (JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (!isMotorolaMotoG3() && !isSamsungSMG532F() && !isSamsungSMJ700F() && !isSamsungSMA920F() && !isSamsungSMJ415F() && !isXiaomiMiA1()) {
            return false;
        }
        return true;
    }
}
