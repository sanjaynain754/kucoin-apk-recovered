package com.tencent.ugc.videobase.yuv;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35837b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageI420InputFilter f77403a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79322a(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        return new RunnableC35837b(tXCGPUImageI420InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageI420InputFilter.lambda$setColorFormat$1(this.f77403a);
    }

    private RunnableC35837b(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        this.f77403a = tXCGPUImageI420InputFilter;
    }
}
