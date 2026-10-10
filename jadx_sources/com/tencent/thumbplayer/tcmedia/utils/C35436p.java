package com.tencent.thumbplayer.tcmedia.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.p */
/* JADX INFO: loaded from: classes64.dex */
public class C35436p {

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.p$a */
    public static class a implements RejectedExecutionHandler {
        private a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
                TPLogUtil.m78800i("TPPlayer[TPThreadPoolExecutor]", "rejectedExecution put task to queue");
            } catch (InterruptedException e11) {
                TPLogUtil.m78797e("TPPlayer[TPThreadPoolExecutor]", "rejectedExecution has exception:" + e11.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.p$b */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private AtomicInteger f76614a;

        private b() {
            this.f76614a = new AtomicInteger(0);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("TP-Thread" + this.f76614a.incrementAndGet());
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m78926a(int i11, int i12) {
        return new ThreadPoolExecutor(i11, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(20), new b(), new a());
    }
}
