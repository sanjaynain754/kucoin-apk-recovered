package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020\u000eJ\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001a¨\u0006D"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawChainQuotaEntity;", "Landroid/os/Parcelable;", "chainId", "", FirebaseAnalytics.Param.CURRENCY, "availableAmount", "Ljava/math/BigDecimal;", "withdrawMinSize", "limitBTCAmount", "remainAmount", "usedBTCAmount", "withdrawMinFee", "innerWithdrawMinFee", "precision", "", "withdrawFeeRate", "withdrawFeeFormula", "withdrawFeeFormulaV2", "withdrawFeeFormulaV3", "vipDiscount", "taxTotalRate", "taxDescription", "withdrawMaxFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChainId", "()Ljava/lang/String;", "setChainId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getAvailableAmount", "()Ljava/math/BigDecimal;", "setAvailableAmount", "(Ljava/math/BigDecimal;)V", "getWithdrawMinSize", "setWithdrawMinSize", "getLimitBTCAmount", "setLimitBTCAmount", "getRemainAmount", "setRemainAmount", "getUsedBTCAmount", "setUsedBTCAmount", "getWithdrawMinFee", "setWithdrawMinFee", "getInnerWithdrawMinFee", "setInnerWithdrawMinFee", "getPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWithdrawFeeRate", "setWithdrawFeeRate", "getWithdrawFeeFormula", "getWithdrawFeeFormulaV2", "getWithdrawFeeFormulaV3", "getVipDiscount", "getTaxTotalRate", "getTaxDescription", "getWithdrawMaxFee", "isEmpty", "", "hasTax", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawChainQuotaEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawChainQuotaEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal availableAmount;

    @Nullable
    private String chainId;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal innerWithdrawMinFee;

    @Nullable
    private BigDecimal limitBTCAmount;

    @Nullable
    private final Integer precision;

    @Nullable
    private BigDecimal remainAmount;

    @Nullable
    private final String taxDescription;

    @Nullable
    private final String taxTotalRate;

    @Nullable
    private BigDecimal usedBTCAmount;

    @Nullable
    private final String vipDiscount;

    @Nullable
    private final String withdrawFeeFormula;

    @Nullable
    private final String withdrawFeeFormulaV2;

    @Nullable
    private final String withdrawFeeFormulaV3;

    @NotNull
    private BigDecimal withdrawFeeRate;

    @NotNull
    private final String withdrawMaxFee;

    @Nullable
    private BigDecimal withdrawMinFee;

    @Nullable
    private BigDecimal withdrawMinSize;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawChainQuotaEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawChainQuotaEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawChainQuotaEntity(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawChainQuotaEntity[] newArray(int i11) {
            return new WithdrawChainQuotaEntity[i11];
        }
    }

    public WithdrawChainQuotaEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable Integer num, @NotNull BigDecimal withdrawFeeRate, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull String withdrawMaxFee) {
        Intrinsics.checkNotNullParameter(withdrawFeeRate, "withdrawFeeRate");
        Intrinsics.checkNotNullParameter(withdrawMaxFee, "withdrawMaxFee");
        this.chainId = str;
        this.currency = str2;
        this.availableAmount = bigDecimal;
        this.withdrawMinSize = bigDecimal2;
        this.limitBTCAmount = bigDecimal3;
        this.remainAmount = bigDecimal4;
        this.usedBTCAmount = bigDecimal5;
        this.withdrawMinFee = bigDecimal6;
        this.innerWithdrawMinFee = bigDecimal7;
        this.precision = num;
        this.withdrawFeeRate = withdrawFeeRate;
        this.withdrawFeeFormula = str3;
        this.withdrawFeeFormulaV2 = str4;
        this.withdrawFeeFormulaV3 = str5;
        this.vipDiscount = str6;
        this.taxTotalRate = str7;
        this.taxDescription = str8;
        this.withdrawMaxFee = withdrawMaxFee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    @Nullable
    public final BigDecimal getLimitBTCAmount() {
        return this.limitBTCAmount;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final BigDecimal getRemainAmount() {
        return this.remainAmount;
    }

    @Nullable
    public final String getTaxDescription() {
        return this.taxDescription;
    }

    @Nullable
    public final String getTaxTotalRate() {
        return this.taxTotalRate;
    }

    @Nullable
    public final BigDecimal getUsedBTCAmount() {
        return this.usedBTCAmount;
    }

    @Nullable
    public final String getVipDiscount() {
        return this.vipDiscount;
    }

    @Nullable
    public final String getWithdrawFeeFormula() {
        return this.withdrawFeeFormula;
    }

    @Nullable
    public final String getWithdrawFeeFormulaV2() {
        return this.withdrawFeeFormulaV2;
    }

    @Nullable
    public final String getWithdrawFeeFormulaV3() {
        return this.withdrawFeeFormulaV3;
    }

    @NotNull
    public final BigDecimal getWithdrawFeeRate() {
        return this.withdrawFeeRate;
    }

    @NotNull
    public final String getWithdrawMaxFee() {
        return this.withdrawMaxFee;
    }

    @Nullable
    public final BigDecimal getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    public final BigDecimal getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    public final boolean hasTax() {
        String str = this.taxTotalRate;
        return (str == null || str.length() == 0 || DowngradeExKt.m66538h(this.taxTotalRate, 0.0d, 1, null) <= 0.0d) ? false : true;
    }

    public final boolean isEmpty() {
        String str = this.currency;
        return str == null || str.length() == 0;
    }

    public final void setAvailableAmount(@Nullable BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public final void setChainId(@Nullable String str) {
        this.chainId = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setInnerWithdrawMinFee(@Nullable BigDecimal bigDecimal) {
        this.innerWithdrawMinFee = bigDecimal;
    }

    public final void setLimitBTCAmount(@Nullable BigDecimal bigDecimal) {
        this.limitBTCAmount = bigDecimal;
    }

    public final void setRemainAmount(@Nullable BigDecimal bigDecimal) {
        this.remainAmount = bigDecimal;
    }

    public final void setUsedBTCAmount(@Nullable BigDecimal bigDecimal) {
        this.usedBTCAmount = bigDecimal;
    }

    public final void setWithdrawFeeRate(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.withdrawFeeRate = bigDecimal;
    }

    public final void setWithdrawMinFee(@Nullable BigDecimal bigDecimal) {
        this.withdrawMinFee = bigDecimal;
    }

    public final void setWithdrawMinSize(@Nullable BigDecimal bigDecimal) {
        this.withdrawMinSize = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.chainId);
        dest.writeString(this.currency);
        dest.writeSerializable(this.availableAmount);
        dest.writeSerializable(this.withdrawMinSize);
        dest.writeSerializable(this.limitBTCAmount);
        dest.writeSerializable(this.remainAmount);
        dest.writeSerializable(this.usedBTCAmount);
        dest.writeSerializable(this.withdrawMinFee);
        dest.writeSerializable(this.innerWithdrawMinFee);
        Integer num = this.precision;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeSerializable(this.withdrawFeeRate);
        dest.writeString(this.withdrawFeeFormula);
        dest.writeString(this.withdrawFeeFormulaV2);
        dest.writeString(this.withdrawFeeFormulaV3);
        dest.writeString(this.vipDiscount);
        dest.writeString(this.taxTotalRate);
        dest.writeString(this.taxDescription);
        dest.writeString(this.withdrawMaxFee);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WithdrawChainQuotaEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Integer num, BigDecimal bigDecimal8, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal bigDecimal9;
        if ((i11 & 1024) != 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            bigDecimal9 = ZERO;
        } else {
            bigDecimal9 = bigDecimal8;
        }
        this(str, str2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, num, bigDecimal9, str3, str4, str5, str6, str7, str8, str9);
    }
}
