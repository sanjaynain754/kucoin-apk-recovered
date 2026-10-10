package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cv */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35577cv implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76923a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditConstants.TXPreviewParam f76924b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79073a(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        return new RunnableC35577cv(tXVideoJoiner, tXPreviewParam);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$initWithPreview$1(this.f76923a, this.f76924b);
    }

    private RunnableC35577cv(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        this.f76923a = tXVideoJoiner;
        this.f76924b = tXPreviewParam;
    }
}
