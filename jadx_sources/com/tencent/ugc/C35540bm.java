package com.tencent.ugc;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.bm */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35540bm implements TXVideoEditer.TXThumbnailListener {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76835a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXThumbnailListener f76836b;

    /* JADX INFO: renamed from: c */
    private final List f76837c;

    /* JADX INFO: renamed from: d */
    private final UGCThumbnailGenerator f76838d;

    /* JADX INFO: renamed from: a */
    public static TXVideoEditer.TXThumbnailListener m79039a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new C35540bm(tXVideoEditer, tXThumbnailListener, list, uGCThumbnailGenerator);
    }

    @Override // com.tencent.ugc.TXVideoEditer.TXThumbnailListener
    public final void onThumbnail(int i11, long j11, Bitmap bitmap) {
        TXVideoEditer tXVideoEditer = this.f76835a;
        tXVideoEditer.mSequenceTaskRunner.mo76133a(RunnableC35550bw.m79049a(tXVideoEditer, this.f76836b, i11, j11, bitmap, this.f76837c, this.f76838d));
    }

    private C35540bm(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f76835a = tXVideoEditer;
        this.f76836b = tXThumbnailListener;
        this.f76837c = list;
        this.f76838d = uGCThumbnailGenerator;
    }
}
