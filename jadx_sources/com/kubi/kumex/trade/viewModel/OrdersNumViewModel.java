package com.kubi.kumex.trade.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.trade.order.p1;
import com.kubi.sdk.BaseViewModel;
import com.kubi.unify.api.IUnifyAccountService;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p236em.C37214b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrdersNumViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u001bR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00170\u00170\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000b¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "_basicOrdersNum", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "basicOrdersNum", "Landroidx/lifecycle/LiveData;", "getBasicOrdersNum", "()Landroidx/lifecycle/LiveData;", "_advancedOrdersNum", "advancedOrdersNum", "getAdvancedOrdersNum", "_nonStrategyOrdersNum", "_twapOrdersNum", "twapOrdersNum", "getTwapOrdersNum", "_totalOrdersNum", "totalOrdersNum", "getTotalOrdersNum", "_rnOrdersNumInfo", "Lcom/kubi/kumex/trade/viewModel/OrdersNum;", "rnOrdersNumInfo", "getRnOrdersNumInfo", "subscribe", "", "classicBasicOrdersObs", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "trialBasicOrdersObs", "classicAdvancedOrdersObs", "trialAdvancedOrdersObs", "twapOrdersObs", "unsubscribe", "refreshOrderCounts", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrdersNumViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Long> f30732X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Long> f30733Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Long> f30734Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Long> f30735a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Long> f30736b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Long> f30737c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final LiveData<Long> f30738d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Long> f30739e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final LiveData<Long> f30740f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<OrdersNum> f30741g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final LiveData<OrdersNum> f30742h0;

    /* JADX INFO: renamed from: D */
    public static final OrdersNum m36410D(OrdersPageEntityWrapper classicBasicOrders, OrdersPageEntityWrapper trialBasicOrders, OrdersPageEntityWrapper classicAdvancedOrders, OrdersPageEntityWrapper trialAdvancedOrders, OrdersPageEntityWrapper twapOrdersObs) {
        Intrinsics.checkNotNullParameter(classicBasicOrders, "classicBasicOrders");
        Intrinsics.checkNotNullParameter(trialBasicOrders, "trialBasicOrders");
        Intrinsics.checkNotNullParameter(classicAdvancedOrders, "classicAdvancedOrders");
        Intrinsics.checkNotNullParameter(trialAdvancedOrders, "trialAdvancedOrders");
        Intrinsics.checkNotNullParameter(twapOrdersObs, "twapOrdersObs");
        long totalNum = classicBasicOrders.getThrowable() != null ? 0L : classicBasicOrders.getPageEntity().getTotalNum() + trialBasicOrders.getPageEntity().getTotalNum();
        long totalNum2 = classicAdvancedOrders.getThrowable() != null ? 0L : classicAdvancedOrders.getPageEntity().getTotalNum() + trialAdvancedOrders.getPageEntity().getTotalNum();
        long totalNum3 = twapOrdersObs.getThrowable() == null ? twapOrdersObs.getPageEntity().getTotalNum() : 0L;
        return new OrdersNum(totalNum, totalNum2, totalNum3, totalNum + totalNum2 + totalNum3);
    }

    /* JADX INFO: renamed from: E */
    public static final OrdersNum m36411E(Function5 function5, Object p11, Object p12, Object p13, Object p14, Object p15) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p13, "p2");
        Intrinsics.checkNotNullParameter(p14, "p3");
        Intrinsics.checkNotNullParameter(p15, "p4");
        return (OrdersNum) function5.invoke(p11, p12, p13, p14, p15);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m36412F(OrdersNumViewModel ordersNumViewModel, OrdersNum ordersNum) throws JSONException {
        ordersNumViewModel.f30732X.postValue(Long.valueOf(ordersNum.getBasicNum()));
        ordersNumViewModel.f30734Z.postValue(Long.valueOf(ordersNum.getAdvancedNum()));
        ordersNumViewModel.f30737c0.postValue(Long.valueOf(ordersNum.getTwapNum()));
        Long value = ordersNumViewModel.f30736b0.getValue();
        ordersNumViewModel.f30739e0.postValue(Long.valueOf(ordersNum.getTotalNum()));
        long totalNum = ordersNum.getTotalNum();
        if (value == null || totalNum != value.longValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("OrderNum", ordersNum.getTotalNum());
            C43852m.m96605q("user_status", jSONObject);
        }
        p1 p1Var = p1.a;
        Intrinsics.checkNotNull(ordersNum);
        p1Var.k(ordersNum);
        ordersNumViewModel.m36424B();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<Long> m36423A() {
        return this.f30738d0;
    }

    /* JADX INFO: renamed from: B */
    public final void m36424B() {
        if (IUnifyAccountService.f53155a.get().mo64980D()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new OrdersNumViewModel$refreshOrderCounts$1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m36425C(@NotNull Observable<OrdersPageEntityWrapper> classicBasicOrdersObs, @NotNull Observable<OrdersPageEntityWrapper> trialBasicOrdersObs, @NotNull Observable<OrdersPageEntityWrapper> classicAdvancedOrdersObs, @NotNull Observable<OrdersPageEntityWrapper> trialAdvancedOrdersObs, @NotNull Observable<OrdersPageEntityWrapper> twapOrdersObs) {
        Intrinsics.checkNotNullParameter(classicBasicOrdersObs, "classicBasicOrdersObs");
        Intrinsics.checkNotNullParameter(trialBasicOrdersObs, "trialBasicOrdersObs");
        Intrinsics.checkNotNullParameter(classicAdvancedOrdersObs, "classicAdvancedOrdersObs");
        Intrinsics.checkNotNullParameter(trialAdvancedOrdersObs, "trialAdvancedOrdersObs");
        Intrinsics.checkNotNullParameter(twapOrdersObs, "twapOrdersObs");
        getF46845W().clear();
        final Function5 function5 = new Function5() { // from class: com.kubi.kumex.trade.viewModel.b
            @Override // p852kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return OrdersNumViewModel.m36410D((OrdersPageEntityWrapper) obj, (OrdersPageEntityWrapper) obj2, (OrdersPageEntityWrapper) obj3, (OrdersPageEntityWrapper) obj4, (OrdersPageEntityWrapper) obj5);
            }
        };
        Observable observableSubscribeOn = Observable.combineLatest(classicBasicOrdersObs, trialBasicOrdersObs, classicAdvancedOrdersObs, trialAdvancedOrdersObs, twapOrdersObs, new io.reactivex.functions.Function5() { // from class: com.kubi.kumex.trade.viewModel.c
            @Override // io.reactivex.functions.Function5
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return OrdersNumViewModel.m36411E(function5, obj, obj2, obj3, obj4, obj5);
            }
        }).subscribeOn(C42916f.m94126e());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.viewModel.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrdersNumViewModel.m36412F(this.f30745b, (OrdersNum) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.viewModel.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrdersNumViewModel.m36413G(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.viewModel.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrdersNumViewModel.m36414H((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.viewModel.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrdersNumViewModel.m36415I(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<Long> m36427w() {
        return this.f30735a0;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<Long> m36428x() {
        return this.f30733Y;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<OrdersNum> m36429y() {
        return this.f30742h0;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<Long> m36430z() {
        return this.f30740f0;
    }

    public OrdersNumViewModel() {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(0L);
        this.f30732X = mutableLiveData;
        this.f30733Y = mutableLiveData;
        MutableLiveData<Long> mutableLiveData2 = new MutableLiveData<>(0L);
        this.f30734Z = mutableLiveData2;
        this.f30735a0 = mutableLiveData2;
        this.f30736b0 = new MutableLiveData<>(0L);
        MutableLiveData<Long> mutableLiveData3 = new MutableLiveData<>(0L);
        this.f30737c0 = mutableLiveData3;
        this.f30738d0 = mutableLiveData3;
        MutableLiveData<Long> mutableLiveData4 = new MutableLiveData<>(0L);
        this.f30739e0 = mutableLiveData4;
        this.f30740f0 = mutableLiveData4;
        MutableLiveData<OrdersNum> mutableLiveData5 = new MutableLiveData<>(OrdersNum.f30726e.getDEFAULT());
        this.f30741g0 = mutableLiveData5;
        this.f30742h0 = mutableLiveData5;
    }

    /* JADX INFO: renamed from: G */
    public static final void m36413G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m36414H(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ActiveDelegate OrderNum Exception");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final void m36415I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public final void m36426J() {
        getF46845W().clear();
    }
}
