package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cp */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35571cp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76912a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79067a(TXVideoJoiner tXVideoJoiner) {
        return new RunnableC35571cp(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$cancel$10(this.f76912a);
    }

    private RunnableC35571cp(TXVideoJoiner tXVideoJoiner) {
        this.f76912a = tXVideoJoiner;
    }
}
