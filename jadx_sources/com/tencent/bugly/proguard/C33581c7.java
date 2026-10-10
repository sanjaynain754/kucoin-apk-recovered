package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33581c7 extends AbstractC33776ld {

    /* JADX INFO: renamed from: c */
    public float f69393c;

    /* JADX INFO: renamed from: a */
    public void m72653a(float f11) {
        this.f69393c = f11;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33776ld
    /* JADX INFO: renamed from: e */
    public Number mo72654e() {
        return Float.valueOf(this.f69393c);
    }

    /* JADX INFO: renamed from: i */
    public float m72655i() {
        return this.f69393c;
    }

    public C33581c7(float f11, int i11) {
        super(i11);
        this.f69393c = f11;
    }
}
