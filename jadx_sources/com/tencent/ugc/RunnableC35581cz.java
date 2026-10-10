package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cz */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35581cz implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76929a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79077a(TXVideoJoiner tXVideoJoiner) {
        return new RunnableC35581cz(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$resumePlay$5(this.f76929a);
    }

    private RunnableC35581cz(TXVideoJoiner tXVideoJoiner) {
        this.f76929a = tXVideoJoiner;
    }
}
