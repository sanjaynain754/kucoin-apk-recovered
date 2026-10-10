package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.at */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35508at implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76772a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79009a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35508at(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$stopPlay$47(this.f76772a);
    }

    private RunnableC35508at(TXVideoEditer tXVideoEditer) {
        this.f76772a = tXVideoEditer;
    }
}
