package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.dt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35624dt implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76989a;

    /* JADX INFO: renamed from: a */
    public static Callable m79120a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35624dt(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f76989a.calculateTotalDurationOfClips());
    }

    private CallableC35624dt(UGCMediaListSource uGCMediaListSource) {
        this.f76989a = uGCMediaListSource;
    }
}
