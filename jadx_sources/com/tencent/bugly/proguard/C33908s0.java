package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.s0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33908s0 extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: t */
    public static byte[] f71779t;

    /* JADX INFO: renamed from: q */
    public byte f71780q;

    /* JADX INFO: renamed from: r */
    public String f71781r;

    /* JADX INFO: renamed from: s */
    public byte[] f71782s;

    public C33908s0() {
        this.f71780q = (byte) 0;
        this.f71781r = "";
        this.f71782s = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73942a(this.f71780q, 0);
        c33773la.m73957a(this.f71781r, 1);
        byte[] bArr = this.f71782s;
        if (bArr != null) {
            c33773la.m73962a(bArr, 2);
        }
    }

    public C33908s0(byte b11, String str, byte[] bArr) {
        this.f71780q = b11;
        this.f71781r = str;
        this.f71782s = bArr;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f71780q = c33752ka.m73750a(this.f71780q, 0, true);
        this.f71781r = c33752ka.m73781b(1, true);
        if (f71779t == null) {
            f71779t = new byte[]{0};
        }
        this.f71782s = c33752ka.m73770a(f71779t, 2, false);
    }
}
