package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EnqueueRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
    private final OperationImpl mOperation;
    private final WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(@NonNull WorkContinuationImpl workContinuationImpl) {
        this(workContinuationImpl, new OperationImpl());
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workManagerImpl, @NonNull List<? extends WorkRequest> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z11;
        boolean z12;
        boolean z13;
        WorkManagerImpl workManagerImpl2;
        WorkDatabase workDatabase;
        boolean z14;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = workManagerImpl.getWorkDatabase();
        boolean z15 = strArr2 != null && strArr2.length > 0;
        if (z15) {
            z11 = false;
            z12 = false;
            z13 = true;
            for (String str2 : strArr2) {
                WorkSpec workSpec = workDatabase2.workSpecDao().getWorkSpec(str2);
                if (workSpec == null) {
                    Logger.get().error(TAG, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = workSpec.state;
                z13 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z12 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z11 = true;
                }
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z15) {
            workManagerImpl2 = workManagerImpl;
            workDatabase = workDatabase2;
            z14 = false;
        } else {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase2.workSpecDao().getWorkSpecIdAndStatesForName(str);
            if (workSpecIdAndStatesForName.isEmpty()) {
                workManagerImpl2 = workManagerImpl;
                workDatabase = workDatabase2;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                workManagerImpl2 = workManagerImpl;
                DependencyDao dependencyDao = workDatabase2.dependencyDao();
                List arrayList = new ArrayList();
                for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                    if (!dependencyDao.hasDependents(idAndState.id)) {
                        WorkInfo.State state2 = idAndState.state;
                        boolean z16 = (state2 == WorkInfo.State.SUCCEEDED) & z13;
                        if (state2 == WorkInfo.State.FAILED) {
                            z12 = true;
                        } else if (state2 == WorkInfo.State.CANCELLED) {
                            z11 = true;
                        }
                        arrayList.add(idAndState.id);
                        z13 = z16;
                    }
                    workDatabase2 = workDatabase2;
                }
                workDatabase = workDatabase2;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z11 || z12)) {
                    WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                    Iterator<WorkSpec.IdAndState> it = workSpecDao.getWorkSpecIdAndStatesForName(str).iterator();
                    while (it.hasNext()) {
                        workSpecDao.delete(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z11 = false;
                    z12 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z15 = strArr2.length > 0;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator<WorkSpec.IdAndState> it2 = workSpecIdAndStatesForName.iterator();
                    while (it2.hasNext()) {
                        WorkInfo.State state3 = it2.next().state;
                        if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                            return false;
                        }
                    }
                }
                workManagerImpl2 = workManagerImpl;
                CancelWorkRunnable.forName(str, workManagerImpl2, false).run();
                WorkSpecDao workSpecDao2 = workDatabase2.workSpecDao();
                Iterator<WorkSpec.IdAndState> it3 = workSpecIdAndStatesForName.iterator();
                while (it3.hasNext()) {
                    workSpecDao2.delete(it3.next().id);
                }
                workDatabase = workDatabase2;
                z14 = true;
            }
            z14 = false;
        }
        Iterator<? extends WorkRequest> it4 = list.iterator();
        while (it4.hasNext()) {
            WorkRequest next = it4.next();
            WorkSpec workSpec2 = next.getWorkSpec();
            if (!z15 || z13) {
                workSpec2.lastEnqueueTime = jCurrentTimeMillis;
            } else if (z12) {
                workSpec2.state = WorkInfo.State.FAILED;
            } else if (z11) {
                workSpec2.state = WorkInfo.State.CANCELLED;
            } else {
                workSpec2.state = WorkInfo.State.BLOCKED;
            }
            if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                z14 = true;
            }
            workDatabase.workSpecDao().insertWorkSpec(EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(workManagerImpl2.getSchedulers(), workSpec2));
            if (z15) {
                int length = strArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    workDatabase.dependencyDao().insertDependency(new Dependency(next.getStringId(), strArr2[i11]));
                    i11++;
                    it4 = it4;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends WorkRequest> it5 = it4;
            workDatabase.workTagDao().insertTags(next.getStringId(), next.getTags());
            if (!zIsEmpty) {
                workDatabase.workNameDao().insert(new WorkName(str, next.getStringId()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z14;
    }

    public EnqueueRunnable(@NonNull WorkContinuationImpl workContinuationImpl, @NonNull OperationImpl operationImpl) {
        this.mWorkContinuation = workContinuationImpl;
        this.mOperation = operationImpl;
    }

    @VisibleForTesting
    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean zProcessContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return zProcessContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @NonNull
    public Operation getOperation() {
        return this.mOperation;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.mWorkContinuation.hasCycles()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.mWorkContinuation + ")");
            }
            if (addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th2) {
            this.mOperation.markState(new Operation.State.FAILURE(th2));
        }
    }

    @VisibleForTesting
    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean enqueueContinuation(@NonNull WorkContinuationImpl workContinuationImpl) {
        boolean zEnqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return zEnqueueWorkWithPrerequisites;
    }

    private static boolean processContinuation(@NonNull WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean zProcessContinuation = false;
        if (parents != null) {
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (!workContinuationImpl2.isEnqueued()) {
                    zProcessContinuation |= processContinuation(workContinuationImpl2);
                } else {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl2.getIds()) + ")");
                }
            }
        }
        return enqueueContinuation(workContinuationImpl) | zProcessContinuation;
    }
}
