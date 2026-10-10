package com.kubi.tradingbotkit.business.strategyList.entity;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Ju\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/entity/CurrencyInfo;", "", FirebaseAnalytics.Param.CURRENCY, "", "percent", "Ljava/math/BigDecimal;", "changeRate", FirebaseAnalytics.Param.PRICE, "avgPrice", "currencyProfit", "currencyProfitPercent", "balance", "target", "Lcom/kubi/tradingbotkit/business/strategyList/entity/Target;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/business/strategyList/entity/Target;)V", "getCurrency", "()Ljava/lang/String;", "getPercent", "()Ljava/math/BigDecimal;", "getChangeRate", "getPrice", "getAvgPrice", "getCurrencyProfit", "getCurrencyProfitPercent", "getBalance", "getTarget", "()Lcom/kubi/tradingbotkit/business/strategyList/entity/Target;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyInfo {

    @Nullable
    private final BigDecimal avgPrice;

    @Nullable
    private final BigDecimal balance;

    @Nullable
    private final BigDecimal changeRate;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal currencyProfit;

    @Nullable
    private final BigDecimal currencyProfitPercent;

    @Nullable
    private final BigDecimal percent;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final Target target;

    public CurrencyInfo() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyInfo)) {
            return false;
        }
        CurrencyInfo currencyInfo = (CurrencyInfo) other;
        return Intrinsics.areEqual(this.currency, currencyInfo.currency) && Intrinsics.areEqual(this.percent, currencyInfo.percent) && Intrinsics.areEqual(this.changeRate, currencyInfo.changeRate) && Intrinsics.areEqual(this.price, currencyInfo.price) && Intrinsics.areEqual(this.avgPrice, currencyInfo.avgPrice) && Intrinsics.areEqual(this.currencyProfit, currencyInfo.currencyProfit) && Intrinsics.areEqual(this.currencyProfitPercent, currencyInfo.currencyProfitPercent) && Intrinsics.areEqual(this.balance, currencyInfo.balance) && Intrinsics.areEqual(this.target, currencyInfo.target);
    }

    public CurrencyInfo(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable Target target) {
        this.currency = str;
        this.percent = bigDecimal;
        this.changeRate = bigDecimal2;
        this.price = bigDecimal3;
        this.avgPrice = bigDecimal4;
        this.currencyProfit = bigDecimal5;
        this.currencyProfitPercent = bigDecimal6;
        this.balance = bigDecimal7;
        this.target = target;
    }

    public static /* synthetic */ CurrencyInfo copy$default(CurrencyInfo currencyInfo, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Target target, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = currencyInfo.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = currencyInfo.percent;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = currencyInfo.changeRate;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = currencyInfo.price;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = currencyInfo.avgPrice;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = currencyInfo.currencyProfit;
        }
        if ((i11 & 64) != 0) {
            bigDecimal6 = currencyInfo.currencyProfitPercent;
        }
        if ((i11 & 128) != 0) {
            bigDecimal7 = currencyInfo.balance;
        }
        if ((i11 & 256) != 0) {
            target = currencyInfo.target;
        }
        BigDecimal bigDecimal8 = bigDecimal7;
        Target target2 = target;
        BigDecimal bigDecimal9 = bigDecimal5;
        BigDecimal bigDecimal10 = bigDecimal6;
        BigDecimal bigDecimal11 = bigDecimal4;
        BigDecimal bigDecimal12 = bigDecimal2;
        return currencyInfo.copy(str, bigDecimal, bigDecimal12, bigDecimal3, bigDecimal11, bigDecimal9, bigDecimal10, bigDecimal8, target2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPercent() {
        return this.percent;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getCurrencyProfit() {
        return this.currencyProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getCurrencyProfitPercent() {
        return this.currencyProfitPercent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Target getTarget() {
        return this.target;
    }

    @NotNull
    public final CurrencyInfo copy(@Nullable String currency, @Nullable BigDecimal percent, @Nullable BigDecimal changeRate, @Nullable BigDecimal price, @Nullable BigDecimal avgPrice, @Nullable BigDecimal currencyProfit, @Nullable BigDecimal currencyProfitPercent, @Nullable BigDecimal balance, @Nullable Target target) {
        return new CurrencyInfo(currency, percent, changeRate, price, avgPrice, currencyProfit, currencyProfitPercent, balance, target);
    }

    @Nullable
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getCurrencyProfit() {
        return this.currencyProfit;
    }

    @Nullable
    public final BigDecimal getCurrencyProfitPercent() {
        return this.currencyProfitPercent;
    }

    @Nullable
    public final BigDecimal getPercent() {
        return this.percent;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Target getTarget() {
        return this.target;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.percent;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.changeRate;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.avgPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.currencyProfit;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.currencyProfitPercent;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.balance;
        int iHashCode8 = (iHashCode7 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        Target target = this.target;
        return iHashCode8 + (target != null ? target.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrencyInfo(currency=" + this.currency + ", percent=" + this.percent + ", changeRate=" + this.changeRate + ", price=" + this.price + ", avgPrice=" + this.avgPrice + ", currencyProfit=" + this.currencyProfit + ", currencyProfitPercent=" + this.currencyProfitPercent + ", balance=" + this.balance + ", target=" + this.target + ')';
    }

    public /* synthetic */ CurrencyInfo(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Target target, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5, (i11 & 64) != 0 ? null : bigDecimal6, (i11 & 128) != 0 ? null : bigDecimal7, (i11 & 256) != 0 ? null : target);
    }
}
