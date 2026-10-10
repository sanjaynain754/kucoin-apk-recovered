.class public interface abstract Lcom/kubi/spot/dialog/order/a;
.super Ljava/lang/Object;
.source "AmendApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0008\u001a\u00020\tH\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000bH\'J\"\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\tH\'J\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/spot/dialog/order/AmendApi;",
        "",
        "requestAmendOrder",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/spot/dialog/order/model/AmendResult;",
        "body",
        "Lcom/kubi/spot/dialog/order/model/AmendParams;",
        "requestAmendOrderV2",
        "validationToken",
        "",
        "requestMarginAmendOrder",
        "Lcom/kubi/spot/dialog/order/model/MarginAmendParams;",
        "requestMarginAmendOrderV2",
        "getLatestPrice",
        "Lcom/kubi/spot/entity/LatestPriceEntity;",
        "symbol",
        "SpotLib_googleRelease"
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
.method public abstract a(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/entity/LatestPriceEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/market/orderbook-level1"
    .end annotation
.end method

.method public abstract b(Lcom/kubi/spot/dialog/order/model/AmendParams;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/spot/dialog/order/model/AmendParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/AmendParams;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/dialog/order/model/AmendResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "orders/v2/alter"
    .end annotation
.end method

.method public abstract c(Lcom/kubi/spot/dialog/order/model/AmendParams;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/spot/dialog/order/model/AmendParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/AmendParams;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/dialog/order/model/AmendResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "orders/alter"
    .end annotation
.end method

.method public abstract d(Lcom/kubi/spot/dialog/order/model/MarginAmendParams;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/spot/dialog/order/model/MarginAmendParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/MarginAmendParams;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/dialog/order/model/AmendResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/margin/order/alter"
    .end annotation
.end method

.method public abstract e(Lcom/kubi/spot/dialog/order/model/MarginAmendParams;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/spot/dialog/order/model/MarginAmendParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/MarginAmendParams;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/dialog/order/model/AmendResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/margin/order/alter"
    .end annotation
.end method
