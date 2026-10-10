package com.kubi.margin.api.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginBridgeConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00060"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginBridgeConfig;", "", "borrowableDebtBufferRatio", "Ljava/math/BigDecimal;", "earlyWarningDebtRatio", "liquidationDebtRatio", "maxAutoLoanDebtRatio", "maxLeverage", "defaultLeverage", "transferableAmountDebtBufferRatio", "transferableAmountDebtRatio", "riskLeverage", "riskGrade", "", "remindPriceDeviateRatio", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getBorrowableDebtBufferRatio", "()Ljava/math/BigDecimal;", "getEarlyWarningDebtRatio", "getLiquidationDebtRatio", "getMaxAutoLoanDebtRatio", "getMaxLeverage", "getDefaultLeverage", "getTransferableAmountDebtBufferRatio", "getTransferableAmountDebtRatio", "getRiskLeverage", "getRiskGrade", "()Ljava/lang/String;", "getRemindPriceDeviateRatio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginBridgeConfig {

    @Nullable
    private final BigDecimal borrowableDebtBufferRatio;

    @Nullable
    private final BigDecimal defaultLeverage;

    @Nullable
    private final BigDecimal earlyWarningDebtRatio;

    @Nullable
    private final BigDecimal liquidationDebtRatio;

    @Nullable
    private final BigDecimal maxAutoLoanDebtRatio;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final BigDecimal remindPriceDeviateRatio;

    @Nullable
    private final String riskGrade;

    @Nullable
    private final BigDecimal riskLeverage;

    @Nullable
    private final BigDecimal transferableAmountDebtBufferRatio;

    @Nullable
    private final BigDecimal transferableAmountDebtRatio;

    public static /* synthetic */ MarginBridgeConfig copy$default(MarginBridgeConfig marginBridgeConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str, BigDecimal bigDecimal10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = marginBridgeConfig.borrowableDebtBufferRatio;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = marginBridgeConfig.earlyWarningDebtRatio;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = marginBridgeConfig.liquidationDebtRatio;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = marginBridgeConfig.maxAutoLoanDebtRatio;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = marginBridgeConfig.maxLeverage;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = marginBridgeConfig.defaultLeverage;
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = marginBridgeConfig.transferableAmountDebtBufferRatio;
        }
        if ((i11 & 128) != 0) {
            bigDecimal8 = marginBridgeConfig.transferableAmountDebtRatio;
        }
        if ((i11 & 256) != 0) {
            bigDecimal9 = marginBridgeConfig.riskLeverage;
        }
        if ((i11 & 512) != 0) {
            str = marginBridgeConfig.riskGrade;
        }
        if ((i11 & 1024) != 0) {
            bigDecimal10 = marginBridgeConfig.remindPriceDeviateRatio;
        }
        String str2 = str;
        BigDecimal bigDecimal11 = bigDecimal10;
        BigDecimal bigDecimal12 = bigDecimal8;
        BigDecimal bigDecimal13 = bigDecimal9;
        BigDecimal bigDecimal14 = bigDecimal6;
        BigDecimal bigDecimal15 = bigDecimal7;
        BigDecimal bigDecimal16 = bigDecimal5;
        BigDecimal bigDecimal17 = bigDecimal3;
        return marginBridgeConfig.copy(bigDecimal, bigDecimal2, bigDecimal17, bigDecimal4, bigDecimal16, bigDecimal14, bigDecimal15, bigDecimal12, bigDecimal13, str2, bigDecimal11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginBridgeConfig)) {
            return false;
        }
        MarginBridgeConfig marginBridgeConfig = (MarginBridgeConfig) other;
        return Intrinsics.areEqual(this.borrowableDebtBufferRatio, marginBridgeConfig.borrowableDebtBufferRatio) && Intrinsics.areEqual(this.earlyWarningDebtRatio, marginBridgeConfig.earlyWarningDebtRatio) && Intrinsics.areEqual(this.liquidationDebtRatio, marginBridgeConfig.liquidationDebtRatio) && Intrinsics.areEqual(this.maxAutoLoanDebtRatio, marginBridgeConfig.maxAutoLoanDebtRatio) && Intrinsics.areEqual(this.maxLeverage, marginBridgeConfig.maxLeverage) && Intrinsics.areEqual(this.defaultLeverage, marginBridgeConfig.defaultLeverage) && Intrinsics.areEqual(this.transferableAmountDebtBufferRatio, marginBridgeConfig.transferableAmountDebtBufferRatio) && Intrinsics.areEqual(this.transferableAmountDebtRatio, marginBridgeConfig.transferableAmountDebtRatio) && Intrinsics.areEqual(this.riskLeverage, marginBridgeConfig.riskLeverage) && Intrinsics.areEqual(this.riskGrade, marginBridgeConfig.riskGrade) && Intrinsics.areEqual(this.remindPriceDeviateRatio, marginBridgeConfig.remindPriceDeviateRatio);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @NotNull
    public final MarginBridgeConfig copy(@Nullable BigDecimal borrowableDebtBufferRatio, @Nullable BigDecimal earlyWarningDebtRatio, @Nullable BigDecimal liquidationDebtRatio, @Nullable BigDecimal maxAutoLoanDebtRatio, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal defaultLeverage, @Nullable BigDecimal transferableAmountDebtBufferRatio, @Nullable BigDecimal transferableAmountDebtRatio, @Nullable BigDecimal riskLeverage, @Nullable String riskGrade, @Nullable BigDecimal remindPriceDeviateRatio) {
        return new MarginBridgeConfig(borrowableDebtBufferRatio, earlyWarningDebtRatio, liquidationDebtRatio, maxAutoLoanDebtRatio, maxLeverage, defaultLeverage, transferableAmountDebtBufferRatio, transferableAmountDebtRatio, riskLeverage, riskGrade, remindPriceDeviateRatio);
    }

    @Nullable
    public final BigDecimal getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final BigDecimal getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @Nullable
    public final BigDecimal getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    public final BigDecimal getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @Nullable
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    public final BigDecimal getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @Nullable
    public final BigDecimal getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.borrowableDebtBufferRatio;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.earlyWarningDebtRatio;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.liquidationDebtRatio;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.maxAutoLoanDebtRatio;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.maxLeverage;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.defaultLeverage;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.transferableAmountDebtBufferRatio;
        int iHashCode7 = (iHashCode6 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.transferableAmountDebtRatio;
        int iHashCode8 = (iHashCode7 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.riskLeverage;
        int iHashCode9 = (iHashCode8 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str = this.riskGrade;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.remindPriceDeviateRatio;
        return iHashCode10 + (bigDecimal10 != null ? bigDecimal10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginBridgeConfig(borrowableDebtBufferRatio=" + this.borrowableDebtBufferRatio + ", earlyWarningDebtRatio=" + this.earlyWarningDebtRatio + ", liquidationDebtRatio=" + this.liquidationDebtRatio + ", maxAutoLoanDebtRatio=" + this.maxAutoLoanDebtRatio + ", maxLeverage=" + this.maxLeverage + ", defaultLeverage=" + this.defaultLeverage + ", transferableAmountDebtBufferRatio=" + this.transferableAmountDebtBufferRatio + ", transferableAmountDebtRatio=" + this.transferableAmountDebtRatio + ", riskLeverage=" + this.riskLeverage + ", riskGrade=" + this.riskGrade + ", remindPriceDeviateRatio=" + this.remindPriceDeviateRatio + ')';
    }

    public MarginBridgeConfig(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable String str, @Nullable BigDecimal bigDecimal10) {
        this.borrowableDebtBufferRatio = bigDecimal;
        this.earlyWarningDebtRatio = bigDecimal2;
        this.liquidationDebtRatio = bigDecimal3;
        this.maxAutoLoanDebtRatio = bigDecimal4;
        this.maxLeverage = bigDecimal5;
        this.defaultLeverage = bigDecimal6;
        this.transferableAmountDebtBufferRatio = bigDecimal7;
        this.transferableAmountDebtRatio = bigDecimal8;
        this.riskLeverage = bigDecimal9;
        this.riskGrade = str;
        this.remindPriceDeviateRatio = bigDecimal10;
    }
}
