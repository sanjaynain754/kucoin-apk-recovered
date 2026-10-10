package com.tencent.ugc;

import java.util.List;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.ee */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35636ee implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77012a;

    /* JADX INFO: renamed from: b */
    private final List f77013b;

    /* JADX INFO: renamed from: c */
    private final FutureTask f77014c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79132a(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        return new RunnableC35636ee(uGCMediaListSource, list, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setRepeatPlay$12(this.f77012a, this.f77013b, this.f77014c);
    }

    private RunnableC35636ee(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        this.f77012a = uGCMediaListSource;
        this.f77013b = list;
        this.f77014c = futureTask;
    }
}
