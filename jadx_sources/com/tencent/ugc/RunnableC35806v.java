package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.v */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35806v implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77339a;

    /* JADX INFO: renamed from: b */
    private final boolean f77340b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79293a(TXVideoEditer tXVideoEditer, boolean z11) {
        return new RunnableC35806v(tXVideoEditer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setReverse$24(this.f77339a, this.f77340b);
    }

    private RunnableC35806v(TXVideoEditer tXVideoEditer, boolean z11) {
        this.f77339a = tXVideoEditer;
        this.f77340b = z11;
    }
}
