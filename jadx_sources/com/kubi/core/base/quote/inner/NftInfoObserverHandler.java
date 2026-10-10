package com.kubi.core.base.quote.inner;

import com.kubi.core.spot.entity.NFTEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import ge.InterfaceC37872b;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.NFTInfoResponse;
import p756xc.NTFInfo;
import p756xc.Request;
import p793yc.InterfaceC46460b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.core.base.quote.inner.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NftInfoObserverHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/base/quote/inner/NftInfoObserverHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$Request;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$NFTInfoResponse;", "<init>", "()V", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NftInfoObserverHandler implements InterfaceC46460b<Request, NFTInfoResponse> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC37872b f20117a;

    /* JADX INFO: renamed from: j */
    public static final NTFInfo m21174j(Request request, NFTEntity it) {
        String baseCurrency;
        Intrinsics.checkNotNullParameter(it, "it");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(request.getSymbol());
        String symbol = request.getSymbol();
        if (symbolInfoEntityM85601B == null || (baseCurrency = symbolInfoEntityM85601B.getBaseCurrency()) == null) {
            baseCurrency = "";
        }
        return new NTFInfo(symbol, baseCurrency, C27025c.m66566d(it.getDisplay()), it);
    }

    /* JADX INFO: renamed from: k */
    public static final NTFInfo m21175k(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (NTFInfo) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m21177m(Function1 function1, Request request, NTFInfo nTFInfo) {
        if (function1 != null) {
            String symbol = request.getSymbol();
            Intrinsics.checkNotNull(nTFInfo);
            function1.invoke(new NFTInfoResponse(symbol, nTFInfo));
        }
        return Unit.INSTANCE;
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull final Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super NFTInfoResponse, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        Observable<R> observableCompose = this.f20117a.m85497r(req.getSymbol()).compose(C24217a1.m58390n());
        final Function1 function2 = new Function1() { // from class: com.kubi.core.base.quote.inner.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NftInfoObserverHandler.m21174j(req, (NFTEntity) obj);
            }
        };
        Observable observableDoFinally = observableCompose.map(new Function() { // from class: com.kubi.core.base.quote.inner.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return NftInfoObserverHandler.m21175k(function2, obj);
            }
        }).observeOn(C42916f.m94128g()).doFinally(new Action() { // from class: com.kubi.core.base.quote.inner.h
            @Override // io.reactivex.functions.Action
            public final void run() {
                NftInfoObserverHandler.m21176l();
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.core.base.quote.inner.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NftInfoObserverHandler.m21177m(function1, req, (NTFInfo) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.core.base.quote.inner.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NftInfoObserverHandler.m21178n(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.core.base.quote.inner.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NftInfoObserverHandler.m21179o((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoFinally.subscribe(consumer, new Consumer() { // from class: com.kubi.core.base.quote.inner.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NftInfoObserverHandler.m21180p(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    public NftInfoObserverHandler() {
        Object objCreate = C42597a.m93386b().create(InterfaceC37872b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f20117a = (InterfaceC37872b) objCreate;
    }

    /* JADX INFO: renamed from: n */
    public static final void m21178n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m21179o(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m21180p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final void m21176l() {
    }
}
