package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: WorkSpecDao.kt */
/* JADX INFO: loaded from: classes34.dex */
@Dao
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u000eH'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\nH'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015H'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001c\u001a\u00020\u0005H'J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001e\u001a\u00020\u0005H'J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\u001c\u001a\u00020\u0005H'J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001c\u001a\u00020\u0005H'J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001e\u001a\u00020\u0005H'J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u000e2\u0006\u0010\u001c\u001a\u00020\u0005H'J\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070\u000e2\u0006\u0010\u001e\u001a\u00020\u0005H'J\b\u0010+\u001a\u00020,H'J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\bH'J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0015H'J\b\u00104\u001a\u00020\u0003H'J\b\u00105\u001a\u00020\nH'J\u0010\u00106\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0015H'J\u0018\u00109\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0012H'J\u0018\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010=\u001a\u00020\u00032\u0006\u00101\u001a\u00020\bH'¨\u0006>"}, m90084d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "delete", "", "id", "", "getAllEligibleWorkSpecsForScheduling", "", "Landroidx/work/impl/model/WorkSpec;", "maxLimit", "", "getAllUnfinishedWork", "getAllWorkSpecIds", "getAllWorkSpecIdsLiveData", "Landroidx/lifecycle/LiveData;", "getEligibleWorkForScheduling", "schedulerLimit", "getInputsFromPrerequisites", "Landroidx/work/Data;", "getRecentlyCompletedWork", "startingAt", "", "getRunningWork", "getScheduleRequestedAtLiveData", "getScheduledWork", "getState", "Landroidx/work/WorkInfo$State;", "getUnfinishedWorkWithName", "name", "getUnfinishedWorkWithTag", "tag", "getWorkSpec", "getWorkSpecIdAndStatesForName", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkStatusPojoForId", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForIds", "ids", "getWorkStatusPojoForName", "getWorkStatusPojoForTag", "getWorkStatusPojoLiveDataForIds", "getWorkStatusPojoLiveDataForName", "getWorkStatusPojoLiveDataForTag", "hasUnfinishedWork", "", "incrementGeneration", "incrementPeriodCount", "incrementWorkSpecRunAttemptCount", "insertWorkSpec", "workSpec", "markWorkSpecScheduled", "startTime", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "resetScheduledState", "resetWorkSpecRunAttemptCount", "setLastEnqueuedTime", "enqueueTime", "setOutput", "output", "setState", "state", "updateWorkSpec", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
@SuppressLint({"UnknownNullness"})
public interface WorkSpecDao {
    @Query("DELETE FROM workspec WHERE id=:id")
    void delete(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    @NotNull
    List<String> getAllUnfinishedWork();

    @Query("SELECT id FROM workspec")
    @NotNull
    List<String> getAllWorkSpecIds();

    @Query("SELECT id FROM workspec")
    @Transaction
    @NotNull
    LiveData<List<String>> getAllWorkSpecIdsLiveData();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    @NotNull
    List<WorkSpec> getEligibleWorkForScheduling(int schedulerLimit);

    @Query("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    List<Data> getInputsFromPrerequisites(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    List<WorkSpec> getRecentlyCompletedWork(long startingAt);

    @Query("SELECT * FROM workspec WHERE state=1")
    @NotNull
    List<WorkSpec> getRunningWork();

    @Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    @NotNull
    LiveData<Long> getScheduleRequestedAtLiveData(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    List<WorkSpec> getScheduledWork();

    @Query("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    WorkInfo.State getState(@NotNull String id2);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<String> getUnfinishedWorkWithName(@NotNull String name);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @NotNull
    List<String> getUnfinishedWorkWithTag(@NotNull String tag);

    @Query("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    WorkSpec getWorkSpec(@NotNull String id2);

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=:id")
    @Transaction
    @Nullable
    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(@NotNull String id2);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(@NotNull String tag);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(@NotNull String tag);

    @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean hasUnfinishedWork();

    @Query("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void incrementGeneration(@NotNull String id2);

    @Query("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void incrementPeriodCount(@NotNull String id2);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(@NotNull String id2);

    @Insert(onConflict = 5)
    void insertWorkSpec(@NotNull WorkSpec workSpec);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@NotNull String id2, long startTime);

    @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(@NotNull String id2);

    @Query("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void setLastEnqueuedTime(@NotNull String id2, long enqueueTime);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(@NotNull String id2, @NotNull Data output);

    @Query("UPDATE workspec SET state=:state WHERE id=:id")
    int setState(@NotNull WorkInfo.State state, @NotNull String id2);

    @Update
    void updateWorkSpec(@NotNull WorkSpec workSpec);
}
