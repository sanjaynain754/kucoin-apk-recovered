package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dy */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35629dy implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77001a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79125a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35629dy(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77001a.loadNextAudioFrameInternal(5L);
    }

    private RunnableC35629dy(UGCMediaListSource uGCMediaListSource) {
        this.f77001a = uGCMediaListSource;
    }
}
