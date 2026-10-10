package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.q */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35768q implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77266a;

    /* JADX INFO: renamed from: b */
    private final List f77267b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79258a(TXVideoEditer tXVideoEditer, List list) {
        return new RunnableC35768q(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setAnimatedPasterList$19(this.f77266a, this.f77267b);
    }

    private RunnableC35768q(TXVideoEditer tXVideoEditer, List list) {
        this.f77266a = tXVideoEditer;
        this.f77267b = list;
    }
}
