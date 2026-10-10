package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.em */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35644em implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77025a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79140a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35644em(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77025a.prePareNextUGCPixelFrameProvider();
    }

    private RunnableC35644em(UGCMediaListSource uGCMediaListSource) {
        this.f77025a = uGCMediaListSource;
    }
}
