package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.g */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35696g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77106a;

    /* JADX INFO: renamed from: b */
    private final String f77107b;

    /* JADX INFO: renamed from: c */
    private final boolean f77108c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79190a(TXVideoEditer tXVideoEditer, String str, boolean z11) {
        return new RunnableC35696g(tXVideoEditer, str, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGM$10(this.f77106a, this.f77107b, this.f77108c);
    }

    private RunnableC35696g(TXVideoEditer tXVideoEditer, String str, boolean z11) {
        this.f77106a = tXVideoEditer;
        this.f77107b = str;
        this.f77108c = z11;
    }
}
