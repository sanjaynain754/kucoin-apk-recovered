package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.o */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35791o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77301a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79278a(VideoRenderer videoRenderer) {
        return new RunnableC35791o(videoRenderer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$renderFrame$9(this.f77301a);
    }

    private RunnableC35791o(VideoRenderer videoRenderer) {
        this.f77301a = videoRenderer;
    }
}
