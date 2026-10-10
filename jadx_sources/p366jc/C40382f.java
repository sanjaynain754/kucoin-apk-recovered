package p366jc;

import com.kubi.broker.MultiBizType;
import com.kubi.copytrading.futures.CopyTradingWebSocketConfig;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.network.restful.C19321b;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import java.util.List;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p339ic.InterfaceC38512b;
import p339ic.InterfaceC38513c;
import p595rg.InterfaceC44080h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jc.f */
/* JADX INFO: compiled from: IPositionSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/position/delegate/IPositionSocketApiDelegate;", "Lcom/kubi/function/common/IMultiPositionSocketApi;", "<init>", "()V", "periodApi", "Lcom/kubi/copytrading/copytd/common/position/api/IPositionSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/copytrading/copytd/common/position/api/IPositionSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "socketApi", "getSocketApi", "socketApi$delegate", "trialSocketApi", "Lcom/kubi/copytrading/copytd/common/position/api/ITrialPositionSocketApi;", "getTrialSocketApi", "()Lcom/kubi/copytrading/copytd/common/position/api/ITrialPositionSocketApi;", "trialSocketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeSourcePositionListZip", "Lio/reactivex/Observable;", "", "isTrial", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40382f implements InterfaceC44080h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f89664a = LazyKt.lazy(new Function0() { // from class: jc.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40382f.m88974W0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f89665b = LazyKt.lazy(new Function0() { // from class: jc.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40382f.m88976j1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f89666c = LazyKt.lazy(new Function0() { // from class: jc.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40382f.m88977k1();
        }
    });

    @Override // p595rg.InterfaceC44080h
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public Observable<Object> mo83169c1(boolean z11) {
        InterfaceC38512b interfaceC38512bM88979F0 = m88979F0();
        C38293f<List<PositionEntity>> c38293fM87121c = z11 ? interfaceC38512bM88979F0.m87121c() : InterfaceC38512b.m87117d(interfaceC38512bM88979F0, false, 1, null);
        Observable<Object> observableMerge = Observable.merge(z11 ? InterfaceC38513c.m87122b(m88981V0(), c38293fM87121c, null, 2, null) : InterfaceC38512b.m87118e(m88980T0(), c38293fM87121c, null, 2, null), RxConvertKt.m91207d(c38293fM87121c, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    /* JADX INFO: renamed from: W0 */
    public static final InterfaceC38512b m88974W0() {
        return (InterfaceC38512b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC38512b.class);
    }

    /* JADX INFO: renamed from: j1 */
    public static final InterfaceC38512b m88976j1() {
        return (InterfaceC38512b) new C19321b.a().m42777b(new C38005g(CopyTradingWebSocketConfig.m20882i(CopyTradingWebSocketConfig.f19918a, null, 1, null))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC38512b.class);
    }

    /* JADX INFO: renamed from: k1 */
    public static final InterfaceC38513c m88977k1() {
        return (InterfaceC38513c) new C19321b.a().m42777b(new C38005g(CopyTradingWebSocketConfig.m20882i(CopyTradingWebSocketConfig.f19918a, null, 1, null))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC38513c.class);
    }

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC38512b m88979F0() {
        return (InterfaceC38512b) this.f89664a.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC38512b m88980T0() {
        return (InterfaceC38512b) this.f89665b.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final InterfaceC38513c m88981V0() {
        return (InterfaceC38513c) this.f89666c.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }
}
