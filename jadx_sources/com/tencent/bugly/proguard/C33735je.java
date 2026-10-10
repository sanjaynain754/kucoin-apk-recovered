package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.facebook.soloader.MinElf;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.je */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33735je implements InterfaceC33877q9 {

    /* JADX INFO: renamed from: c */
    public static final String f70394c = "RMonitor_Privacy";

    /* JADX INFO: renamed from: d */
    public static final String f70395d = "unknown";

    /* JADX INFO: renamed from: e */
    public static final String f70396e = "model";

    /* JADX INFO: renamed from: f */
    public static final String f70397f = "manufacture";

    /* JADX INFO: renamed from: g */
    public static final String f70398g = "product";

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: a */
    public String mo73409a() {
        return Build.CPU_ABI2;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: b */
    public synchronized String mo73413b() {
        if (!m73562k()) {
            return "unknown";
        }
        String strM73560a = m73560a("manufacture");
        if (TextUtils.isEmpty(strM73560a)) {
            strM73560a = Build.MANUFACTURER;
            m73561a("manufacture", strM73560a);
        }
        return strM73560a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: d */
    public synchronized String mo73416d() {
        if (!m73562k()) {
            return "unknown";
        }
        String strM73560a = m73560a("model");
        if (TextUtils.isEmpty(strM73560a)) {
            strM73560a = Build.MODEL;
            m73561a("model", strM73560a);
        }
        return strM73560a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: f */
    public synchronized String mo73418f() {
        if (!m73562k()) {
            return "unknown";
        }
        String strM73560a = m73560a("product");
        if (TextUtils.isEmpty(strM73560a)) {
            strM73560a = Build.PRODUCT;
            m73561a("product", strM73560a);
        }
        return strM73560a;
    }

    /* JADX INFO: renamed from: a */
    public final void m73561a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences sharedPreferencesM73434a = C33716ig.m73433a().m73434a(C33598d3.m72772c());
        if (sharedPreferencesM73434a != null) {
            sharedPreferencesM73434a.edit().putString(str, str2).apply();
        }
        Logger.INSTANCE.mo77130d(f70394c, "writeValue, key: " + str + ", value: " + str2);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: c */
    public int mo73415c() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: e */
    public String[] mo73417e() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr == null ? InterfaceC33877q9.f71548a : strArr;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: g */
    public String mo73419g() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: h */
    public String mo73420h() {
        return Build.CPU_ABI;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: i */
    public boolean mo73421i() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.product.cpu.abi", "");
            if (objInvoke instanceof String) {
                return ((String) objInvoke).contains(MinElf.ISA.X86);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: j */
    public String mo73422j() {
        return Build.HARDWARE;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m73562k() {
        if (C33598d3.m72772c() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String m73560a(String str) {
        SharedPreferences sharedPreferencesM73434a = C33716ig.m73433a().m73434a(C33598d3.m72772c());
        String string = sharedPreferencesM73434a != null ? sharedPreferencesM73434a.getString(str, null) : null;
        Logger.INSTANCE.mo77130d(f70394c, "readValue, key: " + str + ", value: " + string);
        return string;
    }
}
