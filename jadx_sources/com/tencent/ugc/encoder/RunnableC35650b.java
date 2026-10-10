package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35650b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77037a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79144a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new RunnableC35650b(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoEncodeController.lambda$stop$1(this.f77037a);
    }

    private RunnableC35650b(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f77037a = uGCVideoEncodeController;
    }
}
