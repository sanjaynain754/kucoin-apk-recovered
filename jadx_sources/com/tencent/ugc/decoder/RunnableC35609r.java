package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.r */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35609r implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76968a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79105a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new RunnableC35609r(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76968a.notifyDecodeCompleted();
    }

    private RunnableC35609r(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f76968a = uGCVideoDecodeController;
    }
}
