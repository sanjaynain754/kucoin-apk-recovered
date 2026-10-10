package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fu */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35690fu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77098a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79184a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35690fu(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77098a.uninitializeInternal();
    }

    private RunnableC35690fu(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77098a = uGCSingleFilePixelFrameProvider;
    }
}
