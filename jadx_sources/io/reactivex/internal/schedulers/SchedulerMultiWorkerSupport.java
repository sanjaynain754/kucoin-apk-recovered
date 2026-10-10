package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public interface SchedulerMultiWorkerSupport {

    /* JADX INFO: loaded from: classes60.dex */
    public interface WorkerCallback {
        void onWorker(int i11, @NonNull Scheduler.Worker worker);
    }

    void createWorkers(int i11, @NonNull WorkerCallback workerCallback);
}
