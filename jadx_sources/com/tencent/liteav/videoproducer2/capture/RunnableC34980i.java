package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.i */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34980i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeScreenCaptureListener f74796a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76779a(NativeScreenCaptureListener nativeScreenCaptureListener) {
        return new RunnableC34980i(nativeScreenCaptureListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74796a.notifyClassNotFound();
    }

    private RunnableC34980i(NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f74796a = nativeScreenCaptureListener;
    }
}
