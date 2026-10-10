package com.tencent.ugc.videobase.egl;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.egl.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35814a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final EGLCore f77356a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79300a(EGLCore eGLCore) {
        return new RunnableC35814a(eGLCore);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EGLCore.lambda$destroy$0(this.f77356a);
    }

    private RunnableC35814a(EGLCore eGLCore) {
        this.f77356a = eGLCore;
    }
}
