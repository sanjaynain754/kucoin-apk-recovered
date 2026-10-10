package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.an */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35502an implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76762a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79003a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35502an(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$release$40(this.f76762a);
    }

    private RunnableC35502an(TXVideoEditer tXVideoEditer) {
        this.f76762a = tXVideoEditer;
    }
}
