package com.tencent.ugc;

import java.util.List;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.eh */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35639eh implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77018a;

    /* JADX INFO: renamed from: b */
    private final List f77019b;

    /* JADX INFO: renamed from: c */
    private final FutureTask f77020c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79135a(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        return new RunnableC35639eh(uGCMediaListSource, list, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setSpeedList$14(this.f77018a, this.f77019b, this.f77020c);
    }

    private RunnableC35639eh(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        this.f77018a = uGCMediaListSource;
        this.f77019b = list;
        this.f77020c = futureTask;
    }
}
