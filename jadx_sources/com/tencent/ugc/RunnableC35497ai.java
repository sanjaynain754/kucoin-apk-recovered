package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ai */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35497ai implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76750a;

    /* JADX INFO: renamed from: a */
    public static Runnable m78998a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35497ai(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76750a.processVideoInternal();
    }

    private RunnableC35497ai(TXVideoEditer tXVideoEditer) {
        this.f76750a = tXVideoEditer;
    }
}
