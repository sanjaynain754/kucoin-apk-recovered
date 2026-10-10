package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ch */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35562ch implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354713 f76896a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79061a(TXVideoEditer.C354713 c354713) {
        return new RunnableC35562ch(c354713);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354713.m78969a(this.f76896a);
    }

    private RunnableC35562ch(TXVideoEditer.C354713 c354713) {
        this.f76896a = c354713;
    }
}
