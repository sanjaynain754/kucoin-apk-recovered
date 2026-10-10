package com.kubi.futures.data.compliance.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EuropeUnlockLeverageLevelTaskEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.LEVEL, "", "taskName", "", "status", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getLevel", "()I", "getTaskName", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeUnlockLeverageLevelTaskEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EuropeUnlockLeverageLevelTaskEntity> CREATOR = new C12940a();
    private final int level;

    @NotNull
    private final String status;

    @NotNull
    private final String taskName;

    /* JADX INFO: renamed from: com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity$a */
    /* JADX INFO: compiled from: EuropeUnlockLeverageLevelTaskEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12940a implements Parcelable.Creator<EuropeUnlockLeverageLevelTaskEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EuropeUnlockLeverageLevelTaskEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EuropeUnlockLeverageLevelTaskEntity(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EuropeUnlockLeverageLevelTaskEntity[] newArray(int i11) {
            return new EuropeUnlockLeverageLevelTaskEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EuropeUnlockLeverageLevelTaskEntity)) {
            return false;
        }
        EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity = (EuropeUnlockLeverageLevelTaskEntity) other;
        return this.level == europeUnlockLeverageLevelTaskEntity.level && Intrinsics.areEqual(this.taskName, europeUnlockLeverageLevelTaskEntity.taskName) && Intrinsics.areEqual(this.status, europeUnlockLeverageLevelTaskEntity.status);
    }

    public EuropeUnlockLeverageLevelTaskEntity(int i11, @NotNull String taskName, @NotNull String status) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.level = i11;
        this.taskName = taskName;
        this.status = status;
    }

    public static /* synthetic */ EuropeUnlockLeverageLevelTaskEntity copy$default(EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = europeUnlockLeverageLevelTaskEntity.level;
        }
        if ((i12 & 2) != 0) {
            str = europeUnlockLeverageLevelTaskEntity.taskName;
        }
        if ((i12 & 4) != 0) {
            str2 = europeUnlockLeverageLevelTaskEntity.status;
        }
        return europeUnlockLeverageLevelTaskEntity.copy(i11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final EuropeUnlockLeverageLevelTaskEntity copy(int level, @NotNull String taskName, @NotNull String status) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new EuropeUnlockLeverageLevelTaskEntity(level, taskName, status);
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.level) * 31) + this.taskName.hashCode()) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "EuropeUnlockLeverageLevelTaskEntity(level=" + this.level + ", taskName=" + this.taskName + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.level);
        dest.writeString(this.taskName);
        dest.writeString(this.status);
    }
}
