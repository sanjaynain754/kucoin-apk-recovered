package com.facebook.soloader;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes45.dex */
public class LogUtil {
    /* JADX INFO: renamed from: d */
    public static void m10651d(String str, String str2, Throwable th2) {
        if (isLoggable(str, 3)) {
            Log.d(str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m10653e(String str, String str2, Throwable th2) {
        Log.e(str, str2, th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m10655i(String str, String str2, Throwable th2) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m10657v(String str, String str2, Throwable th2) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m10659w(String str, String str2, Throwable th2) {
        Log.w(str, str2, th2);
    }

    /* JADX INFO: renamed from: e */
    public static void m10652e(String str, String str2) {
        Log.e(str, str2);
    }

    private static boolean isLoggable(String str, int i11) {
        return (Build.VERSION.SDK_INT > 25 || str.length() <= 23) ? Log.isLoggable(str, i11) : Log.isLoggable(str.substring(0, 23), i11);
    }

    /* JADX INFO: renamed from: w */
    public static void m10658w(String str, String str2) {
        Log.w(str, str2);
    }

    private LogUtil() {
    }

    /* JADX INFO: renamed from: d */
    public static void m10650d(String str, String str2) {
        if (isLoggable(str, 3)) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m10654i(String str, String str2) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m10656v(String str, String str2) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }
}
