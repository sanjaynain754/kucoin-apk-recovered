package com.tencent.ugc.videobase.yuv;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35841f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageYUVOutputFilter f77407a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79326a(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        return new RunnableC35841f(tXCGPUImageYUVOutputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageYUVOutputFilter.lambda$onOutputSizeChanged$1(this.f77407a);
    }

    private RunnableC35841f(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        this.f77407a = tXCGPUImageYUVOutputFilter;
    }
}
