package androidx.camera.core.impl.utils.executor;

import androidx.annotation.GuardedBy;
import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes23.dex */
final class SequentialExecutor implements Executor {
    private static final String TAG = "SequentialExecutor";
    private final Executor mExecutor;

    @GuardedBy("mQueue")
    final Deque<Runnable> mQueue = new ArrayDeque();
    private final QueueWorker mWorker = new QueueWorker();

    @GuardedBy("mQueue")
    WorkerRunningState mWorkerRunningState = WorkerRunningState.IDLE;

    @GuardedBy("mQueue")
    long mWorkerRunCount = 0;

    public final class QueueWorker implements Runnable {
        /* JADX WARN: Code duplicated, block: B:41:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            androidx.camera.core.Logger.m1869e(androidx.camera.core.impl.utils.executor.SequentialExecutor.TAG, "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void workOnQueue() {
            Runnable runnablePoll;
            boolean z11 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (SequentialExecutor.this.mQueue) {
                        if (z11) {
                            runnablePoll = SequentialExecutor.this.mQueue.poll();
                            if (runnablePoll == null) {
                                SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                            }
                        } else {
                            SequentialExecutor sequentialExecutor = SequentialExecutor.this;
                            WorkerRunningState workerRunningState = sequentialExecutor.mWorkerRunningState;
                            WorkerRunningState workerRunningState2 = WorkerRunningState.RUNNING;
                            if (workerRunningState != workerRunningState2) {
                                sequentialExecutor.mWorkerRunCount++;
                                sequentialExecutor.mWorkerRunningState = workerRunningState2;
                                z11 = true;
                                runnablePoll = SequentialExecutor.this.mQueue.poll();
                                if (runnablePoll == null) {
                                    SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            Thread.currentThread().interrupt();
        }

        public QueueWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e11) {
                synchronized (SequentialExecutor.this.mQueue) {
                    SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                    throw e11;
                }
            }
        }
    }

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z11;
        Preconditions.checkNotNull(runnable);
        synchronized (this.mQueue) {
            WorkerRunningState workerRunningState2 = this.mWorkerRunningState;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j11 = this.mWorkerRunCount;
                Runnable runnable2 = new Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }
                };
                this.mQueue.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.mWorkerRunningState = workerRunningState3;
                try {
                    this.mExecutor.execute(this.mWorker);
                    if (this.mWorkerRunningState != workerRunningState3) {
                        return;
                    }
                    synchronized (this.mQueue) {
                        try {
                            if (this.mWorkerRunCount == j11 && this.mWorkerRunningState == workerRunningState3) {
                                this.mWorkerRunningState = workerRunningState;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e11) {
                    synchronized (this.mQueue) {
                        try {
                            WorkerRunningState workerRunningState4 = this.mWorkerRunningState;
                            if (workerRunningState4 == WorkerRunningState.IDLE || workerRunningState4 == WorkerRunningState.QUEUING) {
                                if (this.mQueue.removeLastOccurrence(runnable2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                            if (!(e11 instanceof RejectedExecutionException) || z11) {
                                throw e11;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.mQueue.add(runnable);
        }
    }
}
