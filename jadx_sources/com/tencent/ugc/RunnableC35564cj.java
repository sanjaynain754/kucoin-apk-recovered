package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35564cj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354735 f76899a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79063a(TXVideoEditer.C354735 c354735) {
        return new RunnableC35564cj(c354735);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.this.mIsDecodeError = true;
    }

    private RunnableC35564cj(TXVideoEditer.C354735 c354735) {
        this.f76899a = c354735;
    }
}
