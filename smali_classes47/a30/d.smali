.class public final La30/d;
.super Ljava/lang/Object;
.source "SymbolsListAdapterExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "getSymbolListItemView",
        "Lcom/kubi/spot/quote/market/symbolListItemView/ISymbolListItemView;",
        "item",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "SpotLib_googleRelease"
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
.method public static final a(Lcom/kubi/data/entity/TradeItemBean;)La30/a;
    .locals 2
    .param p0    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "item"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/core/biz/callauction/j;->a:Lcom/kubi/core/biz/callauction/j;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/core/biz/callauction/j;->c()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Lcom/kubi/core/biz/callauction/j;->j(Lcom/kubi/data/entity/TradeItemBean;Z)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance p0, Lcom/kubi/spot/business/callAuction/action/b;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/kubi/spot/business/callAuction/action/b;-><init>()V

    .line 26
    return-object p0

    .line 27
    .line 28
    :cond_0
    sget-object v0, Lcom/kubi/spot/business/newCoin/NewCoinHelper;->a:Lcom/kubi/spot/business/newCoin/NewCoinHelper;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lcom/kubi/spot/business/newCoin/NewCoinHelper;->c(Lcom/kubi/data/entity/TradeItemBean;)Z

    .line 32
    move-result p0

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    new-instance p0, Lr20/e;

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lr20/e;-><init>()V

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_1
    new-instance p0, La30/b;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, La30/b;-><init>()V

    .line 46
    return-object p0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
.end method
