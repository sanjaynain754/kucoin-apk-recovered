package gi0;

import android.app.Application;
import android.content.Context;
import fi0.C37505e;
import fi0.C37506f;
import fi0.InterfaceC37504d;

/* JADX INFO: renamed from: gi0.l */
/* JADX INFO: compiled from: OAIDFactory.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C37961l {

    /* JADX INFO: renamed from: a */
    public static InterfaceC37504d f85381a;

    /* JADX INFO: renamed from: a */
    public static InterfaceC37504d m85801a(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        InterfaceC37504d interfaceC37504d = f85381a;
        if (interfaceC37504d != null) {
            return interfaceC37504d;
        }
        InterfaceC37504d interfaceC37504dM85802b = m85802b(context);
        f85381a = interfaceC37504dM85802b;
        if (interfaceC37504dM85802b == null || !interfaceC37504dM85802b.mo84451a()) {
            InterfaceC37504d interfaceC37504dM85803c = m85803c(context);
            f85381a = interfaceC37504dM85803c;
            return interfaceC37504dM85803c;
        }
        C37505e.m84453a("Manufacturer interface has been found: " + f85381a.getClass().getName());
        return f85381a;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC37504d m85803c(Context context) {
        C37959j c37959j = new C37959j(context);
        if (c37959j.mo84451a()) {
            C37505e.m84453a("Mobile Security Alliance has been found: " + C37959j.class.getName());
            return c37959j;
        }
        C37955f c37955f = new C37955f(context);
        if (c37955f.mo84451a()) {
            C37505e.m84453a("Google Play Service has been found: " + C37955f.class.getName());
            return c37955f;
        }
        C37953d c37953d = new C37953d();
        C37505e.m84453a("OAID/AAID was not supported: " + C37953d.class.getName());
        return c37953d;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC37504d m85802b(Context context) {
        if (!C37506f.m84461h() && !C37506f.m84464k()) {
            if (C37506f.m84462i()) {
                return new C37958i(context);
            }
            if (C37506f.m84465l()) {
                return new C37960k(context);
            }
            if (!C37506f.m84470q() && !C37506f.m84463j() && !C37506f.m84455b()) {
                if (C37506f.m84468o()) {
                    return new C37964o(context);
                }
                if (C37506f.m84469p()) {
                    return new C37965p(context);
                }
                if (C37506f.m84454a()) {
                    return new C37950a(context);
                }
                if (!C37506f.m84460g() && !C37506f.m84458e()) {
                    if (!C37506f.m84467n() && !C37506f.m84466m()) {
                        if (C37506f.m84456c(context)) {
                            return new C37951b(context);
                        }
                        if (C37506f.m84457d()) {
                            return new C37952c(context);
                        }
                        if (C37506f.m84459f()) {
                            return new C37954e(context);
                        }
                        return null;
                    }
                    return new C37963n(context);
                }
                return new C37956g(context);
            }
            return new C37966q(context);
        }
        return new C37957h(context);
    }
}
