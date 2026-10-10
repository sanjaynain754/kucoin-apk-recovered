package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.af */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35494af implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76740a;

    /* JADX INFO: renamed from: b */
    private final int f76741b;

    /* JADX INFO: renamed from: c */
    private final int f76742c;

    /* JADX INFO: renamed from: d */
    private final boolean f76743d;

    /* JADX INFO: renamed from: e */
    private final int f76744e;

    /* JADX INFO: renamed from: f */
    private final TXVideoEditer.TXThumbnailListener f76745f;

    /* JADX INFO: renamed from: a */
    public static Runnable m78995a(TXVideoEditer tXVideoEditer, int i11, int i12, boolean z11, int i13, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new RunnableC35494af(tXVideoEditer, i11, i12, z11, i13, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$getThumbnail$33(this.f76740a, this.f76741b, this.f76742c, this.f76743d, this.f76744e, this.f76745f);
    }

    private RunnableC35494af(TXVideoEditer tXVideoEditer, int i11, int i12, boolean z11, int i13, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f76740a = tXVideoEditer;
        this.f76741b = i11;
        this.f76742c = i12;
        this.f76743d = z11;
        this.f76744e = i13;
        this.f76745f = tXThumbnailListener;
    }
}
