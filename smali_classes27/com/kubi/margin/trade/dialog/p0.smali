.class public final Lcom/kubi/margin/trade/dialog/p0;
.super Ljava/lang/Object;
.source "MarginConfirmDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/margin/trade/dialog/p0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "resolveOrderAmountDisplay",
        "Lcom/kubi/margin/trade/dialog/MarginOrderAmountDisplay;",
        "isBuy",
        "",
        "symbol",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "fallbackAmount",
        "Ljava/math/BigDecimal;",
        "fallbackCurrency",
        "",
        "fallbackCurrencyName",
        "marketDisplayAmount",
        "marketAmountUnit",
        "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;",
        "MarginLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(ZLcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;)Lcom/kubi/margin/trade/dialog/w1;
    .locals 1
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/kubi/tradebase/marketamount/MarketAmountUnit;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fallbackAmount"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    if-eqz p5, :cond_2

    .line 13
    .line 14
    if-eqz p6, :cond_2

    .line 15
    .line 16
    sget-object p0, Lcom/kubi/margin/trade/dialog/p0$a;->$EnumSwitchMapping$0:[I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p6}, Ljava/lang/Enum;->ordinal()I

    .line 20
    move-result p2

    .line 21
    .line 22
    aget p0, p0, p2

    .line 23
    const/4 p2, 0x1

    .line 24
    .line 25
    if-eq p0, p2, :cond_1

    .line 26
    const/4 p2, 0x2

    .line 27
    .line 28
    if-ne p0, p2, :cond_0

    .line 29
    .line 30
    new-instance p0, Lcom/kubi/margin/trade/dialog/w1;

    .line 31
    .line 32
    sget p2, Lcom/kubi/margin/R$string;->margin_order_total_amount:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 36
    move-result-object p3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p2, p5, p3, p1}, Lcom/kubi/margin/trade/dialog/w1;-><init>(ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-object p0

    .line 45
    .line 46
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 50
    throw p0

    .line 51
    .line 52
    :cond_1
    new-instance p0, Lcom/kubi/margin/trade/dialog/w1;

    .line 53
    .line 54
    sget p2, Lcom/kubi/margin/R$string;->margin_order_count:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 58
    move-result-object p3

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, p2, p5, p3, p1}, Lcom/kubi/margin/trade/dialog/w1;-><init>(ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return-object p0

    .line 67
    .line 68
    :cond_2
    new-instance p1, Lcom/kubi/margin/trade/dialog/w1;

    .line 69
    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    sget p0, Lcom/kubi/margin/R$string;->margin_order_total_amount:I

    .line 73
    goto :goto_0

    .line 74
    .line 75
    :cond_3
    sget p0, Lcom/kubi/margin/R$string;->margin_order_count:I

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-direct {p1, p0, p2, p3, p4}, Lcom/kubi/margin/trade/dialog/w1;-><init>(ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    return-object p1
.end method
