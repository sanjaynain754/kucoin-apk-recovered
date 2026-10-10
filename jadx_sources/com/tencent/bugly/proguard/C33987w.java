package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33987w extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: q */
    public String f72388q;

    /* JADX INFO: renamed from: r */
    public String f72389r;

    /* JADX INFO: renamed from: s */
    public String f72390s;

    /* JADX INFO: renamed from: t */
    public String f72391t;

    /* JADX INFO: renamed from: u */
    public String f72392u;

    public C33987w() {
        this.f72388q = "";
        this.f72389r = "";
        this.f72390s = "";
        this.f72391t = "";
        this.f72392u = "";
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73957a(this.f72388q, 0);
        String str = this.f72389r;
        if (str != null) {
            c33773la.m73957a(str, 1);
        }
        String str2 = this.f72390s;
        if (str2 != null) {
            c33773la.m73957a(str2, 2);
        }
        String str3 = this.f72391t;
        if (str3 != null) {
            c33773la.m73957a(str3, 3);
        }
        String str4 = this.f72392u;
        if (str4 != null) {
            c33773la.m73957a(str4, 4);
        }
    }

    public C33987w(String str, String str2, String str3, String str4, String str5) {
        this.f72388q = str;
        this.f72389r = str2;
        this.f72390s = str3;
        this.f72391t = str4;
        this.f72392u = str5;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f72388q = c33752ka.m73781b(0, true);
        this.f72389r = c33752ka.m73781b(1, false);
        this.f72390s = c33752ka.m73781b(2, false);
        this.f72391t = c33752ka.m73781b(3, false);
        this.f72392u = c33752ka.m73781b(4, false);
    }
}
