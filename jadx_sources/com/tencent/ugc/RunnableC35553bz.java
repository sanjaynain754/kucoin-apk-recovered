package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.bz */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35553bz implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76875a;

    /* JADX INFO: renamed from: b */
    private final float f76876b;

    /* JADX INFO: renamed from: c */
    private final float f76877c;

    /* JADX INFO: renamed from: d */
    private final float f76878d;

    /* JADX INFO: renamed from: e */
    private final Bitmap f76879e;

    /* JADX INFO: renamed from: f */
    private final Bitmap f76880f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79052a(TXVideoEditer tXVideoEditer, float f11, float f12, float f13, Bitmap bitmap, Bitmap bitmap2) {
        return new RunnableC35553bz(tXVideoEditer, f11, f12, f13, bitmap, bitmap2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setFilter$6(this.f76875a, this.f76876b, this.f76877c, this.f76878d, this.f76879e, this.f76880f);
    }

    private RunnableC35553bz(TXVideoEditer tXVideoEditer, float f11, float f12, float f13, Bitmap bitmap, Bitmap bitmap2) {
        this.f76875a = tXVideoEditer;
        this.f76876b = f11;
        this.f76877c = f12;
        this.f76878d = f13;
        this.f76879e = bitmap;
        this.f76880f = bitmap2;
    }
}
