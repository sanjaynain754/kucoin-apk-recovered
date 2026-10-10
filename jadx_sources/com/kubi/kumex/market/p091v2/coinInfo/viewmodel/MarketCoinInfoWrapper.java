package com.kubi.kumex.market.p091v2.coinInfo.viewmodel;

import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.TagEntity;
import com.tencent.bugly.proguard.C33616e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.viewmodel.b, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: MarketCoinInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/viewmodel/MarketCoinInfoWrapper;", "", "baseCurrency", "", "marketCoinInfo", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", C33616e0.f69644s, "Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "<init>", "(Ljava/lang/String;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;)V", "getBaseCurrency", "()Ljava/lang/String;", "getMarketCoinInfo", "()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", "getTags", "()Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCoinInfoWrapper {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String baseCurrency;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final MarketCoinInfo marketCoinInfo;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final TagEntity tags;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketCoinInfoWrapper)) {
            return false;
        }
        MarketCoinInfoWrapper marketCoinInfoWrapper = (MarketCoinInfoWrapper) other;
        return Intrinsics.areEqual(this.baseCurrency, marketCoinInfoWrapper.baseCurrency) && Intrinsics.areEqual(this.marketCoinInfo, marketCoinInfoWrapper.marketCoinInfo) && Intrinsics.areEqual(this.tags, marketCoinInfoWrapper.tags);
    }

    public MarketCoinInfoWrapper(@NotNull String baseCurrency, @NotNull MarketCoinInfo marketCoinInfo, @Nullable TagEntity tagEntity) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(marketCoinInfo, "marketCoinInfo");
        this.baseCurrency = baseCurrency;
        this.marketCoinInfo = marketCoinInfo;
        this.tags = tagEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MarketCoinInfo getMarketCoinInfo() {
        return this.marketCoinInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TagEntity getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.baseCurrency.hashCode() * 31) + this.marketCoinInfo.hashCode()) * 31;
        TagEntity tagEntity = this.tags;
        return iHashCode + (tagEntity == null ? 0 : tagEntity.hashCode());
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfoWrapper(baseCurrency=" + this.baseCurrency + ", marketCoinInfo=" + this.marketCoinInfo + ", tags=" + this.tags + ')';
    }
}
