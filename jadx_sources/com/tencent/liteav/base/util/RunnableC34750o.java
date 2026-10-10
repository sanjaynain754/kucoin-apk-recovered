package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.o */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34750o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f73556a;

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f73557b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76139a(Runnable runnable, CountDownLatch countDownLatch) {
        return new RunnableC34750o(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f73556a;
        CountDownLatch countDownLatch = this.f73557b;
        runnable.run();
        countDownLatch.countDown();
    }

    private RunnableC34750o(Runnable runnable, CountDownLatch countDownLatch) {
        this.f73556a = runnable;
        this.f73557b = countDownLatch;
    }
}
