package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.ds */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35623ds implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76986a;

    /* JADX INFO: renamed from: b */
    private final boolean f76987b;

    /* JADX INFO: renamed from: c */
    private final FutureTask f76988c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79119a(UGCMediaListSource uGCMediaListSource, boolean z11, FutureTask futureTask) {
        return new RunnableC35623ds(uGCMediaListSource, z11, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setIsSplitScreenMode$4(this.f76986a, this.f76987b, this.f76988c);
    }

    private RunnableC35623ds(UGCMediaListSource uGCMediaListSource, boolean z11, FutureTask futureTask) {
        this.f76986a = uGCMediaListSource;
        this.f76987b = z11;
        this.f76988c = futureTask;
    }
}
