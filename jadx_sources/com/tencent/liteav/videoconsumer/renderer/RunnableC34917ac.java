package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.ac */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34917ac implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74478a;

    /* JADX INFO: renamed from: b */
    private final boolean f74479b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76594a(C34940u c34940u, boolean z11) {
        return new RunnableC34917ac(c34940u, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76652a(this.f74478a, this.f74479b);
    }

    private RunnableC34917ac(C34940u c34940u, boolean z11) {
        this.f74478a = c34940u;
        this.f74479b = z11;
    }
}
