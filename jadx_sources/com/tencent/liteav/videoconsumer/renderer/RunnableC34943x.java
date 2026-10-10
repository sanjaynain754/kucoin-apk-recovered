package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.base.InterfaceC34867a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.x */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34943x implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74581a;

    /* JADX INFO: renamed from: b */
    private final RenderViewHelperInterface f74582b;

    /* JADX INFO: renamed from: c */
    private final ByteBuffer f74583c;

    /* JADX INFO: renamed from: d */
    private final int f74584d;

    /* JADX INFO: renamed from: e */
    private final int f74585e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC34867a f74586f;

    /* JADX INFO: renamed from: a */
    public static Runnable m76666a(C34940u c34940u, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i11, int i12, InterfaceC34867a interfaceC34867a) {
        return new RunnableC34943x(c34940u, renderViewHelperInterface, byteBuffer, i11, i12, interfaceC34867a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76649a(this.f74581a, this.f74582b, this.f74583c, this.f74584d, this.f74585e, this.f74586f);
    }

    private RunnableC34943x(C34940u c34940u, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i11, int i12, InterfaceC34867a interfaceC34867a) {
        this.f74581a = c34940u;
        this.f74582b = renderViewHelperInterface;
        this.f74583c = byteBuffer;
        this.f74584d = i11;
        this.f74585e = i12;
        this.f74586f = interfaceC34867a;
    }
}
