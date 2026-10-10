package com.kubi.tradebase.marketamount;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.j, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: MarketAmountUnitStore.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountUnitState;", "", "buy", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "sell", "<init>", "(Lcom/kubi/tradebase/marketamount/MarketAmountUnit;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;)V", "getBuy", "()Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "getSell", "unit", "side", "Lcom/kubi/tradebase/marketamount/MarketAmountSide;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketAmountUnitState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final MarketAmountUnit buy;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final MarketAmountUnit sell;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketAmountUnitState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketAmountUnitState)) {
            return false;
        }
        MarketAmountUnitState marketAmountUnitState = (MarketAmountUnitState) other;
        return this.buy == marketAmountUnitState.buy && this.sell == marketAmountUnitState.sell;
    }

    public MarketAmountUnitState(@NotNull MarketAmountUnit buy, @NotNull MarketAmountUnit sell) {
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell, "sell");
        this.buy = buy;
        this.sell = sell;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MarketAmountUnitState m63240b(MarketAmountUnitState marketAmountUnitState, MarketAmountUnit marketAmountUnit, MarketAmountUnit marketAmountUnit2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marketAmountUnit = marketAmountUnitState.buy;
        }
        if ((i11 & 2) != 0) {
            marketAmountUnit2 = marketAmountUnitState.sell;
        }
        return marketAmountUnitState.m63241a(marketAmountUnit, marketAmountUnit2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final MarketAmountUnitState m63241a(@NotNull MarketAmountUnit buy, @NotNull MarketAmountUnit sell) {
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell, "sell");
        return new MarketAmountUnitState(buy, sell);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final MarketAmountUnit m63242c(@NotNull MarketAmountSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return side == MarketAmountSide.BUY ? this.buy : this.sell;
    }

    public int hashCode() {
        return (this.buy.hashCode() * 31) + this.sell.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketAmountUnitState(buy=" + this.buy + ", sell=" + this.sell + ')';
    }

    public /* synthetic */ MarketAmountUnitState(MarketAmountUnit marketAmountUnit, MarketAmountUnit marketAmountUnit2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MarketAmountUnit.QUOTE : marketAmountUnit, (i11 & 2) != 0 ? MarketAmountUnit.BASE : marketAmountUnit2);
    }
}
