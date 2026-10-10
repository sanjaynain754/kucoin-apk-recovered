package com.tencent.ugc.videobase.chain;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.chain.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35808a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageFilter f77341a;

    /* JADX INFO: renamed from: b */
    private final int f77342b;

    /* JADX INFO: renamed from: c */
    private final float f77343c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79294a(TXCGPUImageFilter tXCGPUImageFilter, int i11, float f11) {
        return new RunnableC35808a(tXCGPUImageFilter, i11, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatOnDraw$0(this.f77341a, this.f77342b, this.f77343c);
    }

    private RunnableC35808a(TXCGPUImageFilter tXCGPUImageFilter, int i11, float f11) {
        this.f77341a = tXCGPUImageFilter;
        this.f77342b = i11;
        this.f77343c = f11;
    }
}
