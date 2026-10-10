package com.kubi.kucoin.manager;

import com.kubi.data.entity.OrderBookEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.p0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotMarketSocketAdapter.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u001aJ2\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001d0\u001aJB\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u001aJ:\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u001aR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006$"}, m90084d2 = {"Lcom/kubi/kucoin/manager/SpotMarketSocketAdapter;", "", "<init>", "()V", "pbWsApi", "Lcom/kubi/kucoin/manager/ISpotMarketPbWsApi;", "getPbWsApi", "()Lcom/kubi/kucoin/manager/ISpotMarketPbWsApi;", "pbWsApi$delegate", "Lkotlin/Lazy;", "isSocketProtobufMarketV2Enabled", "", "shouldUseAdaptedMatchSubscription", "shouldSubscribeLegacyCandleTopic", "shouldUseAdaptedCandleSubscription", "shouldRecreateOrderBookSubscriptionOnPrecisionChange", "shouldUseAdaptedContinuousOrderBook", "shouldUseAdaptedCallAuctionOrderBook", "lowDevice", "observeMatch", "Lio/reactivex/Observable;", "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", "symbol", "", "protobufEnabled", "legacyMessagesProvider", "Lkotlin/Function0;", "Lcom/kubi/network/websocket/model/Message;", "observeMatchFlow", "Lkotlinx/coroutines/flow/Flow;", "legacyFlowProvider", "observeOrderBook", "Lcom/kubi/data/entity/OrderBookEntity;", "precision", "", "observeCallAuctionOrderBook", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotMarketSocketAdapter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SpotMarketSocketAdapter f28144a = new SpotMarketSocketAdapter();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f28145b = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotMarketSocketAdapter.m32635X();
        }
    });

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Observable m32628Q(SpotMarketSocketAdapter spotMarketSocketAdapter, String str, int i11, boolean z11, boolean z12, Function0 function0, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z12 = SpotMarketPbWsApiKt.m32562m();
        }
        return spotMarketSocketAdapter.m32661P(str, i11, z11, z12, function0);
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m32615A(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m32616B(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public static final OrderBookEntity m32617C(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C15527s0.m32679k(C27041f.m66668h(str), C27041f.m66668h(it.getData()));
    }

    /* JADX INFO: renamed from: D */
    public static final OrderBookEntity m32618D(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderBookEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Observable m32619F(SpotMarketSocketAdapter spotMarketSocketAdapter, String str, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = SpotMarketPbWsApiKt.m32562m();
        }
        return spotMarketSocketAdapter.m32659E(str, z11, function0);
    }

    /* JADX INFO: renamed from: G */
    public static final Observable m32620G(String str) {
        InterfaceC41634e interfaceC41634eM90881E;
        Observable observableM91206c;
        InterfaceC41634e<SpotMatchPushEntity> interfaceC41634eM32556g = SpotMarketPbWsApiKt.m32556g(f28144a.m32666u(), C27041f.m66668h(str));
        if (interfaceC41634eM32556g != null && (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM32556g)) != null && (observableM91206c = RxConvertKt.m91206c(interfaceC41634eM90881E, C42911a.m94120b())) != null) {
            return observableM91206c;
        }
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m32622I(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m32623J(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public static final SpotMatchPushEntity m32624K(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C15527s0.m32678j(C27041f.m66668h(it.getData()));
    }

    /* JADX INFO: renamed from: L */
    public static final SpotMatchPushEntity m32625L(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SpotMatchPushEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ InterfaceC41634e m32626N(SpotMarketSocketAdapter spotMarketSocketAdapter, String str, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = SpotMarketPbWsApiKt.m32562m();
        }
        return spotMarketSocketAdapter.m32660M(str, z11, function0);
    }

    /* JADX INFO: renamed from: O */
    public static final InterfaceC41634e m32627O(String str) {
        InterfaceC41634e interfaceC41634eM90881E;
        InterfaceC41634e<SpotMatchPushEntity> interfaceC41634eM32556g = SpotMarketPbWsApiKt.m32556g(f28144a.m32666u(), C27041f.m66668h(str));
        return (interfaceC41634eM32556g == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM32556g)) == null) ? C41636g.m90879C() : interfaceC41634eM90881E;
    }

    /* JADX INFO: renamed from: R */
    public static final Observable m32629R(boolean z11, final String str, int i11, Function0 function0) {
        final String strM66551u = DowngradeExKt.m66551u(z11 ? "/spotMarket/level2Depth50_1s:%s" : "/spotMarket/level2Depth50:%s", new Object[]{C15527s0.m32672d(str, i11, z11)}, null, 2, null);
        Observable observable = (Observable) function0.invoke();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.manager.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SpotMarketSocketAdapter.m32633V(strM66551u, (Message) obj));
            }
        };
        Observable observableFilter = observable.filter(new Predicate() { // from class: com.kubi.kucoin.manager.m0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SpotMarketSocketAdapter.m32630S(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.manager.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotMarketSocketAdapter.m32631T(str, (Message) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.kucoin.manager.o0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpotMarketSocketAdapter.m32632U(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return C15527s0.m32673e(map);
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m32630S(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public static final OrderBookEntity m32631T(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C15527s0.m32679k(C27041f.m66668h(str), C27041f.m66668h(it.getData()));
    }

    /* JADX INFO: renamed from: U */
    public static final OrderBookEntity m32632U(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderBookEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m32633V(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: W */
    public static final Observable m32634W(String str, int i11, boolean z11) {
        Observable observableM91206c;
        InterfaceC41634e<OrderBookEntity> interfaceC41634eM32555f = SpotMarketPbWsApiKt.m32555f(f28144a.m32666u(), C27041f.m66668h(str), i11, z11);
        if (interfaceC41634eM32555f != null && (observableM91206c = RxConvertKt.m91206c(interfaceC41634eM32555f, C42911a.m94120b())) != null) {
            return observableM91206c;
        }
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Observable m32656x(SpotMarketSocketAdapter spotMarketSocketAdapter, String str, boolean z11, boolean z12, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = SpotMarketPbWsApiKt.m32562m();
        }
        return spotMarketSocketAdapter.m32668w(str, z11, z12, function0);
    }

    /* JADX INFO: renamed from: y */
    public static final Observable m32657y(String str) {
        Observable observableM91206c;
        InterfaceC41634e<OrderBookEntity> interfaceC41634eM32554e = SpotMarketPbWsApiKt.m32554e(f28144a.m32666u(), C27041f.m66668h(str));
        if (interfaceC41634eM32554e != null && (observableM91206c = RxConvertKt.m91206c(interfaceC41634eM32554e, C42911a.m94120b())) != null) {
            return observableM91206c;
        }
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: z */
    public static final Observable m32658z(boolean z11, final String str, Function0 function0) {
        final String strM66551u = DowngradeExKt.m66551u(z11 ? "/spotCallAuction/level2Second:%s" : "/spotCallAuction/level2:%s", new Object[]{C27041f.m66668h(str)}, null, 2, null);
        Observable observable = (Observable) function0.invoke();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.manager.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SpotMarketSocketAdapter.m32615A(strM66551u, (Message) obj));
            }
        };
        Observable observableFilter = observable.filter(new Predicate() { // from class: com.kubi.kucoin.manager.d0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SpotMarketSocketAdapter.m32616B(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.manager.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotMarketSocketAdapter.m32617C(str, (Message) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.kucoin.manager.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpotMarketSocketAdapter.m32618D(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return C15527s0.m32673e(map);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final Observable<SpotMatchPushEntity> m32659E(@NotNull final String symbol, boolean z11, @NotNull final Function0<? extends Observable<Message>> legacyMessagesProvider) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(legacyMessagesProvider, "legacyMessagesProvider");
        return C15527s0.m32681m(z11, new Function0() { // from class: com.kubi.kucoin.manager.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32620G(symbol);
            }
        }, new Function0() { // from class: com.kubi.kucoin.manager.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32621H(symbol, legacyMessagesProvider);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final InterfaceC41634e<SpotMatchPushEntity> m32660M(@NotNull final String symbol, boolean z11, @NotNull Function0<? extends InterfaceC41634e<SpotMatchPushEntity>> legacyFlowProvider) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(legacyFlowProvider, "legacyFlowProvider");
        return C15527s0.m32680l(z11, new Function0() { // from class: com.kubi.kucoin.manager.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32627O(symbol);
            }
        }, legacyFlowProvider);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final Observable<OrderBookEntity> m32661P(@NotNull final String symbol, final int i11, final boolean z11, boolean z12, @NotNull final Function0<? extends Observable<Message>> legacyMessagesProvider) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(legacyMessagesProvider, "legacyMessagesProvider");
        return C15527s0.m32681m(z12, new Function0() { // from class: com.kubi.kucoin.manager.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32634W(symbol, i11, z11);
            }
        }, new Function0() { // from class: com.kubi.kucoin.manager.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32629R(z11, symbol, i11, legacyMessagesProvider);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final ISpotMarketPbWsApi m32666u() {
        return (ISpotMarketPbWsApi) f28145b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final Observable<OrderBookEntity> m32668w(@NotNull final String symbol, final boolean z11, boolean z12, @NotNull final Function0<? extends Observable<Message>> legacyMessagesProvider) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(legacyMessagesProvider, "legacyMessagesProvider");
        return C15527s0.m32681m(z12 && !z11, new Function0() { // from class: com.kubi.kucoin.manager.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32657y(symbol);
            }
        }, new Function0() { // from class: com.kubi.kucoin.manager.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotMarketSocketAdapter.m32658z(z11, symbol, legacyMessagesProvider);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static final Observable m32621H(String str, Function0 function0) {
        final String strM66551u = DowngradeExKt.m66551u("/market/match:%s", new Object[]{str}, null, 2, null);
        Observable observable = (Observable) function0.invoke();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.manager.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SpotMarketSocketAdapter.m32622I(strM66551u, (Message) obj));
            }
        };
        Observable observableFilter = observable.filter(new Predicate() { // from class: com.kubi.kucoin.manager.z
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SpotMarketSocketAdapter.m32623J(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.manager.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotMarketSocketAdapter.m32624K((Message) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.kucoin.manager.b0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpotMarketSocketAdapter.m32625L(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return C15527s0.m32673e(map);
    }

    /* JADX INFO: renamed from: X */
    public static final ISpotMarketPbWsApi m32635X() {
        return SpotMarketPbWsApiKt.m32552c();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m32662Y() {
        return SpotMarketPbWsApiKt.m32562m();
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m32663Z(boolean z11) {
        if (SpotMarketPbWsApiKt.m32562m() && !z11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m32664a0() {
        return SpotMarketPbWsApiKt.m32562m();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m32665b0() {
        return SpotMarketPbWsApiKt.m32562m();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m32667v() {
        return SpotMarketPbWsApiKt.m32562m();
    }
}
