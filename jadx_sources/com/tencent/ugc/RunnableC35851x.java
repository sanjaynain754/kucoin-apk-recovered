package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.x */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35851x implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77437a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79333a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35851x(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$deleteLastTransitionEffect$26(this.f77437a);
    }

    private RunnableC35851x(TXVideoEditer tXVideoEditer) {
        this.f77437a = tXVideoEditer;
    }
}
