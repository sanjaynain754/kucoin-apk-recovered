package com.tencent.ugc.renderer;

import android.view.SurfaceView;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35780d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceViewRenderHelper f77284a;

    /* JADX INFO: renamed from: b */
    private final SurfaceView f77285b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79267a(SurfaceViewRenderHelper surfaceViewRenderHelper, SurfaceView surfaceView) {
        return new RunnableC35780d(surfaceViewRenderHelper, surfaceView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceViewRenderHelper.lambda$new$0(this.f77284a, this.f77285b);
    }

    private RunnableC35780d(SurfaceViewRenderHelper surfaceViewRenderHelper, SurfaceView surfaceView) {
        this.f77284a = surfaceViewRenderHelper;
        this.f77285b = surfaceView;
    }
}
