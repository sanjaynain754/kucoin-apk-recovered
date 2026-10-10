package p568qp;

import android.annotation.SuppressLint;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.margin.trade.submit.MarginOrderTypeConfig;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.ThemisUtils;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import g10.C37787r;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p768xo.InterfaceC46307h;
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

/* JADX INFO: renamed from: qp.n */
/* JADX INFO: compiled from: MarginOrderBookHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020%J\b\u0010'\u001a\u00020\u0005H\u0002J\u000e\u0010(\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010)\u001a\u0004\u0018\u00010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u0010¨\u0006*"}, m90084d2 = {"Lcom/kubi/margin/trade/helper/MarginOrderBookHelper;", "", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "symbol", "", "precision", "", "dataCallBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/OrderBookEntity;", "<init>", "(Lcom/kubi/sdk/websocket/WsDataHelper;Ljava/lang/String;ILio/reactivex/functions/Consumer;)V", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getPrecision", "()I", "setPrecision", "(I)V", "mApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/margin/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "srcOrderEntity", "subscribe", "Lio/reactivex/disposables/Disposable;", "topic", "getTopic", "topic$delegate", "release", "", "getRestfulOrderBookData", "getCurrentSymbols", "changePrecision", "registerOrderBookData", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public final class C43834n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37787r f96898a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f96899b;

    /* JADX INFO: renamed from: c */
    public int f96900c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Consumer<OrderBookEntity> f96901d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f96902e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public OrderBookEntity f96903f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Disposable f96904g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f96905h;

    /* JADX INFO: renamed from: qp.n$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginOrderBookHelper.kt\ncom/kubi/margin/trade/helper/MarginOrderBookHelper\n*L\n1#1,328:1\n63#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: qp.n$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginOrderBookHelper.kt\ncom/kubi/margin/trade/helper/MarginOrderBookHelper\n*L\n1#1,328:1\n65#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    public C43834n(@NotNull C37787r wsDataHelper, @Nullable String str, int i11, @NotNull Consumer<OrderBookEntity> dataCallBack) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        Intrinsics.checkNotNullParameter(dataCallBack, "dataCallBack");
        this.f96898a = wsDataHelper;
        this.f96899b = str;
        this.f96900c = i11;
        this.f96901d = dataCallBack;
        this.f96902e = LazyKt.lazy(new Function0() { // from class: qp.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43834n.m96526y();
            }
        });
        this.f96903f = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        this.f96905h = LazyKt.lazy(new Function0() { // from class: qp.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43834n.m96506G();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Observable m96501A(C43834n c43834n) {
        return c43834n.f96898a.m85233f(c43834n.m96532x(), c43834n.m96529o());
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m96502B(C43834n c43834n, OrderBookEntity orderBookEntity) throws Exception {
        c43834n.f96903f.setSequence(orderBookEntity.getSequence());
        c43834n.f96903f.setAsks(orderBookEntity.getAsks());
        c43834n.f96903f.setBids(orderBookEntity.getBids());
        c43834n.f96903f.setTimestamp(orderBookEntity.getTimestamp());
        c43834n.f96901d.accept(c43834n.f96903f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final String m96506G() {
        return ThemisUtils.f54260a.m66413b() ? "/spotMarket/level2Depth50_1s:%s" : "/spotMarket/level2Depth50:%s";
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m96520r(C43834n c43834n, OrderBookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSequence() >= c43834n.f96903f.getSequence();
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m96521s(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F */
    public final void m96527F(@NotNull String symbol, int i11) throws Exception {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Disposable disposable = this.f96904g;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f96899b = symbol;
        this.f96900c = i11;
        this.f96903f.clear(C27041f.m66668h(symbol));
        this.f96901d.accept(this.f96903f);
    }

    /* JADX INFO: renamed from: n */
    public final void m96528n(int i11) throws Exception {
        this.f96903f.clear(C27041f.m66668h(this.f96899b));
        this.f96901d.accept(this.f96903f);
        boolean zM32662Y = SpotMarketSocketAdapter.f28144a.m32662Y();
        if (zM32662Y) {
            Disposable disposable = this.f96904g;
            if (disposable != null) {
                disposable.dispose();
            }
        } else {
            this.f96898a.m85237j(DowngradeExKt.m66551u(m96532x(), new Object[]{m96529o()}, null, 2, null));
        }
        this.f96900c = i11;
        m96531q();
        if (zM32662Y) {
            m96533z();
        } else {
            this.f96898a.m85235h(DowngradeExKt.m66551u(m96532x(), new Object[]{m96529o()}, null, 2, null));
        }
    }

    /* JADX INFO: renamed from: o */
    public final String m96529o() {
        if (ThemisUtils.f54260a.m66413b()) {
            return C27041f.m66668h(this.f96899b);
        }
        return C27041f.m66668h(this.f96899b) + '_' + this.f96900c;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC46307h m96530p() {
        return (InterfaceC46307h) this.f96902e.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final String m96532x() {
        return (String) this.f96905h.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Disposable m96533z() {
        Disposable disposable = this.f96904g;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable observableObserveOn = SpotMarketSocketAdapter.m32628Q(SpotMarketSocketAdapter.f28144a, C27041f.m66668h(this.f96899b), this.f96900c, ThemisUtils.f54260a.m66413b(), false, new Function0() { // from class: qp.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43834n.m96501A(this.f96889b);
            }
        }, 8, null).throttleLatest(MarginOrderTypeConfig.a.e(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: qp.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43834n.m96502B(this.f96891b, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: qp.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43834n.m96503C(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: qp.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43834n.m96504D((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: qp.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43834n.m96505E(function2, obj);
            }
        });
        this.f96904g = disposableSubscribe;
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: C */
    public static final void m96503C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m96504D(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final void m96505E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m96522t(C43834n c43834n, OrderBookEntity orderBookEntity) throws Exception {
        List<double[]> mutableList;
        List listSortedWith;
        List listSortedWith2;
        Intrinsics.checkNotNull(orderBookEntity);
        c43834n.f96903f = orderBookEntity;
        List<double[]> asks = orderBookEntity.getAsks();
        List<double[]> mutableList2 = null;
        if (asks != null && (listSortedWith2 = CollectionsKt.sortedWith(asks, new a())) != null) {
            mutableList = CollectionsKt.toMutableList((Collection) listSortedWith2);
        } else {
            mutableList = null;
        }
        orderBookEntity.setAsks(mutableList);
        OrderBookEntity orderBookEntity2 = c43834n.f96903f;
        List<double[]> bids = orderBookEntity2.getBids();
        if (bids != null && (listSortedWith = CollectionsKt.sortedWith(bids, new b())) != null) {
            mutableList2 = CollectionsKt.toMutableList((Collection) listSortedWith);
        }
        orderBookEntity2.setBids(mutableList2);
        c43834n.f96901d.accept(c43834n.f96903f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m96523u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m96524v(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m96525w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC46307h m96526y() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: q */
    public final void m96531q() {
        Observable observableObserveOn;
        Observable observableCompose = InterfaceC46307h.m102116h(m96530p(), C27041f.m66668h(this.f96899b), null, String.valueOf(this.f96900c), 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: qp.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C43834n.m96520r(this.f96894b, (OrderBookEntity) obj));
            }
        };
        Observable observableObserveOn2 = observableCompose.filter(new Predicate() { // from class: qp.j
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C43834n.m96521s(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        if (observableObserveOn2 != null && (observableObserveOn = observableObserveOn2.observeOn(AndroidSchedulers.mainThread())) != null) {
            final Function1 function2 = new Function1() { // from class: qp.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43834n.m96522t(this.f96896b, (OrderBookEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: qp.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C43834n.m96523u(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: qp.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43834n.m96524v((Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer, new Consumer() { // from class: qp.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C43834n.m96525w(function3, obj);
                }
            });
        }
    }
}
