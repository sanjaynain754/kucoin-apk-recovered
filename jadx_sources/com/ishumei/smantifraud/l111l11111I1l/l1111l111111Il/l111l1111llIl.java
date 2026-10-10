package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.Context;
import android.os.Build;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.ishumei.smantifraud.SmAntiFraud;

/* JADX INFO: loaded from: classes.dex */
public class l111l1111llIl {
    private static final long l1111l111111Il = 2000;
    private static boolean l111l11111Il = false;
    private static boolean l111l1111l1Il = false;
    private static String l111l1111lI1l = "hy_timeh";
    private static String l111l1111lIl = "android";
    private static String l111l1111llIl = "3.7.3";
    private static final String l11l1111I11l = "fp-it.fengkongcloud.com";
    private static final String l11l1111I1l = "api-fp-retry-bj.fengkongcloud.com";
    private static final String l11l1111I1ll = "fp-sa-it.fengkongcloud.com";
    private static final String l11l1111Il = "api-fp-retry-sa.fengkongcloud.com";
    private static final String l11l1111Il1l = "fp-na-it-acc.fengkongcloud.com";
    private static final String l11l1111Ill = "api-fp-retry-na.fengkongcloud.com";
    private static int l11l1111lIIl = 30;
    private static final String l11l111l11Il = "/v3/cloudconf";
    private static final String l11l11IlIIll = "/deviceprofile/v4";
    private l111l1111lI1l l111l11111I1l;
    private final Context l111l11111lIl;

    public l111l1111llIl() {
    }

    private l111l1111lI1l l111l11111lIl() {
        if (this.l111l11111lIl == null) {
            return null;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains("asus")) {
            return new l1111l111111Il(this.l111l11111lIl);
        }
        if (lowerCase.contains(JPushConstants.Manufacturer.HUAWEI) || lowerCase.contains(JPushConstants.Manufacturer.HONOR)) {
            return new l111l11111lIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("lenovo")) {
            return new l111l11111I1l(this.l111l11111lIl);
        }
        if (lowerCase.contains(JPushConstants.Manufacturer.MEIZU)) {
            return new l111l11111Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("nubia")) {
            return new l111l1111l1Il(this.l111l11111lIl);
        }
        if (lowerCase.contains(JPushConstants.Manufacturer.ONEPLUS)) {
            return new l111l1111lIl(this.l111l11111lIl);
        }
        if (lowerCase.contains(JPushConstants.Manufacturer.OPPO)) {
            return new l11l1111lIIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("samsung")) {
            return new l11l1111I11l(this.l111l11111lIl);
        }
        if (lowerCase.contains(JPushConstants.Manufacturer.VIVO)) {
            return new l11l1111I1l(this.l111l11111lIl);
        }
        if (lowerCase.contains(JPushConstants.Manufacturer.XIAOMI)) {
            return new l11l1111I1ll(this.l111l11111lIl);
        }
        if (lowerCase.contains("zte")) {
            return new l11l1111Il(this.l111l11111lIl);
        }
        return null;
    }

    public final String l1111l111111Il() {
        l111l1111lI1l l111l1111li1l = this.l111l11111I1l;
        return l111l1111li1l == null ? "" : l111l1111li1l.l1111l111111Il(2000L);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    public l111l1111llIl(Context context) {
        l111l1111lI1l l111l11111lil;
        this.l111l11111lIl = context;
        if (context != null) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (lowerCase.contains("asus")) {
                l111l11111lil = new l1111l111111Il(context);
            } else if (lowerCase.contains(JPushConstants.Manufacturer.HUAWEI) || lowerCase.contains(JPushConstants.Manufacturer.HONOR)) {
                l111l11111lil = new l111l11111lIl(context);
            } else if (lowerCase.contains("lenovo")) {
                l111l11111lil = new l111l11111I1l(context);
            } else if (lowerCase.contains(JPushConstants.Manufacturer.MEIZU)) {
                l111l11111lil = new l111l11111Il(context);
            } else if (lowerCase.contains("nubia")) {
                l111l11111lil = new l111l1111l1Il(context);
            } else if (lowerCase.contains(JPushConstants.Manufacturer.ONEPLUS)) {
                l111l11111lil = new l111l1111lIl(context);
            } else if (lowerCase.contains(JPushConstants.Manufacturer.OPPO)) {
                l111l11111lil = new l11l1111lIIl(context);
            } else if (lowerCase.contains("samsung")) {
                l111l11111lil = new l11l1111I11l(context);
            } else if (lowerCase.contains(JPushConstants.Manufacturer.VIVO)) {
                l111l11111lil = new l11l1111I1l(context);
            } else if (lowerCase.contains(JPushConstants.Manufacturer.XIAOMI)) {
                l111l11111lil = new l11l1111I1ll(context);
            } else if (lowerCase.contains("zte")) {
                l111l11111lil = new l11l1111Il(context);
            } else {
                l111l11111lil = null;
            }
        } else {
            l111l11111lil = null;
        }
        this.l111l11111I1l = l111l11111lil;
    }

    public static String l1111l111111Il(String str) {
        str.getClass();
        switch (str) {
            case "bj":
                return "001";
            case "xjp":
                return "010";
            case "fjny":
                return "011";
            default:
                return str;
        }
    }

    public static String l111l11111I1l(String str, boolean z11) {
        return l1111l111111Il(z11) + l111l11111Il(str, false) + l11l111l11Il;
    }

    public static String l111l11111lIl(String str, boolean z11) {
        return l1111l111111Il(z11) + l111l11111Il(str, true) + l11l11IlIIll;
    }

    public static String l1111l111111Il(String str, boolean z11) {
        return l1111l111111Il(z11) + l111l11111Il(str, false) + l11l11IlIIll;
    }

    private static String l111l11111Il(String str, boolean z11) {
        str.getClass();
        if (!str.equals(SmAntiFraud.AREA_XJP)) {
            if (!str.equals(SmAntiFraud.AREA_FJNY)) {
                if (z11) {
                    return l11l1111I1l;
                }
                return l11l1111I11l;
            }
            if (z11) {
                return l11l1111Ill;
            }
            return l11l1111Il1l;
        }
        if (z11) {
            return l11l1111Il;
        }
        return l11l1111I1ll;
    }

    private static String l1111l111111Il(boolean z11) {
        return z11 ? "https://" : "http://";
    }
}
