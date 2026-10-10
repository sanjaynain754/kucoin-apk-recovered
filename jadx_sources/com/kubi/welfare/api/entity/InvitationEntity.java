package com.kubi.welfare.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InvitationEntity.kt */
/* JADX INFO: loaded from: classes58.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0002\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/InvitationEntity;", "Landroid/os/Parcelable;", "isAffiliate", "", "isBlackRegion", "hasAvailablePrize", "starNum", "", "dailyRebate", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/math/BigDecimal;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasAvailablePrize", "getStarNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRebate", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/math/BigDecimal;)Lcom/kubi/welfare/api/entity/InvitationEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class InvitationEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvitationEntity> CREATOR = new C27122a();

    @Nullable
    private final BigDecimal dailyRebate;

    @Nullable
    private final Boolean hasAvailablePrize;

    @Nullable
    private final Boolean isAffiliate;

    @Nullable
    private final Boolean isBlackRegion;

    @Nullable
    private final Integer starNum;

    /* JADX INFO: renamed from: com.kubi.welfare.api.entity.InvitationEntity$a */
    /* JADX INFO: compiled from: InvitationEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27122a implements Parcelable.Creator<InvitationEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InvitationEntity createFromParcel(Parcel parcel) {
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
            return new InvitationEntity(boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InvitationEntity[] newArray(int i11) {
            return new InvitationEntity[i11];
        }
    }

    public static /* synthetic */ InvitationEntity copy$default(InvitationEntity invitationEntity, Boolean bool, Boolean bool2, Boolean bool3, Integer num, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = invitationEntity.isAffiliate;
        }
        if ((i11 & 2) != 0) {
            bool2 = invitationEntity.isBlackRegion;
        }
        if ((i11 & 4) != 0) {
            bool3 = invitationEntity.hasAvailablePrize;
        }
        if ((i11 & 8) != 0) {
            num = invitationEntity.starNum;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = invitationEntity.dailyRebate;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        Boolean bool4 = bool3;
        return invitationEntity.copy(bool, bool2, bool4, num, bigDecimal2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitationEntity)) {
            return false;
        }
        InvitationEntity invitationEntity = (InvitationEntity) other;
        return Intrinsics.areEqual(this.isAffiliate, invitationEntity.isAffiliate) && Intrinsics.areEqual(this.isBlackRegion, invitationEntity.isBlackRegion) && Intrinsics.areEqual(this.hasAvailablePrize, invitationEntity.hasAvailablePrize) && Intrinsics.areEqual(this.starNum, invitationEntity.starNum) && Intrinsics.areEqual(this.dailyRebate, invitationEntity.dailyRebate);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isAffiliate;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isBlackRegion;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.hasAvailablePrize;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num = this.starNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeSerializable(this.dailyRebate);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAffiliate() {
        return this.isAffiliate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsBlackRegion() {
        return this.isBlackRegion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasAvailablePrize() {
        return this.hasAvailablePrize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStarNum() {
        return this.starNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getDailyRebate() {
        return this.dailyRebate;
    }

    @NotNull
    public final InvitationEntity copy(@Nullable Boolean isAffiliate, @Nullable Boolean isBlackRegion, @Nullable Boolean hasAvailablePrize, @Nullable Integer starNum, @Nullable BigDecimal dailyRebate) {
        return new InvitationEntity(isAffiliate, isBlackRegion, hasAvailablePrize, starNum, dailyRebate);
    }

    @Nullable
    public final BigDecimal getDailyRebate() {
        return this.dailyRebate;
    }

    @Nullable
    public final Boolean getHasAvailablePrize() {
        return this.hasAvailablePrize;
    }

    @Nullable
    public final Integer getStarNum() {
        return this.starNum;
    }

    public int hashCode() {
        Boolean bool = this.isAffiliate;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isBlackRegion;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasAvailablePrize;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.starNum;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal = this.dailyRebate;
        return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAffiliate() {
        return this.isAffiliate;
    }

    @Nullable
    public final Boolean isBlackRegion() {
        return this.isBlackRegion;
    }

    @NotNull
    public String toString() {
        return "InvitationEntity(isAffiliate=" + this.isAffiliate + ", isBlackRegion=" + this.isBlackRegion + ", hasAvailablePrize=" + this.hasAvailablePrize + ", starNum=" + this.starNum + ", dailyRebate=" + this.dailyRebate + ')';
    }

    public InvitationEntity(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable BigDecimal bigDecimal) {
        this.isAffiliate = bool;
        this.isBlackRegion = bool2;
        this.hasAvailablePrize = bool3;
        this.starNum = num;
        this.dailyRebate = bigDecimal;
    }
}
