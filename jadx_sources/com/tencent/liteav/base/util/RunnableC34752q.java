package com.tencent.liteav.base.util;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.q */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34752q implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34748m.a f73560a;

    /* JADX INFO: renamed from: b */
    private final Runnable f73561b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76141a(C34748m.a aVar, Runnable runnable) {
        return new RunnableC34752q(aVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34748m.a aVar = this.f73560a;
        this.f73561b.run();
        synchronized (C34748m.this) {
            C34748m.this.f73549c.remove(aVar);
        }
    }

    private RunnableC34752q(C34748m.a aVar, Runnable runnable) {
        this.f73560a = aVar;
        this.f73561b = runnable;
    }
}
