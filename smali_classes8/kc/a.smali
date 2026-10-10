.class public interface abstract Lkc/a;
.super Ljava/lang/Object;
.source "ICrossApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\'J\u0012\u0010\u0005\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\'J \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u0008H\'J \u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u0008H\'J\u001e\u0010\u000c\u001a\u00020\r2\u0014\u0008\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\'J\u001e\u0010\u000f\u001a\u00020\r2\u0014\u0008\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\'J\u0012\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0001\u0010\n\u001a\u00020\u0008H\'J\u0012\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\n\u001a\u00020\u0008H\'J\u0012\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0016H\'J\u0012\u0010\u0017\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0016H\'J\u0012\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0003\u0010\u001a\u001a\u00020\u0008H\'J\u0012\u0010\u001b\u001a\u00020\u00192\u0008\u0008\u0003\u0010\u001a\u001a\u00020\u0008H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/copytrading/copytd/cross/ICrossApi;",
        "",
        "fetchSelfAllContractsMarginMode",
        "",
        "Lcom/kubi/kumex/data/trade/model/QuoteEntity;",
        "fetchTrialAllContractsMarginMode",
        "fetchMarginMode",
        "",
        "",
        "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
        "symbol",
        "fetchTrialMarginMode",
        "submitMarginMode",
        "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;",
        "map",
        "submitTrialMarginMode",
        "fetchCrossModeGray",
        "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;",
        "fetchTrialCrossModeGray",
        "submitCrossLeverage",
        "",
        "entity",
        "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;",
        "submitTrialCrossLeverage",
        "fetchActiveOrderStatistics",
        "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;",
        "symbols",
        "fetchTrialActiveOrderStatistics",
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
.method public abstract a(Ljava/lang/String;)Ljava/util/Map;
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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
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
        value = "v1/copyTrading/exchange/position/queryMarginModeV2"
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
        value = "v1/copyTrading/exchange/position/changeMarginMode"
    .end annotation
.end method

.method public abstract c(Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;)Z
    .param p1    # Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/copyTrading/exchange/trade/configs/changeCrossUserLeverage"
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Ljava/util/Map;
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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
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
        value = "v1/copyTrading/exchange/position/queryTrialMarginModeV2"
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/copyTrading/exchange/contract/cross/gray"
    .end annotation
.end method

.method public abstract f()Ljava/util/List;
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
        value = "v1/copyTrading/exchange/position/getTrialSwitchableContracts"
    .end annotation
.end method

.method public abstract g()Ljava/util/List;
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
        value = "v1/copyTrading/exchange/position/getSwitchableContracts"
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbols"
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/copyTrading/exchange/trade/getTrialActiveOrderStatistics"
    .end annotation
.end method

.method public abstract i(Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbols"
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/copyTrading/exchange/trade/orders/activeOrderStatistics"
    .end annotation
.end method

.method public abstract j(Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;
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
        value = "v1/copyTrading/exchange/position/changeTrialMarginMode"
    .end annotation
.end method

.method public abstract k(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/copyTrading/exchange/contract/cross/grayTrial"
    .end annotation
.end method

.method public abstract l(Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;)Z
    .param p1    # Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/copyTrading/exchange/trade/changeTrialCrossUserLeverage"
    .end annotation
.end method
