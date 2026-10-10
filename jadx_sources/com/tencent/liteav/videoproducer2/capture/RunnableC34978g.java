package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.g */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34978g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final NativeScreenCaptureListener f74792a;

    /* JADX INFO: renamed from: b */
    private final boolean f74793b;

    /* JADX INFO: renamed from: c */
    private final boolean f74794c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76777a(NativeScreenCaptureListener nativeScreenCaptureListener, boolean z11, boolean z12) {
        return new RunnableC34978g(nativeScreenCaptureListener, z11, z12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74792a.notifyStartFinish(this.f74793b, this.f74794c);
    }

    private RunnableC34978g(NativeScreenCaptureListener nativeScreenCaptureListener, boolean z11, boolean z12) {
        this.f74792a = nativeScreenCaptureListener;
        this.f74793b = z11;
        this.f74794c = z12;
    }
}
