package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.k */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35602k implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76959a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79098a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new RunnableC35602k(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76959a.stopInternal();
    }

    private RunnableC35602k(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f76959a = uGCVideoDecodeController;
    }
}
