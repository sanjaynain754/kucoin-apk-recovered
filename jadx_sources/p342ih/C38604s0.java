package p342ih;

import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p236em.C37214b;
import p560qh.C43742b;
import p664ui.C45250e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;
import sg.InterfaceC44405b;

/* JADX INFO: renamed from: ih.s0 */
/* JADX INFO: compiled from: CrossAssetsServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/service/CrossAssetsServiceImpl;", "", "api", "Lcom/kubi/function/cross/IMultiCrossApi;", "<init>", "(Lcom/kubi/function/cross/IMultiCrossApi;)V", "observeOccupancyBalance", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "isTrial", "", "injectBalanceMapOfPosOrderQty", "tag", "", "balances", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38604s0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44405b f86596a;

    /* JADX INFO: renamed from: c */
    public final List<SimpleBalanceEntity> m87264c(boolean z11, String str, List<SimpleBalanceEntity> list) throws JSONException {
        CrossHedgeQtyMarginEntity crossHedgeQtyMarginEntityM97937Y;
        Throwable th2 = null;
        try {
            crossHedgeQtyMarginEntityM97937Y = InterfaceC44405b.m97937Y(this.f86596a, z11, null, 2, null);
            C45250e.m100014c(C45250e.f101788a, str + "_cross_order_occupy", null, 2, null);
        } catch (Throwable th3) {
            C37214b.m83255a(th3, "CrossCompose-fetch" + str + "PosOrderQty");
            CrossHedgeQtyMarginEntity crossHedgeQtyMarginEntity = new CrossHedgeQtyMarginEntity(null, 1, null);
            C45250e.f101788a.m100016b(str + "}_cross_order_occupy", th3);
            th2 = th3;
            crossHedgeQtyMarginEntityM97937Y = crossHedgeQtyMarginEntity;
        }
        C38606t0.m87269d(list, crossHedgeQtyMarginEntityM97937Y, th2);
        return list;
    }

    public C38604s0(@NotNull InterfaceC44405b api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f86596a = api;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m87262e(Object t11, Object t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (t12 instanceof SimpleBalanceEntity) {
            return C38606t0.m87270e(TypeIntrinsics.asMutableList(t11), (SimpleBalanceEntity) t12);
        }
        return t12 instanceof List ? C38606t0.m87271f(TypeIntrinsics.asMutableList(t11), TypeIntrinsics.asMutableList(t12)) : t11;
    }

    /* JADX INFO: renamed from: f */
    public static final List m87263f(C38604s0 c38604s0, boolean z11, String str, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c38604s0.m87264c(z11, str, (List) it);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Observable<List<SimpleBalanceEntity>> m87265d(final boolean z11, @NotNull Observable<Object> observeOccupancyBalance) {
        Intrinsics.checkNotNullParameter(observeOccupancyBalance, "observeOccupancyBalance");
        final String str = z11 ? "trial" : "self";
        Observable<R> map = observeOccupancyBalance.observeOn(Schedulers.from(C42917g.m94140f(str + "-OccupancyBalance"))).scan(new BiFunction() { // from class: ih.q0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C38604s0.m87262e(obj, obj2);
            }
        }).throttleLatest(1000L, TimeUnit.MILLISECONDS, C43742b.m96366a()).map(new Function() { // from class: ih.r0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38604s0.m87263f(this.f86593b, z11, str, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return new C38582h1(map).m87213v();
    }
}
