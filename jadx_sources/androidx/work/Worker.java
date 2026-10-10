package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes34.dex */
public abstract class Worker extends ListenableWorker {
    SettableFuture<ListenableWorker.Result> mFuture;

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.Result doWork();

    @NonNull
    @WorkerThread
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.Worker.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    settableFutureCreate.set(Worker.this.getForegroundInfo());
                } catch (Throwable th2) {
                    settableFutureCreate.setException(th2);
                }
            }
        });
        return settableFutureCreate;
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        this.mFuture = SettableFuture.create();
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.Worker.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Worker.this.mFuture.set(Worker.this.doWork());
                } catch (Throwable th2) {
                    Worker.this.mFuture.setException(th2);
                }
            }
        });
        return this.mFuture;
    }
}
