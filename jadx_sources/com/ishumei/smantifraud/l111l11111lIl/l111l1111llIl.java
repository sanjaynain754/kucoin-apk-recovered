package com.ishumei.smantifraud.l111l11111lIl;

import com.ishumei.smantifraud.SmAntiFraud;

/* JADX INFO: loaded from: classes56.dex */
public final class l111l1111llIl {
    private static boolean l1111l111111Il = false;
    private static String l111l11111I1l = "3.7.3";
    private static String l111l11111Il = "hy_timeh";
    private static boolean l111l11111lIl = false;
    private static String l111l1111l1Il = "android";
    private static final String l111l1111lI1l = "fp-it.fengkongcloud.com";
    private static final String l111l1111lIl = "api-fp-retry-bj.fengkongcloud.com";
    private static int l111l1111llIl = 30;
    private static final String l11l1111I11l = "api-fp-retry-sa.fengkongcloud.com";
    private static final String l11l1111I1l = "fp-na-it-acc.fengkongcloud.com";
    private static final String l11l1111I1ll = "api-fp-retry-na.fengkongcloud.com";
    private static final String l11l1111Il = "/deviceprofile/v4";
    private static final String l11l1111Il1l = "/v3/cloudconf";
    private static final String l11l1111lIIl = "fp-sa-it.fengkongcloud.com";

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

    public static String l1111l111111Il(String str, boolean z11) {
        return l1111l111111Il(z11) + l111l11111Il(str, false) + l11l1111Il;
    }

    public static String l111l11111I1l(String str, boolean z11) {
        return l1111l111111Il(z11) + l111l11111Il(str, false) + l11l1111Il1l;
    }

    public static String l111l11111lIl(String str, boolean z11) {
        return l1111l111111Il(z11) + l111l11111Il(str, true) + l11l1111Il;
    }

    private static String l1111l111111Il(boolean z11) {
        return z11 ? "https://" : "http://";
    }

    private static String l111l11111Il(String str, boolean z11) {
        str.getClass();
        if (!str.equals(SmAntiFraud.AREA_XJP)) {
            if (!str.equals(SmAntiFraud.AREA_FJNY)) {
                if (z11) {
                    return l111l1111lIl;
                }
                return l111l1111lI1l;
            }
            if (z11) {
                return l11l1111I1ll;
            }
            return l11l1111I1l;
        }
        if (z11) {
            return l11l1111I11l;
        }
        return l11l1111lIIl;
    }
}
