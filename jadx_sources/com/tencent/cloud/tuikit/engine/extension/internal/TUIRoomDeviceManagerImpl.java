package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public class TUIRoomDeviceManagerImpl extends TUIRoomDeviceManager {
    private final long mNativeDeviceManagerJni;

    private static native void nativeEnableCameraAutoFocus(long j11, boolean z11);

    private static native void nativeEnableCameraTorch(long j11, boolean z11);

    private static native boolean nativeIsAutoFocusEnabled(long j11);

    private static native boolean nativeIsFrontCamera(long j11);

    private static native void nativeSetAudioRoute(long j11, int i11);

    private static native void nativeSwitchCamera(long j11, boolean z11);

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager
    public void enableCameraAutoFocus(boolean z11) {
        long j11 = this.mNativeDeviceManagerJni;
        if (j11 != 0) {
            nativeEnableCameraAutoFocus(j11, z11);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager
    public void enableCameraTorch(boolean z11) {
        long j11 = this.mNativeDeviceManagerJni;
        if (j11 != 0) {
            nativeEnableCameraTorch(j11, z11);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager
    public boolean isAutoFocusEnabled() {
        long j11 = this.mNativeDeviceManagerJni;
        if (j11 != 0) {
            return nativeIsAutoFocusEnabled(j11);
        }
        return false;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager
    public boolean isFrontCamera() {
        long j11 = this.mNativeDeviceManagerJni;
        if (j11 != 0) {
            return nativeIsFrontCamera(j11);
        }
        return false;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager
    public void setAudioRoute(TUIRoomDeviceManager.AudioRoute audioRoute) {
        long j11 = this.mNativeDeviceManagerJni;
        if (j11 != 0) {
            nativeSetAudioRoute(j11, audioRoute.getValue());
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager
    public void switchCamera(boolean z11) {
        long j11 = this.mNativeDeviceManagerJni;
        if (j11 != 0) {
            nativeSwitchCamera(j11, z11);
        }
    }

    public TUIRoomDeviceManagerImpl(long j11) {
        this.mNativeDeviceManagerJni = j11;
    }
}
