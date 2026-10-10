package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35531e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPULookupFilterGroup f76815a;

    /* JADX INFO: renamed from: b */
    private final float f76816b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79031a(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f11) {
        return new RunnableC35531e(tXCGPULookupFilterGroup, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPULookupFilterGroup.lambda$setIntensity$1(this.f76815a, this.f76816b);
    }

    private RunnableC35531e(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f11) {
        this.f76815a = tXCGPULookupFilterGroup;
        this.f76816b = f11;
    }
}
