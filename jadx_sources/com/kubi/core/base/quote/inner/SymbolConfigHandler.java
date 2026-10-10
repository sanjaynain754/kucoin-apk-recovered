package com.kubi.core.base.quote.inner;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import ge.InterfaceC37872b;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.Request;
import p756xc.SymbolConfigResponse;
import p793yc.InterfaceC46460b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.core.base.quote.inner.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolConfigHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/core/base/quote/inner/SymbolConfigHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$Request;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$SymbolConfigResponse;", "<init>", "()V", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "fetchSymbolConfigInfo", "Lio/reactivex/Observable;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "fetchEnableTradingFromPreviewInfo", "symbolInfoEntity", "isSymbolCanTrade", "", "data", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolConfigHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolConfigHandler.kt\ncom/kubi/core/base/quote/inner/SymbolConfigHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class SymbolConfigHandler implements InterfaceC46460b<Request, SymbolConfigResponse> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC37872b f20128a;

    /* JADX INFO: renamed from: C */
    public final boolean m21206C(SymbolInfoEntity symbolInfoEntity) {
        if (symbolInfoEntity == null || !symbolInfoEntity.isEnableTrading()) {
            if (!(symbolInfoEntity != null ? Intrinsics.areEqual(symbolInfoEntity.getEnableAuctionTrade(), Boolean.TRUE) : false) || !CallAuctionSwitch.f20317a.m21637c()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public static final SymbolInfoEntity m21182A(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SymbolInfoEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: B */
    public static final ObservableSource m21183B(SymbolConfigHandler symbolConfigHandler, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!symbolConfigHandler.m21206C(it)) {
            return symbolConfigHandler.m21208s(it);
        }
        C37890n.f85269a.m85607H(it);
        Observable observableJust = Observable.just(it);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m21196o(Function1 function1, SymbolInfoEntity symbolInfoEntity) {
        if (function1 != null) {
            Intrinsics.checkNotNull(symbolInfoEntity);
            function1.invoke(new SymbolConfigResponse(symbolInfoEntity));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final SymbolInfoEntity m21200t(SymbolInfoEntity symbolInfoEntity, SymbolPreviewEntity symbolPreviewInfo) {
        Intrinsics.checkNotNullParameter(symbolPreviewInfo, "symbolPreviewInfo");
        symbolInfoEntity.setEnableTrading(C27025c.m66566d(symbolPreviewInfo.getEnableTrading()));
        symbolInfoEntity.setEnableAuctionTrade(Boolean.valueOf(C27025c.m66566d(symbolPreviewInfo.isEnableAuctionTrade())));
        C37890n.f85269a.m85607H(symbolInfoEntity);
        if (!Intrinsics.areEqual(symbolInfoEntity.getEnableAuctionTrade(), symbolPreviewInfo.isEnableAuctionTrade())) {
            CallAuctionSwitch.f20317a.m21641g().onNext(Boolean.valueOf(Intrinsics.areEqual(symbolPreviewInfo.isEnableAuctionTrade(), Boolean.TRUE)));
        }
        return symbolInfoEntity;
    }

    /* JADX INFO: renamed from: u */
    public static final SymbolInfoEntity m21201u(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SymbolInfoEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: w */
    public static final ObservableSource m21202w(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m21203x(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isEmpty();
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m21204y(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public static final SymbolInfoEntity m21205z(Request request, ArrayList it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(((SymbolInfoEntity) next).getSymbol(), request.getSymbol())) {
                return (SymbolInfoEntity) next;
            }
        }
        next = null;
        return (SymbolInfoEntity) next;
    }

    @Override // p793yc.InterfaceC46460b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21152a(@NotNull Request req, @NotNull CompositeDisposable disposable, @Nullable final Function1<? super SymbolConfigResponse, Unit> function1) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        Observable<SymbolInfoEntity> observableM21209v = m21209v(req);
        final Function1 function2 = new Function1() { // from class: com.kubi.core.base.quote.inner.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolConfigHandler.m21196o(function1, (SymbolInfoEntity) obj);
            }
        };
        Consumer<? super SymbolInfoEntity> consumer = new Consumer() { // from class: com.kubi.core.base.quote.inner.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolConfigHandler.m21197p(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.core.base.quote.inner.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolConfigHandler.m21198q((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM21209v.subscribe(consumer, new Consumer() { // from class: com.kubi.core.base.quote.inner.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolConfigHandler.m21199r(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    /* JADX INFO: renamed from: s */
    public final Observable<SymbolInfoEntity> m21208s(final SymbolInfoEntity symbolInfoEntity) {
        InterfaceC37872b interfaceC37872b = this.f20128a;
        String strM66668h = C27041f.m66668h(symbolInfoEntity.getCode());
        String strM66668h2 = C27041f.m66668h(symbolInfoEntity.getBaseCurrency());
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Observable<R> observableCompose = interfaceC37872b.m85494d(strM66668h, strM66668h2, string).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.base.quote.inner.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolConfigHandler.m21200t(symbolInfoEntity, (SymbolPreviewEntity) obj);
            }
        };
        Observable<SymbolInfoEntity> observableObserveOn = observableCompose.map(new Function() { // from class: com.kubi.core.base.quote.inner.p
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SymbolConfigHandler.m21201u(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    /* JADX INFO: renamed from: v */
    public final Observable<SymbolInfoEntity> m21209v(final Request request) {
        Observable<R> observableCompose = this.f20128a.m85493c(request.getSymbol()).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.base.quote.inner.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SymbolConfigHandler.m21203x((ArrayList) obj));
            }
        };
        Observable observableFilter = observableCompose.filter(new Predicate() { // from class: com.kubi.core.base.quote.inner.u
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SymbolConfigHandler.m21204y(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.core.base.quote.inner.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolConfigHandler.m21205z(request, (ArrayList) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.core.base.quote.inner.w
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SymbolConfigHandler.m21182A(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.core.base.quote.inner.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolConfigHandler.m21183B(this.f20126b, (SymbolInfoEntity) obj);
            }
        };
        Observable<SymbolInfoEntity> observableFlatMap = map.flatMap(new Function() { // from class: com.kubi.core.base.quote.inner.y
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SymbolConfigHandler.m21202w(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public SymbolConfigHandler() {
        Object objCreate = C42597a.m93386b().create(InterfaceC37872b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f20128a = (InterfaceC37872b) objCreate;
    }

    /* JADX INFO: renamed from: p */
    public static final void m21197p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m21198q(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m21199r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
