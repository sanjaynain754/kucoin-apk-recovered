package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ac */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35491ac implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76731a;

    /* JADX INFO: renamed from: a */
    public static Runnable m78992a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35491ac(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$deleteAllEffect$30(this.f76731a);
    }

    private RunnableC35491ac(TXVideoEditer tXVideoEditer) {
        this.f76731a = tXVideoEditer;
    }
}
