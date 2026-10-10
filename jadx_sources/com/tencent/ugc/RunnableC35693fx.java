package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fx */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35693fx implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77101a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79187a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35693fx(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77101a.startInternal();
    }

    private RunnableC35693fx(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77101a = uGCSingleFilePixelFrameProvider;
    }
}
