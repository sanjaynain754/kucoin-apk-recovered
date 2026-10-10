package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6529d3 {
    @NonNull
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: a */
    public static Boolean m12222a(String str, boolean z11) throws IllegalArgumentException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, str, Boolean.valueOf(z11));
            if (objInvoke instanceof Boolean) {
                return (Boolean) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z11);
    }

    @NonNull
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: b */
    public static Integer m12223b(String str, int i11) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i11));
            if (objInvoke instanceof Integer) {
                return (Integer) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i11);
    }

    @NonNull
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: c */
    public static Long m12224c(String str, long j11) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("getLong", String.class, Long.TYPE).invoke(cls, str, Long.valueOf(j11));
            if (objInvoke instanceof Long) {
                return (Long) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return Long.valueOf(j11);
    }

    @Nullable
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: d */
    public static String m12225d(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return str2;
    }
}
