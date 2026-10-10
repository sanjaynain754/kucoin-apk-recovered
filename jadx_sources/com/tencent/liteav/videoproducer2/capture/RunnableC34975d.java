package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34975d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeCameraCaptureListener f74786a;

    /* JADX INFO: renamed from: b */
    private final SurfaceTexture f74787b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76774a(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        return new RunnableC34975d(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener.nativeOnFrameAvailable(this.f74786a.mNativeHandle, this.f74787b);
    }

    private RunnableC34975d(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        this.f74786a = nativeCameraCaptureListener;
        this.f74787b = surfaceTexture;
    }
}
