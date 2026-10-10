package com.tencent.imsdk.common;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes59.dex */
public class IMLog {
    public static final int LOG_LEVEL_DEBUG = 3;
    public static final int LOG_LEVEL_ERROR = 6;
    public static final int LOG_LEVEL_INFO = 4;
    public static final int LOG_LEVEL_OFF = 0;
    public static final int LOG_LEVEL_VERBOSE = 2;
    public static final int LOG_LEVEL_WARN = 5;
    private static final String TAG = "IMLog";

    /* JADX INFO: renamed from: d */
    public static void m75913d(String str, String str2) {
        log(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m75914e(String str, String str2) {
        log(6, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m75915i(String str, String str2) {
        log(4, str, str2);
    }

    public static native void nativeWriteLog(int i11, String str, String str2, int i12, String str3);

    /* JADX INFO: renamed from: v */
    public static void m75916v(String str, String str2) {
        log(2, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m75917w(String str, String str2) {
        log(5, str, str2);
    }

    private static void log(int i11, String str, String str2) {
        if (!SystemUtil.loadIMLibrary()) {
            Log.e(TAG, "libImSDK.so is not loaded");
            return;
        }
        if (i11 >= 0 && i11 <= 6) {
            if (TextUtils.isEmpty(str)) {
                m75914e(TAG, "empty logTag");
                return;
            } else if (TextUtils.isEmpty(str2)) {
                m75914e(TAG, "empty logContent");
                return;
            } else {
                nativeWriteLog(i11, str, "", 0, str2);
                return;
            }
        }
        m75914e(TAG, "invalid logLevel： " + i11);
    }

    public static void writeException(String str, String str2, Throwable th2) {
        if (!SystemUtil.loadIMLibrary()) {
            Log.e(TAG, "libImSDK.so is not loaded");
            return;
        }
        Log.e(str, str2 + " exception : " + Log.getStackTraceString(th2));
    }
}
