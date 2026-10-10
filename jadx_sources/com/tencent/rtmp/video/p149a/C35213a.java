package com.tencent.rtmp.video.p149a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.a */
/* JADX INFO: loaded from: classes56.dex */
public final class C35213a {

    /* JADX INFO: renamed from: a */
    final ThreadPoolExecutor f75438a;

    /* JADX INFO: renamed from: b */
    final Handler f75439b;

    /* JADX INFO: renamed from: c */
    final List<a> f75440c;

    /* JADX INFO: renamed from: com.tencent.rtmp.video.a.a$a */
    public class a {

        /* JADX INFO: renamed from: a */
        final Runnable f75441a;

        /* JADX INFO: renamed from: b */
        final Runnable f75442b;

        /* JADX INFO: renamed from: c */
        final Runnable f75443c = RunnableC35217e.m77308a(this);

        /* JADX INFO: renamed from: d */
        final long f75444d;

        public a(Runnable runnable, long j11) {
            this.f75441a = runnable;
            this.f75442b = RunnableC35216d.m77307a(this, runnable);
            this.f75444d = j11;
        }
    }

    public C35213a() {
        this((byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m77301a(Runnable runnable) {
        this.f75438a.execute(runnable);
    }

    private C35213a(byte b11) {
        this("SequenceTaskRunner_");
    }

    /* JADX INFO: renamed from: a */
    public final void m77302a(Runnable runnable, long j11) {
        a aVar = new a(runnable, j11);
        synchronized (this) {
            this.f75440c.add(aVar);
        }
        C35213a.this.f75439b.postDelayed(aVar.f75443c, aVar.f75444d);
    }

    /* JADX INFO: renamed from: b */
    public final void m77303b(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f75438a.execute(RunnableC35215c.m77306a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77304c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f75438a.remove(runnable);
        synchronized (this) {
            try {
                Iterator<a> it = this.f75440c.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next != null && runnable == next.f75441a) {
                        C35213a.this.f75439b.removeCallbacks(next.f75443c);
                        C35213a.this.f75438a.remove(next.f75442b);
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C35213a(String str) {
        this.f75438a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ThreadFactoryC35214b.m77305a(str));
        this.f75439b = new Handler(Looper.getMainLooper());
        this.f75440c = new ArrayList();
    }
}
