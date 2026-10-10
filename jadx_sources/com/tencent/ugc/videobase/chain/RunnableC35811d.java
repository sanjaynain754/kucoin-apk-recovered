package com.tencent.ugc.videobase.chain;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.chain.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35811d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageFilter f77350a;

    /* JADX INFO: renamed from: b */
    private final int f77351b;

    /* JADX INFO: renamed from: c */
    private final float[] f77352c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79297a(TXCGPUImageFilter tXCGPUImageFilter, int i11, float[] fArr) {
        return new RunnableC35811d(tXCGPUImageFilter, i11, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatVec4OnDraw$3(this.f77350a, this.f77351b, this.f77352c);
    }

    private RunnableC35811d(TXCGPUImageFilter tXCGPUImageFilter, int i11, float[] fArr) {
        this.f77350a = tXCGPUImageFilter;
        this.f77351b = i11;
        this.f77352c = fArr;
    }
}
