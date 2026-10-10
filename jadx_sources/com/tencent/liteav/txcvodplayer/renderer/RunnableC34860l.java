package com.tencent.liteav.txcvodplayer.renderer;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.l */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34860l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74099a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f74100b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76468a(C34852d c34852d, SurfaceTexture surfaceTexture) {
        return new RunnableC34860l(c34852d, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76444a(this.f74099a, this.f74100b);
    }

    private RunnableC34860l(C34852d c34852d, SurfaceTexture surfaceTexture) {
        this.f74099a = c34852d;
        this.f74100b = surfaceTexture;
    }
}
