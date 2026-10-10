package com.kubi.utaspotlib.repo.order.handler;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.CancelOrderData$Single$Response;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseFail;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseSuccess;
import com.kubi.core.base.order.data.Request;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utaspotlib.repo.order.data.SingleRequest;
import com.kubi.utaspotlib.repo.order.data.SingleResponse;
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
import p793yc.InterfaceC46460b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.k0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SingleCancelOrderHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/SingleCancelOrderHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SingleCancelOrderHandler implements InterfaceC46460b<Request, CancelOrderData$Single$Response> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54214a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54215b;

    /* JADX INFO: renamed from: j */
    public static final Unit m66288j(Function1 function1, SingleRequest singleRequest, Throwable th2) {
        if (function1 != null) {
            String tradeType = singleRequest.getTradeType();
            String orderId = singleRequest.getOrderId();
            String clientOid = singleRequest.getClientOid();
            ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
            function1.invoke(new CancelOrderData$Single$ResponseFail(apiException != null ? apiException.code : null, tradeType, orderId, clientOid));
        }
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    public SingleCancelOrderHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54214a = tradeAccountType;
        this.f54215b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SingleCancelOrderHandler.m66291m();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m66286h(Function1 function1, SingleRequest singleRequest, SingleResponse singleResponse) {
        if (function1 != null) {
            function1.invoke(new CancelOrderData$Single$ResponseSuccess(singleRequest.getTradeType(), singleResponse.getOrderId(), singleResponse.getClientOid()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC42773c m66290l() {
        return (InterfaceC42773c) this.f54215b.getValue();
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super CancelOrderData$Single$Response, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        final SingleRequest singleRequest = new SingleRequest(Intrinsics.areEqual(this.f54214a, TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT", req.getSymbol(), req.getOrderId(), null, 8, null);
        Observable<R> observableCompose = m66290l().m93719l(singleRequest).delay(1L, TimeUnit.SECONDS).compose(C24217a1.m58390n());
        final Function1 function2 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SingleCancelOrderHandler.m66286h(function1, singleRequest, (SingleResponse) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.utaspotlib.repo.order.handler.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SingleCancelOrderHandler.m66287i(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SingleCancelOrderHandler.m66288j(function1, singleRequest, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.utaspotlib.repo.order.handler.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SingleCancelOrderHandler.m66289k(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m66287i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m66289k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC42773c m66291m() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }
}
