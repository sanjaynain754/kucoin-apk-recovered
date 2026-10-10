package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.bugly.common.p127sp.ISharedPreferencesProvider;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ig */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33716ig implements ISharedPreferencesProvider {

    /* JADX INFO: renamed from: c */
    public static final String f70290c = "SPProvider";

    /* JADX INFO: renamed from: d */
    public static C33716ig f70291d;

    /* JADX INFO: renamed from: a */
    public ISharedPreferencesProvider f70292a = null;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f70293b = null;

    /* JADX INFO: renamed from: a */
    public static C33716ig m73433a() {
        if (f70291d == null) {
            synchronized (C33716ig.class) {
                try {
                    if (f70291d == null) {
                        f70291d = new C33716ig();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f70291d;
    }

    @Override // com.tencent.bugly.common.p127sp.ISharedPreferencesProvider
    public SharedPreferences getSharedPreferences(Context context, String str, boolean z11) {
        ISharedPreferencesProvider iSharedPreferencesProvider = this.f70292a;
        if (iSharedPreferencesProvider != null) {
            return iSharedPreferencesProvider.getSharedPreferences(context, str, z11);
        }
        if (context != null) {
            return context.getSharedPreferences(str, z11 ? 4 : 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m73435a(ISharedPreferencesProvider iSharedPreferencesProvider) {
        if (iSharedPreferencesProvider == this) {
            Logger.INSTANCE.mo77131e(f70290c, "setProvider fail , can't set SharedPreferencesProvider self.");
        } else {
            this.f70292a = iSharedPreferencesProvider;
        }
    }

    /* JADX INFO: renamed from: a */
    public SharedPreferences m73434a(Context context) {
        if (this.f70293b == null) {
            this.f70293b = getSharedPreferences(context, InterfaceC33611dg.f69592a, true);
        }
        return this.f70293b;
    }
}
