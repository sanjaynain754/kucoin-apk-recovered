package com.tencent.ugc.preprocessor;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35764e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final GPUPreprocessor f77251a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f77252b;

    /* JADX INFO: renamed from: c */
    private final float f77253c;

    /* JADX INFO: renamed from: d */
    private final float f77254d;

    /* JADX INFO: renamed from: e */
    private final float f77255e;

    /* JADX INFO: renamed from: a */
    public static Runnable m79254a(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, float f11, float f12, float f13) {
        return new RunnableC35764e(gPUPreprocessor, bitmap, f11, f12, f13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setWatermark$0(this.f77251a, this.f77252b, this.f77253c, this.f77254d, this.f77255e);
    }

    private RunnableC35764e(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, float f11, float f12, float f13) {
        this.f77251a = gPUPreprocessor;
        this.f77252b = bitmap;
        this.f77253c = f11;
        this.f77254d = f12;
        this.f77255e = f13;
    }
}
