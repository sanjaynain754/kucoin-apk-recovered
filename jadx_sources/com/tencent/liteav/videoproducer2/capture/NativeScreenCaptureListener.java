package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CustomHandler;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeScreenCaptureListener implements SurfaceTexture.OnFrameAvailableListener {
    private final CustomHandler mCallbackHandler = new CustomHandler(Looper.myLooper());
    private long mNativeHandle;

    private static native void nativeOnCaptureError(long j11);

    private static native void nativeOnClassNotFound(long j11);

    private static native void nativeOnFrameAvailable(long j11, SurfaceTexture surfaceTexture);

    private static native void nativeOnStartFinish(long j11, boolean z11, boolean z12);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyCaptureError() {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeOnCaptureError(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyClassNotFound() {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeOnClassNotFound(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyFrameAvailable(SurfaceTexture surfaceTexture) {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeOnFrameAvailable(j11, surfaceTexture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyStartFinish(boolean z11, boolean z12) {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeOnStartFinish(j11, z11, z12);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }

    public Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    public void onCaptureError() {
        this.mCallbackHandler.runOrPost(RunnableC34979h.m76778a(this));
    }

    public void onClassNotFound() {
        this.mCallbackHandler.runOrPost(RunnableC34980i.m76779a(this));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(RunnableC34977f.m76776a(this, surfaceTexture));
    }

    public void onStartFinish(boolean z11, boolean z12) {
        this.mCallbackHandler.runOrPost(RunnableC34978g.m76777a(this, z11, z12));
    }

    public NativeScreenCaptureListener(long j11) {
        this.mNativeHandle = j11;
    }
}
