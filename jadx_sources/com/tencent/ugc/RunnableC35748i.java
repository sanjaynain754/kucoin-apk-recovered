package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.i */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35748i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77208a;

    /* JADX INFO: renamed from: b */
    private final long f77209b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79242a(TXVideoEditer tXVideoEditer, long j11) {
        return new RunnableC35748i(tXVideoEditer, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMAtVideoTime$12(this.f77208a, this.f77209b);
    }

    private RunnableC35748i(TXVideoEditer tXVideoEditer, long j11) {
        this.f77208a = tXVideoEditer;
        this.f77209b = j11;
    }
}
