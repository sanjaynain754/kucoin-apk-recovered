package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35652d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77039a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79146a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new RunnableC35652d(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77039a.encodeFrameInternal();
    }

    private RunnableC35652d(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f77039a = uGCVideoEncodeController;
    }
}
