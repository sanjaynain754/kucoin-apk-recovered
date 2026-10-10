package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bi */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35536bi implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76828a;

    /* JADX INFO: renamed from: b */
    private final boolean f76829b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79035a(TXVideoEditer tXVideoEditer, boolean z11) {
        return new RunnableC35536bi(tXVideoEditer, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76828a.mIsFullIFrame = this.f76829b;
    }

    private RunnableC35536bi(TXVideoEditer tXVideoEditer, boolean z11) {
        this.f76828a = tXVideoEditer;
        this.f76829b = z11;
    }
}
