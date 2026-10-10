package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.i */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34928i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34925f f74511a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76619a(C34925f c34925f) {
        return new RunnableC34928i(c34925f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34925f.m76610b(this.f74511a);
    }

    private RunnableC34928i(C34925f c34925f) {
        this.f74511a = c34925f;
    }
}
