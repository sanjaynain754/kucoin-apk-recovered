package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.ex */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35666ex implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77061a;

    /* JADX INFO: renamed from: a */
    public static Callable m79160a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35666ex(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f77061a.calculateTotalDurationOfClips());
    }

    private CallableC35666ex(UGCMediaListSource uGCMediaListSource) {
        this.f77061a = uGCMediaListSource;
    }
}
