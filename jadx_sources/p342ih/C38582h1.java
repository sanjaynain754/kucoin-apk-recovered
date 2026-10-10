package p342ih;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.market.model.MarkPriceEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import com.kubi.kumex.data.trade.model.CrossOrderOfSymbol;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.Log;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.processors.BehaviorProcessor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p560qh.C43742b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sh0.InterfaceC44418d;

/* JADX INFO: renamed from: ih.h1 */
/* JADX INFO: compiled from: CrossBalancesObserver.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003J\u0010\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u001e\u0010 \u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u001e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/service/CrossBalancesObserver;", "", "observable", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "<init>", "(Lio/reactivex/Observable;)V", "tag", "", "lock", "balancesProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "balances", "", "balancesDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "markPriceDisposable", "observerBalances", "subscribeBalances", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "offer", "", "getList", "current", "isValidCrossHedgeQtyMarginOfSymbol", "", "hedgeMargin", "Lcom/kubi/kumex/data/trade/model/CrossOrderOfSymbol;", "subscribeMarkPrices", "symbols", "doSubscribeMarkPrices", "processMarkPriceChanged", "any", "doSingleMarkPriceChanged", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/MarkPriceEntity;", "calculatePositionChangedByMarkPrice", "crossOrder", "markPrice", "Ljava/math/BigDecimal;", "unSubscribeMarkPrice", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossBalancesObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossBalancesObserver.kt\ncom/kubi/futures/classic/cross/service/CrossBalancesObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1869#2:218\n1869#2,2:219\n1870#2:221\n1869#2,2:222\n*S KotlinDebug\n*F\n+ 1 CrossBalancesObserver.kt\ncom/kubi/futures/classic/cross/service/CrossBalancesObserver\n*L\n101#1:218\n102#1:219,2\n101#1:221\n156#1:222,2\n*E\n"})
public final class C38582h1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Observable<List<SimpleBalanceEntity>> f86572a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f86573b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Object f86574c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BehaviorProcessor<List<SimpleBalanceEntity>> f86575d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<SimpleBalanceEntity> f86576e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public CompositeDisposable f86577f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public CompositeDisposable f86578g;

    public C38582h1(@NotNull Observable<List<SimpleBalanceEntity>> observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        this.f86572a = observable;
        this.f86573b = "CrossBalancesObserver";
        this.f86574c = new Object();
        this.f86576e = new ArrayList();
        this.f86577f = new CompositeDisposable();
        this.f86578g = new CompositeDisposable();
    }

    /* JADX INFO: renamed from: F */
    public static final void m87179F(C38582h1 c38582h1) {
        c38582h1.f86576e.clear();
        c38582h1.m87207K();
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m87180G(C38582h1 c38582h1, List list) {
        synchronized (c38582h1.f86576e) {
            try {
                c38582h1.f86576e.clear();
                List<SimpleBalanceEntity> list2 = c38582h1.f86576e;
                Intrinsics.checkNotNull(list);
                list2.addAll(list);
                c38582h1.m87203B(c38582h1.f86576e);
                List<String> listM87211t = c38582h1.m87211t(c38582h1.f86576e);
                if (listM87211t.isEmpty()) {
                    c38582h1.m87207K();
                } else {
                    c38582h1.m87206J(listM87211t);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m87182I(C38582h1 c38582h1, Throwable th2) {
        BehaviorProcessor<List<SimpleBalanceEntity>> behaviorProcessor = c38582h1.f86575d;
        if (behaviorProcessor != null) {
            behaviorProcessor.onError(th2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m87199w(C38582h1 c38582h1, InterfaceC44418d interfaceC44418d) {
        c38582h1.f86577f.add(c38582h1.m87205D());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m87203B(List<SimpleBalanceEntity> list) {
        BehaviorProcessor<List<SimpleBalanceEntity>> behaviorProcessor = this.f86575d;
        if (behaviorProcessor == null) {
            C37214b.m83257c("positionProcessor is null", this.f86573b);
        } else {
            if (behaviorProcessor.offer(CollectionsKt.toMutableList((Collection) list))) {
                return;
            }
            C37214b.m83257c("processor is full，下游消费不及时", this.f86573b);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m87204C(Object obj) {
        boolean zM87209o;
        synchronized (this.f86576e) {
            try {
                if (obj instanceof MarkPriceEntity) {
                    zM87209o = m87209o((MarkPriceEntity) obj, this.f86576e);
                } else {
                    boolean z11 = false;
                    if (obj instanceof List) {
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            if (m87209o((MarkPriceEntity) it.next(), this.f86576e) && !z11) {
                                z11 = true;
                            }
                        }
                    } else {
                        Log.f30813a.m36617c(this.f86573b, "订单数量为0");
                    }
                    zM87209o = z11;
                }
                if (zM87209o) {
                    Log.f30813a.m36615a(this.f86573b, "标记价格发生变化，刷新订单");
                    m87203B(this.f86576e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final Disposable m87205D() {
        Observable<List<SimpleBalanceEntity>> observableDoFinally = this.f86572a.doFinally(new Action() { // from class: ih.c1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C38582h1.m87179F(this.f86561b);
            }
        });
        final Function1 function1 = new Function1() { // from class: ih.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38582h1.m87180G(this.f86563b, (List) obj);
            }
        };
        Consumer<? super List<SimpleBalanceEntity>> consumer = new Consumer() { // from class: ih.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38582h1.m87181H(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ih.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38582h1.m87182I(this.f86568b, (Throwable) obj);
            }
        };
        return observableDoFinally.subscribe(consumer, new Consumer() { // from class: ih.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38582h1.m87178E(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m87206J(List<String> list) {
        synchronized (this.f86574c) {
            m87207K();
            this.f86578g.add(m87210p(list));
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m87207K() {
        synchronized (this.f86574c) {
            this.f86578g.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: p */
    public final Disposable m87210p(List<String> list) {
        Observable<Object> observableSubscribeOn = RepositoryServiceLocator.f19236a.m20286e().mo24806f(list).subscribeOn(C42916f.m94127f());
        Consumer<? super Object> consumer = new Consumer() { // from class: ih.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38582h1.m87196q(this.f86609b, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: ih.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38582h1.m87197r((Throwable) obj);
            }
        };
        return observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: ih.x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38582h1.m87198s(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final List<String> m87211t(List<SimpleBalanceEntity> list) {
        Set<Map.Entry<String, CrossOrderOfSymbol>> setEntrySet;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CrossHedgeQtyMargin hedgeQtyMargin = ((SimpleBalanceEntity) it.next()).getHedgeQtyMargin();
            if (hedgeQtyMargin != null && (setEntrySet = hedgeQtyMargin.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                    if (!m87212u((CrossOrderOfSymbol) value)) {
                        Object key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                        arrayList.add(key);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public static final void m87177A(C38582h1 c38582h1) {
        c38582h1.m87207K();
        c38582h1.f86577f.clear();
    }

    /* JADX INFO: renamed from: E */
    public static final void m87178E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static final void m87181H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m87196q(C38582h1 c38582h1, Object obj) {
        Intrinsics.checkNotNull(obj);
        c38582h1.m87204C(obj);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m87197r(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "PositionMarkPriceObserver-observeMarkPrices");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m87198s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m87200x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m87201y(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "CrossBalancesObserver-observerBalances");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m87202z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m87208n(CrossOrderOfSymbol crossOrderOfSymbol, BigDecimal bigDecimal) {
        if (C27039d.m66656p(crossOrderOfSymbol.getMarkPrice()).compareTo(bigDecimal) == 0) {
            Log.f30813a.m36615a(this.f86573b, "前后标记价格一样直接返回，不进行计算");
            return false;
        }
        crossOrderOfSymbol.setMarkPrice(bigDecimal);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m87209o(MarkPriceEntity markPriceEntity, List<SimpleBalanceEntity> list) {
        CrossOrderOfSymbol crossOrderOfSymbol;
        String symbol = markPriceEntity.getSymbol();
        BigDecimal price = markPriceEntity.getPrice();
        int size = list.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            CrossHedgeQtyMargin hedgeQtyMargin = list.get(i11).getHedgeQtyMargin();
            if (hedgeQtyMargin != null && (crossOrderOfSymbol = hedgeQtyMargin.get((Object) symbol)) != null && m87208n(crossOrderOfSymbol, C27039d.m66656p(price)) && !z11) {
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m87212u(CrossOrderOfSymbol crossOrderOfSymbol) {
        BigDecimal bigDecimalM66656p = C27039d.m66656p(crossOrderOfSymbol.getAskOrderSize());
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (C17054k0.m36528b(bigDecimalM66656p, bigDecimal) && C17054k0.m36528b(C27039d.m66656p(crossOrderOfSymbol.getBidOrderSize()), bigDecimal) && C17054k0.m36528b(C27039d.m66656p(crossOrderOfSymbol.getAskOrderCost()), bigDecimal) && C17054k0.m36528b(C27039d.m66656p(crossOrderOfSymbol.getBidOrderCost()), bigDecimal)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final Observable<List<SimpleBalanceEntity>> m87213v() {
        BehaviorProcessor<List<SimpleBalanceEntity>> behaviorProcessorCreate = BehaviorProcessor.create();
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorCreate, "create(...)");
        this.f86575d = behaviorProcessorCreate;
        Flowable<List<SimpleBalanceEntity>> flowableThrottleLatest = behaviorProcessorCreate.throttleLatest(1L, TimeUnit.SECONDS, C43742b.m96366a());
        final Function1 function1 = new Function1() { // from class: ih.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38582h1.m87199w(this.f86599b, (InterfaceC44418d) obj);
            }
        };
        Flowable<List<SimpleBalanceEntity>> flowableDoOnSubscribe = flowableThrottleLatest.doOnSubscribe(new Consumer() { // from class: ih.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38582h1.m87200x(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: ih.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38582h1.m87201y((Throwable) obj);
            }
        };
        Observable<List<SimpleBalanceEntity>> observable = flowableDoOnSubscribe.doOnError(new Consumer() { // from class: ih.a1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38582h1.m87202z(function2, obj);
            }
        }).doFinally(new Action() { // from class: ih.b1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C38582h1.m87177A(this.f86559b);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }
}
