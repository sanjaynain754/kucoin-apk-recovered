package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.s */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35803s implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77333a;

    /* JADX INFO: renamed from: b */
    private final int f77334b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79290a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35803s(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setRenderRotation$21(this.f77333a, this.f77334b);
    }

    private RunnableC35803s(TXVideoEditer tXVideoEditer, int i11) {
        this.f77333a = tXVideoEditer;
        this.f77334b = i11;
    }
}
