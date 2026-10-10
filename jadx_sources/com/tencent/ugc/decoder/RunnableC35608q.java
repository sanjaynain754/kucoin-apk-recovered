package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.q */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35608q implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76967a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79104a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new RunnableC35608q(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76967a.notifyAbandonDecodingFramesCompleted();
    }

    private RunnableC35608q(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f76967a = uGCVideoDecodeController;
    }
}
