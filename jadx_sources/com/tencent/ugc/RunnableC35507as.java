package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.as */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35507as implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76771a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79008a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35507as(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$resumePlay$46(this.f76771a);
    }

    private RunnableC35507as(TXVideoEditer tXVideoEditer) {
        this.f76771a = tXVideoEditer;
    }
}
