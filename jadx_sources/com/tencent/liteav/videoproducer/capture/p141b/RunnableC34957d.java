package com.tencent.liteav.videoproducer.capture.p141b;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34957d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34954a.AnonymousClass4 f74684a;

    /* JADX INFO: renamed from: b */
    private final CaptureRequest f74685b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76734a(C34954a.AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
        return new RunnableC34957d(anonymousClass4, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34954a.AnonymousClass4.m76729a(this.f74684a, this.f74685b);
    }

    private RunnableC34957d(C34954a.AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
        this.f74684a = anonymousClass4;
        this.f74685b = captureRequest;
    }
}
