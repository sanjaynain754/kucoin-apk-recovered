package p342ih;

import cm.BalancesWrapper;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.futures.C13228l;
import com.kubi.futures.trade.submit.panel.footer.r0;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.trade.model.LeveragesWrapper;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.utils.extensions.C27041f;
import fm.C37569d;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p236em.C37214b;
import p664ui.C45250e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ih.p0 */
/* JADX INFO: compiled from: ClassicCrossStreamManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\fH\u0002\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¨\u0006\u0014"}, m90084d2 = {"formatPositionCouples", "", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "isHedge", "", "isHedgeMode", "isTrial", "positions", "doPositionModeCategoryAndTransform", "Lio/reactivex/Observable;", "doCrossLeverageCategoryAndTransform", "Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "doBalancesCategoryAndTransform", "Lcom/kubi/kumex/data/trade/model/BalancesWrapper;", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "tag", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nClassicCrossStreamManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicCrossStreamManager.kt\ncom/kubi/futures/classic/cross/service/ClassicCrossStreamManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1869#2,2:267\n1#3:269\n*S KotlinDebug\n*F\n+ 1 ClassicCrossStreamManager.kt\ncom/kubi/futures/classic/cross/service/ClassicCrossStreamManagerKt\n*L\n196#1:267,2\n*E\n"})
public final class C38598p0 {
    /* JADX INFO: renamed from: B */
    public static final BalancesWrapper m87215B(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BalancesWrapper(it, null);
    }

    /* JADX INFO: renamed from: C */
    public static final BalancesWrapper m87216C(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BalancesWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: D */
    public static final ObservableSource m87217D(String str, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37214b.m83255a(it, "CrossCompose-observe" + str + "SimpleBalance");
        return Observable.just(new BalancesWrapper(CollectionsKt.emptyList(), it));
    }

    /* JADX INFO: renamed from: E */
    public static final Observable<LeveragesWrapper> m87218E(Observable<SymbolsCrossLeverage> observable) {
        final Function1 function1 = new Function1() { // from class: ih.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87223J((Throwable) obj);
            }
        };
        Observable<SymbolsCrossLeverage> observableDoOnError = observable.doOnError(new Consumer() { // from class: ih.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38598p0.m87224K(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        final Function1 function2 = new Function1() { // from class: ih.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87225L((SymbolsCrossLeverage) obj);
            }
        };
        Observable observableM25657a = C13228l.m25657a(observableDoOnError, new Consumer() { // from class: ih.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38598p0.m87219F(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: ih.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87220G((SymbolsCrossLeverage) obj);
            }
        };
        Observable<LeveragesWrapper> observableOnErrorResumeNext = observableM25657a.map(new Function() { // from class: ih.k0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38598p0.m87221H(function3, obj);
            }
        }).onErrorResumeNext(new Function() { // from class: ih.l0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38598p0.m87222I((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: G */
    public static final LeveragesWrapper m87220G(SymbolsCrossLeverage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new LeveragesWrapper(it, null);
    }

    /* JADX INFO: renamed from: H */
    public static final LeveragesWrapper m87221H(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (LeveragesWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: I */
    public static final ObservableSource m87222I(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37214b.m83255a(it, "CrossCompose-observeCrossLeverage");
        return Observable.just(new LeveragesWrapper(new SymbolsCrossLeverage(), null));
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m87223J(Throwable th2) throws JSONException {
        C45250e.f101788a.m100016b("cross_lever", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m87225L(SymbolsCrossLeverage symbolsCrossLeverage) throws JSONException {
        C45250e.m100014c(C45250e.f101788a, "cross_lever", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Observable<String> m87226M(Observable<String> observable) {
        final Function1 function1 = new Function1() { // from class: ih.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87227N((Throwable) obj);
            }
        };
        Observable<String> observableDoOnError = observable.doOnError(new Consumer() { // from class: ih.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38598p0.m87228O(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        final Function1 function2 = new Function1() { // from class: ih.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87229P((String) obj);
            }
        };
        Observable<String> observableOnErrorResumeNext = C13228l.m25657a(observableDoOnError, new Consumer() { // from class: ih.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38598p0.m87230Q(function2, obj);
            }
        }).onErrorResumeNext(new Function() { // from class: ih.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38598p0.m87231R((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m87227N(Throwable th2) throws JSONException {
        C45250e.f101788a.m100016b("futures_positionMode", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m87229P(String str) throws JSONException {
        C45250e.m100014c(C45250e.f101788a, "futures_positionMode", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final ObservableSource m87231R(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37214b.m83255a(it, "CrossCompose-observePositionMode");
        return Observable.just(MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89035V0(false));
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public static final Map<String, r0> m87232S(@NotNull List<PositionEntity> list, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!z11) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PositionEntity positionEntity : list) {
            if (C37569d.m84649A(positionEntity)) {
                String strM66668h = C27041f.m66668h(positionEntity.getSymbol());
                r0 r0Var = (r0) linkedHashMap.get(strM66668h);
                if (r0Var == null) {
                    r0Var = new r0((PositionEntity) null, (PositionEntity) null, 3, (DefaultConstructorMarker) null);
                }
                if (C37569d.m84685z(positionEntity)) {
                    linkedHashMap.put(strM66668h, r0.b(r0Var, positionEntity, (PositionEntity) null, 2, (Object) null));
                } else {
                    linkedHashMap.put(strM66668h, r0.b(r0Var, (PositionEntity) null, positionEntity, 1, (Object) null));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: T */
    public static final boolean m87233T(boolean z11, @NotNull List<PositionEntity> positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Object obj = null;
        if (positions.isEmpty()) {
            return Intrinsics.areEqual(MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89035V0(z11), "HEDGE");
        }
        for (Object obj2 : positions) {
            if (!Intrinsics.areEqual(((PositionEntity) obj2).getPositionSide(), "BOTH")) {
                obj = obj2;
                break;
            }
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: w */
    public static final Observable<BalancesWrapper> m87256w(Observable<List<SimpleBalanceEntity>> observable, final String str) {
        final Function1 function1 = new Function1() { // from class: ih.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87257x(str, (Throwable) obj);
            }
        };
        Observable<List<SimpleBalanceEntity>> observableDoOnError = observable.doOnError(new Consumer() { // from class: ih.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38598p0.m87258y(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        final Function1 function2 = new Function1() { // from class: ih.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87259z(str, (List) obj);
            }
        };
        Observable observableM25657a = C13228l.m25657a(observableDoOnError, new Consumer() { // from class: ih.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38598p0.m87214A(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: ih.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38598p0.m87215B((List) obj);
            }
        };
        Observable<BalancesWrapper> observableOnErrorResumeNext = observableM25657a.map(new Function() { // from class: ih.z
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38598p0.m87216C(function3, obj);
            }
        }).onErrorResumeNext(new Function() { // from class: ih.a0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38598p0.m87217D(str, (Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m87257x(String str, Throwable th2) throws JSONException {
        C45250e.f101788a.m100016b(str + "_cross_assets", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m87259z(String str, List list) throws JSONException {
        C45250e.m100014c(C45250e.f101788a, str + "_cross_assets", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public static final void m87214A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final void m87219F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static final void m87224K(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static final void m87228O(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m87230Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final void m87258y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
