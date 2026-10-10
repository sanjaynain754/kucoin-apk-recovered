package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import com.tencent.bugly.proguard.C33616e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes34.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0003JKLB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0002\u0010\bBË\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017¢\u0006\u0002\u0010$J\u0006\u0010-\u001a\u00020\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0015HÆ\u0003J\t\u00100\u001a\u00020\u0017HÆ\u0003J\t\u00101\u001a\u00020\u0019HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\t\u00106\u001a\u00020\u001fHÆ\u0003J\t\u00107\u001a\u00020!HÆ\u0003J\t\u00108\u001a\u00020\u0017HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0017HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\t\u0010@\u001a\u00020\u0011HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003JÓ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u0017HÆ\u0001J\u0013\u0010C\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010D\u001a\u00020\u001fJ\t\u0010E\u001a\u00020\u0017HÖ\u0001J\u000e\u0010F\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020\u0011J\u000e\u0010H\u001a\u00020G2\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010H\u001a\u00020G2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010I\u001a\u00020\u0003H\u0016R\u0012\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0012\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010,R\u0012\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, m90084d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "id", "", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "state", "Landroidx/work/WorkInfo$State;", "workerClassName", "inputMergerClassName", "input", "Landroidx/work/Data;", "output", "initialDelay", "", "intervalDuration", "flexDuration", "constraints", "Landroidx/work/Constraints;", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "", "outOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "periodCount", "generation", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;II)V", "getGeneration", "()I", "isBackedOff", "()Z", "isPeriodic", "getPeriodCount", "setPeriodCount", "(I)V", "calculateNextRunTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "hasConstraints", "hashCode", "setBackoffDelayDuration", "", "setPeriodic", "toString", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;

    @NotNull
    private static final String TAG;

    @JvmField
    @NotNull
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    @JvmField
    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @JvmField
    @ColumnInfo(name = "backoff_policy")
    @NotNull
    public BackoffPolicy backoffPolicy;

    @Embedded
    @JvmField
    @NotNull
    public Constraints constraints;

    @JvmField
    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @JvmField
    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @PrimaryKey
    @JvmField
    @ColumnInfo(name = "id")
    @NotNull
    public final String id;

    @JvmField
    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @JvmField
    @ColumnInfo(name = "input")
    @NotNull
    public Data input;

    @JvmField
    @ColumnInfo(name = "input_merger_class_name")
    @Nullable
    public String inputMergerClassName;

    @JvmField
    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @JvmField
    @ColumnInfo(name = "last_enqueue_time")
    public long lastEnqueueTime;

    @JvmField
    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @JvmField
    @ColumnInfo(name = "out_of_quota_policy")
    @NotNull
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @JvmField
    @ColumnInfo(name = "output")
    @NotNull
    public Data output;

    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int periodCount;

    @JvmField
    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @JvmField
    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @JvmField
    @ColumnInfo(name = "state")
    @NotNull
    public WorkInfo.State state;

    @JvmField
    @ColumnInfo(name = "worker_class_name")
    @NotNull
    public String workerClassName;

    /* JADX INFO: compiled from: WorkSpec.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final /* data */ class IdAndState {

        @JvmField
        @ColumnInfo(name = "id")
        @NotNull
        public String id;

        @JvmField
        @ColumnInfo(name = "state")
        @NotNull
        public WorkInfo.State state;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public IdAndState(@NotNull String id2, @NotNull WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id2;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = idAndState.id;
            }
            if ((i11 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        @NotNull
        public final IdAndState copy(@NotNull String id2, @NotNull WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            return new IdAndState(id2, state);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX INFO: compiled from: WorkSpec.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0003J[\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0006\u00103\u001a\u000204R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c¨\u00065"}, m90084d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "output", "Landroidx/work/Data;", "runAttemptCount", "", "generation", C33616e0.f69644s, "", "progress", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;IILjava/util/List;Ljava/util/List;)V", "getGeneration", "()I", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getOutput", "()Landroidx/work/Data;", "setOutput", "(Landroidx/work/Data;)V", "getProgress", "()Ljava/util/List;", "setProgress", "(Ljava/util/List;)V", "getRunAttemptCount", "setRunAttemptCount", "(I)V", "getState", "()Landroidx/work/WorkInfo$State;", "setState", "(Landroidx/work/WorkInfo$State;)V", "getTags", "setTags", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "toWorkInfo", "Landroidx/work/WorkInfo;", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final /* data */ class WorkInfoPojo {

        @ColumnInfo(name = "generation")
        private final int generation;

        @ColumnInfo(name = "id")
        @NotNull
        private String id;

        @ColumnInfo(name = "output")
        @NotNull
        private Data output;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        @NotNull
        private List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private int runAttemptCount;

        @ColumnInfo(name = "state")
        @NotNull
        private WorkInfo.State state;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        @NotNull
        private List<String> tags;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.areEqual(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && Intrinsics.areEqual(this.tags, workInfoPojo.tags) && Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public WorkInfoPojo(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull Data output, int i11, int i12, @NotNull List<String> tags, @NotNull List<Data> progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.id = id2;
            this.state = state;
            this.output = output;
            this.runAttemptCount = i11;
            this.generation = i12;
            this.tags = tags;
            this.progress = progress;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, int i11, int i12, List list, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = workInfoPojo.id;
            }
            if ((i13 & 2) != 0) {
                state = workInfoPojo.state;
            }
            if ((i13 & 4) != 0) {
                data = workInfoPojo.output;
            }
            if ((i13 & 8) != 0) {
                i11 = workInfoPojo.runAttemptCount;
            }
            if ((i13 & 16) != 0) {
                i12 = workInfoPojo.generation;
            }
            if ((i13 & 32) != 0) {
                list = workInfoPojo.tags;
            }
            if ((i13 & 64) != 0) {
                list2 = workInfoPojo.progress;
            }
            List list3 = list;
            List list4 = list2;
            int i14 = i12;
            Data data2 = data;
            return workInfoPojo.copy(str, state, data2, i11, i14, list3, list4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Data getOutput() {
            return this.output;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getGeneration() {
            return this.generation;
        }

        @NotNull
        public final List<String> component6() {
            return this.tags;
        }

        @NotNull
        public final List<Data> component7() {
            return this.progress;
        }

        @NotNull
        public final WorkInfoPojo copy(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull Data output, int runAttemptCount, int generation, @NotNull List<String> tags, @NotNull List<Data> progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new WorkInfoPojo(id2, state, output, runAttemptCount, generation, tags, progress);
        }

        public final int getGeneration() {
            return this.generation;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Data getOutput() {
            return this.output;
        }

        @NotNull
        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        @NotNull
        public final WorkInfo.State getState() {
            return this.state;
        }

        @NotNull
        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + Integer.hashCode(this.generation)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final void setId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final void setOutput(@NotNull Data data) {
            Intrinsics.checkNotNullParameter(data, "<set-?>");
            this.output = data;
        }

        public final void setProgress(@NotNull List<Data> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.progress = list;
        }

        public final void setRunAttemptCount(int i11) {
            this.runAttemptCount = i11;
        }

        public final void setState(@NotNull WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }

        public final void setTags(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tags = list;
        }

        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        @NotNull
        public final WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY, this.runAttemptCount, this.generation);
        }
    }

    public WorkSpec(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull String workerClassName, @Nullable String str, @NotNull Data input, @NotNull Data output, long j11, long j12, long j13, @NotNull Constraints constraints, @IntRange(from = 0) int i11, @NotNull BackoffPolicy backoffPolicy, long j14, long j15, long j16, long j17, boolean z11, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int i12, int i13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = str;
        this.input = input;
        this.output = output;
        this.initialDelay = j11;
        this.intervalDuration = j12;
        this.flexDuration = j13;
        this.constraints = constraints;
        this.runAttemptCount = i11;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j14;
        this.lastEnqueueTime = j15;
        this.minimumRetentionDuration = j16;
        this.scheduleRequestedAt = j17;
        this.expedited = z11;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i12;
        this.generation = i13;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j11, long j12, long j13, Constraints constraints, int i11, BackoffPolicy backoffPolicy, long j14, long j15, long j16, long j17, boolean z11, OutOfQuotaPolicy outOfQuotaPolicy, int i12, int i13, int i14, Object obj) {
        int i15;
        OutOfQuotaPolicy outOfQuotaPolicy2;
        String str4 = (i14 & 1) != 0 ? workSpec.id : str;
        WorkInfo.State state2 = (i14 & 2) != 0 ? workSpec.state : state;
        String str5 = (i14 & 4) != 0 ? workSpec.workerClassName : str2;
        String str6 = (i14 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data3 = (i14 & 16) != 0 ? workSpec.input : data;
        Data data4 = (i14 & 32) != 0 ? workSpec.output : data2;
        long j18 = (i14 & 64) != 0 ? workSpec.initialDelay : j11;
        long j19 = (i14 & 128) != 0 ? workSpec.intervalDuration : j12;
        long j21 = (i14 & 256) != 0 ? workSpec.flexDuration : j13;
        Constraints constraints2 = (i14 & 512) != 0 ? workSpec.constraints : constraints;
        int i16 = (i14 & 1024) != 0 ? workSpec.runAttemptCount : i11;
        String str7 = str4;
        BackoffPolicy backoffPolicy2 = (i14 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy;
        WorkInfo.State state3 = state2;
        long j22 = (i14 & 4096) != 0 ? workSpec.backoffDelayDuration : j14;
        long j23 = (i14 & 8192) != 0 ? workSpec.lastEnqueueTime : j15;
        long j24 = (i14 & 16384) != 0 ? workSpec.minimumRetentionDuration : j16;
        long j25 = (i14 & 32768) != 0 ? workSpec.scheduleRequestedAt : j17;
        boolean z12 = (i14 & 65536) != 0 ? workSpec.expedited : z11;
        long j26 = j25;
        OutOfQuotaPolicy outOfQuotaPolicy3 = (i14 & 131072) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy;
        int i17 = (i14 & 262144) != 0 ? workSpec.periodCount : i12;
        if ((i14 & 524288) != 0) {
            outOfQuotaPolicy2 = outOfQuotaPolicy3;
            i15 = workSpec.generation;
        } else {
            i15 = i13;
            outOfQuotaPolicy2 = outOfQuotaPolicy3;
        }
        return workSpec.copy(str7, state3, str5, str6, data3, data4, j18, j19, j21, constraints2, i16, backoffPolicy2, j22, j23, j24, j26, z12, outOfQuotaPolicy2, i17, i15);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) other;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation;
    }

    public final void setPeriodic(long intervalDuration) {
        if (intervalDuration < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(RangesKt.coerceAtLeast(intervalDuration, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), RangesKt.coerceAtLeast(intervalDuration, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.a
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Constraints getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getBackoffDelayDuration() {
        return this.backoffDelayDuration;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getMinimumRetentionDuration() {
        return this.minimumRetentionDuration;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getScheduleRequestedAt() {
        return this.scheduleRequestedAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getExpedited() {
        return this.expedited;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final OutOfQuotaPolicy getOutOfQuotaPolicy() {
        return this.outOfQuotaPolicy;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkInfo.State getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInputMergerClassName() {
        return this.inputMergerClassName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Data getInput() {
        return this.input;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Data getOutput() {
        return this.output;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getInitialDelay() {
        return this.initialDelay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFlexDuration() {
        return this.flexDuration;
    }

    @NotNull
    public final WorkSpec copy(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull String workerClassName, @Nullable String inputMergerClassName, @NotNull Data input, @NotNull Data output, long initialDelay, long intervalDuration, long flexDuration, @NotNull Constraints constraints, @IntRange(from = 0) int runAttemptCount, @NotNull BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int periodCount, int generation) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation);
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31;
        boolean z11 = this.expedited;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((((((iHashCode2 + r11) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation);
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setPeriodCount(int i11) {
        this.periodCount = i11;
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    public final long calculateNextRunTime() {
        long jScalb;
        if (isBackedOff()) {
            if (this.backoffPolicy == BackoffPolicy.LINEAR) {
                jScalb = this.backoffDelayDuration * ((long) this.runAttemptCount);
            } else {
                jScalb = (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1);
            }
            return this.lastEnqueueTime + RangesKt.coerceAtMost(jScalb, WorkRequest.MAX_BACKOFF_MILLIS);
        }
        long j11 = 0;
        if (isPeriodic()) {
            int i11 = this.periodCount;
            long j12 = this.lastEnqueueTime;
            if (i11 == 0) {
                j12 += this.initialDelay;
            }
            long j13 = this.flexDuration;
            long j14 = this.intervalDuration;
            if (j13 != j14) {
                if (i11 == 0) {
                    j11 = ((long) (-1)) * j13;
                }
                return j12 + j14 + j11;
            }
            if (i11 != 0) {
                j11 = j14;
            }
            return j12 + j11;
        }
        long jCurrentTimeMillis = this.lastEnqueueTime;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return jCurrentTimeMillis + this.initialDelay;
    }

    public final void setBackoffDelayDuration(long backoffDelayDuration) {
        if (backoffDelayDuration > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = RangesKt.coerceIn(backoffDelayDuration, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setPeriodic(long intervalDuration, long flexDuration) {
        if (intervalDuration < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = RangesKt.coerceAtLeast(intervalDuration, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (flexDuration < 300000) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = RangesKt.coerceIn(flexDuration, 300000L, this.intervalDuration);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j11, long j12, long j13, Constraints constraints, int i11, BackoffPolicy backoffPolicy, long j14, long j15, long j16, long j17, boolean z11, OutOfQuotaPolicy outOfQuotaPolicy, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        Data data3;
        Data data4;
        WorkInfo.State state2 = (i14 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        String str4 = (i14 & 8) != 0 ? null : str3;
        if ((i14 & 16) != 0) {
            Data EMPTY = Data.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            data3 = EMPTY;
        } else {
            data3 = data;
        }
        if ((i14 & 32) != 0) {
            Data EMPTY2 = Data.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            data4 = EMPTY2;
        } else {
            data4 = data2;
        }
        this(str, state2, str2, str4, data3, data4, (i14 & 64) != 0 ? 0L : j11, (i14 & 128) != 0 ? 0L : j12, (i14 & 256) != 0 ? 0L : j13, (i14 & 512) != 0 ? Constraints.NONE : constraints, (i14 & 1024) != 0 ? 0 : i11, (i14 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i14 & 4096) != 0 ? 30000L : j14, (i14 & 8192) != 0 ? 0L : j15, (i14 & 16384) != 0 ? 0L : j16, (32768 & i14) != 0 ? -1L : j17, (65536 & i14) != 0 ? false : z11, (131072 & i14) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i14) != 0 ? 0 : i12, (i14 & 524288) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(@NotNull String id2, @NotNull String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(@NotNull String newId, @NotNull WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
