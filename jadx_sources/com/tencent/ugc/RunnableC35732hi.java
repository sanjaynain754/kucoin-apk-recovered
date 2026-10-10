package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hi */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35732hi implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77170a;

    /* JADX INFO: renamed from: b */
    private final int f77171b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79226a(UGCVideoProcessor uGCVideoProcessor, int i11) {
        return new RunnableC35732hi(uGCVideoProcessor, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77170a.mFrameRateFilter = new UGCFrameRateFilter(this.f77171b);
    }

    private RunnableC35732hi(UGCVideoProcessor uGCVideoProcessor, int i11) {
        this.f77170a = uGCVideoProcessor;
        this.f77171b = i11;
    }
}
