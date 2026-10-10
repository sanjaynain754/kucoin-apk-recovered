.class public interface abstract Lcom/kubi/tradebase/marketamount/i;
.super Ljava/lang/Object;
.source "MarketAmountUnitStore.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\tH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/tradebase/marketamount/MarketAmountUnitPreferences;",
        "",
        "read",
        "",
        "side",
        "Lcom/kubi/tradebase/marketamount/MarketAmountSide;",
        "write",
        "",
        "unit",
        "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;",
        "TradeBaseLib_googleRelease"
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
.method public abstract a(Lcom/kubi/tradebase/marketamount/MarketAmountSide;)Ljava/lang/String;
    .param p1    # Lcom/kubi/tradebase/marketamount/MarketAmountSide;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract b(Lcom/kubi/tradebase/marketamount/MarketAmountSide;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;)V
    .param p1    # Lcom/kubi/tradebase/marketamount/MarketAmountSide;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradebase/marketamount/MarketAmountUnit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
