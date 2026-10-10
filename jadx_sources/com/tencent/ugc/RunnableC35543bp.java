package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bp */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35543bp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76845a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoPreviewListener f76846b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79042a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        return new RunnableC35543bp(tXVideoEditer, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$notifyPreviewFinished$67(this.f76845a, this.f76846b);
    }

    private RunnableC35543bp(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f76845a = tXVideoEditer;
        this.f76846b = tXVideoPreviewListener;
    }
}
