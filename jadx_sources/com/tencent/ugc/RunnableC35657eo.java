package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.eo */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35657eo implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77045a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79151a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35657eo(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77045a.prePareNextUGCPixelFrameProvider();
    }

    private RunnableC35657eo(UGCMediaListSource uGCMediaListSource) {
        this.f77045a = uGCMediaListSource;
    }
}
