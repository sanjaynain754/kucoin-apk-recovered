package com.kubi.core.base.order.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.base.order.data.ActiveOrdersData$ListData$Request, reason: from toString */
/* JADX INFO: compiled from: ActiveOrdersData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JW\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, m90084d2 = {"Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Request;", "Lcom/kubi/core/base/arch/api/IRequest;", "symbol", "", "side", "Lcom/kubi/core/base/order/data/TradeSide;", "orderFilter", "Lcom/kubi/core/base/order/data/OrderLevelType;", "currentPage", "", "pageSize", "lastId", "tradeType", "<init>", "(Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Lcom/kubi/core/base/order/data/OrderLevelType;IILjava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "()Lcom/kubi/core/base/order/data/TradeSide;", "getOrderFilter", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "getCurrentPage", "()I", "getPageSize", "getLastId", "getTradeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Request implements InterfaceC45789a {
    private final int currentPage;

    @Nullable
    private final String lastId;

    @Nullable
    private final OrderLevelType orderFilter;
    private final int pageSize;

    @Nullable
    private final TradeSide side;

    @Nullable
    private final String symbol;

    @NotNull
    private final String tradeType;

    public Request(@Nullable String str, @Nullable TradeSide tradeSide, @Nullable OrderLevelType orderLevelType, int i11, int i12, @Nullable String str2, @NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        this.symbol = str;
        this.side = tradeSide;
        this.orderFilter = orderLevelType;
        this.currentPage = i11;
        this.pageSize = i12;
        this.lastId = str2;
        this.tradeType = tradeType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return Intrinsics.areEqual(this.symbol, request.symbol) && Intrinsics.areEqual(this.side, request.side) && Intrinsics.areEqual(this.orderFilter, request.orderFilter) && this.currentPage == request.currentPage && this.pageSize == request.pageSize && Intrinsics.areEqual(this.lastId, request.lastId) && Intrinsics.areEqual(this.tradeType, request.tradeType);
    }

    public static /* synthetic */ Request copy$default(Request request, String str, TradeSide tradeSide, OrderLevelType orderLevelType, int i11, int i12, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = request.symbol;
        }
        if ((i13 & 2) != 0) {
            tradeSide = request.side;
        }
        if ((i13 & 4) != 0) {
            orderLevelType = request.orderFilter;
        }
        if ((i13 & 8) != 0) {
            i11 = request.currentPage;
        }
        if ((i13 & 16) != 0) {
            i12 = request.pageSize;
        }
        if ((i13 & 32) != 0) {
            str2 = request.lastId;
        }
        if ((i13 & 64) != 0) {
            str3 = request.tradeType;
        }
        String str4 = str2;
        String str5 = str3;
        int i14 = i12;
        OrderLevelType orderLevelType2 = orderLevelType;
        return request.copy(str, tradeSide, orderLevelType2, i11, i14, str4, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TradeSide getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderLevelType getOrderFilter() {
        return this.orderFilter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastId() {
        return this.lastId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    public final Request copy(@Nullable String symbol, @Nullable TradeSide side, @Nullable OrderLevelType orderFilter, int currentPage, int pageSize, @Nullable String lastId, @NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        return new Request(symbol, side, orderFilter, currentPage, pageSize, lastId, tradeType);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final String getLastId() {
        return this.lastId;
    }

    @Nullable
    public final OrderLevelType getOrderFilter() {
        return this.orderFilter;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final TradeSide getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TradeSide tradeSide = this.side;
        int iHashCode2 = (iHashCode + (tradeSide == null ? 0 : tradeSide.hashCode())) * 31;
        OrderLevelType orderLevelType = this.orderFilter;
        int iHashCode3 = (((((iHashCode2 + (orderLevelType == null ? 0 : orderLevelType.hashCode())) * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageSize)) * 31;
        String str2 = this.lastId;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tradeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "Request(symbol=" + this.symbol + ", side=" + this.side + ", orderFilter=" + this.orderFilter + ", currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", lastId=" + this.lastId + ", tradeType=" + this.tradeType + ')';
    }

    public /* synthetic */ Request(String str, TradeSide tradeSide, OrderLevelType orderLevelType, int i11, int i12, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : tradeSide, (i13 & 4) != 0 ? null : orderLevelType, i11, (i13 & 16) != 0 ? 20 : i12, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? "SPOT" : str3);
    }
}
