package com.tencent.liteav.base.util;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.m */
/* JADX INFO: loaded from: classes59.dex */
public final class C34748m implements InterfaceC34757v {

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f73547a;

    /* JADX INFO: renamed from: b */
    public final CustomHandler f73548b;

    /* JADX INFO: renamed from: c */
    public final List<a> f73549c;

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.m$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public final Runnable f73550a;

        /* JADX INFO: renamed from: b */
        public final Runnable f73551b;

        /* JADX INFO: renamed from: c */
        public final Runnable f73552c = RunnableC34753r.m76142a(this);

        /* JADX INFO: renamed from: e */
        private final long f73554e;

        public a(Runnable runnable, long j11) {
            this.f73550a = runnable;
            this.f73551b = RunnableC34752q.m76141a(this, runnable);
            this.f73554e = j11;
        }

        /* JADX INFO: renamed from: a */
        public final void m76137a() {
            C34748m.this.f73548b.postDelayed(this.f73552c, this.f73554e);
        }
    }

    public C34748m() {
        this(60);
    }

    @Override // com.tencent.liteav.base.util.InterfaceC34757v
    /* JADX INFO: renamed from: a */
    public final void mo76133a(Runnable runnable) {
        this.f73547a.execute(runnable);
    }

    /* JADX INFO: renamed from: b */
    public final void m76135b(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f73547a.execute(RunnableC34750o.m76139a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C34748m(int i11) {
        this(i11, "SequenceTaskRunner_");
    }

    /* JADX INFO: renamed from: a */
    public final void m76134a(Runnable runnable, long j11) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f73547a.execute(RunnableC34751p.m76140a(runnable, countDownLatch));
        try {
            countDownLatch.await(j11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C34748m(int i11, String str) {
        this.f73547a = new ThreadPoolExecutor(0, 1, i11, TimeUnit.SECONDS, new LinkedBlockingQueue(), ThreadFactoryC34749n.m76138a(str));
        this.f73548b = new CustomHandler(Looper.getMainLooper());
        this.f73549c = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m76136b(Runnable runnable, long j11) {
        a aVar = new a(runnable, j11);
        synchronized (this) {
            this.f73549c.add(aVar);
        }
        aVar.m76137a();
    }
}
