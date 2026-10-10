package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ak */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35499ak implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76752a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoCustomProcessListener f76753b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79000a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        return new RunnableC35499ak(tXVideoEditer, tXVideoCustomProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setCustomVideoProcessListener$2(this.f76752a, this.f76753b);
    }

    private RunnableC35499ak(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        this.f76752a = tXVideoEditer;
        this.f76753b = tXVideoCustomProcessListener;
    }
}
