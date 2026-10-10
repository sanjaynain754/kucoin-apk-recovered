package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bd */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35519bd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76792a;

    /* JADX INFO: renamed from: b */
    private final boolean f76793b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79020a(TXVideoEditer tXVideoEditer, boolean z11) {
        return new RunnableC35519bd(tXVideoEditer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setIsSplitScreen$56(this.f76792a, this.f76793b);
    }

    private RunnableC35519bd(TXVideoEditer tXVideoEditer, boolean z11) {
        this.f76792a = tXVideoEditer;
        this.f76793b = z11;
    }
}
