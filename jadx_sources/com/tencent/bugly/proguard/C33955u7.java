package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33955u7 {

    /* JADX INFO: renamed from: d */
    public static volatile C33955u7 f72246d;

    /* JADX INFO: renamed from: a */
    public String f72247a = "";

    /* JADX INFO: renamed from: b */
    public String f72248b = "0";

    /* JADX INFO: renamed from: c */
    public String f72249c = "";

    /* JADX INFO: renamed from: a */
    public String m75164a() {
        return !TextUtils.isEmpty(this.f72247a) ? this.f72247a : this.f72249c;
    }

    /* JADX INFO: renamed from: c */
    public static C33955u7 m75163c() {
        if (f72246d == null) {
            synchronized (C33955u7.class) {
                try {
                    if (f72246d == null) {
                        f72246d = new C33955u7();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72246d;
    }

    /* JADX INFO: renamed from: b */
    public String m75167b() {
        return this.f72248b;
    }

    /* JADX INFO: renamed from: a */
    public void m75166a(String str) {
        this.f72249c = str;
    }

    /* JADX INFO: renamed from: a */
    public void m75165a(Context context) {
        SharedPreferences sharedPreferences = C33716ig.m73433a().getSharedPreferences(context, "BUGLY_COMMON_VALUES", true);
        if (sharedPreferences != null) {
            this.f72247a = sharedPreferences.getString(C33577c3.f69348e, "");
            this.f72248b = sharedPreferences.getString(C33577c3.f69347d, "0");
        }
    }
}
