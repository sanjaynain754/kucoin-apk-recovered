package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiTradeModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J{\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;", "", "borrowableDebtBufferRatio", "", "earlyWarningDebtRatio", "liquidationDebtRatio", "maxAutoLoanDebtRatio", "maxLeverage", "defaultLeverage", "transferableAmountDebtBufferRatio", "transferableAmountDebtRatio", "riskLeverage", "riskGrade", "remindPriceDeviateRatio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBorrowableDebtBufferRatio", "()Ljava/lang/String;", "getDefaultLeverage", "getEarlyWarningDebtRatio", "getLiquidationDebtRatio", "getMaxAutoLoanDebtRatio", "getMaxLeverage", "getRemindPriceDeviateRatio", "getRiskGrade", "getRiskLeverage", "getTransferableAmountDebtBufferRatio", "getTransferableAmountDebtRatio", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiTradeMarginConfig {

    @NotNull
    private final String borrowableDebtBufferRatio;

    @NotNull
    private final String defaultLeverage;

    @NotNull
    private final String earlyWarningDebtRatio;

    @NotNull
    private final String liquidationDebtRatio;

    @NotNull
    private final String maxAutoLoanDebtRatio;

    @NotNull
    private final String maxLeverage;

    @Nullable
    private final String remindPriceDeviateRatio;

    @Nullable
    private final String riskGrade;

    @NotNull
    private final String riskLeverage;

    @NotNull
    private final String transferableAmountDebtBufferRatio;

    @NotNull
    private final String transferableAmountDebtRatio;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiTradeMarginConfig)) {
            return false;
        }
        KCJSApiTradeMarginConfig kCJSApiTradeMarginConfig = (KCJSApiTradeMarginConfig) other;
        return Intrinsics.areEqual(this.borrowableDebtBufferRatio, kCJSApiTradeMarginConfig.borrowableDebtBufferRatio) && Intrinsics.areEqual(this.earlyWarningDebtRatio, kCJSApiTradeMarginConfig.earlyWarningDebtRatio) && Intrinsics.areEqual(this.liquidationDebtRatio, kCJSApiTradeMarginConfig.liquidationDebtRatio) && Intrinsics.areEqual(this.maxAutoLoanDebtRatio, kCJSApiTradeMarginConfig.maxAutoLoanDebtRatio) && Intrinsics.areEqual(this.maxLeverage, kCJSApiTradeMarginConfig.maxLeverage) && Intrinsics.areEqual(this.defaultLeverage, kCJSApiTradeMarginConfig.defaultLeverage) && Intrinsics.areEqual(this.transferableAmountDebtBufferRatio, kCJSApiTradeMarginConfig.transferableAmountDebtBufferRatio) && Intrinsics.areEqual(this.transferableAmountDebtRatio, kCJSApiTradeMarginConfig.transferableAmountDebtRatio) && Intrinsics.areEqual(this.riskLeverage, kCJSApiTradeMarginConfig.riskLeverage) && Intrinsics.areEqual(this.riskGrade, kCJSApiTradeMarginConfig.riskGrade) && Intrinsics.areEqual(this.remindPriceDeviateRatio, kCJSApiTradeMarginConfig.remindPriceDeviateRatio);
    }

    public KCJSApiTradeMarginConfig(@NotNull String borrowableDebtBufferRatio, @NotNull String earlyWarningDebtRatio, @NotNull String liquidationDebtRatio, @NotNull String maxAutoLoanDebtRatio, @NotNull String maxLeverage, @NotNull String defaultLeverage, @NotNull String transferableAmountDebtBufferRatio, @NotNull String transferableAmountDebtRatio, @NotNull String riskLeverage, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(borrowableDebtBufferRatio, "borrowableDebtBufferRatio");
        Intrinsics.checkNotNullParameter(earlyWarningDebtRatio, "earlyWarningDebtRatio");
        Intrinsics.checkNotNullParameter(liquidationDebtRatio, "liquidationDebtRatio");
        Intrinsics.checkNotNullParameter(maxAutoLoanDebtRatio, "maxAutoLoanDebtRatio");
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(defaultLeverage, "defaultLeverage");
        Intrinsics.checkNotNullParameter(transferableAmountDebtBufferRatio, "transferableAmountDebtBufferRatio");
        Intrinsics.checkNotNullParameter(transferableAmountDebtRatio, "transferableAmountDebtRatio");
        Intrinsics.checkNotNullParameter(riskLeverage, "riskLeverage");
        this.borrowableDebtBufferRatio = borrowableDebtBufferRatio;
        this.earlyWarningDebtRatio = earlyWarningDebtRatio;
        this.liquidationDebtRatio = liquidationDebtRatio;
        this.maxAutoLoanDebtRatio = maxAutoLoanDebtRatio;
        this.maxLeverage = maxLeverage;
        this.defaultLeverage = defaultLeverage;
        this.transferableAmountDebtBufferRatio = transferableAmountDebtBufferRatio;
        this.transferableAmountDebtRatio = transferableAmountDebtRatio;
        this.riskLeverage = riskLeverage;
        this.riskGrade = str;
        this.remindPriceDeviateRatio = str2;
    }

    public static /* synthetic */ KCJSApiTradeMarginConfig copy$default(KCJSApiTradeMarginConfig kCJSApiTradeMarginConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiTradeMarginConfig.borrowableDebtBufferRatio;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiTradeMarginConfig.earlyWarningDebtRatio;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiTradeMarginConfig.liquidationDebtRatio;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiTradeMarginConfig.maxAutoLoanDebtRatio;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiTradeMarginConfig.maxLeverage;
        }
        if ((i11 & 32) != 0) {
            str6 = kCJSApiTradeMarginConfig.defaultLeverage;
        }
        if ((i11 & 64) != 0) {
            str7 = kCJSApiTradeMarginConfig.transferableAmountDebtBufferRatio;
        }
        if ((i11 & 128) != 0) {
            str8 = kCJSApiTradeMarginConfig.transferableAmountDebtRatio;
        }
        if ((i11 & 256) != 0) {
            str9 = kCJSApiTradeMarginConfig.riskLeverage;
        }
        if ((i11 & 512) != 0) {
            str10 = kCJSApiTradeMarginConfig.riskGrade;
        }
        if ((i11 & 1024) != 0) {
            str11 = kCJSApiTradeMarginConfig.remindPriceDeviateRatio;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return kCJSApiTradeMarginConfig.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRiskLeverage() {
        return this.riskLeverage;
    }

    @NotNull
    public final KCJSApiTradeMarginConfig copy(@NotNull String borrowableDebtBufferRatio, @NotNull String earlyWarningDebtRatio, @NotNull String liquidationDebtRatio, @NotNull String maxAutoLoanDebtRatio, @NotNull String maxLeverage, @NotNull String defaultLeverage, @NotNull String transferableAmountDebtBufferRatio, @NotNull String transferableAmountDebtRatio, @NotNull String riskLeverage, @Nullable String riskGrade, @Nullable String remindPriceDeviateRatio) {
        Intrinsics.checkNotNullParameter(borrowableDebtBufferRatio, "borrowableDebtBufferRatio");
        Intrinsics.checkNotNullParameter(earlyWarningDebtRatio, "earlyWarningDebtRatio");
        Intrinsics.checkNotNullParameter(liquidationDebtRatio, "liquidationDebtRatio");
        Intrinsics.checkNotNullParameter(maxAutoLoanDebtRatio, "maxAutoLoanDebtRatio");
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(defaultLeverage, "defaultLeverage");
        Intrinsics.checkNotNullParameter(transferableAmountDebtBufferRatio, "transferableAmountDebtBufferRatio");
        Intrinsics.checkNotNullParameter(transferableAmountDebtRatio, "transferableAmountDebtRatio");
        Intrinsics.checkNotNullParameter(riskLeverage, "riskLeverage");
        return new KCJSApiTradeMarginConfig(borrowableDebtBufferRatio, earlyWarningDebtRatio, liquidationDebtRatio, maxAutoLoanDebtRatio, maxLeverage, defaultLeverage, transferableAmountDebtBufferRatio, transferableAmountDebtRatio, riskLeverage, riskGrade, remindPriceDeviateRatio);
    }

    @NotNull
    public final String getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @NotNull
    public final String getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @NotNull
    public final String getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @NotNull
    public final String getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @NotNull
    public final String getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @NotNull
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @Nullable
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @NotNull
    public final String getRiskLeverage() {
        return this.riskLeverage;
    }

    @NotNull
    public final String getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @NotNull
    public final String getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.borrowableDebtBufferRatio.hashCode() * 31) + this.earlyWarningDebtRatio.hashCode()) * 31) + this.liquidationDebtRatio.hashCode()) * 31) + this.maxAutoLoanDebtRatio.hashCode()) * 31) + this.maxLeverage.hashCode()) * 31) + this.defaultLeverage.hashCode()) * 31) + this.transferableAmountDebtBufferRatio.hashCode()) * 31) + this.transferableAmountDebtRatio.hashCode()) * 31) + this.riskLeverage.hashCode()) * 31;
        String str = this.riskGrade;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remindPriceDeviateRatio;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiTradeMarginConfig(borrowableDebtBufferRatio=" + this.borrowableDebtBufferRatio + ", earlyWarningDebtRatio=" + this.earlyWarningDebtRatio + ", liquidationDebtRatio=" + this.liquidationDebtRatio + ", maxAutoLoanDebtRatio=" + this.maxAutoLoanDebtRatio + ", maxLeverage=" + this.maxLeverage + ", defaultLeverage=" + this.defaultLeverage + ", transferableAmountDebtBufferRatio=" + this.transferableAmountDebtBufferRatio + ", transferableAmountDebtRatio=" + this.transferableAmountDebtRatio + ", riskLeverage=" + this.riskLeverage + ", riskGrade=" + this.riskGrade + ", remindPriceDeviateRatio=" + this.remindPriceDeviateRatio + ')';
    }
}
