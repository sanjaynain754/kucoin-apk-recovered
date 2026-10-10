package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.k */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35750k implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77213a;

    /* JADX INFO: renamed from: b */
    private final float f77214b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79244a(TXVideoEditer tXVideoEditer, float f11) {
        return new RunnableC35750k(tXVideoEditer, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMVolume$14(this.f77213a, this.f77214b);
    }

    private RunnableC35750k(TXVideoEditer tXVideoEditer, float f11) {
        this.f77213a = tXVideoEditer;
        this.f77214b = f11;
    }
}
