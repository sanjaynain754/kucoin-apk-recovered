package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bl */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35539bl implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76833a;

    /* JADX INFO: renamed from: b */
    private final float f76834b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79038a(TXVideoEditer tXVideoEditer, float f11) {
        return new RunnableC35539bl(tXVideoEditer, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoVolume$62(this.f76833a, this.f76834b);
    }

    private RunnableC35539bl(TXVideoEditer tXVideoEditer, float f11) {
        this.f76833a = tXVideoEditer;
        this.f76834b = f11;
    }
}
