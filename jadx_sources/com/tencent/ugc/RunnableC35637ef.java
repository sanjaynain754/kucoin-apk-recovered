package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ef */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35637ef implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77015a;

    /* JADX INFO: renamed from: b */
    private final boolean f77016b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79133a(UGCMediaListSource uGCMediaListSource, boolean z11) {
        return new RunnableC35637ef(uGCMediaListSource, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setReverse$13(this.f77015a, this.f77016b);
    }

    private RunnableC35637ef(UGCMediaListSource uGCMediaListSource, boolean z11) {
        this.f77015a = uGCMediaListSource;
        this.f77016b = z11;
    }
}
