package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ap */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35504ap implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76765a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditConstants.TXPreviewParam f76766b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79005a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        return new RunnableC35504ap(tXVideoEditer, tXPreviewParam);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$initWithPreview$43(this.f76765a, this.f76766b);
    }

    private RunnableC35504ap(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        this.f76765a = tXVideoEditer;
        this.f76766b = tXPreviewParam;
    }
}
