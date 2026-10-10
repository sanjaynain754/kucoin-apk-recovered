package p484o1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o1.g */
/* JADX INFO: compiled from: LottieThreadFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC42925g implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f95028e = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final ThreadGroup f95029b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f95030c = new AtomicInteger(1);

    /* JADX INFO: renamed from: d */
    public final String f95031d;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f95029b, runnable, this.f95031d + this.f95030c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public ThreadFactoryC42925g() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f95029b = threadGroup;
        this.f95031d = "lottie-" + f95028e.getAndIncrement() + "-thread-";
    }
}
