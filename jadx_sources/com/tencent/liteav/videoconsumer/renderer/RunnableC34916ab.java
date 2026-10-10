package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import com.tencent.liteav.videobase.base.InterfaceC34867a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.ab */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34916ab implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34940u f74472a;

    /* JADX INFO: renamed from: b */
    private final ByteBuffer f74473b;

    /* JADX INFO: renamed from: c */
    private final int f74474c;

    /* JADX INFO: renamed from: d */
    private final int f74475d;

    /* JADX INFO: renamed from: e */
    private final Matrix f74476e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC34867a f74477f;

    /* JADX INFO: renamed from: a */
    public static Runnable m76593a(C34940u c34940u, ByteBuffer byteBuffer, int i11, int i12, Matrix matrix, InterfaceC34867a interfaceC34867a) {
        return new RunnableC34916ab(c34940u, byteBuffer, i11, i12, matrix, interfaceC34867a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34940u.m76651a(this.f74472a, this.f74473b, this.f74474c, this.f74475d, this.f74476e, this.f74477f);
    }

    private RunnableC34916ab(C34940u c34940u, ByteBuffer byteBuffer, int i11, int i12, Matrix matrix, InterfaceC34867a interfaceC34867a) {
        this.f74472a = c34940u;
        this.f74473b = byteBuffer;
        this.f74474c = i11;
        this.f74475d = i12;
        this.f74476e = matrix;
        this.f74477f = interfaceC34867a;
    }
}
