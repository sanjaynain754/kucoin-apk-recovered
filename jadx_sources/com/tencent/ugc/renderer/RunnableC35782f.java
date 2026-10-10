package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35782f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceViewRenderHelper f77287a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79269a(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        return new RunnableC35782f(surfaceViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceViewRenderHelper.lambda$checkViewAvailability$2(this.f77287a);
    }

    private RunnableC35782f(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        this.f77287a = surfaceViewRenderHelper;
    }
}
