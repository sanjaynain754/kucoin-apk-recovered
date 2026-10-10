package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.e */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34924e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34921b f74494a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76603a(C34921b c34921b) {
        return new RunnableC34924e(c34921b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34921b.m76598a(this.f74494a);
    }

    private RunnableC34924e(C34921b c34921b) {
        this.f74494a = c34921b;
    }
}
