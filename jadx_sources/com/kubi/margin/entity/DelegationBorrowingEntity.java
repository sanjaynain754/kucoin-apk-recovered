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

/* JADX INFO: compiled from: DelegationBorrowingEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012¨\u0006="}, m90084d2 = {"Lcom/kubi/margin/entity/DelegationBorrowingEntity;", "Landroid/os/Parcelable;", "bizType", "", "borrowAmount", "Ljava/math/BigDecimal;", "borrowerAccountTag", "borrowerAccountType", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "interestAmount", "status", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "getBorrowAmount", "()Ljava/math/BigDecimal;", "setBorrowAmount", "(Ljava/math/BigDecimal;)V", "getBorrowerAccountTag", "setBorrowerAccountTag", "getBorrowerAccountType", "setBorrowerAccountType", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "setCurrency", "getInterestAmount", "setInterestAmount", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/kubi/margin/entity/DelegationBorrowingEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelegationBorrowingEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DelegationBorrowingEntity> CREATOR = new C17610a();

    @Nullable
    private String bizType;

    @Nullable
    private BigDecimal borrowAmount;

    @Nullable
    private String borrowerAccountTag;

    @Nullable
    private String borrowerAccountType;

    @Nullable
    private Long createdAt;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal interestAmount;

    @Nullable
    private String status;

    /* JADX INFO: renamed from: com.kubi.margin.entity.DelegationBorrowingEntity$a */
    /* JADX INFO: compiled from: DelegationBorrowingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17610a implements Parcelable.Creator<DelegationBorrowingEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelegationBorrowingEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DelegationBorrowingEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DelegationBorrowingEntity[] newArray(int i11) {
            return new DelegationBorrowingEntity[i11];
        }
    }

    public DelegationBorrowingEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegationBorrowingEntity)) {
            return false;
        }
        DelegationBorrowingEntity delegationBorrowingEntity = (DelegationBorrowingEntity) other;
        return Intrinsics.areEqual(this.bizType, delegationBorrowingEntity.bizType) && Intrinsics.areEqual(this.borrowAmount, delegationBorrowingEntity.borrowAmount) && Intrinsics.areEqual(this.borrowerAccountTag, delegationBorrowingEntity.borrowerAccountTag) && Intrinsics.areEqual(this.borrowerAccountType, delegationBorrowingEntity.borrowerAccountType) && Intrinsics.areEqual(this.createdAt, delegationBorrowingEntity.createdAt) && Intrinsics.areEqual(this.currency, delegationBorrowingEntity.currency) && Intrinsics.areEqual(this.interestAmount, delegationBorrowingEntity.interestAmount) && Intrinsics.areEqual(this.status, delegationBorrowingEntity.status);
    }

    public DelegationBorrowingEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable BigDecimal bigDecimal2, @Nullable String str5) {
        this.bizType = str;
        this.borrowAmount = bigDecimal;
        this.borrowerAccountTag = str2;
        this.borrowerAccountType = str3;
        this.createdAt = l11;
        this.currency = str4;
        this.interestAmount = bigDecimal2;
        this.status = str5;
    }

    public static /* synthetic */ DelegationBorrowingEntity copy$default(DelegationBorrowingEntity delegationBorrowingEntity, String str, BigDecimal bigDecimal, String str2, String str3, Long l11, String str4, BigDecimal bigDecimal2, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = delegationBorrowingEntity.bizType;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = delegationBorrowingEntity.borrowAmount;
        }
        if ((i11 & 4) != 0) {
            str2 = delegationBorrowingEntity.borrowerAccountTag;
        }
        if ((i11 & 8) != 0) {
            str3 = delegationBorrowingEntity.borrowerAccountType;
        }
        if ((i11 & 16) != 0) {
            l11 = delegationBorrowingEntity.createdAt;
        }
        if ((i11 & 32) != 0) {
            str4 = delegationBorrowingEntity.currency;
        }
        if ((i11 & 64) != 0) {
            bigDecimal2 = delegationBorrowingEntity.interestAmount;
        }
        if ((i11 & 128) != 0) {
            str5 = delegationBorrowingEntity.status;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        String str6 = str5;
        Long l12 = l11;
        String str7 = str4;
        return delegationBorrowingEntity.copy(str, bigDecimal, str2, str3, l12, str7, bigDecimal3, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getBorrowAmount() {
        return this.borrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBorrowerAccountTag() {
        return this.borrowerAccountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBorrowerAccountType() {
        return this.borrowerAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getInterestAmount() {
        return this.interestAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final DelegationBorrowingEntity copy(@Nullable String bizType, @Nullable BigDecimal borrowAmount, @Nullable String borrowerAccountTag, @Nullable String borrowerAccountType, @Nullable Long createdAt, @Nullable String currency, @Nullable BigDecimal interestAmount, @Nullable String status) {
        return new DelegationBorrowingEntity(bizType, borrowAmount, borrowerAccountTag, borrowerAccountType, createdAt, currency, interestAmount, status);
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final BigDecimal getBorrowAmount() {
        return this.borrowAmount;
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
    public final BigDecimal getInterestAmount() {
        return this.interestAmount;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.bizType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.borrowAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.borrowerAccountTag;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.borrowerAccountType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.interestAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str5 = this.status;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBizType(@Nullable String str) {
        this.bizType = str;
    }

    public final void setBorrowAmount(@Nullable BigDecimal bigDecimal) {
        this.borrowAmount = bigDecimal;
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

    public final void setInterestAmount(@Nullable BigDecimal bigDecimal) {
        this.interestAmount = bigDecimal;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    @NotNull
    public String toString() {
        return "DelegationBorrowingEntity(bizType=" + this.bizType + ", borrowAmount=" + this.borrowAmount + ", borrowerAccountTag=" + this.borrowerAccountTag + ", borrowerAccountType=" + this.borrowerAccountType + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", interestAmount=" + this.interestAmount + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bizType);
        dest.writeSerializable(this.borrowAmount);
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
        dest.writeSerializable(this.interestAmount);
        dest.writeString(this.status);
    }

    public /* synthetic */ DelegationBorrowingEntity(String str, BigDecimal bigDecimal, String str2, String str3, Long l11, String str4, BigDecimal bigDecimal2, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : str5);
    }
}
