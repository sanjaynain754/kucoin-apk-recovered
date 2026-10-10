package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.eb */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35633eb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77008a;

    /* JADX INFO: renamed from: b */
    private final boolean f77009b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79129a(UGCMediaListSource uGCMediaListSource, boolean z11) {
        return new RunnableC35633eb(uGCMediaListSource, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$seekTo$11(this.f77008a, this.f77009b);
    }

    private RunnableC35633eb(UGCMediaListSource uGCMediaListSource, boolean z11) {
        this.f77008a = uGCMediaListSource;
        this.f77009b = z11;
    }
}
