package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35561cg implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354713 f76894a;

    /* JADX INFO: renamed from: b */
    private final AudioFrame f76895b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79060a(TXVideoEditer.C354713 c354713, AudioFrame audioFrame) {
        return new RunnableC35561cg(c354713, audioFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354713.m78970a(this.f76894a, this.f76895b);
    }

    private RunnableC35561cg(TXVideoEditer.C354713 c354713, AudioFrame audioFrame) {
        this.f76894a = c354713;
        this.f76895b = audioFrame;
    }
}
