package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.en */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35645en implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77026a;

    /* JADX INFO: renamed from: a */
    public static Callable m79141a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35645en(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f77026a.calculateTotalDurationOfClips());
    }

    private CallableC35645en(UGCMediaListSource uGCMediaListSource) {
        this.f77026a = uGCMediaListSource;
    }
}
