.class public interface abstract Ltg/c;
.super Ljava/lang/Object;
.source "IHedgeBizInterface.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0008\u0010\u0011\u001a\u00020\u0008H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/function/hedge/IIHedgeAssetsApi;",
        "",
        "fetchHedgeClosePositionSize",
        "",
        "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;",
        "symbol",
        "",
        "isTrial",
        "",
        "submitHedgeAutoDepositMargin",
        "entity",
        "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;",
        "fetchHedgeAutoDepositMargin",
        "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;",
        "submitPositionMode",
        "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;",
        "positionMode",
        "hedgeFeatureAvailable",
        "KumexApi_googleRelease"
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
.method public abstract F0(ZLcom/kubi/kumex/data/trade/model/PositionModeEntity;)Lcom/kubi/kumex/data/trade/model/PositionModeEntity;
    .param p2    # Lcom/kubi/kumex/data/trade/model/PositionModeEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract T0(ZLcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;)Ljava/lang/Object;
    .param p2    # Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract U()Z
.end method

.method public abstract W0(Ljava/lang/String;Z)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
