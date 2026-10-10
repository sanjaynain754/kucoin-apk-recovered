package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35778b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceRenderHelper f77282a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79265a(SurfaceRenderHelper surfaceRenderHelper) {
        return new RunnableC35778b(surfaceRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRenderHelper.lambda$release$1(this.f77282a);
    }

    private RunnableC35778b(SurfaceRenderHelper surfaceRenderHelper) {
        this.f77282a = surfaceRenderHelper;
    }
}
