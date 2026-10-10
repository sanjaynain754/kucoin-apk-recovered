package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34974c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeCameraCaptureListener f74784a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f74785b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76773a(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        return new RunnableC34974c(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener nativeCameraCaptureListener = this.f74784a;
        nativeCameraCaptureListener.runInNative(RunnableC34975d.m76774a(nativeCameraCaptureListener, this.f74785b));
    }

    private RunnableC34974c(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        this.f74784a = nativeCameraCaptureListener;
        this.f74785b = surfaceTexture;
    }
}
