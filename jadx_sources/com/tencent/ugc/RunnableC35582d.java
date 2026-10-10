package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35582d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76930a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79078a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35582d(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76930a.onPlayComplete();
    }

    private RunnableC35582d(TXVideoEditer tXVideoEditer) {
        this.f76930a = tXVideoEditer;
    }
}
