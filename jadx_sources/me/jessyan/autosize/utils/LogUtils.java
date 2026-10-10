package me.jessyan.autosize.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class LogUtils {
    private static final String TAG = "AndroidAutoSize";
    private static boolean debug;

    /* JADX INFO: renamed from: d */
    public static void m93243d(String str) {
        if (debug) {
            Log.d(TAG, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m93244e(String str) {
        if (debug) {
            Log.e(TAG, str);
        }
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean z11) {
        debug = z11;
    }

    /* JADX INFO: renamed from: w */
    public static void m93245w(String str) {
        if (debug) {
            Log.w(TAG, str);
        }
    }

    private LogUtils() {
        throw new IllegalStateException("you can't instantiate me!");
    }
}
