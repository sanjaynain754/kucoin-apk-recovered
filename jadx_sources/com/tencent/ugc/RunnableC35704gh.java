package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gh */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35704gh implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354821 f77118a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79198a(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        return new RunnableC35704gh(c354821);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.this.onDecodeCompletedInternal();
    }

    private RunnableC35704gh(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        this.f77118a = c354821;
    }
}
