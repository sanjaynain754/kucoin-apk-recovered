package com.geetest.gtc4;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.geetest.gtc4.f6 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6759f6 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC6919x4 f11362a;

    /* JADX INFO: renamed from: a */
    public static InterfaceC6919x4 m12632a(Context context) {
        InterfaceC6919x4 c6830n5;
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        InterfaceC6919x4 interfaceC6919x4 = f11362a;
        if (interfaceC6919x4 != null) {
            return interfaceC6919x4;
        }
        if (AbstractC6768g6.m12644d() || AbstractC6768g6.m12646f()) {
            c6830n5 = new C6830n5(context);
        } else if (AbstractC6768g6.m12645e()) {
            c6830n5 = new C6875s5(context);
        } else if (AbstractC6768g6.m12647g()) {
            c6830n5 = new C6732c6(context);
        } else if (AbstractC6768g6.m12652l() || !TextUtils.isEmpty(AbstractC6768g6.m12640a("ro.miui.ui.version.name", "")) || AbstractC6768g6.m12642b()) {
            c6830n5 = new C6922x7(context);
        } else if (AbstractC6768g6.m12650j()) {
            c6830n5 = new C6885t6(context);
        } else if (AbstractC6768g6.m12651k()) {
            c6830n5 = new C6913w7(context);
        } else if (AbstractC6768g6.m12641a()) {
            c6830n5 = new C6870s0(context);
        } else if (AbstractC6768g6.m12649i() || AbstractC6768g6.m12648h()) {
            c6830n5 = new C6822m6(context);
            if (!c6830n5.mo12620a()) {
                c6830n5 = new C6804k6(context);
            }
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0);
                c6830n5 = new C6907w1(context);
            } catch (Exception unused) {
                if (AbstractC6768g6.m12640a("ro.odm.manufacturer", "").equalsIgnoreCase("PRIZE")) {
                    c6830n5 = new C6916x1(context);
                } else {
                    c6830n5 = !TextUtils.isEmpty(AbstractC6768g6.m12640a("ro.build.freeme.label", "")) ? new C6837o3(context) : null;
                }
            }
        }
        f11362a = c6830n5;
        if (c6830n5 != null && c6830n5.mo12620a()) {
            f11362a.getClass();
            return f11362a;
        }
        InterfaceC6919x4 c6920x5 = new C6920x5(context);
        if (!c6920x5.mo12620a()) {
            c6920x5 = new C6927y3(context);
            if (!c6920x5.mo12620a()) {
                c6920x5 = new C6765g3();
            }
        }
        f11362a = c6920x5;
        return c6920x5;
    }
}
