package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.e */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34976e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeCameraCaptureListener f74788a;

    /* JADX INFO: renamed from: b */
    private final int f74789b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76775a(NativeCameraCaptureListener nativeCameraCaptureListener, int i11) {
        return new RunnableC34976e(nativeCameraCaptureListener, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener.nativeOnCameraError(this.f74788a.mNativeHandle, this.f74789b);
    }

    private RunnableC34976e(NativeCameraCaptureListener nativeCameraCaptureListener, int i11) {
        this.f74788a = nativeCameraCaptureListener;
        this.f74789b = i11;
    }
}
