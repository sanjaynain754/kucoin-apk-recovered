package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.p */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35607p implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController.C35591a f76965a;

    /* JADX INFO: renamed from: b */
    private final PixelFrame f76966b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79103a(UGCVideoDecodeController.C35591a c35591a, PixelFrame pixelFrame) {
        return new RunnableC35607p(c35591a, pixelFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.C35591a.m79086a(this.f76965a, this.f76966b);
    }

    private RunnableC35607p(UGCVideoDecodeController.C35591a c35591a, PixelFrame pixelFrame) {
        this.f76965a = c35591a;
        this.f76966b = pixelFrame;
    }
}
