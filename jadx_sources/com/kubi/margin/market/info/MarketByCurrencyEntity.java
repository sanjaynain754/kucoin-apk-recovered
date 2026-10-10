package com.kubi.margin.market.info;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginMarketInfoEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/margin/market/info/MarketByCurrencyEntity;", "", "baseCurrency", "", "category", "changeRate", FirebaseAnalytics.Param.CURRENCY, "maxLeverage", "", FirebaseAnalytics.Param.PRICE, "quoteCurrency", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "getCategory", "getChangeRate", "getCurrency", "getMaxLeverage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "getQuoteCurrency", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/margin/market/info/MarketByCurrencyEntity;", "equals", "", "other", "hashCode", "toString", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketByCurrencyEntity {

    @NotNull
    public static final String CATEGORY_FUTURE = "FUTURE";

    @NotNull
    public static final String CATEGORY_MARGIN = "MARGIN";

    @NotNull
    public static final String CATEGORY_SPOT = "SPOT";

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final String category;

    @Nullable
    private final String changeRate;

    @Nullable
    private final String currency;

    @Nullable
    private final Integer maxLeverage;

    @Nullable
    private final String price;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketByCurrencyEntity)) {
            return false;
        }
        MarketByCurrencyEntity marketByCurrencyEntity = (MarketByCurrencyEntity) other;
        return Intrinsics.areEqual(this.baseCurrency, marketByCurrencyEntity.baseCurrency) && Intrinsics.areEqual(this.category, marketByCurrencyEntity.category) && Intrinsics.areEqual(this.changeRate, marketByCurrencyEntity.changeRate) && Intrinsics.areEqual(this.currency, marketByCurrencyEntity.currency) && Intrinsics.areEqual(this.maxLeverage, marketByCurrencyEntity.maxLeverage) && Intrinsics.areEqual(this.price, marketByCurrencyEntity.price) && Intrinsics.areEqual(this.quoteCurrency, marketByCurrencyEntity.quoteCurrency) && Intrinsics.areEqual(this.symbol, marketByCurrencyEntity.symbol);
    }

    public static /* synthetic */ MarketByCurrencyEntity copy$default(MarketByCurrencyEntity marketByCurrencyEntity, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketByCurrencyEntity.baseCurrency;
        }
        if ((i11 & 2) != 0) {
            str2 = marketByCurrencyEntity.category;
        }
        if ((i11 & 4) != 0) {
            str3 = marketByCurrencyEntity.changeRate;
        }
        if ((i11 & 8) != 0) {
            str4 = marketByCurrencyEntity.currency;
        }
        if ((i11 & 16) != 0) {
            num = marketByCurrencyEntity.maxLeverage;
        }
        if ((i11 & 32) != 0) {
            str5 = marketByCurrencyEntity.price;
        }
        if ((i11 & 64) != 0) {
            str6 = marketByCurrencyEntity.quoteCurrency;
        }
        if ((i11 & 128) != 0) {
            str7 = marketByCurrencyEntity.symbol;
        }
        String str8 = str6;
        String str9 = str7;
        Integer num2 = num;
        String str10 = str5;
        return marketByCurrencyEntity.copy(str, str2, str3, str4, num2, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final MarketByCurrencyEntity copy(@Nullable String baseCurrency, @Nullable String category, @Nullable String changeRate, @Nullable String currency, @Nullable Integer maxLeverage, @Nullable String price, @Nullable String quoteCurrency, @Nullable String symbol) {
        return new MarketByCurrencyEntity(baseCurrency, category, changeRate, currency, maxLeverage, price, quoteCurrency, symbol);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
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
    public final Integer getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.baseCurrency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.changeRate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.maxLeverage;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.price;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.quoteCurrency;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.symbol;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketByCurrencyEntity(baseCurrency=" + this.baseCurrency + ", category=" + this.category + ", changeRate=" + this.changeRate + ", currency=" + this.currency + ", maxLeverage=" + this.maxLeverage + ", price=" + this.price + ", quoteCurrency=" + this.quoteCurrency + ", symbol=" + this.symbol + ')';
    }

    public MarketByCurrencyEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.baseCurrency = str;
        this.category = str2;
        this.changeRate = str3;
        this.currency = str4;
        this.maxLeverage = num;
        this.price = str5;
        this.quoteCurrency = str6;
        this.symbol = str7;
    }
}
