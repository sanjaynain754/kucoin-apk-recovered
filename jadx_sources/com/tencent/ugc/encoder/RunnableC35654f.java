package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35654f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77041a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79148a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new RunnableC35654f(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77041a.encodeFrameInternal();
    }

    private RunnableC35654f(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f77041a = uGCVideoEncodeController;
    }
}
