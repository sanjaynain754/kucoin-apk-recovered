package com.tencent.rtmp.video.p149a;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.c */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35215c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f75447a;

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f75448b;

    /* JADX INFO: renamed from: a */
    public static Runnable m77306a(Runnable runnable, CountDownLatch countDownLatch) {
        return new RunnableC35215c(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f75447a;
        CountDownLatch countDownLatch = this.f75448b;
        runnable.run();
        countDownLatch.countDown();
    }

    private RunnableC35215c(Runnable runnable, CountDownLatch countDownLatch) {
        this.f75447a = runnable;
        this.f75448b = countDownLatch;
    }
}
