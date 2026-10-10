package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.j */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35749j implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77210a;

    /* JADX INFO: renamed from: b */
    private final long f77211b;

    /* JADX INFO: renamed from: c */
    private final long f77212c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79243a(TXVideoEditer tXVideoEditer, long j11, long j12) {
        return new RunnableC35749j(tXVideoEditer, j11, j12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMStartTime$13(this.f77210a, this.f77211b, this.f77212c);
    }

    private RunnableC35749j(TXVideoEditer tXVideoEditer, long j11, long j12) {
        this.f77210a = tXVideoEditer;
        this.f77211b = j11;
        this.f77212c = j12;
    }
}
