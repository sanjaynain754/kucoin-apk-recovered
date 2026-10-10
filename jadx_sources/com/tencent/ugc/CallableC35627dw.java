package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.dw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35627dw implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76997a;

    /* JADX INFO: renamed from: a */
    public static Callable m79123a(UGCMediaListSource uGCMediaListSource) {
        return new CallableC35627dw(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f76997a.calculateTotalDurationOfClips());
    }

    private CallableC35627dw(UGCMediaListSource uGCMediaListSource) {
        this.f76997a = uGCMediaListSource;
    }
}
