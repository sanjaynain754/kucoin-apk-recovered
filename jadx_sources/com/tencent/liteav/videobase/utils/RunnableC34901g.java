package com.tencent.liteav.videobase.utils;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.g */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34901g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceTextureHolder f74324a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f74325b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76564a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        return new RunnableC34901g(surfaceTextureHolder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTextureHolder.lambda$onFrameAvailable$0(this.f74324a, this.f74325b);
    }

    private RunnableC34901g(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        this.f74324a = surfaceTextureHolder;
        this.f74325b = surfaceTexture;
    }
}
