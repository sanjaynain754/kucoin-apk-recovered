package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.ed */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35635ed implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77011a;

    /* JADX INFO: renamed from: a */
    public static Callable m79131a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35635ed(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f77011a.calculateTotalDurationOfClips());
    }

    private CallableC35635ed(UGCMediaListSource uGCMediaListSource) {
        this.f77011a = uGCMediaListSource;
    }
}
