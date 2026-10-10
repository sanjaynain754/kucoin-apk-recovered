package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.ab */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35776ab implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77278a;

    /* JADX INFO: renamed from: b */
    private final boolean f77279b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79263a(VideoRenderer videoRenderer, boolean z11) {
        return new RunnableC35776ab(videoRenderer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setHorizontalMirror$7(this.f77278a, this.f77279b);
    }

    private RunnableC35776ab(VideoRenderer videoRenderer, boolean z11) {
        this.f77278a = videoRenderer;
        this.f77279b = z11;
    }
}
