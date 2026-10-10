package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.al */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35500al implements TXVideoEditer.TXThumbnailListener {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76754a;

    /* JADX INFO: renamed from: b */
    private final UGCThumbnailGenerator f76755b;

    /* JADX INFO: renamed from: c */
    private final boolean f76756c;

    /* JADX INFO: renamed from: a */
    public static TXVideoEditer.TXThumbnailListener m79001a(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z11) {
        return new C35500al(tXVideoEditer, uGCThumbnailGenerator, z11);
    }

    @Override // com.tencent.ugc.TXVideoEditer.TXThumbnailListener
    public final void onThumbnail(int i11, long j11, Bitmap bitmap) {
        TXVideoEditer tXVideoEditer = this.f76754a;
        tXVideoEditer.mSequenceTaskRunner.mo76133a(RunnableC35552by.m79051a(tXVideoEditer, this.f76755b, this.f76756c, i11, j11, bitmap));
    }

    private C35500al(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z11) {
        this.f76754a = tXVideoEditer;
        this.f76755b = uGCThumbnailGenerator;
        this.f76756c = z11;
    }
}
