package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.h */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34856h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34852d f74091a;

    /* JADX INFO: renamed from: b */
    private final int f74092b;

    /* JADX INFO: renamed from: c */
    private final int f74093c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76464a(C34852d c34852d, int i11, int i12) {
        return new RunnableC34856h(c34852d, i11, i12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34852d.m76443a(this.f74091a, this.f74092b, this.f74093c);
    }

    private RunnableC34856h(C34852d c34852d, int i11, int i12) {
        this.f74091a = c34852d;
        this.f74092b = i11;
        this.f74093c = i12;
    }
}
