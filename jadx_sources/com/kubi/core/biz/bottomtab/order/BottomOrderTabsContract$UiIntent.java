package com.kubi.core.biz.bottomtab.order;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.TradeSymbolBalance;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BottomOrderTabsContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "ChangeSymbol", "SupportCancelAllBtnEnable", "StopSubBalance", "StopSubOrderChange", "RefreshData", "BalanceChange", "JumpToTransfer", "JumpDeposit", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$BalanceChange;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$ChangeSymbol;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$JumpDeposit;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$JumpToTransfer;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$RefreshData;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$StopSubBalance;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$StopSubOrderChange;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$SupportCancelAllBtnEnable;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface BottomOrderTabsContract$UiIntent extends InterfaceC19282d {

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$BalanceChange;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "tradeBalance", "Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "<init>", "(Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;)V", "getTradeBalance", "()Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BalanceChange implements BottomOrderTabsContract$UiIntent {

        @Nullable
        private final TradeSymbolBalance tradeBalance;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BalanceChange) && Intrinsics.areEqual(this.tradeBalance, ((BalanceChange) other).tradeBalance);
        }

        @Nullable
        public final TradeSymbolBalance getTradeBalance() {
            return this.tradeBalance;
        }

        public int hashCode() {
            TradeSymbolBalance tradeSymbolBalance = this.tradeBalance;
            if (tradeSymbolBalance == null) {
                return 0;
            }
            return tradeSymbolBalance.hashCode();
        }

        @NotNull
        public String toString() {
            return "BalanceChange(tradeBalance=" + this.tradeBalance + ')';
        }

        public BalanceChange(@Nullable TradeSymbolBalance tradeSymbolBalance) {
            this.tradeBalance = tradeSymbolBalance;
        }
    }

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$ChangeSymbol;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getSymbolInfoEntity", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChangeSymbol implements BottomOrderTabsContract$UiIntent {

        @NotNull
        private final SymbolInfoEntity symbolInfoEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeSymbol) && Intrinsics.areEqual(this.symbolInfoEntity, ((ChangeSymbol) other).symbolInfoEntity);
        }

        public ChangeSymbol(@NotNull SymbolInfoEntity symbolInfoEntity) {
            Intrinsics.checkNotNullParameter(symbolInfoEntity, "symbolInfoEntity");
            this.symbolInfoEntity = symbolInfoEntity;
        }

        @NotNull
        public final SymbolInfoEntity getSymbolInfoEntity() {
            return this.symbolInfoEntity;
        }

        public int hashCode() {
            return this.symbolInfoEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChangeSymbol(symbolInfoEntity=" + this.symbolInfoEntity + ')';
        }
    }

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$JumpToTransfer;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", AppsFlyerProperties.CURRENCY_CODE, "", "<init>", "(Ljava/lang/String;)V", "getCurrencyCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class JumpToTransfer implements BottomOrderTabsContract$UiIntent {

        @Nullable
        private final String currencyCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JumpToTransfer) && Intrinsics.areEqual(this.currencyCode, ((JumpToTransfer) other).currencyCode);
        }

        @Nullable
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public int hashCode() {
            String str = this.currencyCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "JumpToTransfer(currencyCode=" + this.currencyCode + ')';
        }
    }

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$RefreshData;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshData implements BottomOrderTabsContract$UiIntent {

        @NotNull
        public static final RefreshData INSTANCE = new RefreshData();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RefreshData);
        }

        @NotNull
        public String toString() {
            return "RefreshData";
        }

        private RefreshData() {
        }

        public int hashCode() {
            return -181716480;
        }
    }

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$StopSubBalance;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopSubBalance implements BottomOrderTabsContract$UiIntent {

        @NotNull
        public static final StopSubBalance INSTANCE = new StopSubBalance();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StopSubBalance);
        }

        @NotNull
        public String toString() {
            return "StopSubBalance";
        }

        private StopSubBalance() {
        }

        public int hashCode() {
            return -1439731869;
        }
    }

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$StopSubOrderChange;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopSubOrderChange implements BottomOrderTabsContract$UiIntent {

        @NotNull
        public static final StopSubOrderChange INSTANCE = new StopSubOrderChange();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StopSubOrderChange);
        }

        @NotNull
        public String toString() {
            return "StopSubOrderChange";
        }

        private StopSubOrderChange() {
        }

        public int hashCode() {
            return 2139601317;
        }
    }

    /* JADX INFO: compiled from: BottomOrderTabsContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent$SupportCancelAllBtnEnable;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "isSupport", "", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "(ZLcom/kubi/core/base/order/data/OrderLevelType;)V", "()Z", "getOrderLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SupportCancelAllBtnEnable implements BottomOrderTabsContract$UiIntent {
        private final boolean isSupport;

        @NotNull
        private final OrderLevelType orderLevelType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportCancelAllBtnEnable)) {
                return false;
            }
            SupportCancelAllBtnEnable supportCancelAllBtnEnable = (SupportCancelAllBtnEnable) other;
            return this.isSupport == supportCancelAllBtnEnable.isSupport && Intrinsics.areEqual(this.orderLevelType, supportCancelAllBtnEnable.orderLevelType);
        }

        public SupportCancelAllBtnEnable(boolean z11, @NotNull OrderLevelType orderLevelType) {
            Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
            this.isSupport = z11;
            this.orderLevelType = orderLevelType;
        }

        @NotNull
        public final OrderLevelType getOrderLevelType() {
            return this.orderLevelType;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isSupport) * 31) + this.orderLevelType.hashCode();
        }

        /* JADX INFO: renamed from: isSupport, reason: from getter */
        public final boolean getIsSupport() {
            return this.isSupport;
        }

        @NotNull
        public String toString() {
            return "SupportCancelAllBtnEnable(isSupport=" + this.isSupport + ", orderLevelType=" + this.orderLevelType + ')';
        }
    }
}
