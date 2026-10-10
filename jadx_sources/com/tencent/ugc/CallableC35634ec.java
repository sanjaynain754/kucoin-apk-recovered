package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.ec */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35634ec implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77010a;

    /* JADX INFO: renamed from: a */
    public static Callable m79130a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35634ec(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.f77010a.hasAudioDataInternal());
    }

    private CallableC35634ec(UGCMediaListSource uGCMediaListSource) {
        this.f77010a = uGCMediaListSource;
    }
}
