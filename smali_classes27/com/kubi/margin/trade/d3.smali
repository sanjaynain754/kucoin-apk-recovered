.class public interface abstract Lcom/kubi/margin/trade/d3;
.super Ljava/lang/Object;
.source "IMarginBehavior.kt"

# interfaces
.implements Lcom/kubi/margin/trade/b3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\u0003H&J\u0008\u0010\t\u001a\u00020\nH&J\u0008\u0010\u000b\u001a\u00020\nH&J@\u0010\u000c\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\n0\u0013H&J\u0008\u0010\u0015\u001a\u00020\u0003H&J\u0008\u0010\u0016\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0014H&J\u0008\u0010\u001c\u001a\u00020\u0014H&J\u0008\u0010\u001d\u001a\u00020\u0019H&J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H&J\u0008\u0010\"\u001a\u00020\u0014H&J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0014H&J\u0008\u0010$\u001a\u00020\nH&J\u0018\u0010%\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u0014H&J\u0008\u0010(\u001a\u00020\nH&J\u0008\u0010)\u001a\u00020\nH&J\u0008\u0010*\u001a\u00020\u0019H&J\u0008\u0010+\u001a\u00020\u0019H&J\u0018\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006/\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/margin/trade/IMarginParentBehavior;",
        "Lcom/kubi/margin/trade/IMarginBehavior;",
        "lastTradeMode",
        "",
        "lastTradeType",
        "Lcom/kubi/tradebase/tradetype/TradeType;",
        "bboData",
        "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;",
        "lastPrecision",
        "showOrderBookAmountDialog",
        "",
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
        "orderMode",
        "isIsolateTrade",
        "onClickOrderBookPrice",
        "value",
        "Ljava/math/BigDecimal;",
        "setLimitStopPriceFocused",
        "hasFocus",
        "isLimitStopPriceFocused",
        "currentLeverage",
        "showResetLeverageDialog",
        "baseAsset",
        "Lcom/kubi/tradebase/entity/CurrencyBalance;",
        "quoteAsset",
        "isBuy",
        "setIsBuy",
        "showBorrowModeDialog",
        "showAvailableTips",
        "showBorrowTips",
        "isStop",
        "showRepayTips",
        "showDebtTips",
        "getBestAskPrice",
        "getBestBidPrice",
        "onTradeTypeChanged",
        "label",
        "index",
        "MarginLib_googleRelease"
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

.method public abstract G1()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract L()Z
.end method

.method public abstract N0(Z)V
.end method

.method public abstract S0()Z
.end method

.method public abstract T(Ljava/math/BigDecimal;)V
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract T1()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract W0()I
.end method

.method public abstract X()I
.end method

.method public abstract Y()V
.end method

.method public abstract Z1(Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/tradebase/entity/CurrencyBalance;)V
    .param p1    # Lcom/kubi/tradebase/entity/CurrencyBalance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradebase/entity/CurrencyBalance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract a1()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i1()V
.end method

.method public abstract i2()V
.end method

.method public abstract l0()V
.end method

.method public abstract p0(Ljava/lang/String;I)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract v0()Lcom/kubi/tradebase/tradetype/TradeType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract z2()V
.end method
