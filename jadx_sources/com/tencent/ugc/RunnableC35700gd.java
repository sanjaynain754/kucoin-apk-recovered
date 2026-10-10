package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gd */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35700gd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77113a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79194a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35700gd(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77113a.onDecodeCompletedInternal();
    }

    private RunnableC35700gd(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77113a = uGCSingleFilePixelFrameProvider;
    }
}
