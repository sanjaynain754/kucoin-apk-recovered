package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class ZslDisablerQuirk implements Quirk {
    private static final List<String> AFFECTED_SAMSUNG_MODEL = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");
    private static final List<String> AFFECTED_XIAOMI_MODEL = Arrays.asList("MI 8");

    private static boolean isAffectedModel(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAffectedSamsungDevices() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_SAMSUNG_MODEL)) {
            return true;
        }
        return false;
    }

    private static boolean isAffectedXiaoMiDevices() {
        if (JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_XIAOMI_MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        if (!isAffectedSamsungDevices() && !isAffectedXiaoMiDevices()) {
            return false;
        }
        return true;
    }
}
