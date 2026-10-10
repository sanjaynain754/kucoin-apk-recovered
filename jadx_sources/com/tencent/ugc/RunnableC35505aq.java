package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.aq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35505aq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76767a;

    /* JADX INFO: renamed from: b */
    private final long f76768b;

    /* JADX INFO: renamed from: c */
    private final long f76769c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79006a(TXVideoEditer tXVideoEditer, long j11, long j12) {
        return new RunnableC35505aq(tXVideoEditer, j11, j12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$startPlayFromTime$44(this.f76767a, this.f76768b, this.f76769c);
    }

    private RunnableC35505aq(TXVideoEditer tXVideoEditer, long j11, long j12) {
        this.f76767a = tXVideoEditer;
        this.f76768b = j11;
        this.f76769c = j12;
    }
}
