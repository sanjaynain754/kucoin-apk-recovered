package p651u3;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p747x3.C45999a;

/* JADX INFO: renamed from: u3.b */
/* JADX INFO: compiled from: ConstrainedExecutorService.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45099b extends AbstractExecutorService {

    /* JADX INFO: renamed from: i */
    public static final Class<?> f101503i = C45099b.class;

    /* JADX INFO: renamed from: b */
    public final String f101504b;

    /* JADX INFO: renamed from: c */
    public final Executor f101505c;

    /* JADX INFO: renamed from: d */
    public volatile int f101506d;

    /* JADX INFO: renamed from: e */
    public final BlockingQueue<Runnable> f101507e;

    /* JADX INFO: renamed from: f */
    public final a f101508f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f101509g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f101510h;

    /* JADX INFO: renamed from: u3.b$a */
    /* JADX INFO: compiled from: ConstrainedExecutorService.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) C45099b.this.f101507e.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    C45999a.m101519y(C45099b.f101503i, "%s: Worker has nothing to run", C45099b.this.f101504b);
                }
            } finally {
                int iDecrementAndGet = C45099b.this.f101509g.decrementAndGet();
                if (C45099b.this.f101507e.isEmpty()) {
                    C45999a.m101520z(C45099b.f101503i, "%s: worker finished; %d workers left", C45099b.this.f101504b, Integer.valueOf(iDecrementAndGet));
                } else {
                    C45099b.this.m99717f();
                }
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f101507e.offer(runnable)) {
            throw new RejectedExecutionException(this.f101504b + " queue is full, size=" + this.f101507e.size());
        }
        int size = this.f101507e.size();
        int i11 = this.f101510h.get();
        if (size > i11 && this.f101510h.compareAndSet(i11, size)) {
            C45999a.m101520z(f101503i, "%s: max pending work in queue = %d", this.f101504b, Integer.valueOf(size));
        }
        m99717f();
    }

    /* JADX INFO: renamed from: f */
    public final void m99717f() {
        int i11 = this.f101509g.get();
        while (i11 < this.f101506d) {
            int i12 = i11 + 1;
            if (this.f101509g.compareAndSet(i11, i12)) {
                C45999a.m101480A(f101503i, "%s: starting worker %d of %d", this.f101504b, Integer.valueOf(i12), Integer.valueOf(this.f101506d));
                this.f101505c.execute(this.f101508f);
                return;
            } else {
                C45999a.m101519y(f101503i, "%s: race in startWorkerIfNeeded; retrying", this.f101504b);
                i11 = this.f101509g.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public C45099b(String str, int i11, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i11 > 0) {
            this.f101504b = str;
            this.f101505c = executor;
            this.f101506d = i11;
            this.f101507e = blockingQueue;
            this.f101508f = new a();
            this.f101509g = new AtomicInteger(0);
            this.f101510h = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }
}
