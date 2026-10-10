package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gi */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35705gi implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354821 f77119a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79199a(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        return new RunnableC35705gi(c354821);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.C354821.m78982b(this.f77119a);
    }

    private RunnableC35705gi(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        this.f77119a = c354821;
    }
}
