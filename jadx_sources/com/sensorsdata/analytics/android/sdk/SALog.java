package com.sensorsdata.analytics.android.sdk;

import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class SALog {
    private static final int CHUNK_SIZE = 4000;
    private static boolean debug;
    private static boolean disableSDK;
    private static boolean enableLog;

    /* JADX INFO: renamed from: d */
    public static void m68587d(String str, String str2) {
        if (!debug || disableSDK) {
            return;
        }
        info(str, str2, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m68589i(String str, String str2) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, str2, null);
    }

    public static void info(String str, String str2, Throwable th2) {
        try {
            if (str2 == null) {
                Log.i(str, null, th2);
                return;
            }
            byte[] bytes = str2.getBytes();
            int length = bytes.length;
            if (length <= 4000) {
                Log.i(str, str2, th2);
                return;
            }
            int i11 = 0;
            while (i11 < length - 4000) {
                int iLastIndexOfLF = lastIndexOfLF(bytes, i11);
                int i12 = iLastIndexOfLF - i11;
                Log.i(str, new String(bytes, i11, i12), null);
                if (i12 < 4000) {
                    iLastIndexOfLF++;
                }
                i11 = iLastIndexOfLF;
            }
            if (length > i11) {
                Log.i(str, new String(bytes, i11, length - i11), th2);
            }
        } catch (Exception e11) {
            printStackTrace(e11);
        }
    }

    public static boolean isLogEnabled() {
        return enableLog;
    }

    private static int lastIndexOfLF(byte[] bArr, int i11) {
        int iMin = Math.min(i11 + 4000, bArr.length - 1);
        for (int i12 = iMin; i12 > iMin - 4000; i12--) {
            if (bArr[i12] == 10) {
                return i12;
            }
        }
        return iMin;
    }

    public static void printStackTrace(Exception exc) {
        if (!enableLog || disableSDK || exc == null) {
            return;
        }
        Log.e("SA.Exception", "", exc);
    }

    public static void setDebug(boolean z11) {
        debug = z11;
    }

    public static void setDisableSDK(boolean z11) {
        disableSDK = z11;
    }

    public static void setEnableLog(boolean z11) {
        enableLog = z11;
    }

    /* JADX INFO: renamed from: d */
    public static void m68588d(String str, String str2, Throwable th2) {
        if (!debug || disableSDK) {
            return;
        }
        info(str, str2, th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m68591i(String str, Throwable th2) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, "", th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m68590i(String str, String str2, Throwable th2) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, str2, th2);
    }
}
