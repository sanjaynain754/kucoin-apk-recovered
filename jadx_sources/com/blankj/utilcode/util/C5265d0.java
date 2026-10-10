package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.blankj.utilcode.util.d0 */
/* JADX INFO: compiled from: SPUtils.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ApplySharedPref"})
public final class C5265d0 {

    /* JADX INFO: renamed from: b */
    public static final Map<String, C5265d0> f6510b = new HashMap();

    /* JADX INFO: renamed from: a */
    public SharedPreferences f6511a;

    /* JADX INFO: renamed from: a */
    public static C5265d0 m6172a(String str) {
        return m6173b(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6174e(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isWhitespace(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public String m6175c(@NonNull String str) {
        if (str != null) {
            return m6176d(str, "");
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: d */
    public String m6176d(@NonNull String str, String str2) {
        if (str != null) {
            return this.f6511a.getString(str, str2);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: f */
    public void m6177f(@NonNull String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6178g(str, str2, false);
    }

    /* JADX INFO: renamed from: g */
    public void m6178g(@NonNull String str, String str2, boolean z11) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z11) {
            this.f6511a.edit().putString(str, str2).commit();
        } else {
            this.f6511a.edit().putString(str, str2).apply();
        }
    }

    public C5265d0(String str, int i11) {
        this.f6511a = C5287o0.m6331a().getSharedPreferences(str, i11);
    }

    /* JADX INFO: renamed from: b */
    public static C5265d0 m6173b(String str, int i11) {
        C5265d0 c5265d0;
        if (m6174e(str)) {
            str = "spUtils";
        }
        Map<String, C5265d0> map = f6510b;
        C5265d0 c5265d1 = map.get(str);
        if (c5265d1 == null) {
            synchronized (C5265d0.class) {
                try {
                    c5265d0 = map.get(str);
                    if (c5265d0 == null) {
                        c5265d0 = new C5265d0(str, i11);
                        map.put(str, c5265d0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c5265d0;
        }
        return c5265d1;
    }
}
