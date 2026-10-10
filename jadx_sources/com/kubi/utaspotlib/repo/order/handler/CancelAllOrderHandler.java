package com.kubi.utaspotlib.repo.order.handler;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.CancelOrderData$All$Response;
import com.kubi.core.base.order.data.CancelOrderData$All$ResponseFail;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utaspotlib.repo.order.data.GroupRequest;
import com.kubi.utaspotlib.repo.order.data.GroupResponse;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import n70.InterfaceC42773c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38191i;
import p793yc.InterfaceC46460b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CancelAllOrderHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0016J.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/CancelAllOrderHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "getCancelOrderExecuteApi", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$GroupResponse;", "orderType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "symbol", "", "tradeType", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CancelAllOrderHandler implements InterfaceC46460b<Request, CancelOrderData$All$Response> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54228a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54229b;

    /* JADX INFO: renamed from: j */
    public static final Unit m66328j(Function1 function1, String str, Throwable th2) {
        if (function1 != null) {
            ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
            function1.invoke(new CancelOrderData$All$ResponseFail(apiException != null ? apiException.code : null, str));
        }
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    public CancelAllOrderHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54228a = tradeAccountType;
        this.f54229b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelAllOrderHandler.m66331n();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m66326h(Function1 function1, String str, GroupResponse groupResponse) {
        if (function1 != null) {
            function1.invoke(new CancelOrderData$All$Response(str) { // from class: com.kubi.core.base.order.data.CancelOrderData$All$ResponseSuccess
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC42773c m66330m() {
        return (InterfaceC42773c) this.f54229b.getValue();
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super CancelOrderData$All$Response, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        String symbol = req.getSymbol();
        OrderLevelType orderType = req.getOrderType();
        if (orderType == null) {
            return;
        }
        final String str = Intrinsics.areEqual(this.f54228a, TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT";
        Observable<R> observableCompose = m66333l(orderType, symbol, str).delay(1L, TimeUnit.SECONDS).compose(C24217a1.m58390n());
        final Function1 function2 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CancelAllOrderHandler.m66326h(function1, str, (GroupResponse) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.utaspotlib.repo.order.handler.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CancelAllOrderHandler.m66327i(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CancelAllOrderHandler.m66328j(function1, str, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.utaspotlib.repo.order.handler.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CancelAllOrderHandler.m66329k(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    /* JADX INFO: renamed from: l */
    public final Observable<BaseEntity<GroupResponse>> m66333l(OrderLevelType orderLevelType, String str, String str2) {
        return Intrinsics.areEqual(orderLevelType, OrderLevelType.Normal.INSTANCE) ? m66330m().m93720m(C38191i.f85893a.m86169b(), new GroupRequest(str2, str)) : m66330m().m93721n(C38191i.f85893a.m86168a(), new GroupRequest(str2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m66327i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m66329k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC42773c m66331n() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }
}
