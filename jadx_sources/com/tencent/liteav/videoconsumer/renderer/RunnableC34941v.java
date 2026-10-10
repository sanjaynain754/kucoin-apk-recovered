package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.v */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34941v implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74578a;

    /* JADX INFO: renamed from: b */
    private final AbstractC34939t f74579b = null;

    /* JADX INFO: renamed from: a */
    public static Runnable m76664a(C34940u c34940u) {
        return new RunnableC34941v(c34940u);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76650a(this.f74578a, this.f74579b);
    }

    private RunnableC34941v(C34940u c34940u) {
        this.f74578a = c34940u;
    }
}
