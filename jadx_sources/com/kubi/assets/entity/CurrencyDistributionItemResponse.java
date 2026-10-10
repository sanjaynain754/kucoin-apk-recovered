package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017JJ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\nJ\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;", "Landroid/os/Parcelable;", "businessType", "Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;", "totalAmount", "Ljava/math/BigDecimal;", "proportion", "isShowOnGoing", "", "onGoingCount", "", "<init>", "(Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getBusinessType", "()Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;", "getTotalAmount", "()Ljava/math/BigDecimal;", "getProportion", "()Ljava/lang/Boolean;", "setShowOnGoing", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getOnGoingCount", "()Ljava/lang/Integer;", "setOnGoingCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyDistributionItemResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyDistributionItemResponse> CREATOR = new Creator();

    @Nullable
    private final CurrencyBusinessDistributionTypeEnum businessType;

    @Nullable
    private Boolean isShowOnGoing;

    @Nullable
    private Integer onGoingCount;

    @Nullable
    private final BigDecimal proportion;

    @Nullable
    private final BigDecimal totalAmount;

    /* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrencyDistributionItemResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyDistributionItemResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CurrencyBusinessDistributionTypeEnum currencyBusinessDistributionTypeEnumValueOf = parcel.readInt() == 0 ? null : CurrencyBusinessDistributionTypeEnum.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CurrencyDistributionItemResponse(currencyBusinessDistributionTypeEnumValueOf, bigDecimal, bigDecimal2, boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyDistributionItemResponse[] newArray(int i11) {
            return new CurrencyDistributionItemResponse[i11];
        }
    }

    public CurrencyDistributionItemResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyDistributionItemResponse)) {
            return false;
        }
        CurrencyDistributionItemResponse currencyDistributionItemResponse = (CurrencyDistributionItemResponse) other;
        return this.businessType == currencyDistributionItemResponse.businessType && Intrinsics.areEqual(this.totalAmount, currencyDistributionItemResponse.totalAmount) && Intrinsics.areEqual(this.proportion, currencyDistributionItemResponse.proportion) && Intrinsics.areEqual(this.isShowOnGoing, currencyDistributionItemResponse.isShowOnGoing) && Intrinsics.areEqual(this.onGoingCount, currencyDistributionItemResponse.onGoingCount);
    }

    public CurrencyDistributionItemResponse(@Nullable CurrencyBusinessDistributionTypeEnum currencyBusinessDistributionTypeEnum, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool, @Nullable Integer num) {
        this.businessType = currencyBusinessDistributionTypeEnum;
        this.totalAmount = bigDecimal;
        this.proportion = bigDecimal2;
        this.isShowOnGoing = bool;
        this.onGoingCount = num;
    }

    public static /* synthetic */ CurrencyDistributionItemResponse copy$default(CurrencyDistributionItemResponse currencyDistributionItemResponse, CurrencyBusinessDistributionTypeEnum currencyBusinessDistributionTypeEnum, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            currencyBusinessDistributionTypeEnum = currencyDistributionItemResponse.businessType;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = currencyDistributionItemResponse.totalAmount;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = currencyDistributionItemResponse.proportion;
        }
        if ((i11 & 8) != 0) {
            bool = currencyDistributionItemResponse.isShowOnGoing;
        }
        if ((i11 & 16) != 0) {
            num = currencyDistributionItemResponse.onGoingCount;
        }
        Integer num2 = num;
        BigDecimal bigDecimal3 = bigDecimal2;
        return currencyDistributionItemResponse.copy(currencyBusinessDistributionTypeEnum, bigDecimal, bigDecimal3, bool, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CurrencyBusinessDistributionTypeEnum getBusinessType() {
        return this.businessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getProportion() {
        return this.proportion;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsShowOnGoing() {
        return this.isShowOnGoing;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getOnGoingCount() {
        return this.onGoingCount;
    }

    @NotNull
    public final CurrencyDistributionItemResponse copy(@Nullable CurrencyBusinessDistributionTypeEnum businessType, @Nullable BigDecimal totalAmount, @Nullable BigDecimal proportion, @Nullable Boolean isShowOnGoing, @Nullable Integer onGoingCount) {
        return new CurrencyDistributionItemResponse(businessType, totalAmount, proportion, isShowOnGoing, onGoingCount);
    }

    @Nullable
    public final CurrencyBusinessDistributionTypeEnum getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final Integer getOnGoingCount() {
        return this.onGoingCount;
    }

    @Nullable
    public final BigDecimal getProportion() {
        return this.proportion;
    }

    @Nullable
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        CurrencyBusinessDistributionTypeEnum currencyBusinessDistributionTypeEnum = this.businessType;
        int iHashCode = (currencyBusinessDistributionTypeEnum == null ? 0 : currencyBusinessDistributionTypeEnum.hashCode()) * 31;
        BigDecimal bigDecimal = this.totalAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.proportion;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.isShowOnGoing;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.onGoingCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Nullable
    public final Boolean isShowOnGoing() {
        return this.isShowOnGoing;
    }

    public final void setOnGoingCount(@Nullable Integer num) {
        this.onGoingCount = num;
    }

    public final void setShowOnGoing(@Nullable Boolean bool) {
        this.isShowOnGoing = bool;
    }

    @NotNull
    public String toString() {
        return "CurrencyDistributionItemResponse(businessType=" + this.businessType + ", totalAmount=" + this.totalAmount + ", proportion=" + this.proportion + ", isShowOnGoing=" + this.isShowOnGoing + ", onGoingCount=" + this.onGoingCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CurrencyBusinessDistributionTypeEnum currencyBusinessDistributionTypeEnum = this.businessType;
        if (currencyBusinessDistributionTypeEnum == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(currencyBusinessDistributionTypeEnum.name());
        }
        dest.writeSerializable(this.totalAmount);
        dest.writeSerializable(this.proportion);
        Boolean bool = this.isShowOnGoing;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.onGoingCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ CurrencyDistributionItemResponse(CurrencyBusinessDistributionTypeEnum currencyBusinessDistributionTypeEnum, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : currencyBusinessDistributionTypeEnum, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? null : num);
    }
}
