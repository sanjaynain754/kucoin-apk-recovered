package com.tencent.ugc.preprocessor;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35765f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final GPUPreprocessor f77256a;

    /* JADX INFO: renamed from: b */
    private final float f77257b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79255a(GPUPreprocessor gPUPreprocessor, float f11) {
        return new RunnableC35765f(gPUPreprocessor, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setGaussianBlurLevel$1(this.f77256a, this.f77257b);
    }

    private RunnableC35765f(GPUPreprocessor gPUPreprocessor, float f11) {
        this.f77256a = gPUPreprocessor;
        this.f77257b = f11;
    }
}
