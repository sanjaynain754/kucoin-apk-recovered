package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.n */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35753n implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77221a;

    /* JADX INFO: renamed from: b */
    private final int f77222b;

    /* JADX INFO: renamed from: c */
    private final Bitmap f77223c;

    /* JADX INFO: renamed from: d */
    private final TXVideoEditConstants.TXRect f77224d;

    /* JADX INFO: renamed from: a */
    public static Runnable m79247a(TXVideoEditer tXVideoEditer, int i11, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        return new RunnableC35753n(tXVideoEditer, i11, bitmap, tXRect);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setTailWaterMark$17(this.f77221a, this.f77222b, this.f77223c, this.f77224d);
    }

    private RunnableC35753n(TXVideoEditer tXVideoEditer, int i11, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        this.f77221a = tXVideoEditer;
        this.f77222b = i11;
        this.f77223c = bitmap;
        this.f77224d = tXRect;
    }
}
