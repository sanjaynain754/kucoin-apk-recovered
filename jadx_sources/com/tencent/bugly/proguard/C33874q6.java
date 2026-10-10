package com.tencent.bugly.proguard;

import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33874q6 extends AbstractC34028y0<Map<Integer, C33933t5>> {
    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public String mo72308a() {
        return "other";
    }

    @Override // com.tencent.bugly.proguard.AbstractC34028y0
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, Integer> mo72309a(Map<Integer, C33933t5> map) {
        C33933t5 c33933t5 = map.get(10);
        if (c33933t5 != null) {
            return c33933t5.m75039b();
        }
        return null;
    }
}
