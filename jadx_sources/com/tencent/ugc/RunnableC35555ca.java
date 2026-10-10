package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ca */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35555ca implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76883a;

    /* JADX INFO: renamed from: b */
    private final int f76884b;

    /* JADX INFO: renamed from: c */
    private final int f76885c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79054a(TXVideoEditer tXVideoEditer, int i11, int i12) {
        return new RunnableC35555ca(tXVideoEditer, i11, i12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBeautyFilter$7(this.f76883a, this.f76884b, this.f76885c);
    }

    private RunnableC35555ca(TXVideoEditer tXVideoEditer, int i11, int i12) {
        this.f76883a = tXVideoEditer;
        this.f76884b = i11;
        this.f76885c = i12;
    }
}
