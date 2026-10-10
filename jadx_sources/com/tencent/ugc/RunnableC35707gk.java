package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gk */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35707gk implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354821 f77122a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79201a(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        return new RunnableC35707gk(c354821);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.C354821.m78979a(this.f77122a);
    }

    private RunnableC35707gk(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        this.f77122a = c354821;
    }
}
