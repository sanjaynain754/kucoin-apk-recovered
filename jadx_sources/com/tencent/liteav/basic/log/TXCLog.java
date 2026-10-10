package com.tencent.liteav.basic.log;

import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.util.SoLoader;

/* JADX INFO: loaded from: classes59.dex */
@Deprecated
public class TXCLog {
    /* JADX INFO: renamed from: d */
    public static void m76150d(String str, String str2, Object... objArr) {
        m76149d(str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m76152e(String str, String str2, Object... objArr) {
        m76151e(str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: i */
    public static void m76154i(String str, String str2, Object... objArr) {
        m76153i(str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: v */
    public static void m76156v(String str, String str2, Object... objArr) {
        m76155v(str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m76158w(String str, String str2, Object... objArr) {
        m76157w(str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m76149d(String str, String str2) {
        Log.m76032d(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: e */
    public static void m76151e(String str, String str2) {
        Log.m76033e(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public static void m76153i(String str, String str2) {
        Log.m76034i(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: v */
    public static void m76155v(String str, String str2) {
        Log.m76035v(str, str2, new Object[0]);
    }

    /* JADX INFO: renamed from: w */
    public static void m76157w(String str, String str2) {
        Log.m76036w(str, str2, new Object[0]);
    }

    static {
        SoLoader.loadAllLibraries();
    }
}
