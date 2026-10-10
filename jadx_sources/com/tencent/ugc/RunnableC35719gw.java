package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35719gw implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77141a;

    /* JADX INFO: renamed from: b */
    private final UGCVideoProcessor.VideoEncodedFrameListener f77142b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79213a(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoEncodedFrameListener videoEncodedFrameListener) {
        return new RunnableC35719gw(uGCVideoProcessor, videoEncodedFrameListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77141a.mVideoEncodedFrameListener = this.f77142b;
    }

    private RunnableC35719gw(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoEncodedFrameListener videoEncodedFrameListener) {
        this.f77141a = uGCVideoProcessor;
        this.f77142b = videoEncodedFrameListener;
    }
}
