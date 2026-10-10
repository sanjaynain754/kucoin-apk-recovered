package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35534bg implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76824a;

    /* JADX INFO: renamed from: b */
    private final float f76825b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79033a(TXVideoEditer tXVideoEditer, float f11) {
        return new RunnableC35534bg(tXVideoEditer, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSpecialRatio$4(this.f76824a, this.f76825b);
    }

    private RunnableC35534bg(TXVideoEditer tXVideoEditer, float f11) {
        this.f76824a = tXVideoEditer;
        this.f76825b = f11;
    }
}
