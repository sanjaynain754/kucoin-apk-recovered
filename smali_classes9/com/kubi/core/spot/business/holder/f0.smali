.class public interface abstract Lcom/kubi/core/spot/business/holder/f0;
.super Ljava/lang/Object;
.source "ITradeHolderDependDelegate.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\nH&J\u0008\u0010\u000c\u001a\u00020\rH&J\u0008\u0010\u000e\u001a\u00020\u000bH&J\u0008\u0010\u000f\u001a\u00020\u0010H&J\u0008\u0010\u0011\u001a\u00020\u0012H&J\u0008\u0010\u0013\u001a\u00020\u0014H&J\u0008\u0010\u0015\u001a\u00020\u0014H&J\u0008\u0010\u0016\u001a\u00020\u0003H&J\u0008\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0008\u0010\u001b\u001a\u00020\u000bH&J\u0008\u0010\u001c\u001a\u00020\u000bH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000bH&J\n\u0010 \u001a\u0004\u0018\u00010!H&J\n\u0010\"\u001a\u0004\u0018\u00010#H&J\u0008\u0010$\u001a\u00020\u000bH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006%\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;",
        "",
        "requestOrder",
        "",
        "marketOderParams",
        "",
        "",
        "tradeTypeRequestOrder",
        "Lcom/kubi/core/spot/helper/ITradeTypeRequestOrder;",
        "callback",
        "Lkotlin/Function2;",
        "",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "isMaintenance",
        "currentSymbol",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "currentSymbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "getBaseBalance",
        "Lcom/kubi/core/base/arch/api/data/BalanceData;",
        "getQuoteBalance",
        "fetchSymbolBalance",
        "bboData",
        "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;",
        "setLimitStopPriceFocused",
        "hasFocus",
        "isLimitStopPriceFocused",
        "isOcoStopLimitPriceFocused",
        "setOcoStopLimitPriceFocused",
        "setIsBuy",
        "isBuy",
        "getTradeCoreDataRepoProvider",
        "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;",
        "getContainerView",
        "Landroid/view/View;",
        "isSupportBorrow",
        "TradeCoreBizLib_googleRelease"
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
.method public abstract C0()Z
.end method

.method public abstract G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract H()Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract I()Lxc/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract J()Lcom/kubi/data/entity/TradeItemBean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract K()V
.end method

.method public abstract M()Z
.end method

.method public abstract N()Lcom/kubi/data/entity/SymbolInfoEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract O()Lxc/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b2()Lzc/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract i0(Z)V
.end method

.method public abstract j0()Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract r1(Ljava/util/Map;Lcom/kubi/core/spot/helper/e;Lkotlin/jvm/functions/Function2;)V
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/spot/helper/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/kubi/core/spot/helper/e;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract y0(Z)V
.end method
