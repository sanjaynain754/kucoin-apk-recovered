package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ej */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35641ej implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77022a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79137a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35641ej(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77022a.loadNextAudioFrameInternal(5L);
    }

    private RunnableC35641ej(UGCMediaListSource uGCMediaListSource) {
        this.f77022a = uGCMediaListSource;
    }
}
