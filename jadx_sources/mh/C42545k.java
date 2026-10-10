package mh;

import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kh.InterfaceC41036a;
import kh.InterfaceC41037b;
import kh.InterfaceC41038c;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg.InterfaceC44943b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: mh.k */
/* JADX INFO: compiled from: HedgeServiceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR#\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0013\u001a\n \u0006*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/futures/classic/hedge/service/HedgeServiceImpl;", "Lcom/kubi/function/hedge/IHedgeService;", "<init>", "()V", "periodApi", "Lcom/kubi/futures/classic/hedge/api/IHedgeSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/futures/classic/hedge/api/IHedgeSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "socketApi", "getSocketApi", "socketApi$delegate", "api", "Lcom/kubi/futures/classic/hedge/api/IHedgeApi;", "getApi", "()Lcom/kubi/futures/classic/hedge/api/IHedgeApi;", "api$delegate", "trialApi", "Lcom/kubi/futures/classic/hedge/api/IHedgeTrialApi;", "getTrialApi", "()Lcom/kubi/futures/classic/hedge/api/IHedgeTrialApi;", "trialApi$delegate", "fetchPositionModeAndSave", "", "isTrial", "", "observePositionMode", "Lkotlinx/coroutines/flow/Flow;", "observeUserPositionMode", "Lio/reactivex/Observable;", "getPositionModeFromCache", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHedgeServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeServiceImpl.kt\ncom/kubi/futures/classic/hedge/service/HedgeServiceImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,111:1\n23#2,2:112\n23#2,2:114\n32#2:116\n23#2,2:117\n23#2,2:119\n*S KotlinDebug\n*F\n+ 1 HedgeServiceImpl.kt\ncom/kubi/futures/classic/hedge/service/HedgeServiceImpl\n*L\n64#1:112,2\n66#1:114,2\n109#1:116\n95#1:117,2\n97#1:119,2\n*E\n"})
public final class C42545k implements InterfaceC44943b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f94220a = LazyKt.lazy(new Function0() { // from class: mh.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42545k.m93271w();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f94221b = LazyKt.lazy(new Function0() { // from class: mh.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42545k.m93272x();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f94222c = LazyKt.lazy(new Function0() { // from class: mh.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42545k.m93261k();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f94223d = LazyKt.lazy(new Function0() { // from class: mh.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42545k.m93273y();
        }
    });

    /* JADX INFO: renamed from: l */
    private final InterfaceC41036a m93262l() {
        return (InterfaceC41036a) this.f94222c.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC41038c m93263o() {
        return (InterfaceC41038c) this.f94223d.getValue();
    }

    /* JADX INFO: renamed from: p */
    private final Observable<String> m93264p(final boolean z11) {
        if (!BrokerConfig.f19211a.m20201d().mo20227J0()) {
            Observable<String> observableJust = Observable.just("ONEWAY");
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        InterfaceC41037b interfaceC41037bM93274m = m93274m();
        C38293f<PositionModeEntity> c38293fM89990a = z11 ? interfaceC41037bM93274m.m89990a() : interfaceC41037bM93274m.m89991b();
        InterfaceC41037b interfaceC41037bM93275n = m93275n();
        Observable observableMerge = Observable.merge(z11 ? InterfaceC41037b.m89988d(interfaceC41037bM93275n, c38293fM89990a, null, 2, null) : InterfaceC41037b.m89989f(interfaceC41037bM93275n, c38293fM89990a, null, 2, null), RxConvertKt.m91207d(c38293fM89990a, null, 1, null));
        final Function2 function2 = new Function2() { // from class: mh.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C42545k.m93267s((PositionModeEntity) obj, (PositionModeEntity) obj2));
            }
        };
        Observable observableDistinctUntilChanged = observableMerge.distinctUntilChanged(new BiPredicate() { // from class: mh.b
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return C42545k.m93268t(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: mh.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42545k.m93269u((PositionModeEntity) obj);
            }
        };
        Observable map = observableDistinctUntilChanged.map(new Function() { // from class: mh.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42545k.m93270v(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: mh.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42545k.m93265q(z11, (String) obj);
            }
        };
        Observable<String> observableDoOnNext = map.doOnNext(new Consumer() { // from class: mh.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42545k.m93266r(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m93265q(boolean z11, String str) {
        if (z11) {
            StorageId<String> storageIdM103259X = C46894j.f104736a.m103259X();
            Intrinsics.checkNotNull(str);
            C46392a.m102333p(storageIdM103259X, str);
        } else {
            StorageId<String> storageIdM103246K = C46894j.f104736a.m103246K();
            Intrinsics.checkNotNull(str);
            C46392a.m102333p(storageIdM103246K, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m93267s(PositionModeEntity old, PositionModeEntity positionModeEntity) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(positionModeEntity, "new");
        return old.getPositionMode() == positionModeEntity.getPositionMode();
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m93268t(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public static final String m93269u(PositionModeEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPositionMode() == 1 ? "HEDGE" : "ONEWAY";
    }

    /* JADX INFO: renamed from: v */
    public static final String m93270v(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC41037b m93271w() {
        return (InterfaceC41037b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC41037b.class);
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC41037b m93272x() {
        return (InterfaceC41037b) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC41037b.class);
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: V0 */
    public String mo89035V0(boolean z11) {
        if (BrokerConfig.f19211a.m20201d().mo20227J0()) {
            return C46392a.m102326h(z11 ? C46894j.f104736a.m103259X() : C46894j.f104736a.m103246K(), "ONEWAY");
        }
        return "ONEWAY";
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public String mo89037a0(boolean z11) {
        if (!BrokerConfig.f19211a.m20201d().mo20227J0()) {
            return "ONEWAY";
        }
        String str = (z11 ? m93263o().m89997d() : m93262l().m89985d()).getPositionMode() == 1 ? "HEDGE" : "ONEWAY";
        if (z11) {
            C46392a.m102333p(C46894j.f104736a.m103259X(), str);
            return str;
        }
        C46392a.m102333p(C46894j.f104736a.m103246K(), str);
        return str;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC41037b m93274m() {
        return (InterfaceC41037b) this.f94220a.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC41037b m93275n() {
        return (InterfaceC41037b) this.f94221b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC41036a m93261k() {
        return (InterfaceC41036a) C42597a.m93391g().create(InterfaceC41036a.class);
    }

    /* JADX INFO: renamed from: r */
    public static final void m93266r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC41038c m93273y() {
        return (InterfaceC41038c) C42597a.m93391g().create(InterfaceC41038c.class);
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public InterfaceC41634e<String> mo89038x0(boolean z11) {
        return RxConvertKt.m91205b(m93264p(z11));
    }
}
