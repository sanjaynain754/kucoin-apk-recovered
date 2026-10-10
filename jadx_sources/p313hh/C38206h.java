package p313hh;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gh.InterfaceC37920a;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sg.InterfaceC44407d;

/* JADX INFO: renamed from: hh.h */
/* JADX INFO: compiled from: ICrossSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/delegate/ICrossSocketApiDelegate;", "Lcom/kubi/function/cross/IMultiSocketCrossApi;", "<init>", "()V", "periodApi", "Lcom/kubi/futures/classic/cross/api/ICrossSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/futures/classic/cross/api/ICrossSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "socketApi", "getSocketApi", "socketApi$delegate", "observeMarginMode", "Lio/reactivex/Observable;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "isTrial", "", "observeCrossLeverage", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "observeOccupancyBalance", "", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nICrossSocketApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ICrossSocketApiDelegate.kt\ncom/kubi/futures/classic/cross/delegate/ICrossSocketApiDelegate\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n463#2:116\n413#2:117\n1252#3,4:118\n*S KotlinDebug\n*F\n+ 1 ICrossSocketApiDelegate.kt\ncom/kubi/futures/classic/cross/delegate/ICrossSocketApiDelegate\n*L\n50#1:116\n50#1:117\n50#1:118,4\n*E\n"})
public final class C38206h implements InterfaceC44407d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f85902a = LazyKt.lazy(new Function0() { // from class: hh.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38206h.m86193k1();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f85903b = LazyKt.lazy(new Function0() { // from class: hh.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38206h.m86194l1();
        }
    });

    @Override // sg.InterfaceC44407d
    @NotNull
    /* JADX INFO: renamed from: C */
    public Observable<SymbolsCrossLeverage> mo86196C(boolean z11) {
        InterfaceC37920a interfaceC37920aM86198T0 = m86198T0();
        C38293f c38293fM85741m = z11 ? InterfaceC37920a.m85741m(interfaceC37920aM86198T0, null, 1, null) : InterfaceC37920a.m85745q(interfaceC37920aM86198T0, null, 1, null);
        Observable<SymbolsCrossLeverage> observableMerge = Observable.merge(z11 ? InterfaceC37920a.m85748v(m86199V0(), c38293fM85741m, null, 2, null) : InterfaceC37920a.m85744p(m86199V0(), c38293fM85741m, null, 2, null), RxConvertKt.m91207d(c38293fM85741m, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    @Override // sg.InterfaceC44407d
    @NotNull
    /* JADX INFO: renamed from: E */
    public Observable<Map<String, MarginModeInfoEntity>> mo86197E(boolean z11) throws Throwable {
        if (!z11) {
            C38293f c38293fM85746r = InterfaceC37920a.m85746r(m86198T0(), null, 1, null);
            Observable<Map<String, MarginModeInfoEntity>> observableMerge = Observable.merge(InterfaceC37920a.m85742n(m86199V0(), c38293fM85746r, null, 2, null), RxConvertKt.m91207d(c38293fM85746r, null, 1, null));
            Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
            return observableMerge;
        }
        C38293f c38293fM85743o = InterfaceC37920a.m85743o(m86198T0(), null, 1, null);
        Observable observableMerge2 = Observable.merge(InterfaceC37920a.m85747t(m86199V0(), c38293fM85743o, null, 2, null), RxConvertKt.m91207d(c38293fM85743o, null, 1, null));
        final Function1 function1 = new Function1() { // from class: hh.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38206h.m86190W0((HashMap) obj);
            }
        };
        Observable<Map<String, MarginModeInfoEntity>> map = observableMerge2.map(new Function() { // from class: hh.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38206h.m86192j1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // sg.InterfaceC44407d
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<Object> mo86200p(boolean z11) throws Throwable {
        if (z11) {
            C38293f<List<SimpleBalanceEntity>> c38293fM85756j = m86198T0().m85756j();
            Observable<Object> observableMerge = Observable.merge(m86199V0().m85755i(c38293fM85756j, new C38208j()), RxConvertKt.m91207d(c38293fM85756j, null, 1, null));
            Intrinsics.checkNotNull(observableMerge);
            return observableMerge;
        }
        C38293f<List<SimpleBalanceEntity>> c38293fM85752f = m86198T0().m85752f();
        Observable<Object> observableMerge2 = Observable.merge(m86199V0().m85757k(c38293fM85752f, new C38207i()), RxConvertKt.m91207d(c38293fM85752f, null, 1, null));
        Intrinsics.checkNotNull(observableMerge2);
        return observableMerge2;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Map m86190W0(HashMap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Map map = MapsKt.toMap(it);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new MarginModeInfoEntity((String) entry.getValue(), null, 2, null));
        }
        return MapsKt.toMutableMap(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final Map m86192j1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Map) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k1 */
    public static final InterfaceC37920a m86193k1() {
        return (InterfaceC37920a) C38290c.m86420a(C42597a.f94305a).create(InterfaceC37920a.class);
    }

    /* JADX INFO: renamed from: l1 */
    public static final InterfaceC37920a m86194l1() {
        return (InterfaceC37920a) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37920a.class);
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC37920a m86198T0() {
        return (InterfaceC37920a) this.f85902a.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final InterfaceC37920a m86199V0() {
        return (InterfaceC37920a) this.f85903b.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }
}
