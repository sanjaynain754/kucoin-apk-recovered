package com.geetest.gtc4;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.geetest.gtc4.g6 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6768g6 {
    /* JADX INFO: renamed from: a */
    public static String m12640a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e11) {
            e11.toString();
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12642b() {
        return Build.MANUFACTURER.equalsIgnoreCase("BLACKSHARK") || Build.BRAND.equalsIgnoreCase("BLACKSHARK");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12643c() {
        if (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("HUAWEI") || str.equalsIgnoreCase("HONOR");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12644d() {
        if (Build.MANUFACTURER.equalsIgnoreCase("LENOVO")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("LENOVO") || str.equalsIgnoreCase("ZUK");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12645e() {
        return Build.MANUFACTURER.equalsIgnoreCase("MEIZU") || Build.BRAND.equalsIgnoreCase("MEIZU") || Build.DISPLAY.toUpperCase().contains("FLYME");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12646f() {
        return Build.MANUFACTURER.equalsIgnoreCase("MOTOLORA") || Build.BRAND.equalsIgnoreCase("MOTOLORA");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12647g() {
        return Build.MANUFACTURER.equalsIgnoreCase("NUBIA") || Build.BRAND.equalsIgnoreCase("NUBIA");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12648h() {
        return Build.MANUFACTURER.equalsIgnoreCase("ONEPLUS") || Build.BRAND.equalsIgnoreCase("ONEPLUS");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12649i() {
        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("OPPO") || str.equalsIgnoreCase("REALME") || !TextUtils.isEmpty(m12640a("ro.build.version.opporom", ""));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m12650j() {
        return Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG") || Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12651k() {
        return Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.BRAND.equalsIgnoreCase("VIVO") || !TextUtils.isEmpty(m12640a("ro.vivo.os.version", ""));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12652l() {
        if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("XIAOMI") || str.equalsIgnoreCase("REDMI");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12641a() {
        return Build.MANUFACTURER.equalsIgnoreCase("ASUS") || Build.BRAND.equalsIgnoreCase("ASUS");
    }
}
