package p651u3;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: u3.a */
/* JADX INFO: compiled from: CallerThreadExecutor.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45098a extends AbstractExecutorService {

    /* JADX INFO: renamed from: b */
    public static final C45098a f101502b = new C45098a();

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static C45098a m99711a() {
        return f101502b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }
}
