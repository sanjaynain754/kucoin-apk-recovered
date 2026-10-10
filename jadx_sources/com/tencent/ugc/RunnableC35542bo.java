package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bo */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35542bo implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76842a;

    /* JADX INFO: renamed from: b */
    private final int f76843b;

    /* JADX INFO: renamed from: c */
    private final TXVideoEditer.TXVideoPreviewListener f76844c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79041a(TXVideoEditer tXVideoEditer, int i11, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        return new RunnableC35542bo(tXVideoEditer, i11, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$notifyPreviewProgress$66(this.f76842a, this.f76843b, this.f76844c);
    }

    private RunnableC35542bo(TXVideoEditer tXVideoEditer, int i11, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f76842a = tXVideoEditer;
        this.f76843b = i11;
        this.f76844c = tXVideoPreviewListener;
    }
}
