package com.tencent.rtmp.video.p149a;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.d */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35216d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35213a.a f75449a;

    /* JADX INFO: renamed from: b */
    private final Runnable f75450b;

    /* JADX INFO: renamed from: a */
    public static Runnable m77307a(C35213a.a aVar, Runnable runnable) {
        return new RunnableC35216d(aVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35213a.a aVar = this.f75449a;
        this.f75450b.run();
        synchronized (C35213a.this) {
            C35213a.this.f75440c.remove(aVar);
        }
    }

    private RunnableC35216d(C35213a.a aVar, Runnable runnable) {
        this.f75449a = aVar;
        this.f75450b = runnable;
    }
}
