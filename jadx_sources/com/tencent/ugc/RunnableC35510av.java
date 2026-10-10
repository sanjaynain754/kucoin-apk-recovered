package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.av */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35510av implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76774a;

    /* JADX INFO: renamed from: b */
    private final int f76775b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79011a(TXVideoEditer tXVideoEditer, int i11) {
        return new RunnableC35510av(tXVideoEditer, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setProfile$3(this.f76774a, this.f76775b);
    }

    private RunnableC35510av(TXVideoEditer tXVideoEditer, int i11) {
        this.f76774a = tXVideoEditer;
        this.f76775b = i11;
    }
}
