package com.datavisorobfus;

import android.content.Context;

/* JADX INFO: renamed from: com.datavisorobfus.k0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5427k0 {

    /* JADX INFO: renamed from: a */
    private static InterfaceC5406c0 f7306a;

    /* JADX INFO: renamed from: b */
    private static InterfaceC5406c0 f7307b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC5406c0 m7190a(Context context) {
        InterfaceC5406c0 interfaceC5406c0 = f7306a;
        if (interfaceC5406c0 != null) {
            return interfaceC5406c0;
        }
        InterfaceC5406c0 interfaceC5406c0M7193d = m7193d(context);
        f7306a = interfaceC5406c0M7193d;
        return interfaceC5406c0M7193d;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5406c0 m7191b(Context context) {
        InterfaceC5406c0 interfaceC5406c0 = f7307b;
        if (interfaceC5406c0 != null) {
            return interfaceC5406c0;
        }
        InterfaceC5406c0 interfaceC5406c0M7192c = m7192c(context);
        f7307b = interfaceC5406c0M7192c;
        return interfaceC5406c0M7192c;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC5406c0 m7192c(Context context) {
        try {
            C5450w c5450w = new C5450w(context);
            return c5450w.mo7111a() ? c5450w : new C5438q();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return new C5438q();
        }
    }

    /* JADX INFO: renamed from: d */
    private static InterfaceC5406c0 m7193d(Context context) {
        InterfaceC5406c0 c5433n0;
        try {
            if (!C5429l0.m7215j() && !C5429l0.m7216k()) {
                if (!C5429l0.m7209d() && !C5429l0.m7208c()) {
                    if (C5429l0.m7217l()) {
                        c5433n0 = new C5449v0(context);
                    } else if (C5429l0.m7218m()) {
                        c5433n0 = new C5401a1(context);
                    } else if (!C5429l0.m7219n() && !C5429l0.m7212g() && !C5429l0.m7207b()) {
                        if (C5429l0.m7211f()) {
                            c5433n0 = new C5418g0(context);
                        } else if (C5429l0.m7214i()) {
                            c5433n0 = new C5425j0(context);
                        } else if (!C5429l0.m7210e() && !C5429l0.m7213h()) {
                            if (C5429l0.m7206a()) {
                                c5433n0 = new C5402b(context);
                            } else {
                                c5433n0 = null;
                            }
                        } else {
                            c5433n0 = new C5409d0(context);
                        }
                    } else {
                        c5433n0 = new C5404b1(context);
                    }
                } else {
                    c5433n0 = new C5456z(context);
                }
            } else {
                c5433n0 = new C5433n0(context);
            }
            if (c5433n0 != null && c5433n0.mo7111a()) {
                return c5433n0;
            }
            return new C5438q();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return new C5438q();
        }
    }
}
