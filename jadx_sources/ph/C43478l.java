package ph;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p500oh.InterfaceC43085b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ug.InterfaceC45235d;

/* JADX INFO: renamed from: ph.l */
/* JADX INFO: compiled from: IsolatedApiSocketDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR#\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/classic/isolated/delegate/IsolatedApiSocketDelegate;", "Lcom/kubi/function/isolated/IMultiIsolatedSocketApi;", "<init>", "()V", "selfPeriodApi", "Lcom/kubi/futures/classic/isolated/api/IIsolatedSocketApi;", "kotlin.jvm.PlatformType", "getSelfPeriodApi", "()Lcom/kubi/futures/classic/isolated/api/IIsolatedSocketApi;", "selfPeriodApi$delegate", "Lkotlin/Lazy;", "selfSocketApi", "getSelfSocketApi", "selfSocketApi$delegate", "trialPeriodApi", "getTrialPeriodApi", "trialPeriodApi$delegate", "trialSocketApi", "getTrialSocketApi", "trialSocketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeFreezeBalance", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/entity/BalanceEntity;", "isTrial", "", FirebaseAnalytics.Param.CURRENCY, "", "observeRiskLimit", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedApiSocketDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedApiSocketDelegate.kt\ncom/kubi/futures/classic/isolated/delegate/IsolatedApiSocketDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class C43478l implements InterfaceC45235d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f95993a = LazyKt.lazy(new Function0() { // from class: ph.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43478l.m95703s1();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f95994b = LazyKt.lazy(new Function0() { // from class: ph.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43478l.m95704t1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f95995c = LazyKt.lazy(new Function0() { // from class: ph.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43478l.m95705u1();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f95996d = LazyKt.lazy(new Function0() { // from class: ph.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43478l.m95706v1();
        }
    });

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public Observable<Object> mo93827N0(boolean z11) {
        return z11 ? InterfaceC43085b.m94658g(m95711n1(), null, 1, null) : InterfaceC43085b.m94656e(m95709l1(), null, 1, null);
    }

    /* JADX INFO: renamed from: o1 */
    public static final boolean m95699o1(String str, BalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getCurrency(), str);
    }

    /* JADX INFO: renamed from: p1 */
    public static final boolean m95700p1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q1 */
    public static final BalanceEntity m95701q1(boolean z11, BalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setTrialFunds(z11);
        return it;
    }

    /* JADX INFO: renamed from: r1 */
    public static final BalanceEntity m95702r1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BalanceEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: s1 */
    public static final InterfaceC43085b m95703s1() {
        return (InterfaceC43085b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC43085b.class);
    }

    /* JADX INFO: renamed from: t1 */
    public static final InterfaceC43085b m95704t1() {
        return (InterfaceC43085b) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC43085b.class);
    }

    /* JADX INFO: renamed from: u1 */
    public static final InterfaceC43085b m95705u1() {
        return (InterfaceC43085b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC43085b.class);
    }

    /* JADX INFO: renamed from: v1 */
    public static final InterfaceC43085b m95706v1() {
        return (InterfaceC43085b) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC43085b.class);
    }

    /* JADX INFO: renamed from: k1 */
    public final InterfaceC43085b m95708k1() {
        return (InterfaceC43085b) this.f95993a.getValue();
    }

    /* JADX INFO: renamed from: l1 */
    public final InterfaceC43085b m95709l1() {
        return (InterfaceC43085b) this.f95994b.getValue();
    }

    /* JADX INFO: renamed from: m1 */
    public final InterfaceC43085b m95710m1() {
        return (InterfaceC43085b) this.f95995c.getValue();
    }

    /* JADX INFO: renamed from: n1 */
    public final InterfaceC43085b m95711n1() {
        return (InterfaceC43085b) this.f95996d.getValue();
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public Observable<BalanceEntity> mo93830t0(final boolean z11, @NotNull final String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C38293f<BalanceEntity> c38293fM94661b = z11 ? m95710m1().m94661b(currency) : m95708k1().m94662c(currency);
        Observable observableMerge = Observable.merge(z11 ? InterfaceC43085b.m94659i(m95711n1(), c38293fM94661b, null, 2, null) : InterfaceC43085b.m94657f(m95709l1(), c38293fM94661b, null, 2, null), RxConvertKt.m91207d(c38293fM94661b, null, 1, null));
        final Function1 function1 = new Function1() { // from class: ph.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C43478l.m95699o1(currency, (BalanceEntity) obj));
            }
        };
        Observable observableFilter = observableMerge.filter(new Predicate() { // from class: ph.i
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C43478l.m95700p1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: ph.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43478l.m95701q1(z11, (BalanceEntity) obj);
            }
        };
        Observable<BalanceEntity> map = observableFilter.map(new Function() { // from class: ph.k
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43478l.m95702r1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }
}
