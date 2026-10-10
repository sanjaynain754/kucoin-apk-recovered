package com.tencent.ugc;

import java.util.List;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.es */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35661es implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77051a;

    /* JADX INFO: renamed from: b */
    private final List f77052b;

    /* JADX INFO: renamed from: c */
    private final FutureTask f77053c;

    /* JADX INFO: renamed from: d */
    private final FutureTask f77054d;

    /* JADX INFO: renamed from: a */
    public static Runnable m79155a(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask, FutureTask futureTask2) {
        return new RunnableC35661es(uGCMediaListSource, list, futureTask, futureTask2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setVideoSources$0(this.f77051a, this.f77052b, this.f77053c, this.f77054d);
    }

    private RunnableC35661es(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask, FutureTask futureTask2) {
        this.f77051a = uGCMediaListSource;
        this.f77052b = list;
        this.f77053c = futureTask;
        this.f77054d = futureTask2;
    }
}
