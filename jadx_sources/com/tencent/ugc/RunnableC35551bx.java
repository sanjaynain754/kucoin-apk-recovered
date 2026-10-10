package com.tencent.ugc;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: renamed from: com.tencent.ugc.bx */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35551bx implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76866a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditConstants.TXPreviewParam f76867b;

    /* JADX INFO: renamed from: c */
    private final DisplayTarget f76868c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79050a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam, DisplayTarget displayTarget) {
        return new RunnableC35551bx(tXVideoEditer, tXPreviewParam, displayTarget);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$null$42(this.f76866a, this.f76867b, this.f76868c);
    }

    private RunnableC35551bx(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam, DisplayTarget displayTarget) {
        this.f76866a = tXVideoEditer;
        this.f76867b = tXPreviewParam;
        this.f76868c = displayTarget;
    }
}
