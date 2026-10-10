package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.aw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35511aw implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76776a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoGenerateListener f76777b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79012a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        return new RunnableC35511aw(tXVideoEditer, tXVideoGenerateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoGenerateListener$49(this.f76776a, this.f76777b);
    }

    private RunnableC35511aw(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        this.f76776a = tXVideoEditer;
        this.f76777b = tXVideoGenerateListener;
    }
}
