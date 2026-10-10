package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bs */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35546bs implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76851a;

    /* JADX INFO: renamed from: b */
    private final int f76852b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79045a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35546bs(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76851a.handleProcessComplete(this.f76852b);
    }

    private RunnableC35546bs(TXVideoEditer tXVideoEditer, int i11) {
        this.f76851a = tXVideoEditer;
        this.f76852b = i11;
    }
}
