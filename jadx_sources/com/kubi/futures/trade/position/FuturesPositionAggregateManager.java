package com.kubi.futures.trade.position;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.trade.PositionHelper;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27099x;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.i0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u001e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J \u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001bH\u0002R\u001c\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/futures/trade/position/FuturesPositionAggregateManager;", "", "onPush", "Lkotlin/Function1;", "Lcom/kubi/futures/trade/position/FuturesPositionAggregateEntity;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TAG", "", "lock", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "selfState", "Lcom/kubi/futures/trade/position/AggregateState;", "trialState", "currentBizType", "Lcom/kubi/broker/MultiBizType;", "started", "", "start", InterfaceC33730j9.f70350a, "subscribeByMode", "isTrial", "onPositionsChanged", "positions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "onTpSlOrdersChanged", "orders", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "pushSnapshot", "state", "onError", "source", "throwable", "", "isTakeProfitOrder", "order", ViewProps.POSITION, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesPositionAggregateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesPositionAggregateManager.kt\ncom/kubi/futures/trade/position/FuturesPositionAggregateManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1563#2:475\n1634#2,2:476\n774#2:478\n865#2,2:479\n774#2:481\n865#2,2:482\n827#2:484\n855#2,2:485\n1636#2:487\n*S KotlinDebug\n*F\n+ 1 FuturesPositionAggregateManager.kt\ncom/kubi/futures/trade/position/FuturesPositionAggregateManager\n*L\n137#1:475\n137#1:476,2\n138#1:478\n138#1:479,2\n139#1:481\n139#1:482,2\n140#1:484\n140#1:485,2\n137#1:487\n*E\n"})
public final class FuturesPositionAggregateManager {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Function1<FuturesPositionAggregateEntity, Unit> f24182a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f24183b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Object f24184c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final CompositeDisposable f24185d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final AggregateState f24186e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AggregateState f24187f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public MultiBizType f24188g;

    /* JADX INFO: renamed from: h */
    public boolean f24189h;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesPositionAggregateManager(@Nullable Function1<? super FuturesPositionAggregateEntity, Unit> function1) {
        this.f24182a = function1;
        this.f24183b = "FuturesPositionAggregateManager";
        this.f24184c = new Object();
        this.f24185d = new CompositeDisposable();
        this.f24186e = new AggregateState(null, null, 3, null);
        this.f24187f = new AggregateState(null, null, 3, null);
        this.f24188g = MultiBizType.UN_KNOW;
    }

    /* JADX INFO: renamed from: j */
    public final void m27739j(String str, Throwable th2, boolean z11) {
        C37214b.m83255a(th2, this.f24183b + '-' + str);
        C44128b.m97263g(this.f24183b, th2);
        C43852m.m96590b(C17060n0.m36552b(), "PositionAggregatePush", Constants.IPC_BUNDLE_KEY_SEND_ERROR, TuplesKt.m90091to("bizType", this.f24188g.getValue()), TuplesKt.m90091to("source", str), TuplesKt.m90091to("isTrial", String.valueOf(z11)));
    }

    /* JADX INFO: renamed from: k */
    public final void m27740k(boolean z11, List<PositionEntity> list) {
        synchronized (this.f24184c) {
            m27744o(z11).m27770d(list);
            m27742m();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m27741l(boolean z11, List<OrderEntity> list) {
        synchronized (this.f24184c) {
            m27744o(z11).m27771e(list);
            m27742m();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m27742m() {
        List<PositionEntity> listPlus = CollectionsKt.plus((Collection) this.f24186e.m27768b(), (Iterable) this.f24187f.m27768b());
        List listPlus2 = CollectionsKt.plus((Collection) this.f24186e.m27769c(), (Iterable) this.f24187f.m27769c());
        String value = this.f24188g.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (PositionEntity positionEntity : listPlus) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listPlus2) {
                if (PositionHelper.f30771a.m36463K((OrderEntity) obj, positionEntity)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (m27738i((OrderEntity) obj2, positionEntity)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (!m27738i((OrderEntity) obj3, positionEntity)) {
                    arrayList4.add(obj3);
                }
            }
            arrayList.add(C13965j0.m27750d(positionEntity, arrayList3, arrayList4));
        }
        FuturesPositionAggregateEntity futuresPositionAggregateEntity = new FuturesPositionAggregateEntity(value, arrayList, System.currentTimeMillis());
        C12572a.m23695d("kline_positions_list_update", C27099x.m66919i(futuresPositionAggregateEntity.getPositions(), false, 2, null), 0L, 4, null);
        Function1<FuturesPositionAggregateEntity, Unit> function1 = this.f24182a;
        if (function1 != null) {
            function1.invoke(futuresPositionAggregateEntity);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m27743n() {
        if (!IUserService.a.get().c()) {
            C13965j0.m27749c(this.f24183b, "skip start, user is not login");
            return;
        }
        m27745p();
        this.f24189h = true;
        this.f24188g = BrokerConfig.f19211a.m20201d().mo4515x();
        m27746q(false);
        C43852m.m96590b(C17060n0.m36552b(), "PositionAggregatePush", "start", TuplesKt.m90091to("bizType", this.f24188g.getValue()));
    }

    /* JADX INFO: renamed from: o */
    public final AggregateState m27744o(boolean z11) {
        return z11 ? this.f24187f : this.f24186e;
    }

    /* JADX INFO: renamed from: p */
    public final void m27745p() {
        if (this.f24189h) {
            this.f24189h = false;
            this.f24185d.clear();
            synchronized (this.f24184c) {
                this.f24186e.m27767a();
                this.f24187f.m27767a();
                Unit unit = Unit.INSTANCE;
            }
            C43852m.m96590b(C17060n0.m36552b(), "PositionAggregatePush", InterfaceC33730j9.f70350a, TuplesKt.m90091to("bizType", this.f24188g.getValue()));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m27746q(final boolean z11) {
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        Observable<List<PositionEntity>> observableSubscribeOn = multiBizFacadeManager.m20266A(z11, this.f24188g).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionAggregateManager.m27730r(this.f24120b, z11, (List) obj);
            }
        };
        Consumer<? super List<PositionEntity>> consumer = new Consumer() { // from class: com.kubi.futures.trade.position.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionAggregateManager.m27731s(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionAggregateManager.m27732t(this.f24132b, z11, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionAggregateManager.m27733u(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f24185d);
        Observable<OrdersPageEntityWrapper> observableSubscribeOn2 = multiBizFacadeManager.m20275r(this.f24188g).mo96063a0(z11, null).subscribeOn(C42916f.m94127f());
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionAggregateManager.m27734v(this.f24151b, z11, (OrdersPageEntityWrapper) obj);
            }
        };
        Consumer<? super OrdersPageEntityWrapper> consumer2 = new Consumer() { // from class: com.kubi.futures.trade.position.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionAggregateManager.m27735w(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.position.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionAggregateManager.m27736x(this.f24168b, z11, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableSubscribeOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.futures.trade.position.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesPositionAggregateManager.m27737y(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, this.f24185d);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m27730r(FuturesPositionAggregateManager futuresPositionAggregateManager, boolean z11, List list) {
        Intrinsics.checkNotNull(list);
        futuresPositionAggregateManager.m27740k(z11, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m27731s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m27732t(FuturesPositionAggregateManager futuresPositionAggregateManager, boolean z11, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        futuresPositionAggregateManager.m27739j("positions", th2, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m27733u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m27734v(FuturesPositionAggregateManager futuresPositionAggregateManager, boolean z11, OrdersPageEntityWrapper ordersPageEntityWrapper) {
        futuresPositionAggregateManager.m27741l(z11, ordersPageEntityWrapper.getPageEntity().getItems());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m27735w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m27736x(FuturesPositionAggregateManager futuresPositionAggregateManager, boolean z11, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        futuresPositionAggregateManager.m27739j("advanceOrders", th2, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final void m27737y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m27738i(OrderEntity orderEntity, PositionEntity positionEntity) {
        if (C41014a.m89922G(positionEntity.getCurrentQty(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            return Intrinsics.areEqual(orderEntity.getStop(), "up");
        }
        return Intrinsics.areEqual(orderEntity.getStop(), "down");
    }

    public /* synthetic */ FuturesPositionAggregateManager(Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function1);
    }
}
