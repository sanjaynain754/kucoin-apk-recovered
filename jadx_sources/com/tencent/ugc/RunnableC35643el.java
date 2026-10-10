package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.el */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35643el implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77024a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79139a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35643el(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77024a.loadNextVideoFrameInternal(5L);
    }

    private RunnableC35643el(UGCMediaListSource uGCMediaListSource) {
        this.f77024a = uGCMediaListSource;
    }
}
