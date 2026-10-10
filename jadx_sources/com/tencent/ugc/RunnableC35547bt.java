package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35547bt implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.TXVideoProcessListener f76853a;

    /* JADX INFO: renamed from: b */
    private final float f76854b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79046a(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener, float f11) {
        return new RunnableC35547bt(tXVideoProcessListener, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76853a.onProcessProgress(this.f76854b);
    }

    private RunnableC35547bt(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener, float f11) {
        this.f76853a = tXVideoProcessListener;
        this.f76854b = f11;
    }
}
