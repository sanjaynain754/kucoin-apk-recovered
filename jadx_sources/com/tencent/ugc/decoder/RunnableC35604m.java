package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.m */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35604m implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76962a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79100a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new RunnableC35604m(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.lambda$abandonDecodingFrames$2(this.f76962a);
    }

    private RunnableC35604m(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f76962a = uGCVideoDecodeController;
    }
}
