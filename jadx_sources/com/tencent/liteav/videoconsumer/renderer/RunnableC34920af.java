package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.EnumC34747l;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.af */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34920af implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74485a;

    /* JADX INFO: renamed from: b */
    private final EnumC34747l f74486b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76597a(C34940u c34940u, EnumC34747l enumC34747l) {
        return new RunnableC34920af(c34940u, enumC34747l);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76646a(this.f74485a, this.f74486b);
    }

    private RunnableC34920af(C34940u c34940u, EnumC34747l enumC34747l) {
        this.f74485a = c34940u;
        this.f74486b = enumC34747l;
    }
}
