package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dz */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35630dz implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77002a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79126a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35630dz(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77002a.loadNextVideoFrameInternal(5L);
    }

    private RunnableC35630dz(UGCMediaListSource uGCMediaListSource) {
        this.f77002a = uGCMediaListSource;
    }
}
