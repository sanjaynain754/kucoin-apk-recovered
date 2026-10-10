package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.er */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35660er implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77049a;

    /* JADX INFO: renamed from: b */
    private final List f77050b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79154a(UGCMediaListSource uGCMediaListSource, List list) {
        return new RunnableC35660er(uGCMediaListSource, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$clearVideoFrameQueue$20(this.f77049a, this.f77050b);
    }

    private RunnableC35660er(UGCMediaListSource uGCMediaListSource, List list) {
        this.f77049a = uGCMediaListSource;
        this.f77050b = list;
    }
}
