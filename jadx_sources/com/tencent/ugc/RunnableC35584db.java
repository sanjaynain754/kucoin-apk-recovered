package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.db */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35584db implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76932a;

    /* JADX INFO: renamed from: b */
    private final TXVideoJoiner.TXVideoJoinerListener f76933b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79080a(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoJoinerListener tXVideoJoinerListener) {
        return new RunnableC35584db(tXVideoJoiner, tXVideoJoinerListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76932a.mTXVideoJoinerListener = this.f76933b;
    }

    private RunnableC35584db(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoJoinerListener tXVideoJoinerListener) {
        this.f76932a = tXVideoJoiner;
        this.f76933b = tXVideoJoinerListener;
    }
}
