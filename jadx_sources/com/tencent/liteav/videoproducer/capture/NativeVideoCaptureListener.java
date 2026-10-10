package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.C34908e;
import com.tencent.liteav.videobase.videobase.EnumC34909f;
import com.tencent.liteav.videobase.videobase.InterfaceC34906c;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
class NativeVideoCaptureListener implements InterfaceC34906c, CaptureSourceInterface.CaptureSourceListener {
    private static final String TAG = "NativeVideoCaptureListener";
    private long mNativeHandler;

    private static native void nativeOnAutoFocusEnabled(long j11, boolean z11);

    private static native void nativeOnCaptureError(long j11, int i11, String str);

    private static native void nativeOnCaptureFirstFrame(long j11);

    private static native void nativeOnCapturePaused(long j11);

    private static native void nativeOnCaptureResumed(long j11);

    private static native void nativeOnCaptureStopped(long j11);

    private static native void nativeOnFrameAvailable(long j11, PixelFrame pixelFrame);

    private static native void nativeOnScreenDisplayOrientationChanged(long j11, int i11);

    private static native void nativeOnStartFinish(long j11, boolean z11);

    private static native void nativeOnZoomEnabled(long j11, boolean z11);

    public synchronized void notifyError(C34908e.a aVar, String str) {
        if (this.mNativeHandler == 0) {
            return;
        }
        int iM76567a = C34908e.m76567a(aVar);
        if (iM76567a != 0) {
            nativeOnCaptureError(this.mNativeHandler, iM76567a, str);
            return;
        }
        LiteavLog.m76087i(TAG, "notifyError error code:" + aVar + ", do not need transfer to LiteAvCode:" + iM76567a);
    }

    public void notifyEvent(C34908e.b bVar, int i11, String str) {
    }

    @Override // com.tencent.liteav.videobase.videobase.InterfaceC34906c
    public synchronized void notifyWarning(C34908e.c cVar, String str) {
    }

    public synchronized void onCameraTouchEnable(boolean z11) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnAutoFocusEnabled(j11, !z11);
        }
    }

    public synchronized void onCameraZoomEnable(boolean z11) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnZoomEnabled(j11, z11);
        }
    }

    public synchronized void onCaptureError() {
    }

    public synchronized void onCaptureFirstFrame() {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnCaptureFirstFrame(j11);
        }
    }

    public synchronized void onFrameAvailable(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnFrameAvailable(j11, pixelFrame);
        }
    }

    public synchronized void onScreenDisplayOrientationChanged(EnumC34747l enumC34747l) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnScreenDisplayOrientationChanged(j11, EnumC34747l.m76130a(enumC34747l));
        }
    }

    public synchronized void onStartFinish(boolean z11) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnStartFinish(j11, z11);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }

    @Override // com.tencent.liteav.videobase.videobase.InterfaceC34906c
    public synchronized void updateStatus(EnumC34909f enumC34909f, Object obj) {
    }

    @Override // com.tencent.liteav.videobase.videobase.InterfaceC34906c
    public synchronized void notifyEvent(C34908e.b bVar, Object obj, String str) {
        long j11 = this.mNativeHandler;
        if (j11 == 0) {
            return;
        }
        if (bVar == C34908e.b.EVT_VIDEO_CAPTURE_FIRST_FRAME) {
            nativeOnCaptureFirstFrame(j11);
            return;
        }
        if (bVar == C34908e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED) {
            nativeOnCapturePaused(j11);
        } else if (bVar == C34908e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME) {
            nativeOnCaptureResumed(j11);
        } else {
            if (bVar == C34908e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS) {
                nativeOnCaptureStopped(j11);
            }
        }
    }

    @Override // com.tencent.liteav.videobase.videobase.InterfaceC34906c
    public synchronized void updateStatus(EnumC34909f enumC34909f, int i11, Object obj) {
    }

    public NativeVideoCaptureListener(long j11) {
        this.mNativeHandler = j11;
    }
}
