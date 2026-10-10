package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34973b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeCameraCaptureListener f74782a;

    /* JADX INFO: renamed from: b */
    private final int f74783b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76772a(NativeCameraCaptureListener nativeCameraCaptureListener, int i11) {
        return new RunnableC34973b(nativeCameraCaptureListener, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener nativeCameraCaptureListener = this.f74782a;
        nativeCameraCaptureListener.runInNative(RunnableC34976e.m76775a(nativeCameraCaptureListener, this.f74783b));
    }

    private RunnableC34973b(NativeCameraCaptureListener nativeCameraCaptureListener, int i11) {
        this.f74782a = nativeCameraCaptureListener;
        this.f74783b = i11;
    }
}
