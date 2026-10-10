.class public final Lcom/kubi/kumex/market/v2/viewModel/b;
.super Ljava/lang/Object;
.source "MarketInfoViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toUsStockMarketStatus",
        "Lcom/kubi/kumex/market/v2/viewModel/UsStockMarketStatus;",
        "Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;",
        "KumexLib_googleRelease"
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
.method public static final synthetic a(Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;)Lcom/kubi/kumex/market/v2/viewModel/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/market/v2/viewModel/b;->b(Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;)Lcom/kubi/kumex/market/v2/viewModel/c;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

.method public static final b(Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;)Lcom/kubi/kumex/market/v2/viewModel/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kumex/market/v2/viewModel/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;->isLowLiquidityPeriod()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;->getMarketSession()Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Lcom/kubi/kumex/market/v2/viewModel/c;-><init>(ZLjava/lang/String;)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method
