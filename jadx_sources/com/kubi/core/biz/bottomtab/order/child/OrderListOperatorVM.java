package com.kubi.core.biz.bottomtab.order.child;

import androidx.lifecycle.ViewModel;
import cd.InterfaceC4934a;
import com.kubi.core.base.order.data.CancelOrderData$All$Response;
import com.kubi.core.base.order.data.CancelOrderData$All$ResponseFail;
import com.kubi.core.base.order.data.CancelOrderData$All$ResponseSuccess;
import com.kubi.core.base.order.data.CancelOrderData$Single$Response;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseFail;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseSuccess;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.spot.helper.TradeManagerProxy;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$string;
import io.reactivex.disposables.CompositeDisposable;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p793yc.InterfaceC46460b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderListOperatorVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u0017\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0012H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "orderRepo", "Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "_eventFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$BizEvent;", "eventFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "balanceCollectJob", "Lkotlinx/coroutines/Job;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "injectOrderRepo", "", "cancelTargetOrder", "symbol", "", "orderId", "cancelAllOrders", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "sendBizIntent", "intent", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;", "onCleared", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderListOperatorVM extends ViewModel {

    /* JADX INFO: renamed from: V */
    @Nullable
    public InterfaceC4934a f20262V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41669n<InterfaceC11768r> f20263W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41678w<InterfaceC11768r> f20264X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC41775x1 f20265Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final CompositeDisposable f20266Z;

    /* JADX INFO: renamed from: f */
    public static final Unit m21497f(OrderListOperatorVM orderListOperatorVM, CancelOrderData$All$Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CancelOrderData$All$ResponseSuccess) {
            orderListOperatorVM.f20263W.setValue(new InterfaceC11768r.a(true, true, null, 4, null));
        }
        if (it instanceof CancelOrderData$All$ResponseFail) {
            orderListOperatorVM.f20263W.setValue(new InterfaceC11768r.a(false, Intrinsics.areEqual(((CancelOrderData$All$ResponseFail) it).getApiCode(), "301134"), null, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m21498h(OrderListOperatorVM orderListOperatorVM, CancelOrderData$Single$Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CancelOrderData$Single$ResponseSuccess) {
            orderListOperatorVM.f20263W.setValue(new InterfaceC11768r.a(true, true, null, 4, null));
        }
        if (it instanceof CancelOrderData$Single$ResponseFail) {
            CancelOrderData$Single$ResponseFail cancelOrderData$Single$ResponseFail = (CancelOrderData$Single$ResponseFail) it;
            orderListOperatorVM.f20263W.setValue(new InterfaceC11768r.a(false, Intrinsics.areEqual(cancelOrderData$Single$ResponseFail.getApiCode(), "301134") || Intrinsics.areEqual(cancelOrderData$Single$ResponseFail.getApiCode(), "106100"), null, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m21499e(String str, OrderLevelType orderLevelType) {
        InterfaceC46460b<Request, CancelOrderData$All$Response> interfaceC46460bMo5153a;
        String str2 = (str == null || str.length() == 0) ? null : str;
        if (ISpotCommonService.f49644a.get().mo59973q(str)) {
            this.f20263W.setValue(new InterfaceC11768r.a(false, false, Integer.valueOf(R$string.outage_tip)));
            return;
        }
        Request request = new Request(orderLevelType, str2);
        InterfaceC4934a interfaceC4934a = this.f20262V;
        if (interfaceC4934a == null || (interfaceC46460bMo5153a = interfaceC4934a.mo5153a()) == null) {
            return;
        }
        interfaceC46460bMo5153a.mo21152a(request, this.f20266Z, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderListOperatorVM.m21497f(this.f20261b, (CancelOrderData$All$Response) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m21500g(String str, String str2) {
        InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$Single$Response> interfaceC46460bMo5156d;
        TradeManagerProxy tradeManagerProxy = TradeManagerProxy.f21264a;
        if (tradeManagerProxy.m23362b(str) && !tradeManagerProxy.m23361a(str)) {
            this.f20263W.setValue(new InterfaceC11768r.a(false, false, Integer.valueOf(R$string.outage_tip)));
            return;
        }
        com.kubi.core.base.order.data.Request request = new com.kubi.core.base.order.data.Request(str2, str);
        InterfaceC4934a interfaceC4934a = this.f20262V;
        if (interfaceC4934a == null || (interfaceC46460bMo5156d = interfaceC4934a.mo5156d()) == null) {
            return;
        }
        interfaceC46460bMo5156d.mo21152a(request, this.f20266Z, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderListOperatorVM.m21498h(this.f20260b, (CancelOrderData$Single$Response) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41678w<InterfaceC11768r> m21501n() {
        return this.f20264X;
    }

    /* JADX INFO: renamed from: o */
    public final void m21502o(@Nullable InterfaceC4934a interfaceC4934a) {
        this.f20262V = interfaceC4934a;
    }

    /* JADX INFO: renamed from: p */
    public final void m21503p(@NotNull OrderListOperatorContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof OrderListOperatorContract$UiIntent.CancelOrder) {
            OrderListOperatorContract$UiIntent.CancelOrder cancelOrder = (OrderListOperatorContract$UiIntent.CancelOrder) intent;
            m21500g(cancelOrder.getSymbol(), cancelOrder.getOrderId());
        } else {
            if (!(intent instanceof OrderListOperatorContract$UiIntent.CancelAllOrder)) {
                throw new NoWhenBranchMatchedException();
            }
            OrderListOperatorContract$UiIntent.CancelAllOrder cancelAllOrder = (OrderListOperatorContract$UiIntent.CancelAllOrder) intent;
            m21499e(cancelAllOrder.getSymbol(), cancelAllOrder.getOrderLevelType());
        }
    }

    public OrderListOperatorVM() {
        InterfaceC41669n<InterfaceC11768r> interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f20263W = interfaceC41669nM91009a;
        this.f20264X = interfaceC41669nM91009a;
        this.f20266Z = new CompositeDisposable();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC41775x1 interfaceC41775x1 = this.f20265Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f20266Z.clear();
    }
}
