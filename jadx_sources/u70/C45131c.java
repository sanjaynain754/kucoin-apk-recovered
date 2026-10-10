package u70;

import cd.InterfaceC4934a;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.CancelOrderData$All$Response;
import com.kubi.core.base.order.data.CancelOrderData$All$ResponseSuccess;
import com.kubi.core.base.order.data.CancelOrderData$Single$Response;
import com.kubi.core.base.order.data.CancelOrderData$Single$ResponseSuccess;
import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.utaspotlib.repo.order.handler.ActiveOrdersCountHandler;
import com.kubi.utaspotlib.repo.order.handler.ActiveOrdersPagingHandler;
import com.kubi.utaspotlib.repo.order.handler.CancelAllOrderHandler;
import com.kubi.utaspotlib.repo.order.handler.HistoryDelegationPageHandler;
import com.kubi.utaspotlib.repo.order.handler.HistoryDetailFillsPageHandler;
import com.kubi.utaspotlib.repo.order.handler.OrderChangeSocketFlowProvider;
import com.kubi.utaspotlib.repo.order.handler.SingleCancelOrderHandler;
import com.kubi.utaspotlib.repo.order.handler.SubmitOrderHandler;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p793yc.InterfaceC46460b;
import p793yc.InterfaceC46461c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u70.c */
/* JADX INFO: compiled from: UtaTradeOrderDataRepo.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u00062"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo;", "Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "socketFlowProvider", "Lcom/kubi/utaspotlib/repo/order/handler/OrderChangeSocketFlowProvider;", "subOrderChangeSocketGet", "Lkotlinx/coroutines/flow/Flow;", "", "getSubOrderChangeSocketGet", "()Lkotlinx/coroutines/flow/Flow;", "_orderOperationSuccessFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "orderOperationSuccessFlow", "getOrderOperationSuccessFlow", "activeOrdersObservable", "Lcom/kubi/utaspotlib/repo/order/handler/ActiveOrdersPagingHandler;", "getActiveOrdersObservable", "()Lcom/kubi/utaspotlib/repo/order/handler/ActiveOrdersPagingHandler;", "activeOrdersCountHandler", "Lcom/kubi/utaspotlib/repo/order/handler/ActiveOrdersCountHandler;", "getActiveOrdersCountHandler", "()Lcom/kubi/utaspotlib/repo/order/handler/ActiveOrdersCountHandler;", "submitOrderObserverHandler", "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "Lcom/kubi/core/base/order/data/MakeOrderData$Response;", "getSubmitOrderObserverHandler", "()Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "singleCancelOrderHandler", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "getSingleCancelOrderHandler", "()Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "cancelAllHandler", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "getCancelAllHandler", "historyDelegationPageHandler", "Lcom/kubi/utaspotlib/repo/order/handler/HistoryDelegationPageHandler;", "getHistoryDelegationPageHandler", "()Lcom/kubi/utaspotlib/repo/order/handler/HistoryDelegationPageHandler;", "historyDetailFillsPageHandler", "Lcom/kubi/utaspotlib/repo/order/handler/HistoryDetailFillsPageHandler;", "getHistoryDetailFillsPageHandler", "()Lcom/kubi/utaspotlib/repo/order/handler/HistoryDetailFillsPageHandler;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45131c implements InterfaceC4934a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final OrderChangeSocketFlowProvider f101557a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41668m<Object> f101558b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41634e<Object> f101559c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ActiveOrdersPagingHandler f101560d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ActiveOrdersCountHandler f101561e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC46461c<MakeOrderData$Request, Response> f101562f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC46460b<Request, CancelOrderData$Single$Response> f101563g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$All$Response> f101564h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final HistoryDelegationPageHandler f101565i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final HistoryDetailFillsPageHandler f101566j;

    /* JADX INFO: renamed from: u70.c$a */
    /* JADX INFO: compiled from: UtaTradeOrderDataRepo.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"com/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo$cancelAllHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "delegate", "Lcom/kubi/utaspotlib/repo/order/handler/CancelAllOrderHandler;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$All$Response> {

        /* JADX INFO: renamed from: a */
        public final CancelAllOrderHandler f101567a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C45131c f101568b;

        public a(TradeAccountType tradeAccountType, C45131c c45131c) {
            this.f101568b = c45131c;
            this.f101567a = new CancelAllOrderHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m99762d(C45131c c45131c, Function1 function1, CancelOrderData$All$Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response instanceof CancelOrderData$All$ResponseSuccess) {
                c45131c.f101558b.mo90855d(Unit.INSTANCE);
            }
            if (function1 != null) {
                function1.invoke(response);
            }
            return Unit.INSTANCE;
        }

        @Override // p793yc.InterfaceC46460b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo21152a(com.kubi.core.base.order.data.Request req, CompositeDisposable disposable, final Function1<? super CancelOrderData$All$Response, Unit> function1) {
            Intrinsics.checkNotNullParameter(req, "req");
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            CancelAllOrderHandler cancelAllOrderHandler = this.f101567a;
            final C45131c c45131c = this.f101568b;
            cancelAllOrderHandler.mo21152a(req, disposable, new Function1() { // from class: u70.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C45131c.a.m99762d(c45131c, function1, (CancelOrderData$All$Response) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u70.c$b */
    /* JADX INFO: compiled from: UtaTradeOrderDataRepo.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"com/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo$singleCancelOrderHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "delegate", "Lcom/kubi/utaspotlib/repo/order/handler/SingleCancelOrderHandler;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements InterfaceC46460b<Request, CancelOrderData$Single$Response> {

        /* JADX INFO: renamed from: a */
        public final SingleCancelOrderHandler f101569a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C45131c f101570b;

        public b(TradeAccountType tradeAccountType, C45131c c45131c) {
            this.f101570b = c45131c;
            this.f101569a = new SingleCancelOrderHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m99765d(C45131c c45131c, Function1 function1, CancelOrderData$Single$Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response instanceof CancelOrderData$Single$ResponseSuccess) {
                c45131c.f101558b.mo90855d(Unit.INSTANCE);
            }
            if (function1 != null) {
                function1.invoke(response);
            }
            return Unit.INSTANCE;
        }

        @Override // p793yc.InterfaceC46460b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo21152a(Request req, CompositeDisposable disposable, final Function1<? super CancelOrderData$Single$Response, Unit> function1) {
            Intrinsics.checkNotNullParameter(req, "req");
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            SingleCancelOrderHandler singleCancelOrderHandler = this.f101569a;
            final C45131c c45131c = this.f101570b;
            singleCancelOrderHandler.mo21152a(req, disposable, new Function1() { // from class: u70.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C45131c.b.m99765d(c45131c, function1, (CancelOrderData$Single$Response) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u70.c$c */
    /* JADX INFO: compiled from: UtaTradeOrderDataRepo.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J4\u0010\u0006\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"com/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo$submitOrderObserverHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "Lcom/kubi/core/base/order/data/MakeOrderData$Response;", "delegate", "Lcom/kubi/utaspotlib/repo/order/handler/SubmitOrderHandler;", "execute", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "req", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements InterfaceC46461c<MakeOrderData$Request, Response> {

        /* JADX INFO: renamed from: a */
        public final SubmitOrderHandler f101571a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C45131c f101572b;

        public c(TradeAccountType tradeAccountType, C45131c c45131c) {
            this.f101572b = c45131c;
            this.f101571a = new SubmitOrderHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
        }

        @Override // p793yc.InterfaceC46461c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Observable<Response> mo66315a(MakeOrderData$Request req) {
            Intrinsics.checkNotNullParameter(req, "req");
            Observable<Response> observableM66316g = this.f101571a.mo66315a(req);
            final C45131c c45131c = this.f101572b;
            final Function1 function1 = new Function1() { // from class: u70.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C45131c.c.m99769e(c45131c, (Response) obj);
                }
            };
            return observableM66316g.doOnNext(new Consumer() { // from class: u70.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C45131c.c.m99770f(function1, obj);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m99769e(C45131c c45131c, Response response) {
            InterfaceC41668m interfaceC41668m = c45131c.f101558b;
            Unit unit = Unit.INSTANCE;
            interfaceC41668m.mo90855d(unit);
            return unit;
        }

        /* JADX INFO: renamed from: f */
        public static final void m99770f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45131c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C45131c(@Nullable TradeAccountType tradeAccountType) {
        this.f101557a = new OrderChangeSocketFlowProvider();
        InterfaceC41668m<Object> interfaceC41668mM91001b = C41674s.m91001b(0, 1, null, 5, null);
        this.f101558b = interfaceC41668mM91001b;
        this.f101559c = interfaceC41668mM91001b;
        this.f101560d = new ActiveOrdersPagingHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
        this.f101561e = new ActiveOrdersCountHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
        this.f101562f = new c(tradeAccountType, this);
        this.f101563g = new b(tradeAccountType, this);
        this.f101564h = new a(tradeAccountType, this);
        this.f101565i = new HistoryDelegationPageHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
        this.f101566j = new HistoryDetailFillsPageHandler(tradeAccountType == null ? TradeAccountType.Unified.INSTANCE : tradeAccountType);
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$All$Response> mo5153a() {
        return this.f101564h;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC41634e<Object> mo5155c() {
        return this.f101559c;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC46460b<Request, CancelOrderData$Single$Response> mo5156d() {
        return this.f101563g;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC46461c<MakeOrderData$Request, Response> mo5157e() {
        return this.f101562f;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC41634e<String> mo5160h() {
        return this.f101557a.m66251b();
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter and merged with bridge method [inline-methods] */
    public ActiveOrdersCountHandler mo5159g() {
        return this.f101561e;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter and merged with bridge method [inline-methods] */
    public ActiveOrdersPagingHandler mo5154b() {
        return this.f101560d;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter and merged with bridge method [inline-methods] */
    public HistoryDelegationPageHandler mo5158f() {
        return this.f101565i;
    }

    @Override // cd.InterfaceC4934a
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter and merged with bridge method [inline-methods] */
    public HistoryDetailFillsPageHandler mo5161i() {
        return this.f101566j;
    }

    public /* synthetic */ C45131c(TradeAccountType tradeAccountType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : tradeAccountType);
    }
}
