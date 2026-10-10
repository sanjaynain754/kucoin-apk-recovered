package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bv */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35549bv implements Runnable {

    /* JADX INFO: renamed from: a */
    private final int f76857a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoGenerateListener f76858b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79048a(int i11, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        return new RunnableC35549bv(i11, tXVideoGenerateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$notifyGenerateComplete$72(this.f76857a, this.f76858b);
    }

    private RunnableC35549bv(int i11, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        this.f76857a = i11;
        this.f76858b = tXVideoGenerateListener;
    }
}
