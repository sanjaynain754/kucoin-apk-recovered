package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34738c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f73527a;

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f73528b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76104a(Runnable runnable, CountDownLatch countDownLatch) {
        return new RunnableC34738c(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$runAndWaitDone$1(this.f73527a, this.f73528b);
    }

    private RunnableC34738c(Runnable runnable, CountDownLatch countDownLatch) {
        this.f73527a = runnable;
        this.f73528b = countDownLatch;
    }
}
