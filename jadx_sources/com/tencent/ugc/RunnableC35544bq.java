package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35544bq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76847a;

    /* JADX INFO: renamed from: b */
    private final int f76848b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79043a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35544bq(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76847a.handleProcessComplete(this.f76848b);
    }

    private RunnableC35544bq(TXVideoEditer tXVideoEditer, int i11) {
        this.f76847a = tXVideoEditer;
        this.f76848b = i11;
    }
}
