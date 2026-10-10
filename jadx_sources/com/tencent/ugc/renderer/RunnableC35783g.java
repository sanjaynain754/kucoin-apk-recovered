package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.g */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35783g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceViewRenderHelper f77288a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79270a(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        return new RunnableC35783g(surfaceViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77288a.updateViewLayoutForHDR();
    }

    private RunnableC35783g(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        this.f77288a = surfaceViewRenderHelper;
    }
}
