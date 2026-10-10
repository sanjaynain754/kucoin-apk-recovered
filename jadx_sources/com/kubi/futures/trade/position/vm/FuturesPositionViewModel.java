package com.kubi.futures.trade.position.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.Log;
import com.kubi.kumex.utils.Persistence;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.C27050g0;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37569d;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p595rg.InterfaceC44079g;
import p640ti.C45030e;
import p640ti.C45032g;
import p640ti.C45035j;
import p640ti.C45037l;
import p640ti.EmptyWrapper;
import p640ti.InterfaceC45033h;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import si.C44502a;
import si.C44503b;
import si.C44504c;
import si.C44505d;
import si.C44506e;
import si.C44507f;
import si.C44508g;
import si.C44509h;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: FuturesPositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0006J*\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u000eH\u0002J\u0006\u00101\u001a\u00020)J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J*\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u000200H\u0002J\u0006\u0010=\u001a\u00020)J/\u0010>\u001a\u00020)2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010CR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/FuturesPositionViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "positionAndOrderProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/kubi/futures/trade/position/vm/PositionAndOrder;", "kotlin.jvm.PlatformType", "positionsAsyncDealWrapperLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/trade/position/vm/PositionsAsyncDealWrapper;", "getPositionsAsyncDealWrapperLiveData", "()Landroidx/lifecycle/MutableLiveData;", "_positionsWrappers", "", "Lcom/kubi/futures/trade/position/data/IPositionEntityWrapper;", "positionsWrappers", "Landroidx/lifecycle/LiveData;", "getPositionsWrappers", "()Landroidx/lifecycle/LiveData;", "errorLiveData", "", "getErrorLiveData", "positionsAsyncDealTag", "", "getPositionsAsyncDealTag", "()Ljava/lang/String;", "setPositionsAsyncDealTag", "(Ljava/lang/String;)V", "loadingFlag", "", "getLoadingFlag", "lastCloseAllRequestTime", "", "asyncDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "positionAvailablePredicate", "Lio/reactivex/functions/Predicate;", "emptyWrapper", "Lcom/kubi/futures/trade/position/data/EmptyWrapper;", "subscribe", "", "onPositionsAndOrderChanged", "data", "wrapperSocketData", "positions", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "orders", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "refreshPositionWhenConfigChanged", "wrapperAndSortPositions", "originPositions", "toWrapper", "filterAndSorted", "positionWrappers", "insertHeaderWrapper", "filterAndSortedPositionWrappers", "originPositionWrappers", "filterReverseStopMarketOrCloseOrder", ViewProps.POSITION, "order", "requestCloseAllPosition", "refreshEmptyViewIfExists", "balance", "Ljava/math/BigDecimal;", "settleCurrency", "isTrial", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesPositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesPositionViewModel.kt\ncom/kubi/futures/trade/position/vm/FuturesPositionViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n+ 5 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,414:1\n1491#2:415\n1516#2,3:416\n1519#2,3:426\n1563#2:429\n1634#2,2:430\n774#2:432\n865#2,2:433\n1636#2:435\n1869#2,2:436\n808#2,11:438\n774#2:449\n865#2,2:450\n360#2,7:453\n382#3,7:419\n55#4:452\n20#5:460\n*S KotlinDebug\n*F\n+ 1 FuturesPositionViewModel.kt\ncom/kubi/futures/trade/position/vm/FuturesPositionViewModel\n*L\n189#1:415\n189#1:416,3\n189#1:426,3\n190#1:429\n190#1:430,2\n191#1:432\n191#1:433,2\n190#1:435\n237#1:436,2\n274#1:438,11\n278#1:449\n278#1:450,2\n380#1:453,7\n189#1:419,7\n343#1:452\n387#1:460\n*E\n"})
public final class FuturesPositionViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final BehaviorProcessor<PositionAndOrder> f24294X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<PositionsAsyncDealWrapper> f24295Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<List<InterfaceC45033h>> f24296Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<List<InterfaceC45033h>> f24297a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Throwable> f24298b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public volatile String f24299c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f24300d0;

    /* JADX INFO: renamed from: e0 */
    public long f24301e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final CompositeDisposable f24302f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Predicate<PositionsAsyncDealWrapper> f24303g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public volatile EmptyWrapper f24304h0;

    /* JADX INFO: renamed from: J */
    public static final List m27872J(FuturesPositionViewModel futuresPositionViewModel, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<InterfaceC45033h> value = futuresPositionViewModel.f24297a0.getValue();
        return value == null ? new ArrayList() : value;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m27874L(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isEmpty();
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m27875M(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public static final PositionsAsyncDealWrapper m27876N(FuturesPositionViewModel futuresPositionViewModel, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        futuresPositionViewModel.f24299c0 = String.valueOf(System.currentTimeMillis());
        PositionsAsyncDealWrapper positionsAsyncDealWrapper = new PositionsAsyncDealWrapper(null, null, 3, null);
        positionsAsyncDealWrapper.m28035c(futuresPositionViewModel.f24299c0);
        positionsAsyncDealWrapper.m28036d(futuresPositionViewModel.m27906A0(it));
        return positionsAsyncDealWrapper;
    }

    /* JADX INFO: renamed from: O */
    public static final PositionsAsyncDealWrapper m27877O(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (PositionsAsyncDealWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m27878P(FuturesPositionViewModel futuresPositionViewModel, PositionsAsyncDealWrapper positionsAsyncDealWrapper) {
        futuresPositionViewModel.f24295Y.setValue(positionsAsyncDealWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m27880R(FuturesPositionViewModel futuresPositionViewModel, Throwable th2) {
        futuresPositionViewModel.f24298b0.postValue(th2);
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, futuresPositionViewModel.getF46844V() + "-merge");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final boolean m27882c0(FuturesPositionViewModel futuresPositionViewModel, PositionsAsyncDealWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getF24356b(), futuresPositionViewModel.f24299c0) || it.getF24356b() == null;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m27883e0(FuturesPositionViewModel futuresPositionViewModel, BigDecimal bigDecimal, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        futuresPositionViewModel.m27917d0(bigDecimal, str, bool);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Object m27884h0() {
        return InterfaceC44079g.m97140k0(MultiBizFacadeManager.f19232a.m20276t(), null, false, 3, null);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m27888m0() {
        this.f24302f0.clear();
        Observable observable = FlowableCompatKt.m66396j(this.f24294X).onBackpressureLatest().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<T> observableSubscribeOn = C27050g0.m66716a(observable, FuturesFragment.f30411o0.scrollPredicate()).subscribeOn(C42916f.m94126e());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27889n0(this.f24432b, (PositionAndOrder) obj);
            }
        };
        Observable observableFilter = observableSubscribeOn.map(new Function() { // from class: com.kubi.futures.trade.position.vm.a1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesPositionViewModel.m27890o0(function1, obj);
            }
        }).observeOn(C42916f.m94128g()).filter(this.f24303g0);
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27892p0(this.f24333b, (PositionsAsyncDealWrapper) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionViewModel.m27894q0(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.vm.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27902x0(this.f24343b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionViewModel.m27904y0(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f24302f0);
    }

    /* JADX INFO: renamed from: n0 */
    public static final PositionsAsyncDealWrapper m27889n0(FuturesPositionViewModel futuresPositionViewModel, PositionAndOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<InterfaceC45033h> listM27907B0 = futuresPositionViewModel.m27907B0(it.m28032b(), it.m28031a());
        futuresPositionViewModel.f24296Z.postValue(listM27907B0);
        PositionsAsyncDealWrapper value = futuresPositionViewModel.f24295Y.getValue();
        return new PositionsAsyncDealWrapper(futuresPositionViewModel.m27915a0(futuresPositionViewModel.m27908T(listM27907B0), listM27907B0), value != null ? value.getF24356b() : null);
    }

    /* JADX INFO: renamed from: o0 */
    public static final PositionsAsyncDealWrapper m27890o0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (PositionsAsyncDealWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m27892p0(FuturesPositionViewModel futuresPositionViewModel, PositionsAsyncDealWrapper positionsAsyncDealWrapper) {
        futuresPositionViewModel.f24295Y.setValue(positionsAsyncDealWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m27902x0(FuturesPositionViewModel futuresPositionViewModel, Throwable th2) {
        futuresPositionViewModel.f24298b0.postValue(th2);
        Intrinsics.checkNotNull(th2);
        String f46844v = futuresPositionViewModel.getF46844V();
        Intrinsics.checkNotNullExpressionValue(f46844v, "<get-TAG>(...)");
        C37214b.m83255a(th2, f46844v);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final List<InterfaceC45033h> m27907B0(List<PositionEntity> list, List<OrderEntity> list2) {
        List listEmptyList;
        C46527h0 c46527h0 = C46527h0.f104291a;
        boolean zM102684T = c46527h0.m102684T();
        String strM102677L = c46527h0.m102677L();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            String symbol = ((OrderEntity) obj).getSymbol();
            Object arrayList = linkedHashMap.get(symbol);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(symbol, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PositionEntity positionEntity : list) {
            List list3 = (List) linkedHashMap.get(positionEntity.getSymbol());
            if (list3 != null) {
                listEmptyList = new ArrayList();
                for (Object obj2 : list3) {
                    if (m27909U(positionEntity, (OrderEntity) obj2)) {
                        listEmptyList.add(obj2);
                    }
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            Log.f30813a.m36615a("PositionDataSource", "wrapperSocketData isPro=" + zM102684T + " symbol=" + positionEntity.getSymbol() + " id=" + positionEntity.getId() + " qty=" + positionEntity.getCurrentQty() + " positionSide=" + positionEntity.getPositionSide() + " isTrialFunds=" + positionEntity.isTrialFunds() + " prizeType=" + positionEntity.getPrizeType() + " orders=" + listEmptyList.size() + " currentSymbol=" + strM102677L);
            arrayList2.add(zM102684T ? new C45037l(positionEntity, listEmptyList, strM102677L) : new C45035j(positionEntity, listEmptyList, strM102677L));
        }
        return arrayList2;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final MutableLiveData<Throwable> m27910V() {
        return this.f24298b0;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final MutableLiveData<Boolean> m27911W() {
        return this.f24300d0;
    }

    @Nullable
    /* JADX INFO: renamed from: X, reason: from getter */
    public final String getF24299c0() {
        return this.f24299c0;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final MutableLiveData<PositionsAsyncDealWrapper> m27913Y() {
        return this.f24295Y;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final LiveData<List<InterfaceC45033h>> m27914Z() {
        return this.f24297a0;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m27916b0(@NotNull PositionAndOrder data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f24294X.onNext(data);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m27917d0(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable Boolean bool) {
        List<InterfaceC45033h> listM28034b;
        List<? extends InterfaceC45033h> mutableList;
        PropertyEntity properties;
        PositionsAsyncDealWrapper value = this.f24295Y.getValue();
        if (value == null || (listM28034b = value.m28034b()) == null || (mutableList = CollectionsKt.toMutableList((Collection) listM28034b)) == null) {
            return;
        }
        Iterator<? extends InterfaceC45033h> it = mutableList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next() instanceof EmptyWrapper) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            mutableList.remove(i11);
            String strM66668h = C27041f.m66668h(str);
            CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(str), false, 2, null);
            EmptyWrapper emptyWrapper = new EmptyWrapper(bigDecimal, strM66668h, Integer.valueOf(C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4)), bool);
            mutableList.add(i11, emptyWrapper);
            this.f24304h0 = emptyWrapper;
            this.f24299c0 = String.valueOf(System.currentTimeMillis());
            PositionsAsyncDealWrapper positionsAsyncDealWrapper = new PositionsAsyncDealWrapper(null, null, 3, null);
            positionsAsyncDealWrapper.m28035c(this.f24299c0);
            positionsAsyncDealWrapper.m28036d(mutableList);
            this.f24295Y.setValue(positionsAsyncDealWrapper);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final List<InterfaceC45033h> m27920z0(List<? extends InterfaceC45033h> list) {
        ArrayList arrayList = new ArrayList();
        C46527h0 c46527h0 = C46527h0.f104291a;
        boolean zM102684T = c46527h0.m102684T();
        String strM102677L = c46527h0.m102677L();
        for (InterfaceC45033h interfaceC45033h : list) {
            if (interfaceC45033h instanceof C45030e) {
                Log log = Log.f30813a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("toWrapper isPro=");
                sb2.append(zM102684T);
                sb2.append(" symbol=");
                C45030e c45030e = (C45030e) interfaceC45033h;
                sb2.append(c45030e.getF101404a().getSymbol());
                sb2.append(" id=");
                sb2.append(c45030e.getF101404a().getId());
                sb2.append(" qty=");
                sb2.append(c45030e.getF101404a().getCurrentQty());
                sb2.append(" positionSide=");
                sb2.append(c45030e.getF101404a().getPositionSide());
                sb2.append(" sideText=");
                sb2.append((Object) c45030e.getF101410g());
                sb2.append(" currentSymbol=");
                sb2.append(strM102677L);
                log.m36615a("PositionDataSource", sb2.toString());
                arrayList.add(zM102684T ? new C45037l(c45030e.getF101404a(), c45030e.m99566o(), strM102677L) : new C45035j(c45030e.getF101404a(), c45030e.m99566o(), strM102677L));
            }
        }
        return arrayList;
    }

    public FuturesPositionViewModel() {
        BehaviorProcessor<PositionAndOrder> behaviorProcessorCreate = BehaviorProcessor.create();
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorCreate, "create(...)");
        this.f24294X = behaviorProcessorCreate;
        this.f24295Y = new MutableLiveData<>();
        MutableLiveData<List<InterfaceC45033h>> mutableLiveData = new MutableLiveData<>();
        this.f24296Z = mutableLiveData;
        this.f24297a0 = mutableLiveData;
        this.f24298b0 = new MutableLiveData<>();
        this.f24300d0 = new MutableLiveData<>();
        this.f24302f0 = new CompositeDisposable();
        Predicate<PositionsAsyncDealWrapper> predicate = new Predicate() { // from class: com.kubi.futures.trade.position.vm.y0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesPositionViewModel.m27882c0(this.f24429b, (PositionsAsyncDealWrapper) obj);
            }
        };
        this.f24303g0 = predicate;
        C46527h0 c46527h0 = C46527h0.f104291a;
        Observable map = Observable.merge(c46527h0.m102687W().toObservable(), c46527h0.m102691y0()).observeOn(C42916f.m94126e()).map(new Function() { // from class: com.kubi.futures.trade.position.vm.j1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesPositionViewModel.m27872J(this.f24368b, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesPositionViewModel.m27874L((List) obj));
            }
        };
        Observable observableFilter = map.filter(new Predicate() { // from class: com.kubi.futures.trade.position.vm.l1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesPositionViewModel.m27875M(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27876N(this.f24383b, (List) obj);
            }
        };
        Observable observableFilter2 = observableFilter.map(new Function() { // from class: com.kubi.futures.trade.position.vm.n1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesPositionViewModel.m27877O(function2, obj);
            }
        }).observeOn(C42916f.m94128g()).filter(predicate);
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.vm.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27878P(this.f24393b, (PositionsAsyncDealWrapper) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionViewModel.m27879Q(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.position.vm.q1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27880R(this.f24401b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableFilter2.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionViewModel.m27873K(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
        m27888m0();
    }

    /* JADX INFO: renamed from: K */
    public static final void m27873K(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m27879Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m27885i0(FuturesPositionViewModel futuresPositionViewModel, Object obj) {
        futuresPositionViewModel.f24301e0 = System.currentTimeMillis();
        ToastCompat.m66437C(R$string.kumex_close_all_ok_tips);
        futuresPositionViewModel.f24300d0.postValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m27886j0(FuturesPositionViewModel futuresPositionViewModel, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        futuresPositionViewModel.f24300d0.postValue(Boolean.FALSE);
        Log log = Log.f30813a;
        String f46844v = futuresPositionViewModel.getF46844V();
        Intrinsics.checkNotNullExpressionValue(f46844v, "<get-TAG>(...)");
        log.m36616b(f46844v, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m27887l0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m27894q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m27904y0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A0 */
    public final List<InterfaceC45033h> m27906A0(List<? extends InterfaceC45033h> list) {
        return m27915a0(m27908T(m27920z0(list)), list);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: T */
    public final List<InterfaceC45033h> m27908T(List<? extends InterfaceC45033h> list) {
        String strB = com.kubi.futures.trade.position.adapter.x.b();
        boolean zM36516a = Persistence.f30799a.m36516a("positions_only_show_current_contract", false);
        String strM102677L = C46527h0.f104291a.m102677L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C45030e) {
                arrayList.add(obj);
            }
        }
        if (zM36516a) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((C45030e) obj2).getF101404a().getSymbol(), strM102677L)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        switch (strB.hashCode()) {
            case -1768929557:
                if (strB.equals("POSITION_QTY_VALUE_SORT")) {
                    return CollectionsKt.sortedWith(arrayList, new C44509h());
                }
                break;
            case -1753570046:
                if (strB.equals("POSITION_CONTRACT_NAME")) {
                    return CollectionsKt.sortedWith(arrayList, new C44502a());
                }
                break;
            case 814513017:
                if (strB.equals("POSITION_MARGIN_SORT")) {
                    return CollectionsKt.sortedWith(arrayList, new C44503b());
                }
                break;
            case 1332074105:
                if (strB.equals("POSITION_REALIZED_SORT")) {
                    return CollectionsKt.sortedWith(arrayList, new C44505d());
                }
                break;
            case 1369045671:
                if (strB.equals("POSITION_ROI_SORT")) {
                    return CollectionsKt.sortedWith(arrayList, new C44507f());
                }
                break;
            case 1642500472:
                if (strB.equals("POSITION_RISK_SORT")) {
                    return CollectionsKt.sortedWith(arrayList, new C44506e());
                }
                break;
            case 1873369600:
                if (strB.equals("POSITION_UNREALIZED_SORT")) {
                    return CollectionsKt.sortedWith(arrayList, new C44508g());
                }
                break;
        }
        return CollectionsKt.sortedWith(arrayList, new C44504c());
    }

    /* JADX INFO: renamed from: U */
    public final boolean m27909U(PositionEntity positionEntity, OrderEntity orderEntity) {
        if (Intrinsics.areEqual(positionEntity.getSymbol(), orderEntity.getSymbol())) {
            if ((Intrinsics.areEqual(orderEntity.getType(), "market") || Intrinsics.areEqual(orderEntity.getType(), TUIConstants.TUIContact.LIMIT)) && orderEntity.getStop() != null && orderEntity.getStopPrice() != null && orderEntity.getStopPriceType() != null && C37569d.m84685z(positionEntity) != Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
                if ((C27025c.m66566d(orderEntity.getCloseOrder()) || C27025c.m66566d(orderEntity.getCloseOnly())) && positionEntity.isTrialFunds() == orderEntity.isTrialFunds()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public final List<InterfaceC45033h> m27915a0(List<? extends InterfaceC45033h> list, List<? extends InterfaceC45033h> list2) {
        List<InterfaceC45033h> mutableList = CollectionsKt.toMutableList((Collection) list);
        if (list.isEmpty()) {
            EmptyWrapper emptyWrapper = this.f24304h0;
            if (emptyWrapper == null) {
                emptyWrapper = new EmptyWrapper(null, null, null, null, 15, null);
            }
            mutableList.add(emptyWrapper);
        }
        if (!list2.isEmpty()) {
            mutableList.add(0, new C45032g());
        }
        return mutableList;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m27918f0() {
        this.f24299c0 = String.valueOf(System.currentTimeMillis());
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FuturesPositionViewModel$refreshPositionWhenConfigChanged$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m27919g0() {
        if (System.currentTimeMillis() - this.f24301e0 < 3000) {
            ToastCompat.m66437C(R$string.kumex_close_all_ok_tips);
            return;
        }
        this.f24300d0.setValue(Boolean.TRUE);
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.trade.position.vm.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesPositionViewModel.m27884h0();
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionViewModel.m27885i0(this.f24354b, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionViewModel.m27886j0(this.f24359b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionViewModel.m27887l0(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }
}
