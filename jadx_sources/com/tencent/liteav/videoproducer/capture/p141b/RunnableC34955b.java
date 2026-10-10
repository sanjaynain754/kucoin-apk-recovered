package com.tencent.liteav.videoproducer.capture.p141b;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34955b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34954a f74679a;

    /* JADX INFO: renamed from: b */
    private final int f74680b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76732a(C34954a c34954a, int i11) {
        return new RunnableC34955b(c34954a, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34954a.m76693a(this.f74679a, this.f74680b);
    }

    private RunnableC34955b(C34954a c34954a, int i11) {
        this.f74679a = c34954a;
        this.f74680b = i11;
    }
}
