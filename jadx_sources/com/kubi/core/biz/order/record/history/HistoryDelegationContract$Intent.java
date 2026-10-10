package com.kubi.core.biz.order.record.history;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660ud.FilterData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent;", "Lcom/kubi/mvi/state/IIntent;", "InitRequestArgs", "UpdateRequestArgs", "ChangeDelegationTradeAccount", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent$ChangeDelegationTradeAccount;", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent$InitRequestArgs;", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent$UpdateRequestArgs;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface HistoryDelegationContract$Intent extends InterfaceC19282d {

    /* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent$ChangeDelegationTradeAccount;", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent;", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "<init>", "(Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;)V", "getAccount", "()Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChangeDelegationTradeAccount implements HistoryDelegationContract$Intent {

        @NotNull
        private final DelegationTradeAccount account;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeDelegationTradeAccount) && Intrinsics.areEqual(this.account, ((ChangeDelegationTradeAccount) other).account);
        }

        public ChangeDelegationTradeAccount(@NotNull DelegationTradeAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        @NotNull
        public final DelegationTradeAccount getAccount() {
            return this.account;
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChangeDelegationTradeAccount(account=" + this.account + ')';
        }
    }

    /* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent$InitRequestArgs;", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent;", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "filterData", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "<init>", "(Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;)V", "getAccount", "()Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "getFilterData", "()Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class InitRequestArgs implements HistoryDelegationContract$Intent {

        @NotNull
        private final DelegationTradeAccount account;

        @NotNull
        private final FilterData filterData;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitRequestArgs)) {
                return false;
            }
            InitRequestArgs initRequestArgs = (InitRequestArgs) other;
            return Intrinsics.areEqual(this.account, initRequestArgs.account) && Intrinsics.areEqual(this.filterData, initRequestArgs.filterData);
        }

        public InitRequestArgs(@NotNull DelegationTradeAccount account, @NotNull FilterData filterData) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(filterData, "filterData");
            this.account = account;
            this.filterData = filterData;
        }

        @NotNull
        public final DelegationTradeAccount getAccount() {
            return this.account;
        }

        @NotNull
        public final FilterData getFilterData() {
            return this.filterData;
        }

        public int hashCode() {
            return (this.account.hashCode() * 31) + this.filterData.hashCode();
        }

        @NotNull
        public String toString() {
            return "InitRequestArgs(account=" + this.account + ", filterData=" + this.filterData + ')';
        }
    }

    /* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent$UpdateRequestArgs;", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent;", "filterData", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "<init>", "(Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;)V", "getFilterData", "()Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateRequestArgs implements HistoryDelegationContract$Intent {

        @NotNull
        private final FilterData filterData;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateRequestArgs) && Intrinsics.areEqual(this.filterData, ((UpdateRequestArgs) other).filterData);
        }

        public UpdateRequestArgs(@NotNull FilterData filterData) {
            Intrinsics.checkNotNullParameter(filterData, "filterData");
            this.filterData = filterData;
        }

        @NotNull
        public final FilterData getFilterData() {
            return this.filterData;
        }

        public int hashCode() {
            return this.filterData.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateRequestArgs(filterData=" + this.filterData + ')';
        }
    }
}
