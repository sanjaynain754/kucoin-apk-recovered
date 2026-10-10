package com.tencent.liteav.base;

import com.tencent.bugly.proguard.C33844oi;
import java.util.Locale;

/* JADX INFO: loaded from: classes59.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String sDeprecatedTagPrefix = "cr.";
    private static final String sTagPrefix = "cr_";
    private static final boolean useChromiumLog = true;

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    private static boolean isDebug() {
        return true;
    }

    private static native void nativeWriteLogToNative(int i11, String str, String str2);

    private static String formatLog(String str, Throwable th2, Object... objArr) {
        if (objArr != null) {
            return ((th2 != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr);
        }
        return str;
    }

    private static String formatLogWithStack(String str, Throwable th2, Object... objArr) {
        return "[" + getCallOrigin() + "] " + formatLog(str, th2, objArr);
    }

    public static String normalizeTag(String str) {
        if (str.startsWith(sTagPrefix)) {
            return str;
        }
        return sTagPrefix + str.substring(str.startsWith(sDeprecatedTagPrefix) ? 3 : 0, str.length());
    }

    private Log() {
    }

    /* JADX INFO: renamed from: d */
    public static void m76032d(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(3, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m76033e(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(6, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i11 = 0;
        while (i11 < stackTrace.length) {
            if (stackTrace[i11].getClassName().equals(name)) {
                i11 += 3;
                break;
            }
            i11++;
        }
        return stackTrace[i11].getFileName() + C33844oi.f71346o + stackTrace[i11].getLineNumber();
    }

    public static String getStackTraceString(Throwable th2) {
        return android.util.Log.getStackTraceString(th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m76034i(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(4, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    public static boolean isLoggable(String str, int i11) {
        if (!isDebug() && i11 <= 4) {
            return false;
        }
        return android.util.Log.isLoggable(str, i11);
    }

    /* JADX INFO: renamed from: v */
    public static void m76035v(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(2, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m76036w(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(5, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    public static void wtf(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(7, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }
}
