package com.tencent.ugc.videobase.chain;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.chain.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35812e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f77353a;

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f77354b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79298a(Runnable runnable, CountDownLatch countDownLatch) {
        return new RunnableC35812e(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$runOnDrawAndWaitDone$4(this.f77353a, this.f77354b);
    }

    private RunnableC35812e(Runnable runnable, CountDownLatch countDownLatch) {
        this.f77353a = runnable;
        this.f77354b = countDownLatch;
    }
}
