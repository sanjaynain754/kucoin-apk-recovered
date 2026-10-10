package p308hc;

import com.kubi.broker.MultiBizType;
import com.kubi.copytrading.futures.CopyTradingWebSocketConfig;
import com.kubi.network.restful.C19321b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p288gc.InterfaceC37863d;
import p595rg.InterfaceC44078f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hc.e */
/* JADX INFO: compiled from: IOrderSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/order/delegate/IOrderSocketApiDelegate;", "Lcom/kubi/function/common/IMultiOrderSocketApi;", "<init>", "()V", "periodApi", "Lcom/kubi/copytrading/copytd/common/order/api/IOrderSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/copytrading/copytd/common/order/api/IOrderSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "socketApi", "getSocketApi", "socketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeActiveOrdersZip", "Lio/reactivex/Observable;", "", "isTrial", "", "symbol", "", "observeAdvanceOrdersZip", "observeTwapOrdersZip", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38167e implements InterfaceC44078f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f85862a = LazyKt.lazy(new Function0() { // from class: hc.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38167e.m86118T0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f85863b = LazyKt.lazy(new Function0() { // from class: hc.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38167e.m86120V0();
        }
    });

    /* JADX INFO: renamed from: T0 */
    public static final InterfaceC37863d m86118T0() {
        return (InterfaceC37863d) C38290c.m86420a(C42597a.f94305a).create(InterfaceC37863d.class);
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC37863d m86120V0() {
        return (InterfaceC37863d) new C19321b.a().m42777b(new C38005g(CopyTradingWebSocketConfig.m20882i(CopyTradingWebSocketConfig.f19918a, null, 1, null))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37863d.class);
    }

    @Override // p595rg.InterfaceC44078f
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public Observable<Object> mo4527D0(boolean z11, @Nullable String str) {
        C38293f c38293fM85469n = z11 ? InterfaceC37863d.m85469n(m86123x0(), null, str, null, null, null, 29, null) : InterfaceC37863d.m85463f(m86123x0(), null, str, null, null, null, 29, null);
        Observable<Object> observableMerge = Observable.merge(z11 ? InterfaceC37863d.m85465i(m86122F0(), c38293fM85469n, null, 2, null) : InterfaceC37863d.m85466k(m86122F0(), c38293fM85469n, null, 2, null), RxConvertKt.m91207d(c38293fM85469n, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC37863d m86122F0() {
        return (InterfaceC37863d) this.f85863b.getValue();
    }

    @Override // p595rg.InterfaceC44078f
    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public Observable<Object> mo4532Z0(boolean z11, @Nullable String str) {
        C38293f c38293fM85464g = z11 ? InterfaceC37863d.m85464g(m86123x0(), null, str, null, null, 13, null) : InterfaceC37863d.m85470o(m86123x0(), null, str, null, null, 13, null);
        Observable<Object> observableMerge = Observable.merge(z11 ? InterfaceC37863d.m85467l(m86122F0(), c38293fM85464g, null, 2, null) : InterfaceC37863d.m85468m(m86122F0(), c38293fM85464g, null, 2, null), RxConvertKt.m91207d(c38293fM85464g, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC37863d m86123x0() {
        return (InterfaceC37863d) this.f85862a.getValue();
    }

    @Override // p595rg.InterfaceC44078f
    @NotNull
    /* JADX INFO: renamed from: M */
    public Observable<Object> mo4528M(boolean z11, @Nullable String str) {
        Observable<Object> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }
}
