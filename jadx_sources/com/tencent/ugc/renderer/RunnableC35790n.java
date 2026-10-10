package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.n */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35790n implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77299a;

    /* JADX INFO: renamed from: b */
    private final VideoRenderListener f77300b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79277a(VideoRenderer videoRenderer, VideoRenderListener videoRenderListener) {
        return new RunnableC35790n(videoRenderer, videoRenderListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$start$0(this.f77299a, this.f77300b);
    }

    private RunnableC35790n(VideoRenderer videoRenderer, VideoRenderListener videoRenderListener) {
        this.f77299a = videoRenderer;
        this.f77300b = videoRenderListener;
    }
}
