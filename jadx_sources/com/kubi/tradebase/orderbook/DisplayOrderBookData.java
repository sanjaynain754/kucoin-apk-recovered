package com.kubi.tradebase.orderbook;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IOrderBookData.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003Je\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;", "Lcom/kubi/tradebase/orderbook/IOrderBookData;", "symbol", "", "bids", "", "", "Ljava/math/BigDecimal;", "asks", "displayBids", "", "Lcom/kubi/tradebase/orderbook/OrderBookItemData;", "displayAsks", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "getBids", "()Ljava/util/List;", "getAsks", "getDisplayBids", "getDisplayAsks", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DisplayOrderBookData implements IOrderBookData {

    @Nullable
    private final List<BigDecimal[]> asks;

    @Nullable
    private final List<BigDecimal[]> bids;

    @NotNull
    private final List<OrderBookItemData> displayAsks;

    @NotNull
    private final List<OrderBookItemData> displayBids;

    @Nullable
    private final String symbol;

    public DisplayOrderBookData(@Nullable String str, @Nullable List<BigDecimal[]> list, @Nullable List<BigDecimal[]> list2, @NotNull List<OrderBookItemData> displayBids, @NotNull List<OrderBookItemData> displayAsks) {
        Intrinsics.checkNotNullParameter(displayBids, "displayBids");
        Intrinsics.checkNotNullParameter(displayAsks, "displayAsks");
        this.symbol = str;
        this.bids = list;
        this.asks = list2;
        this.displayBids = displayBids;
        this.displayAsks = displayAsks;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayOrderBookData)) {
            return false;
        }
        DisplayOrderBookData displayOrderBookData = (DisplayOrderBookData) other;
        return Intrinsics.areEqual(this.symbol, displayOrderBookData.symbol) && Intrinsics.areEqual(this.bids, displayOrderBookData.bids) && Intrinsics.areEqual(this.asks, displayOrderBookData.asks) && Intrinsics.areEqual(this.displayBids, displayOrderBookData.displayBids) && Intrinsics.areEqual(this.displayAsks, displayOrderBookData.displayAsks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayOrderBookData copy$default(DisplayOrderBookData displayOrderBookData, String str, List list, List list2, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = displayOrderBookData.symbol;
        }
        if ((i11 & 2) != 0) {
            list = displayOrderBookData.bids;
        }
        if ((i11 & 4) != 0) {
            list2 = displayOrderBookData.asks;
        }
        if ((i11 & 8) != 0) {
            list3 = displayOrderBookData.displayBids;
        }
        if ((i11 & 16) != 0) {
            list4 = displayOrderBookData.displayAsks;
        }
        List list5 = list4;
        List list6 = list2;
        return displayOrderBookData.copy(str, list, list6, list3, list5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final List<BigDecimal[]> component2() {
        return this.bids;
    }

    @Nullable
    public final List<BigDecimal[]> component3() {
        return this.asks;
    }

    @NotNull
    public final List<OrderBookItemData> component4() {
        return this.displayBids;
    }

    @NotNull
    public final List<OrderBookItemData> component5() {
        return this.displayAsks;
    }

    @NotNull
    public final DisplayOrderBookData copy(@Nullable String symbol, @Nullable List<BigDecimal[]> bids, @Nullable List<BigDecimal[]> asks, @NotNull List<OrderBookItemData> displayBids, @NotNull List<OrderBookItemData> displayAsks) {
        Intrinsics.checkNotNullParameter(displayBids, "displayBids");
        Intrinsics.checkNotNullParameter(displayAsks, "displayAsks");
        return new DisplayOrderBookData(symbol, bids, asks, displayBids, displayAsks);
    }

    @Override // com.kubi.tradebase.orderbook.IOrderBookData
    @Nullable
    public List<BigDecimal[]> getAsks() {
        return this.asks;
    }

    @Override // com.kubi.tradebase.orderbook.IOrderBookData
    @Nullable
    public List<BigDecimal[]> getBids() {
        return this.bids;
    }

    @NotNull
    public final List<OrderBookItemData> getDisplayAsks() {
        return this.displayAsks;
    }

    @NotNull
    public final List<OrderBookItemData> getDisplayBids() {
        return this.displayBids;
    }

    @Override // com.kubi.tradebase.orderbook.IOrderBookData
    @Nullable
    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BigDecimal[]> list = this.bids;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BigDecimal[]> list2 = this.asks;
        return ((((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.displayBids.hashCode()) * 31) + this.displayAsks.hashCode();
    }

    @NotNull
    public String toString() {
        return "DisplayOrderBookData(symbol=" + this.symbol + ", bids=" + this.bids + ", asks=" + this.asks + ", displayBids=" + this.displayBids + ", displayAsks=" + this.displayAsks + ')';
    }

    public /* synthetic */ DisplayOrderBookData(String str, List list, List list2, List list3, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new ArrayList() : list, (i11 & 4) != 0 ? new ArrayList() : list2, (i11 & 8) != 0 ? new ArrayList() : list3, (i11 & 16) != 0 ? new ArrayList() : list4);
    }
}
