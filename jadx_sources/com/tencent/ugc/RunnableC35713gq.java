package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35713gq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCThumbnailGenerator f77131a;

    /* JADX INFO: renamed from: b */
    private final UGCThumbnailGenerator.UGCThumbnailGenerateParams f77132b;

    /* JADX INFO: renamed from: c */
    private final TXVideoEditer.TXThumbnailListener f77133c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79207a(UGCThumbnailGenerator uGCThumbnailGenerator, UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new RunnableC35713gq(uGCThumbnailGenerator, uGCThumbnailGenerateParams, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$start$3(this.f77131a, this.f77132b, this.f77133c);
    }

    private RunnableC35713gq(UGCThumbnailGenerator uGCThumbnailGenerator, UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f77131a = uGCThumbnailGenerator;
        this.f77132b = uGCThumbnailGenerateParams;
        this.f77133c = tXThumbnailListener;
    }
}
