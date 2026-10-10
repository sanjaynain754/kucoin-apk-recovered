package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33892r4 extends AbstractC33776ld {

    /* JADX INFO: renamed from: c */
    public double f71608c;

    /* JADX INFO: renamed from: a */
    public void m74795a(double d11) {
        this.f71608c = d11;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33776ld
    /* JADX INFO: renamed from: e */
    public Number mo72654e() {
        return Double.valueOf(this.f71608c);
    }

    /* JADX INFO: renamed from: i */
    public double m74796i() {
        return this.f71608c;
    }

    public C33892r4(double d11, int i11) {
        super(i11);
        this.f71608c = d11;
    }
}
