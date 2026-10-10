package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsFutureSnapshotEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "", "symbol", "", "volume", "", "turnover", "lastPrice", "lowPrice", "highPrice", "priceChg", "priceChgPct", "fundingRate", "Ljava/math/BigDecimal;", "futuresMarks", "", "<init>", "(Ljava/lang/String;DDDDDDDLjava/math/BigDecimal;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "getVolume", "()D", "getTurnover", "getLastPrice", "getLowPrice", "getHighPrice", "getPriceChg", "getPriceChgPct", "getFundingRate", "()Ljava/math/BigDecimal;", "getFuturesMarks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsFutureSnapshotEntity {

    @Nullable
    private final BigDecimal fundingRate;

    @Nullable
    private final List<String> futuresMarks;
    private final double highPrice;
    private final double lastPrice;
    private final double lowPrice;
    private final double priceChg;
    private final double priceChgPct;

    @NotNull
    private final String symbol;
    private final double turnover;
    private final double volume;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsFutureSnapshotEntity)) {
            return false;
        }
        WsFutureSnapshotEntity wsFutureSnapshotEntity = (WsFutureSnapshotEntity) other;
        return Intrinsics.areEqual(this.symbol, wsFutureSnapshotEntity.symbol) && Double.compare(this.volume, wsFutureSnapshotEntity.volume) == 0 && Double.compare(this.turnover, wsFutureSnapshotEntity.turnover) == 0 && Double.compare(this.lastPrice, wsFutureSnapshotEntity.lastPrice) == 0 && Double.compare(this.lowPrice, wsFutureSnapshotEntity.lowPrice) == 0 && Double.compare(this.highPrice, wsFutureSnapshotEntity.highPrice) == 0 && Double.compare(this.priceChg, wsFutureSnapshotEntity.priceChg) == 0 && Double.compare(this.priceChgPct, wsFutureSnapshotEntity.priceChgPct) == 0 && Intrinsics.areEqual(this.fundingRate, wsFutureSnapshotEntity.fundingRate) && Intrinsics.areEqual(this.futuresMarks, wsFutureSnapshotEntity.futuresMarks);
    }

    public WsFutureSnapshotEntity(@NotNull String symbol, double d11, double d12, double d13, double d14, double d15, double d16, double d17, @Nullable BigDecimal bigDecimal, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.volume = d11;
        this.turnover = d12;
        this.lastPrice = d13;
        this.lowPrice = d14;
        this.highPrice = d15;
        this.priceChg = d16;
        this.priceChgPct = d17;
        this.fundingRate = bigDecimal;
        this.futuresMarks = list;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final List<String> component10() {
        return this.futuresMarks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTurnover() {
        return this.turnover;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLastPrice() {
        return this.lastPrice;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLowPrice() {
        return this.lowPrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getHighPrice() {
        return this.highPrice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getPriceChg() {
        return this.priceChg;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @NotNull
    public final WsFutureSnapshotEntity copy(@NotNull String symbol, double volume, double turnover, double lastPrice, double lowPrice, double highPrice, double priceChg, double priceChgPct, @Nullable BigDecimal fundingRate, @Nullable List<String> futuresMarks) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new WsFutureSnapshotEntity(symbol, volume, turnover, lastPrice, lowPrice, highPrice, priceChg, priceChgPct, fundingRate, futuresMarks);
    }

    @Nullable
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final List<String> getFuturesMarks() {
        return this.futuresMarks;
    }

    public final double getHighPrice() {
        return this.highPrice;
    }

    public final double getLastPrice() {
        return this.lastPrice;
    }

    public final double getLowPrice() {
        return this.lowPrice;
    }

    public final double getPriceChg() {
        return this.priceChg;
    }

    public final double getPriceChgPct() {
        return this.priceChgPct;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final double getTurnover() {
        return this.turnover;
    }

    public final double getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.symbol.hashCode() * 31) + Double.hashCode(this.volume)) * 31) + Double.hashCode(this.turnover)) * 31) + Double.hashCode(this.lastPrice)) * 31) + Double.hashCode(this.lowPrice)) * 31) + Double.hashCode(this.highPrice)) * 31) + Double.hashCode(this.priceChg)) * 31) + Double.hashCode(this.priceChgPct)) * 31;
        BigDecimal bigDecimal = this.fundingRate;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        List<String> list = this.futuresMarks;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsFutureSnapshotEntity(symbol=" + this.symbol + ", volume=" + this.volume + ", turnover=" + this.turnover + ", lastPrice=" + this.lastPrice + ", lowPrice=" + this.lowPrice + ", highPrice=" + this.highPrice + ", priceChg=" + this.priceChg + ", priceChgPct=" + this.priceChgPct + ", fundingRate=" + this.fundingRate + ", futuresMarks=" + this.futuresMarks + ')';
    }
}
