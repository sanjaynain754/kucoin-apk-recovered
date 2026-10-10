package com.kubi.data.entity;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.utils.extensions.C27039d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsMarketSnapshotEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(J\u0012\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003Jc\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013¨\u0006<"}, m90084d2 = {"Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "", "changePrice", "", "changeRate", "lastTradedPrice", "symbolCode", "", "isEnableAuctionTrade", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "high", "low", "volValue", "<init>", "(DDDLjava/lang/String;ZDDDD)V", "getChangePrice", "()D", "setChangePrice", "(D)V", "getChangeRate", "setChangeRate", "getLastTradedPrice", "setLastTradedPrice", "getSymbolCode", "()Ljava/lang/String;", "setSymbolCode", "(Ljava/lang/String;)V", "()Z", "setEnableAuctionTrade", "(Z)V", "getOpen", "setOpen", "getHigh", "setHigh", "getLow", "setLow", "getVolValue", "setVolValue", "covertToTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean", "convertToMarketTicker", "Lcom/kubi/data/entity/MarketTicker;", "marketTicker", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsMarketSnapshotEntity {
    private double changePrice;
    private double changeRate;
    private double high;
    private boolean isEnableAuctionTrade;
    private double lastTradedPrice;
    private double low;
    private double open;

    @NotNull
    private String symbolCode;
    private double volValue;

    public static /* synthetic */ WsMarketSnapshotEntity copy$default(WsMarketSnapshotEntity wsMarketSnapshotEntity, double d11, double d12, double d13, String str, boolean z11, double d14, double d15, double d16, double d17, int i11, Object obj) {
        double d18;
        double d19;
        double d21 = (i11 & 1) != 0 ? wsMarketSnapshotEntity.changePrice : d11;
        double d22 = (i11 & 2) != 0 ? wsMarketSnapshotEntity.changeRate : d12;
        double d23 = (i11 & 4) != 0 ? wsMarketSnapshotEntity.lastTradedPrice : d13;
        String str2 = (i11 & 8) != 0 ? wsMarketSnapshotEntity.symbolCode : str;
        boolean z12 = (i11 & 16) != 0 ? wsMarketSnapshotEntity.isEnableAuctionTrade : z11;
        double d24 = (i11 & 32) != 0 ? wsMarketSnapshotEntity.open : d14;
        double d25 = (i11 & 64) != 0 ? wsMarketSnapshotEntity.high : d15;
        double d26 = (i11 & 128) != 0 ? wsMarketSnapshotEntity.low : d16;
        if ((i11 & 256) != 0) {
            d18 = wsMarketSnapshotEntity.volValue;
            d19 = d21;
        } else {
            d18 = d17;
            d19 = d21;
        }
        return wsMarketSnapshotEntity.copy(d19, d22, d23, str2, z12, d24, d25, d26, d18);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsMarketSnapshotEntity)) {
            return false;
        }
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) other;
        return Double.compare(this.changePrice, wsMarketSnapshotEntity.changePrice) == 0 && Double.compare(this.changeRate, wsMarketSnapshotEntity.changeRate) == 0 && Double.compare(this.lastTradedPrice, wsMarketSnapshotEntity.lastTradedPrice) == 0 && Intrinsics.areEqual(this.symbolCode, wsMarketSnapshotEntity.symbolCode) && this.isEnableAuctionTrade == wsMarketSnapshotEntity.isEnableAuctionTrade && Double.compare(this.open, wsMarketSnapshotEntity.open) == 0 && Double.compare(this.high, wsMarketSnapshotEntity.high) == 0 && Double.compare(this.low, wsMarketSnapshotEntity.low) == 0 && Double.compare(this.volValue, wsMarketSnapshotEntity.volValue) == 0;
    }

    public WsMarketSnapshotEntity(double d11, double d12, double d13, @NotNull String symbolCode, boolean z11, double d14, double d15, double d16, double d17) {
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        this.changePrice = d11;
        this.changeRate = d12;
        this.lastTradedPrice = d13;
        this.symbolCode = symbolCode;
        this.isEnableAuctionTrade = z11;
        this.open = d14;
        this.high = d15;
        this.low = d16;
        this.volValue = d17;
    }

    public static /* synthetic */ TradeItemBean covertToTradeItemBean$default(WsMarketSnapshotEntity wsMarketSnapshotEntity, TradeItemBean tradeItemBean, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tradeItemBean = new TradeItemBean();
        }
        return wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getChangePrice() {
        return this.changePrice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getChangeRate() {
        return this.changeRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getVolValue() {
        return this.volValue;
    }

    @Nullable
    public final MarketTicker convertToMarketTicker(@Nullable MarketTicker marketTicker) {
        if (marketTicker != null) {
            marketTicker.setLastDealPrice(Double.valueOf(this.lastTradedPrice));
        }
        if (marketTicker != null) {
            marketTicker.setHigh(Double.valueOf(this.high));
        }
        if (marketTicker != null) {
            marketTicker.setLow(Double.valueOf(this.low));
        }
        if (marketTicker != null) {
            marketTicker.setChangeRate(Double.valueOf(this.changeRate));
        }
        if (marketTicker != null) {
            marketTicker.setChangePrice(Double.valueOf(this.changePrice));
        }
        if (marketTicker != null) {
            marketTicker.setValue(Double.valueOf(this.volValue));
        }
        return marketTicker;
    }

    @NotNull
    public final WsMarketSnapshotEntity copy(double changePrice, double changeRate, double lastTradedPrice, @NotNull String symbolCode, boolean isEnableAuctionTrade, double open, double high, double low, double volValue) {
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        return new WsMarketSnapshotEntity(changePrice, changeRate, lastTradedPrice, symbolCode, isEnableAuctionTrade, open, high, low, volValue);
    }

    @NotNull
    public final TradeItemBean covertToTradeItemBean(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        tradeItemBean.setSymbol(this.symbolCode);
        tradeItemBean.setLastDealPrice(C27039d.m66646f(Double.valueOf(this.lastTradedPrice)));
        tradeItemBean.setEnableAuctionTrade(this.isEnableAuctionTrade);
        tradeItemBean.getSymbolInfoEntity().setEnableAuctionTrade(Boolean.valueOf(this.isEnableAuctionTrade));
        tradeItemBean.setChangeRate(Double.valueOf(this.changeRate));
        tradeItemBean.setValue(C27039d.m66646f(Double.valueOf(this.volValue)));
        return tradeItemBean;
    }

    public final double getChangePrice() {
        return this.changePrice;
    }

    public final double getChangeRate() {
        return this.changeRate;
    }

    public final double getHigh() {
        return this.high;
    }

    public final double getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    public final double getLow() {
        return this.low;
    }

    public final double getOpen() {
        return this.open;
    }

    @NotNull
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    public final double getVolValue() {
        return this.volValue;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.changePrice) * 31) + Double.hashCode(this.changeRate)) * 31) + Double.hashCode(this.lastTradedPrice)) * 31) + this.symbolCode.hashCode()) * 31) + Boolean.hashCode(this.isEnableAuctionTrade)) * 31) + Double.hashCode(this.open)) * 31) + Double.hashCode(this.high)) * 31) + Double.hashCode(this.low)) * 31) + Double.hashCode(this.volValue);
    }

    public final boolean isEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    public final void setChangePrice(double d11) {
        this.changePrice = d11;
    }

    public final void setChangeRate(double d11) {
        this.changeRate = d11;
    }

    public final void setEnableAuctionTrade(boolean z11) {
        this.isEnableAuctionTrade = z11;
    }

    public final void setHigh(double d11) {
        this.high = d11;
    }

    public final void setLastTradedPrice(double d11) {
        this.lastTradedPrice = d11;
    }

    public final void setLow(double d11) {
        this.low = d11;
    }

    public final void setOpen(double d11) {
        this.open = d11;
    }

    public final void setSymbolCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbolCode = str;
    }

    public final void setVolValue(double d11) {
        this.volValue = d11;
    }

    @NotNull
    public String toString() {
        return "WsMarketSnapshotEntity(changePrice=" + this.changePrice + ", changeRate=" + this.changeRate + ", lastTradedPrice=" + this.lastTradedPrice + ", symbolCode=" + this.symbolCode + ", isEnableAuctionTrade=" + this.isEnableAuctionTrade + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", volValue=" + this.volValue + ')';
    }
}
