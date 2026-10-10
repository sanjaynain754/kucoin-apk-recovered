package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.du */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35625du implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76990a;

    /* JADX INFO: renamed from: b */
    private final long f76991b;

    /* JADX INFO: renamed from: c */
    private final long f76992c;

    /* JADX INFO: renamed from: d */
    private final FutureTask f76993d;

    /* JADX INFO: renamed from: a */
    public static Runnable m79121a(UGCMediaListSource uGCMediaListSource, long j11, long j12, FutureTask futureTask) {
        return new RunnableC35625du(uGCMediaListSource, j11, j12, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setVideoSourceRange$5(this.f76990a, this.f76991b, this.f76992c, this.f76993d);
    }

    private RunnableC35625du(UGCMediaListSource uGCMediaListSource, long j11, long j12, FutureTask futureTask) {
        this.f76990a = uGCMediaListSource;
        this.f76991b = j11;
        this.f76992c = j12;
        this.f76993d = futureTask;
    }
}
