package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Processor implements ExecutionListener, ForegroundProcessor {
    private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private List<Scheduler> mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Map<String, WorkerWrapper> mForegroundWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();

    @Nullable
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();
    private Map<String, Set<StartStopToken>> mWorkRuns = new HashMap();

    public static class FutureListener implements Runnable {

        @NonNull
        private ExecutionListener mExecutionListener;

        @NonNull
        private ListenableFuture<Boolean> mFuture;

        @NonNull
        private final WorkGenerationalId mWorkGenerationalId;

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.mFuture.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.mExecutionListener.onExecuted(this.mWorkGenerationalId, zBooleanValue);
        }

        public FutureListener(@NonNull ExecutionListener executionListener, @NonNull WorkGenerationalId workGenerationalId, @NonNull ListenableFuture<Boolean> listenableFuture) {
            this.mExecutionListener = executionListener;
            this.mWorkGenerationalId = workGenerationalId;
            this.mFuture = listenableFuture;
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WorkSpec m3871b(Processor processor, ArrayList arrayList, String str) {
        arrayList.addAll(processor.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return processor.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    private static boolean interrupt(@NonNull String str, @Nullable WorkerWrapper workerWrapper) {
        if (workerWrapper == null) {
            Logger.get().debug(TAG, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.interrupt();
        Logger.get().debug(TAG, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void runOnExecuted(@NonNull final WorkGenerationalId workGenerationalId, final boolean z11) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f3725b.onExecuted(workGenerationalId, z11);
            }
        });
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            try {
                if (this.mForegroundWorkMap.isEmpty()) {
                    try {
                        this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                    } catch (Throwable th2) {
                        Logger.get().error(TAG, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.mForegroundLock;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.mForegroundLock = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void addExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    @Nullable
    public WorkSpec getRunningWorkSpec(@NonNull String str) {
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapper = this.mForegroundWorkMap.get(str);
                if (workerWrapper == null) {
                    workerWrapper = this.mEnqueuedWorkMap.get(str);
                }
                if (workerWrapper == null) {
                    return null;
                }
                return workerWrapper.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean hasWork() {
        boolean z11;
        synchronized (this.mLock) {
            try {
                z11 = (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) ? false : true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public boolean isCancelled(@NonNull String str) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCancelledIds.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(@NonNull String str) {
        boolean z11;
        synchronized (this.mLock) {
            try {
                z11 = this.mEnqueuedWorkMap.containsKey(str) || this.mForegroundWorkMap.containsKey(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public boolean isEnqueuedInForeground(@NonNull String str) {
        boolean zContainsKey;
        synchronized (this.mLock) {
            zContainsKey = this.mForegroundWorkMap.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z11) {
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapper = this.mEnqueuedWorkMap.get(workGenerationalId.getWorkSpecId());
                if (workerWrapper != null && workGenerationalId.equals(workerWrapper.getWorkGenerationalId())) {
                    this.mEnqueuedWorkMap.remove(workGenerationalId.getWorkSpecId());
                }
                Logger.get().debug(TAG, getClass().getSimpleName() + C33627eb.f69716f + workGenerationalId.getWorkSpecId() + " executed; reschedule = " + z11);
                Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(workGenerationalId, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            try {
                Logger.get().info(TAG, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
                if (workerWrapperRemove != null) {
                    if (this.mForegroundLock == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                        this.mForegroundLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.mForegroundWorkMap.put(str, workerWrapperRemove);
                    ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, workerWrapperRemove.getWorkGenerationalId(), foregroundInfo));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken, @Nullable WorkerParameters.RuntimeExtras runtimeExtras) throws Throwable {
        Throwable th2;
        WorkGenerationalId id2 = startStopToken.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Processor.m3871b(this.f3728b, arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            Logger.get().warning(TAG, "Didn't find WorkSpec for id " + id2);
            runOnExecuted(id2, false);
            return false;
        }
        synchronized (this.mLock) {
            try {
                try {
                    try {
                        if (isEnqueued(workSpecId)) {
                            Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                                set.add(startStopToken);
                                Logger.get().debug(TAG, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                runOnExecuted(id2, false);
                            }
                            return false;
                        }
                        if (workSpec.getGeneration() != id2.getGeneration()) {
                            runOnExecuted(id2, false);
                            return false;
                        }
                        WorkerWrapper workerWrapperBuild = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList).withSchedulers(this.mSchedulers).withRuntimeExtras(runtimeExtras).build();
                        ListenableFuture<Boolean> future = workerWrapperBuild.getFuture();
                        future.addListener(new FutureListener(this, startStopToken.getId(), future), this.mWorkTaskExecutor.getMainThreadExecutor());
                        this.mEnqueuedWorkMap.put(workSpecId, workerWrapperBuild);
                        HashSet hashSet = new HashSet();
                        hashSet.add(startStopToken);
                        this.mWorkRuns.put(workSpecId, hashSet);
                        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(workerWrapperBuild);
                        Logger.get().debug(TAG, getClass().getSimpleName() + ": processing " + id2);
                        return true;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
            }
            throw th2;
        }
    }

    public boolean stopAndCancelWork(@NonNull String str) {
        WorkerWrapper workerWrapperRemove;
        boolean z11;
        synchronized (this.mLock) {
            try {
                Logger.get().debug(TAG, "Processor cancelling " + str);
                this.mCancelledIds.add(str);
                workerWrapperRemove = this.mForegroundWorkMap.remove(str);
                z11 = workerWrapperRemove != null;
                if (workerWrapperRemove == null) {
                    workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
                }
                if (workerWrapperRemove != null) {
                    this.mWorkRuns.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zInterrupt = interrupt(str, workerWrapperRemove);
        if (z11) {
            stopForegroundService();
        }
        return zInterrupt;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void stopForeground(@NonNull String str) {
        synchronized (this.mLock) {
            this.mForegroundWorkMap.remove(str);
            stopForegroundService();
        }
    }

    public Processor(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<Scheduler> list) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
    }

    public boolean stopForegroundWork(@NonNull StartStopToken startStopToken) {
        WorkerWrapper workerWrapperRemove;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            try {
                Logger.get().debug(TAG, "Processor stopping foreground work " + workSpecId);
                workerWrapperRemove = this.mForegroundWorkMap.remove(workSpecId);
                if (workerWrapperRemove != null) {
                    this.mWorkRuns.remove(workSpecId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interrupt(workSpecId, workerWrapperRemove);
    }

    public boolean stopWork(@NonNull StartStopToken startStopToken) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapperRemove = this.mEnqueuedWorkMap.remove(workSpecId);
                if (workerWrapperRemove == null) {
                    Logger.get().debug(TAG, "WorkerWrapper could not be found for " + workSpecId);
                    return false;
                }
                Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                if (set != null && set.contains(startStopToken)) {
                    Logger.get().debug(TAG, "Processor stopping background work " + workSpecId);
                    this.mWorkRuns.remove(workSpecId);
                    return interrupt(workSpecId, workerWrapperRemove);
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
