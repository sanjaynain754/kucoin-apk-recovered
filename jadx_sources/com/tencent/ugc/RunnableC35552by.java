package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.by */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35552by implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76869a;

    /* JADX INFO: renamed from: b */
    private final UGCThumbnailGenerator f76870b;

    /* JADX INFO: renamed from: c */
    private final boolean f76871c;

    /* JADX INFO: renamed from: d */
    private final int f76872d;

    /* JADX INFO: renamed from: e */
    private final long f76873e;

    /* JADX INFO: renamed from: f */
    private final Bitmap f76874f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79051a(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z11, int i11, long j11, Bitmap bitmap) {
        return new RunnableC35552by(tXVideoEditer, uGCThumbnailGenerator, z11, i11, j11, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76869a.handleThumbnailGeneratedDuringProcessing(this.f76870b, this.f76871c, this.f76872d, this.f76873e, this.f76874f);
    }

    private RunnableC35552by(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z11, int i11, long j11, Bitmap bitmap) {
        this.f76869a = tXVideoEditer;
        this.f76870b = uGCThumbnailGenerator;
        this.f76871c = z11;
        this.f76872d = i11;
        this.f76873e = j11;
        this.f76874f = bitmap;
    }
}
