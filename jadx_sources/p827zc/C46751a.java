package p827zc;

import ad.InterfaceC0239a;
import ad.InterfaceC0240b;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import bd.InterfaceC4560a;
import cd.InterfaceC4934a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.CancelOrderData$All$Response;
import com.kubi.core.base.order.data.CancelOrderData$Single$Response;
import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.core.biz.order.detail.HistoryOrderFillsUiData;
import com.kubi.core.biz.submit.SubmitOrderConfig;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import gd.InterfaceC37868a;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.util.LinkedList;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41678w;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import org.jetbrains.annotations.NotNull;
import p309hd.InterfaceC38169a;
import p309hd.InterfaceC38170b;
import p309hd.TradeSettingsBean;
import p557qe.InterfaceC43720b;
import p793yc.InterfaceC46460b;
import p793yc.InterfaceC46461c;
import p793yc.InterfaceC46462d;
import p793yc.InterfaceC46463e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zc.a */
/* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider;", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "()V", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "settingsRepo", "Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "getSettingsRepo", "()Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "orderRepo", "Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "getOrderRepo", "()Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "balanceRepo", "Lcom/kubi/core/base/balance/ITradeBalanceDataRepo;", "getBalanceRepo", "()Lcom/kubi/core/base/balance/ITradeBalanceDataRepo;", "orderConfig", "Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "getOrderConfig", "()Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "routerPageOperator", "Lcom/kubi/core/base/assets/IBizRouterOperator;", "getRouterPageOperator", "()Lcom/kubi/core/base/assets/IBizRouterOperator;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46751a extends AbstractC46753c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f104576a = TradeAccountType.ClassicSpot.INSTANCE;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC37868a f104577b = new e();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC4934a f104578c = new c();

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC4560a f104579d = new a();

    /* JADX INFO: renamed from: e */
    @NotNull
    public final SubmitOrderConfig f104580e = new b();

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC0239a f104581f = new d();

    /* JADX INFO: renamed from: zc.a$a */
    /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005*\u0002\u0000\u0003\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$balanceRepo$1", "Lcom/kubi/core/base/balance/ITradeBalanceDataRepo;", "balanceObserverHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$balanceRepo$1$balanceObserverHandler$1", "getBalanceObserverHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$balanceRepo$1$balanceObserverHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$balanceRepo$1$balanceObserverHandler$1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC4560a {

        /* JADX INFO: renamed from: a */
        public final C47041a f104582a = new C47041a();

        /* JADX INFO: renamed from: zc.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J.\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$balanceRepo$1$balanceObserverHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestSingleFlowHandler;", "Lcom/kubi/core/base/arch/api/data/SymbolBalanceData$Request;", "Lcom/kubi/core/base/arch/api/data/SymbolBalanceData$Response;", "execute", "Lkotlinx/coroutines/flow/Flow;", "req", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C47041a implements InterfaceC46462d<Object, Object> {
        }
    }

    /* JADX INFO: renamed from: zc.a$b */
    /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
    @Metadata(m90083d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¨\u0006\u0018"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderConfig$1", "Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "isSupportEtfTrade", "", "cancelOrderLimitOneHundred", "isKycErrorCode", "code", "", "consumeErrorCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "baseCurrency", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "isCheckAvailable", "getTradeInterceptTaskChain", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "getSupportTradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isCallAuction", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements SubmitOrderConfig {
        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: a */
        public boolean mo22537a() {
            return false;
        }

        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: c */
        public boolean mo22539c() {
            return false;
        }

        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: g */
        public boolean mo22543g() {
            return false;
        }

        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: b */
        public LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> mo22538b() {
            return new LinkedList<>();
        }

        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: e */
        public boolean mo22541e(Throwable th2, String str, FragmentManager childFragmentManager) {
            Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
            return false;
        }

        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: f */
        public boolean mo22542f(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return false;
        }

        @Override // com.kubi.core.biz.submit.SubmitOrderConfig
        /* JADX INFO: renamed from: d */
        public List<TradeTypeUiData> mo22540d(boolean z11) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: zc.a$c */
    /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\b\u0000\n\u000f\u0014\u0019\u001e#(\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020(X\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1", "Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "subOrderChangeSocketGet", "Lkotlinx/coroutines/flow/Flow;", "", "getSubOrderChangeSocketGet", "()Lkotlinx/coroutines/flow/Flow;", "orderOperationSuccessFlow", "getOrderOperationSuccessFlow", "submitOrderObserverHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$submitOrderObserverHandler$1", "getSubmitOrderObserverHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$submitOrderObserverHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$submitOrderObserverHandler$1;", "singleCancelOrderHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$singleCancelOrderHandler$1", "getSingleCancelOrderHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$singleCancelOrderHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$singleCancelOrderHandler$1;", "cancelAllHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$cancelAllHandler$1", "getCancelAllHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$cancelAllHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$cancelAllHandler$1;", "activeOrdersObservable", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersObservable$1", "getActiveOrdersObservable", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersObservable$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersObservable$1;", "activeOrdersCountHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersCountHandler$1", "getActiveOrdersCountHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersCountHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersCountHandler$1;", "historyDelegationPageHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDelegationPageHandler$1", "getHistoryDelegationPageHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDelegationPageHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDelegationPageHandler$1;", "historyDetailFillsPageHandler", "com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDetailFillsPageHandler$1", "getHistoryDetailFillsPageHandler", "()Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDetailFillsPageHandler$1;", "Lcom/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDetailFillsPageHandler$1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements InterfaceC4934a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC41634e<Object> f104583a = C41636g.m90879C();

        /* JADX INFO: renamed from: b */
        public final InterfaceC41634e<Object> f104584b = C41636g.m90879C();

        /* JADX INFO: renamed from: c */
        public final g f104585c = new g();

        /* JADX INFO: renamed from: d */
        public final f f104586d = new f();

        /* JADX INFO: renamed from: e */
        public final C47042c f104587e = new C47042c();

        /* JADX INFO: renamed from: f */
        public final b f104588f = new b();

        /* JADX INFO: renamed from: g */
        public final a f104589g = new a();

        /* JADX INFO: renamed from: h */
        public final d f104590h = new d();

        /* JADX INFO: renamed from: i */
        public final e f104591i = new e();

        /* JADX INFO: renamed from: zc.a$c$a */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersCountHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Request;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Response;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements InterfaceC46460b<Request, Response> {
            @Override // p793yc.InterfaceC46460b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void mo21152a(Request req, CompositeDisposable disposable, Function1<? super Response, Unit> function1) {
                Intrinsics.checkNotNullParameter(req, "req");
                Intrinsics.checkNotNullParameter(disposable, "disposable");
            }
        }

        /* JADX INFO: renamed from: zc.a$c$b */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$activeOrdersObservable$1", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Request;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "getUiItemEntity", "responseItem", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b implements InterfaceC46463e<com.kubi.core.base.order.data.Request, OrderItem, OrderItem> {
            @Override // p793yc.InterfaceC46463e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Observable<BasePageEntity<OrderItem>> mo66265a(com.kubi.core.base.order.data.Request req) {
                Intrinsics.checkNotNullParameter(req, "req");
                Observable<BasePageEntity<OrderItem>> observableEmpty = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
                return observableEmpty;
            }
        }

        /* JADX INFO: renamed from: zc.a$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$cancelAllHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C47042c implements InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$All$Response> {
            @Override // p793yc.InterfaceC46460b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void mo21152a(com.kubi.core.base.order.data.Request req, CompositeDisposable disposable, Function1<? super CancelOrderData$All$Response, Unit> function1) {
                Intrinsics.checkNotNullParameter(req, "req");
                Intrinsics.checkNotNullParameter(disposable, "disposable");
            }
        }

        /* JADX INFO: renamed from: zc.a$c$d */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDelegationPageHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/HistoryOrderList$Request;", "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "getUiItemEntity", "responseItem", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class d implements InterfaceC46463e<com.kubi.core.base.order.data.Request, ResponseItemEntity, HistoryOrdersUiData$ItemEntity> {
            @Override // p793yc.InterfaceC46463e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> mo66265a(com.kubi.core.base.order.data.Request req) {
                Intrinsics.checkNotNullParameter(req, "req");
                Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> observableEmpty = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
                return observableEmpty;
            }
        }

        /* JADX INFO: renamed from: zc.a$c$e */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$historyDetailFillsPageHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$ResponseItemEntity;", "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;", "getUiItemEntity", "responseItem", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class e implements InterfaceC46463e<com.kubi.core.base.order.data.Request, com.kubi.core.base.order.data.ResponseItemEntity, HistoryOrderFillsUiData> {
            @Override // p793yc.InterfaceC46463e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Observable<BasePageEntity<HistoryOrderFillsUiData>> mo66265a(com.kubi.core.base.order.data.Request req) {
                Intrinsics.checkNotNullParameter(req, "req");
                Observable<BasePageEntity<HistoryOrderFillsUiData>> observableEmpty = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
                return observableEmpty;
            }
        }

        /* JADX INFO: renamed from: zc.a$c$f */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$singleCancelOrderHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "execute", "", "req", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class f implements InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$Single$Response> {
            @Override // p793yc.InterfaceC46460b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void mo21152a(com.kubi.core.base.order.data.Request req, CompositeDisposable disposable, Function1<? super CancelOrderData$Single$Response, Unit> function1) {
                Intrinsics.checkNotNullParameter(req, "req");
                Intrinsics.checkNotNullParameter(disposable, "disposable");
            }
        }

        /* JADX INFO: renamed from: zc.a$c$g */
        /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
        @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$orderRepo$1$submitOrderObserverHandler$1", "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "Lcom/kubi/core/base/order/data/MakeOrderData$Response;", "execute", "Lio/reactivex/Observable;", "req", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class g implements InterfaceC46461c<MakeOrderData$Request, com.kubi.core.base.order.data.Response> {
            @Override // p793yc.InterfaceC46461c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Observable<com.kubi.core.base.order.data.Response> mo66315a(MakeOrderData$Request req) {
                Intrinsics.checkNotNullParameter(req, "req");
                Observable<com.kubi.core.base.order.data.Response> observableEmpty = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
                return observableEmpty;
            }
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: c */
        public InterfaceC41634e<Object> mo5155c() {
            return this.f104584b;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: h */
        public InterfaceC41634e<Object> mo5160h() {
            return this.f104583a;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
        public a getF101561e() {
            return this.f104589g;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: k, reason: from getter and merged with bridge method [inline-methods] */
        public b getF101560d() {
            return this.f104588f;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: l, reason: from getter and merged with bridge method [inline-methods] */
        public C47042c mo5153a() {
            return this.f104587e;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: m, reason: from getter and merged with bridge method [inline-methods] */
        public d getF101565i() {
            return this.f104590h;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: n, reason: from getter and merged with bridge method [inline-methods] */
        public e getF101566j() {
            return this.f104591i;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: o, reason: from getter and merged with bridge method [inline-methods] */
        public f mo5156d() {
            return this.f104586d;
        }

        @Override // cd.InterfaceC4934a
        /* JADX INFO: renamed from: p, reason: from getter and merged with bridge method [inline-methods] */
        public g mo5157e() {
            return this.f104585c;
        }
    }

    /* JADX INFO: renamed from: zc.a$d */
    /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$routerPageOperator$1", "Lcom/kubi/core/base/assets/IBizRouterOperator;", "jumpToOrderRecordPage", "", "context", "Landroid/content/Context;", "symbol", "", "index", "Lcom/kubi/core/base/assets/OrderRecordIndex;", "utaTradeType", "jumpToTransfer", FirebaseAnalytics.Param.CURRENCY, "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d implements InterfaceC0239a {
        @Override // ad.InterfaceC0239a
        /* JADX INFO: renamed from: a */
        public void mo872a(Context context, String str, InterfaceC0240b index, String utaTradeType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(index, "index");
            Intrinsics.checkNotNullParameter(utaTradeType, "utaTradeType");
        }

        @Override // ad.InterfaceC0239a
        /* JADX INFO: renamed from: b */
        public void mo873b(String str) {
        }
    }

    /* JADX INFO: renamed from: zc.a$e */
    /* JADX INFO: compiled from: DefaultTradeCoreDataRepoProvider.kt */
    @Metadata(m90083d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, m90084d2 = {"com/kubi/core/base/arch/repo/DefaultTradeCoreDataRepoProvider$settingsRepo$1", "Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "tradeSettingsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/kubi/core/base/setting/data/TradeSettingsBean;", "getTradeSettingsFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "supportMenuBiz", "", "menu", "Lcom/kubi/core/base/setting/MenusBiz;", "parseArguments", "", "arguments", "Landroid/os/Bundle;", "setTradePanelModel", "model", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "setTradeDirection", "direction", "Lcom/kubi/core/base/setting/data/TradeDirection;", "supportBottomBizTab", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e implements InterfaceC37868a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC41678w<TradeSettingsBean> f104592a = C41679x.m91009a(new TradeSettingsBean(null, null, 0, null, 15, null));

        @Override // gd.InterfaceC37868a
        /* JADX INFO: renamed from: a */
        public InterfaceC41678w<TradeSettingsBean> mo85483a() {
            return this.f104592a;
        }

        @Override // gd.InterfaceC37868a
        /* JADX INFO: renamed from: b */
        public void mo85484b(InterfaceC38169a direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
        }

        @Override // gd.InterfaceC37868a
        /* JADX INFO: renamed from: c */
        public void mo85485c(InterfaceC38170b model) {
            Intrinsics.checkNotNullParameter(model, "model");
        }

        @Override // gd.InterfaceC37868a
        /* JADX INFO: renamed from: d */
        public void mo85486d(Bundle bundle) {
        }
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public SubmitOrderConfig getF104580e() {
        return this.f104580e;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC4934a getF104578c() {
        return this.f104578c;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public InterfaceC0239a getF104581f() {
        return this.f104581f;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC37868a getF104577b() {
        return this.f104577b;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public TradeAccountType getF104576a() {
        return this.f104576a;
    }
}
