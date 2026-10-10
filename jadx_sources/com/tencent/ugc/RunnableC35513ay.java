package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ay */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35513ay implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76781a;

    /* JADX INFO: renamed from: b */
    private final int f76782b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79014a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35513ay(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoBitrate$51(this.f76781a, this.f76782b);
    }

    private RunnableC35513ay(TXVideoEditer tXVideoEditer, int i11) {
        this.f76781a = tXVideoEditer;
        this.f76782b = i11;
    }
}
