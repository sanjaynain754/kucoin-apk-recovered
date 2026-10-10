package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.rtmp.p148ui.AndroidViewEventListener;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeAndroidViewEventListener implements AndroidViewEventListener {
    private long mNativeHandler;

    private static native void nativeOnTap(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeOnZoom(long j11, float f11);

    private static native void nativeonSizeChanged(long j11, int i11, int i12, int i13, int i14);

    @Override // com.tencent.rtmp.p148ui.AndroidViewEventListener
    public synchronized void onSizeChanged(int i11, int i12, int i13, int i14) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeonSizeChanged(j11, i11, i12, i13, i14);
        }
    }

    @Override // com.tencent.rtmp.p148ui.AndroidViewEventListener
    public synchronized void onTap(int i11, int i12, int i13, int i14) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnTap(j11, i11, i12, i13, i14);
        }
    }

    @Override // com.tencent.rtmp.p148ui.AndroidViewEventListener
    public synchronized void onZoom(float f11) {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnZoom(j11, f11);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }

    public NativeAndroidViewEventListener(long j11) {
        this.mNativeHandler = j11;
    }
}
