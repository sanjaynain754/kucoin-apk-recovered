package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fy */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35694fy implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77102a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79188a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35694fy(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77102a.stopInternal();
    }

    private RunnableC35694fy(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77102a = uGCSingleFilePixelFrameProvider;
    }
}
