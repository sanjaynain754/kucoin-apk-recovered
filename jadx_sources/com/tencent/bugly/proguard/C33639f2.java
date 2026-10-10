package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33639f2 extends AbstractC33776ld {

    /* JADX INFO: renamed from: c */
    public byte f69793c;

    /* JADX INFO: renamed from: a */
    public void m72988a(byte b11) {
        this.f69793c = b11;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33776ld
    /* JADX INFO: renamed from: e */
    public Number mo72654e() {
        return Byte.valueOf(this.f69793c);
    }

    /* JADX INFO: renamed from: i */
    public byte m72989i() {
        return this.f69793c;
    }

    public C33639f2(byte b11, int i11) {
        super(i11);
        this.f69793c = b11;
    }
}
