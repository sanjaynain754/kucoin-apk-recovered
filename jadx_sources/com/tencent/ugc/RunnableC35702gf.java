package com.tencent.ugc;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: renamed from: com.tencent.ugc.gf */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35702gf implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354821 f77115a;

    /* JADX INFO: renamed from: b */
    private final PixelFrame f77116b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79196a(UGCSingleFilePixelFrameProvider.C354821 c354821, PixelFrame pixelFrame) {
        return new RunnableC35702gf(c354821, pixelFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.C354821.m78981a(this.f77115a, this.f77116b);
    }

    private RunnableC35702gf(UGCSingleFilePixelFrameProvider.C354821 c354821, PixelFrame pixelFrame) {
        this.f77115a = c354821;
        this.f77116b = pixelFrame;
    }
}
