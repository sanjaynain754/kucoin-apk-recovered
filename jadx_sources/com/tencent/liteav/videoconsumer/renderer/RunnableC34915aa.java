package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.aa */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34915aa implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74471a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76592a(C34940u c34940u) {
        return new RunnableC34915aa(c34940u);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76644a(this.f74471a);
    }

    private RunnableC34915aa(C34940u c34940u) {
        this.f74471a = c34940u;
    }
}
