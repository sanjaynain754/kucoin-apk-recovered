package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.ac */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35777ac implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77280a;

    /* JADX INFO: renamed from: b */
    private final boolean f77281b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79264a(VideoRenderer videoRenderer, boolean z11) {
        return new RunnableC35777ac(videoRenderer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setVerticalMirror$8(this.f77280a, this.f77281b);
    }

    private RunnableC35777ac(VideoRenderer videoRenderer, boolean z11) {
        this.f77280a = videoRenderer;
        this.f77281b = z11;
    }
}
