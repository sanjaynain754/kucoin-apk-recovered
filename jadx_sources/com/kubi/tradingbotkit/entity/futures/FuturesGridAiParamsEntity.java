package com.kubi.tradingbotkit.entity.futures;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesGridAiParamsEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\n\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00068"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/futures/FuturesGridAiParamsEntity;", "", "diff", "Ljava/math/BigDecimal;", "direction", "", "feeRatio", "gridNum", "gridProfitLowerRatio", "gridProfitUpperRatio", "isNotice", "", "leverage", "lowerLimit", "minAmount", "multiplier", "realMinAmount", "upperLimit", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getDiff", "()Ljava/math/BigDecimal;", "getDirection", "()Ljava/lang/String;", "getFeeRatio", "getGridNum", "getGridProfitLowerRatio", "getGridProfitUpperRatio", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeverage", "getLowerLimit", "getMinAmount", "getMultiplier", "getRealMinAmount", "getUpperLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/tradingbotkit/entity/futures/FuturesGridAiParamsEntity;", "equals", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesGridAiParamsEntity {

    @Nullable
    private final BigDecimal diff;

    @Nullable
    private final String direction;

    @Nullable
    private final BigDecimal feeRatio;

    @Nullable
    private final BigDecimal gridNum;

    @Nullable
    private final BigDecimal gridProfitLowerRatio;

    @Nullable
    private final BigDecimal gridProfitUpperRatio;

    @Nullable
    private final Boolean isNotice;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final BigDecimal lowerLimit;

    @Nullable
    private final BigDecimal minAmount;

    @Nullable
    private final BigDecimal multiplier;

    @Nullable
    private final BigDecimal realMinAmount;

    @Nullable
    private final BigDecimal upperLimit;

    public FuturesGridAiParamsEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ FuturesGridAiParamsEntity copy$default(FuturesGridAiParamsEntity futuresGridAiParamsEntity, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Boolean bool, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = futuresGridAiParamsEntity.diff;
        }
        return futuresGridAiParamsEntity.copy(bigDecimal, (i11 & 2) != 0 ? futuresGridAiParamsEntity.direction : str, (i11 & 4) != 0 ? futuresGridAiParamsEntity.feeRatio : bigDecimal2, (i11 & 8) != 0 ? futuresGridAiParamsEntity.gridNum : bigDecimal3, (i11 & 16) != 0 ? futuresGridAiParamsEntity.gridProfitLowerRatio : bigDecimal4, (i11 & 32) != 0 ? futuresGridAiParamsEntity.gridProfitUpperRatio : bigDecimal5, (i11 & 64) != 0 ? futuresGridAiParamsEntity.isNotice : bool, (i11 & 128) != 0 ? futuresGridAiParamsEntity.leverage : bigDecimal6, (i11 & 256) != 0 ? futuresGridAiParamsEntity.lowerLimit : bigDecimal7, (i11 & 512) != 0 ? futuresGridAiParamsEntity.minAmount : bigDecimal8, (i11 & 1024) != 0 ? futuresGridAiParamsEntity.multiplier : bigDecimal9, (i11 & 2048) != 0 ? futuresGridAiParamsEntity.realMinAmount : bigDecimal10, (i11 & 4096) != 0 ? futuresGridAiParamsEntity.upperLimit : bigDecimal11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesGridAiParamsEntity)) {
            return false;
        }
        FuturesGridAiParamsEntity futuresGridAiParamsEntity = (FuturesGridAiParamsEntity) other;
        return Intrinsics.areEqual(this.diff, futuresGridAiParamsEntity.diff) && Intrinsics.areEqual(this.direction, futuresGridAiParamsEntity.direction) && Intrinsics.areEqual(this.feeRatio, futuresGridAiParamsEntity.feeRatio) && Intrinsics.areEqual(this.gridNum, futuresGridAiParamsEntity.gridNum) && Intrinsics.areEqual(this.gridProfitLowerRatio, futuresGridAiParamsEntity.gridProfitLowerRatio) && Intrinsics.areEqual(this.gridProfitUpperRatio, futuresGridAiParamsEntity.gridProfitUpperRatio) && Intrinsics.areEqual(this.isNotice, futuresGridAiParamsEntity.isNotice) && Intrinsics.areEqual(this.leverage, futuresGridAiParamsEntity.leverage) && Intrinsics.areEqual(this.lowerLimit, futuresGridAiParamsEntity.lowerLimit) && Intrinsics.areEqual(this.minAmount, futuresGridAiParamsEntity.minAmount) && Intrinsics.areEqual(this.multiplier, futuresGridAiParamsEntity.multiplier) && Intrinsics.areEqual(this.realMinAmount, futuresGridAiParamsEntity.realMinAmount) && Intrinsics.areEqual(this.upperLimit, futuresGridAiParamsEntity.upperLimit);
    }

    public FuturesGridAiParamsEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11) {
        this.diff = bigDecimal;
        this.direction = str;
        this.feeRatio = bigDecimal2;
        this.gridNum = bigDecimal3;
        this.gridProfitLowerRatio = bigDecimal4;
        this.gridProfitUpperRatio = bigDecimal5;
        this.isNotice = bool;
        this.leverage = bigDecimal6;
        this.lowerLimit = bigDecimal7;
        this.minAmount = bigDecimal8;
        this.multiplier = bigDecimal9;
        this.realMinAmount = bigDecimal10;
        this.upperLimit = bigDecimal11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getDiff() {
        return this.diff;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getRealMinAmount() {
        return this.realMinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getUpperLimit() {
        return this.upperLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getGridNum() {
        return this.gridNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getGridProfitLowerRatio() {
        return this.gridProfitLowerRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getGridProfitUpperRatio() {
        return this.gridProfitUpperRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsNotice() {
        return this.isNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    @NotNull
    public final FuturesGridAiParamsEntity copy(@Nullable BigDecimal diff, @Nullable String direction, @Nullable BigDecimal feeRatio, @Nullable BigDecimal gridNum, @Nullable BigDecimal gridProfitLowerRatio, @Nullable BigDecimal gridProfitUpperRatio, @Nullable Boolean isNotice, @Nullable BigDecimal leverage, @Nullable BigDecimal lowerLimit, @Nullable BigDecimal minAmount, @Nullable BigDecimal multiplier, @Nullable BigDecimal realMinAmount, @Nullable BigDecimal upperLimit) {
        return new FuturesGridAiParamsEntity(diff, direction, feeRatio, gridNum, gridProfitLowerRatio, gridProfitUpperRatio, isNotice, leverage, lowerLimit, minAmount, multiplier, realMinAmount, upperLimit);
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
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    @Nullable
    public final BigDecimal getMinAmount() {
        return this.minAmount;
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
    public final BigDecimal getUpperLimit() {
        return this.upperLimit;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.diff;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.direction;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.feeRatio;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.gridNum;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.gridProfitLowerRatio;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.gridProfitUpperRatio;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Boolean bool = this.isNotice;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.leverage;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.lowerLimit;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.minAmount;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.multiplier;
        int iHashCode11 = (iHashCode10 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.realMinAmount;
        int iHashCode12 = (iHashCode11 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.upperLimit;
        return iHashCode12 + (bigDecimal11 != null ? bigDecimal11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNotice() {
        return this.isNotice;
    }

    @NotNull
    public String toString() {
        return "FuturesGridAiParamsEntity(diff=" + this.diff + ", direction=" + this.direction + ", feeRatio=" + this.feeRatio + ", gridNum=" + this.gridNum + ", gridProfitLowerRatio=" + this.gridProfitLowerRatio + ", gridProfitUpperRatio=" + this.gridProfitUpperRatio + ", isNotice=" + this.isNotice + ", leverage=" + this.leverage + ", lowerLimit=" + this.lowerLimit + ", minAmount=" + this.minAmount + ", multiplier=" + this.multiplier + ", realMinAmount=" + this.realMinAmount + ", upperLimit=" + this.upperLimit + ')';
    }

    public /* synthetic */ FuturesGridAiParamsEntity(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Boolean bool, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7, (i11 & 512) != 0 ? null : bigDecimal8, (i11 & 1024) != 0 ? null : bigDecimal9, (i11 & 2048) != 0 ? null : bigDecimal10, (i11 & 4096) != 0 ? null : bigDecimal11);
    }
}
