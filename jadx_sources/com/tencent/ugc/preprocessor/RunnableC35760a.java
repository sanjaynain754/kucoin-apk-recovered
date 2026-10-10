package com.tencent.ugc.preprocessor;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35760a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final BeautyProcessor f77242a;

    /* JADX INFO: renamed from: b */
    private final float f77243b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79250a(BeautyProcessor beautyProcessor, float f11) {
        return new RunnableC35760a(beautyProcessor, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeautyProcessor.lambda$setBeautyLevel$0(this.f77242a, this.f77243b);
    }

    private RunnableC35760a(BeautyProcessor beautyProcessor, float f11) {
        this.f77242a = beautyProcessor;
        this.f77243b = f11;
    }
}
