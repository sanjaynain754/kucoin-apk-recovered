package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegationInterestEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001d¨\u00065"}, m90084d2 = {"Lcom/kubi/margin/entity/DelegationInterestEntity;", "Landroid/os/Parcelable;", "borrowerAccountTag", "", "borrowerAccountType", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "dayRatio", "Ljava/math/BigDecimal;", "interestAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBorrowerAccountTag", "()Ljava/lang/String;", "setBorrowerAccountTag", "(Ljava/lang/String;)V", "getBorrowerAccountType", "setBorrowerAccountType", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "setCurrency", "getDayRatio", "()Ljava/math/BigDecimal;", "setDayRatio", "(Ljava/math/BigDecimal;)V", "getInterestAmount", "setInterestAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/margin/entity/DelegationInterestEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelegationInterestEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DelegationInterestEntity> CREATOR = new C17611a();

    @Nullable
    private String borrowerAccountTag;

    @Nullable
    private String borrowerAccountType;

    @Nullable
    private Long createdAt;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal dayRatio;

    @Nullable
    private BigDecimal interestAmount;

    /* JADX INFO: renamed from: com.kubi.margin.entity.DelegationInterestEntity$a */
    /* JADX INFO: compiled from: DelegationInterestEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17611a implements Parcelable.Creator<DelegationInterestEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelegationInterestEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DelegationInterestEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DelegationInterestEntity[] newArray(int i11) {
            return new DelegationInterestEntity[i11];
        }
    }

    public DelegationInterestEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegationInterestEntity)) {
            return false;
        }
        DelegationInterestEntity delegationInterestEntity = (DelegationInterestEntity) other;
        return Intrinsics.areEqual(this.borrowerAccountTag, delegationInterestEntity.borrowerAccountTag) && Intrinsics.areEqual(this.borrowerAccountType, delegationInterestEntity.borrowerAccountType) && Intrinsics.areEqual(this.createdAt, delegationInterestEntity.createdAt) && Intrinsics.areEqual(this.currency, delegationInterestEntity.currency) && Intrinsics.areEqual(this.dayRatio, delegationInterestEntity.dayRatio) && Intrinsics.areEqual(this.interestAmount, delegationInterestEntity.interestAmount);
    }

    public DelegationInterestEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.borrowerAccountTag = str;
        this.borrowerAccountType = str2;
        this.createdAt = l11;
        this.currency = str3;
        this.dayRatio = bigDecimal;
        this.interestAmount = bigDecimal2;
    }

    public static /* synthetic */ DelegationInterestEntity copy$default(DelegationInterestEntity delegationInterestEntity, String str, String str2, Long l11, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = delegationInterestEntity.borrowerAccountTag;
        }
        if ((i11 & 2) != 0) {
            str2 = delegationInterestEntity.borrowerAccountType;
        }
        if ((i11 & 4) != 0) {
            l11 = delegationInterestEntity.createdAt;
        }
        if ((i11 & 8) != 0) {
            str3 = delegationInterestEntity.currency;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = delegationInterestEntity.dayRatio;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = delegationInterestEntity.interestAmount;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        return delegationInterestEntity.copy(str, str2, l11, str3, bigDecimal3, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBorrowerAccountTag() {
        return this.borrowerAccountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBorrowerAccountType() {
        return this.borrowerAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getDayRatio() {
        return this.dayRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getInterestAmount() {
        return this.interestAmount;
    }

    @NotNull
    public final DelegationInterestEntity copy(@Nullable String borrowerAccountTag, @Nullable String borrowerAccountType, @Nullable Long createdAt, @Nullable String currency, @Nullable BigDecimal dayRatio, @Nullable BigDecimal interestAmount) {
        return new DelegationInterestEntity(borrowerAccountTag, borrowerAccountType, createdAt, currency, dayRatio, interestAmount);
    }

    @Nullable
    public final String getBorrowerAccountTag() {
        return this.borrowerAccountTag;
    }

    @Nullable
    public final String getBorrowerAccountType() {
        return this.borrowerAccountType;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDayRatio() {
        return this.dayRatio;
    }

    @Nullable
    public final BigDecimal getInterestAmount() {
        return this.interestAmount;
    }

    public int hashCode() {
        String str = this.borrowerAccountTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.borrowerAccountType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.dayRatio;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.interestAmount;
        return iHashCode5 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public final void setBorrowerAccountTag(@Nullable String str) {
        this.borrowerAccountTag = str;
    }

    public final void setBorrowerAccountType(@Nullable String str) {
        this.borrowerAccountType = str;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setDayRatio(@Nullable BigDecimal bigDecimal) {
        this.dayRatio = bigDecimal;
    }

    public final void setInterestAmount(@Nullable BigDecimal bigDecimal) {
        this.interestAmount = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "DelegationInterestEntity(borrowerAccountTag=" + this.borrowerAccountTag + ", borrowerAccountType=" + this.borrowerAccountType + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", dayRatio=" + this.dayRatio + ", interestAmount=" + this.interestAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.borrowerAccountTag);
        dest.writeString(this.borrowerAccountType);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.dayRatio);
        dest.writeSerializable(this.interestAmount);
    }

    public /* synthetic */ DelegationInterestEntity(String str, String str2, Long l11, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2);
    }
}
