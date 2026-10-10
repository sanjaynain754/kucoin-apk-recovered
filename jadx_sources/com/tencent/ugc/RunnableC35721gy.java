package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.gy */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35721gy implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77145a;

    /* JADX INFO: renamed from: b */
    private final List f77146b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79215a(UGCVideoProcessor uGCVideoProcessor, List list) {
        return new RunnableC35721gy(uGCVideoProcessor, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setSpeedList$10(this.f77145a, this.f77146b);
    }

    private RunnableC35721gy(UGCVideoProcessor uGCVideoProcessor, List list) {
        this.f77145a = uGCVideoProcessor;
        this.f77146b = list;
    }
}
