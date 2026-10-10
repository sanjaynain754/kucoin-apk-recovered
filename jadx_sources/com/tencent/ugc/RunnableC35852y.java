package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.y */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35852y implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77438a;

    /* JADX INFO: renamed from: b */
    private final int f77439b;

    /* JADX INFO: renamed from: c */
    private final long f77440c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79334a(TXVideoEditer tXVideoEditer, int i11, long j11) {
        return new RunnableC35852y(tXVideoEditer, i11, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$startEffect$27(this.f77438a, this.f77439b, this.f77440c);
    }

    private RunnableC35852y(TXVideoEditer tXVideoEditer, int i11, long j11) {
        this.f77438a = tXVideoEditer;
        this.f77439b = i11;
        this.f77440c = j11;
    }
}
