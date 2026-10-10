package com.tencent.liteav.txcvodplayer.renderer;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.i */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34857i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74094a;

    /* JADX INFO: renamed from: b */
    private final GLConstants.GLScaleType f74095b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76465a(C34852d c34852d, GLConstants.GLScaleType gLScaleType) {
        return new RunnableC34857i(c34852d, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76446a(this.f74094a, this.f74095b);
    }

    private RunnableC34857i(C34852d c34852d, GLConstants.GLScaleType gLScaleType) {
        this.f74094a = c34852d;
        this.f74095b = gLScaleType;
    }
}
