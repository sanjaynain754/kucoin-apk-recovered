package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dc */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35585dc implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76934a;

    /* JADX INFO: renamed from: b */
    private final int f76935b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79081a(TXVideoJoiner tXVideoJoiner, int i11) {
        return new RunnableC35585dc(tXVideoJoiner, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76934a.mProfile = this.f76935b;
    }

    private RunnableC35585dc(TXVideoJoiner tXVideoJoiner, int i11) {
        this.f76934a = tXVideoJoiner;
        this.f76935b = i11;
    }
}
