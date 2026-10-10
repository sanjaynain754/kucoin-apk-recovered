.class public interface abstract Lcom/kubi/core/base/quote/b;
.super Ljava/lang/Object;
.source "ITradeSymbolQuoteDataRepo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u001e\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/quote/ITradeSymbolQuoteDataRepo;",
        "",
        "symbolQuoteHandler",
        "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;",
        "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$Request;",
        "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$SymbolQuoteResponse;",
        "getSymbolQuoteHandler",
        "()Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;",
        "symbolConfigHandler",
        "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$SymbolConfigResponse;",
        "getSymbolConfigHandler",
        "startSubQuoteSnapshotFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/data/entity/WsMarketSnapshotEntity;",
        "symbol",
        "",
        "startSubMaintenanceStatusFlow",
        "",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
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
            "Lxc/e;",
            "Lxc/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/data/entity/WsMarketSnapshotEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c()Lyc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/b<",
            "Lxc/e;",
            "Lxc/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/BaseFragment;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
