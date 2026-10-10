package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.eq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35659eq implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77048a;

    /* JADX INFO: renamed from: a */
    public static Callable m79153a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35659eq(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f77048a.calculateTotalDurationOfClips());
    }

    private CallableC35659eq(UGCMediaListSource uGCMediaListSource) {
        this.f77048a = uGCMediaListSource;
    }
}
