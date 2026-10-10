package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ba */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35516ba implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76786a;

    /* JADX INFO: renamed from: b */
    private final int f76787b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79017a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35516ba(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setAudioBitrate$53(this.f76786a, this.f76787b);
    }

    private RunnableC35516ba(TXVideoEditer tXVideoEditer, int i11) {
        this.f76786a = tXVideoEditer;
        this.f76787b = i11;
    }
}
