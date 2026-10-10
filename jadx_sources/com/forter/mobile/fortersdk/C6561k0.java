package com.forter.mobile.fortersdk;

import java.util.HashMap;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6561k0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, C6507a4> f10988a = new HashMap<>();

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    /* JADX INFO: renamed from: a */
    public static synchronized boolean m12408a(InterfaceC6614u3 interfaceC6614u3) {
        byte b11;
        try {
            if (interfaceC6614u3 == null) {
                return false;
            }
            try {
                String strMo12304b = interfaceC6614u3.mo12304b();
                int iHashCode = strMo12304b.hashCode();
                if (iHashCode != -1460510656) {
                    if (iHashCode == 1968809970 && strMo12304b.equals("app/network2")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                } else if (strMo12304b.equals("app/network")) {
                    b11 = 0;
                } else {
                    b11 = -1;
                }
                if (b11 == 0 || b11 == 1) {
                    strMo12304b = strMo12304b + interfaceC6614u3.mo12303a().optString("currentNetworkType", "");
                }
                HashMap<String, C6507a4> map = f10988a;
                if (!map.containsKey(strMo12304b)) {
                    m12409b(interfaceC6614u3, strMo12304b);
                    interfaceC6614u3.mo12304b();
                    AbstractC6524c3.m12216h();
                    return false;
                }
                C6507a4 c6507a4 = map.get(strMo12304b);
                if (c6507a4 != null && c6507a4.f10802a.longValue() < System.currentTimeMillis()) {
                    m12409b(interfaceC6614u3, strMo12304b);
                    AbstractC6524c3.m12216h();
                    return false;
                }
                if (c6507a4 != null) {
                    String string = interfaceC6614u3.mo12307e().toString();
                    String str = c6507a4.f10803b;
                    if (str != null && str.equals(string)) {
                        AbstractC6524c3.m12216h();
                        return true;
                    }
                }
                m12409b(interfaceC6614u3, strMo12304b);
                AbstractC6524c3.m12216h();
                interfaceC6614u3.mo12307e().toString();
                AbstractC6524c3.m12216h();
                AbstractC6524c3.m12216h();
                return false;
            } catch (Exception unused) {
                AbstractC6524c3.m12215g();
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12409b(InterfaceC6614u3 interfaceC6614u3, String str) {
        C44699a c44699aM12197p = C6520c.m12182b().m12197p();
        if (c44699aM12197p == null) {
            return false;
        }
        f10988a.put(str, new C6507a4(Long.valueOf(System.currentTimeMillis() + ((long) (c44699aM12197p.m98880f() * 1000))), interfaceC6614u3.mo12307e().toString()));
        return true;
    }
}
