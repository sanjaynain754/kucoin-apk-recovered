package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.bj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35537bj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76830a;

    /* JADX INFO: renamed from: b */
    private final List f76831b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79036a(TXVideoEditer tXVideoEditer, List list) {
        return new RunnableC35537bj(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76830a.setMediaSourcePathsInternal(this.f76831b);
    }

    private RunnableC35537bj(TXVideoEditer tXVideoEditer, List list) {
        this.f76830a = tXVideoEditer;
        this.f76831b = list;
    }
}
