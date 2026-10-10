package com.tencent.ugc.videobase.yuv;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35836a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageI420InputFilter f77402a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79321a(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        return new RunnableC35836a(tXCGPUImageI420InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageI420InputFilter.lambda$onInit$0(this.f77402a);
    }

    private RunnableC35836a(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        this.f77402a = tXCGPUImageI420InputFilter;
    }
}
