package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.u */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35805u implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77337a;

    /* JADX INFO: renamed from: b */
    private final List f77338b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79292a(TXVideoEditer tXVideoEditer, List list) {
        return new RunnableC35805u(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setRepeatPlay$23(this.f77337a, this.f77338b);
    }

    private RunnableC35805u(TXVideoEditer tXVideoEditer, List list) {
        this.f77337a = tXVideoEditer;
        this.f77338b = list;
    }
}
