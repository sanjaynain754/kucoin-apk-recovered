package cd;

import com.kubi.core.base.order.data.CancelOrderData$All$Response;
import com.kubi.core.base.order.data.CancelOrderData$Single$Response;
import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.core.biz.order.detail.HistoryOrderFillsUiData;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p793yc.InterfaceC46460b;
import p793yc.InterfaceC46461c;
import p793yc.InterfaceC46463e;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: cd.a */
/* JADX INFO: compiled from: ITradeOrderDataRepo.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R$\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R$\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR$\u0010'\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/ITradeOrderDataRepo;", "", "subOrderChangeSocketGet", "Lkotlinx/coroutines/flow/Flow;", "getSubOrderChangeSocketGet", "()Lkotlinx/coroutines/flow/Flow;", "orderOperationSuccessFlow", "getOrderOperationSuccessFlow", "submitOrderObserverHandler", "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "Lcom/kubi/core/base/order/data/MakeOrderData$Response;", "getSubmitOrderObserverHandler", "()Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "singleCancelOrderHandler", "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "getSingleCancelOrderHandler", "()Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;", "cancelAllHandler", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "getCancelAllHandler", "activeOrdersObservable", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Request;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "getActiveOrdersObservable", "()Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "activeOrdersCountHandler", "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Request;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Response;", "getActiveOrdersCountHandler", "historyDelegationPageHandler", "Lcom/kubi/core/base/order/data/HistoryOrderList$Request;", "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "getHistoryDelegationPageHandler", "historyDetailFillsPageHandler", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$ResponseItemEntity;", "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;", "getHistoryDetailFillsPageHandler", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4934a {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC46460b<Request, CancelOrderData$All$Response> mo5153a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC46463e<com.kubi.core.base.order.data.Request, OrderItem, OrderItem> mo5154b();

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<Object> mo5155c();

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC46460b<com.kubi.core.base.order.data.Request, CancelOrderData$Single$Response> mo5156d();

    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC46461c<MakeOrderData$Request, Response> mo5157e();

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC46463e<com.kubi.core.base.order.data.Request, ResponseItemEntity, HistoryOrdersUiData$ItemEntity> mo5158f();

    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC46460b<com.kubi.core.base.order.data.Request, com.kubi.core.base.order.data.Response> mo5159g();

    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<Object> mo5160h();

    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC46463e<com.kubi.core.base.order.data.Request, com.kubi.core.base.order.data.ResponseItemEntity, HistoryOrderFillsUiData> mo5161i();
}
