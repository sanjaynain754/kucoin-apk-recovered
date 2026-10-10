package com.kubi.core.spot.helper;

import android.annotation.SuppressLint;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.ThemisUtils;
import com.kubi.utils.extensions.C27041f;
import g10.C37787r;
import ge.InterfaceC37872b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.core.spot.helper.w, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderBookHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020%J\b\u0010(\u001a\u00020\u0005H\u0002J\u000e\u0010)\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010*\u001a\u0004\u0018\u00010 J\u0006\u0010+\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u0010¨\u0006,"}, m90084d2 = {"Lcom/kubi/core/spot/helper/OrderBookHelper;", "", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "symbol", "", "precision", "", "dataCallBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/OrderBookEntity;", "<init>", "(Lcom/kubi/sdk/websocket/WsDataHelper;Ljava/lang/String;ILio/reactivex/functions/Consumer;)V", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getPrecision", "()I", "setPrecision", "(I)V", "mApi", "Lcom/kubi/core/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/core/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "srcOrderEntity", "subscribe", "Lio/reactivex/disposables/Disposable;", "topic", "getTopic", "topic$delegate", "release", "", "resetSymbolAndPrecision", "getRestfulOrderBookData", "getCurrentSymbols", "changePrecision", "registerOrderBookData", "disposeOrderBookData", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public final class OrderBookHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37787r f21255a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f21256b;

    /* JADX INFO: renamed from: c */
    public int f21257c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Consumer<OrderBookEntity> f21258d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f21259e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public OrderBookEntity f21260f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Disposable f21261g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f21262h;

    /* JADX INFO: renamed from: com.kubi.core.spot.helper.w$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OrderBookHelper.kt\ncom/kubi/core/spot/helper/OrderBookHelper\n*L\n1#1,328:1\n70#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.helper.w$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OrderBookHelper.kt\ncom/kubi/core/spot/helper/OrderBookHelper\n*L\n1#1,328:1\n72#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    public OrderBookHelper(@NotNull C37787r wsDataHelper, @Nullable String str, int i11, @NotNull Consumer<OrderBookEntity> dataCallBack) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        Intrinsics.checkNotNullParameter(dataCallBack, "dataCallBack");
        this.f21255a = wsDataHelper;
        this.f21256b = str;
        this.f21257c = i11;
        this.f21258d = dataCallBack;
        this.f21259e = LazyKt.lazy(new Function0() { // from class: com.kubi.core.spot.helper.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookHelper.m23349z();
            }
        });
        this.f21260f = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        this.f21262h = LazyKt.lazy(new Function0() { // from class: com.kubi.core.spot.helper.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookHelper.m23329I();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final Observable m23324B(OrderBookHelper orderBookHelper) {
        return orderBookHelper.f21255a.m85233f(orderBookHelper.m23358y(), orderBookHelper.m23355p());
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m23325C(OrderBookHelper orderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        orderBookHelper.f21260f.setSequence(orderBookEntity.getSequence());
        orderBookHelper.f21260f.setAsks(orderBookEntity.getAsks());
        orderBookHelper.f21260f.setBids(orderBookEntity.getBids());
        orderBookHelper.f21260f.setTimestamp(orderBookEntity.getTimestamp());
        orderBookHelper.f21258d.accept(orderBookHelper.f21260f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m23327E(Throwable th2) {
        C44128b.m97263g("OrderBookHelper", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final String m23329I() {
        return ThemisUtils.f54260a.m66413b() ? "/spotMarket/level2Depth50_1s:%s" : "/spotMarket/level2Depth50:%s";
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m23343s(OrderBookHelper orderBookHelper, OrderBookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSequence() >= orderBookHelper.f21260f.getSequence();
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m23344t(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m23345u(OrderBookHelper orderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        List listSortedWith;
        List listSortedWith2;
        String strM66668h = C27041f.m66668h(orderBookHelper.f21256b);
        Intrinsics.checkNotNull(orderBookEntity);
        OrderBookEntity orderBookEntityM23359a = C12457x.m23359a(strM66668h, orderBookEntity);
        if (orderBookEntityM23359a == null) {
            return Unit.INSTANCE;
        }
        orderBookHelper.f21260f = orderBookEntityM23359a;
        List<double[]> asks = orderBookEntityM23359a.getAsks();
        List<double[]> mutableList = null;
        orderBookEntityM23359a.setAsks((asks == null || (listSortedWith2 = CollectionsKt.sortedWith(asks, new a())) == null) ? null : CollectionsKt.toMutableList((Collection) listSortedWith2));
        OrderBookEntity orderBookEntity2 = orderBookHelper.f21260f;
        List<double[]> bids = orderBookEntity2.getBids();
        if (bids != null && (listSortedWith = CollectionsKt.sortedWith(bids, new b())) != null) {
            mutableList = CollectionsKt.toMutableList((Collection) listSortedWith);
        }
        orderBookEntity2.setBids(mutableList);
        orderBookHelper.f21258d.accept(orderBookHelper.f21260f);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final Disposable m23350A() {
        Disposable disposable = this.f21261g;
        if (disposable != null) {
            disposable.dispose();
        }
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        String strM66668h = C27041f.m66668h(this.f21256b);
        int i11 = this.f21257c;
        ThemisUtils themisUtils = ThemisUtils.f54260a;
        Observable observableObserveOn = SpotMarketSocketAdapter.m32628Q(spotMarketSocketAdapter, strM66668h, i11, themisUtils.m66413b(), false, new Function0() { // from class: com.kubi.core.spot.helper.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookHelper.m23324B(this.f21252b);
            }
        }, 8, null).throttleLatest(themisUtils.m66413b() ? 1000L : 100L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.helper.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderBookHelper.m23325C(this.f21253b, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.core.spot.helper.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderBookHelper.m23326D(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.core.spot.helper.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderBookHelper.m23327E((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.spot.helper.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderBookHelper.m23328F(function2, obj);
            }
        });
        this.f21261g = disposableSubscribe;
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: G */
    public final void m23351G(@NotNull String symbol) throws Exception {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f21260f.clear(C27041f.m66668h(symbol));
        this.f21258d.accept(this.f21260f);
    }

    /* JADX INFO: renamed from: H */
    public final void m23352H(@Nullable String str, int i11) {
        Disposable disposable = this.f21261g;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f21256b = str;
        this.f21257c = i11;
    }

    /* JADX INFO: renamed from: n */
    public final void m23353n(int i11) throws Exception {
        this.f21260f.clear(C27041f.m66668h(this.f21256b));
        this.f21258d.accept(this.f21260f);
        boolean zM32662Y = SpotMarketSocketAdapter.f28144a.m32662Y();
        if (zM32662Y) {
            Disposable disposable = this.f21261g;
            if (disposable != null) {
                disposable.dispose();
            }
        } else {
            C37787r c37787r = this.f21255a;
            String str = String.format(m23358y(), Arrays.copyOf(new Object[]{m23355p()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            c37787r.m85237j(str);
        }
        this.f21257c = i11;
        m23357r();
        if (zM32662Y) {
            m23350A();
            return;
        }
        C37787r c37787r2 = this.f21255a;
        String str2 = String.format(m23358y(), Arrays.copyOf(new Object[]{m23355p()}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        c37787r2.m85235h(str2);
    }

    /* JADX INFO: renamed from: o */
    public final void m23354o() {
        Disposable disposable = this.f21261g;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f21261g = null;
    }

    /* JADX INFO: renamed from: p */
    public final String m23355p() {
        if (ThemisUtils.f54260a.m66413b()) {
            return C27041f.m66668h(this.f21256b);
        }
        return C27041f.m66668h(this.f21256b) + '_' + this.f21257c;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC37872b m23356q() {
        return (InterfaceC37872b) this.f21259e.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final String m23358y() {
        return (String) this.f21262h.getValue();
    }

    /* JADX INFO: renamed from: D */
    public static final void m23326D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final void m23328F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    public static final void m23346v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m23347w(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m23348x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC37872b m23349z() {
        return (InterfaceC37872b) C42597a.m93386b().create(InterfaceC37872b.class);
    }

    /* JADX INFO: renamed from: r */
    public final void m23357r() {
        Observable observableObserveOn;
        Observable observableCompose = InterfaceC37872b.m85490e(m23356q(), C27041f.m66668h(this.f21256b), null, String.valueOf(this.f21257c), 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.helper.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OrderBookHelper.m23343s(this.f21246b, (OrderBookEntity) obj));
            }
        };
        Observable observableObserveOn2 = observableCompose.filter(new Predicate() { // from class: com.kubi.core.spot.helper.n
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return OrderBookHelper.m23344t(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        if (observableObserveOn2 != null && (observableObserveOn = observableObserveOn2.observeOn(AndroidSchedulers.mainThread())) != null) {
            final Function1 function2 = new Function1() { // from class: com.kubi.core.spot.helper.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderBookHelper.m23345u(this.f21249b, (OrderBookEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.core.spot.helper.p
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OrderBookHelper.m23346v(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.core.spot.helper.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderBookHelper.m23347w((Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.spot.helper.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OrderBookHelper.m23348x(function3, obj);
                }
            });
        }
    }
}
