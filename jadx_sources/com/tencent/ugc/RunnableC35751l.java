package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.l */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35751l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77215a;

    /* JADX INFO: renamed from: b */
    private final long f77216b;

    /* JADX INFO: renamed from: c */
    private final long f77217c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79245a(TXVideoEditer tXVideoEditer, long j11, long j12) {
        return new RunnableC35751l(tXVideoEditer, j11, j12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMFadeInOutDuration$15(this.f77215a, this.f77216b, this.f77217c);
    }

    private RunnableC35751l(TXVideoEditer tXVideoEditer, long j11, long j12) {
        this.f77215a = tXVideoEditer;
        this.f77216b = j11;
        this.f77217c = j12;
    }
}
