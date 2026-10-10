package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ad */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35492ad implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76732a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoProcessListener f76733b;

    /* JADX INFO: renamed from: a */
    public static Runnable m78993a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        return new RunnableC35492ad(tXVideoEditer, tXVideoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoProcessListener$31(this.f76732a, this.f76733b);
    }

    private RunnableC35492ad(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        this.f76732a = tXVideoEditer;
        this.f76733b = tXVideoProcessListener;
    }
}
