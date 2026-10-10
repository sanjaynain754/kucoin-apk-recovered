package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.ad */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34918ad implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74480a;

    /* JADX INFO: renamed from: b */
    private final DisplayTarget f74481b;

    /* JADX INFO: renamed from: c */
    private final boolean f74482c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76595a(C34940u c34940u, DisplayTarget displayTarget, boolean z11) {
        return new RunnableC34918ad(c34940u, displayTarget, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74480a.m76656b(this.f74481b, this.f74482c);
    }

    private RunnableC34918ad(C34940u c34940u, DisplayTarget displayTarget, boolean z11) {
        this.f74480a = c34940u;
        this.f74481b = displayTarget;
        this.f74482c = z11;
    }
}
