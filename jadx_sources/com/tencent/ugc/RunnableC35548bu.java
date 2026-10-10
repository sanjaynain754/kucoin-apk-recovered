package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bu */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35548bu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.TXVideoGenerateListener f76855a;

    /* JADX INFO: renamed from: b */
    private final float f76856b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79047a(TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener, float f11) {
        return new RunnableC35548bu(tXVideoGenerateListener, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76855a.onGenerateProgress(this.f76856b);
    }

    private RunnableC35548bu(TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener, float f11) {
        this.f76855a = tXVideoGenerateListener;
        this.f76856b = f11;
    }
}
