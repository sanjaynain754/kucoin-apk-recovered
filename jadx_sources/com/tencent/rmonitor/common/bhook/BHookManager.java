package com.tencent.rmonitor.common.bhook;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class BHookManager {

    /* JADX INFO: renamed from: a */
    public static final String f75228a = "RMonitor_BHook_Manager";

    /* JADX INFO: renamed from: b */
    public static boolean f75229b;

    private static native int getSigLongJmpNumberNative();

    static {
        try {
            System.loadLibrary("rmonitor_base");
            f75229b = true;
        } catch (Throwable unused) {
            f75229b = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m77127a() {
        if (f75229b) {
            return getSigLongJmpNumberNative();
        }
        return 0;
    }
}
