package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cu */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35576cu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76922a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79072a(TXVideoJoiner tXVideoJoiner) {
        return new RunnableC35576cu(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$notifyJoinComplete$15(this.f76922a);
    }

    private RunnableC35576cu(TXVideoJoiner tXVideoJoiner) {
        this.f76922a = tXVideoJoiner;
    }
}
