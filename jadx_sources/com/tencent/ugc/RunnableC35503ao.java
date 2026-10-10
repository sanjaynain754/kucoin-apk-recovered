package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ao */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35503ao implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76763a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoPreviewListener f76764b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79004a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        return new RunnableC35503ao(tXVideoEditer, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setTXVideoPreviewListener$41(this.f76763a, this.f76764b);
    }

    private RunnableC35503ao(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f76763a = tXVideoEditer;
        this.f76764b = tXVideoPreviewListener;
    }
}
