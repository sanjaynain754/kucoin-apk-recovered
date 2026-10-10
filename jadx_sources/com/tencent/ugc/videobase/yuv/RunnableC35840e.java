package com.tencent.ugc.videobase.yuv;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35840e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageYUVOutputFilter f77406a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79325a(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        return new RunnableC35840e(tXCGPUImageYUVOutputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageYUVOutputFilter.lambda$setColorFormat$0(this.f77406a);
    }

    private RunnableC35840e(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        this.f77406a = tXCGPUImageYUVOutputFilter;
    }
}
