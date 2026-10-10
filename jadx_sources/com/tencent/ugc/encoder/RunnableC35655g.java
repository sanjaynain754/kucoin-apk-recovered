package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.g */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35655g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77042a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79149a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new RunnableC35655g(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77042a.encodeFrameInternal();
    }

    private RunnableC35655g(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f77042a = uGCVideoEncodeController;
    }
}
