package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35716gt implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77136a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79210a(UGCVideoProcessor uGCVideoProcessor) {
        return new RunnableC35716gt(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77136a.onCompleteBroadcast();
    }

    private RunnableC35716gt(UGCVideoProcessor uGCVideoProcessor) {
        this.f77136a = uGCVideoProcessor;
    }
}
