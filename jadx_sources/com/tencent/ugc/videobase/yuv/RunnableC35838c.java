package com.tencent.ugc.videobase.yuv;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35838c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageNV12InputFilter f77404a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79323a(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        return new RunnableC35838c(tXCGPUImageNV12InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageNV12InputFilter.lambda$onInit$0(this.f77404a);
    }

    private RunnableC35838c(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        this.f77404a = tXCGPUImageNV12InputFilter;
    }
}
