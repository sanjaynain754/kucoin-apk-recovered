package com.tencent.liteav.txcvodplayer.renderer;

import com.tencent.liteav.base.util.EnumC34747l;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.j */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34858j implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74096a;

    /* JADX INFO: renamed from: b */
    private final EnumC34747l f74097b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76466a(C34852d c34852d, EnumC34747l enumC34747l) {
        return new RunnableC34858j(c34852d, enumC34747l);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76445a(this.f74096a, this.f74097b);
    }

    private RunnableC34858j(C34852d c34852d, EnumC34747l enumC34747l) {
        this.f74096a = c34852d;
        this.f74097b = enumC34747l;
    }
}
