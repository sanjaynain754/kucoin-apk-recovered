package com.tencent.ugc.videobase.utils;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.utils.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35831a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final SurfaceTextureHolder f77382a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f77383b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79312a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        return new RunnableC35831a(surfaceTextureHolder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTextureHolder.lambda$onFrameAvailable$0(this.f77382a, this.f77383b);
    }

    private RunnableC35831a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        this.f77382a = surfaceTextureHolder;
        this.f77383b = surfaceTexture;
    }
}
