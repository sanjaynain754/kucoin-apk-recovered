package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ar */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35506ar implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76770a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79007a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35506ar(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$pausePlay$45(this.f76770a);
    }

    private RunnableC35506ar(TXVideoEditer tXVideoEditer) {
        this.f76770a = tXVideoEditer;
    }
}
