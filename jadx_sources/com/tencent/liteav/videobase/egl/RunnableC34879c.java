package com.tencent.liteav.videobase.egl;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.egl.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34879c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final EGLCore f74237a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76510a(EGLCore eGLCore) {
        return new RunnableC34879c(eGLCore);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EGLCore.lambda$destroyAsync$0(this.f74237a);
    }

    private RunnableC34879c(EGLCore eGLCore) {
        this.f74237a = eGLCore;
    }
}
