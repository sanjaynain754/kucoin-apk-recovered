package com.kubi.margin.trade.dialog;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.margin.entity.CurrencyEntity;
import com.kubi.margin.entity.LiquidationCurrencyConfig;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.sdk.util.C24217a1;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p239ep.C37220a;
import p641tp.C45057a;
import p768xo.InterfaceC46305f;
import p768xo.InterfaceC46307h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginCrossClosePositionVM.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0)*\u0016\u0012\u0004\u0012\u00020'\u0018\u00010*j\n\u0012\u0004\u0012\u00020'\u0018\u0001`+H\u0002J\u0012\u0010,\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0003R\u0014\u0010\u0006\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginCrossClosePositionVM;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiState;", "selectedCurrency", "Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "marketApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMarketApi", "()Lcom/kubi/margin/api/MarketApi;", "marketApi$delegate", "Lkotlin/Lazy;", "marginApi", "Lcom/kubi/margin/api/MarginApi;", "getMarginApi", "()Lcom/kubi/margin/api/MarginApi;", "marginApi$delegate", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCrossClosePosition", FirebaseAnalytics.Param.CURRENCY, "validationToken", "", "requestCancelCrossClosePosition", "fetchLiquidationCurrencyConfig", "createCrossClosePositionObservable", "Lio/reactivex/Observable;", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/margin/entity/CurrencyEntity;", "toClosePositionCurrencyList", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "invokeCurrencyChange", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginCrossClosePositionVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginCrossClosePositionVM.kt\ncom/kubi/margin/trade/dialog/MarginCrossClosePositionVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1563#2:186\n1634#2,3:187\n1563#2:190\n1634#2,3:191\n*S KotlinDebug\n*F\n+ 1 MarginCrossClosePositionVM.kt\ncom/kubi/margin/trade/dialog/MarginCrossClosePositionVM\n*L\n156#1:186\n156#1:187,3\n177#1:190\n177#1:191,3\n*E\n"})
public final class MarginCrossClosePositionVM extends BaseStateVM<CrossMarginCloseContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: V */
    @Nullable
    public ClosePositionCurrency f33771V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f33772W = new CompositeDisposable();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33773X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginCrossClosePositionVM.m40183W();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33774Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.i1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginCrossClosePositionVM.m40182V();
        }
    });

    /* JADX INFO: renamed from: J */
    public static final Unit m40171J(MarginCrossClosePositionVM marginCrossClosePositionVM, Disposable disposable) {
        marginCrossClosePositionVM.updateState(new Function1() { // from class: com.kubi.margin.trade.dialog.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40172K((UiState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final UiState m40172K(UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return new UiState(InterfaceC18232b.b.f33789a);
    }

    /* JADX INFO: renamed from: N */
    public static final UiState m40175N(MarginCrossClosePositionVM marginCrossClosePositionVM, List list, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return new UiState(new InterfaceC18232b.Success(marginCrossClosePositionVM.f33771V, list));
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m40177P(final MarginCrossClosePositionVM marginCrossClosePositionVM, Throwable th2) {
        marginCrossClosePositionVM.updateState(new Function1() { // from class: com.kubi.margin.trade.dialog.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40178Q(this.f33800b, (UiState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final UiState m40178Q(MarginCrossClosePositionVM marginCrossClosePositionVM, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        marginCrossClosePositionVM.f33771V = null;
        return new UiState(InterfaceC18232b.a.f33788a);
    }

    /* JADX INFO: renamed from: T */
    private final InterfaceC46305f m40180T() {
        return (InterfaceC46305f) this.f33774Y.getValue();
    }

    /* JADX INFO: renamed from: U */
    public static final UiState m40181U(ClosePositionCurrency closePositionCurrency, InterfaceC18232b interfaceC18232b, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        List<ClosePositionCurrency> listM40268a = ((InterfaceC18232b.Success) interfaceC18232b).m40268a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM40268a, 10));
        for (ClosePositionCurrency closePositionCurrency2 : listM40268a) {
            arrayList.add(ClosePositionCurrency.copy$default(closePositionCurrency2, null, Intrinsics.areEqual(closePositionCurrency, closePositionCurrency2), null, 5, null));
        }
        return new UiState(new InterfaceC18232b.Success(closePositionCurrency, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public final void invokeCurrencyChange(final ClosePositionCurrency entity) {
        this.f33771V = entity;
        final InterfaceC18232b configState = getState().getConfigState();
        if (configState instanceof InterfaceC18232b.Success) {
            updateState(new Function1() { // from class: com.kubi.margin.trade.dialog.z0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginCrossClosePositionVM.m40181U(entity, configState, (UiState) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final Observable<Object> m40211G(CurrencyEntity currencyEntity, String str) {
        String code = currencyEntity.getCode();
        if (code == null) {
            code = "";
        }
        String liquidationTargetType = currencyEntity.getLiquidationTargetType();
        LiquidationCrossParams liquidationCrossParams = new LiquidationCrossParams(code, liquidationTargetType != null ? liquidationTargetType : "");
        Observable<R> observableCompose = ((str == null || str.length() == 0) ? m40180T().m102106r(liquidationCrossParams) : m40180T().m102111x(liquidationCrossParams, str)).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull CrossMarginCloseContract$UiIntent crossMarginCloseContract$UiIntent, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        if (crossMarginCloseContract$UiIntent instanceof CrossMarginCloseContract$UiIntent.InitCurrencyList) {
            m40213I();
        } else if (crossMarginCloseContract$UiIntent instanceof CrossMarginCloseContract$UiIntent.CancelClosePositionCross) {
            m40215X();
            C45057a.f101456a.m99656c();
        } else {
            if (!(crossMarginCloseContract$UiIntent instanceof CrossMarginCloseContract$UiIntent.CrossClosePosition)) {
                throw new NoWhenBranchMatchedException();
            }
            ClosePositionCurrency closePositionCurrency = this.f33771V;
            if (closePositionCurrency != null) {
                m40216d0(closePositionCurrency, ((CrossMarginCloseContract$UiIntent.CrossClosePosition) crossMarginCloseContract$UiIntent).getValidationToken());
                C45057a.f101456a.m99657d(closePositionCurrency.getEntity());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, 1, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final List<ClosePositionCurrency> m40217j0(ArrayList<CurrencyEntity> arrayList) {
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (CurrencyEntity currencyEntity : arrayList) {
            ClosePositionCurrency closePositionCurrency = new ClosePositionCurrency(currencyEntity, C37220a.m83267a(currencyEntity), new MarginCrossClosePositionVM$toClosePositionCurrencyList$1$1(this));
            if (C37220a.m83267a(currencyEntity)) {
                this.f33771V = closePositionCurrency;
            }
            arrayList2.add(closePositionCurrency);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: L */
    public static final void m40173L(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m40174M(final MarginCrossClosePositionVM marginCrossClosePositionVM, LiquidationCurrencyConfig liquidationCurrencyConfig) {
        final List<ClosePositionCurrency> listM40217j0 = marginCrossClosePositionVM.m40217j0(liquidationCurrencyConfig.getTargetList());
        marginCrossClosePositionVM.updateState(new Function1() { // from class: com.kubi.margin.trade.dialog.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40175N(this.f33796b, listM40217j0, (UiState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final void m40176O(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static final void m40179R(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final InterfaceC46305f m40182V() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: W */
    public static final InterfaceC46307h m40183W() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: Y */
    public static final void m40184Y(MarginCrossClosePositionVM marginCrossClosePositionVM, Object obj) {
        marginCrossClosePositionVM.hideLoadingDialog();
        marginCrossClosePositionVM.sendSingleEvent(new CancelClosePositionResultSuccess(obj));
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m40185Z(MarginCrossClosePositionVM marginCrossClosePositionVM, Throwable th2) {
        marginCrossClosePositionVM.hideLoadingDialog();
        Intrinsics.checkNotNull(th2);
        marginCrossClosePositionVM.sendSingleEvent(new CancelClosePositionResultFailed(th2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m40186a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m40188b0(MarginCrossClosePositionVM marginCrossClosePositionVM, Disposable disposable) {
        marginCrossClosePositionVM.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m40189c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m40192e0(MarginCrossClosePositionVM marginCrossClosePositionVM, Disposable disposable) {
        marginCrossClosePositionVM.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m40194f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m40195g0(MarginCrossClosePositionVM marginCrossClosePositionVM, ClosePositionCurrency closePositionCurrency, Object obj) {
        marginCrossClosePositionVM.hideLoadingDialog();
        marginCrossClosePositionVM.sendSingleEvent(new ClosePositionResultSuccess(false, closePositionCurrency, obj));
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m40196h0(MarginCrossClosePositionVM marginCrossClosePositionVM, ClosePositionCurrency closePositionCurrency, Throwable th2) {
        marginCrossClosePositionVM.hideLoadingDialog();
        Intrinsics.checkNotNull(th2);
        marginCrossClosePositionVM.sendSingleEvent(new ClosePositionResultFailed(false, closePositionCurrency, th2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m40197i0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public final void m40213I() {
        Observable<R> observableCompose = m40180T().m102075K().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.dialog.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40171J(this.f33849b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.trade.dialog.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40173L(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.dialog.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40174M(this.f33855b, (LiquidationCurrencyConfig) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.dialog.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40176O(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.dialog.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40177P(this.f33864b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.dialog.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40179R(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f33772W);
    }

    /* JADX INFO: renamed from: X */
    public final void m40215X() {
        Observable<R> observableCompose = m40180T().m102109v().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.dialog.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40188b0(this.f33839b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.trade.dialog.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40189c0(function1, obj);
            }
        });
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.dialog.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40184Y(this.f33805b, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.dialog.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40185Z(this.f33810b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.dialog.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40186a0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f33772W);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m40216d0(final ClosePositionCurrency closePositionCurrency, String str) {
        Observable<Object> observableM40211G = m40211G(closePositionCurrency.getEntity(), str);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.dialog.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40192e0(this.f33820b, (Disposable) obj);
            }
        };
        Observable<Object> observableDoOnSubscribe = observableM40211G.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.trade.dialog.k1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40194f0(function1, obj);
            }
        });
        Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.margin.trade.dialog.l1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40195g0(this.f33826b, closePositionCurrency, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.dialog.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginCrossClosePositionVM.m40196h0(this.f33842b, closePositionCurrency, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.dialog.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginCrossClosePositionVM.m40197i0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f33772W);
    }
}
