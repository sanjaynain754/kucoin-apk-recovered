package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33661g3 implements InterfaceC33771l8 {
    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: a */
    public C33694hf mo73135a(String str) {
        if ("http".equals(str)) {
            return new C33582c8(str);
        }
        return null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: b */
    public AbstractC34022xe mo73136b(String str) {
        if ("crash".equals(str)) {
            return new C33640f3();
        }
        if (C34052z4.f72600l.equals(str)) {
            return new C34052z4();
        }
        if ("application_exit".equals(str)) {
            return new C33726j5();
        }
        if (C33911s3.f71802h.equals(str)) {
            return new C33911s3();
        }
        if (C33600d5.f69503h.equals(str)) {
            return new C33600d5();
        }
        if (C34065zh.f72635i.equals(str)) {
            return new C34065zh();
        }
        if (C33757kf.f70663i.equals(str)) {
            return new C33757kf();
        }
        return null;
    }
}
