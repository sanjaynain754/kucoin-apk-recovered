package fi0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: fi0.f */
/* JADX INFO: compiled from: OAIDRom.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C37506f {
    /* JADX INFO: renamed from: c */
    public static boolean m84456c(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84454a() {
        return Build.MANUFACTURER.equalsIgnoreCase("ASUS") || Build.BRAND.equalsIgnoreCase("ASUS");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m84455b() {
        return Build.MANUFACTURER.equalsIgnoreCase("BLACKSHARK") || Build.BRAND.equalsIgnoreCase("BLACKSHARK");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m84457d() {
        return m84471r("ro.odm.manufacturer", "").equalsIgnoreCase("PRIZE");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m84458e() {
        return !TextUtils.isEmpty(m84471r("ro.build.version.emui", ""));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m84459f() {
        return !TextUtils.isEmpty(m84471r("ro.build.freeme.label", ""));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m84460g() {
        if (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("HUAWEI") || str.equalsIgnoreCase("HONOR");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m84461h() {
        if (Build.MANUFACTURER.equalsIgnoreCase("LENOVO")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("LENOVO") || str.equalsIgnoreCase("ZUK");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m84462i() {
        return Build.MANUFACTURER.equalsIgnoreCase("MEIZU") || Build.BRAND.equalsIgnoreCase("MEIZU") || Build.DISPLAY.toUpperCase().contains("FLYME");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m84463j() {
        return !TextUtils.isEmpty(m84471r("ro.miui.ui.version.name", ""));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m84464k() {
        return Build.MANUFACTURER.equalsIgnoreCase("MOTOLORA") || Build.BRAND.equalsIgnoreCase("MOTOLORA");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m84465l() {
        return Build.MANUFACTURER.equalsIgnoreCase("NUBIA") || Build.BRAND.equalsIgnoreCase("NUBIA");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m84466m() {
        return Build.MANUFACTURER.equalsIgnoreCase("ONEPLUS") || Build.BRAND.equalsIgnoreCase("ONEPLUS");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m84467n() {
        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("OPPO") || str.equalsIgnoreCase("REALME") || !TextUtils.isEmpty(m84471r("ro.build.version.opporom", ""));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m84468o() {
        return Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG") || Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }

    /* JADX INFO: renamed from: p */
    public static boolean m84469p() {
        return Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.BRAND.equalsIgnoreCase("VIVO") || !TextUtils.isEmpty(m84471r("ro.vivo.os.version", ""));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m84470q() {
        if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("XIAOMI") || str.equalsIgnoreCase("REDMI");
    }

    /* JADX INFO: renamed from: r */
    public static String m84471r(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e11) {
            C37505e.m84453a("System property invoke error: " + e11);
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }
}
