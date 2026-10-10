package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.aa */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35489aa implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76727a;

    /* JADX INFO: renamed from: b */
    private final int f76728b;

    /* JADX INFO: renamed from: c */
    private final long f76729c;

    /* JADX INFO: renamed from: a */
    public static Runnable m78990a(TXVideoEditer tXVideoEditer, int i11, long j11) {
        return new RunnableC35489aa(tXVideoEditer, i11, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$stopEffect$28(this.f76727a, this.f76728b, this.f76729c);
    }

    private RunnableC35489aa(TXVideoEditer tXVideoEditer, int i11, long j11) {
        this.f76727a = tXVideoEditer;
        this.f76728b = i11;
        this.f76729c = j11;
    }
}
