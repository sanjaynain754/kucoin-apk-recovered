package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cd */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35558cd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354702 f76889a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79057a(TXVideoEditer.C354702 c354702) {
        return new RunnableC35558cd(c354702);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354702.m78965a(this.f76889a);
    }

    private RunnableC35558cd(TXVideoEditer.C354702 c354702) {
        this.f76889a = c354702;
    }
}
