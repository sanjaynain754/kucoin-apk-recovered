package com.kubi.core.base.quote.inner;

import com.kubi.data.DataInitManager;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.util.C24217a1;
import com.tencent.qcloud.tuicore.TUIConstants;
import gd.C37869b;
import ge.InterfaceC37872b;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.Request;
import p756xc.SymbolQuoteResponse;
import p793yc.InterfaceC46460b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.core.base.quote.inner.k0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolQuoteHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/base/quote/inner/SymbolQuoteHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$Request;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$SymbolQuoteResponse;", "<init>", "()V", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolQuoteHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolQuoteHandler.kt\ncom/kubi/core/base/quote/inner/SymbolQuoteHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class SymbolQuoteHandler implements InterfaceC46460b<Request, SymbolQuoteResponse> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC37872b f20115a;

    /* JADX INFO: renamed from: i */
    public static final TradeItemBean m21160i(Request request, ArrayList it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(((TradeItemBean) next).getSymbol(), request.getSymbol())) {
                return (TradeItemBean) next;
            }
        }
        next = null;
        return (TradeItemBean) next;
    }

    /* JADX INFO: renamed from: j */
    public static final TradeItemBean m21161j(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (TradeItemBean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m21162k(Function1 function1, TradeItemBean tradeItemBean, TradeItemBean tradeItemBean2) {
        if (tradeItemBean2 != null) {
            tradeItemBean.setChangeRate(tradeItemBean2.getChangeRate());
            tradeItemBean.setFavor(C37869b.m85487a(tradeItemBean2));
            tradeItemBean.setAlarm(tradeItemBean2.isAlarm());
        }
        if (function1 != null) {
            function1.invoke(new SymbolQuoteResponse(tradeItemBean));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m21164m(Function1 function1, TradeItemBean tradeItemBean, Throwable th2) {
        if (function1 != null) {
            function1.invoke(new SymbolQuoteResponse(tradeItemBean));
        }
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull final Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super SymbolQuoteResponse, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        final TradeItemBean tradeItemBean = new TradeItemBean(req.getSymbol());
        Observable<R> observableCompose = this.f20115a.m85491a(req.getSymbol(), "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_main_tab_trade").compose(C24217a1.m58390n());
        final Function1 function2 = new Function1() { // from class: com.kubi.core.base.quote.inner.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolQuoteHandler.m21160i(req, (ArrayList) obj);
            }
        };
        Observable observableObserveOn = observableCompose.map(new Function() { // from class: com.kubi.core.base.quote.inner.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SymbolQuoteHandler.m21161j(function2, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.core.base.quote.inner.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolQuoteHandler.m21162k(function1, tradeItemBean, (TradeItemBean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.core.base.quote.inner.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolQuoteHandler.m21163l(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.core.base.quote.inner.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolQuoteHandler.m21164m(function1, tradeItemBean, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.base.quote.inner.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolQuoteHandler.m21165n(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    public SymbolQuoteHandler() {
        Object objCreate = C42597a.m93386b().create(InterfaceC37872b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f20115a = (InterfaceC37872b) objCreate;
    }

    /* JADX INFO: renamed from: l */
    public static final void m21163l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final void m21165n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
