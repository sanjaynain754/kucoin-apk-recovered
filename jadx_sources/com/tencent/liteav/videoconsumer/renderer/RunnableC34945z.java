package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.z */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34945z implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74590a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76668a(C34940u c34940u) {
        return new RunnableC34945z(c34940u);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76657b(this.f74590a);
    }

    private RunnableC34945z(C34940u c34940u) {
        this.f74590a = c34940u;
    }
}
