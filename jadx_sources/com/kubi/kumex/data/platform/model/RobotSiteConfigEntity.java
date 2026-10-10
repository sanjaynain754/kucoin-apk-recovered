package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RobotSiteConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;", "Landroid/os/Parcelable;", "isSupportFutures", "", "isSupportSpot", "isSupportMargin", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RobotSiteConfigEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RobotSiteConfigEntity> CREATOR = new C15823a();

    @Nullable
    private final Boolean isSupportFutures;

    @Nullable
    private final Boolean isSupportMargin;

    @Nullable
    private final Boolean isSupportSpot;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.RobotSiteConfigEntity$a */
    /* JADX INFO: compiled from: RobotSiteConfigEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15823a implements Parcelable.Creator<RobotSiteConfigEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotSiteConfigEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RobotSiteConfigEntity(boolValueOf, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RobotSiteConfigEntity[] newArray(int i11) {
            return new RobotSiteConfigEntity[i11];
        }
    }

    public RobotSiteConfigEntity() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobotSiteConfigEntity)) {
            return false;
        }
        RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) other;
        return Intrinsics.areEqual(this.isSupportFutures, robotSiteConfigEntity.isSupportFutures) && Intrinsics.areEqual(this.isSupportSpot, robotSiteConfigEntity.isSupportSpot) && Intrinsics.areEqual(this.isSupportMargin, robotSiteConfigEntity.isSupportMargin);
    }

    public RobotSiteConfigEntity(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.isSupportFutures = bool;
        this.isSupportSpot = bool2;
        this.isSupportMargin = bool3;
    }

    public static /* synthetic */ RobotSiteConfigEntity copy$default(RobotSiteConfigEntity robotSiteConfigEntity, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = robotSiteConfigEntity.isSupportFutures;
        }
        if ((i11 & 2) != 0) {
            bool2 = robotSiteConfigEntity.isSupportSpot;
        }
        if ((i11 & 4) != 0) {
            bool3 = robotSiteConfigEntity.isSupportMargin;
        }
        return robotSiteConfigEntity.copy(bool, bool2, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsSupportFutures() {
        return this.isSupportFutures;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsSupportSpot() {
        return this.isSupportSpot;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsSupportMargin() {
        return this.isSupportMargin;
    }

    @NotNull
    public final RobotSiteConfigEntity copy(@Nullable Boolean isSupportFutures, @Nullable Boolean isSupportSpot, @Nullable Boolean isSupportMargin) {
        return new RobotSiteConfigEntity(isSupportFutures, isSupportSpot, isSupportMargin);
    }

    public int hashCode() {
        Boolean bool = this.isSupportFutures;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isSupportSpot;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSupportMargin;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSupportFutures() {
        return this.isSupportFutures;
    }

    @Nullable
    public final Boolean isSupportMargin() {
        return this.isSupportMargin;
    }

    @Nullable
    public final Boolean isSupportSpot() {
        return this.isSupportSpot;
    }

    @NotNull
    public String toString() {
        return "RobotSiteConfigEntity(isSupportFutures=" + this.isSupportFutures + ", isSupportSpot=" + this.isSupportSpot + ", isSupportMargin=" + this.isSupportMargin + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isSupportFutures;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isSupportSpot;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isSupportMargin;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ RobotSiteConfigEntity(Boolean bool, Boolean bool2, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3);
    }
}
