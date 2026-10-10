package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34053z5 extends AbstractC34028y0<List<C34014x6>> {
    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public String mo72308a() {
        return InterfaceC33953u5.f72225u;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34028y0
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, Integer> mo72309a(List<C34014x6> list) {
        HashMap map = new HashMap();
        for (C34014x6 c34014x6 : list) {
            m75471a(map, String.format("/%s/%s", c34014x6.m75447c(), c34014x6.m75446b()));
        }
        return map;
    }
}
