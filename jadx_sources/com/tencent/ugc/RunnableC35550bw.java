package com.tencent.ugc;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.bw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35550bw implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76859a;

    /* JADX INFO: renamed from: b */
    private final TXVideoEditer.TXThumbnailListener f76860b;

    /* JADX INFO: renamed from: c */
    private final int f76861c;

    /* JADX INFO: renamed from: d */
    private final long f76862d;

    /* JADX INFO: renamed from: e */
    private final Bitmap f76863e;

    /* JADX INFO: renamed from: f */
    private final List f76864f;

    /* JADX INFO: renamed from: g */
    private final UGCThumbnailGenerator f76865g;

    /* JADX INFO: renamed from: a */
    public static Runnable m79049a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener, int i11, long j11, Bitmap bitmap, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new RunnableC35550bw(tXVideoEditer, tXThumbnailListener, i11, j11, bitmap, list, uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$null$63(this.f76859a, this.f76860b, this.f76861c, this.f76862d, this.f76863e, this.f76864f, this.f76865g);
    }

    private RunnableC35550bw(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener, int i11, long j11, Bitmap bitmap, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f76859a = tXVideoEditer;
        this.f76860b = tXThumbnailListener;
        this.f76861c = i11;
        this.f76862d = j11;
        this.f76863e = bitmap;
        this.f76864f = list;
        this.f76865g = uGCThumbnailGenerator;
    }
}
