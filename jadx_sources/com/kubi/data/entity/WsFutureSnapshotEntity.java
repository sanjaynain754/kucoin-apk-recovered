package com.kubi.data.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsFutureSnapshotEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006'"}, m90084d2 = {"Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "", "symbol", "", "volume", "", "turnover", "lastPrice", "lowPrice", "highPrice", "priceChg", "priceChgPct", "<init>", "(Ljava/lang/String;DDDDDDD)V", "getSymbol", "()Ljava/lang/String;", "getVolume", "()D", "getTurnover", "getLastPrice", "getLowPrice", "getHighPrice", "getPriceChg", "getPriceChgPct", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsFutureSnapshotEntity {
    private final double highPrice;
    private final double lastPrice;
    private final double lowPrice;
    private final double priceChg;
    private final double priceChgPct;

    @NotNull
    private final String symbol;
    private final double turnover;
    private final double volume;

    public static /* synthetic */ WsFutureSnapshotEntity copy$default(WsFutureSnapshotEntity wsFutureSnapshotEntity, String str, double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i11, Object obj) {
        double d18;
        String str2;
        String str3 = (i11 & 1) != 0 ? wsFutureSnapshotEntity.symbol : str;
        double d19 = (i11 & 2) != 0 ? wsFutureSnapshotEntity.volume : d11;
        double d21 = (i11 & 4) != 0 ? wsFutureSnapshotEntity.turnover : d12;
        double d22 = (i11 & 8) != 0 ? wsFutureSnapshotEntity.lastPrice : d13;
        double d23 = (i11 & 16) != 0 ? wsFutureSnapshotEntity.lowPrice : d14;
        double d24 = (i11 & 32) != 0 ? wsFutureSnapshotEntity.highPrice : d15;
        double d25 = (i11 & 64) != 0 ? wsFutureSnapshotEntity.priceChg : d16;
        if ((i11 & 128) != 0) {
            str2 = str3;
            d18 = wsFutureSnapshotEntity.priceChgPct;
        } else {
            d18 = d17;
            str2 = str3;
        }
        return wsFutureSnapshotEntity.copy(str2, d19, d21, d22, d23, d24, d25, d18);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsFutureSnapshotEntity)) {
            return false;
        }
        WsFutureSnapshotEntity wsFutureSnapshotEntity = (WsFutureSnapshotEntity) other;
        return Intrinsics.areEqual(this.symbol, wsFutureSnapshotEntity.symbol) && Double.compare(this.volume, wsFutureSnapshotEntity.volume) == 0 && Double.compare(this.turnover, wsFutureSnapshotEntity.turnover) == 0 && Double.compare(this.lastPrice, wsFutureSnapshotEntity.lastPrice) == 0 && Double.compare(this.lowPrice, wsFutureSnapshotEntity.lowPrice) == 0 && Double.compare(this.highPrice, wsFutureSnapshotEntity.highPrice) == 0 && Double.compare(this.priceChg, wsFutureSnapshotEntity.priceChg) == 0 && Double.compare(this.priceChgPct, wsFutureSnapshotEntity.priceChgPct) == 0;
    }

    public WsFutureSnapshotEntity(@NotNull String symbol, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.volume = d11;
        this.turnover = d12;
        this.lastPrice = d13;
        this.lowPrice = d14;
        this.highPrice = d15;
        this.priceChg = d16;
        this.priceChgPct = d17;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
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

    @NotNull
    public final WsFutureSnapshotEntity copy(@NotNull String symbol, double volume, double turnover, double lastPrice, double lowPrice, double highPrice, double priceChg, double priceChgPct) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new WsFutureSnapshotEntity(symbol, volume, turnover, lastPrice, lowPrice, highPrice, priceChg, priceChgPct);
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
        return (((((((((((((this.symbol.hashCode() * 31) + Double.hashCode(this.volume)) * 31) + Double.hashCode(this.turnover)) * 31) + Double.hashCode(this.lastPrice)) * 31) + Double.hashCode(this.lowPrice)) * 31) + Double.hashCode(this.highPrice)) * 31) + Double.hashCode(this.priceChg)) * 31) + Double.hashCode(this.priceChgPct);
    }

    @NotNull
    public String toString() {
        return "WsFutureSnapshotEntity(symbol=" + this.symbol + ", volume=" + this.volume + ", turnover=" + this.turnover + ", lastPrice=" + this.lastPrice + ", lowPrice=" + this.lowPrice + ", highPrice=" + this.highPrice + ", priceChg=" + this.priceChg + ", priceChgPct=" + this.priceChgPct + ')';
    }
}
