package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegationRepaymentEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jz\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000205HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017¨\u0006A"}, m90084d2 = {"Lcom/kubi/margin/entity/DelegationRepaymentEntity;", "Landroid/os/Parcelable;", "actualAmount", "Ljava/math/BigDecimal;", "borrowerAccountTag", "", "borrowerAccountType", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "repayInterestAmount", "repayPrincipalAmount", "repayType", "status", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getActualAmount", "()Ljava/math/BigDecimal;", "setActualAmount", "(Ljava/math/BigDecimal;)V", "getBorrowerAccountTag", "()Ljava/lang/String;", "setBorrowerAccountTag", "(Ljava/lang/String;)V", "getBorrowerAccountType", "setBorrowerAccountType", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "setCurrency", "getRepayInterestAmount", "setRepayInterestAmount", "getRepayPrincipalAmount", "setRepayPrincipalAmount", "getRepayType", "setRepayType", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/margin/entity/DelegationRepaymentEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelegationRepaymentEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DelegationRepaymentEntity> CREATOR = new C17613a();

    @Nullable
    private BigDecimal actualAmount;

    @Nullable
    private String borrowerAccountTag;

    @Nullable
    private String borrowerAccountType;

    @Nullable
    private Long createdAt;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal repayInterestAmount;

    @Nullable
    private BigDecimal repayPrincipalAmount;

    @Nullable
    private String repayType;

    @Nullable
    private String status;

    /* JADX INFO: renamed from: com.kubi.margin.entity.DelegationRepaymentEntity$a */
    /* JADX INFO: compiled from: DelegationRepaymentEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17613a implements Parcelable.Creator<DelegationRepaymentEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelegationRepaymentEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DelegationRepaymentEntity((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DelegationRepaymentEntity[] newArray(int i11) {
            return new DelegationRepaymentEntity[i11];
        }
    }

    public DelegationRepaymentEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegationRepaymentEntity)) {
            return false;
        }
        DelegationRepaymentEntity delegationRepaymentEntity = (DelegationRepaymentEntity) other;
        return Intrinsics.areEqual(this.actualAmount, delegationRepaymentEntity.actualAmount) && Intrinsics.areEqual(this.borrowerAccountTag, delegationRepaymentEntity.borrowerAccountTag) && Intrinsics.areEqual(this.borrowerAccountType, delegationRepaymentEntity.borrowerAccountType) && Intrinsics.areEqual(this.createdAt, delegationRepaymentEntity.createdAt) && Intrinsics.areEqual(this.currency, delegationRepaymentEntity.currency) && Intrinsics.areEqual(this.repayInterestAmount, delegationRepaymentEntity.repayInterestAmount) && Intrinsics.areEqual(this.repayPrincipalAmount, delegationRepaymentEntity.repayPrincipalAmount) && Intrinsics.areEqual(this.repayType, delegationRepaymentEntity.repayType) && Intrinsics.areEqual(this.status, delegationRepaymentEntity.status);
    }

    public DelegationRepaymentEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str4, @Nullable String str5) {
        this.actualAmount = bigDecimal;
        this.borrowerAccountTag = str;
        this.borrowerAccountType = str2;
        this.createdAt = l11;
        this.currency = str3;
        this.repayInterestAmount = bigDecimal2;
        this.repayPrincipalAmount = bigDecimal3;
        this.repayType = str4;
        this.status = str5;
    }

    public static /* synthetic */ DelegationRepaymentEntity copy$default(DelegationRepaymentEntity delegationRepaymentEntity, BigDecimal bigDecimal, String str, String str2, Long l11, String str3, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = delegationRepaymentEntity.actualAmount;
        }
        if ((i11 & 2) != 0) {
            str = delegationRepaymentEntity.borrowerAccountTag;
        }
        if ((i11 & 4) != 0) {
            str2 = delegationRepaymentEntity.borrowerAccountType;
        }
        if ((i11 & 8) != 0) {
            l11 = delegationRepaymentEntity.createdAt;
        }
        if ((i11 & 16) != 0) {
            str3 = delegationRepaymentEntity.currency;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = delegationRepaymentEntity.repayInterestAmount;
        }
        if ((i11 & 64) != 0) {
            bigDecimal3 = delegationRepaymentEntity.repayPrincipalAmount;
        }
        if ((i11 & 128) != 0) {
            str4 = delegationRepaymentEntity.repayType;
        }
        if ((i11 & 256) != 0) {
            str5 = delegationRepaymentEntity.status;
        }
        String str6 = str4;
        String str7 = str5;
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        String str8 = str3;
        String str9 = str2;
        return delegationRepaymentEntity.copy(bigDecimal, str, str9, l11, str8, bigDecimal4, bigDecimal5, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getActualAmount() {
        return this.actualAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBorrowerAccountTag() {
        return this.borrowerAccountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBorrowerAccountType() {
        return this.borrowerAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getRepayInterestAmount() {
        return this.repayInterestAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getRepayPrincipalAmount() {
        return this.repayPrincipalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRepayType() {
        return this.repayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final DelegationRepaymentEntity copy(@Nullable BigDecimal actualAmount, @Nullable String borrowerAccountTag, @Nullable String borrowerAccountType, @Nullable Long createdAt, @Nullable String currency, @Nullable BigDecimal repayInterestAmount, @Nullable BigDecimal repayPrincipalAmount, @Nullable String repayType, @Nullable String status) {
        return new DelegationRepaymentEntity(actualAmount, borrowerAccountTag, borrowerAccountType, createdAt, currency, repayInterestAmount, repayPrincipalAmount, repayType, status);
    }

    @Nullable
    public final BigDecimal getActualAmount() {
        return this.actualAmount;
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
    public final BigDecimal getRepayInterestAmount() {
        return this.repayInterestAmount;
    }

    @Nullable
    public final BigDecimal getRepayPrincipalAmount() {
        return this.repayPrincipalAmount;
    }

    @Nullable
    public final String getRepayType() {
        return this.repayType;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.actualAmount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.borrowerAccountTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borrowerAccountType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.repayInterestAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.repayPrincipalAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str4 = this.repayType;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setActualAmount(@Nullable BigDecimal bigDecimal) {
        this.actualAmount = bigDecimal;
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

    public final void setRepayInterestAmount(@Nullable BigDecimal bigDecimal) {
        this.repayInterestAmount = bigDecimal;
    }

    public final void setRepayPrincipalAmount(@Nullable BigDecimal bigDecimal) {
        this.repayPrincipalAmount = bigDecimal;
    }

    public final void setRepayType(@Nullable String str) {
        this.repayType = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    @NotNull
    public String toString() {
        return "DelegationRepaymentEntity(actualAmount=" + this.actualAmount + ", borrowerAccountTag=" + this.borrowerAccountTag + ", borrowerAccountType=" + this.borrowerAccountType + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", repayInterestAmount=" + this.repayInterestAmount + ", repayPrincipalAmount=" + this.repayPrincipalAmount + ", repayType=" + this.repayType + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.actualAmount);
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
        dest.writeSerializable(this.repayInterestAmount);
        dest.writeSerializable(this.repayPrincipalAmount);
        dest.writeString(this.repayType);
        dest.writeString(this.status);
    }

    public /* synthetic */ DelegationRepaymentEntity(BigDecimal bigDecimal, String str, String str2, Long l11, String str3, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? null : bigDecimal3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5);
    }
}
