package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35781e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceViewRenderHelper f77286a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79268a(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        return new RunnableC35781e(surfaceViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceViewRenderHelper.lambda$release$1(this.f77286a);
    }

    private RunnableC35781e(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        this.f77286a = surfaceViewRenderHelper;
    }
}
