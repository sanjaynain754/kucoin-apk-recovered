package com.tencent.bugly.proguard;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.eg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33632eg {
    /* JADX INFO: renamed from: a */
    public static SharedPreferences.Editor m72964a() {
        SharedPreferences sharedPreferencesM72965b = m72965b();
        if (sharedPreferencesM72965b != null) {
            return sharedPreferencesM72965b.edit();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m72965b() {
        return C33716ig.m73433a().m73434a(C33598d3.m72772c());
    }
}
