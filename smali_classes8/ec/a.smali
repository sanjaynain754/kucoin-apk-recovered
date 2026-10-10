.class public interface abstract Lec/a;
.super Ljava/lang/Object;
.source "IHistoryApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\u0008f\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032.\u0008\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u00080\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u0008`\tH\'J>\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032.\u0008\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u00080\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u0008`\tH\'J)\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0019\u0008\u0001\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u00080\u000fH\'J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0014H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/copytrading/copytd/common/history/IHistoryApi;",
        "",
        "fetchProfitRecord",
        "Lcom/kubi/sdk/PageEntity;",
        "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
        "paramsMap",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "Lkotlin/collections/HashMap;",
        "fetchProfitDetail",
        "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;",
        "fetchTradeRecord",
        "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;",
        "request",
        "",
        "fetchProfitShare",
        "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;",
        "pnlId",
        "closeTime",
        "",
        "CopyTradingLib_googleRelease"
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
.method public abstract a(Ljava/util/HashMap;)Lcom/kubi/sdk/PageEntity;
    .param p1    # Ljava/util/HashMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
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
        value = "v1/copyTrading/exchange/kumex-snapshot/realised-hist"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;J)Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "pnlId"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime Lretrofit2/http/Query;
            value = "closeTime"
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
        value = "v1/copyTrading/exchange/kumex-snapshot/position-pnl/profit-rate"
    .end annotation
.end method

.method public abstract d(Ljava/util/Map;)Lcom/kubi/sdk/PageEntity;
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;",
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
        value = "v1/copyTrading/exchange/kumex-trade/fills"
    .end annotation
.end method

.method public abstract e(Ljava/util/HashMap;)Lcom/kubi/sdk/PageEntity;
    .param p1    # Ljava/util/HashMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;",
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
        value = "v1/copyTrading/exchange/kumex-snapshot/realised-hist-detail"
    .end annotation
.end method
