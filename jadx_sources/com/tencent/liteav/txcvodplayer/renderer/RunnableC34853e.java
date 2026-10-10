package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.e */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34853e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74086a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76461a(C34852d c34852d) {
        return new RunnableC34853e(c34852d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76449b(this.f74086a);
    }

    private RunnableC34853e(C34852d c34852d) {
        this.f74086a = c34852d;
    }
}
