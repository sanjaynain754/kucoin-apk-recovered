package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ax */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35512ax implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76778a;

    /* JADX INFO: renamed from: b */
    private final long f76779b;

    /* JADX INFO: renamed from: c */
    private final long f76780c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79013a(TXVideoEditer tXVideoEditer, long j11, long j12) {
        return new RunnableC35512ax(tXVideoEditer, j11, j12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setCutFromTime$50(this.f76778a, this.f76779b, this.f76780c);
    }

    private RunnableC35512ax(TXVideoEditer tXVideoEditer, long j11, long j12) {
        this.f76778a = tXVideoEditer;
        this.f76779b = j11;
        this.f76780c = j12;
    }
}
