package com.kubi.spot.helper;

import android.annotation.SuppressLint;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.ThemisUtils;
import com.kubi.utils.extensions.C27041f;
import e20.InterfaceC37053d;
import g10.C37787r;
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

/* JADX INFO: renamed from: com.kubi.spot.helper.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderBookHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020%J\b\u0010(\u001a\u00020\u0005H\u0002J\u000e\u0010)\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010*\u001a\u0004\u0018\u00010 J\u0006\u0010+\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u0010¨\u0006,"}, m90084d2 = {"Lcom/kubi/spot/helper/OrderBookHelper;", "", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "symbol", "", "precision", "", "dataCallBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/OrderBookEntity;", "<init>", "(Lcom/kubi/sdk/websocket/WsDataHelper;Ljava/lang/String;ILio/reactivex/functions/Consumer;)V", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getPrecision", "()I", "setPrecision", "(I)V", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "srcOrderEntity", "subscribe", "Lio/reactivex/disposables/Disposable;", "topic", "getTopic", "topic$delegate", "release", "", "resetSymbolAndPrecision", "getRestfulOrderBookData", "getCurrentSymbols", "changePrecision", "registerOrderBookData", "disposeOrderBookData", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public final class OrderBookHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37787r f50564a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f50565b;

    /* JADX INFO: renamed from: c */
    public int f50566c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Consumer<OrderBookEntity> f50567d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f50568e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public OrderBookEntity f50569f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Disposable f50570g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f50571h;

    /* JADX INFO: renamed from: com.kubi.spot.helper.d0$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OrderBookHelper.kt\ncom/kubi/spot/helper/OrderBookHelper\n*L\n1#1,328:1\n73#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.helper.d0$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OrderBookHelper.kt\ncom/kubi/spot/helper/OrderBookHelper\n*L\n1#1,328:1\n75#2:329\n*E\n"})
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
        this.f50564a = wsDataHelper;
        this.f50565b = str;
        this.f50566c = i11;
        this.f50567d = dataCallBack;
        this.f50568e = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.helper.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookHelper.m61785z();
            }
        });
        this.f50569f = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        this.f50571h = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.helper.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookHelper.m61765I();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final Observable m61760B(OrderBookHelper orderBookHelper) {
        return orderBookHelper.f50564a.m85233f(orderBookHelper.m61794y(), orderBookHelper.m61791p());
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m61761C(OrderBookHelper orderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        orderBookHelper.f50569f.setSequence(orderBookEntity.getSequence());
        orderBookHelper.f50569f.setAsks(orderBookEntity.getAsks());
        orderBookHelper.f50569f.setBids(orderBookEntity.getBids());
        orderBookHelper.f50569f.setTimestamp(orderBookEntity.getTimestamp());
        orderBookHelper.f50567d.accept(orderBookHelper.f50569f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m61763E(Throwable th2) {
        C44128b.m97263g("OrderBookHelper", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final String m61765I() {
        return ThemisUtils.f54260a.m66413b() ? "/spotMarket/level2Depth50_1s:%s" : "/spotMarket/level2Depth50:%s";
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m61779s(OrderBookHelper orderBookHelper, OrderBookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSequence() >= orderBookHelper.f50569f.getSequence();
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m61780t(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final Disposable m61786A() {
        Disposable disposable = this.f50570g;
        if (disposable != null) {
            disposable.dispose();
        }
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        String strM66668h = C27041f.m66668h(this.f50565b);
        int i11 = this.f50566c;
        ThemisUtils themisUtils = ThemisUtils.f54260a;
        Observable observableObserveOn = SpotMarketSocketAdapter.m32628Q(spotMarketSocketAdapter, strM66668h, i11, themisUtils.m66413b(), false, new Function0() { // from class: com.kubi.spot.helper.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookHelper.m61760B(this.f50607b);
            }
        }, 8, null).throttleLatest(themisUtils.m66413b() ? 1000L : 100L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.helper.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderBookHelper.m61761C(this.f50609b, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.helper.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderBookHelper.m61762D(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.helper.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderBookHelper.m61763E((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.helper.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderBookHelper.m61764F(function2, obj);
            }
        });
        this.f50570g = disposableSubscribe;
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: G */
    public final void m61787G(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f50569f.clear(C27041f.m66668h(symbol));
        this.f50567d.accept(this.f50569f);
    }

    /* JADX INFO: renamed from: H */
    public final void m61788H(@Nullable String str, int i11) {
        Disposable disposable = this.f50570g;
        if (disposable != null) {
            disposable.dispose();
        }
        String str2 = this.f50565b;
        if (str2 != null && !Intrinsics.areEqual(str2, str)) {
            C37787r c37787r = this.f50564a;
            String str3 = String.format(m61794y(), Arrays.copyOf(new Object[]{m61791p()}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            c37787r.m85237j(str3);
        }
        this.f50565b = str;
        this.f50566c = i11;
    }

    /* JADX INFO: renamed from: n */
    public final void m61789n(int i11) {
        this.f50569f.clear(C27041f.m66668h(this.f50565b));
        this.f50567d.accept(this.f50569f);
        boolean zM32662Y = SpotMarketSocketAdapter.f28144a.m32662Y();
        if (zM32662Y) {
            Disposable disposable = this.f50570g;
            if (disposable != null) {
                disposable.dispose();
            }
        } else {
            C37787r c37787r = this.f50564a;
            String str = String.format(m61794y(), Arrays.copyOf(new Object[]{m61791p()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            c37787r.m85237j(str);
        }
        this.f50566c = i11;
        m61793r();
        if (zM32662Y) {
            m61786A();
            return;
        }
        C37787r c37787r2 = this.f50564a;
        String str2 = String.format(m61794y(), Arrays.copyOf(new Object[]{m61791p()}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        c37787r2.m85235h(str2);
    }

    /* JADX INFO: renamed from: o */
    public final void m61790o() {
        Disposable disposable = this.f50570g;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f50570g = null;
    }

    /* JADX INFO: renamed from: p */
    public final String m61791p() {
        if (ThemisUtils.f54260a.m66413b()) {
            return C27041f.m66668h(this.f50565b);
        }
        return C27041f.m66668h(this.f50565b) + '_' + this.f50566c;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC37053d m61792q() {
        return (InterfaceC37053d) this.f50568e.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final String m61794y() {
        return (String) this.f50571h.getValue();
    }

    /* JADX INFO: renamed from: D */
    public static final void m61762D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final void m61764F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m61781u(OrderBookHelper orderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        List<double[]> mutableList;
        List listSortedWith;
        List listSortedWith2;
        Intrinsics.checkNotNull(orderBookEntity);
        orderBookHelper.f50569f = orderBookEntity;
        List<double[]> asks = orderBookEntity.getAsks();
        List<double[]> mutableList2 = null;
        if (asks != null && (listSortedWith2 = CollectionsKt.sortedWith(asks, new a())) != null) {
            mutableList = CollectionsKt.toMutableList((Collection) listSortedWith2);
        } else {
            mutableList = null;
        }
        orderBookEntity.setAsks(mutableList);
        OrderBookEntity orderBookEntity2 = orderBookHelper.f50569f;
        List<double[]> bids = orderBookEntity2.getBids();
        if (bids != null && (listSortedWith = CollectionsKt.sortedWith(bids, new b())) != null) {
            mutableList2 = CollectionsKt.toMutableList((Collection) listSortedWith);
        }
        orderBookEntity2.setBids(mutableList2);
        orderBookHelper.f50567d.accept(orderBookHelper.f50569f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m61782v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m61783w(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m61784x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC37053d m61785z() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: r */
    public final void m61793r() {
        Observable observableObserveOn;
        Observable observableCompose = InterfaceC37053d.m82915T(m61792q(), C27041f.m66668h(this.f50565b), null, String.valueOf(this.f50566c), 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.helper.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OrderBookHelper.m61779s(this.f50612b, (OrderBookEntity) obj));
            }
        };
        Observable observableObserveOn2 = observableCompose.filter(new Predicate() { // from class: com.kubi.spot.helper.z
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return OrderBookHelper.m61780t(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        if (observableObserveOn2 != null && (observableObserveOn = observableObserveOn2.observeOn(AndroidSchedulers.mainThread())) != null) {
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.helper.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderBookHelper.m61781u(this.f50550b, (OrderBookEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.helper.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OrderBookHelper.m61782v(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.helper.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderBookHelper.m61783w((Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.helper.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OrderBookHelper.m61784x(function3, obj);
                }
            });
        }
    }
}
