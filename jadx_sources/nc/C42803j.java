package nc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.copytrading.futures.CopyTradingWebSocketConfig;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.network.restful.C19321b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlinx.coroutines.rx2.RxConvertKt;
import mc.InterfaceC42504b;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ug.InterfaceC45235d;

/* JADX INFO: renamed from: nc.j */
/* JADX INFO: compiled from: IsolatedSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/isolated/delegate/IsolatedSocketApiDelegate;", "Lcom/kubi/function/isolated/IMultiIsolatedSocketApi;", "<init>", "()V", "periodApi", "Lcom/kubi/copytrading/copytd/isolated/api/IIsolatedSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/copytrading/copytd/isolated/api/IIsolatedSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "socketApi", "getSocketApi", "socketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeFreezeBalance", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/entity/BalanceEntity;", "isTrial", "", FirebaseAnalytics.Param.CURRENCY, "", "observeRiskLimit", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedSocketApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedSocketApiDelegate.kt\ncom/kubi/copytrading/copytd/isolated/delegate/IsolatedSocketApiDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class C42803j implements InterfaceC45235d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f94818a = LazyKt.lazy(new Function0() { // from class: nc.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42803j.m93824o1();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f94819b = LazyKt.lazy(new Function0() { // from class: nc.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42803j.m93825p1();
        }
    });

    /* JADX INFO: renamed from: k1 */
    public static final boolean m93820k1(String str, BalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getCurrency(), str);
    }

    /* JADX INFO: renamed from: l1 */
    public static final boolean m93821l1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: m1 */
    public static final BalanceEntity m93822m1(boolean z11, BalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setTrialFunds(z11);
        return it;
    }

    /* JADX INFO: renamed from: n1 */
    public static final BalanceEntity m93823n1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BalanceEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC42504b m93824o1() {
        return (InterfaceC42504b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC42504b.class);
    }

    /* JADX INFO: renamed from: p1 */
    public static final InterfaceC42504b m93825p1() {
        return (InterfaceC42504b) new C19321b.a().m42777b(new C38005g(CopyTradingWebSocketConfig.m20882i(CopyTradingWebSocketConfig.f19918a, null, 1, null))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC42504b.class);
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public Observable<Object> mo93827N0(boolean z11) {
        Observable<Object> observableJust = Observable.just(new Object());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    /* JADX INFO: renamed from: W0 */
    public final InterfaceC42504b m93828W0() {
        return (InterfaceC42504b) this.f94818a.getValue();
    }

    /* JADX INFO: renamed from: j1 */
    public final InterfaceC42504b m93829j1() {
        return (InterfaceC42504b) this.f94819b.getValue();
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public Observable<BalanceEntity> mo93830t0(final boolean z11, @NotNull final String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C38293f<BalanceEntity> c38293fM93202b = z11 ? m93828W0().m93202b(currency) : m93828W0().m93203c(currency);
        Observable observableMerge = Observable.merge(z11 ? InterfaceC42504b.m93199e(m93829j1(), c38293fM93202b, null, 2, null) : InterfaceC42504b.m93200f(m93829j1(), c38293fM93202b, null, 2, null), RxConvertKt.m91207d(c38293fM93202b, null, 1, null));
        final Function1 function1 = new Function1() { // from class: nc.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C42803j.m93820k1(currency, (BalanceEntity) obj));
            }
        };
        Observable observableFilter = observableMerge.filter(new Predicate() { // from class: nc.g
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C42803j.m93821l1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: nc.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42803j.m93822m1(z11, (BalanceEntity) obj);
            }
        };
        Observable<BalanceEntity> map = observableFilter.map(new Function() { // from class: nc.i
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42803j.m93823n1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }
}
