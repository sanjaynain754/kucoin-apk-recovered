package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.az */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35514az implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76783a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditConstants.VideoFrameRateLevel f76784b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79015a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        return new RunnableC35514az(tXVideoEditer, videoFrameRateLevel);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoFrameRate$52(this.f76783a, this.f76784b);
    }

    private RunnableC35514az(TXVideoEditer tXVideoEditer, TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        this.f76783a = tXVideoEditer;
        this.f76784b = videoFrameRateLevel;
    }
}
