package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35527a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUGaussianBlurFilter.C35525a f76804a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79027a(TXCGPUGaussianBlurFilter.C35525a c35525a) {
        return new RunnableC35527a(c35525a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUGaussianBlurFilter.C35525a.m79024a(this.f76804a);
    }

    private RunnableC35527a(TXCGPUGaussianBlurFilter.C35525a c35525a) {
        this.f76804a = c35525a;
    }
}
