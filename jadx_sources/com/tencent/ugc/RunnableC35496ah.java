package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ah */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35496ah implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76748a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXThumbnailListener f76749b;

    /* JADX INFO: renamed from: a */
    public static Runnable m78997a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new RunnableC35496ah(tXVideoEditer, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setThumbnailListener$35(this.f76748a, this.f76749b);
    }

    private RunnableC35496ah(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f76748a = tXVideoEditer;
        this.f76749b = tXThumbnailListener;
    }
}
