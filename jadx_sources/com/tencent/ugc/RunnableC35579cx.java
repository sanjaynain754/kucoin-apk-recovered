package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cx */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35579cx implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76927a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79075a(TXVideoJoiner tXVideoJoiner) {
        return new RunnableC35579cx(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$startPlay$3(this.f76927a);
    }

    private RunnableC35579cx(TXVideoJoiner tXVideoJoiner) {
        this.f76927a = tXVideoJoiner;
    }
}
