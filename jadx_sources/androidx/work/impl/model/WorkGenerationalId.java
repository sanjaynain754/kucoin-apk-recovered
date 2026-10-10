package androidx.work.impl.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m90084d2 = {"Landroidx/work/impl/model/WorkGenerationalId;", "", "workSpecId", "", "generation", "", "(Ljava/lang/String;I)V", "getGeneration", "()I", "getWorkSpecId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class WorkGenerationalId {
    private final int generation;

    @NotNull
    private final String workSpecId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) other;
        return Intrinsics.areEqual(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i12 & 2) != 0) {
            i11 = workGenerationalId.generation;
        }
        return workGenerationalId.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + Integer.hashCode(this.generation);
    }

    @NotNull
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ')';
    }

    public WorkGenerationalId(@NotNull String workSpecId, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i11;
    }

    @NotNull
    public final WorkGenerationalId copy(@NotNull String workSpecId, int generation) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, generation);
    }
}
