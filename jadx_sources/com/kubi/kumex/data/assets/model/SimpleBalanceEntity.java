package com.kubi.kumex.data.assets.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleBalanceEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b7\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010P\u001a\u00020Q2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010R\u001a\u00020Q2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u0010\u0010S\u001a\u00020Q2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0010\u0010T\u001a\u00020Q2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0006\u0010U\u001a\u00020\u0000J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010<J\t\u0010e\u001a\u00020\u0015HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0086\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u00132\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020pHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\"\"\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\"\"\u0004\b7\u0010%R \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\"\"\u0004\b;\u0010%R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b\u0012\u0010<\"\u0004\b=\u0010>R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010%R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010%¨\u0006r"}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "walletBalance", "Ljava/math/BigDecimal;", "holdBalance", "isolatedOrderMargin", "isolatedPosMargin", "isolatedUnPnl", "isolatedFundingFeeMargin", "crossUnPnl", "crossOrderMargin", "crossPosMargin", "crossOrderAndPosMargin", "availableBalance", "crossTotalMargin", "totalMarkValue", "isTrialFunds", "", "version", "", "hedgeQtyMargin", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "hedgeQtyMarginThrowable", "", "availableMargin", "futuresIsolatedAvailable", "maxWithdraw", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;JLcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;Ljava/lang/Throwable;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getWalletBalance", "()Ljava/math/BigDecimal;", "getHoldBalance", "setHoldBalance", "(Ljava/math/BigDecimal;)V", "getIsolatedOrderMargin", "setIsolatedOrderMargin", "getIsolatedPosMargin", "setIsolatedPosMargin", "getIsolatedUnPnl", "setIsolatedUnPnl", "getIsolatedFundingFeeMargin", "setIsolatedFundingFeeMargin", "getCrossUnPnl", "setCrossUnPnl", "getCrossOrderMargin", "setCrossOrderMargin", "getCrossPosMargin", "setCrossPosMargin", "getCrossOrderAndPosMargin", "setCrossOrderAndPosMargin", "getAvailableBalance", "setAvailableBalance", "getCrossTotalMargin", "setCrossTotalMargin", "getTotalMarkValue", "setTotalMarkValue", "()Ljava/lang/Boolean;", "setTrialFunds", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getVersion", "()J", "getHedgeQtyMargin", "()Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "setHedgeQtyMargin", "(Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;)V", "getHedgeQtyMarginThrowable", "()Ljava/lang/Throwable;", "setHedgeQtyMarginThrowable", "(Ljava/lang/Throwable;)V", "getAvailableMargin", "setAvailableMargin", "getFuturesIsolatedAvailable", "setFuturesIsolatedAvailable", "getMaxWithdraw", "setMaxWithdraw", "assignmentOfAvailableBalance", "", "assignmentOfAvailableMargin", "assignmentOfCrossTotalMargin", "assignmentOfTotalMarkValue", "deepCopy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;JLcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;Ljava/lang/Throwable;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SimpleBalanceEntity {

    @Nullable
    private BigDecimal availableBalance;

    @Nullable
    private BigDecimal availableMargin;

    @Nullable
    private BigDecimal crossOrderAndPosMargin;

    @Nullable
    private BigDecimal crossOrderMargin;

    @Nullable
    private BigDecimal crossPosMargin;

    @SerializedName("totalCrossMargin")
    @Nullable
    private BigDecimal crossTotalMargin;

    @Nullable
    private BigDecimal crossUnPnl;

    @NotNull
    private final String currency;

    @Nullable
    private BigDecimal futuresIsolatedAvailable;

    @Nullable
    private volatile CrossHedgeQtyMargin hedgeQtyMargin;

    @Nullable
    private volatile transient Throwable hedgeQtyMarginThrowable;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private Boolean isTrialFunds;

    @Nullable
    private BigDecimal isolatedFundingFeeMargin;

    @Nullable
    private BigDecimal isolatedOrderMargin;

    @Nullable
    private BigDecimal isolatedPosMargin;

    @Nullable
    private BigDecimal isolatedUnPnl;

    @Nullable
    private BigDecimal maxWithdraw;

    @Nullable
    private BigDecimal totalMarkValue;
    private final long version;

    @Nullable
    private final BigDecimal walletBalance;

    public SimpleBalanceEntity(@NotNull String currency, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable Boolean bool, long j11, @Nullable CrossHedgeQtyMargin crossHedgeQtyMargin, @Nullable Throwable th2, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.walletBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.isolatedOrderMargin = bigDecimal3;
        this.isolatedPosMargin = bigDecimal4;
        this.isolatedUnPnl = bigDecimal5;
        this.isolatedFundingFeeMargin = bigDecimal6;
        this.crossUnPnl = bigDecimal7;
        this.crossOrderMargin = bigDecimal8;
        this.crossPosMargin = bigDecimal9;
        this.crossOrderAndPosMargin = bigDecimal10;
        this.availableBalance = bigDecimal11;
        this.crossTotalMargin = bigDecimal12;
        this.totalMarkValue = bigDecimal13;
        this.isTrialFunds = bool;
        this.version = j11;
        this.hedgeQtyMargin = crossHedgeQtyMargin;
        this.hedgeQtyMarginThrowable = th2;
        this.availableMargin = bigDecimal14;
        this.futuresIsolatedAvailable = bigDecimal15;
        this.maxWithdraw = bigDecimal16;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleBalanceEntity)) {
            return false;
        }
        SimpleBalanceEntity simpleBalanceEntity = (SimpleBalanceEntity) other;
        return Intrinsics.areEqual(this.currency, simpleBalanceEntity.currency) && Intrinsics.areEqual(this.walletBalance, simpleBalanceEntity.walletBalance) && Intrinsics.areEqual(this.holdBalance, simpleBalanceEntity.holdBalance) && Intrinsics.areEqual(this.isolatedOrderMargin, simpleBalanceEntity.isolatedOrderMargin) && Intrinsics.areEqual(this.isolatedPosMargin, simpleBalanceEntity.isolatedPosMargin) && Intrinsics.areEqual(this.isolatedUnPnl, simpleBalanceEntity.isolatedUnPnl) && Intrinsics.areEqual(this.isolatedFundingFeeMargin, simpleBalanceEntity.isolatedFundingFeeMargin) && Intrinsics.areEqual(this.crossUnPnl, simpleBalanceEntity.crossUnPnl) && Intrinsics.areEqual(this.crossOrderMargin, simpleBalanceEntity.crossOrderMargin) && Intrinsics.areEqual(this.crossPosMargin, simpleBalanceEntity.crossPosMargin) && Intrinsics.areEqual(this.crossOrderAndPosMargin, simpleBalanceEntity.crossOrderAndPosMargin) && Intrinsics.areEqual(this.availableBalance, simpleBalanceEntity.availableBalance) && Intrinsics.areEqual(this.crossTotalMargin, simpleBalanceEntity.crossTotalMargin) && Intrinsics.areEqual(this.totalMarkValue, simpleBalanceEntity.totalMarkValue) && Intrinsics.areEqual(this.isTrialFunds, simpleBalanceEntity.isTrialFunds) && this.version == simpleBalanceEntity.version && Intrinsics.areEqual(this.hedgeQtyMargin, simpleBalanceEntity.hedgeQtyMargin) && Intrinsics.areEqual(this.hedgeQtyMarginThrowable, simpleBalanceEntity.hedgeQtyMarginThrowable) && Intrinsics.areEqual(this.availableMargin, simpleBalanceEntity.availableMargin) && Intrinsics.areEqual(this.futuresIsolatedAvailable, simpleBalanceEntity.futuresIsolatedAvailable) && Intrinsics.areEqual(this.maxWithdraw, simpleBalanceEntity.maxWithdraw);
    }

    public static /* synthetic */ SimpleBalanceEntity copy$default(SimpleBalanceEntity simpleBalanceEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, Boolean bool, long j11, CrossHedgeQtyMargin crossHedgeQtyMargin, Throwable th2, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, int i11, Object obj) {
        BigDecimal bigDecimal17;
        BigDecimal bigDecimal18;
        String str2 = (i11 & 1) != 0 ? simpleBalanceEntity.currency : str;
        BigDecimal bigDecimal19 = (i11 & 2) != 0 ? simpleBalanceEntity.walletBalance : bigDecimal;
        BigDecimal bigDecimal20 = (i11 & 4) != 0 ? simpleBalanceEntity.holdBalance : bigDecimal2;
        BigDecimal bigDecimal21 = (i11 & 8) != 0 ? simpleBalanceEntity.isolatedOrderMargin : bigDecimal3;
        BigDecimal bigDecimal22 = (i11 & 16) != 0 ? simpleBalanceEntity.isolatedPosMargin : bigDecimal4;
        BigDecimal bigDecimal23 = (i11 & 32) != 0 ? simpleBalanceEntity.isolatedUnPnl : bigDecimal5;
        BigDecimal bigDecimal24 = (i11 & 64) != 0 ? simpleBalanceEntity.isolatedFundingFeeMargin : bigDecimal6;
        BigDecimal bigDecimal25 = (i11 & 128) != 0 ? simpleBalanceEntity.crossUnPnl : bigDecimal7;
        BigDecimal bigDecimal26 = (i11 & 256) != 0 ? simpleBalanceEntity.crossOrderMargin : bigDecimal8;
        BigDecimal bigDecimal27 = (i11 & 512) != 0 ? simpleBalanceEntity.crossPosMargin : bigDecimal9;
        BigDecimal bigDecimal28 = (i11 & 1024) != 0 ? simpleBalanceEntity.crossOrderAndPosMargin : bigDecimal10;
        BigDecimal bigDecimal29 = (i11 & 2048) != 0 ? simpleBalanceEntity.availableBalance : bigDecimal11;
        BigDecimal bigDecimal30 = (i11 & 4096) != 0 ? simpleBalanceEntity.crossTotalMargin : bigDecimal12;
        BigDecimal bigDecimal31 = (i11 & 8192) != 0 ? simpleBalanceEntity.totalMarkValue : bigDecimal13;
        String str3 = str2;
        Boolean bool2 = (i11 & 16384) != 0 ? simpleBalanceEntity.isTrialFunds : bool;
        long j12 = (i11 & 32768) != 0 ? simpleBalanceEntity.version : j11;
        CrossHedgeQtyMargin crossHedgeQtyMargin2 = (i11 & 65536) != 0 ? simpleBalanceEntity.hedgeQtyMargin : crossHedgeQtyMargin;
        Throwable th3 = (i11 & 131072) != 0 ? simpleBalanceEntity.hedgeQtyMarginThrowable : th2;
        CrossHedgeQtyMargin crossHedgeQtyMargin3 = crossHedgeQtyMargin2;
        BigDecimal bigDecimal32 = (i11 & 262144) != 0 ? simpleBalanceEntity.availableMargin : bigDecimal14;
        BigDecimal bigDecimal33 = (i11 & 524288) != 0 ? simpleBalanceEntity.futuresIsolatedAvailable : bigDecimal15;
        if ((i11 & 1048576) != 0) {
            bigDecimal18 = bigDecimal33;
            bigDecimal17 = simpleBalanceEntity.maxWithdraw;
        } else {
            bigDecimal17 = bigDecimal16;
            bigDecimal18 = bigDecimal33;
        }
        return simpleBalanceEntity.copy(str3, bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31, bool2, j12, crossHedgeQtyMargin3, th3, bigDecimal32, bigDecimal18, bigDecimal17);
    }

    public final void assignmentOfAvailableBalance(@Nullable BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public final void assignmentOfAvailableMargin(@Nullable BigDecimal availableMargin) {
        this.availableMargin = availableMargin;
    }

    public final void assignmentOfCrossTotalMargin(@Nullable BigDecimal crossTotalMargin) {
        this.crossTotalMargin = crossTotalMargin;
    }

    public final void assignmentOfTotalMarkValue(@Nullable BigDecimal totalMarkValue) {
        this.totalMarkValue = totalMarkValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getCrossPosMargin() {
        return this.crossPosMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getCrossOrderAndPosMargin() {
        return this.crossOrderAndPosMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getCrossTotalMargin() {
        return this.crossTotalMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getTotalMarkValue() {
        return this.totalMarkValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CrossHedgeQtyMargin getHedgeQtyMargin() {
        return this.hedgeQtyMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Throwable getHedgeQtyMarginThrowable() {
        return this.hedgeQtyMarginThrowable;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getWalletBalance() {
        return this.walletBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getFuturesIsolatedAvailable() {
        return this.futuresIsolatedAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getIsolatedOrderMargin() {
        return this.isolatedOrderMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getIsolatedPosMargin() {
        return this.isolatedPosMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getIsolatedUnPnl() {
        return this.isolatedUnPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getIsolatedFundingFeeMargin() {
        return this.isolatedFundingFeeMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getCrossUnPnl() {
        return this.crossUnPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getCrossOrderMargin() {
        return this.crossOrderMargin;
    }

    @NotNull
    public final SimpleBalanceEntity copy(@NotNull String currency, @Nullable BigDecimal walletBalance, @Nullable BigDecimal holdBalance, @Nullable BigDecimal isolatedOrderMargin, @Nullable BigDecimal isolatedPosMargin, @Nullable BigDecimal isolatedUnPnl, @Nullable BigDecimal isolatedFundingFeeMargin, @Nullable BigDecimal crossUnPnl, @Nullable BigDecimal crossOrderMargin, @Nullable BigDecimal crossPosMargin, @Nullable BigDecimal crossOrderAndPosMargin, @Nullable BigDecimal availableBalance, @Nullable BigDecimal crossTotalMargin, @Nullable BigDecimal totalMarkValue, @Nullable Boolean isTrialFunds, long version, @Nullable CrossHedgeQtyMargin hedgeQtyMargin, @Nullable Throwable hedgeQtyMarginThrowable, @Nullable BigDecimal availableMargin, @Nullable BigDecimal futuresIsolatedAvailable, @Nullable BigDecimal maxWithdraw) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new SimpleBalanceEntity(currency, walletBalance, holdBalance, isolatedOrderMargin, isolatedPosMargin, isolatedUnPnl, isolatedFundingFeeMargin, crossUnPnl, crossOrderMargin, crossPosMargin, crossOrderAndPosMargin, availableBalance, crossTotalMargin, totalMarkValue, isTrialFunds, version, hedgeQtyMargin, hedgeQtyMarginThrowable, availableMargin, futuresIsolatedAvailable, maxWithdraw);
    }

    @NotNull
    public final SimpleBalanceEntity deepCopy() {
        CrossHedgeQtyMargin crossHedgeQtyMargin = this.hedgeQtyMargin;
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, crossHedgeQtyMargin != null ? crossHedgeQtyMargin.deepCopy() : null, null, null, null, null, 2031615, null);
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @Nullable
    public final BigDecimal getCrossOrderAndPosMargin() {
        return this.crossOrderAndPosMargin;
    }

    @Nullable
    public final BigDecimal getCrossOrderMargin() {
        return this.crossOrderMargin;
    }

    @Nullable
    public final BigDecimal getCrossPosMargin() {
        return this.crossPosMargin;
    }

    @Nullable
    public final BigDecimal getCrossTotalMargin() {
        return this.crossTotalMargin;
    }

    @Nullable
    public final BigDecimal getCrossUnPnl() {
        return this.crossUnPnl;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getFuturesIsolatedAvailable() {
        return this.futuresIsolatedAvailable;
    }

    @Nullable
    public final CrossHedgeQtyMargin getHedgeQtyMargin() {
        return this.hedgeQtyMargin;
    }

    @Nullable
    public final Throwable getHedgeQtyMarginThrowable() {
        return this.hedgeQtyMarginThrowable;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getIsolatedFundingFeeMargin() {
        return this.isolatedFundingFeeMargin;
    }

    @Nullable
    public final BigDecimal getIsolatedOrderMargin() {
        return this.isolatedOrderMargin;
    }

    @Nullable
    public final BigDecimal getIsolatedPosMargin() {
        return this.isolatedPosMargin;
    }

    @Nullable
    public final BigDecimal getIsolatedUnPnl() {
        return this.isolatedUnPnl;
    }

    @Nullable
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    @Nullable
    public final BigDecimal getTotalMarkValue() {
        return this.totalMarkValue;
    }

    public final long getVersion() {
        return this.version;
    }

    @Nullable
    public final BigDecimal getWalletBalance() {
        return this.walletBalance;
    }

    public int hashCode() {
        int iHashCode = this.currency.hashCode() * 31;
        BigDecimal bigDecimal = this.walletBalance;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.isolatedOrderMargin;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.isolatedPosMargin;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.isolatedUnPnl;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.isolatedFundingFeeMargin;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.crossUnPnl;
        int iHashCode8 = (iHashCode7 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.crossOrderMargin;
        int iHashCode9 = (iHashCode8 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.crossPosMargin;
        int iHashCode10 = (iHashCode9 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.crossOrderAndPosMargin;
        int iHashCode11 = (iHashCode10 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.availableBalance;
        int iHashCode12 = (iHashCode11 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.crossTotalMargin;
        int iHashCode13 = (iHashCode12 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.totalMarkValue;
        int iHashCode14 = (iHashCode13 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        Boolean bool = this.isTrialFunds;
        int iHashCode15 = (((((((iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31) + Long.hashCode(this.version)) * 31) + (this.hedgeQtyMargin == null ? 0 : this.hedgeQtyMargin.hashCode())) * 31) + (this.hedgeQtyMarginThrowable == null ? 0 : this.hedgeQtyMarginThrowable.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.availableMargin;
        int iHashCode16 = (iHashCode15 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.futuresIsolatedAvailable;
        int iHashCode17 = (iHashCode16 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.maxWithdraw;
        return iHashCode17 + (bigDecimal16 != null ? bigDecimal16.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setAvailableBalance(@Nullable BigDecimal bigDecimal) {
        this.availableBalance = bigDecimal;
    }

    public final void setAvailableMargin(@Nullable BigDecimal bigDecimal) {
        this.availableMargin = bigDecimal;
    }

    public final void setCrossOrderAndPosMargin(@Nullable BigDecimal bigDecimal) {
        this.crossOrderAndPosMargin = bigDecimal;
    }

    public final void setCrossOrderMargin(@Nullable BigDecimal bigDecimal) {
        this.crossOrderMargin = bigDecimal;
    }

    public final void setCrossPosMargin(@Nullable BigDecimal bigDecimal) {
        this.crossPosMargin = bigDecimal;
    }

    public final void setCrossTotalMargin(@Nullable BigDecimal bigDecimal) {
        this.crossTotalMargin = bigDecimal;
    }

    public final void setCrossUnPnl(@Nullable BigDecimal bigDecimal) {
        this.crossUnPnl = bigDecimal;
    }

    public final void setFuturesIsolatedAvailable(@Nullable BigDecimal bigDecimal) {
        this.futuresIsolatedAvailable = bigDecimal;
    }

    public final void setHedgeQtyMargin(@Nullable CrossHedgeQtyMargin crossHedgeQtyMargin) {
        this.hedgeQtyMargin = crossHedgeQtyMargin;
    }

    public final void setHedgeQtyMarginThrowable(@Nullable Throwable th2) {
        this.hedgeQtyMarginThrowable = th2;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setIsolatedFundingFeeMargin(@Nullable BigDecimal bigDecimal) {
        this.isolatedFundingFeeMargin = bigDecimal;
    }

    public final void setIsolatedOrderMargin(@Nullable BigDecimal bigDecimal) {
        this.isolatedOrderMargin = bigDecimal;
    }

    public final void setIsolatedPosMargin(@Nullable BigDecimal bigDecimal) {
        this.isolatedPosMargin = bigDecimal;
    }

    public final void setIsolatedUnPnl(@Nullable BigDecimal bigDecimal) {
        this.isolatedUnPnl = bigDecimal;
    }

    public final void setMaxWithdraw(@Nullable BigDecimal bigDecimal) {
        this.maxWithdraw = bigDecimal;
    }

    public final void setTotalMarkValue(@Nullable BigDecimal bigDecimal) {
        this.totalMarkValue = bigDecimal;
    }

    public final void setTrialFunds(@Nullable Boolean bool) {
        this.isTrialFunds = bool;
    }

    @NotNull
    public String toString() {
        return "SimpleBalanceEntity(currency=" + this.currency + ", walletBalance=" + this.walletBalance + ", holdBalance=" + this.holdBalance + ", isolatedOrderMargin=" + this.isolatedOrderMargin + ", isolatedPosMargin=" + this.isolatedPosMargin + ", isolatedUnPnl=" + this.isolatedUnPnl + ", isolatedFundingFeeMargin=" + this.isolatedFundingFeeMargin + ", crossUnPnl=" + this.crossUnPnl + ", crossOrderMargin=" + this.crossOrderMargin + ", crossPosMargin=" + this.crossPosMargin + ", crossOrderAndPosMargin=" + this.crossOrderAndPosMargin + ", availableBalance=" + this.availableBalance + ", crossTotalMargin=" + this.crossTotalMargin + ", totalMarkValue=" + this.totalMarkValue + ", isTrialFunds=" + this.isTrialFunds + ", version=" + this.version + ", hedgeQtyMargin=" + this.hedgeQtyMargin + ", hedgeQtyMarginThrowable=" + this.hedgeQtyMarginThrowable + ", availableMargin=" + this.availableMargin + ", futuresIsolatedAvailable=" + this.futuresIsolatedAvailable + ", maxWithdraw=" + this.maxWithdraw + ')';
    }

    public /* synthetic */ SimpleBalanceEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, Boolean bool, long j11, CrossHedgeQtyMargin crossHedgeQtyMargin, Throwable th2, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5, (i11 & 64) != 0 ? null : bigDecimal6, (i11 & 128) != 0 ? null : bigDecimal7, (i11 & 256) != 0 ? null : bigDecimal8, (i11 & 512) != 0 ? null : bigDecimal9, (i11 & 1024) != 0 ? null : bigDecimal10, (i11 & 2048) != 0 ? null : bigDecimal11, (i11 & 4096) != 0 ? null : bigDecimal12, (i11 & 8192) != 0 ? null : bigDecimal13, (i11 & 16384) != 0 ? Boolean.FALSE : bool, (i11 & 32768) != 0 ? 0L : j11, (i11 & 65536) != 0 ? null : crossHedgeQtyMargin, (i11 & 131072) != 0 ? null : th2, (i11 & 262144) != 0 ? null : bigDecimal14, (i11 & 524288) != 0 ? null : bigDecimal15, (i11 & 1048576) != 0 ? null : bigDecimal16);
    }
}
