package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dr */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35622dr implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76985a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79118a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35622dr(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76985a.uninitializeInternal();
    }

    private RunnableC35622dr(UGCMediaListSource uGCMediaListSource) {
        this.f76985a = uGCMediaListSource;
    }
}
