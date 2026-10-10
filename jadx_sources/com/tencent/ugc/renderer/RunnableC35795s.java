package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.s */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35795s implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77313a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79282a(VideoRenderer videoRenderer) {
        return new RunnableC35795s(videoRenderer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$onRequestRedraw$14(this.f77313a);
    }

    private RunnableC35795s(VideoRenderer videoRenderer) {
        this.f77313a = videoRenderer;
    }
}
