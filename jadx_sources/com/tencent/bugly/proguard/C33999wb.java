package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.wb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33999wb implements InterfaceC33771l8 {
    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: b */
    public AbstractC34022xe mo73136b(String str) {
        return null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: a */
    public C33694hf mo73135a(String str) {
        if ("java_memory_ceiling_hprof".equals(str)) {
            return new C33939tb();
        }
        if ("big_bitmap".equals(str)) {
            C33694hf c33694hf = new C33694hf("big_bitmap", false, 100, 0.0f);
            c33694hf.f70127l = 150;
            return c33694hf;
        }
        if ("activity_leak".equals(str)) {
            return new C33607dc();
        }
        if ("fd_leak".equals(str)) {
            return new C33790m6();
        }
        if ("native_memory".equals(str)) {
            return new C34000wc();
        }
        if ("asan".equals(str)) {
            return new C33763l0();
        }
        return null;
    }
}
