package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33622e6 {

    /* JADX INFO: renamed from: a */
    public static final String f69696a = "RMonitor_FdLeak_Analyzer";

    /* JADX INFO: renamed from: b */
    public static final Map<Integer, InterfaceC33976v8[]> f69697b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC33956u8[] f69698c;

    /* JADX INFO: renamed from: a */
    public static InterfaceC33976v8[] m72927a(int i11) {
        return f69697b.get(Integer.valueOf(i11));
    }

    static {
        HashMap map = new HashMap();
        f69697b = map;
        map.put(1, new InterfaceC33976v8[]{new C33873q5(), new C33874q6(), new C33994w6(), new C33538a6(), new C33893r5(), new C34013x5(), new C34033y5(), new C33934t6(), new C33894r6()});
        map.put(2, new InterfaceC33976v8[]{new C34053z5()});
        f69698c = new InterfaceC33956u8[]{new C33993w5(), new C34054z6(), new C33954u6()};
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC33956u8[] m72926a() {
        return f69698c;
    }

    /* JADX INFO: renamed from: a */
    public void m72928a(int i11, int i12, C33706i6 c33706i6, InterfaceC33916s8 interfaceC33916s8) {
        if (interfaceC33916s8 != null) {
            interfaceC33916s8.mo73006b();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c33706i6);
        C33748k6 c33748k6 = new C33748k6(i11, i12);
        c33748k6.f70562r = arrayList;
        if (c33706i6.m74914c()) {
            for (InterfaceC33976v8 interfaceC33976v8 : m72927a(1)) {
                m72929a(interfaceC33976v8, c33748k6, c33706i6);
            }
        }
        C33706i6 c33706i6M73245a = C33685h6.m73245a(2, interfaceC33916s8);
        arrayList.add(c33706i6M73245a);
        if (c33706i6M73245a.m74914c()) {
            for (InterfaceC33976v8 interfaceC33976v9 : m72927a(2)) {
                m72929a(interfaceC33976v9, c33748k6, c33706i6M73245a);
            }
        }
        if (C33664g6.m73156f()) {
            arrayList.add(C33685h6.m73245a(4, interfaceC33916s8));
        }
        if (C33664g6.m73157g()) {
            arrayList.add(C33685h6.m73245a(3, interfaceC33916s8));
        }
        interfaceC33916s8.mo73005a(c33748k6);
    }

    /* JADX INFO: renamed from: a */
    public final void m72929a(InterfaceC33976v8 interfaceC33976v8, C33748k6 c33748k6, C33706i6 c33706i6) {
        c33748k6.m73717a(interfaceC33976v8.mo75291a(c33706i6));
    }
}
