package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hf */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35729hf implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77165a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79223a(UGCVideoProcessor uGCVideoProcessor) {
        return new RunnableC35729hf(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$unInitialize$0(this.f77165a);
    }

    private RunnableC35729hf(UGCVideoProcessor uGCVideoProcessor) {
        this.f77165a = uGCVideoProcessor;
    }
}
