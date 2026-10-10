package com.tencent.ugc.preprocessor;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.h */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35767h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final GPUPreprocessor f77260a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f77261b;

    /* JADX INFO: renamed from: c */
    private final Bitmap f77262c;

    /* JADX INFO: renamed from: d */
    private final float f77263d;

    /* JADX INFO: renamed from: e */
    private final float f77264e;

    /* JADX INFO: renamed from: f */
    private final float f77265f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79257a(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, Bitmap bitmap2, float f11, float f12, float f13) {
        return new RunnableC35767h(gPUPreprocessor, bitmap, bitmap2, f11, f12, f13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setFilterGroupImages$3(this.f77260a, this.f77261b, this.f77262c, this.f77263d, this.f77264e, this.f77265f);
    }

    private RunnableC35767h(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, Bitmap bitmap2, float f11, float f12, float f13) {
        this.f77260a = gPUPreprocessor;
        this.f77261b = bitmap;
        this.f77262c = bitmap2;
        this.f77263d = f11;
        this.f77264e = f12;
        this.f77265f = f13;
    }
}
