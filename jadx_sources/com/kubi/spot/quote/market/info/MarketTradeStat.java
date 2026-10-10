package com.kubi.spot.quote.market.info;

import android.content.Context;
import androidx.annotation.Keep;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.C22890g;
import com.kubi.spot.R$color;
import com.kubi.spot.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0016HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006+"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketTradeStat;", "", "symbol", "", "lowPrice", "highPrice", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "tradeUserPer", "buyUserPer", "buyVolPer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getLowPrice", "getHighPrice", "getLatestPrice", "getTradeUserPer", "getBuyUserPer", "getBuyVolPer", "sellOrBuy", "sellOrBuyColor", "", "context", "Landroid/content/Context;", "sellUserPer", "Ljava/math/BigDecimal;", "sellVolPer", "getCurrentBias", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketTradeStat {

    @Nullable
    private final String buyUserPer;

    @Nullable
    private final String buyVolPer;

    @Nullable
    private final String highPrice;

    @Nullable
    private final String latestPrice;

    @Nullable
    private final String lowPrice;

    @Nullable
    private final String symbol;

    @Nullable
    private final String tradeUserPer;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketTradeStat)) {
            return false;
        }
        MarketTradeStat marketTradeStat = (MarketTradeStat) other;
        return Intrinsics.areEqual(this.symbol, marketTradeStat.symbol) && Intrinsics.areEqual(this.lowPrice, marketTradeStat.lowPrice) && Intrinsics.areEqual(this.highPrice, marketTradeStat.highPrice) && Intrinsics.areEqual(this.latestPrice, marketTradeStat.latestPrice) && Intrinsics.areEqual(this.tradeUserPer, marketTradeStat.tradeUserPer) && Intrinsics.areEqual(this.buyUserPer, marketTradeStat.buyUserPer) && Intrinsics.areEqual(this.buyVolPer, marketTradeStat.buyVolPer);
    }

    public static /* synthetic */ MarketTradeStat copy$default(MarketTradeStat marketTradeStat, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketTradeStat.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = marketTradeStat.lowPrice;
        }
        if ((i11 & 4) != 0) {
            str3 = marketTradeStat.highPrice;
        }
        if ((i11 & 8) != 0) {
            str4 = marketTradeStat.latestPrice;
        }
        if ((i11 & 16) != 0) {
            str5 = marketTradeStat.tradeUserPer;
        }
        if ((i11 & 32) != 0) {
            str6 = marketTradeStat.buyUserPer;
        }
        if ((i11 & 64) != 0) {
            str7 = marketTradeStat.buyVolPer;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return marketTradeStat.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLowPrice() {
        return this.lowPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeUserPer() {
        return this.tradeUserPer;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBuyUserPer() {
        return this.buyUserPer;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBuyVolPer() {
        return this.buyVolPer;
    }

    @NotNull
    public final MarketTradeStat copy(@Nullable String symbol, @Nullable String lowPrice, @Nullable String highPrice, @Nullable String latestPrice, @Nullable String tradeUserPer, @Nullable String buyUserPer, @Nullable String buyVolPer) {
        return new MarketTradeStat(symbol, lowPrice, highPrice, latestPrice, tradeUserPer, buyUserPer, buyVolPer);
    }

    @Nullable
    public final String getBuyUserPer() {
        return this.buyUserPer;
    }

    @Nullable
    public final String getBuyVolPer() {
        return this.buyVolPer;
    }

    public final float getCurrentBias() {
        String str;
        String str2;
        String str3 = this.latestPrice;
        if (str3 == null || str3.length() == 0 || (str = this.lowPrice) == null || str.length() == 0 || (str2 = this.highPrice) == null || str2.length() == 0) {
            return 0.5f;
        }
        BigDecimal bigDecimalM89922G = C41014a.m89922G(DowngradeExKt.m66536f(this.latestPrice), null, 1, null);
        BigDecimal bigDecimalM89922G2 = C41014a.m89922G(DowngradeExKt.m66536f(this.lowPrice), null, 1, null);
        BigDecimal bigDecimalM89922G3 = C41014a.m89922G(DowngradeExKt.m66536f(this.highPrice), null, 1, null);
        if (bigDecimalM89922G.compareTo(bigDecimalM89922G2) < 0) {
            bigDecimalM89922G = bigDecimalM89922G2;
        }
        if (bigDecimalM89922G.compareTo(bigDecimalM89922G3) > 0) {
            bigDecimalM89922G = bigDecimalM89922G3;
        }
        BigDecimal bigDecimalSubtract = bigDecimalM89922G3.subtract(bigDecimalM89922G2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract.compareTo(BigDecimal.ZERO) == 0) {
            return 0.5f;
        }
        BigDecimal bigDecimalSubtract2 = bigDecimalM89922G.subtract(bigDecimalM89922G2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimalSubtract3 = bigDecimalM89922G3.subtract(bigDecimalM89922G2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        BigDecimal bigDecimalDivide = bigDecimalSubtract2.divide(bigDecimalSubtract3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide.floatValue();
    }

    @Nullable
    public final String getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    public final String getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    public final String getLowPrice() {
        return this.lowPrice;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTradeUserPer() {
        return this.tradeUserPer;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lowPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.latestPrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tradeUserPer;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buyUserPer;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.buyVolPer;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public final String sellOrBuy() {
        String str = this.buyUserPer;
        if (str == null || str.length() == 0) {
            return "--";
        }
        return C41014a.m89922G(DowngradeExKt.m66536f(this.buyUserPer), null, 1, null).compareTo(new BigDecimal("0.5")) >= 0 ? C27017c.f54310a.m66516f(R$string.buy, new Object[0]) : C27017c.f54310a.m66516f(R$string.sell, new Object[0]);
    }

    public final int sellOrBuyColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.buyUserPer;
        if (str == null || str.length() == 0) {
            return C27017c.f54310a.m66512a(R$color.c_text);
        }
        return C41014a.m89922G(DowngradeExKt.m66536f(this.buyUserPer), null, 1, null).compareTo(new BigDecimal("0.5")) >= 0 ? C22890g.m54291p(context) : C22890g.m54289n(context);
    }

    @Nullable
    public final BigDecimal sellUserPer() {
        String str = this.buyUserPer;
        if (str == null || str.length() == 0) {
            return null;
        }
        return new BigDecimal("1.0").subtract(C41014a.m89922G(DowngradeExKt.m66536f(this.buyUserPer), null, 1, null));
    }

    @Nullable
    public final BigDecimal sellVolPer() {
        String str = this.buyVolPer;
        if (str == null || str.length() == 0) {
            return null;
        }
        return new BigDecimal("1.0").subtract(C41014a.m89922G(DowngradeExKt.m66536f(this.buyVolPer), null, 1, null));
    }

    @NotNull
    public String toString() {
        return "MarketTradeStat(symbol=" + this.symbol + ", lowPrice=" + this.lowPrice + ", highPrice=" + this.highPrice + ", latestPrice=" + this.latestPrice + ", tradeUserPer=" + this.tradeUserPer + ", buyUserPer=" + this.buyUserPer + ", buyVolPer=" + this.buyVolPer + ')';
    }

    public MarketTradeStat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.symbol = str;
        this.lowPrice = str2;
        this.highPrice = str3;
        this.latestPrice = str4;
        this.tradeUserPer = str5;
        this.buyUserPer = str6;
        this.buyVolPer = str7;
    }
}
