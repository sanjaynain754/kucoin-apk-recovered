.class public interface abstract Lgf/h;
.super Ljava/lang/Object;
.source "CoinApi.java"


# virtual methods
.method public abstract d()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/currencies-balance-sorted"
    .end annotation
.end method

.method public abstract e(Ljava/lang/Long;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Lretrofit2/http/Query;
            value = "timeline"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/data/entity/AlphaCurrencyEntity;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/mobile/alpha/currencies"
    .end annotation
.end method

.method public abstract f()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/EtfCoinEntity;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/margin-fund/fund/currency/condition/list"
    .end annotation
.end method

.method public abstract g(Ljava/lang/Long;Ljava/lang/Boolean;Z)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Lretrofit2/http/Query;
            value = "timeline"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lretrofit2/http/Query;
            value = "containsOff"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lretrofit2/http/Header;
            value = "Ignore-Stage"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/symbols"
    .end annotation
.end method

.method public abstract getMarketSymbol(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "quote"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "User-Agent"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/market/symbol"
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Cache-Time: 1000",
            "SELF-UA: true"
        }
    .end annotation
.end method

.method public abstract h()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kc/order/minimum-funds"
    .end annotation
.end method
