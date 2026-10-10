package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.w */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34942w implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74580a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76665a(C34940u c34940u) {
        return new RunnableC34942w(c34940u);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76658c(this.f74580a);
    }

    private RunnableC34942w(C34940u c34940u) {
        this.f74580a = c34940u;
    }
}
