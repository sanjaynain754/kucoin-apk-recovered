package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.y */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34944y implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74587a;

    /* JADX INFO: renamed from: b */
    private final Surface f74588b;

    /* JADX INFO: renamed from: c */
    private final boolean f74589c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76667a(C34940u c34940u, Surface surface, boolean z11) {
        return new RunnableC34944y(c34940u, surface, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76645a(this.f74587a, this.f74588b, this.f74589c);
    }

    private RunnableC34944y(C34940u c34940u, Surface surface, boolean z11) {
        this.f74587a = c34940u;
        this.f74588b = surface;
        this.f74589c = z11;
    }
}
