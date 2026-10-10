package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bk */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35538bk implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f76832a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79037a(UGCVideoProcessor uGCVideoProcessor) {
        return new RunnableC35538bk(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76832a.refreshOneFrame();
    }

    private RunnableC35538bk(UGCVideoProcessor uGCVideoProcessor) {
        this.f76832a = uGCVideoProcessor;
    }
}
