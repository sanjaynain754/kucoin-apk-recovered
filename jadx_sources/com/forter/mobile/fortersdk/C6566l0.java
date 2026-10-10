package com.forter.mobile.fortersdk;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6566l0 {

    /* JADX INFO: renamed from: c */
    public static final C6566l0 f10992c = new C6566l0();

    /* JADX INFO: renamed from: b */
    public boolean f10994b = false;

    /* JADX INFO: renamed from: a */
    public long f10993a = -1;

    /* JADX INFO: renamed from: b */
    public final synchronized void m12420b(boolean z11) {
        this.f10994b = z11;
        this.f10993a = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m12421c() {
        return !m12423e();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m12422d() {
        return C6520c.m12182b().m12193l(false) && C6520c.m12182b().m12197p().m98873J() && !m12423e();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m12423e() {
        return this.f10994b || this.f10993a + 10000 >= System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C6566l0 m12419a() {
        return f10992c;
    }
}
