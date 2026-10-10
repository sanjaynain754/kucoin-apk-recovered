package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.uf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33963uf implements InterfaceC33771l8 {
    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: b */
    public AbstractC34022xe mo73136b(String str) {
        return null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: a */
    public C33694hf mo73135a(String str) {
        if ("traffic_detail".equals(str)) {
            return new C33654fh();
        }
        if ("net_quality".equals(str)) {
            return new C33734jd();
        }
        if ("battery_element".equals(str)) {
            return new C33722j1();
        }
        return null;
    }
}
