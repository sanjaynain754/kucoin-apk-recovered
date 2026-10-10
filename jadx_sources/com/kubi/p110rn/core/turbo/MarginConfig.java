package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00061"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/MarginConfig;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "borrowableDebtBufferRatio", "", "earlyWarningDebtRatio", "liquidationDebtRatio", "maxAutoLoanDebtRatio", "maxLeverage", "defaultLeverage", "transferableAmountDebtBufferRatio", "transferableAmountDebtRatio", "riskGrade", "riskLeverage", "remindPriceDeviateRatio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBorrowableDebtBufferRatio", "()Ljava/lang/String;", "getEarlyWarningDebtRatio", "getLiquidationDebtRatio", "getMaxAutoLoanDebtRatio", "getMaxLeverage", "getDefaultLeverage", "getTransferableAmountDebtBufferRatio", "getTransferableAmountDebtRatio", "getRiskGrade", "getRiskLeverage", "getRemindPriceDeviateRatio", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeTradeTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTradeTurboModule.kt\ncom/kubi/rn/core/turbo/MarginConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n1#2:386\n*E\n"})
public final /* data */ class MarginConfig implements WritableMapSerializable {

    @Nullable
    private final String borrowableDebtBufferRatio;

    @Nullable
    private final String defaultLeverage;

    @Nullable
    private final String earlyWarningDebtRatio;

    @Nullable
    private final String liquidationDebtRatio;

    @Nullable
    private final String maxAutoLoanDebtRatio;

    @Nullable
    private final String maxLeverage;

    @Nullable
    private final String remindPriceDeviateRatio;

    @Nullable
    private final String riskGrade;

    @Nullable
    private final String riskLeverage;

    @Nullable
    private final String transferableAmountDebtBufferRatio;

    @Nullable
    private final String transferableAmountDebtRatio;

    public MarginConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ MarginConfig copy$default(MarginConfig marginConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginConfig.borrowableDebtBufferRatio;
        }
        if ((i11 & 2) != 0) {
            str2 = marginConfig.earlyWarningDebtRatio;
        }
        if ((i11 & 4) != 0) {
            str3 = marginConfig.liquidationDebtRatio;
        }
        if ((i11 & 8) != 0) {
            str4 = marginConfig.maxAutoLoanDebtRatio;
        }
        if ((i11 & 16) != 0) {
            str5 = marginConfig.maxLeverage;
        }
        if ((i11 & 32) != 0) {
            str6 = marginConfig.defaultLeverage;
        }
        if ((i11 & 64) != 0) {
            str7 = marginConfig.transferableAmountDebtBufferRatio;
        }
        if ((i11 & 128) != 0) {
            str8 = marginConfig.transferableAmountDebtRatio;
        }
        if ((i11 & 256) != 0) {
            str9 = marginConfig.riskGrade;
        }
        if ((i11 & 512) != 0) {
            str10 = marginConfig.riskLeverage;
        }
        if ((i11 & 1024) != 0) {
            str11 = marginConfig.remindPriceDeviateRatio;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return marginConfig.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginConfig)) {
            return false;
        }
        MarginConfig marginConfig = (MarginConfig) other;
        return Intrinsics.areEqual(this.borrowableDebtBufferRatio, marginConfig.borrowableDebtBufferRatio) && Intrinsics.areEqual(this.earlyWarningDebtRatio, marginConfig.earlyWarningDebtRatio) && Intrinsics.areEqual(this.liquidationDebtRatio, marginConfig.liquidationDebtRatio) && Intrinsics.areEqual(this.maxAutoLoanDebtRatio, marginConfig.maxAutoLoanDebtRatio) && Intrinsics.areEqual(this.maxLeverage, marginConfig.maxLeverage) && Intrinsics.areEqual(this.defaultLeverage, marginConfig.defaultLeverage) && Intrinsics.areEqual(this.transferableAmountDebtBufferRatio, marginConfig.transferableAmountDebtBufferRatio) && Intrinsics.areEqual(this.transferableAmountDebtRatio, marginConfig.transferableAmountDebtRatio) && Intrinsics.areEqual(this.riskGrade, marginConfig.riskGrade) && Intrinsics.areEqual(this.riskLeverage, marginConfig.riskLeverage) && Intrinsics.areEqual(this.remindPriceDeviateRatio, marginConfig.remindPriceDeviateRatio);
    }

    public MarginConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.borrowableDebtBufferRatio = str;
        this.earlyWarningDebtRatio = str2;
        this.liquidationDebtRatio = str3;
        this.maxAutoLoanDebtRatio = str4;
        this.maxLeverage = str5;
        this.defaultLeverage = str6;
        this.transferableAmountDebtBufferRatio = str7;
        this.transferableAmountDebtRatio = str8;
        this.riskGrade = str9;
        this.riskLeverage = str10;
        this.remindPriceDeviateRatio = str11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @NotNull
    public final MarginConfig copy(@Nullable String borrowableDebtBufferRatio, @Nullable String earlyWarningDebtRatio, @Nullable String liquidationDebtRatio, @Nullable String maxAutoLoanDebtRatio, @Nullable String maxLeverage, @Nullable String defaultLeverage, @Nullable String transferableAmountDebtBufferRatio, @Nullable String transferableAmountDebtRatio, @Nullable String riskGrade, @Nullable String riskLeverage, @Nullable String remindPriceDeviateRatio) {
        return new MarginConfig(borrowableDebtBufferRatio, earlyWarningDebtRatio, liquidationDebtRatio, maxAutoLoanDebtRatio, maxLeverage, defaultLeverage, transferableAmountDebtBufferRatio, transferableAmountDebtRatio, riskGrade, riskLeverage, remindPriceDeviateRatio);
    }

    @Nullable
    public final String getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    public final String getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final String getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @Nullable
    public final String getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    public final String getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @Nullable
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

    @Nullable
    public final String getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    public final String getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @Nullable
    public final String getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    public int hashCode() {
        String str = this.borrowableDebtBufferRatio;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.earlyWarningDebtRatio;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.liquidationDebtRatio;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxAutoLoanDebtRatio;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxLeverage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.defaultLeverage;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.transferableAmountDebtBufferRatio;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transferableAmountDebtRatio;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.riskGrade;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.riskLeverage;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.remindPriceDeviateRatio;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginConfig(borrowableDebtBufferRatio=" + this.borrowableDebtBufferRatio + ", earlyWarningDebtRatio=" + this.earlyWarningDebtRatio + ", liquidationDebtRatio=" + this.liquidationDebtRatio + ", maxAutoLoanDebtRatio=" + this.maxAutoLoanDebtRatio + ", maxLeverage=" + this.maxLeverage + ", defaultLeverage=" + this.defaultLeverage + ", transferableAmountDebtBufferRatio=" + this.transferableAmountDebtBufferRatio + ", transferableAmountDebtRatio=" + this.transferableAmountDebtRatio + ", riskGrade=" + this.riskGrade + ", riskLeverage=" + this.riskLeverage + ", remindPriceDeviateRatio=" + this.remindPriceDeviateRatio + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.borrowableDebtBufferRatio;
        if (str != null) {
            writableMapCreateMap.putString("borrowableDebtBufferRatio", str.toString());
        }
        String str2 = this.earlyWarningDebtRatio;
        if (str2 != null) {
            writableMapCreateMap.putString("earlyWarningDebtRatio", str2.toString());
        }
        String str3 = this.liquidationDebtRatio;
        if (str3 != null) {
            writableMapCreateMap.putString("liquidationDebtRatio", str3.toString());
        }
        String str4 = this.maxAutoLoanDebtRatio;
        if (str4 != null) {
            writableMapCreateMap.putString("maxAutoLoanDebtRatio", str4.toString());
        }
        String str5 = this.maxLeverage;
        if (str5 != null) {
            writableMapCreateMap.putString("maxLeverage", str5.toString());
        }
        String str6 = this.defaultLeverage;
        if (str6 != null) {
            writableMapCreateMap.putString("defaultLeverage", str6.toString());
        }
        String str7 = this.transferableAmountDebtBufferRatio;
        if (str7 != null) {
            writableMapCreateMap.putString("transferableAmountDebtBufferRatio", str7.toString());
        }
        String str8 = this.transferableAmountDebtRatio;
        if (str8 != null) {
            writableMapCreateMap.putString("transferableAmountDebtRatio", str8.toString());
        }
        String str9 = this.riskGrade;
        if (str9 != null) {
            writableMapCreateMap.putString("riskGrade", str9.toString());
        }
        String str10 = this.riskLeverage;
        if (str10 != null) {
            writableMapCreateMap.putString("riskLeverage", str10.toString());
        }
        String str11 = this.remindPriceDeviateRatio;
        if (str11 != null) {
            writableMapCreateMap.putString("remindPriceDeviateRatio", str11.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ MarginConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11);
    }
}
