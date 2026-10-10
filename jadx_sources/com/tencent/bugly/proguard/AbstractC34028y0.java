package com.tencent.bugly.proguard;

import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34028y0<T> implements InterfaceC33976v8 {

    /* JADX INFO: renamed from: a */
    public static final String f72536a = "RMonitor_FdLeak_BaseFdAnalyzer";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public C33727j6 mo75291a(C33706i6 c33706i6) {
        if (!m75470b(c33706i6)) {
            return null;
        }
        C33727j6 c33727j6 = new C33727j6(mo72308a());
        c33727j6.f70345c = C33853p6.m74505a(mo72309a(c33706i6.m73345d()));
        return c33727j6;
    }

    /* JADX INFO: renamed from: a */
    public abstract Map<String, Integer> mo72309a(T t11);

    /* JADX INFO: renamed from: b */
    public static boolean m75470b(C33706i6 c33706i6) {
        if (c33706i6 != null && c33706i6.m74914c() && c33706i6.m73345d() != null) {
            return true;
        }
        C33648fb.m73044c(f72536a, "analyze failed due to invalid dump data");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m75471a(Map<String, Integer> map, String str) {
        Integer num = map.get(str);
        if (num == null) {
            num = 0;
            map.put(str, num);
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
    }
}
