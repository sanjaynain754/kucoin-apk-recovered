package com.kubi.core.biz.submit;

import com.kubi.tradebase.tradetype.TradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J]\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006,"}, m90084d2 = {"Lcom/kubi/core/biz/submit/AvailableTradeAmountRequestContext;", "", "symbol", "", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "buyPrice", "Ljava/math/BigDecimal;", "sellPrice", "baseIncrement", "quoteIncrement", "basePrecision", "", "quotePrecision", "<init>", "(Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;II)V", "getSymbol", "()Ljava/lang/String;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "getBuyPrice", "()Ljava/math/BigDecimal;", "getSellPrice", "getBaseIncrement", "getQuoteIncrement", "getBasePrecision", "()I", "getQuotePrecision", "key", "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvailableTradeAmountRequestContext {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final TradeType tradeType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final BigDecimal buyPrice;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final BigDecimal sellPrice;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final BigDecimal baseIncrement;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final BigDecimal quoteIncrement;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final int basePrecision;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final int quotePrecision;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f20682i;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableTradeAmountRequestContext)) {
            return false;
        }
        AvailableTradeAmountRequestContext availableTradeAmountRequestContext = (AvailableTradeAmountRequestContext) other;
        return Intrinsics.areEqual(this.symbol, availableTradeAmountRequestContext.symbol) && this.tradeType == availableTradeAmountRequestContext.tradeType && Intrinsics.areEqual(this.buyPrice, availableTradeAmountRequestContext.buyPrice) && Intrinsics.areEqual(this.sellPrice, availableTradeAmountRequestContext.sellPrice) && Intrinsics.areEqual(this.baseIncrement, availableTradeAmountRequestContext.baseIncrement) && Intrinsics.areEqual(this.quoteIncrement, availableTradeAmountRequestContext.quoteIncrement) && this.basePrecision == availableTradeAmountRequestContext.basePrecision && this.quotePrecision == availableTradeAmountRequestContext.quotePrecision;
    }

    public AvailableTradeAmountRequestContext(@NotNull String symbol, @NotNull TradeType tradeType, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull BigDecimal baseIncrement, @NotNull BigDecimal quoteIncrement, int i11, int i12) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(baseIncrement, "baseIncrement");
        Intrinsics.checkNotNullParameter(quoteIncrement, "quoteIncrement");
        this.symbol = symbol;
        this.tradeType = tradeType;
        this.buyPrice = bigDecimal;
        this.sellPrice = bigDecimal2;
        this.baseIncrement = baseIncrement;
        this.quoteIncrement = quoteIncrement;
        this.basePrecision = i11;
        this.quotePrecision = i12;
        this.f20682i = CollectionsKt.joinToString$default(CollectionsKt.listOf(symbol, tradeType.getValue(), TradeSymbolBalanceExtKt.m22498k(bigDecimal), TradeSymbolBalanceExtKt.m22498k(bigDecimal2), TradeSymbolBalanceExtKt.m22498k(baseIncrement), TradeSymbolBalanceExtKt.m22498k(quoteIncrement), Integer.valueOf(i11), Integer.valueOf(i12)), "|", null, null, 0, null, null, 62, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBaseIncrement() {
        return this.baseIncrement;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBasePrecision() {
        return this.basePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getBuyPrice() {
        return this.buyPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF20682i() {
        return this.f20682i;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getQuoteIncrement() {
        return this.quoteIncrement;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getQuotePrecision() {
        return this.quotePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getSellPrice() {
        return this.sellPrice;
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + this.tradeType.hashCode()) * 31;
        BigDecimal bigDecimal = this.buyPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.sellPrice;
        return ((((((((iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + this.baseIncrement.hashCode()) * 31) + this.quoteIncrement.hashCode()) * 31) + Integer.hashCode(this.basePrecision)) * 31) + Integer.hashCode(this.quotePrecision);
    }

    @NotNull
    public String toString() {
        return "AvailableTradeAmountRequestContext(symbol=" + this.symbol + ", tradeType=" + this.tradeType + ", buyPrice=" + this.buyPrice + ", sellPrice=" + this.sellPrice + ", baseIncrement=" + this.baseIncrement + ", quoteIncrement=" + this.quoteIncrement + ", basePrecision=" + this.basePrecision + ", quotePrecision=" + this.quotePrecision + ')';
    }
}
