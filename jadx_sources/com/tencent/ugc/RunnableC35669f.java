package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35669f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77064a;

    /* JADX INFO: renamed from: b */
    private final int f77065b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79163a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35669f(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setPictureTransition$9(this.f77064a, this.f77065b);
    }

    private RunnableC35669f(TXVideoEditer tXVideoEditer, int i11) {
        this.f77064a = tXVideoEditer;
        this.f77065b = i11;
    }
}
