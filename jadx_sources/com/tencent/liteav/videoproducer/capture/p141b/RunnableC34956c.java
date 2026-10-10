package com.tencent.liteav.videoproducer.capture.p141b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34956c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34954a.AnonymousClass4 f74681a;

    /* JADX INFO: renamed from: b */
    private final TotalCaptureResult f74682b;

    /* JADX INFO: renamed from: c */
    private final CaptureRequest f74683c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76733a(C34954a.AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
        return new RunnableC34956c(anonymousClass4, totalCaptureResult, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34954a.AnonymousClass4.m76730a(this.f74681a, this.f74682b, this.f74683c);
    }

    private RunnableC34956c(C34954a.AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
        this.f74681a = anonymousClass4;
        this.f74682b = totalCaptureResult;
        this.f74683c = captureRequest;
    }
}
