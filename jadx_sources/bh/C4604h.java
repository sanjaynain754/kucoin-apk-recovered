package bh;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014ah.InterfaceC0312b;
import p014ah.InterfaceC0314d;
import p595rg.InterfaceC44078f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bh.h */
/* JADX INFO: compiled from: IOrderSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR#\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/delegate/IOrderSocketApiDelegate;", "Lcom/kubi/function/common/IMultiOrderSocketApi;", "<init>", "()V", "selfPeriodApi", "Lcom/kubi/futures/classic/common/order/api/ISelfOrderSocketApi;", "kotlin.jvm.PlatformType", "getSelfPeriodApi", "()Lcom/kubi/futures/classic/common/order/api/ISelfOrderSocketApi;", "selfPeriodApi$delegate", "Lkotlin/Lazy;", "selfSocketApi", "getSelfSocketApi", "selfSocketApi$delegate", "trialPeriodApi", "Lcom/kubi/futures/classic/common/order/api/ITrialOrderSocketApi;", "getTrialPeriodApi", "()Lcom/kubi/futures/classic/common/order/api/ITrialOrderSocketApi;", "trialPeriodApi$delegate", "trialSocketApi", "getTrialSocketApi", "trialSocketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeActiveOrdersZip", "Lio/reactivex/Observable;", "", "isTrial", "", "symbol", "", "observeAdvanceOrdersZip", "observeTwapOrdersZip", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4604h implements InterfaceC44078f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f4130a = LazyKt.lazy(new Function0() { // from class: bh.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4604h.m4522k1();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f4131b = LazyKt.lazy(new Function0() { // from class: bh.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4604h.m4523l1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f4132c = LazyKt.lazy(new Function0() { // from class: bh.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4604h.m4524m1();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f4133d = LazyKt.lazy(new Function0() { // from class: bh.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4604h.m4525n1();
        }
    });

    /* JADX INFO: renamed from: k1 */
    public static final InterfaceC0312b m4522k1() {
        return (InterfaceC0312b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC0312b.class);
    }

    /* JADX INFO: renamed from: l1 */
    public static final InterfaceC0312b m4523l1() {
        return (InterfaceC0312b) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC0312b.class);
    }

    /* JADX INFO: renamed from: m1 */
    public static final InterfaceC0314d m4524m1() {
        return (InterfaceC0314d) C38290c.m86420a(C42597a.f94305a).create(InterfaceC0314d.class);
    }

    /* JADX INFO: renamed from: n1 */
    public static final InterfaceC0314d m4525n1() {
        return (InterfaceC0314d) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC0314d.class);
    }

    @Override // p595rg.InterfaceC44078f
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public Observable<Object> mo4527D0(boolean z11, @Nullable String str) {
        C38293f c38293fM1110h = z11 ? InterfaceC0314d.m1110h(m4531W0(), null, str, null, null, null, 29, null) : InterfaceC0312b.m1088f(m4529T0(), null, str, null, null, null, 29, null);
        Observable<Object> observableMerge = Observable.merge(z11 ? InterfaceC0314d.m1107e(m4533j1(), c38293fM1110h, null, 2, null) : InterfaceC0312b.m1090h(m4530V0(), c38293fM1110h, null, 2, null), RxConvertKt.m91207d(c38293fM1110h, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    @Override // p595rg.InterfaceC44078f
    @NotNull
    /* JADX INFO: renamed from: M */
    public Observable<Object> mo4528M(boolean z11, @Nullable String str) throws Throwable {
        if (z11) {
            Observable<Object> observableEmpty = Observable.empty();
            Intrinsics.checkNotNull(observableEmpty);
            return observableEmpty;
        }
        C38293f<OrdersPageEntity> c38293fM1092k = InterfaceC0312b.m1092k(m4529T0(), null, null, str, null, null, 27, null);
        Observable<Object> observableMerge = Observable.merge(m4530V0().m1098j(c38293fM1092k, new C4606j()), RxConvertKt.m91207d(c38293fM1092k, null, 1, null));
        Intrinsics.checkNotNull(observableMerge);
        return observableMerge;
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC0312b m4529T0() {
        return (InterfaceC0312b) this.f4130a.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final InterfaceC0312b m4530V0() {
        return (InterfaceC0312b) this.f4131b.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final InterfaceC0314d m4531W0() {
        return (InterfaceC0314d) this.f4132c.getValue();
    }

    @Override // p595rg.InterfaceC44078f
    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public Observable<Object> mo4532Z0(boolean z11, @Nullable String str) {
        C38293f c38293fM1108f = z11 ? InterfaceC0314d.m1108f(m4531W0(), null, str, null, null, 13, null) : InterfaceC0312b.m1091i(m4529T0(), null, str, null, null, 13, null);
        Observable<Object> observableMerge = Observable.merge(z11 ? InterfaceC0314d.m1109g(m4533j1(), c38293fM1108f, null, 2, null) : InterfaceC0312b.m1089g(m4530V0(), c38293fM1108f, null, 2, null), RxConvertKt.m91207d(c38293fM1108f, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    /* JADX INFO: renamed from: j1 */
    public final InterfaceC0314d m4533j1() {
        return (InterfaceC0314d) this.f4133d.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }
}
