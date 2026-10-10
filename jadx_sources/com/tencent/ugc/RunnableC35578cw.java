package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35578cw implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76925a;

    /* JADX INFO: renamed from: b */
    private final TXVideoJoiner.TXVideoPreviewListener f76926b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79074a(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoPreviewListener tXVideoPreviewListener) {
        return new RunnableC35578cw(tXVideoJoiner, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76925a.mTXVideoPreviewListener = this.f76926b;
    }

    private RunnableC35578cw(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f76925a = tXVideoJoiner;
        this.f76926b = tXVideoPreviewListener;
    }
}
