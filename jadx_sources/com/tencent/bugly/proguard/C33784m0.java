package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33784m0 {

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f70868b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public static C33784m0 f70869c;

    /* JADX INFO: renamed from: a */
    public ScheduledExecutorService f70870a;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.m0$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("BuglyThread-" + C33784m0.f70868b.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m74008b() {
        ScheduledExecutorService scheduledExecutorService = this.f70870a;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            C34012x4.m75434a("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f70870a.shutdownNow();
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m74009d() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f70870a;
        return (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C33784m0 m74004c() {
        try {
            if (f70869c == null) {
                f70869c = new C33784m0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f70869c;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m74005a(ScheduledExecutorService scheduledExecutorService) {
        this.f70870a = scheduledExecutorService;
    }

    public C33784m0() {
        this.f70870a = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new a());
        this.f70870a = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool != null && !scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            return;
        }
        C34012x4.m75444f("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m74007a(Runnable runnable, long j11) {
        if (!m74009d()) {
            C34012x4.m75444f("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C34012x4.m75444f("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        if (j11 <= 0) {
            j11 = 0;
        }
        C34012x4.m75434a("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j11), runnable.getClass().getName());
        try {
            this.f70870a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th2) {
            if (C33900rc.f71640i) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m74006a(Runnable runnable) {
        if (!m74009d()) {
            C34012x4.m75444f("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            C34012x4.m75444f("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        C34012x4.m75434a("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f70870a.execute(runnable);
            return true;
        } catch (Throwable th2) {
            if (C33900rc.f71640i) {
                th2.printStackTrace();
            }
            return false;
        }
    }
}
