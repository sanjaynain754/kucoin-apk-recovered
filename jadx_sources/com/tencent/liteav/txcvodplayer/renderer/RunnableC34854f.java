package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.f */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34854f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74087a;

    /* JADX INFO: renamed from: b */
    private final boolean f74088b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76462a(C34852d c34852d, boolean z11) {
        return new RunnableC34854f(c34852d, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76448a(this.f74087a, this.f74088b);
    }

    private RunnableC34854f(C34852d c34852d, boolean z11) {
        this.f74087a = c34852d;
        this.f74088b = z11;
    }
}
