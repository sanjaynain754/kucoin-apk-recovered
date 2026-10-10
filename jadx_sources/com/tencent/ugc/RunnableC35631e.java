package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35631e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77003a;

    /* JADX INFO: renamed from: b */
    private final int f77004b;

    /* JADX INFO: renamed from: c */
    private final List f77005c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79127a(TXVideoEditer tXVideoEditer, int i11, List list) {
        return new RunnableC35631e(tXVideoEditer, i11, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setPictureList$8(this.f77003a, this.f77004b, this.f77005c);
    }

    private RunnableC35631e(TXVideoEditer tXVideoEditer, int i11, List list) {
        this.f77003a = tXVideoEditer;
        this.f77004b = i11;
        this.f77005c = list;
    }
}
