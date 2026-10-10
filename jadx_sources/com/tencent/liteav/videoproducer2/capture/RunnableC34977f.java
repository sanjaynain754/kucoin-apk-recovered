package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.f */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34977f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeScreenCaptureListener f74790a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f74791b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76776a(NativeScreenCaptureListener nativeScreenCaptureListener, SurfaceTexture surfaceTexture) {
        return new RunnableC34977f(nativeScreenCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74790a.notifyFrameAvailable(this.f74791b);
    }

    private RunnableC34977f(NativeScreenCaptureListener nativeScreenCaptureListener, SurfaceTexture surfaceTexture) {
        this.f74790a = nativeScreenCaptureListener;
        this.f74791b = surfaceTexture;
    }
}
