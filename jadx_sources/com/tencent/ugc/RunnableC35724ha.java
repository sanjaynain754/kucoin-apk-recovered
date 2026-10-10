package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ha */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35724ha implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77152a;

    /* JADX INFO: renamed from: b */
    private final float f77153b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79218a(UGCVideoProcessor uGCVideoProcessor, float f11) {
        return new RunnableC35724ha(uGCVideoProcessor, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77152a.mVideoProcessManager.setSpecialRatio(this.f77153b);
    }

    private RunnableC35724ha(UGCVideoProcessor uGCVideoProcessor, float f11) {
        this.f77152a = uGCVideoProcessor;
        this.f77153b = f11;
    }
}
