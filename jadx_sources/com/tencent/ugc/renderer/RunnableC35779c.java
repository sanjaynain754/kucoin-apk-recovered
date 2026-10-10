package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35779c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceRenderHelper f77283a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79266a(SurfaceRenderHelper surfaceRenderHelper) {
        return new RunnableC35779c(surfaceRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRenderHelper.lambda$checkViewAvailability$2(this.f77283a);
    }

    private RunnableC35779c(SurfaceRenderHelper surfaceRenderHelper) {
        this.f77283a = surfaceRenderHelper;
    }
}
