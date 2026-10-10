package com.kubi.core.biz.order.record.history;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660ud.FilterData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.history.HistoryDelegationContract$UiState, reason: from toString */
/* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;", "Lcom/kubi/mvi/state/IState;", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "filterData", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "<init>", "(Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;)V", "getAccount", "()Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "getFilterData", "()Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @NotNull
    private final DelegationTradeAccount account;

    @NotNull
    private final FilterData filterData;

    public UiState(@NotNull DelegationTradeAccount account, @NotNull FilterData filterData) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(filterData, "filterData");
        this.account = account;
        this.filterData = filterData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.account, uiState.account) && Intrinsics.areEqual(this.filterData, uiState.filterData);
    }

    public static /* synthetic */ UiState copy$default(UiState uiState, DelegationTradeAccount delegationTradeAccount, FilterData filterData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            delegationTradeAccount = uiState.account;
        }
        if ((i11 & 2) != 0) {
            filterData = uiState.filterData;
        }
        return uiState.copy(delegationTradeAccount, filterData);
    }

    @NotNull
    public final UiState copy(@NotNull DelegationTradeAccount account, @NotNull FilterData filterData) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(filterData, "filterData");
        return new UiState(account, filterData);
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
        return "UiState(account=" + this.account + ", filterData=" + this.filterData + ')';
    }

    public /* synthetic */ UiState(DelegationTradeAccount delegationTradeAccount, FilterData filterData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(delegationTradeAccount, (i11 & 2) != 0 ? new FilterData(null, null, null, null, null, null, 63, null) : filterData);
    }
}
