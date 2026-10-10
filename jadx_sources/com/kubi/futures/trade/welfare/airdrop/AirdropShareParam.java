package com.kubi.futures.trade.welfare.airdrop;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.airdrop.o0, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AirdropPositionPnlDetailsDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00066"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropShareParam;", "", "symbol", "", "sideStr", "side", "marginModeStr", "leverageStr", "trialTagStr", "airdropMarginStr", "airdropTimeStr", "airdropPnlStr", "airdropPnl", "Ljava/math/BigDecimal;", "airdropPnlRateStr", "airdropPnlRate", "airdropWithDrawAmountStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSideStr", "getSide", "getMarginModeStr", "getLeverageStr", "getTrialTagStr", "getAirdropMarginStr", "getAirdropTimeStr", "getAirdropPnlStr", "getAirdropPnl", "()Ljava/math/BigDecimal;", "getAirdropPnlRateStr", "getAirdropPnlRate", "getAirdropWithDrawAmountStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AirdropShareParam {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String sideStr;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String side;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String marginModeStr;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final String leverageStr;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final String trialTagStr;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final String airdropMarginStr;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final String airdropTimeStr;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final String airdropPnlStr;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final BigDecimal airdropPnl;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public final String airdropPnlRateStr;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public final BigDecimal airdropPnlRate;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public final String airdropWithDrawAmountStr;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirdropShareParam)) {
            return false;
        }
        AirdropShareParam airdropShareParam = (AirdropShareParam) other;
        return Intrinsics.areEqual(this.symbol, airdropShareParam.symbol) && Intrinsics.areEqual(this.sideStr, airdropShareParam.sideStr) && Intrinsics.areEqual(this.side, airdropShareParam.side) && Intrinsics.areEqual(this.marginModeStr, airdropShareParam.marginModeStr) && Intrinsics.areEqual(this.leverageStr, airdropShareParam.leverageStr) && Intrinsics.areEqual(this.trialTagStr, airdropShareParam.trialTagStr) && Intrinsics.areEqual(this.airdropMarginStr, airdropShareParam.airdropMarginStr) && Intrinsics.areEqual(this.airdropTimeStr, airdropShareParam.airdropTimeStr) && Intrinsics.areEqual(this.airdropPnlStr, airdropShareParam.airdropPnlStr) && Intrinsics.areEqual(this.airdropPnl, airdropShareParam.airdropPnl) && Intrinsics.areEqual(this.airdropPnlRateStr, airdropShareParam.airdropPnlRateStr) && Intrinsics.areEqual(this.airdropPnlRate, airdropShareParam.airdropPnlRate) && Intrinsics.areEqual(this.airdropWithDrawAmountStr, airdropShareParam.airdropWithDrawAmountStr);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAirdropMarginStr() {
        return this.airdropMarginStr;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getAirdropPnl() {
        return this.airdropPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getAirdropPnlRate() {
        return this.airdropPnlRate;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAirdropPnlRateStr() {
        return this.airdropPnlRateStr;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAirdropPnlStr() {
        return this.airdropPnlStr;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAirdropTimeStr() {
        return this.airdropTimeStr;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAirdropWithDrawAmountStr() {
        return this.airdropWithDrawAmountStr;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLeverageStr() {
        return this.leverageStr;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sideStr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marginModeStr;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leverageStr;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trialTagStr;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.airdropMarginStr;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.airdropTimeStr;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.airdropPnlStr;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal = this.airdropPnl;
        int iHashCode10 = (iHashCode9 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str10 = this.airdropPnlRateStr;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.airdropPnlRate;
        int iHashCode12 = (iHashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str11 = this.airdropWithDrawAmountStr;
        return iHashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMarginModeStr() {
        return this.marginModeStr;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSideStr() {
        return this.sideStr;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTrialTagStr() {
        return this.trialTagStr;
    }

    @NotNull
    public String toString() {
        return "AirdropShareParam(symbol=" + this.symbol + ", sideStr=" + this.sideStr + ", side=" + this.side + ", marginModeStr=" + this.marginModeStr + ", leverageStr=" + this.leverageStr + ", trialTagStr=" + this.trialTagStr + ", airdropMarginStr=" + this.airdropMarginStr + ", airdropTimeStr=" + this.airdropTimeStr + ", airdropPnlStr=" + this.airdropPnlStr + ", airdropPnl=" + this.airdropPnl + ", airdropPnlRateStr=" + this.airdropPnlRateStr + ", airdropPnlRate=" + this.airdropPnlRate + ", airdropWithDrawAmountStr=" + this.airdropWithDrawAmountStr + ')';
    }

    public AirdropShareParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable BigDecimal bigDecimal, @Nullable String str10, @Nullable BigDecimal bigDecimal2, @Nullable String str11) {
        this.symbol = str;
        this.sideStr = str2;
        this.side = str3;
        this.marginModeStr = str4;
        this.leverageStr = str5;
        this.trialTagStr = str6;
        this.airdropMarginStr = str7;
        this.airdropTimeStr = str8;
        this.airdropPnlStr = str9;
        this.airdropPnl = bigDecimal;
        this.airdropPnlRateStr = str10;
        this.airdropPnlRate = bigDecimal2;
        this.airdropWithDrawAmountStr = str11;
    }
}
