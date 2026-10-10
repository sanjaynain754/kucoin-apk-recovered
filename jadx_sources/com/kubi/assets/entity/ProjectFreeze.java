package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/entity/ProjectFreeze;", "Landroid/os/Parcelable;", "amount", "", "operateTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getAmount", "()Ljava/lang/String;", "getOperateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/assets/entity/ProjectFreeze;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ProjectFreeze implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProjectFreeze> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final Long operateTime;

    /* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ProjectFreeze> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProjectFreeze createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProjectFreeze(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProjectFreeze[] newArray(int i11) {
            return new ProjectFreeze[i11];
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
        if (!(other instanceof ProjectFreeze)) {
            return false;
        }
        ProjectFreeze projectFreeze = (ProjectFreeze) other;
        return Intrinsics.areEqual(this.amount, projectFreeze.amount) && Intrinsics.areEqual(this.operateTime, projectFreeze.operateTime);
    }

    public static /* synthetic */ ProjectFreeze copy$default(ProjectFreeze projectFreeze, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = projectFreeze.amount;
        }
        if ((i11 & 2) != 0) {
            l11 = projectFreeze.operateTime;
        }
        return projectFreeze.copy(str, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getOperateTime() {
        return this.operateTime;
    }

    @NotNull
    public final ProjectFreeze copy(@Nullable String amount, @Nullable Long operateTime) {
        return new ProjectFreeze(amount, operateTime);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getOperateTime() {
        return this.operateTime;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.operateTime;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProjectFreeze(amount=" + this.amount + ", operateTime=" + this.operateTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        Long l11 = this.operateTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public ProjectFreeze(@Nullable String str, @Nullable Long l11) {
        this.amount = str;
        this.operateTime = l11;
    }
}
