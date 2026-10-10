package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.am */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35501am implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76757a;

    /* JADX INFO: renamed from: b */
    private final int f76758b;

    /* JADX INFO: renamed from: c */
    private final long f76759c;

    /* JADX INFO: renamed from: d */
    private final int f76760d;

    /* JADX INFO: renamed from: e */
    private final TXVideoEditer.TXVideoProcessListener f76761e;

    /* JADX INFO: renamed from: a */
    public static Runnable m79002a(TXVideoEditer tXVideoEditer, int i11, long j11, int i12, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        return new RunnableC35501am(tXVideoEditer, i11, j11, i12, tXVideoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer tXVideoEditer = this.f76757a;
        int i11 = this.f76758b;
        this.f76761e.onProcessProgress(i11 == 0 ? tXVideoEditer.calculateProgress(this.f76759c) : (this.f76760d * 1.0f) / i11);
    }

    private RunnableC35501am(TXVideoEditer tXVideoEditer, int i11, long j11, int i12, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        this.f76757a = tXVideoEditer;
        this.f76758b = i11;
        this.f76759c = j11;
        this.f76760d = i12;
        this.f76761e = tXVideoProcessListener;
    }
}
