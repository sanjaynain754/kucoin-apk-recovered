package com.forter.mobile.fortersdk;

import android.util.Log;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.c3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6524c3 {

    /* JADX INFO: renamed from: a */
    public static int f10937a;

    /* JADX INFO: renamed from: b */
    public static boolean f10938b;

    /* JADX INFO: renamed from: b */
    public static synchronized void m12210b(int i11) {
        if (i11 > 5 || i11 < 0) {
            return;
        }
        f10937a = i11;
    }

    /* JADX INFO: renamed from: c */
    public static void m12211c(String str, String str2) {
        String strConcat;
        if (f10938b) {
            if (str.length() > 19) {
                strConcat = "Ftr-" + str.substring(0, 19);
            } else {
                strConcat = "Ftr-".concat(str);
            }
            Log.i(strConcat, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12209a() {
    }

    /* JADX INFO: renamed from: d */
    public static void m12212d() {
    }

    /* JADX INFO: renamed from: e */
    public static void m12213e() {
    }

    /* JADX INFO: renamed from: f */
    public static void m12214f() {
    }

    /* JADX INFO: renamed from: g */
    public static void m12215g() {
    }

    /* JADX INFO: renamed from: h */
    public static void m12216h() {
    }
}
