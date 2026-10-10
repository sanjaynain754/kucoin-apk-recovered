package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35651c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77038a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79145a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new RunnableC35651c(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77038a.encodeFrameInternal();
    }

    private RunnableC35651c(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f77038a = uGCVideoEncodeController;
    }
}
