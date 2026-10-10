.class public interface abstract Lrg/b;
.super Ljava/lang/Object;
.source "IMultiHistoryApi.kt"

# interfaces
.implements Lqg/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0006\u0010\u0005\u001a\u00020\tH&J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0005\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0005\u001a\u00020\u0010H&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0017\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/function/common/IMultiHistoryApi;",
        "Lcom/kubi/function/IMultiFunction;",
        "fetchProfitRecord",
        "Lcom/kubi/sdk/PageEntity;",
        "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
        "params",
        "Lcom/kubi/kumex/data/assets/model/HistoryProfitParams;",
        "fetchProfitDetail",
        "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;",
        "Lcom/kubi/kumex/data/assets/model/HistoryProfitDetailParams;",
        "fetchFundsRecord",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "Lcom/kubi/kumex/entity/FundsRecordEntity;",
        "Lcom/kubi/kumex/data/assets/model/HistoryFundsParams;",
        "fetchTradeRecord",
        "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;",
        "Lcom/kubi/kumex/data/assets/model/HistoryTradeRecordParams;",
        "fetchProfitShare",
        "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;",
        "pnlId",
        "",
        "closeTime",
        "",
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
.method public abstract K0(Lam/c;)Lcom/kubi/sdk/PageEntity;
    .param p1    # Lam/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam/c;",
            ")",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract O0(Lam/d;)Lcom/kubi/sdk/PageEntity;
    .param p1    # Lam/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam/d;",
            ")",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract Q0(Lam/a;)Lcom/kubi/sdk/base/entity/BasePageEntity;
    .param p1    # Lam/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam/a;",
            ")",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/kumex/entity/FundsRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;J)Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c0(Lam/b;)Lcom/kubi/sdk/PageEntity;
    .param p1    # Lam/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam/b;",
            ")",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
