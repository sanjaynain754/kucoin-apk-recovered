package ch;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.data.trade.model.StopOrderEntityActiveResult;
import com.kubi.network.api.subscribe.utils.C19319e;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44078f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: ch.h */
/* JADX INFO: compiled from: OrderServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/service/OrderServiceImpl;", "", "socketApi", "Lcom/kubi/function/common/IMultiOrderSocketApi;", "<init>", "(Lcom/kubi/function/common/IMultiOrderSocketApi;)V", "observeActiveOrders", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "isTrial", "", "symbol", "", "observeAdvanceOrders", "observeTwap", "generateObserver", "zipObs", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4976h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44078f f5553a;

    public C4976h(@NotNull InterfaceC44078f socketApi) {
        Intrinsics.checkNotNullParameter(socketApi, "socketApi");
        this.f5553a = socketApi;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m5270i(Object t11, Object t12) {
        OrdersPageEntity ordersPageEntity;
        List arrayList;
        List<OrderEntity> items;
        List arrayList2;
        List<OrderEntity> items2;
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (t12 instanceof StopOrderEntityActiveResult) {
            ordersPageEntity = t11 instanceof OrdersPageEntity ? (OrdersPageEntity) t11 : null;
            final Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = ordersPageEntity != null ? ordersPageEntity.getTotalNum() : 0L;
            if (ordersPageEntity == null || (items2 = ordersPageEntity.getItems()) == null || (arrayList2 = CollectionsKt.toMutableList((Collection) items2)) == null) {
                arrayList2 = new ArrayList();
            }
            return new OrdersPageEntity(C4977i.m5282b(arrayList2, t12, new Function0() { // from class: ch.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4976h.m5271j(longRef);
                }
            }), longRef.element);
        }
        if (!(t12 instanceof OrderEntity)) {
            return t12 instanceof OrdersPageEntity ? t12 : t11;
        }
        ordersPageEntity = t11 instanceof OrdersPageEntity ? (OrdersPageEntity) t11 : null;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ordersPageEntity != null ? ordersPageEntity.getTotalNum() : 0L;
        if (ordersPageEntity == null || (items = ordersPageEntity.getItems()) == null || (arrayList = CollectionsKt.toMutableList((Collection) items)) == null) {
            arrayList = new ArrayList();
        }
        return new OrdersPageEntity(C4977i.m5281a(arrayList, t12, new Function0() { // from class: ch.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4976h.m5272k(longRef2);
            }
        }, new Function0() { // from class: ch.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4976h.m5273l(longRef2);
            }
        }), longRef2.element);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m5271j(Ref.LongRef longRef) {
        longRef.element--;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m5272k(Ref.LongRef longRef) {
        longRef.element++;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m5273l(Ref.LongRef longRef) {
        longRef.element--;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m5274m(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof OrdersPageEntity;
    }

    /* JADX INFO: renamed from: n */
    public static final OrdersPageEntityWrapper m5275n(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new OrdersPageEntityWrapper((OrdersPageEntity) it, null);
    }

    /* JADX INFO: renamed from: o */
    public static final Observable m5276o(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Observable.just(new OrdersPageEntityWrapper(new OrdersPageEntity(null, 0L, 3, null), it));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Observable<OrdersPageEntityWrapper> m5277h(@NotNull Observable<Object> zipObs) {
        Intrinsics.checkNotNullParameter(zipObs, "zipObs");
        Observable<OrdersPageEntityWrapper> observableOnErrorResumeNext = zipObs.observeOn(C19319e.m42765d()).scan(new BiFunction() { // from class: ch.a
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C4976h.m5270i(obj, obj2);
            }
        }).filter(new Predicate() { // from class: ch.b
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C4976h.m5274m(obj);
            }
        }).map(new Function() { // from class: ch.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4976h.m5275n(obj);
            }
        }).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends R>>) new Function() { // from class: ch.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4976h.m5276o((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Observable<OrdersPageEntityWrapper> m5278p(boolean z11, @Nullable String str) {
        return m5277h(this.f5553a.mo4527D0(z11, str));
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final Observable<OrdersPageEntityWrapper> m5279q(boolean z11, @Nullable String str) {
        return m5277h(this.f5553a.mo4532Z0(z11, str));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final Observable<OrdersPageEntityWrapper> m5280r(boolean z11, @Nullable String str) {
        return m5277h(this.f5553a.mo4528M(z11, str));
    }
}
