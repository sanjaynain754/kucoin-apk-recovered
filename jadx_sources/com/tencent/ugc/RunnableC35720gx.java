package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gx */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35720gx implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77143a;

    /* JADX INFO: renamed from: b */
    private final int f77144b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79214a(UGCVideoProcessor uGCVideoProcessor, int i11) {
        return new RunnableC35720gx(uGCVideoProcessor, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77143a.mTransitionType = this.f77144b;
    }

    private RunnableC35720gx(UGCVideoProcessor uGCVideoProcessor, int i11) {
        this.f77143a = uGCVideoProcessor;
        this.f77144b = i11;
    }
}
