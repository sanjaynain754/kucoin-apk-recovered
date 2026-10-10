package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.dx */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35628dx implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76998a;

    /* JADX INFO: renamed from: b */
    private final int f76999b;

    /* JADX INFO: renamed from: c */
    private final FutureTask f77000c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79124a(UGCMediaListSource uGCMediaListSource, int i11, FutureTask futureTask) {
        return new RunnableC35628dx(uGCMediaListSource, i11, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setPictureTransition$7(this.f76998a, this.f76999b, this.f77000c);
    }

    private RunnableC35628dx(UGCMediaListSource uGCMediaListSource, int i11, FutureTask futureTask) {
        this.f76998a = uGCMediaListSource;
        this.f76999b = i11;
        this.f77000c = futureTask;
    }
}
