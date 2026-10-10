package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.p */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35755p implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77226a;

    /* JADX INFO: renamed from: b */
    private final List f77227b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79249a(TXVideoEditer tXVideoEditer, List list) {
        return new RunnableC35755p(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSubtitleList$18(this.f77226a, this.f77227b);
    }

    private RunnableC35755p(TXVideoEditer tXVideoEditer, List list) {
        this.f77226a = tXVideoEditer;
        this.f77227b = list;
    }
}
