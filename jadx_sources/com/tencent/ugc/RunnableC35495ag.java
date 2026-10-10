package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ag */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35495ag implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76746a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditConstants.TXThumbnail f76747b;

    /* JADX INFO: renamed from: a */
    public static Runnable m78996a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
        return new RunnableC35495ag(tXVideoEditer, tXThumbnail);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setThumbnail$34(this.f76746a, this.f76747b);
    }

    private RunnableC35495ag(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
        this.f76746a = tXVideoEditer;
        this.f76747b = tXThumbnail;
    }
}
