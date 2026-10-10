package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.h */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34979h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeScreenCaptureListener f74795a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76778a(NativeScreenCaptureListener nativeScreenCaptureListener) {
        return new RunnableC34979h(nativeScreenCaptureListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74795a.notifyCaptureError();
    }

    private RunnableC34979h(NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f74795a = nativeScreenCaptureListener;
    }
}
