package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.o */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35754o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77225a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79248a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35754o(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$new$0(this.f77225a);
    }

    private RunnableC35754o(TXVideoEditer tXVideoEditer) {
        this.f77225a = tXVideoEditer;
    }
}
