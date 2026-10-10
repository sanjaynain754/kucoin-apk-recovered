package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.m */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35752m implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77218a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditConstants.TXRect f77219b;

    /* JADX INFO: renamed from: c */
    private final Bitmap f77220c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79246a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
        return new RunnableC35752m(tXVideoEditer, tXRect, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setWaterMark$16(this.f77218a, this.f77219b, this.f77220c);
    }

    private RunnableC35752m(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
        this.f77218a = tXVideoEditer;
        this.f77219b = tXRect;
        this.f77220c = bitmap;
    }
}
