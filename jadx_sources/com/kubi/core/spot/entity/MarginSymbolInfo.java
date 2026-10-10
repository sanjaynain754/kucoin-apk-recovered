package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginSymbolInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/core/spot/entity/MarginSymbolInfo;", "", "symbol", "", "symbolId", "", "baseLeverage", "quoteLeverage", "isBaseAllowBorrow", "", "isQuoteAllowBorrow", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V", "getSymbol", "()Ljava/lang/String;", "getSymbolId", "()I", "getBaseLeverage", "getQuoteLeverage", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginSymbolInfo {

    @NotNull
    private final String baseLeverage;
    private final boolean isBaseAllowBorrow;
    private final boolean isQuoteAllowBorrow;

    @NotNull
    private final String quoteLeverage;

    @NotNull
    private final String symbol;
    private final int symbolId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginSymbolInfo)) {
            return false;
        }
        MarginSymbolInfo marginSymbolInfo = (MarginSymbolInfo) other;
        return Intrinsics.areEqual(this.symbol, marginSymbolInfo.symbol) && this.symbolId == marginSymbolInfo.symbolId && Intrinsics.areEqual(this.baseLeverage, marginSymbolInfo.baseLeverage) && Intrinsics.areEqual(this.quoteLeverage, marginSymbolInfo.quoteLeverage) && this.isBaseAllowBorrow == marginSymbolInfo.isBaseAllowBorrow && this.isQuoteAllowBorrow == marginSymbolInfo.isQuoteAllowBorrow;
    }

    public MarginSymbolInfo(@NotNull String symbol, int i11, @NotNull String baseLeverage, @NotNull String quoteLeverage, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseLeverage, "baseLeverage");
        Intrinsics.checkNotNullParameter(quoteLeverage, "quoteLeverage");
        this.symbol = symbol;
        this.symbolId = i11;
        this.baseLeverage = baseLeverage;
        this.quoteLeverage = quoteLeverage;
        this.isBaseAllowBorrow = z11;
        this.isQuoteAllowBorrow = z12;
    }

    public static /* synthetic */ MarginSymbolInfo copy$default(MarginSymbolInfo marginSymbolInfo, String str, int i11, String str2, String str3, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = marginSymbolInfo.symbol;
        }
        if ((i12 & 2) != 0) {
            i11 = marginSymbolInfo.symbolId;
        }
        if ((i12 & 4) != 0) {
            str2 = marginSymbolInfo.baseLeverage;
        }
        if ((i12 & 8) != 0) {
            str3 = marginSymbolInfo.quoteLeverage;
        }
        if ((i12 & 16) != 0) {
            z11 = marginSymbolInfo.isBaseAllowBorrow;
        }
        if ((i12 & 32) != 0) {
            z12 = marginSymbolInfo.isQuoteAllowBorrow;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return marginSymbolInfo.copy(str, i11, str2, str3, z13, z14);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSymbolId() {
        return this.symbolId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseLeverage() {
        return this.baseLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuoteLeverage() {
        return this.quoteLeverage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsBaseAllowBorrow() {
        return this.isBaseAllowBorrow;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsQuoteAllowBorrow() {
        return this.isQuoteAllowBorrow;
    }

    @NotNull
    public final MarginSymbolInfo copy(@NotNull String symbol, int symbolId, @NotNull String baseLeverage, @NotNull String quoteLeverage, boolean isBaseAllowBorrow, boolean isQuoteAllowBorrow) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseLeverage, "baseLeverage");
        Intrinsics.checkNotNullParameter(quoteLeverage, "quoteLeverage");
        return new MarginSymbolInfo(symbol, symbolId, baseLeverage, quoteLeverage, isBaseAllowBorrow, isQuoteAllowBorrow);
    }

    @NotNull
    public final String getBaseLeverage() {
        return this.baseLeverage;
    }

    @NotNull
    public final String getQuoteLeverage() {
        return this.quoteLeverage;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final int getSymbolId() {
        return this.symbolId;
    }

    public int hashCode() {
        return (((((((((this.symbol.hashCode() * 31) + Integer.hashCode(this.symbolId)) * 31) + this.baseLeverage.hashCode()) * 31) + this.quoteLeverage.hashCode()) * 31) + Boolean.hashCode(this.isBaseAllowBorrow)) * 31) + Boolean.hashCode(this.isQuoteAllowBorrow);
    }

    public final boolean isBaseAllowBorrow() {
        return this.isBaseAllowBorrow;
    }

    public final boolean isQuoteAllowBorrow() {
        return this.isQuoteAllowBorrow;
    }

    @NotNull
    public String toString() {
        return "MarginSymbolInfo(symbol=" + this.symbol + ", symbolId=" + this.symbolId + ", baseLeverage=" + this.baseLeverage + ", quoteLeverage=" + this.quoteLeverage + ", isBaseAllowBorrow=" + this.isBaseAllowBorrow + ", isQuoteAllowBorrow=" + this.isQuoteAllowBorrow + ')';
    }
}
