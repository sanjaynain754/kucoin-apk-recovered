package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34737b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f73525a;

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f73526b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76103a(Runnable runnable, CountDownLatch countDownLatch) {
        return new RunnableC34737b(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$runAndWaitDone$0(this.f73525a, this.f73526b);
    }

    private RunnableC34737b(Runnable runnable, CountDownLatch countDownLatch) {
        this.f73525a = runnable;
        this.f73526b = countDownLatch;
    }
}
