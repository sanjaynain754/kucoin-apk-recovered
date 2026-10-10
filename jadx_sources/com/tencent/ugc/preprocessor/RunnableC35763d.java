package com.tencent.ugc.preprocessor;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35763d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final BeautyProcessor f77249a;

    /* JADX INFO: renamed from: b */
    private final boolean f77250b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79253a(BeautyProcessor beautyProcessor, boolean z11) {
        return new RunnableC35763d(beautyProcessor, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeautyProcessor.lambda$setPerformanceMode$3(this.f77249a, this.f77250b);
    }

    private RunnableC35763d(BeautyProcessor beautyProcessor, boolean z11) {
        this.f77249a = beautyProcessor;
        this.f77250b = z11;
    }
}
