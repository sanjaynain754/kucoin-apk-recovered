.class public interface abstract Lcd/a;
.super Ljava/lang/Object;
.source "ITradeOrderDataRepo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u001e\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R$\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0013R$\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u001dR$\u0010\'\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u001d\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006,\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/order/ITradeOrderDataRepo;",
        "",
        "subOrderChangeSocketGet",
        "Lkotlinx/coroutines/flow/Flow;",
        "getSubOrderChangeSocketGet",
        "()Lkotlinx/coroutines/flow/Flow;",
        "orderOperationSuccessFlow",
        "getOrderOperationSuccessFlow",
        "submitOrderObserverHandler",
        "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;",
        "Lcom/kubi/core/base/order/data/MakeOrderData$Request;",
        "Lcom/kubi/core/base/order/data/MakeOrderData$Response;",
        "getSubmitOrderObserverHandler",
        "()Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;",
        "singleCancelOrderHandler",
        "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;",
        "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;",
        "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;",
        "getSingleCancelOrderHandler",
        "()Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;",
        "cancelAllHandler",
        "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;",
        "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;",
        "getCancelAllHandler",
        "activeOrdersObservable",
        "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;",
        "Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Request;",
        "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;",
        "getActiveOrdersObservable",
        "()Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;",
        "activeOrdersCountHandler",
        "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Request;",
        "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Response;",
        "getActiveOrdersCountHandler",
        "historyDelegationPageHandler",
        "Lcom/kubi/core/base/order/data/HistoryOrderList$Request;",
        "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;",
        "getHistoryDelegationPageHandler",
        "historyDetailFillsPageHandler",
        "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;",
        "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$ResponseItemEntity;",
        "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;",
        "getHistoryDetailFillsPageHandler",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lyc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/b<",
            "Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;",
            "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b()Lyc/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/e<",
            "Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Request;",
            "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;",
            "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d()Lyc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/b<",
            "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;",
            "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract e()Lyc/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/c<",
            "Lcom/kubi/core/base/order/data/MakeOrderData$Request;",
            "Lcom/kubi/core/base/order/data/MakeOrderData$Response;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f()Lyc/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/e<",
            "Lcom/kubi/core/base/order/data/HistoryOrderList$Request;",
            "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;",
            "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract g()Lyc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/b<",
            "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Request;",
            "Lcom/kubi/core/base/order/data/ActiveOrdersData$Counts$Response;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract h()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i()Lyc/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/e<",
            "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;",
            "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$ResponseItemEntity;",
            "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
