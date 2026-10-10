package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33669gb extends AbstractC33776ld {

    /* JADX INFO: renamed from: c */
    public long f69967c;

    /* JADX INFO: renamed from: a */
    public void m73173a(long j11) {
        this.f69967c = j11;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33776ld
    /* JADX INFO: renamed from: e */
    public Number mo72654e() {
        return Long.valueOf(this.f69967c);
    }

    /* JADX INFO: renamed from: i */
    public long m73174i() {
        return this.f69967c;
    }

    public C33669gb(long j11, int i11) {
        super(i11);
        this.f69967c = j11;
    }
}
