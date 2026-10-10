package androidx.camera.core;

import android.os.Build;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    /* JADX INFO: renamed from: d */
    public static void m1866d(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 3)) {
            Log.d(strTruncateTag, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1868e(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 6)) {
            Log.e(strTruncateTag, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1870i(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 4)) {
            Log.i(strTruncateTag, str2);
        }
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    /* JADX INFO: renamed from: w */
    public static void m1872w(String str, String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2);
        }
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    private static boolean isLogLevelEnabled(String str, int i11) {
        return sMinLogLevel <= i11 || Log.isLoggable(str, i11);
    }

    public static void setMinLogLevel(@IntRange(from = 3, m1553to = 6) int i11) {
        sMinLogLevel = i11;
    }

    private static String truncateTag(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    private Logger() {
    }

    public static boolean isDebugEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    public static boolean isVerboseEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 2);
    }

    public static boolean isWarnEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    /* JADX INFO: renamed from: d */
    public static void m1867d(String str, String str2, Throwable th2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 3)) {
            Log.d(strTruncateTag, str2, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1869e(String str, String str2, Throwable th2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 6)) {
            Log.e(strTruncateTag, str2, th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1871i(String str, String str2, Throwable th2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 4)) {
            Log.i(strTruncateTag, str2, th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1873w(String str, String str2, Throwable th2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2, th2);
        }
    }
}
