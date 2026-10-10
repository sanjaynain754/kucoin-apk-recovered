package com.kubi.core.base.quote.inner;

import com.kubi.core.spot.api.R$string;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p260fd.Request;
import p260fd.Response;
import p793yc.InterfaceC46460b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.core.base.quote.inner.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolFavOrCancelHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/core/base/quote/inner/SymbolFavOrCancelHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/quote/data/AddOrCancelFavor$Request;", "Lcom/kubi/core/base/quote/data/AddOrCancelFavor$Response;", "<init>", "()V", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolFavOrCancelHandler implements InterfaceC46460b<Request, Response> {
    /* JADX INFO: renamed from: f */
    public static final void m21149f(Function1 function1, Request request, Object obj) {
        if (function1 != null) {
            function1.invoke(new Response(request.getSymbol(), true));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m21150g(Function1 function1, Request request, Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        if (function1 != null) {
            function1.invoke(new Response(request.getSymbol(), false));
        }
        C44128b.m97263g("fetchTradeDataBySymbols", th2);
        return Unit.INSTANCE;
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull final Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super Response, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        Observable observableObserveOn = ISpotService.f49646a.get().addFavorSymbol(req.getSymbol()).compose(C24217a1.m58390n()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.core.base.quote.inner.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolFavOrCancelHandler.m21149f(function1, req, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.core.base.quote.inner.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolFavOrCancelHandler.m21150g(function1, req, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.base.quote.inner.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolFavOrCancelHandler.m21151h(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    /* JADX INFO: renamed from: h */
    public static final void m21151h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
