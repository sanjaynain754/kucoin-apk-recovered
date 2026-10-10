package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeCameraCaptureListener implements SurfaceTexture.OnFrameAvailableListener, CameraEventCallback {
    private final CustomHandler mCallbackHandler = new CustomHandler(Looper.myLooper());
    private long mNativeHandle;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnCameraError(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFrameAvailable(long j11, SurfaceTexture surfaceTexture);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void runInNative(Runnable runnable) {
        if (this.mNativeHandle != 0) {
            runnable.run();
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }

    public Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraEventCallback
    public void onCameraError(CameraControllerInterface cameraControllerInterface, int i11) {
        this.mCallbackHandler.runOrPost(RunnableC34973b.m76772a(this, i11));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(RunnableC34974c.m76773a(this, surfaceTexture));
    }

    public NativeCameraCaptureListener(long j11) {
        this.mNativeHandle = j11;
    }
}
