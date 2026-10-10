package com.tencent.ugc.videobase.chain;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.chain.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35810c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageFilter f77347a;

    /* JADX INFO: renamed from: b */
    private final int f77348b;

    /* JADX INFO: renamed from: c */
    private final float[] f77349c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79296a(TXCGPUImageFilter tXCGPUImageFilter, int i11, float[] fArr) {
        return new RunnableC35810c(tXCGPUImageFilter, i11, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatVec2OnDraw$2(this.f77347a, this.f77348b, this.f77349c);
    }

    private RunnableC35810c(TXCGPUImageFilter tXCGPUImageFilter, int i11, float[] fArr) {
        this.f77347a = tXCGPUImageFilter;
        this.f77348b = i11;
        this.f77349c = fArr;
    }
}
