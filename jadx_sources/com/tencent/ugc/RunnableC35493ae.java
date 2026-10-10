package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.ae */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35493ae implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76734a;

    /* JADX INFO: renamed from: b */
    private final List f76735b;

    /* JADX INFO: renamed from: c */
    private final int f76736c;

    /* JADX INFO: renamed from: d */
    private final int f76737d;

    /* JADX INFO: renamed from: e */
    private final boolean f76738e;

    /* JADX INFO: renamed from: f */
    private final TXVideoEditer.TXThumbnailListener f76739f;

    /* JADX INFO: renamed from: a */
    public static Runnable m78994a(TXVideoEditer tXVideoEditer, List list, int i11, int i12, boolean z11, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new RunnableC35493ae(tXVideoEditer, list, i11, i12, z11, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76734a.doGetThumbnail(this.f76735b, this.f76736c, this.f76737d, this.f76738e, this.f76739f);
    }

    private RunnableC35493ae(TXVideoEditer tXVideoEditer, List list, int i11, int i12, boolean z11, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f76734a = tXVideoEditer;
        this.f76735b = list;
        this.f76736c = i11;
        this.f76737d = i12;
        this.f76738e = z11;
        this.f76739f = tXThumbnailListener;
    }
}
