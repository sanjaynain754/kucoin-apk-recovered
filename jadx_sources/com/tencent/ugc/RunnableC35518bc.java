package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bc */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35518bc implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76791a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79019a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35518bc(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$cancel$55(this.f76791a);
    }

    private RunnableC35518bc(TXVideoEditer tXVideoEditer) {
        this.f76791a = tXVideoEditer;
    }
}
