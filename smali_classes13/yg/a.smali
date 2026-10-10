.class public interface abstract Lyg/a;
.super Ljava/lang/Object;
.source "IMarketApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J\u001c\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0008\u0008\u0003\u0010\u000c\u001a\u00020\rH\'J\u0014\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J\u0008\u0010\u0010\u001a\u00020\u000fH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0011\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/classic/common/market/IMarketApi;",
        "",
        "fetchQuotesListFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "Lcom/kubi/kumex/data/market/model/QuotesEntity;",
        "tradingArea",
        "",
        "fetchQuotesList",
        "fetchRecommendList",
        "fetchAvailableTradeAreaPlus",
        "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;",
        "isRobot",
        "",
        "getQuotesList",
        "Lokhttp3/Request;",
        "getRecommendList",
        "KumexLib_googleRelease"
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
.method public abstract b(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "tradingArea"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/market/model/QuotesEntity;",
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
        value = "v1/kumex-market/market/list"
    .end annotation
.end method

.method public abstract d(Z)Lkotlinx/coroutines/flow/e;
    .param p1    # Z
        .annotation runtime Lretrofit2/http/Query;
            value = "isRobot"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/contracts/tradeArea/getAvailable"
    .end annotation
.end method

.method public abstract e()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/market/model/QuotesEntity;",
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
        value = "v1/kumex-market/favor-market-list"
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;)Lokhttp3/Request;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "tradingArea"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex-market/market/list"
    .end annotation
.end method

.method public abstract g()Lokhttp3/Request;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex-market/favor-market-list"
    .end annotation
.end method
