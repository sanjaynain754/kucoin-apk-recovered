package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.ae */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34919ae implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74483a;

    /* JADX INFO: renamed from: b */
    private final GLConstants.GLScaleType f74484b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76596a(C34940u c34940u, GLConstants.GLScaleType gLScaleType) {
        return new RunnableC34919ae(c34940u, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76647a(this.f74483a, this.f74484b);
    }

    private RunnableC34919ae(C34940u c34940u, GLConstants.GLScaleType gLScaleType) {
        this.f74483a = c34940u;
        this.f74484b = gLScaleType;
    }
}
