package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34922c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34921b f74491a;

    /* JADX INFO: renamed from: b */
    private final Surface f74492b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76601a(C34921b c34921b, Surface surface) {
        return new RunnableC34922c(c34921b, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34921b.m76599a(this.f74491a, this.f74492b);
    }

    private RunnableC34922c(C34921b c34921b, Surface surface) {
        this.f74491a = c34921b;
        this.f74492b = surface;
    }
}
