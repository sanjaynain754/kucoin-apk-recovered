package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes23.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public static final class RxCustomThread extends Thread implements NonBlockingThread {
        public RxCustomThread(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str, int i11) {
        this(str, i11, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.prefix + '-' + incrementAndGet();
        Thread rxCustomThread = this.nonBlocking ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.priority);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }

    public RxThreadFactory(String str, int i11, boolean z11) {
        this.prefix = str;
        this.priority = i11;
        this.nonBlocking = z11;
    }
}
