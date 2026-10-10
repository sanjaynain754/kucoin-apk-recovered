package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34923d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34921b f74493a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76602a(C34921b c34921b) {
        return new RunnableC34923d(c34921b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34921b.m76600b(this.f74493a);
    }

    private RunnableC34923d(C34921b c34921b) {
        this.f74493a = c34921b;
    }
}
