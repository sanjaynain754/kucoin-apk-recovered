package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ei */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35640ei implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77021a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79136a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35640ei(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77021a.loadNextAudioFrameInternal(5L);
    }

    private RunnableC35640ei(UGCMediaListSource uGCMediaListSource) {
        this.f77021a = uGCMediaListSource;
    }
}
