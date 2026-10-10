package com.blankj.utilcode.util;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.blankj.utilcode.util.w0 */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C5303w0 {
    /* JADX INFO: renamed from: a */
    public static boolean m6511a() {
        if (TextUtils.getLayoutDirectionFromLocale(C5287o0.m6331a().getResources().getConfiguration().getLocales().get(0)) != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m6512b(Runnable runnable) {
        C5299u0.m6473K(runnable);
    }
}
