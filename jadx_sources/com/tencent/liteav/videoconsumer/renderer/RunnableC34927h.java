package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.h */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34927h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34925f f74510a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76618a(C34925f c34925f) {
        return new RunnableC34927h(c34925f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34925f.m76611c(this.f74510a);
    }

    private RunnableC34927h(C34925f c34925f) {
        this.f74510a = c34925f;
    }
}
