package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.oa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33836oa implements InterfaceC33771l8 {
    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: b */
    public AbstractC34022xe mo73136b(String str) {
        return null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: a */
    public C33694hf mo73135a(String str) {
        if ("looper_stack".equals(str)) {
            return new C33753kb();
        }
        if ("work_thread_lag".equals(str)) {
            return new C33926si();
        }
        return null;
    }
}
