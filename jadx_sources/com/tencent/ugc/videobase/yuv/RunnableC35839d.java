package com.tencent.ugc.videobase.yuv;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35839d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageNV12InputFilter f77405a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79324a(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        return new RunnableC35839d(tXCGPUImageNV12InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageNV12InputFilter.lambda$setColorFormat$1(this.f77405a);
    }

    private RunnableC35839d(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        this.f77405a = tXCGPUImageNV12InputFilter;
    }
}
