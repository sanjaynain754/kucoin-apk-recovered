package com.kubi.kumex.data.market.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DistributionQuoteEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u0085\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001b\"\u0004\b\u001d\u0010\u001e¨\u00060"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/DistributionQuoteEntity;", "Lcom/kubi/kumex/data/market/model/IDistributionData;", "iconUrl", "", "symbol", "lastPrice", "Ljava/math/BigDecimal;", "priceChgPct", "volume", "upRate", "downRate", "klineData", "", "", "klineLocal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;)V", "getIconUrl", "()Ljava/lang/String;", "getSymbol", "getLastPrice", "()Ljava/math/BigDecimal;", "getPriceChgPct", "getVolume", "getUpRate", "getDownRate", "getKlineData", "()Ljava/util/List;", "getKlineLocal", "setKlineLocal", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DistributionQuoteEntity implements IDistributionData {

    @SerializedName("bearishPercent")
    @Nullable
    private final BigDecimal downRate;

    @SerializedName("contractIcon")
    @Nullable
    private final String iconUrl;

    @Nullable
    private final List<List<Double>> klineData;

    @NotNull
    private List<Double> klineLocal;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final BigDecimal lastPrice;

    @SerializedName("priceChgPct")
    @Nullable
    private final BigDecimal priceChgPct;

    @Nullable
    private final String symbol;

    @SerializedName("bullishPercent")
    @Nullable
    private final BigDecimal upRate;

    @SerializedName("volumeOf24")
    @Nullable
    private final BigDecimal volume;

    /* JADX WARN: Multi-variable type inference failed */
    public DistributionQuoteEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable List<? extends List<Double>> list, @NotNull List<Double> klineLocal) {
        Intrinsics.checkNotNullParameter(klineLocal, "klineLocal");
        this.iconUrl = str;
        this.symbol = str2;
        this.lastPrice = bigDecimal;
        this.priceChgPct = bigDecimal2;
        this.volume = bigDecimal3;
        this.upRate = bigDecimal4;
        this.downRate = bigDecimal5;
        this.klineData = list;
        this.klineLocal = klineLocal;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistributionQuoteEntity)) {
            return false;
        }
        DistributionQuoteEntity distributionQuoteEntity = (DistributionQuoteEntity) other;
        return Intrinsics.areEqual(this.iconUrl, distributionQuoteEntity.iconUrl) && Intrinsics.areEqual(this.symbol, distributionQuoteEntity.symbol) && Intrinsics.areEqual(this.lastPrice, distributionQuoteEntity.lastPrice) && Intrinsics.areEqual(this.priceChgPct, distributionQuoteEntity.priceChgPct) && Intrinsics.areEqual(this.volume, distributionQuoteEntity.volume) && Intrinsics.areEqual(this.upRate, distributionQuoteEntity.upRate) && Intrinsics.areEqual(this.downRate, distributionQuoteEntity.downRate) && Intrinsics.areEqual(this.klineData, distributionQuoteEntity.klineData) && Intrinsics.areEqual(this.klineLocal, distributionQuoteEntity.klineLocal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistributionQuoteEntity copy$default(DistributionQuoteEntity distributionQuoteEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = distributionQuoteEntity.iconUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = distributionQuoteEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = distributionQuoteEntity.lastPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = distributionQuoteEntity.priceChgPct;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = distributionQuoteEntity.volume;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = distributionQuoteEntity.upRate;
        }
        if ((i11 & 64) != 0) {
            bigDecimal5 = distributionQuoteEntity.downRate;
        }
        if ((i11 & 128) != 0) {
            list = distributionQuoteEntity.klineData;
        }
        if ((i11 & 256) != 0) {
            list2 = distributionQuoteEntity.klineLocal;
        }
        List list3 = list;
        List list4 = list2;
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal3;
        BigDecimal bigDecimal9 = bigDecimal;
        return distributionQuoteEntity.copy(str, str2, bigDecimal9, bigDecimal2, bigDecimal8, bigDecimal6, bigDecimal7, list3, list4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getUpRate() {
        return this.upRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getDownRate() {
        return this.downRate;
    }

    @Nullable
    public final List<List<Double>> component8() {
        return this.klineData;
    }

    @NotNull
    public final List<Double> component9() {
        return this.klineLocal;
    }

    @NotNull
    public final DistributionQuoteEntity copy(@Nullable String iconUrl, @Nullable String symbol, @Nullable BigDecimal lastPrice, @Nullable BigDecimal priceChgPct, @Nullable BigDecimal volume, @Nullable BigDecimal upRate, @Nullable BigDecimal downRate, @Nullable List<? extends List<Double>> klineData, @NotNull List<Double> klineLocal) {
        Intrinsics.checkNotNullParameter(klineLocal, "klineLocal");
        return new DistributionQuoteEntity(iconUrl, symbol, lastPrice, priceChgPct, volume, upRate, downRate, klineData, klineLocal);
    }

    @Nullable
    public final BigDecimal getDownRate() {
        return this.downRate;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final List<List<Double>> getKlineData() {
        return this.klineData;
    }

    @NotNull
    public final List<Double> getKlineLocal() {
        return this.klineLocal;
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getUpRate() {
        return this.upRate;
    }

    @Nullable
    public final BigDecimal getVolume() {
        return this.volume;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.lastPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceChgPct;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.volume;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.upRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.downRate;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        List<List<Double>> list = this.klineData;
        return ((iHashCode7 + (list != null ? list.hashCode() : 0)) * 31) + this.klineLocal.hashCode();
    }

    public final void setKlineLocal(@NotNull List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.klineLocal = list;
    }

    @NotNull
    public String toString() {
        return "DistributionQuoteEntity(iconUrl=" + this.iconUrl + ", symbol=" + this.symbol + ", lastPrice=" + this.lastPrice + ", priceChgPct=" + this.priceChgPct + ", volume=" + this.volume + ", upRate=" + this.upRate + ", downRate=" + this.downRate + ", klineData=" + this.klineData + ", klineLocal=" + this.klineLocal + ')';
    }

    public /* synthetic */ DistributionQuoteEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : list, list2);
    }
}
