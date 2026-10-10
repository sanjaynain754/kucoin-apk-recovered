package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gm */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35709gm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77124a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79203a(UGCMediaListSource uGCMediaListSource) {
        return new RunnableC35709gm(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77124a.initialize();
    }

    private RunnableC35709gm(UGCMediaListSource uGCMediaListSource) {
        this.f77124a = uGCMediaListSource;
    }
}
