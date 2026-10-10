package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.l */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35603l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController f76960a;

    /* JADX INFO: renamed from: b */
    private final EncodedVideoFrame f76961b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79099a(UGCVideoDecodeController uGCVideoDecodeController, EncodedVideoFrame encodedVideoFrame) {
        return new RunnableC35603l(uGCVideoDecodeController, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.lambda$decode$1(this.f76960a, this.f76961b);
    }

    private RunnableC35603l(UGCVideoDecodeController uGCVideoDecodeController, EncodedVideoFrame encodedVideoFrame) {
        this.f76960a = uGCVideoDecodeController;
        this.f76961b = encodedVideoFrame;
    }
}
