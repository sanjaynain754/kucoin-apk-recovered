.class public interface abstract Lcom/kubi/futures/data/market/r;
.super Ljava/lang/Object;
.source "MarketBindingRequest.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00032\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/data/market/IMarketBindingRequestApi;",
        "",
        "getFundingRate",
        "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;",
        "Lcom/kubi/kumex/data/market/model/FundingRateEntity;",
        "symbol",
        "",
        "getAggregationPrices",
        "",
        "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;",
        "symbols",
        "Lcom/kubi/kumex/data/market/model/PricesSymbolsReqInfo;",
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
.method public abstract a(Lcom/kubi/kumex/data/market/model/PricesSymbolsReqInfo;)Lhr/f;
    .param p1    # Lcom/kubi/kumex/data/market/model/PricesSymbolsReqInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kumex/data/market/model/PricesSymbolsReqInfo;",
            ")",
            "Lhr/f<",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;",
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

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/km/marketInfo"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lhr/f;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
            "Lhr/f<",
            "Lcom/kubi/kumex/data/market/model/FundingRateEntity;",
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

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex-market/latest-ticker"
    .end annotation
.end method
