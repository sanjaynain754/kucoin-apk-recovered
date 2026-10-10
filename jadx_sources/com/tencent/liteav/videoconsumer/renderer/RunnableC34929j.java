package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.j */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34929j implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34925f f74512a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76620a(C34925f c34925f) {
        return new RunnableC34929j(c34925f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74512a.m76609b();
    }

    private RunnableC34929j(C34925f c34925f) {
        this.f74512a = c34925f;
    }
}
