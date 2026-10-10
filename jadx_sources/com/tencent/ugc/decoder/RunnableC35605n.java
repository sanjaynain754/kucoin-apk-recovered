package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.n */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35605n implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76963a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79101a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new RunnableC35605n(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.lambda$signalEndOfStream$3(this.f76963a);
    }

    private RunnableC35605n(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f76963a = uGCVideoDecodeController;
    }
}
