package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.j */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35601j implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76957a;

    /* JADX INFO: renamed from: b */
    private final UGCVideoDecodeControllerListener f76958b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79097a(UGCVideoDecodeController uGCVideoDecodeController, UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener) {
        return new RunnableC35601j(uGCVideoDecodeController, uGCVideoDecodeControllerListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76957a.mListener = this.f76958b;
    }

    private RunnableC35601j(UGCVideoDecodeController uGCVideoDecodeController, UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener) {
        this.f76957a = uGCVideoDecodeController;
        this.f76958b = uGCVideoDecodeControllerListener;
    }
}
