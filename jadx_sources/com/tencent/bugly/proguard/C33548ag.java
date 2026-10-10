package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ag */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33548ag extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: q */
    public String f68870q;

    /* JADX INFO: renamed from: r */
    public String f68871r;

    public C33548ag() {
        this.f68870q = "";
        this.f68871r = "";
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73957a(this.f68870q, 0);
        c33773la.m73957a(this.f68871r, 1);
    }

    public C33548ag(String str, String str2) {
        this.f68870q = str;
        this.f68871r = str2;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f68870q = c33752ka.m73781b(0, true);
        this.f68871r = c33752ka.m73781b(1, true);
    }
}
