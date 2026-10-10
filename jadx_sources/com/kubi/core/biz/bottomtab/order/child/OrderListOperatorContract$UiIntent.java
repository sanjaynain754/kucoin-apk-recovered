package com.kubi.core.biz.bottomtab.order.child;

import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderListOperatorContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "CancelAllOrder", "CancelOrder", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelAllOrder;", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelOrder;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface OrderListOperatorContract$UiIntent extends InterfaceC19282d {

    /* JADX INFO: compiled from: OrderListOperatorContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelAllOrder;", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "symbol", "", "<init>", "(Lcom/kubi/core/base/order/data/OrderLevelType;Ljava/lang/String;)V", "getOrderLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CancelAllOrder implements OrderListOperatorContract$UiIntent {

        @NotNull
        private final OrderLevelType orderLevelType;

        @Nullable
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelAllOrder)) {
                return false;
            }
            CancelAllOrder cancelAllOrder = (CancelAllOrder) other;
            return Intrinsics.areEqual(this.orderLevelType, cancelAllOrder.orderLevelType) && Intrinsics.areEqual(this.symbol, cancelAllOrder.symbol);
        }

        public CancelAllOrder(@NotNull OrderLevelType orderLevelType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
            this.orderLevelType = orderLevelType;
            this.symbol = str;
        }

        @NotNull
        public final OrderLevelType getOrderLevelType() {
            return this.orderLevelType;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            int iHashCode = this.orderLevelType.hashCode() * 31;
            String str = this.symbol;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "CancelAllOrder(orderLevelType=" + this.orderLevelType + ", symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: OrderListOperatorContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelOrder;", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;", "orderId", "", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CancelOrder implements OrderListOperatorContract$UiIntent {

        @Nullable
        private final String orderId;

        @Nullable
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelOrder)) {
                return false;
            }
            CancelOrder cancelOrder = (CancelOrder) other;
            return Intrinsics.areEqual(this.orderId, cancelOrder.orderId) && Intrinsics.areEqual(this.symbol, cancelOrder.symbol);
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.symbol;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CancelOrder(orderId=" + this.orderId + ", symbol=" + this.symbol + ')';
        }

        public CancelOrder(@Nullable String str, @Nullable String str2) {
            this.orderId = str;
            this.symbol = str2;
        }
    }
}
