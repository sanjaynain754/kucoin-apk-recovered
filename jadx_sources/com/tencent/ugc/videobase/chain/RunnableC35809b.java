package com.tencent.ugc.videobase.chain;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.chain.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35809b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageFilter f77344a;

    /* JADX INFO: renamed from: b */
    private final int f77345b;

    /* JADX INFO: renamed from: c */
    private final float[] f77346c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79295a(TXCGPUImageFilter tXCGPUImageFilter, int i11, float[] fArr) {
        return new RunnableC35809b(tXCGPUImageFilter, i11, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatVec3OnDraw$1(this.f77344a, this.f77345b, this.f77346c);
    }

    private RunnableC35809b(TXCGPUImageFilter tXCGPUImageFilter, int i11, float[] fArr) {
        this.f77344a = tXCGPUImageFilter;
        this.f77345b = i11;
        this.f77346c = fArr;
    }
}
