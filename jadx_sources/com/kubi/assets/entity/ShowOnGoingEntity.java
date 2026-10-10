package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/entity/ShowOnGoingEntity;", "Landroid/os/Parcelable;", "isShowOngoingMargin", "", "isShowOngoingEarn", "isShowOngoingBot", "earnSize", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "setShowOngoingMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setShowOngoingEarn", "setShowOngoingBot", "getEarnSize", "()Ljava/lang/Integer;", "setEarnSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/assets/entity/ShowOnGoingEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShowOnGoingEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShowOnGoingEntity> CREATOR = new Creator();

    @Nullable
    private Integer earnSize;

    @Nullable
    private Boolean isShowOngoingBot;

    @Nullable
    private Boolean isShowOngoingEarn;

    @Nullable
    private Boolean isShowOngoingMargin;

    /* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ShowOnGoingEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowOnGoingEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShowOnGoingEntity(boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowOnGoingEntity[] newArray(int i11) {
            return new ShowOnGoingEntity[i11];
        }
    }

    public ShowOnGoingEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowOnGoingEntity)) {
            return false;
        }
        ShowOnGoingEntity showOnGoingEntity = (ShowOnGoingEntity) other;
        return Intrinsics.areEqual(this.isShowOngoingMargin, showOnGoingEntity.isShowOngoingMargin) && Intrinsics.areEqual(this.isShowOngoingEarn, showOnGoingEntity.isShowOngoingEarn) && Intrinsics.areEqual(this.isShowOngoingBot, showOnGoingEntity.isShowOngoingBot) && Intrinsics.areEqual(this.earnSize, showOnGoingEntity.earnSize);
    }

    public ShowOnGoingEntity(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num) {
        this.isShowOngoingMargin = bool;
        this.isShowOngoingEarn = bool2;
        this.isShowOngoingBot = bool3;
        this.earnSize = num;
    }

    public static /* synthetic */ ShowOnGoingEntity copy$default(ShowOnGoingEntity showOnGoingEntity, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = showOnGoingEntity.isShowOngoingMargin;
        }
        if ((i11 & 2) != 0) {
            bool2 = showOnGoingEntity.isShowOngoingEarn;
        }
        if ((i11 & 4) != 0) {
            bool3 = showOnGoingEntity.isShowOngoingBot;
        }
        if ((i11 & 8) != 0) {
            num = showOnGoingEntity.earnSize;
        }
        return showOnGoingEntity.copy(bool, bool2, bool3, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsShowOngoingMargin() {
        return this.isShowOngoingMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsShowOngoingEarn() {
        return this.isShowOngoingEarn;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsShowOngoingBot() {
        return this.isShowOngoingBot;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getEarnSize() {
        return this.earnSize;
    }

    @NotNull
    public final ShowOnGoingEntity copy(@Nullable Boolean isShowOngoingMargin, @Nullable Boolean isShowOngoingEarn, @Nullable Boolean isShowOngoingBot, @Nullable Integer earnSize) {
        return new ShowOnGoingEntity(isShowOngoingMargin, isShowOngoingEarn, isShowOngoingBot, earnSize);
    }

    @Nullable
    public final Integer getEarnSize() {
        return this.earnSize;
    }

    public int hashCode() {
        Boolean bool = this.isShowOngoingMargin;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isShowOngoingEarn;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isShowOngoingBot;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.earnSize;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @Nullable
    public final Boolean isShowOngoingBot() {
        return this.isShowOngoingBot;
    }

    @Nullable
    public final Boolean isShowOngoingEarn() {
        return this.isShowOngoingEarn;
    }

    @Nullable
    public final Boolean isShowOngoingMargin() {
        return this.isShowOngoingMargin;
    }

    public final void setEarnSize(@Nullable Integer num) {
        this.earnSize = num;
    }

    public final void setShowOngoingBot(@Nullable Boolean bool) {
        this.isShowOngoingBot = bool;
    }

    public final void setShowOngoingEarn(@Nullable Boolean bool) {
        this.isShowOngoingEarn = bool;
    }

    public final void setShowOngoingMargin(@Nullable Boolean bool) {
        this.isShowOngoingMargin = bool;
    }

    @NotNull
    public String toString() {
        return "ShowOnGoingEntity(isShowOngoingMargin=" + this.isShowOngoingMargin + ", isShowOngoingEarn=" + this.isShowOngoingEarn + ", isShowOngoingBot=" + this.isShowOngoingBot + ", earnSize=" + this.earnSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isShowOngoingMargin;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isShowOngoingEarn;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isShowOngoingBot;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num = this.earnSize;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ ShowOnGoingEntity(Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3, (i11 & 8) != 0 ? null : num);
    }
}
