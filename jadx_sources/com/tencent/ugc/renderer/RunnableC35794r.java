package com.tencent.ugc.renderer;

import android.view.Surface;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.r */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35794r implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77310a;

    /* JADX INFO: renamed from: b */
    private final Surface f77311b;

    /* JADX INFO: renamed from: c */
    private final boolean f77312c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79281a(VideoRenderer videoRenderer, Surface surface, boolean z11) {
        return new RunnableC35794r(videoRenderer, surface, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$onSurfaceChanged$13(this.f77310a, this.f77311b, this.f77312c);
    }

    private RunnableC35794r(VideoRenderer videoRenderer, Surface surface, boolean z11) {
        this.f77310a = videoRenderer;
        this.f77311b = surface;
        this.f77312c = z11;
    }
}
