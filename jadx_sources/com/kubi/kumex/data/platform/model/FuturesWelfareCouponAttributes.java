package com.kubi.kumex.data.platform.model;

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

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJz\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u000eJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u000eHÖ\u0001J\t\u00101\u001a\u00020\bHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00067"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "Landroid/os/Parcelable;", "faceValue", "Ljava/math/BigDecimal;", "deductionRatio", "deductedAmount", "remainAmount", "couponAlias", "", "status", "validPeriod", "", FirebaseAnalytics.Param.CURRENCY, "tradeMode", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getFaceValue", "()Ljava/math/BigDecimal;", "getDeductionRatio", "getDeductedAmount", "getRemainAmount", "getCouponAlias", "()Ljava/lang/String;", "getStatus", "getValidPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getTradeMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareCouponAttributes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareCouponAttributes> CREATOR = new C15803a();

    @Nullable
    private final String couponAlias;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal deductedAmount;

    @Nullable
    private final BigDecimal deductionRatio;

    @Nullable
    private final BigDecimal faceValue;

    @Nullable
    private final BigDecimal remainAmount;

    @Nullable
    private final String status;

    @Nullable
    private final Integer tradeMode;

    @Nullable
    private final Long validPeriod;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareCouponAttributes$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15803a implements Parcelable.Creator<FuturesWelfareCouponAttributes> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareCouponAttributes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesWelfareCouponAttributes((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareCouponAttributes[] newArray(int i11) {
            return new FuturesWelfareCouponAttributes[i11];
        }
    }

    public FuturesWelfareCouponAttributes(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable Integer num) {
        this.faceValue = bigDecimal;
        this.deductionRatio = bigDecimal2;
        this.deductedAmount = bigDecimal3;
        this.remainAmount = bigDecimal4;
        this.couponAlias = str;
        this.status = str2;
        this.validPeriod = l11;
        this.currency = str3;
        this.tradeMode = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWelfareCouponAttributes)) {
            return false;
        }
        FuturesWelfareCouponAttributes futuresWelfareCouponAttributes = (FuturesWelfareCouponAttributes) other;
        return Intrinsics.areEqual(this.faceValue, futuresWelfareCouponAttributes.faceValue) && Intrinsics.areEqual(this.deductionRatio, futuresWelfareCouponAttributes.deductionRatio) && Intrinsics.areEqual(this.deductedAmount, futuresWelfareCouponAttributes.deductedAmount) && Intrinsics.areEqual(this.remainAmount, futuresWelfareCouponAttributes.remainAmount) && Intrinsics.areEqual(this.couponAlias, futuresWelfareCouponAttributes.couponAlias) && Intrinsics.areEqual(this.status, futuresWelfareCouponAttributes.status) && Intrinsics.areEqual(this.validPeriod, futuresWelfareCouponAttributes.validPeriod) && Intrinsics.areEqual(this.currency, futuresWelfareCouponAttributes.currency) && Intrinsics.areEqual(this.tradeMode, futuresWelfareCouponAttributes.tradeMode);
    }

    public static /* synthetic */ FuturesWelfareCouponAttributes copy$default(FuturesWelfareCouponAttributes futuresWelfareCouponAttributes, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, String str2, Long l11, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = futuresWelfareCouponAttributes.faceValue;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = futuresWelfareCouponAttributes.deductionRatio;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = futuresWelfareCouponAttributes.deductedAmount;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = futuresWelfareCouponAttributes.remainAmount;
        }
        if ((i11 & 16) != 0) {
            str = futuresWelfareCouponAttributes.couponAlias;
        }
        if ((i11 & 32) != 0) {
            str2 = futuresWelfareCouponAttributes.status;
        }
        if ((i11 & 64) != 0) {
            l11 = futuresWelfareCouponAttributes.validPeriod;
        }
        if ((i11 & 128) != 0) {
            str3 = futuresWelfareCouponAttributes.currency;
        }
        if ((i11 & 256) != 0) {
            num = futuresWelfareCouponAttributes.tradeMode;
        }
        String str4 = str3;
        Integer num2 = num;
        String str5 = str2;
        Long l12 = l11;
        String str6 = str;
        BigDecimal bigDecimal5 = bigDecimal3;
        return futuresWelfareCouponAttributes.copy(bigDecimal, bigDecimal2, bigDecimal5, bigDecimal4, str6, str5, l12, str4, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getDeductionRatio() {
        return this.deductionRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getDeductedAmount() {
        return this.deductedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getRemainAmount() {
        return this.remainAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCouponAlias() {
        return this.couponAlias;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getValidPeriod() {
        return this.validPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTradeMode() {
        return this.tradeMode;
    }

    @NotNull
    public final FuturesWelfareCouponAttributes copy(@Nullable BigDecimal faceValue, @Nullable BigDecimal deductionRatio, @Nullable BigDecimal deductedAmount, @Nullable BigDecimal remainAmount, @Nullable String couponAlias, @Nullable String status, @Nullable Long validPeriod, @Nullable String currency, @Nullable Integer tradeMode) {
        return new FuturesWelfareCouponAttributes(faceValue, deductionRatio, deductedAmount, remainAmount, couponAlias, status, validPeriod, currency, tradeMode);
    }

    @Nullable
    public final String getCouponAlias() {
        return this.couponAlias;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDeductedAmount() {
        return this.deductedAmount;
    }

    @Nullable
    public final BigDecimal getDeductionRatio() {
        return this.deductionRatio;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final BigDecimal getRemainAmount() {
        return this.remainAmount;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getTradeMode() {
        return this.tradeMode;
    }

    @Nullable
    public final Long getValidPeriod() {
        return this.validPeriod;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.faceValue;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.deductionRatio;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.deductedAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.remainAmount;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str = this.couponAlias;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.validPeriod;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.tradeMode;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareCouponAttributes(faceValue=" + this.faceValue + ", deductionRatio=" + this.deductionRatio + ", deductedAmount=" + this.deductedAmount + ", remainAmount=" + this.remainAmount + ", couponAlias=" + this.couponAlias + ", status=" + this.status + ", validPeriod=" + this.validPeriod + ", currency=" + this.currency + ", tradeMode=" + this.tradeMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.faceValue);
        dest.writeSerializable(this.deductionRatio);
        dest.writeSerializable(this.deductedAmount);
        dest.writeSerializable(this.remainAmount);
        dest.writeString(this.couponAlias);
        dest.writeString(this.status);
        Long l11 = this.validPeriod;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        Integer num = this.tradeMode;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ FuturesWelfareCouponAttributes(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, String str2, Long l11, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, (i11 & 16) != 0 ? null : str, str2, l11, str3, num);
    }
}
