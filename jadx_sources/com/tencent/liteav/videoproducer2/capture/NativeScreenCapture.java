package com.tencent.liteav.videoproducer2.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.video.ScreenCaptureService;
import com.tencent.rtmp.video.VirtualDisplayManagerProxy;
import com.tencent.rtmp.video.VirtualDisplayWrapper;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeScreenCapture {
    private static final String TAG = "NativeScreenCapture";
    static boolean sIsCaptureClassExist;
    static boolean sIsCheck;
    private NativeScreenCaptureListener mListener;
    private MediaProjection mMediaProjection;
    private C34981j mScreenCaptureBridge;
    private Surface mSurface;

    private static boolean checkIfScreenCaptureClassExist() {
        boolean z11;
        if (sIsCheck) {
            return sIsCaptureClassExist;
        }
        try {
            int i11 = ScreenCaptureService.f75437b;
            try {
                LiteavLog.m76087i(TAG, "Detect screen capture class!");
                z11 = true;
            } catch (ClassNotFoundException unused) {
                z11 = true;
                LiteavLog.m76083e(TAG, "Detect screen capture class failed!");
            }
        } catch (ClassNotFoundException unused2) {
            z11 = false;
        }
        sIsCaptureClassExist = z11;
        sIsCheck = true;
        return z11;
    }

    public NativeScreenCapture(Surface surface, MediaProjection mediaProjection, NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.mSurface = surface;
        this.mMediaProjection = mediaProjection;
        this.mListener = nativeScreenCaptureListener;
    }

    public void startVirtualDisplaySync(int i11, int i12) {
        if (!checkIfScreenCaptureClassExist()) {
            this.mListener.onClassNotFound();
            return;
        }
        if (this.mScreenCaptureBridge == null) {
            this.mScreenCaptureBridge = new C34981j(this.mSurface, i11, i12, this.mMediaProjection, this.mListener);
        }
        C34981j c34981j = this.mScreenCaptureBridge;
        VirtualDisplayManagerProxy.getInstance().startVirtualDisplaySync(c34981j.f74798a, c34981j.f74800c, c34981j.f74801d, c34981j.f74799b, c34981j.f74803f);
    }

    public void stopVirtualDisplaySync() {
        if (!checkIfScreenCaptureClassExist()) {
            this.mListener.onClassNotFound();
            return;
        }
        C34981j c34981j = this.mScreenCaptureBridge;
        if (c34981j != null) {
            VirtualDisplayWrapper virtualDisplayWrapper = c34981j.f74802e;
            if (virtualDisplayWrapper != null) {
                virtualDisplayWrapper.release();
                c34981j.f74802e = null;
            }
            VirtualDisplayManagerProxy.getInstance().stopVirtualDisplaySync(c34981j.f74798a);
            this.mScreenCaptureBridge = null;
        }
    }

    public void updateVirtualDisplaySync(int i11, int i12, boolean z11) {
        if (!checkIfScreenCaptureClassExist()) {
            this.mListener.onClassNotFound();
            return;
        }
        C34981j c34981j = this.mScreenCaptureBridge;
        if (c34981j == null) {
            LiteavLog.m76083e(TAG, "Must start first!");
            return;
        }
        c34981j.f74800c = i11;
        c34981j.f74801d = i12;
        LiteavLog.m76087i("ScreenCaptureBridge", "updateVirtualDisplaySync:[wxh:" + i11 + "x" + i12 + "|restart:" + z11 + "]");
        VirtualDisplayWrapper virtualDisplayWrapper = c34981j.f74802e;
        if (virtualDisplayWrapper != null && !z11) {
            virtualDisplayWrapper.resize(i11, i12);
            return;
        }
        if (virtualDisplayWrapper != null) {
            virtualDisplayWrapper.release();
            c34981j.f74802e = null;
        }
        VirtualDisplayManagerProxy.getInstance().updateVirtualDisplaySizeSync(c34981j.f74798a, c34981j.f74800c, c34981j.f74801d, c34981j.f74803f);
    }
}
