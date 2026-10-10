package com.kubi.core.biz.order.record.active;

import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "InitCurrentSymbol", "OnlyCurrentSymbol", "UpdateOrderEmptyStatus", "CancelAllOrder", "CancelOrder", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$CancelAllOrder;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$CancelOrder;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$InitCurrentSymbol;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$OnlyCurrentSymbol;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$UpdateOrderEmptyStatus;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface OpenOrdersRecordContract$UiIntent extends InterfaceC19282d {

    /* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$CancelAllOrder;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "(Lcom/kubi/core/base/order/data/OrderLevelType;)V", "getOrderLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CancelAllOrder implements OpenOrdersRecordContract$UiIntent {

        @NotNull
        private final OrderLevelType orderLevelType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelAllOrder) && Intrinsics.areEqual(this.orderLevelType, ((CancelAllOrder) other).orderLevelType);
        }

        public CancelAllOrder(@NotNull OrderLevelType orderLevelType) {
            Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
            this.orderLevelType = orderLevelType;
        }

        @NotNull
        public final OrderLevelType getOrderLevelType() {
            return this.orderLevelType;
        }

        public int hashCode() {
            return this.orderLevelType.hashCode();
        }

        @NotNull
        public String toString() {
            return "CancelAllOrder(orderLevelType=" + this.orderLevelType + ')';
        }
    }

    /* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$CancelOrder;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "orderId", "", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CancelOrder implements OpenOrdersRecordContract$UiIntent {

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

    /* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$InitCurrentSymbol;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class InitCurrentSymbol implements OpenOrdersRecordContract$UiIntent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitCurrentSymbol) && Intrinsics.areEqual(this.symbol, ((InitCurrentSymbol) other).symbol);
        }

        public InitCurrentSymbol(@NotNull String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return this.symbol.hashCode();
        }

        @NotNull
        public String toString() {
            return "InitCurrentSymbol(symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$OnlyCurrentSymbol;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "isOnly", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OnlyCurrentSymbol implements OpenOrdersRecordContract$UiIntent {
        private final boolean isOnly;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnlyCurrentSymbol) && this.isOnly == ((OnlyCurrentSymbol) other).isOnly;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOnly);
        }

        /* JADX INFO: renamed from: isOnly, reason: from getter */
        public final boolean getIsOnly() {
            return this.isOnly;
        }

        @NotNull
        public String toString() {
            return "OnlyCurrentSymbol(isOnly=" + this.isOnly + ')';
        }

        public OnlyCurrentSymbol(boolean z11) {
            this.isOnly = z11;
        }
    }

    /* JADX INFO: compiled from: OpenOrdersRecordContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent$UpdateOrderEmptyStatus;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "isEmpty", "", "orderType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "(ZLcom/kubi/core/base/order/data/OrderLevelType;)V", "()Z", "getOrderType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateOrderEmptyStatus implements OpenOrdersRecordContract$UiIntent {
        private final boolean isEmpty;

        @NotNull
        private final OrderLevelType orderType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateOrderEmptyStatus)) {
                return false;
            }
            UpdateOrderEmptyStatus updateOrderEmptyStatus = (UpdateOrderEmptyStatus) other;
            return this.isEmpty == updateOrderEmptyStatus.isEmpty && Intrinsics.areEqual(this.orderType, updateOrderEmptyStatus.orderType);
        }

        public UpdateOrderEmptyStatus(boolean z11, @NotNull OrderLevelType orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.isEmpty = z11;
            this.orderType = orderType;
        }

        @NotNull
        public final OrderLevelType getOrderType() {
            return this.orderType;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEmpty) * 31) + this.orderType.hashCode();
        }

        /* JADX INFO: renamed from: isEmpty, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            return "UpdateOrderEmptyStatus(isEmpty=" + this.isEmpty + ", orderType=" + this.orderType + ')';
        }
    }
}
