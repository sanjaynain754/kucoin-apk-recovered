package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.ugc.dn */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC35618dn implements Callable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76980a;

    /* JADX INFO: renamed from: b */
    private final int f76981b;

    /* JADX INFO: renamed from: a */
    public static Callable m79114a(UGCImageProvider uGCImageProvider, int i11) {
        return new CallableC35618dn(uGCImageProvider, i11);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return UGCImageProvider.lambda$setPictureTransition$5(this.f76980a, this.f76981b);
    }

    private CallableC35618dn(UGCImageProvider uGCImageProvider, int i11) {
        this.f76980a = uGCImageProvider;
        this.f76981b = i11;
    }
}
