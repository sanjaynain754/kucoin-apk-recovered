package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.au */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35509au implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76773a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79010a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35509au(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$previewAtTime$48(this.f76773a);
    }

    private RunnableC35509au(TXVideoEditer tXVideoEditer) {
        this.f76773a = tXVideoEditer;
    }
}
