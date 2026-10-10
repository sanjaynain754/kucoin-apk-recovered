package com.tencent.liteav.videoconsumer.consumer;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.InterfaceC34867a;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeSnapshotListener implements InterfaceC34867a {
    private long mNativeVideoSnapListener;

    private native void nativeDestroy(long j11);

    private native void nativeOnComplete(long j11, Bitmap bitmap);

    public void finalize() throws Throwable {
        long j11 = this.mNativeVideoSnapListener;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeVideoSnapListener = 0L;
        }
        super.finalize();
    }

    @Override // com.tencent.liteav.videobase.base.InterfaceC34867a
    public void onComplete(Bitmap bitmap) {
        long j11 = this.mNativeVideoSnapListener;
        if (j11 != 0) {
            nativeOnComplete(j11, bitmap);
            this.mNativeVideoSnapListener = 0L;
        }
    }

    private NativeSnapshotListener(long j11) {
        this.mNativeVideoSnapListener = j11;
    }
}
