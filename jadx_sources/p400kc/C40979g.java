package p400kc;

import com.kubi.broker.MultiBizType;
import com.kubi.copytrading.futures.CopyTradingWebSocketConfig;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.network.restful.C19321b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import sg.InterfaceC44407d;

/* JADX INFO: renamed from: kc.g */
/* JADX INFO: compiled from: ICrossSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/cross/ICrossSocketApiDelegate;", "Lcom/kubi/function/cross/IMultiSocketCrossApi;", "<init>", "()V", "periodApi", "Lcom/kubi/copytrading/copytd/cross/ICrossSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/copytrading/copytd/cross/ICrossSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "socketApi", "getSocketApi", "socketApi$delegate", "observeMarginMode", "Lio/reactivex/Observable;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "isTrial", "", "observeCrossLeverage", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "observeOccupancyBalance", "", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40979g implements InterfaceC44407d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f91066a = LazyKt.lazy(new Function0() { // from class: kc.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40979g.m89754T0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f91067b = LazyKt.lazy(new Function0() { // from class: kc.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40979g.m89756V0();
        }
    });

    @Override // sg.InterfaceC44407d
    @NotNull
    /* JADX INFO: renamed from: C */
    public Observable<SymbolsCrossLeverage> mo86196C(boolean z11) {
        C38293f c38293fM89740m = z11 ? InterfaceC40976d.m89740m(m89759x0(), null, 1, null) : InterfaceC40976d.m89739c(m89759x0(), null, 1, null);
        Observable<SymbolsCrossLeverage> observableMerge = Observable.merge(InterfaceC40976d.m89742o(m89758F0(), c38293fM89740m, null, 2, null), RxConvertKt.m91207d(c38293fM89740m, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    @Override // sg.InterfaceC44407d
    @NotNull
    /* JADX INFO: renamed from: E */
    public Observable<Map<String, MarginModeInfoEntity>> mo86197E(boolean z11) {
        C38293f c38293fM89743p = z11 ? InterfaceC40976d.m89743p(m89759x0(), null, 1, null) : InterfaceC40976d.m89738b(m89759x0(), null, 1, null);
        Observable<Map<String, MarginModeInfoEntity>> observableMerge = Observable.merge(InterfaceC40976d.m89741n(m89758F0(), c38293fM89743p, null, 2, null), RxConvertKt.m91207d(c38293fM89743p, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    /* JADX INFO: renamed from: T0 */
    public static final InterfaceC40976d m89754T0() {
        return (InterfaceC40976d) C38290c.m86420a(C42597a.f94305a).create(InterfaceC40976d.class);
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC40976d m89756V0() {
        return (InterfaceC40976d) new C19321b.a().m42777b(new C38005g(CopyTradingWebSocketConfig.m20882i(CopyTradingWebSocketConfig.f19918a, null, 1, null))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC40976d.class);
    }

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC40976d m89758F0() {
        return (InterfaceC40976d) this.f91067b.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC40976d m89759x0() {
        return (InterfaceC40976d) this.f91066a.getValue();
    }

    @Override // sg.InterfaceC44407d
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<Object> mo86200p(boolean z11) throws Throwable {
        C38293f<List<SimpleBalanceEntity>> c38293fM89747f;
        InterfaceC40976d interfaceC40976dM89759x0 = m89759x0();
        if (z11) {
            c38293fM89747f = interfaceC40976dM89759x0.m89751j();
        } else {
            c38293fM89747f = interfaceC40976dM89759x0.m89747f();
        }
        if (z11) {
            Observable<Object> observableMerge = Observable.merge(m89758F0().m89750i(c38293fM89747f, new C40983k()), RxConvertKt.m91207d(c38293fM89747f, null, 1, null));
            Intrinsics.checkNotNull(observableMerge);
            return observableMerge;
        }
        Observable<Object> observableMerge2 = Observable.merge(m89758F0().m89752k(c38293fM89747f, new C40980h()), RxConvertKt.m91207d(c38293fM89747f, null, 1, null));
        Intrinsics.checkNotNull(observableMerge2);
        return observableMerge2;
    }
}
