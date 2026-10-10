package p651u3;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: u3.d */
/* JADX INFO: compiled from: DefaultSerialExecutorService.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45101d extends C45099b implements InterfaceExecutorServiceC45104g {
    @Override // p651u3.C45099b, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }

    public C45101d(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }
}
