package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cy */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35580cy implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76928a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79076a(TXVideoJoiner tXVideoJoiner) {
        return new RunnableC35580cy(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$pausePlay$4(this.f76928a);
    }

    private RunnableC35580cy(TXVideoJoiner tXVideoJoiner) {
        this.f76928a = tXVideoJoiner;
    }
}
