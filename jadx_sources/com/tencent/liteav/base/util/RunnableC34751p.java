package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.p */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34751p implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f73558a;

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f73559b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76140a(Runnable runnable, CountDownLatch countDownLatch) {
        return new RunnableC34751p(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f73558a;
        CountDownLatch countDownLatch = this.f73559b;
        runnable.run();
        countDownLatch.countDown();
    }

    private RunnableC34751p(Runnable runnable, CountDownLatch countDownLatch) {
        this.f73558a = runnable;
        this.f73559b = countDownLatch;
    }
}
