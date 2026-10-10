package com.kubi.spot.quote.market.info;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/CoinWrapEntity;", "", "info", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "symbols", "", "Lcom/kubi/spot/quote/market/info/MarketByCurrencyEntity;", "<init>", "(Lcom/kubi/spot/quote/market/info/MarketCoinInfo;Ljava/util/List;)V", "getInfo", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "getSymbols", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CoinWrapEntity {

    @Nullable
    private final MarketCoinInfo info;

    @Nullable
    private final List<MarketByCurrencyEntity> symbols;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoinWrapEntity)) {
            return false;
        }
        CoinWrapEntity coinWrapEntity = (CoinWrapEntity) other;
        return Intrinsics.areEqual(this.info, coinWrapEntity.info) && Intrinsics.areEqual(this.symbols, coinWrapEntity.symbols);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinWrapEntity copy$default(CoinWrapEntity coinWrapEntity, MarketCoinInfo marketCoinInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marketCoinInfo = coinWrapEntity.info;
        }
        if ((i11 & 2) != 0) {
            list = coinWrapEntity.symbols;
        }
        return coinWrapEntity.copy(marketCoinInfo, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MarketCoinInfo getInfo() {
        return this.info;
    }

    @Nullable
    public final List<MarketByCurrencyEntity> component2() {
        return this.symbols;
    }

    @NotNull
    public final CoinWrapEntity copy(@Nullable MarketCoinInfo info, @Nullable List<MarketByCurrencyEntity> symbols) {
        return new CoinWrapEntity(info, symbols);
    }

    @Nullable
    public final MarketCoinInfo getInfo() {
        return this.info;
    }

    @Nullable
    public final List<MarketByCurrencyEntity> getSymbols() {
        return this.symbols;
    }

    public int hashCode() {
        MarketCoinInfo marketCoinInfo = this.info;
        int iHashCode = (marketCoinInfo == null ? 0 : marketCoinInfo.hashCode()) * 31;
        List<MarketByCurrencyEntity> list = this.symbols;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CoinWrapEntity(info=" + this.info + ", symbols=" + this.symbols + ')';
    }

    public CoinWrapEntity(@Nullable MarketCoinInfo marketCoinInfo, @Nullable List<MarketByCurrencyEntity> list) {
        this.info = marketCoinInfo;
        this.symbols = list;
    }
}
