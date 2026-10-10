package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35653e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77040a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79147a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new RunnableC35653e(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77040a.encodeFrameInternal();
    }

    private RunnableC35653e(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f77040a = uGCVideoEncodeController;
    }
}
