package com.kubi.margin.entity;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#J\u0012\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00067"}, m90084d2 = {"Lcom/kubi/margin/entity/WsMarketSnapshotEntity;", "", "changePrice", "Ljava/math/BigDecimal;", "changeRate", "lastTradedPrice", "symbolCode", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "high", "low", "volValue", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getChangePrice", "()Ljava/math/BigDecimal;", "setChangePrice", "(Ljava/math/BigDecimal;)V", "getChangeRate", "setChangeRate", "getLastTradedPrice", "setLastTradedPrice", "getSymbolCode", "()Ljava/lang/String;", "setSymbolCode", "(Ljava/lang/String;)V", "getOpen", "setOpen", "getHigh", "setHigh", "getLow", "setLow", "getVolValue", "setVolValue", "covertToTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean", "convertToMarketTicker", "Lcom/kubi/data/entity/MarketTicker;", "marketTicker", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsMarketSnapshotEntity {

    @Nullable
    private BigDecimal changePrice;

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private BigDecimal high;

    @Nullable
    private BigDecimal lastTradedPrice;

    @Nullable
    private BigDecimal low;

    @Nullable
    private BigDecimal open;

    @Nullable
    private String symbolCode;

    @Nullable
    private BigDecimal volValue;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsMarketSnapshotEntity)) {
            return false;
        }
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) other;
        return Intrinsics.areEqual(this.changePrice, wsMarketSnapshotEntity.changePrice) && Intrinsics.areEqual(this.changeRate, wsMarketSnapshotEntity.changeRate) && Intrinsics.areEqual(this.lastTradedPrice, wsMarketSnapshotEntity.lastTradedPrice) && Intrinsics.areEqual(this.symbolCode, wsMarketSnapshotEntity.symbolCode) && Intrinsics.areEqual(this.open, wsMarketSnapshotEntity.open) && Intrinsics.areEqual(this.high, wsMarketSnapshotEntity.high) && Intrinsics.areEqual(this.low, wsMarketSnapshotEntity.low) && Intrinsics.areEqual(this.volValue, wsMarketSnapshotEntity.volValue);
    }

    public static /* synthetic */ WsMarketSnapshotEntity copy$default(WsMarketSnapshotEntity wsMarketSnapshotEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = wsMarketSnapshotEntity.changePrice;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = wsMarketSnapshotEntity.changeRate;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = wsMarketSnapshotEntity.lastTradedPrice;
        }
        if ((i11 & 8) != 0) {
            str = wsMarketSnapshotEntity.symbolCode;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = wsMarketSnapshotEntity.open;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = wsMarketSnapshotEntity.high;
        }
        if ((i11 & 64) != 0) {
            bigDecimal6 = wsMarketSnapshotEntity.low;
        }
        if ((i11 & 128) != 0) {
            bigDecimal7 = wsMarketSnapshotEntity.volValue;
        }
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal7;
        BigDecimal bigDecimal10 = bigDecimal4;
        BigDecimal bigDecimal11 = bigDecimal5;
        return wsMarketSnapshotEntity.copy(bigDecimal, bigDecimal2, bigDecimal3, str, bigDecimal10, bigDecimal11, bigDecimal8, bigDecimal9);
    }

    public static /* synthetic */ TradeItemBean covertToTradeItemBean$default(WsMarketSnapshotEntity wsMarketSnapshotEntity, TradeItemBean tradeItemBean, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tradeItemBean = new TradeItemBean();
        }
        return wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getOpen() {
        return this.open;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getHigh() {
        return this.high;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLow() {
        return this.low;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    @Nullable
    public final MarketTicker convertToMarketTicker(@Nullable MarketTicker marketTicker) {
        if (marketTicker != null) {
            marketTicker.setLastDealPrice(Double.valueOf(C27039d.m66647g(this.lastTradedPrice)));
        }
        if (marketTicker != null) {
            marketTicker.setHigh(Double.valueOf(C27039d.m66647g(this.high)));
        }
        if (marketTicker != null) {
            marketTicker.setLow(Double.valueOf(C27039d.m66647g(this.low)));
        }
        if (marketTicker != null) {
            marketTicker.setChangeRate(Double.valueOf(C27039d.m66647g(this.changeRate)));
        }
        if (marketTicker != null) {
            marketTicker.setChangePrice(Double.valueOf(C27039d.m66647g(this.changePrice)));
        }
        if (marketTicker != null) {
            marketTicker.setValue(Double.valueOf(C27039d.m66647g(this.volValue)));
        }
        return marketTicker;
    }

    @NotNull
    public final WsMarketSnapshotEntity copy(@Nullable BigDecimal changePrice, @Nullable BigDecimal changeRate, @Nullable BigDecimal lastTradedPrice, @Nullable String symbolCode, @Nullable BigDecimal open, @Nullable BigDecimal high, @Nullable BigDecimal low, @Nullable BigDecimal volValue) {
        return new WsMarketSnapshotEntity(changePrice, changeRate, lastTradedPrice, symbolCode, open, high, low, volValue);
    }

    @NotNull
    public final TradeItemBean covertToTradeItemBean(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        tradeItemBean.setSymbol(this.symbolCode);
        tradeItemBean.setLastDealPrice(C27039d.m66647g(this.lastTradedPrice));
        tradeItemBean.setChangeRate(Double.valueOf(C27039d.m66647g(this.changeRate)));
        tradeItemBean.setValue(C27039d.m66647g(this.volValue));
        return tradeItemBean;
    }

    @Nullable
    public final BigDecimal getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final BigDecimal getHigh() {
        return this.high;
    }

    @Nullable
    public final BigDecimal getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    public final BigDecimal getLow() {
        return this.low;
    }

    @Nullable
    public final BigDecimal getOpen() {
        return this.open;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.changePrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.changeRate;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.lastTradedPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str = this.symbolCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.open;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.high;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.low;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.volValue;
        return iHashCode7 + (bigDecimal7 != null ? bigDecimal7.hashCode() : 0);
    }

    public final void setChangePrice(@Nullable BigDecimal bigDecimal) {
        this.changePrice = bigDecimal;
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setHigh(@Nullable BigDecimal bigDecimal) {
        this.high = bigDecimal;
    }

    public final void setLastTradedPrice(@Nullable BigDecimal bigDecimal) {
        this.lastTradedPrice = bigDecimal;
    }

    public final void setLow(@Nullable BigDecimal bigDecimal) {
        this.low = bigDecimal;
    }

    public final void setOpen(@Nullable BigDecimal bigDecimal) {
        this.open = bigDecimal;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setVolValue(@Nullable BigDecimal bigDecimal) {
        this.volValue = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "WsMarketSnapshotEntity(changePrice=" + this.changePrice + ", changeRate=" + this.changeRate + ", lastTradedPrice=" + this.lastTradedPrice + ", symbolCode=" + this.symbolCode + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", volValue=" + this.volValue + ')';
    }

    public WsMarketSnapshotEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        this.changePrice = bigDecimal;
        this.changeRate = bigDecimal2;
        this.lastTradedPrice = bigDecimal3;
        this.symbolCode = str;
        this.open = bigDecimal4;
        this.high = bigDecimal5;
        this.low = bigDecimal6;
        this.volValue = bigDecimal7;
    }
}
