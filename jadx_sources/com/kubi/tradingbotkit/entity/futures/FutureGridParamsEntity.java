package com.kubi.tradingbotkit.entity.futures;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FutureGridParamsEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jþ\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u000f2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\bHÖ\u0001J\t\u0010N\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u000e\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d¨\u0006O"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/futures/FutureGridParamsEntity;", "", "blowUpPrice", "Ljava/math/BigDecimal;", "diff", "direction", "", "entryContractNum", "", "feeRatio", "gridNum", "gridProfitLowerRatio", "gridProfitUpperRatio", "initBlowUpPrice", "isNotice", "", "leverage", "lowerLimit", "maxInvestment", "minAmount", "multiplier", "realMinAmount", "stopLossRatio", "upperLimit", "minLeverage", "maxGridNum", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBlowUpPrice", "()Ljava/math/BigDecimal;", "getDiff", "getDirection", "()Ljava/lang/String;", "getEntryContractNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeeRatio", "getGridNum", "getGridProfitLowerRatio", "getGridProfitUpperRatio", "getInitBlowUpPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeverage", "getLowerLimit", "getMaxInvestment", "getMinAmount", "getMultiplier", "getRealMinAmount", "getStopLossRatio", "getUpperLimit", "getMinLeverage", "getMaxGridNum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/tradingbotkit/entity/futures/FutureGridParamsEntity;", "equals", "other", "hashCode", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FutureGridParamsEntity {

    @Nullable
    private final BigDecimal blowUpPrice;

    @Nullable
    private final BigDecimal diff;

    @Nullable
    private final String direction;

    @Nullable
    private final Integer entryContractNum;

    @Nullable
    private final BigDecimal feeRatio;

    @Nullable
    private final BigDecimal gridNum;

    @Nullable
    private final BigDecimal gridProfitLowerRatio;

    @Nullable
    private final BigDecimal gridProfitUpperRatio;

    @Nullable
    private final BigDecimal initBlowUpPrice;

    @Nullable
    private final Boolean isNotice;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final BigDecimal lowerLimit;

    @Nullable
    private final BigDecimal maxGridNum;

    @Nullable
    private final BigDecimal maxInvestment;

    @Nullable
    private final BigDecimal minAmount;

    @Nullable
    private final BigDecimal minLeverage;

    @Nullable
    private final BigDecimal multiplier;

    @Nullable
    private final BigDecimal realMinAmount;

    @Nullable
    private final BigDecimal stopLossRatio;

    @Nullable
    private final BigDecimal upperLimit;

    public FutureGridParamsEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ FutureGridParamsEntity copy$default(FutureGridParamsEntity futureGridParamsEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Integer num, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Boolean bool, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, int i11, Object obj) {
        BigDecimal bigDecimal18;
        BigDecimal bigDecimal19;
        BigDecimal bigDecimal20 = (i11 & 1) != 0 ? futureGridParamsEntity.blowUpPrice : bigDecimal;
        BigDecimal bigDecimal21 = (i11 & 2) != 0 ? futureGridParamsEntity.diff : bigDecimal2;
        String str2 = (i11 & 4) != 0 ? futureGridParamsEntity.direction : str;
        Integer num2 = (i11 & 8) != 0 ? futureGridParamsEntity.entryContractNum : num;
        BigDecimal bigDecimal22 = (i11 & 16) != 0 ? futureGridParamsEntity.feeRatio : bigDecimal3;
        BigDecimal bigDecimal23 = (i11 & 32) != 0 ? futureGridParamsEntity.gridNum : bigDecimal4;
        BigDecimal bigDecimal24 = (i11 & 64) != 0 ? futureGridParamsEntity.gridProfitLowerRatio : bigDecimal5;
        BigDecimal bigDecimal25 = (i11 & 128) != 0 ? futureGridParamsEntity.gridProfitUpperRatio : bigDecimal6;
        BigDecimal bigDecimal26 = (i11 & 256) != 0 ? futureGridParamsEntity.initBlowUpPrice : bigDecimal7;
        Boolean bool2 = (i11 & 512) != 0 ? futureGridParamsEntity.isNotice : bool;
        BigDecimal bigDecimal27 = (i11 & 1024) != 0 ? futureGridParamsEntity.leverage : bigDecimal8;
        BigDecimal bigDecimal28 = (i11 & 2048) != 0 ? futureGridParamsEntity.lowerLimit : bigDecimal9;
        BigDecimal bigDecimal29 = (i11 & 4096) != 0 ? futureGridParamsEntity.maxInvestment : bigDecimal10;
        BigDecimal bigDecimal30 = (i11 & 8192) != 0 ? futureGridParamsEntity.minAmount : bigDecimal11;
        BigDecimal bigDecimal31 = bigDecimal20;
        BigDecimal bigDecimal32 = (i11 & 16384) != 0 ? futureGridParamsEntity.multiplier : bigDecimal12;
        BigDecimal bigDecimal33 = (i11 & 32768) != 0 ? futureGridParamsEntity.realMinAmount : bigDecimal13;
        BigDecimal bigDecimal34 = (i11 & 65536) != 0 ? futureGridParamsEntity.stopLossRatio : bigDecimal14;
        BigDecimal bigDecimal35 = (i11 & 131072) != 0 ? futureGridParamsEntity.upperLimit : bigDecimal15;
        BigDecimal bigDecimal36 = (i11 & 262144) != 0 ? futureGridParamsEntity.minLeverage : bigDecimal16;
        if ((i11 & 524288) != 0) {
            bigDecimal19 = bigDecimal36;
            bigDecimal18 = futureGridParamsEntity.maxGridNum;
        } else {
            bigDecimal18 = bigDecimal17;
            bigDecimal19 = bigDecimal36;
        }
        return futureGridParamsEntity.copy(bigDecimal31, bigDecimal21, str2, num2, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26, bool2, bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal19, bigDecimal18);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutureGridParamsEntity)) {
            return false;
        }
        FutureGridParamsEntity futureGridParamsEntity = (FutureGridParamsEntity) other;
        return Intrinsics.areEqual(this.blowUpPrice, futureGridParamsEntity.blowUpPrice) && Intrinsics.areEqual(this.diff, futureGridParamsEntity.diff) && Intrinsics.areEqual(this.direction, futureGridParamsEntity.direction) && Intrinsics.areEqual(this.entryContractNum, futureGridParamsEntity.entryContractNum) && Intrinsics.areEqual(this.feeRatio, futureGridParamsEntity.feeRatio) && Intrinsics.areEqual(this.gridNum, futureGridParamsEntity.gridNum) && Intrinsics.areEqual(this.gridProfitLowerRatio, futureGridParamsEntity.gridProfitLowerRatio) && Intrinsics.areEqual(this.gridProfitUpperRatio, futureGridParamsEntity.gridProfitUpperRatio) && Intrinsics.areEqual(this.initBlowUpPrice, futureGridParamsEntity.initBlowUpPrice) && Intrinsics.areEqual(this.isNotice, futureGridParamsEntity.isNotice) && Intrinsics.areEqual(this.leverage, futureGridParamsEntity.leverage) && Intrinsics.areEqual(this.lowerLimit, futureGridParamsEntity.lowerLimit) && Intrinsics.areEqual(this.maxInvestment, futureGridParamsEntity.maxInvestment) && Intrinsics.areEqual(this.minAmount, futureGridParamsEntity.minAmount) && Intrinsics.areEqual(this.multiplier, futureGridParamsEntity.multiplier) && Intrinsics.areEqual(this.realMinAmount, futureGridParamsEntity.realMinAmount) && Intrinsics.areEqual(this.stopLossRatio, futureGridParamsEntity.stopLossRatio) && Intrinsics.areEqual(this.upperLimit, futureGridParamsEntity.upperLimit) && Intrinsics.areEqual(this.minLeverage, futureGridParamsEntity.minLeverage) && Intrinsics.areEqual(this.maxGridNum, futureGridParamsEntity.maxGridNum);
    }

    public FutureGridParamsEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable Integer num, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17) {
        this.blowUpPrice = bigDecimal;
        this.diff = bigDecimal2;
        this.direction = str;
        this.entryContractNum = num;
        this.feeRatio = bigDecimal3;
        this.gridNum = bigDecimal4;
        this.gridProfitLowerRatio = bigDecimal5;
        this.gridProfitUpperRatio = bigDecimal6;
        this.initBlowUpPrice = bigDecimal7;
        this.isNotice = bool;
        this.leverage = bigDecimal8;
        this.lowerLimit = bigDecimal9;
        this.maxInvestment = bigDecimal10;
        this.minAmount = bigDecimal11;
        this.multiplier = bigDecimal12;
        this.realMinAmount = bigDecimal13;
        this.stopLossRatio = bigDecimal14;
        this.upperLimit = bigDecimal15;
        this.minLeverage = bigDecimal16;
        this.maxGridNum = bigDecimal17;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getBlowUpPrice() {
        return this.blowUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsNotice() {
        return this.isNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getMaxInvestment() {
        return this.maxInvestment;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getRealMinAmount() {
        return this.realMinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getStopLossRatio() {
        return this.stopLossRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getUpperLimit() {
        return this.upperLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getMinLeverage() {
        return this.minLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getDiff() {
        return this.diff;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getMaxGridNum() {
        return this.maxGridNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getEntryContractNum() {
        return this.entryContractNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getGridNum() {
        return this.gridNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getGridProfitLowerRatio() {
        return this.gridProfitLowerRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getGridProfitUpperRatio() {
        return this.gridProfitUpperRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getInitBlowUpPrice() {
        return this.initBlowUpPrice;
    }

    @NotNull
    public final FutureGridParamsEntity copy(@Nullable BigDecimal blowUpPrice, @Nullable BigDecimal diff, @Nullable String direction, @Nullable Integer entryContractNum, @Nullable BigDecimal feeRatio, @Nullable BigDecimal gridNum, @Nullable BigDecimal gridProfitLowerRatio, @Nullable BigDecimal gridProfitUpperRatio, @Nullable BigDecimal initBlowUpPrice, @Nullable Boolean isNotice, @Nullable BigDecimal leverage, @Nullable BigDecimal lowerLimit, @Nullable BigDecimal maxInvestment, @Nullable BigDecimal minAmount, @Nullable BigDecimal multiplier, @Nullable BigDecimal realMinAmount, @Nullable BigDecimal stopLossRatio, @Nullable BigDecimal upperLimit, @Nullable BigDecimal minLeverage, @Nullable BigDecimal maxGridNum) {
        return new FutureGridParamsEntity(blowUpPrice, diff, direction, entryContractNum, feeRatio, gridNum, gridProfitLowerRatio, gridProfitUpperRatio, initBlowUpPrice, isNotice, leverage, lowerLimit, maxInvestment, minAmount, multiplier, realMinAmount, stopLossRatio, upperLimit, minLeverage, maxGridNum);
    }

    @Nullable
    public final BigDecimal getBlowUpPrice() {
        return this.blowUpPrice;
    }

    @Nullable
    public final BigDecimal getDiff() {
        return this.diff;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final Integer getEntryContractNum() {
        return this.entryContractNum;
    }

    @Nullable
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    public final BigDecimal getGridNum() {
        return this.gridNum;
    }

    @Nullable
    public final BigDecimal getGridProfitLowerRatio() {
        return this.gridProfitLowerRatio;
    }

    @Nullable
    public final BigDecimal getGridProfitUpperRatio() {
        return this.gridProfitUpperRatio;
    }

    @Nullable
    public final BigDecimal getInitBlowUpPrice() {
        return this.initBlowUpPrice;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    @Nullable
    public final BigDecimal getMaxGridNum() {
        return this.maxGridNum;
    }

    @Nullable
    public final BigDecimal getMaxInvestment() {
        return this.maxInvestment;
    }

    @Nullable
    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final BigDecimal getMinLeverage() {
        return this.minLeverage;
    }

    @Nullable
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    public final BigDecimal getRealMinAmount() {
        return this.realMinAmount;
    }

    @Nullable
    public final BigDecimal getStopLossRatio() {
        return this.stopLossRatio;
    }

    @Nullable
    public final BigDecimal getUpperLimit() {
        return this.upperLimit;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.blowUpPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.diff;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.direction;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.entryContractNum;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.feeRatio;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.gridNum;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.gridProfitLowerRatio;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.gridProfitUpperRatio;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.initBlowUpPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        Boolean bool = this.isNotice;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.leverage;
        int iHashCode11 = (iHashCode10 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.lowerLimit;
        int iHashCode12 = (iHashCode11 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.maxInvestment;
        int iHashCode13 = (iHashCode12 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.minAmount;
        int iHashCode14 = (iHashCode13 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.multiplier;
        int iHashCode15 = (iHashCode14 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.realMinAmount;
        int iHashCode16 = (iHashCode15 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.stopLossRatio;
        int iHashCode17 = (iHashCode16 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.upperLimit;
        int iHashCode18 = (iHashCode17 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.minLeverage;
        int iHashCode19 = (iHashCode18 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.maxGridNum;
        return iHashCode19 + (bigDecimal17 != null ? bigDecimal17.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNotice() {
        return this.isNotice;
    }

    @NotNull
    public String toString() {
        return "FutureGridParamsEntity(blowUpPrice=" + this.blowUpPrice + ", diff=" + this.diff + ", direction=" + this.direction + ", entryContractNum=" + this.entryContractNum + ", feeRatio=" + this.feeRatio + ", gridNum=" + this.gridNum + ", gridProfitLowerRatio=" + this.gridProfitLowerRatio + ", gridProfitUpperRatio=" + this.gridProfitUpperRatio + ", initBlowUpPrice=" + this.initBlowUpPrice + ", isNotice=" + this.isNotice + ", leverage=" + this.leverage + ", lowerLimit=" + this.lowerLimit + ", maxInvestment=" + this.maxInvestment + ", minAmount=" + this.minAmount + ", multiplier=" + this.multiplier + ", realMinAmount=" + this.realMinAmount + ", stopLossRatio=" + this.stopLossRatio + ", upperLimit=" + this.upperLimit + ", minLeverage=" + this.minLeverage + ", maxGridNum=" + this.maxGridNum + ')';
    }

    public /* synthetic */ FutureGridParamsEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Integer num, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Boolean bool, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : bigDecimal8, (i11 & 2048) != 0 ? null : bigDecimal9, (i11 & 4096) != 0 ? null : bigDecimal10, (i11 & 8192) != 0 ? null : bigDecimal11, (i11 & 16384) != 0 ? null : bigDecimal12, (i11 & 32768) != 0 ? null : bigDecimal13, (i11 & 65536) != 0 ? null : bigDecimal14, (i11 & 131072) != 0 ? null : bigDecimal15, (i11 & 262144) != 0 ? null : bigDecimal16, (i11 & 524288) != 0 ? null : bigDecimal17);
    }
}
