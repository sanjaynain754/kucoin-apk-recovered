package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.ev */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35664ev implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77057a;

    /* JADX INFO: renamed from: a */
    public static Callable m79158a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35664ev(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f77057a.calculateTotalDurationOfClips());
    }

    private CallableC35664ev(UGCMediaListSource uGCMediaListSource) {
        this.f77057a = uGCMediaListSource;
    }
}
