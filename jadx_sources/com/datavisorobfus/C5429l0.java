package com.datavisorobfus;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.datavisorobfus.l0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5429l0 {
    /* JADX INFO: renamed from: a */
    public static boolean m7206a() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("ASUS") || Build.BRAND.equalsIgnoreCase("ASUS");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7207b() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("BLACKSHARK") || Build.BRAND.equalsIgnoreCase("BLACKSHARK");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7209d() {
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return true;
            }
            String str = Build.BRAND;
            return str.equalsIgnoreCase("HUAWEI") || str.equalsIgnoreCase("HONOR");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7210e() {
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("LENOVO")) {
                return true;
            }
            String str = Build.BRAND;
            return str.equalsIgnoreCase("LENOVO") || str.equalsIgnoreCase("ZUK");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7211f() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("MEIZU") || Build.BRAND.equalsIgnoreCase("MEIZU") || Build.DISPLAY.toUpperCase().contains("FLYME");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7213h() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("MOTOROLA") || Build.BRAND.equalsIgnoreCase("MOTOROLA");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7214i() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("NUBIA") || Build.BRAND.equalsIgnoreCase("NUBIA");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m7215j() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("ONEPLUS") || Build.BRAND.equalsIgnoreCase("ONEPLUS");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7216k() {
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                return true;
            }
            String str = Build.BRAND;
            return str.equalsIgnoreCase("OPPO") || str.equalsIgnoreCase("REALME") || !TextUtils.isEmpty(C5444t.m7396c("ro.build.version.opporom"));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7217l() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG") || Build.BRAND.equalsIgnoreCase("SAMSUNG");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m7218m() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.BRAND.equalsIgnoreCase("VIVO") || !TextUtils.isEmpty(C5444t.m7396c("ro.vivo.os.version"));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7219n() {
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                return true;
            }
            String str = Build.BRAND;
            return str.equalsIgnoreCase("XIAOMI") || str.equalsIgnoreCase("REDMI");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7208c() {
        try {
            return !TextUtils.isEmpty(C5444t.m7396c("ro.build.version.emui"));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7212g() {
        try {
            return !TextUtils.isEmpty(C5444t.m7396c("ro.miui.ui.version.name"));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }
}
