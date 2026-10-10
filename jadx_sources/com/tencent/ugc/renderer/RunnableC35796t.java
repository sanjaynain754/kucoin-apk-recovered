package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.t */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35796t implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77314a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79283a(VideoRenderer videoRenderer) {
        return new RunnableC35796t(videoRenderer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$onSurfaceDestroy$15(this.f77314a);
    }

    private RunnableC35796t(VideoRenderer videoRenderer) {
        this.f77314a = videoRenderer;
    }
}
