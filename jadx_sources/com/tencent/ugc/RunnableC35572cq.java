package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35572cq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76913a;

    /* JADX INFO: renamed from: b */
    private final TXVideoJoiner.SplitScreenParam f76914b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79068a(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.SplitScreenParam splitScreenParam) {
        return new RunnableC35572cq(tXVideoJoiner, splitScreenParam);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$setSplitScreenList$11(this.f76913a, this.f76914b);
    }

    private RunnableC35572cq(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.SplitScreenParam splitScreenParam) {
        this.f76913a = tXVideoJoiner;
        this.f76914b = splitScreenParam;
    }
}
