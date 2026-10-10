package com.kubi.spot.quote.market.info;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006/"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCurrencyEntity;", "", "cap", "", "changeCap", "changePrice", "changeRate", FirebaseAnalytics.Param.CURRENCY, "lastPrice", "source", "symbol", "timestamp", "", "totalVol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getCap", "()Ljava/lang/String;", "getChangeCap", "getChangePrice", "getChangeRate", "getCurrency", "getLastPrice", "getSource", "getSymbol", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalVol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/spot/quote/market/info/MarketCurrencyEntity;", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCurrencyEntity {

    @Nullable
    private final String cap;

    @Nullable
    private final String changeCap;

    @Nullable
    private final String changePrice;

    @Nullable
    private final String changeRate;

    @Nullable
    private final String currency;

    @Nullable
    private final String lastPrice;

    @Nullable
    private final String source;

    @Nullable
    private final String symbol;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final String totalVol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketCurrencyEntity)) {
            return false;
        }
        MarketCurrencyEntity marketCurrencyEntity = (MarketCurrencyEntity) other;
        return Intrinsics.areEqual(this.cap, marketCurrencyEntity.cap) && Intrinsics.areEqual(this.changeCap, marketCurrencyEntity.changeCap) && Intrinsics.areEqual(this.changePrice, marketCurrencyEntity.changePrice) && Intrinsics.areEqual(this.changeRate, marketCurrencyEntity.changeRate) && Intrinsics.areEqual(this.currency, marketCurrencyEntity.currency) && Intrinsics.areEqual(this.lastPrice, marketCurrencyEntity.lastPrice) && Intrinsics.areEqual(this.source, marketCurrencyEntity.source) && Intrinsics.areEqual(this.symbol, marketCurrencyEntity.symbol) && Intrinsics.areEqual(this.timestamp, marketCurrencyEntity.timestamp) && Intrinsics.areEqual(this.totalVol, marketCurrencyEntity.totalVol);
    }

    public static /* synthetic */ MarketCurrencyEntity copy$default(MarketCurrencyEntity marketCurrencyEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketCurrencyEntity.cap;
        }
        if ((i11 & 2) != 0) {
            str2 = marketCurrencyEntity.changeCap;
        }
        if ((i11 & 4) != 0) {
            str3 = marketCurrencyEntity.changePrice;
        }
        if ((i11 & 8) != 0) {
            str4 = marketCurrencyEntity.changeRate;
        }
        if ((i11 & 16) != 0) {
            str5 = marketCurrencyEntity.currency;
        }
        if ((i11 & 32) != 0) {
            str6 = marketCurrencyEntity.lastPrice;
        }
        if ((i11 & 64) != 0) {
            str7 = marketCurrencyEntity.source;
        }
        if ((i11 & 128) != 0) {
            str8 = marketCurrencyEntity.symbol;
        }
        if ((i11 & 256) != 0) {
            l11 = marketCurrencyEntity.timestamp;
        }
        if ((i11 & 512) != 0) {
            str9 = marketCurrencyEntity.totalVol;
        }
        Long l12 = l11;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return marketCurrencyEntity.copy(str, str2, str3, str4, str13, str14, str11, str12, l12, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCap() {
        return this.cap;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTotalVol() {
        return this.totalVol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChangeCap() {
        return this.changeCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final MarketCurrencyEntity copy(@Nullable String cap, @Nullable String changeCap, @Nullable String changePrice, @Nullable String changeRate, @Nullable String currency, @Nullable String lastPrice, @Nullable String source, @Nullable String symbol, @Nullable Long timestamp, @Nullable String totalVol) {
        return new MarketCurrencyEntity(cap, changeCap, changePrice, changeRate, currency, lastPrice, source, symbol, timestamp, totalVol);
    }

    @Nullable
    public final String getCap() {
        return this.cap;
    }

    @Nullable
    public final String getChangeCap() {
        return this.changeCap;
    }

    @Nullable
    public final String getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTotalVol() {
        return this.totalVol;
    }

    public int hashCode() {
        String str = this.cap;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.changeCap;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.changePrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.changeRate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastPrice;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.source;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.symbol;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.timestamp;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.totalVol;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketCurrencyEntity(cap=" + this.cap + ", changeCap=" + this.changeCap + ", changePrice=" + this.changePrice + ", changeRate=" + this.changeRate + ", currency=" + this.currency + ", lastPrice=" + this.lastPrice + ", source=" + this.source + ", symbol=" + this.symbol + ", timestamp=" + this.timestamp + ", totalVol=" + this.totalVol + ')';
    }

    public MarketCurrencyEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l11, @Nullable String str9) {
        this.cap = str;
        this.changeCap = str2;
        this.changePrice = str3;
        this.changeRate = str4;
        this.currency = str5;
        this.lastPrice = str6;
        this.source = str7;
        this.symbol = str8;
        this.timestamp = l11;
        this.totalVol = str9;
    }
}
