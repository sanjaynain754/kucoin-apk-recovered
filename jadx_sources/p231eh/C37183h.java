package p231eh;

import com.kubi.broker.MultiBizType;
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
import p202dh.InterfaceC36680b;
import p202dh.InterfaceC36682d;
import p595rg.InterfaceC44080h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eh.h */
/* JADX INFO: compiled from: IPositionSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR#\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/futures/classic/common/positon/delegate/IPositionSocketApiDelegate;", "Lcom/kubi/function/common/IMultiPositionSocketApi;", "<init>", "()V", "selfPeriodApi", "Lcom/kubi/futures/classic/common/positon/api/ISelfPositionSocketApi;", "kotlin.jvm.PlatformType", "getSelfPeriodApi", "()Lcom/kubi/futures/classic/common/positon/api/ISelfPositionSocketApi;", "selfPeriodApi$delegate", "Lkotlin/Lazy;", "selfSocketApi", "getSelfSocketApi", "selfSocketApi$delegate", "trialPeriodApi", "Lcom/kubi/futures/classic/common/positon/api/ITrialPositionSocketApi;", "getTrialPeriodApi", "()Lcom/kubi/futures/classic/common/positon/api/ITrialPositionSocketApi;", "trialPeriodApi$delegate", "trialSocketApi", "getTrialSocketApi", "trialSocketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeSourcePositionListZip", "Lio/reactivex/Observable;", "", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37183h implements InterfaceC44080h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f82473a = LazyKt.lazy(new Function0() { // from class: eh.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37183h.m83161k1();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f82474b = LazyKt.lazy(new Function0() { // from class: eh.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37183h.m83162l1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f82475c = LazyKt.lazy(new Function0() { // from class: eh.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37183h.m83163m1();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f82476d = LazyKt.lazy(new Function0() { // from class: eh.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37183h.m83164n1();
        }
    });

    @Override // p595rg.InterfaceC44080h
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public Observable<Object> mo83169c1(boolean z11) {
        C38293f c38293fM82114d = z11 ? InterfaceC36682d.m82114d(m83168W0(), false, 1, null) : InterfaceC36680b.m82108d(m83166T0(), false, 1, null);
        Observable<Object> observableMerge = Observable.merge(z11 ? InterfaceC36682d.m82113c(m83170j1(), c38293fM82114d, null, 2, null) : InterfaceC36680b.m82107c(m83167V0(), c38293fM82114d, null, 2, null), RxConvertKt.m91207d(c38293fM82114d, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    /* JADX INFO: renamed from: k1 */
    public static final InterfaceC36680b m83161k1() {
        return (InterfaceC36680b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC36680b.class);
    }

    /* JADX INFO: renamed from: l1 */
    public static final InterfaceC36680b m83162l1() {
        return (InterfaceC36680b) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC36680b.class);
    }

    /* JADX INFO: renamed from: m1 */
    public static final InterfaceC36682d m83163m1() {
        return (InterfaceC36682d) C38290c.m86420a(C42597a.f94305a).create(InterfaceC36682d.class);
    }

    /* JADX INFO: renamed from: n1 */
    public static final InterfaceC36682d m83164n1() {
        return (InterfaceC36682d) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC36682d.class);
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC36680b m83166T0() {
        return (InterfaceC36680b) this.f82473a.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final InterfaceC36680b m83167V0() {
        return (InterfaceC36680b) this.f82474b.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final InterfaceC36682d m83168W0() {
        return (InterfaceC36682d) this.f82475c.getValue();
    }

    /* JADX INFO: renamed from: j1 */
    public final InterfaceC36682d m83170j1() {
        return (InterfaceC36682d) this.f82476d.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }
}
