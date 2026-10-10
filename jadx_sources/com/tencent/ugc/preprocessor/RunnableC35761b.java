package com.tencent.ugc.preprocessor;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35761b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final BeautyProcessor f77244a;

    /* JADX INFO: renamed from: b */
    private final float f77245b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79251a(BeautyProcessor beautyProcessor, float f11) {
        return new RunnableC35761b(beautyProcessor, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeautyProcessor.lambda$setWhitenessLevel$1(this.f77244a, this.f77245b);
    }

    private RunnableC35761b(BeautyProcessor beautyProcessor, float f11) {
        this.f77244a = beautyProcessor;
        this.f77245b = f11;
    }
}
