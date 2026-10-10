.class public interface abstract Lkh/a;
.super Ljava/lang/Object;
.source "IHedgeApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u0010\u0007\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\tH\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0008\u0010\u000c\u001a\u00020\rH\'J\u0012\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000f\u001a\u00020\rH\'J\u0012\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u0006H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0013\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/classic/hedge/api/IHedgeApi;",
        "",
        "fetchSelfClosePositionSize",
        "",
        "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;",
        "symbol",
        "",
        "submitHedgeAutoDepositMargin",
        "entity",
        "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;",
        "fetchHedgeAutoDepositMargin",
        "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;",
        "fetchPositionModeInternal",
        "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;",
        "submitPositionMode",
        "positionMode",
        "fetchFeatureAvailable",
        "",
        "featureType",
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
.method public abstract a(Lcom/kubi/kumex/data/trade/model/PositionModeEntity;)Lcom/kubi/kumex/data/trade/model/PositionModeEntity;
    .param p1    # Lcom/kubi/kumex/data/trade/model/PositionModeEntity;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/km/position/switchPositionMode"
    .end annotation
.end method

.method public abstract b(Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/km/margin/changeAutoDepositStatus"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Ljava/util/List;
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
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;",
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
        value = "v1/km/margin/autoDepositStatusInfo"
    .end annotation
.end method

.method public abstract d()Lcom/kubi/kumex/data/trade/model/PositionModeEntity;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/km/position/queryPositionMode"
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;)Ljava/util/List;
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
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;",
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
        value = "v1/km/maxCloseSize"
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "featureType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/km/feature/available"
    .end annotation
.end method
