package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.p */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35792p implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77302a;

    /* JADX INFO: renamed from: b */
    private final boolean f77303b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79279a(VideoRenderer videoRenderer, boolean z11) {
        return new RunnableC35792p(videoRenderer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77302a.mIsHDR = this.f77303b;
    }

    private RunnableC35792p(VideoRenderer videoRenderer, boolean z11) {
        this.f77302a = videoRenderer;
        this.f77303b = z11;
    }
}
