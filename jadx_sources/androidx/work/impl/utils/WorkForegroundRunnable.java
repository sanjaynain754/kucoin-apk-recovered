package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkForegroundRunnable implements Runnable {
    static final String TAG = Logger.tagWithPrefix("WorkForegroundRunnable");
    final Context mContext;
    final ForegroundUpdater mForegroundUpdater;
    final SettableFuture<Void> mFuture = SettableFuture.create();
    final TaskExecutor mTaskExecutor;
    final WorkSpec mWorkSpec;
    final ListenableWorker mWorker;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3887a(WorkForegroundRunnable workForegroundRunnable, SettableFuture settableFuture) {
        if (workForegroundRunnable.mFuture.isCancelled()) {
            settableFuture.cancel(true);
        } else {
            settableFuture.setFuture(workForegroundRunnable.mWorker.getForegroundInfoAsync());
        }
    }

    @NonNull
    public ListenableFuture<Void> getFuture() {
        return this.mFuture;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.mWorkSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            this.mFuture.set(null);
            return;
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.mTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.utils.g
            @Override // java.lang.Runnable
            public final void run() {
                WorkForegroundRunnable.m3887a(this.f3761b, settableFutureCreate);
            }
        });
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (WorkForegroundRunnable.this.mFuture.isCancelled()) {
                    return;
                }
                try {
                    ForegroundInfo foregroundInfo = (ForegroundInfo) settableFutureCreate.get();
                    if (foregroundInfo == null) {
                        throw new IllegalStateException("Worker was marked important (" + WorkForegroundRunnable.this.mWorkSpec.workerClassName + ") but did not provide ForegroundInfo");
                    }
                    Logger.get().debug(WorkForegroundRunnable.TAG, "Updating notification for " + WorkForegroundRunnable.this.mWorkSpec.workerClassName);
                    WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                    workForegroundRunnable.mFuture.setFuture(workForegroundRunnable.mForegroundUpdater.setForegroundAsync(workForegroundRunnable.mContext, workForegroundRunnable.mWorker.getId(), foregroundInfo));
                } catch (Throwable th2) {
                    WorkForegroundRunnable.this.mFuture.setException(th2);
                }
            }
        }, this.mTaskExecutor.getMainThreadExecutor());
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@NonNull Context context, @NonNull WorkSpec workSpec, @NonNull ListenableWorker listenableWorker, @NonNull ForegroundUpdater foregroundUpdater, @NonNull TaskExecutor taskExecutor) {
        this.mContext = context;
        this.mWorkSpec = workSpec;
        this.mWorker = listenableWorker;
        this.mForegroundUpdater = foregroundUpdater;
        this.mTaskExecutor = taskExecutor;
    }
}
