package com.kubi.core.biz.order.record.active;

import cd.InterfaceC4934a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.base.order.data.CancelOrderData$All$Response;
import com.kubi.core.base.order.data.CancelOrderData$All$ResponseFail;
import com.kubi.core.base.order.data.CancelOrderData$All$ResponseSuccess;
import com.kubi.core.base.order.data.CancelOrderData$Single$Response;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseFail;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseSuccess;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.spot.helper.TradeManagerProxy;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p793yc.InterfaceC46460b;
import p793yc.InterfaceC46463e;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.active.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OpenOrdersRecordVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u001eH\u0014J\b\u0010!\u001a\u00020\"H\u0002R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiIntent;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiState;", "repoManager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$BizEvent;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "initState", "getInitState", "()Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiState;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "pageIndex", "", "pageSize", "orderLevel", "Lcom/kubi/core/base/order/data/OrderLevelType;", "sendBizIntent", "", "intent", "onCleared", "requestSymbolArgs", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OpenOrdersRecordVM extends AbsTradeBaseBizVM<OpenOrdersRecordContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41668m<InterfaceC12019a> f20593X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41673r<InterfaceC12019a> f20594Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final CompositeDisposable f20595Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOrdersRecordVM(@NotNull AbstractC46753c repoManager) {
        super(repoManager);
        Intrinsics.checkNotNullParameter(repoManager, "repoManager");
        InterfaceC41668m<InterfaceC12019a> interfaceC41668mM91001b = C41674s.m91001b(0, 1, null, 5, null);
        this.f20593X = interfaceC41668mM91001b;
        this.f20594Y = interfaceC41668mM91001b;
        this.f20595Z = new CompositeDisposable();
    }

    /* JADX INFO: renamed from: B */
    public static final UiState m22124B(OpenOrdersRecordContract$UiIntent openOrdersRecordContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, false, Boolean.valueOf(((OpenOrdersRecordContract$UiIntent.UpdateOrderEmptyStatus) openOrdersRecordContract$UiIntent).getIsEmpty()), null, 11, null);
    }

    /* JADX INFO: renamed from: C */
    public static final UiState m22125C(OpenOrdersRecordContract$UiIntent openOrdersRecordContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, false, null, Boolean.valueOf(((OpenOrdersRecordContract$UiIntent.UpdateOrderEmptyStatus) openOrdersRecordContract$UiIntent).getIsEmpty()), 7, null);
    }

    /* JADX INFO: renamed from: D */
    public static final UiState m22126D(OpenOrdersRecordContract$UiIntent openOrdersRecordContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, ((OpenOrdersRecordContract$UiIntent.InitCurrentSymbol) openOrdersRecordContract$UiIntent).getSymbol(), false, null, null, 14, null);
    }

    /* JADX INFO: renamed from: E */
    public static final UiState m22127E(OpenOrdersRecordContract$UiIntent openOrdersRecordContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, ((OpenOrdersRecordContract$UiIntent.OnlyCurrentSymbol) openOrdersRecordContract$UiIntent).getIsOnly(), null, null, 13, null);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m22128F(OpenOrdersRecordVM openOrdersRecordVM, CancelOrderData$Single$Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CancelOrderData$Single$ResponseSuccess) {
            openOrdersRecordVM.f20593X.mo90855d(new InterfaceC12019a.a(true, true, null, 4, null));
        }
        if (it instanceof CancelOrderData$Single$ResponseFail) {
            CancelOrderData$Single$ResponseFail cancelOrderData$Single$ResponseFail = (CancelOrderData$Single$ResponseFail) it;
            openOrdersRecordVM.f20593X.mo90855d(new InterfaceC12019a.a(false, Intrinsics.areEqual(cancelOrderData$Single$ResponseFail.getApiCode(), "301134") || Intrinsics.areEqual(cancelOrderData$Single$ResponseFail.getApiCode(), "106100"), null, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m22129G(OpenOrdersRecordVM openOrdersRecordVM, CancelOrderData$All$Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CancelOrderData$All$ResponseSuccess) {
            openOrdersRecordVM.f20593X.mo90855d(new InterfaceC12019a.a(true, true, null, 4, null));
        }
        if (it instanceof CancelOrderData$All$ResponseFail) {
            openOrdersRecordVM.f20593X.mo90855d(new InterfaceC12019a.a(false, Intrinsics.areEqual(((CancelOrderData$All$ResponseFail) it).getApiCode(), "301134"), null, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void m22136A(@NotNull final OpenOrdersRecordContract$UiIntent intent) {
        InterfaceC46460b<Request, CancelOrderData$All$Response> interfaceC46460bMo5153a;
        InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$Single$Response> interfaceC46460bMo5156d;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (intent instanceof OpenOrdersRecordContract$UiIntent.UpdateOrderEmptyStatus) {
            OrderLevelType orderType = ((OpenOrdersRecordContract$UiIntent.UpdateOrderEmptyStatus) intent).getOrderType();
            if (orderType instanceof OrderLevelType.Normal) {
                updateState(new Function1() { // from class: com.kubi.core.biz.order.record.active.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpenOrdersRecordVM.m22124B(intent, (UiState) obj);
                    }
                });
                return;
            } else {
                if (!(orderType instanceof OrderLevelType.Advanced)) {
                    throw new NoWhenBranchMatchedException();
                }
                updateState(new Function1() { // from class: com.kubi.core.biz.order.record.active.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpenOrdersRecordVM.m22125C(intent, (UiState) obj);
                    }
                });
                return;
            }
        }
        if (intent instanceof OpenOrdersRecordContract$UiIntent.InitCurrentSymbol) {
            updateState(new Function1() { // from class: com.kubi.core.biz.order.record.active.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OpenOrdersRecordVM.m22126D(intent, (UiState) obj);
                }
            });
            return;
        }
        if (intent instanceof OpenOrdersRecordContract$UiIntent.OnlyCurrentSymbol) {
            updateState(new Function1() { // from class: com.kubi.core.biz.order.record.active.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OpenOrdersRecordVM.m22127E(intent, (UiState) obj);
                }
            });
            return;
        }
        if (intent instanceof OpenOrdersRecordContract$UiIntent.CancelOrder) {
            TradeManagerProxy tradeManagerProxy = TradeManagerProxy.f21264a;
            OpenOrdersRecordContract$UiIntent.CancelOrder cancelOrder = (OpenOrdersRecordContract$UiIntent.CancelOrder) intent;
            if (tradeManagerProxy.m23362b(cancelOrder.getSymbol()) && !tradeManagerProxy.m23361a(cancelOrder.getSymbol())) {
                this.f20593X.mo90855d(new InterfaceC12019a.a(false, false, Integer.valueOf(R$string.outage_tip)));
                return;
            }
            com.kubi.core.base.order.data.Request request = new com.kubi.core.base.order.data.Request(cancelOrder.getOrderId(), cancelOrder.getSymbol());
            InterfaceC4934a interfaceC4934aMo96893b = getF20069V().getF104578c();
            if (interfaceC4934aMo96893b == null || (interfaceC46460bMo5156d = interfaceC4934aMo96893b.getF104586d()) == null) {
                return;
            }
            interfaceC46460bMo5156d.mo21152a(request, this.f20595Z, new Function1() { // from class: com.kubi.core.biz.order.record.active.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OpenOrdersRecordVM.m22128F(this.f20591b, (CancelOrderData$Single$Response) obj);
                }
            });
            return;
        }
        if (!(intent instanceof OpenOrdersRecordContract$UiIntent.CancelAllOrder)) {
            throw new NoWhenBranchMatchedException();
        }
        String strM66668h = ((UiState) getState()).getIsOnlyCurrentSymbol() ? C27041f.m66668h(((UiState) getState()).getSymbol()) : null;
        if (ISpotCommonService.f49644a.get().mo59973q(strM66668h)) {
            this.f20593X.mo90855d(new InterfaceC12019a.a(false, false, Integer.valueOf(R$string.outage_tip)));
            return;
        }
        Request request2 = new Request(((OpenOrdersRecordContract$UiIntent.CancelAllOrder) intent).getOrderLevelType(), strM66668h);
        InterfaceC4934a interfaceC4934aMo96893b2 = getF20069V().getF104578c();
        if (interfaceC4934aMo96893b2 == null || (interfaceC46460bMo5153a = interfaceC4934aMo96893b2.getF104587e()) == null) {
            return;
        }
        interfaceC46460bMo5153a.mo21152a(request2, this.f20595Z, new Function1() { // from class: com.kubi.core.biz.order.record.active.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenOrdersRecordVM.m22129G(this.f20592b, (CancelOrderData$All$Response) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC41673r<InterfaceC12019a> m22138x() {
        return this.f20594Y;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, false, null, null, 15, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f20595Z.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final Observable<BasePageEntity<OrderItem>> m22137w(int i11, int i12, @Nullable OrderLevelType orderLevelType) {
        InterfaceC46463e<com.kubi.core.base.order.data.Request, OrderItem, OrderItem> f101560d;
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().getF104578c();
        if (interfaceC4934aMo96893b != null && (f101560d = interfaceC4934aMo96893b.getF104588f()) != null) {
            return f101560d.mo66265a(new com.kubi.core.base.order.data.Request(m22140z(), null, orderLevelType, i11, i12, null, null, 98, null));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final String m22140z() {
        if (((UiState) getState()).getIsOnlyCurrentSymbol()) {
            return C27041f.m66668h(((UiState) getState()).getSymbol());
        }
        return "";
    }
}
