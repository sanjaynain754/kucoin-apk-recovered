package com.tencent.liteav.txcvodplayer.renderer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.g */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34855g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74089a;

    /* JADX INFO: renamed from: b */
    private final DisplayTarget f74090b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76463a(C34852d c34852d, DisplayTarget displayTarget) {
        return new RunnableC34855g(c34852d, displayTarget);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76447a(this.f74089a, this.f74090b);
    }

    private RunnableC34855g(C34852d c34852d, DisplayTarget displayTarget) {
        this.f74089a = c34852d;
        this.f74090b = displayTarget;
    }
}
