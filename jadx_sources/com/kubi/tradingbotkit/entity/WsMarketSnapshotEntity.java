package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27039d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsMarketSnapshotEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$J\u0012\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJn\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u00069"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/WsMarketSnapshotEntity;", "", "changePrice", "", "changeRate", "lastTradedPrice", "symbolCode", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "high", "low", "volValue", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getChangePrice", "()Ljava/lang/Double;", "setChangePrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getChangeRate", "setChangeRate", "getLastTradedPrice", "setLastTradedPrice", "getSymbolCode", "()Ljava/lang/String;", "setSymbolCode", "(Ljava/lang/String;)V", "getOpen", "setOpen", "getHigh", "setHigh", "getLow", "setLow", "getVolValue", "setVolValue", "covertToTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean", "convertToMarketTicker", "Lcom/kubi/data/entity/MarketTicker;", "marketTicker", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/kubi/tradingbotkit/entity/WsMarketSnapshotEntity;", "equals", "", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsMarketSnapshotEntity {

    @Nullable
    private Double changePrice;

    @Nullable
    private Double changeRate;

    @Nullable
    private Double high;

    @Nullable
    private Double lastTradedPrice;

    @Nullable
    private Double low;

    @Nullable
    private Double open;

    @Nullable
    private String symbolCode;

    @Nullable
    private Double volValue;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsMarketSnapshotEntity)) {
            return false;
        }
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) other;
        return Intrinsics.areEqual((Object) this.changePrice, (Object) wsMarketSnapshotEntity.changePrice) && Intrinsics.areEqual((Object) this.changeRate, (Object) wsMarketSnapshotEntity.changeRate) && Intrinsics.areEqual((Object) this.lastTradedPrice, (Object) wsMarketSnapshotEntity.lastTradedPrice) && Intrinsics.areEqual(this.symbolCode, wsMarketSnapshotEntity.symbolCode) && Intrinsics.areEqual((Object) this.open, (Object) wsMarketSnapshotEntity.open) && Intrinsics.areEqual((Object) this.high, (Object) wsMarketSnapshotEntity.high) && Intrinsics.areEqual((Object) this.low, (Object) wsMarketSnapshotEntity.low) && Intrinsics.areEqual((Object) this.volValue, (Object) wsMarketSnapshotEntity.volValue);
    }

    public static /* synthetic */ WsMarketSnapshotEntity copy$default(WsMarketSnapshotEntity wsMarketSnapshotEntity, Double d11, Double d12, Double d13, String str, Double d14, Double d15, Double d16, Double d17, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = wsMarketSnapshotEntity.changePrice;
        }
        if ((i11 & 2) != 0) {
            d12 = wsMarketSnapshotEntity.changeRate;
        }
        if ((i11 & 4) != 0) {
            d13 = wsMarketSnapshotEntity.lastTradedPrice;
        }
        if ((i11 & 8) != 0) {
            str = wsMarketSnapshotEntity.symbolCode;
        }
        if ((i11 & 16) != 0) {
            d14 = wsMarketSnapshotEntity.open;
        }
        if ((i11 & 32) != 0) {
            d15 = wsMarketSnapshotEntity.high;
        }
        if ((i11 & 64) != 0) {
            d16 = wsMarketSnapshotEntity.low;
        }
        if ((i11 & 128) != 0) {
            d17 = wsMarketSnapshotEntity.volValue;
        }
        Double d18 = d16;
        Double d19 = d17;
        Double d21 = d14;
        Double d22 = d15;
        return wsMarketSnapshotEntity.copy(d11, d12, d13, str, d21, d22, d18, d19);
    }

    public static /* synthetic */ TradeItemBean covertToTradeItemBean$default(WsMarketSnapshotEntity wsMarketSnapshotEntity, TradeItemBean tradeItemBean, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tradeItemBean = new TradeItemBean();
        }
        return wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getOpen() {
        return this.open;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getHigh() {
        return this.high;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getLow() {
        return this.low;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getVolValue() {
        return this.volValue;
    }

    @Nullable
    public final MarketTicker convertToMarketTicker(@Nullable MarketTicker marketTicker) {
        if (marketTicker != null) {
            marketTicker.setLastDealPrice(this.lastTradedPrice);
        }
        if (marketTicker != null) {
            marketTicker.setHigh(this.high);
        }
        if (marketTicker != null) {
            marketTicker.setLow(this.low);
        }
        if (marketTicker != null) {
            marketTicker.setChangeRate(this.changeRate);
        }
        if (marketTicker != null) {
            marketTicker.setChangePrice(this.changePrice);
        }
        if (marketTicker != null) {
            marketTicker.setValue(this.volValue);
        }
        return marketTicker;
    }

    @NotNull
    public final WsMarketSnapshotEntity copy(@Nullable Double changePrice, @Nullable Double changeRate, @Nullable Double lastTradedPrice, @Nullable String symbolCode, @Nullable Double open, @Nullable Double high, @Nullable Double low, @Nullable Double volValue) {
        return new WsMarketSnapshotEntity(changePrice, changeRate, lastTradedPrice, symbolCode, open, high, low, volValue);
    }

    @NotNull
    public final TradeItemBean covertToTradeItemBean(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        tradeItemBean.setSymbol(this.symbolCode);
        tradeItemBean.setLastDealPrice(C27039d.m66646f(this.lastTradedPrice));
        tradeItemBean.setChangeRate(this.changeRate);
        tradeItemBean.setValue(C27039d.m66646f(this.volValue));
        return tradeItemBean;
    }

    @Nullable
    public final Double getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    public final Double getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final Double getHigh() {
        return this.high;
    }

    @Nullable
    public final Double getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    public final Double getLow() {
        return this.low;
    }

    @Nullable
    public final Double getOpen() {
        return this.open;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final Double getVolValue() {
        return this.volValue;
    }

    public int hashCode() {
        Double d11 = this.changePrice;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.changeRate;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.lastTradedPrice;
        int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.symbolCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.open;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.high;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.low;
        int iHashCode7 = (iHashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.volValue;
        return iHashCode7 + (d17 != null ? d17.hashCode() : 0);
    }

    public final void setChangePrice(@Nullable Double d11) {
        this.changePrice = d11;
    }

    public final void setChangeRate(@Nullable Double d11) {
        this.changeRate = d11;
    }

    public final void setHigh(@Nullable Double d11) {
        this.high = d11;
    }

    public final void setLastTradedPrice(@Nullable Double d11) {
        this.lastTradedPrice = d11;
    }

    public final void setLow(@Nullable Double d11) {
        this.low = d11;
    }

    public final void setOpen(@Nullable Double d11) {
        this.open = d11;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setVolValue(@Nullable Double d11) {
        this.volValue = d11;
    }

    @NotNull
    public String toString() {
        return "WsMarketSnapshotEntity(changePrice=" + this.changePrice + ", changeRate=" + this.changeRate + ", lastTradedPrice=" + this.lastTradedPrice + ", symbolCode=" + this.symbolCode + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", volValue=" + this.volValue + ')';
    }

    public WsMarketSnapshotEntity(@Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable String str, @Nullable Double d14, @Nullable Double d15, @Nullable Double d16, @Nullable Double d17) {
        this.changePrice = d11;
        this.changeRate = d12;
        this.lastTradedPrice = d13;
        this.symbolCode = str;
        this.open = d14;
        this.high = d15;
        this.low = d16;
        this.volValue = d17;
    }
}
