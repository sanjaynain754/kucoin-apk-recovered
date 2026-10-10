.class public interface abstract Lkd/k;
.super Ljava/lang/Object;
.source "OrderItemData.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd/k$a;,
        Lkd/k$b;,
        Lkd/k$c;,
        Lkd/k$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u00040123R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001eR\u0014\u0010 \u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0005R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u0019R\u0014\u0010$\u001a\u0004\u0018\u00010\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0019R\u0014\u0010&\u001a\u0004\u0018\u00010\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0019R\u0014\u0010(\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\u0005R\u0014\u0010*\u001a\u0004\u0018\u00010+X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0014\u0010.\u001a\u0004\u0018\u00010+X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010-\u0082\u0001\u00044567\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00068\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;",
        "",
        "orderId",
        "",
        "getOrderId",
        "()Ljava/lang/String;",
        "orderTime",
        "",
        "getOrderTime",
        "()Ljava/lang/Long;",
        "levelType",
        "Lcom/kubi/core/base/order/data/OrderLevelType;",
        "getLevelType",
        "()Lcom/kubi/core/base/order/data/OrderLevelType;",
        "orderDisplayType",
        "getOrderDisplayType",
        "symbol",
        "getSymbol",
        "side",
        "Lcom/kubi/core/base/order/data/TradeSide;",
        "getSide",
        "()Lcom/kubi/core/base/order/data/TradeSide;",
        "size",
        "Ljava/math/BigDecimal;",
        "getSize",
        "()Ljava/math/BigDecimal;",
        "funds",
        "getFunds",
        "isHidden",
        "",
        "()Z",
        "isIceberg",
        "amountUnit",
        "getAmountUnit",
        "filledFunds",
        "getFilledFunds",
        "filledSize",
        "getFilledSize",
        "avgPrice",
        "getAvgPrice",
        "showSymbol",
        "getShowSymbol",
        "quoteIncrementPrecision",
        "",
        "getQuoteIncrementPrecision",
        "()Ljava/lang/Integer;",
        "baseIncrementPrecision",
        "getBaseIncrementPrecision",
        "Limit",
        "Market",
        "ConditionalLimit",
        "ConditionalMarket",
        "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalLimit;",
        "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalMarket;",
        "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Limit;",
        "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Market;",
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
.method public abstract a()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract b()Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract d()Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract e()Z
.end method

.method public abstract f()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g()Z
.end method

.method public abstract getFilledFunds()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getFunds()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getOrderId()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSize()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSymbol()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
