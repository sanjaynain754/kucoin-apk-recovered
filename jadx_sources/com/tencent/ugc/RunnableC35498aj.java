package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.aj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35498aj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.TXVideoProcessListener f76751a;

    /* JADX INFO: renamed from: a */
    public static Runnable m78999a(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        return new RunnableC35498aj(tXVideoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$processVideoInternal$36(this.f76751a);
    }

    private RunnableC35498aj(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        this.f76751a = tXVideoProcessListener;
    }
}
