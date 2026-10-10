package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: loaded from: classes23.dex */
public class ExtensionDisabledQuirk implements Quirk {
    private static boolean isAdvancedExtenderSupported() {
        return ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_2) && ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static boolean isPixel5() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean shouldDisableForSamsungA52s5g(String str) {
        return str.equals("0");
    }

    private static boolean isMoto() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean isRealme() {
        return JPushConstants.Manufacturer.REALME.equalsIgnoreCase(Build.BRAND);
    }

    private static boolean isSamsungA52s5g() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "a52sxq".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        if (!isPixel5() && !isMoto() && !isRealme() && !isSamsungA52s5g()) {
            return false;
        }
        return true;
    }

    public boolean shouldDisableExtension(String str) {
        if (isPixel5() && !isAdvancedExtenderSupported()) {
            return true;
        }
        if (isMoto() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        if (isRealme() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        if (isSamsungA52s5g()) {
            return shouldDisableForSamsungA52s5g(str);
        }
        return false;
    }
}
