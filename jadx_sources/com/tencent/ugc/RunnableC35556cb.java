package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cb */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35556cb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354702 f76886a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79055a(TXVideoEditer.C354702 c354702) {
        return new RunnableC35556cb(c354702);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.this.mIsVideoEncoderStarted = true;
    }

    private RunnableC35556cb(TXVideoEditer.C354702 c354702) {
        this.f76886a = c354702;
    }
}
