package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hc */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35726hc implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77160a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXVideoCustomProcessListener f77161b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79220a(UGCVideoProcessor uGCVideoProcessor, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        return new RunnableC35726hc(uGCVideoProcessor, tXVideoCustomProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77160a.mTXVideoCustomProcessListener = this.f77161b;
    }

    private RunnableC35726hc(UGCVideoProcessor uGCVideoProcessor, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        this.f77160a = uGCVideoProcessor;
        this.f77161b = tXVideoCustomProcessListener;
    }
}
