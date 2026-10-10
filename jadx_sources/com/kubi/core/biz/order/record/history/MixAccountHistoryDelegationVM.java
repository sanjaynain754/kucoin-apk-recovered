package com.kubi.core.biz.order.record.history;

import androidx.lifecycle.ViewModel;
import cd.InterfaceC4934a;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.unify.api.IUnifyAccountService;
import io.reactivex.Observable;
import java.util.Locale;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p793yc.InterfaceC46463e;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.history.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0007J*\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "initState", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "()Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;", "register", "", "getHistoryDelegationPageHandler", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "page", "", "size", "tradeType", "", "sendBizIntent", "intent", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$Intent;", "createRequestData", "Lcom/kubi/core/base/order/data/HistoryOrderList$Request;", "mapOrderTypeParams", "param", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MixAccountHistoryDelegationVM extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final UiState f20623V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public AbstractC46753c f20624W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41669n<UiState> f20625X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41678w<UiState> f20626Y;

    /* JADX INFO: renamed from: b */
    public final Request m22238b(int i11, int i12, String str) {
        UiState value = this.f20625X.getValue();
        Pair<String, String> pairM99826i = value.getFilterData().m99826i();
        String str2 = "SPOT";
        if (!Intrinsics.areEqual(str, "SPOT") && !Intrinsics.areEqual(str, "TRADE")) {
            str2 = "MARGIN";
        }
        String str3 = str2;
        String symbol = value.getFilterData().getSymbol();
        String side = value.getFilterData().getSide();
        String filterStatus = value.getFilterData().getFilterStatus();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = filterStatus.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Request(str3, symbol, side, m22242p(value.getFilterData().getOrderType()), lowerCase, pairM99826i.getFirst(), pairM99826i.getSecond(), String.valueOf(i11), String.valueOf(i12));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> m22239d(int i11, int i12, @NotNull String tradeType) {
        InterfaceC4934a f104578c;
        InterfaceC46463e<Request, ResponseItemEntity, HistoryOrdersUiData$ItemEntity> f104590h;
        Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> observableMo66265a;
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Request requestM22238b = m22238b(i11, i12, tradeType);
        AbstractC46753c abstractC46753c = this.f20624W;
        if (abstractC46753c != null && (f104578c = abstractC46753c.getF104578c()) != null && (f104590h = f104578c.getF104590h()) != null && (observableMo66265a = f104590h.mo66265a(requestM22238b)) != null) {
            return observableMo66265a;
        }
        Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final UiState m22240n() {
        return this.f20625X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC41678w<UiState> m22241o() {
        return this.f20626Y;
    }

    /* JADX INFO: renamed from: q */
    public final void m22243q(@NotNull AbstractC46753c repoProvider) {
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20624W = repoProvider;
    }

    /* JADX INFO: renamed from: r */
    public final void m22244r(@NotNull HistoryDelegationContract$Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof HistoryDelegationContract$Intent.InitRequestArgs) {
            HistoryDelegationContract$Intent.InitRequestArgs initRequestArgs = (HistoryDelegationContract$Intent.InitRequestArgs) intent;
            this.f20625X.setValue(new UiState(initRequestArgs.getAccount(), initRequestArgs.getFilterData()));
        } else if (intent instanceof HistoryDelegationContract$Intent.UpdateRequestArgs) {
            InterfaceC41669n<UiState> interfaceC41669n = this.f20625X;
            interfaceC41669n.setValue(UiState.copy$default(interfaceC41669n.getValue(), null, ((HistoryDelegationContract$Intent.UpdateRequestArgs) intent).getFilterData(), 1, null));
        } else {
            if (!(intent instanceof HistoryDelegationContract$Intent.ChangeDelegationTradeAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC41669n<UiState> interfaceC41669n2 = this.f20625X;
            interfaceC41669n2.setValue(UiState.copy$default(interfaceC41669n2.getValue(), ((HistoryDelegationContract$Intent.ChangeDelegationTradeAccount) intent).getAccount(), null, 2, null));
        }
    }

    public MixAccountHistoryDelegationVM() {
        DelegationTradeAccount delegationTradeAccount = IUnifyAccountService.f53155a.get().mo64979C() ? DelegationTradeAccount.b.f20621a : null;
        UiState uiState = new UiState(delegationTradeAccount == null ? DelegationTradeAccount.a.f20619a : delegationTradeAccount, null, 2, null);
        this.f20623V = uiState;
        InterfaceC41669n<UiState> interfaceC41669nM91009a = C41679x.m91009a(uiState);
        this.f20625X = interfaceC41669nM91009a;
        this.f20626Y = C41636g.m90907c(interfaceC41669nM91009a);
    }

    /* JADX INFO: renamed from: p */
    public final String m22242p(String str) {
        switch (str) {
            case "limit_stop":
                return "2";
            case "market":
                return "1";
            case "limit":
                return "0";
            case "market_stop":
                return "3";
            case "advanced_limit":
                return "4";
            default:
                return "";
        }
    }
}
