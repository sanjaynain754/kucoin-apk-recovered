.class public interface abstract Lcom/kubi/spot/business/b2;
.super Ljava/lang/Object;
.source "ITradeBehavior.kt"

# interfaces
.implements Lcom/kubi/spot/business/z1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\u0008\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\u000bH&J\u0008\u0010\u000c\u001a\u00020\u0007H&J\u0008\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u000f\u001a\u00020\u000eH&J\u0008\u0010\u0010\u001a\u00020\u000eH&J@\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u000e0\u0018H&J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0019H&J\u0008\u0010\u001f\u001a\u00020\u0019H&J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0019H&J\u0008\u0010!\u001a\u00020\u0019H&J\u0008\u0010\"\u001a\u00020\u0019H&J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0019H&J\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\'\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/spot/business/ITradeParentBehavior;",
        "Lcom/kubi/spot/business/ITradeBehavior;",
        "getActiveDelegationList",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/data/entity/OrderBookIndex;",
        "Lkotlin/collections/ArrayList;",
        "lastTradeMode",
        "",
        "lastTradeType",
        "Lcom/kubi/tradebase/tradetype/TradeType;",
        "bboData",
        "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;",
        "lastPrecision",
        "refreshButtonStatus",
        "",
        "showOrderBookAmountDialog",
        "showOrderPrecisionDialog",
        "requestOrder",
        "marketOderParams",
        "",
        "",
        "tradeTypeRequestOrder",
        "Lcom/kubi/spot/helper/ITradeTypeRequestOrder;",
        "callback",
        "Lkotlin/Function2;",
        "",
        "onClickOrderBookPrice",
        "value",
        "Ljava/math/BigDecimal;",
        "setLimitStopPriceFocused",
        "hasFocus",
        "isLimitStopPriceFocused",
        "setOcoStopLimitPriceFocused",
        "isOcoStopLimitPriceFocused",
        "isBuy",
        "setIsBuy",
        "onTradeTypeChanged",
        "label",
        "index",
        "SpotLib_googleRelease"
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
.method public abstract G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract L()Z
.end method

.method public abstract T(Ljava/math/BigDecimal;)V
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract X()I
.end method

.method public abstract Y()V
.end method

.method public abstract f0()V
.end method

.method public abstract l0()V
.end method

.method public abstract p0(Ljava/lang/String;I)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract s0()I
.end method

.method public abstract v0()Lcom/kubi/tradebase/tradetype/TradeType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract z0()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/OrderBookIndex;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
