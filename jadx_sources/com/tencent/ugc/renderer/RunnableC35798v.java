package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.v */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35798v implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77321a;

    /* JADX INFO: renamed from: b */
    private final boolean f77322b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79285a(VideoRenderer videoRenderer, boolean z11) {
        return new RunnableC35798v(videoRenderer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$stop$1(this.f77321a, this.f77322b);
    }

    private RunnableC35798v(VideoRenderer videoRenderer, boolean z11) {
        this.f77321a = videoRenderer;
        this.f77322b = z11;
    }
}
