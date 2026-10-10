package ac0;

import java.util.HashMap;
import java.util.Map;
import yb0.C46436e0;

/* JADX INFO: renamed from: ac0.h */
/* JADX INFO: compiled from: SqlErrorInfo.java */
/* JADX INFO: loaded from: classes59.dex */
public class C0238h {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m871a(InterfaceC0235e interfaceC0235e) {
        C46436e0 c46436e0Mo854c = interfaceC0235e.mo854c();
        if (c46436e0Mo854c != null) {
            HashMap map = new HashMap();
            map.put("sql", c46436e0Mo854c.m102434c());
            map.put("arguments", c46436e0Mo854c.m102433b());
            return map;
        }
        return null;
    }
}
