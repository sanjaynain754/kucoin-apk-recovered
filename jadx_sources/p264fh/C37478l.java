package p264fh;

import cm.PositionsWrapper;
import com.kubi.futures.C13228l;
import com.kubi.futures.model.trade.position.impl.PositionsObserver;
import com.kubi.kumex.data.trade.model.PositionEntity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p236em.C37214b;
import p595rg.InterfaceC44080h;
import p664ui.C45250e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: fh.l */
/* JADX INFO: compiled from: PositionServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/classic/common/positon/service/PositionServiceImpl;", "", "socketApi", "Lcom/kubi/function/common/IMultiPositionSocketApi;", "<init>", "(Lcom/kubi/function/common/IMultiPositionSocketApi;)V", "observeSourcePositionList", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37478l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44080h f83093a;

    public C37478l(@NotNull InterfaceC44080h socketApi) {
        Intrinsics.checkNotNullParameter(socketApi, "socketApi");
        this.f83093a = socketApi;
    }

    /* JADX INFO: renamed from: m */
    public static final Object m84286m(Object t11, Object t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (TypeIntrinsics.isMutableList(t12)) {
            return t12;
        }
        return t12 instanceof PositionEntity ? C37479m.m84301d(TypeIntrinsics.asMutableList(t11), (PositionEntity) t12) : t11;
    }

    /* JADX INFO: renamed from: n */
    public static final List m84287n(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.toList(C37479m.m84302e(TypeIntrinsics.asMutableList(it)));
    }

    /* JADX INFO: renamed from: o */
    public static final List m84288o(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m84289p(Throwable th2) throws JSONException {
        C45250e.f101788a.m100016b("cross_positions", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m84291r(List list) throws JSONException {
        C45250e.m100014c(C45250e.f101788a, "cross_positions", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final PositionsWrapper m84293t(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PositionsWrapper(it, null);
    }

    /* JADX INFO: renamed from: u */
    public static final PositionsWrapper m84294u(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (PositionsWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: v */
    public static final ObservableSource m84295v(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37214b.m83255a(it, "CrossCompose-cross_positions");
        return Observable.just(new PositionsWrapper(CollectionsKt.emptyList(), it));
    }

    /* JADX INFO: renamed from: w */
    public static final List m84296w(PositionsWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.m5406a();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Observable<List<PositionEntity>> m84297l(boolean z11) {
        Observable<R> map = this.f83093a.mo83169c1(z11).scan(new BiFunction() { // from class: fh.a
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C37478l.m84286m(obj, obj2);
            }
        }).map(new Function() { // from class: fh.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C37478l.m84287n(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableO = new PositionsObserver(map).o();
        final Function1 function1 = new Function1() { // from class: fh.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37478l.m84289p((Throwable) obj);
            }
        };
        Observable observableDoOnError = observableO.doOnError(new Consumer() { // from class: fh.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C37478l.m84290q(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        final Function1 function2 = new Function1() { // from class: fh.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37478l.m84291r((List) obj);
            }
        };
        Observable observableM25657a = C13228l.m25657a(observableDoOnError, new Consumer() { // from class: fh.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C37478l.m84292s(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: fh.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37478l.m84293t((List) obj);
            }
        };
        Observable observableOnErrorResumeNext = observableM25657a.map(new Function() { // from class: fh.j
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C37478l.m84294u(function3, obj);
            }
        }).onErrorResumeNext(new Function() { // from class: fh.k
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C37478l.m84295v((Throwable) obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: fh.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37478l.m84296w((PositionsWrapper) obj);
            }
        };
        Observable<List<PositionEntity>> map2 = observableOnErrorResumeNext.map(new Function() { // from class: fh.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C37478l.m84288o(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    /* JADX INFO: renamed from: q */
    public static final void m84290q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m84292s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
