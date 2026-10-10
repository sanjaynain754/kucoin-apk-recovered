package com.kubi.tradebase.orderbook;

import androidx.lifecycle.MutableLiveData;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.resources.widget.OrderBookType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.user.config.UserInfo;
import i30.InterfaceC38436a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: OrderBookViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\bJ\u0016\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00180\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\n¨\u0006)"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/OrderBookViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "marginMarketApi", "Lcom/kubi/tradebase/api/FavoriteApi;", "showTotalOrSingle", "Landroidx/lifecycle/MutableLiveData;", "", "getShowTotalOrSingle", "()Landroidx/lifecycle/MutableLiveData;", "amountPrecision", "getAmountPrecision", "pricePrecision", "Lkotlin/Pair;", "", "getPricePrecision", "orderBookType", "Lcom/kubi/resources/widget/OrderBookType;", "getOrderBookType", "orderData", "Lcom/kubi/data/entity/OrderBookEntity;", "getOrderData", "activeDelegationList", "", "Lcom/kubi/data/entity/OrderBookIndex;", "getActiveDelegationList", "activeSrcDelegationList", "Lcom/kubi/spot/entity/DelegationEntity;", "getActiveSrcDelegationList", "displayOrderBookData", "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;", "kotlin.jvm.PlatformType", "getDisplayOrderBookData", "calculateOrderBook", "", "ensureMutable", "maxSize", "fetchActiveOrdersByCurrency", "symbol", "type", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderBookViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC38436a f51589V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Integer> f51590W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Integer> f51591X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<Integer, String>> f51592Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<OrderBookType> f51593Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<OrderBookEntity> f51594a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<OrderBookIndex>> f51595b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<List<DelegationEntity>> f51596c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<DisplayOrderBookData> f51597d0;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m63259h(OrderBookViewModel orderBookViewModel, OrderBookEntity orderBookEntity, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            OrderBookEntity value = orderBookViewModel.f51594a0.getValue();
            Intrinsics.checkNotNull(value);
            orderBookEntity = value;
        }
        orderBookViewModel.m63264g(orderBookEntity, i11);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m63260j(OrderBookViewModel orderBookViewModel, BasePageEntity basePageEntity) {
        MutableLiveData<List<DelegationEntity>> mutableLiveData = orderBookViewModel.f51596c0;
        List<DelegationEntity> items = basePageEntity != null ? basePageEntity.getItems() : null;
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        mutableLiveData.setValue(items);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m63264g(@NotNull OrderBookEntity ensureMutable, int i11) {
        Intrinsics.checkNotNullParameter(ensureMutable, "ensureMutable");
        launchOnMain(new OrderBookViewModel$calculateOrderBook$1(ensureMutable, this, i11, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m63265i(@NotNull String symbol, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(type, "type");
        if (UserInfo.a.n()) {
            HashMap map = new HashMap();
            map.put("symbol", symbol);
            map.put("page", "1");
            map.put("size", "10");
            map.put("tradeType", type);
            map.put("status", "active");
            Observable observableCompose = InterfaceC38436a.m86695a(this.f51589V, map, false, false, 6, null).compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
            final Function1 function1 = new Function1() { // from class: com.kubi.tradebase.orderbook.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderBookViewModel.m63260j(this.f51602b, (BasePageEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.tradebase.orderbook.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OrderBookViewModel.m63261k(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.tradebase.orderbook.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderBookViewModel.m63262n((Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.tradebase.orderbook.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OrderBookViewModel.m63263o(function2, obj);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<List<OrderBookIndex>> m63266p() {
        return this.f51595b0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<List<DelegationEntity>> m63267q() {
        return this.f51596c0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Integer> m63268r() {
        return this.f51591X;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<DisplayOrderBookData> m63269s() {
        return this.f51597d0;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final MutableLiveData<OrderBookType> m63270t() {
        return this.f51593Z;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<OrderBookEntity> m63271u() {
        return this.f51594a0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final MutableLiveData<Pair<Integer, String>> m63272v() {
        return this.f51592Y;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<Integer> m63273w() {
        return this.f51590W;
    }

    public OrderBookViewModel() {
        Object objCreate = C42597a.m93386b().create(InterfaceC38436a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f51589V = (InterfaceC38436a) objCreate;
        this.f51590W = new MutableLiveData<>(0);
        this.f51591X = new MutableLiveData<>(8);
        this.f51592Y = new MutableLiveData<>(new Pair(8, "0.00000001"));
        this.f51593Z = new MutableLiveData<>(OrderBookType.C22935a.f43984b);
        this.f51594a0 = new MutableLiveData<>(new OrderBookEntity(null, 0L, null, null, 0L, 31, null));
        this.f51595b0 = new MutableLiveData<>(new ArrayList());
        this.f51596c0 = new MutableLiveData<>(new ArrayList());
        this.f51597d0 = new MutableLiveData<>(new DisplayOrderBookData("", null, null, null, null, 30, null));
    }

    /* JADX INFO: renamed from: k */
    public static final void m63261k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m63262n(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m63263o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
