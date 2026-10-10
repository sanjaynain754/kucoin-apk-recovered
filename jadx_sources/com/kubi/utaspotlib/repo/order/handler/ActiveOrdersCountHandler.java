package com.kubi.utaspotlib.repo.order.handler;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.sdk.util.C24217a1;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
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
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ActiveOrdersCountHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/ActiveOrdersCountHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Request;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Response;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "getTradeType", "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ActiveOrdersCountHandler implements InterfaceC46460b<Request, Response> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54204a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54205b;

    public ActiveOrdersCountHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54204a = tradeAccountType;
        this.f54205b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActiveOrdersCountHandler.m66277n();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m66273h(Function1 function1, com.kubi.utaspotlib.repo.order.data.Response response) {
        if (function1 != null) {
            function1.invoke(new Response(response.getActiveOrderCount(), response.getActiveAdvancedOrderCount()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m66275j(Throwable th2) {
        C44128b.m97260d("getOrderCounts error: " + th2);
        return Unit.INSTANCE;
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super Response, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        if (!UserInfo.a.n()) {
            if (function1 != null) {
                function1.invoke(new Response(null, null));
                return;
            }
            return;
        }
        Observable<R> observableCompose = m66280m().m93710b(m66279l(this.f54204a)).compose(C24217a1.m58390n());
        final Function1 function2 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActiveOrdersCountHandler.m66273h(function1, (com.kubi.utaspotlib.repo.order.data.Response) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.utaspotlib.repo.order.handler.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ActiveOrdersCountHandler.m66274i(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActiveOrdersCountHandler.m66275j((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.utaspotlib.repo.order.handler.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ActiveOrdersCountHandler.m66276k(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    /* JADX INFO: renamed from: l */
    public final String m66279l(TradeAccountType tradeAccountType) {
        if (IUnifyAccountService.f53155a.get().mo64980D()) {
            return "ALL";
        }
        return Intrinsics.areEqual(tradeAccountType, TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT";
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC42773c m66280m() {
        return (InterfaceC42773c) this.f54205b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m66274i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m66276k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC42773c m66277n() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }
}
