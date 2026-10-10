package com.tencent.liteav.videoconsumer.renderer;

import android.view.SurfaceView;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.g */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34926g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34925f f74508a;

    /* JADX INFO: renamed from: b */
    private final SurfaceView f74509b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76617a(C34925f c34925f, SurfaceView surfaceView) {
        return new RunnableC34926g(c34925f, surfaceView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34925f.m76608a(this.f74508a, this.f74509b);
    }

    private RunnableC34926g(C34925f c34925f, SurfaceView surfaceView) {
        this.f74508a = c34925f;
        this.f74509b = surfaceView;
    }
}
