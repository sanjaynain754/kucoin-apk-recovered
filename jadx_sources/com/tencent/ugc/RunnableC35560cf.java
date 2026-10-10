package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cf */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35560cf implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer.C354713 f76893a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79059a(TXVideoEditer.C354713 c354713) {
        return new RunnableC35560cf(c354713);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.C354713.m78971b(this.f76893a);
    }

    private RunnableC35560cf(TXVideoEditer.C354713 c354713) {
        this.f76893a = c354713;
    }
}
