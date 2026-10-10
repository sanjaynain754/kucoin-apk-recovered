package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ea */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35632ea implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77006a;

    /* JADX INFO: renamed from: b */
    private final long f77007b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79128a(UGCMediaListSource uGCMediaListSource, long j11) {
        return new RunnableC35632ea(uGCMediaListSource, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setPlayEndTime$10(this.f77006a, this.f77007b);
    }

    private RunnableC35632ea(UGCMediaListSource uGCMediaListSource, long j11) {
        this.f77006a = uGCMediaListSource;
        this.f77007b = j11;
    }
}
