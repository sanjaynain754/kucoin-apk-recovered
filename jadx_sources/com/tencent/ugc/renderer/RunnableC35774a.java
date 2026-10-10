package com.tencent.ugc.renderer;

import android.view.Surface;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35774a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceRenderHelper f77274a;

    /* JADX INFO: renamed from: b */
    private final Surface f77275b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79261a(SurfaceRenderHelper surfaceRenderHelper, Surface surface) {
        return new RunnableC35774a(surfaceRenderHelper, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRenderHelper.lambda$new$0(this.f77274a, this.f77275b);
    }

    private RunnableC35774a(SurfaceRenderHelper surfaceRenderHelper, Surface surface) {
        this.f77274a = surfaceRenderHelper;
        this.f77275b = surface;
    }
}
