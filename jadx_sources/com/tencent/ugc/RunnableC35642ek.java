package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ek */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35642ek implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77023a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79138a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35642ek(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77023a.loadNextVideoFrameInternal(5L);
    }

    private RunnableC35642ek(UGCMediaListSource uGCMediaListSource) {
        this.f77023a = uGCMediaListSource;
    }
}
