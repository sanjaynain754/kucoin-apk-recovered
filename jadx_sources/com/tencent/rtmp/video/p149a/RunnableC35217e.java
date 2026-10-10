package com.tencent.rtmp.video.p149a;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.e */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35217e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35213a.a f75451a;

    /* JADX INFO: renamed from: a */
    public static Runnable m77308a(C35213a.a aVar) {
        return new RunnableC35217e(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35213a.a aVar = this.f75451a;
        C35213a.this.f75438a.execute(aVar.f75442b);
    }

    private RunnableC35217e(C35213a.a aVar) {
        this.f75451a = aVar;
    }
}
