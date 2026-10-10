package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.r */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35769r implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77268a;

    /* JADX INFO: renamed from: b */
    private final List f77269b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79259a(TXVideoEditer tXVideoEditer, List list) {
        return new RunnableC35769r(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setPasterList$20(this.f77268a, this.f77269b);
    }

    private RunnableC35769r(TXVideoEditer tXVideoEditer, List list) {
        this.f77268a = tXVideoEditer;
        this.f77269b = list;
    }
}
