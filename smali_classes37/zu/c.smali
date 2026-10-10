.class public interface abstract Lzu/c;
.super Ljava/lang/Object;
.source "ITradeChanceApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\'J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\'J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0003H\'J,\u0010\t\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00032\u0014\u0008\u0001\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\'J\"\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n0\u00032\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\'J\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00032\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\'J\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000eH&J\u001a\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000eH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0019\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/quotefacade/api/ITradeChanceApi;",
        "",
        "config",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;",
        "plateRate",
        "Lcom/kubi/quotefacade/entity/ChancePlateEntity;",
        "gembox",
        "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;",
        "marketChange",
        "",
        "Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;",
        "body",
        "",
        "",
        "whale",
        "Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;",
        "includes",
        "hotRank",
        "Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;",
        "type",
        "quoteWs",
        "Lcom/kubi/quotefacade/entity/QuoteWSEntity;",
        "topic",
        "gemboxWs",
        "QuoteFacadeLib_googleRelease"
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
.method public abstract a()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/ChancePlateEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/discover/plate/rate"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/whale/message/list"
    .end annotation
.end method

.method public abstract c(Ljava/util/Map;)Lkotlinx/coroutines/flow/e;
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
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/discover/market-change/message/list"
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhr/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/QuoteWSEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract e()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/discover/config/main"
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Cache-Time: 60000"
        }
    .end annotation
.end method
