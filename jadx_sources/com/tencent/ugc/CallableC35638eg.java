package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.eg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35638eg implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77017a;

    /* JADX INFO: renamed from: a */
    public static Callable m79134a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35638eg(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f77017a.calculateTotalDurationOfClips());
    }

    private CallableC35638eg(UGCMediaListSource uGCMediaListSource) {
        this.f77017a = uGCMediaListSource;
    }
}
