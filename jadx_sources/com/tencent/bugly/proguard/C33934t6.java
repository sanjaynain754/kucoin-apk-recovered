package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33934t6 extends AbstractC34028y0<Map<Integer, C33933t5>> {
    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public String mo72308a() {
        return "socket";
    }

    @Override // com.tencent.bugly.proguard.AbstractC34028y0
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, Integer> mo72309a(Map<Integer, C33933t5> map) {
        C33933t5 c33933t5 = map.get(1);
        if (c33933t5 == null) {
            return null;
        }
        Map<String, Integer> mapM75039b = c33933t5.m75039b();
        if (mapM75039b.size() <= 0) {
            return null;
        }
        Iterator<Integer> it = mapM75039b.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        HashMap map2 = new HashMap();
        map2.put("socket", Integer.valueOf(iIntValue));
        return map2;
    }
}
