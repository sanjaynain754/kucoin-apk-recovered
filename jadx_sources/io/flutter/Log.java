package io.flutter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static int logLevel = 3;

    /* JADX INFO: renamed from: d */
    public static void m87475d(@NonNull String str, @NonNull String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m87477e(@NonNull String str, @NonNull String str2) {
        android.util.Log.e(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m87479i(@NonNull String str, @NonNull String str2) {
    }

    /* JADX INFO: renamed from: v */
    public static void m87481v(@NonNull String str, @NonNull String str2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m87483w(@NonNull String str, @NonNull String str2) {
        android.util.Log.w(str, str2);
    }

    public static void wtf(@NonNull String str, @NonNull String str2) {
        android.util.Log.wtf(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m87476d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m87478e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        android.util.Log.e(str, str2, th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m87480i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    public static void setLogLevel(int i11) {
        logLevel = i11;
    }

    /* JADX INFO: renamed from: v */
    public static void m87482v(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m87484w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        android.util.Log.w(str, str2, th2);
    }

    public static void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        android.util.Log.wtf(str, str2, th2);
    }

    @NonNull
    public static String getStackTraceString(@Nullable Throwable th2) {
        return android.util.Log.getStackTraceString(th2);
    }

    public static void println(@NonNull int i11, @NonNull String str, @NonNull String str2) {
    }
}
