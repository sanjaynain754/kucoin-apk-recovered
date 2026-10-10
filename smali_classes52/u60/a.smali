.class public interface abstract Lu60/a;
.super Ljava/lang/Object;
.source "ICrossApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0001\u0010\t\u001a\u00020\u0004H\'J\u001e\u0010\n\u001a\u00020\u000b2\u0014\u0008\u0001\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\r\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/unify/unify/cross/api/ICrossApi;",
        "",
        "submitCrossLeverage",
        "",
        "",
        "params",
        "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;",
        "fetchPosOrderMargin",
        "Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;",
        "symbol",
        "submitMarginMode",
        "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;",
        "map",
        "fetchAllContractsMarginMode",
        "",
        "Lcom/kubi/kumex/data/trade/model/QuoteEntity;",
        "BUnifyAccountLib_googleRelease"
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
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/trade/model/QuoteEntity;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "ultra-position/unified/inner/position/get-switchable-contracts"
    .end annotation
.end method

.method public abstract b(Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "ultra-position/unified/inner/position/change-margin-mode"
    .end annotation
.end method

.method public abstract c(Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;)Ljava/util/Map;
    .param p1    # Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "ultra-position/unified/inner/position/modify-leverage"
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "ultra-order/unified/inner/orders/get-pos-order-value"
    .end annotation
.end method
