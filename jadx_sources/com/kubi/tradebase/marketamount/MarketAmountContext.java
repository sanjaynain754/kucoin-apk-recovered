package com.kubi.tradebase.marketamount;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: MarketAmountUnit.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountContext;", "", "baseIncrement", "Ljava/math/BigDecimal;", "quoteIncrement", "bestAsk", "bestBid", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBaseIncrement", "()Ljava/math/BigDecimal;", "getQuoteIncrement", "getBestAsk", "getBestBid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketAmountContext {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final BigDecimal baseIncrement;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BigDecimal quoteIncrement;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final BigDecimal bestAsk;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final BigDecimal bestBid;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketAmountContext)) {
            return false;
        }
        MarketAmountContext marketAmountContext = (MarketAmountContext) other;
        return Intrinsics.areEqual(this.baseIncrement, marketAmountContext.baseIncrement) && Intrinsics.areEqual(this.quoteIncrement, marketAmountContext.quoteIncrement) && Intrinsics.areEqual(this.bestAsk, marketAmountContext.bestAsk) && Intrinsics.areEqual(this.bestBid, marketAmountContext.bestBid);
    }

    public MarketAmountContext(@NotNull BigDecimal baseIncrement, @NotNull BigDecimal quoteIncrement, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(baseIncrement, "baseIncrement");
        Intrinsics.checkNotNullParameter(quoteIncrement, "quoteIncrement");
        this.baseIncrement = baseIncrement;
        this.quoteIncrement = quoteIncrement;
        this.bestAsk = bigDecimal;
        this.bestBid = bigDecimal2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBaseIncrement() {
        return this.baseIncrement;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getBestAsk() {
        return this.bestAsk;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getBestBid() {
        return this.bestBid;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getQuoteIncrement() {
        return this.quoteIncrement;
    }

    public int hashCode() {
        int iHashCode = ((this.baseIncrement.hashCode() * 31) + this.quoteIncrement.hashCode()) * 31;
        BigDecimal bigDecimal = this.bestAsk;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bestBid;
        return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketAmountContext(baseIncrement=" + this.baseIncrement + ", quoteIncrement=" + this.quoteIncrement + ", bestAsk=" + this.bestAsk + ", bestBid=" + this.bestBid + ')';
    }
}
