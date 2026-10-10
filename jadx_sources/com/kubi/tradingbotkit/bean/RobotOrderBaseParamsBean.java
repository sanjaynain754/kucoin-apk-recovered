package com.kubi.tradingbotkit.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RobotOrderBaseParamsBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010F\u001a\u00020\bJ\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001dR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#¨\u0006L"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/RobotOrderBaseParamsBean;", "Landroid/os/Parcelable;", "up", "Ljava/math/BigDecimal;", "down", "symbol", "", "depth", "", "limitAsset", "stopLossPrice", "stopProfitPrice", "openUnitPrice", "baseAmount", "quotaAmount", "useBaseCurrency", "", "profitWithoutFeeNumber", "additionalInvestment", "priceIncrementPrecision", "dealBaseNumber", "createWay", "couponsPercentage", "couponId", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getUp", "()Ljava/math/BigDecimal;", "setUp", "(Ljava/math/BigDecimal;)V", "getDown", "setDown", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getDepth", "()I", "setDepth", "(I)V", "getLimitAsset", "setLimitAsset", "getStopLossPrice", "setStopLossPrice", "getStopProfitPrice", "setStopProfitPrice", "getOpenUnitPrice", "setOpenUnitPrice", "getBaseAmount", "setBaseAmount", "getQuotaAmount", "setQuotaAmount", "getUseBaseCurrency", "()Z", "setUseBaseCurrency", "(Z)V", "getProfitWithoutFeeNumber", "setProfitWithoutFeeNumber", "getAdditionalInvestment", "setAdditionalInvestment", "getPriceIncrementPrecision", "setPriceIncrementPrecision", "getDealBaseNumber", "setDealBaseNumber", "getCreateWay", "setCreateWay", "getCouponsPercentage", "setCouponsPercentage", "getCouponId", "setCouponId", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RobotOrderBaseParamsBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RobotOrderBaseParamsBean> CREATOR = new C26029a();

    @Nullable
    private BigDecimal additionalInvestment;

    @NotNull
    private BigDecimal baseAmount;

    @Nullable
    private String couponId;

    @Nullable
    private BigDecimal couponsPercentage;

    @Nullable
    private String createWay;

    @Nullable
    private BigDecimal dealBaseNumber;
    private int depth;

    @NotNull
    private BigDecimal down;

    @NotNull
    private BigDecimal limitAsset;

    @NotNull
    private BigDecimal openUnitPrice;
    private int priceIncrementPrecision;

    @NotNull
    private String profitWithoutFeeNumber;

    @NotNull
    private BigDecimal quotaAmount;

    @NotNull
    private BigDecimal stopLossPrice;

    @NotNull
    private BigDecimal stopProfitPrice;

    @NotNull
    private String symbol;

    @NotNull
    private BigDecimal up;
    private boolean useBaseCurrency;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.bean.RobotOrderBaseParamsBean$a */
    /* JADX INFO: compiled from: RobotOrderBaseParamsBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26029a implements Parcelable.Creator<RobotOrderBaseParamsBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotOrderBaseParamsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RobotOrderBaseParamsBean((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RobotOrderBaseParamsBean[] newArray(int i11) {
            return new RobotOrderBaseParamsBean[i11];
        }
    }

    public RobotOrderBaseParamsBean() {
        this(null, null, null, 0, null, null, null, null, null, null, false, null, null, 0, null, null, null, null, 262143, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RobotOrderBaseParamsBean(@NotNull BigDecimal up2, @NotNull BigDecimal down, @NotNull String symbol, int i11, @NotNull BigDecimal limitAsset, @NotNull BigDecimal stopLossPrice, @NotNull BigDecimal stopProfitPrice, @NotNull BigDecimal openUnitPrice, @NotNull BigDecimal baseAmount, @NotNull BigDecimal quotaAmount, boolean z11, @NotNull String profitWithoutFeeNumber, @Nullable BigDecimal bigDecimal, int i12, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable BigDecimal bigDecimal3, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(up2, "up");
        Intrinsics.checkNotNullParameter(down, "down");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(limitAsset, "limitAsset");
        Intrinsics.checkNotNullParameter(stopLossPrice, "stopLossPrice");
        Intrinsics.checkNotNullParameter(stopProfitPrice, "stopProfitPrice");
        Intrinsics.checkNotNullParameter(openUnitPrice, "openUnitPrice");
        Intrinsics.checkNotNullParameter(baseAmount, "baseAmount");
        Intrinsics.checkNotNullParameter(quotaAmount, "quotaAmount");
        Intrinsics.checkNotNullParameter(profitWithoutFeeNumber, "profitWithoutFeeNumber");
        this.up = up2;
        this.down = down;
        this.symbol = symbol;
        this.depth = i11;
        this.limitAsset = limitAsset;
        this.stopLossPrice = stopLossPrice;
        this.stopProfitPrice = stopProfitPrice;
        this.openUnitPrice = openUnitPrice;
        this.baseAmount = baseAmount;
        this.quotaAmount = quotaAmount;
        this.useBaseCurrency = z11;
        this.profitWithoutFeeNumber = profitWithoutFeeNumber;
        this.additionalInvestment = bigDecimal;
        this.priceIncrementPrecision = i12;
        this.dealBaseNumber = bigDecimal2;
        this.createWay = str;
        this.couponsPercentage = bigDecimal3;
        this.couponId = str2;
    }

    @Nullable
    public final BigDecimal getAdditionalInvestment() {
        return this.additionalInvestment;
    }

    @NotNull
    public final BigDecimal getBaseAmount() {
        return this.baseAmount;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final BigDecimal getCouponsPercentage() {
        return this.couponsPercentage;
    }

    @Nullable
    public final String getCreateWay() {
        return this.createWay;
    }

    @Nullable
    public final BigDecimal getDealBaseNumber() {
        return this.dealBaseNumber;
    }

    public final int getDepth() {
        return this.depth;
    }

    @NotNull
    public final BigDecimal getDown() {
        return this.down;
    }

    @NotNull
    public final BigDecimal getLimitAsset() {
        return this.limitAsset;
    }

    @NotNull
    public final BigDecimal getOpenUnitPrice() {
        return this.openUnitPrice;
    }

    public final int getPriceIncrementPrecision() {
        return this.priceIncrementPrecision;
    }

    @NotNull
    public final String getProfitWithoutFeeNumber() {
        return this.profitWithoutFeeNumber;
    }

    @NotNull
    public final BigDecimal getQuotaAmount() {
        return this.quotaAmount;
    }

    @NotNull
    public final BigDecimal getStopLossPrice() {
        return this.stopLossPrice;
    }

    @NotNull
    public final BigDecimal getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final BigDecimal getUp() {
        return this.up;
    }

    public final boolean getUseBaseCurrency() {
        return this.useBaseCurrency;
    }

    public final void setAdditionalInvestment(@Nullable BigDecimal bigDecimal) {
        this.additionalInvestment = bigDecimal;
    }

    public final void setBaseAmount(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.baseAmount = bigDecimal;
    }

    public final void setCouponId(@Nullable String str) {
        this.couponId = str;
    }

    public final void setCouponsPercentage(@Nullable BigDecimal bigDecimal) {
        this.couponsPercentage = bigDecimal;
    }

    public final void setCreateWay(@Nullable String str) {
        this.createWay = str;
    }

    public final void setDealBaseNumber(@Nullable BigDecimal bigDecimal) {
        this.dealBaseNumber = bigDecimal;
    }

    public final void setDepth(int i11) {
        this.depth = i11;
    }

    public final void setDown(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.down = bigDecimal;
    }

    public final void setLimitAsset(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.limitAsset = bigDecimal;
    }

    public final void setOpenUnitPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.openUnitPrice = bigDecimal;
    }

    public final void setPriceIncrementPrecision(int i11) {
        this.priceIncrementPrecision = i11;
    }

    public final void setProfitWithoutFeeNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.profitWithoutFeeNumber = str;
    }

    public final void setQuotaAmount(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.quotaAmount = bigDecimal;
    }

    public final void setStopLossPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.stopLossPrice = bigDecimal;
    }

    public final void setStopProfitPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.stopProfitPrice = bigDecimal;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    public final void setUp(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.up = bigDecimal;
    }

    public final void setUseBaseCurrency(boolean z11) {
        this.useBaseCurrency = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.up);
        dest.writeSerializable(this.down);
        dest.writeString(this.symbol);
        dest.writeInt(this.depth);
        dest.writeSerializable(this.limitAsset);
        dest.writeSerializable(this.stopLossPrice);
        dest.writeSerializable(this.stopProfitPrice);
        dest.writeSerializable(this.openUnitPrice);
        dest.writeSerializable(this.baseAmount);
        dest.writeSerializable(this.quotaAmount);
        dest.writeInt(this.useBaseCurrency ? 1 : 0);
        dest.writeString(this.profitWithoutFeeNumber);
        dest.writeSerializable(this.additionalInvestment);
        dest.writeInt(this.priceIncrementPrecision);
        dest.writeSerializable(this.dealBaseNumber);
        dest.writeString(this.createWay);
        dest.writeSerializable(this.couponsPercentage);
        dest.writeString(this.couponId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RobotOrderBaseParamsBean(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, int i11, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, boolean z11, String str2, BigDecimal bigDecimal9, int i12, BigDecimal bigDecimal10, String str3, BigDecimal bigDecimal11, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal ZERO;
        BigDecimal ZERO2;
        BigDecimal ZERO3;
        BigDecimal ZERO4;
        BigDecimal ZERO5;
        BigDecimal ZERO6;
        BigDecimal ZERO7;
        BigDecimal ZERO8;
        if ((i13 & 1) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        } else {
            ZERO = bigDecimal;
        }
        if ((i13 & 2) != 0) {
            ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        } else {
            ZERO2 = bigDecimal2;
        }
        String str5 = (i13 & 4) != 0 ? "" : str;
        int i14 = (i13 & 8) != 0 ? 0 : i11;
        if ((i13 & 16) != 0) {
            ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
        } else {
            ZERO3 = bigDecimal3;
        }
        if ((i13 & 32) != 0) {
            ZERO4 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO4, "ZERO");
        } else {
            ZERO4 = bigDecimal4;
        }
        if ((i13 & 64) != 0) {
            ZERO5 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO5, "ZERO");
        } else {
            ZERO5 = bigDecimal5;
        }
        if ((i13 & 128) != 0) {
            ZERO6 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO6, "ZERO");
        } else {
            ZERO6 = bigDecimal6;
        }
        if ((i13 & 256) != 0) {
            ZERO7 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO7, "ZERO");
        } else {
            ZERO7 = bigDecimal7;
        }
        if ((i13 & 512) != 0) {
            ZERO8 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO8, "ZERO");
        } else {
            ZERO8 = bigDecimal8;
        }
        this(ZERO, ZERO2, str5, i14, ZERO3, ZERO4, ZERO5, ZERO6, ZERO7, ZERO8, (i13 & 1024) == 0 ? z11 : false, (i13 & 2048) == 0 ? str2 : "", (i13 & 4096) != 0 ? null : bigDecimal9, (i13 & 8192) != 0 ? 8 : i12, (i13 & 16384) != 0 ? null : bigDecimal10, (i13 & 32768) != 0 ? null : str3, (i13 & 65536) != 0 ? null : bigDecimal11, (i13 & 131072) != 0 ? null : str4);
    }
}
