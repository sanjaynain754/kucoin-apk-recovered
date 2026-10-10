package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ci */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35563ci implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354724 f76897a;

    /* JADX INFO: renamed from: b */
    private final long f76898b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79062a(TXVideoEditer.C354724 c354724, long j11) {
        return new RunnableC35563ci(c354724, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354724.m78972a(this.f76897a, this.f76898b);
    }

    private RunnableC35563ci(TXVideoEditer.C354724 c354724, long j11) {
        this.f76897a = c354724;
        this.f76898b = j11;
    }
}
