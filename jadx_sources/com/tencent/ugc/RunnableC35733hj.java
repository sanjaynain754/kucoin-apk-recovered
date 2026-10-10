package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.hj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35733hj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77172a;

    /* JADX INFO: renamed from: b */
    private final List f77173b;

    /* JADX INFO: renamed from: c */
    private final int f77174c;

    /* JADX INFO: renamed from: d */
    private final int f77175d;

    /* JADX INFO: renamed from: a */
    public static Runnable m79227a(UGCVideoProcessor uGCVideoProcessor, List list, int i11, int i12) {
        return new RunnableC35733hj(uGCVideoProcessor, list, i11, i12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setSplitScreenList$3(this.f77172a, this.f77173b, this.f77174c, this.f77175d);
    }

    private RunnableC35733hj(UGCVideoProcessor uGCVideoProcessor, List list, int i11, int i12) {
        this.f77172a = uGCVideoProcessor;
        this.f77173b = list;
        this.f77174c = i11;
        this.f77175d = i12;
    }
}
