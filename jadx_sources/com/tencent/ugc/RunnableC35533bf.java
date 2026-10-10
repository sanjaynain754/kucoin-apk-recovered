package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.bf */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35533bf implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76820a;

    /* JADX INFO: renamed from: b */
    private final List f76821b;

    /* JADX INFO: renamed from: c */
    private final int f76822c;

    /* JADX INFO: renamed from: d */
    private final int f76823d;

    /* JADX INFO: renamed from: a */
    public static Runnable m79032a(TXVideoEditer tXVideoEditer, List list, int i11, int i12) {
        return new RunnableC35533bf(tXVideoEditer, list, i11, i12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSplitScreenList$58(this.f76820a, this.f76821b, this.f76822c, this.f76823d);
    }

    private RunnableC35533bf(TXVideoEditer tXVideoEditer, List list, int i11, int i12) {
        this.f76820a = tXVideoEditer;
        this.f76821b = list;
        this.f76822c = i11;
        this.f76823d = i12;
    }
}
