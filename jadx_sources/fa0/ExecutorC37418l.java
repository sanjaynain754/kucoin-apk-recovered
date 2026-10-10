package fa0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fa0.l */
/* JADX INFO: compiled from: SerialExecutor.java */
/* JADX INFO: loaded from: classes59.dex */
public class ExecutorC37418l implements Executor {

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<Runnable> f83007b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public Runnable f83008c;

    /* JADX INFO: renamed from: d */
    public final Executor f83009d;

    /* JADX INFO: renamed from: fa0.l$a */
    /* JADX INFO: compiled from: SerialExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f83010b;

        public a(Runnable runnable) {
            this.f83010b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f83010b.run();
            } finally {
                ExecutorC37418l.this.m84170a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84170a() {
        Runnable runnablePoll = this.f83007b.poll();
        this.f83008c = runnablePoll;
        if (runnablePoll != null) {
            this.f83009d.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f83007b.offer(new a(runnable));
        if (this.f83008c == null) {
            m84170a();
        }
    }

    public ExecutorC37418l(Executor executor) {
        this.f83009d = executor;
    }
}
