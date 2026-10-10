package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33890r2 {

    /* JADX INFO: renamed from: a */
    public final boolean f71601a;

    /* JADX INFO: renamed from: b */
    public final C33910s2 f71602b;

    /* JADX INFO: renamed from: c */
    public final C33930t2 f71603c;

    public C33890r2(C33910s2 c33910s2, C33930t2 c33930t2, boolean z11) {
        this.f71601a = z11;
        C33910s2 c33910s3 = new C33910s2();
        this.f71602b = c33910s3;
        c33910s3.m74907b(c33910s2);
        C33930t2 c33930t3 = new C33930t2();
        this.f71603c = c33930t3;
        c33930t3.m75018a(c33930t2);
    }

    /* JADX INFO: renamed from: a */
    public C33910s2 m74719a() {
        return this.f71602b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m74720a(C33910s2 c33910s2) {
        if (c33910s2 == null) {
            return true;
        }
        return this.f71602b.m74906a(c33910s2);
    }

    /* JADX INFO: renamed from: b */
    public C33930t2 m74721b() {
        return this.f71603c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m74722c() {
        return this.f71601a;
    }

    public C33890r2() {
        this.f71601a = true;
        this.f71602b = new C33910s2();
        this.f71603c = new C33930t2();
    }
}
