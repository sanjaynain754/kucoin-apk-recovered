package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bn */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35541bn implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76839a;

    /* JADX INFO: renamed from: b */
    private final int f76840b;

    /* JADX INFO: renamed from: c */
    private final long f76841c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79040a(TXVideoEditer tXVideoEditer, int i11, long j11) {
        return new RunnableC35541bn(tXVideoEditer, i11, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$handleWriteMP4Completed$65(this.f76839a, this.f76840b, this.f76841c);
    }

    private RunnableC35541bn(TXVideoEditer tXVideoEditer, int i11, long j11) {
        this.f76839a = tXVideoEditer;
        this.f76840b = i11;
        this.f76841c = j11;
    }
}
