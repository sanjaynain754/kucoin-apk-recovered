package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.h */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35723h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77150a;

    /* JADX INFO: renamed from: b */
    private final boolean f77151b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79217a(TXVideoEditer tXVideoEditer, boolean z11) {
        return new RunnableC35723h(tXVideoEditer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMLoop$11(this.f77150a, this.f77151b);
    }

    private RunnableC35723h(TXVideoEditer tXVideoEditer, boolean z11) {
        this.f77150a = tXVideoEditer;
        this.f77151b = z11;
    }
}
