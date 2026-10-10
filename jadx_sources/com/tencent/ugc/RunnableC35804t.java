package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.t */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35804t implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77335a;

    /* JADX INFO: renamed from: b */
    private final List f77336b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79291a(TXVideoEditer tXVideoEditer, List list) {
        return new RunnableC35804t(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSpeedList$22(this.f77335a, this.f77336b);
    }

    private RunnableC35804t(TXVideoEditer tXVideoEditer, List list) {
        this.f77335a = tXVideoEditer;
        this.f77336b = list;
    }
}
