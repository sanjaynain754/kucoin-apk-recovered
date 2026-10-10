.class public final Lcom/kubi/tradingbotkit/business/strategyList/b;
.super Ljava/lang/Object;
.source "StrategyAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "isFuturesStrategy",
        "",
        "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;",
        "TradingBotKitLib_googleRelease"
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
.method public static final a(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Z
    .locals 2
    .param p0    # Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    move-result v0

    .line 17
    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    if-eq v0, v1, :cond_5

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    move-result v0

    .line 32
    .line 33
    const/16 v1, 0x9

    .line 34
    .line 35
    if-eq v0, v1, :cond_5

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    goto :goto_2

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 46
    move-result v0

    .line 47
    const/4 v1, 0x3

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    if-nez p0, :cond_3

    .line 56
    goto :goto_3

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 60
    move-result p0

    .line 61
    .line 62
    const/16 v0, 0xd

    .line 63
    .line 64
    if-ne p0, v0, :cond_4

    .line 65
    goto :goto_4

    .line 66
    :cond_4
    :goto_3
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_5
    :goto_4
    const/4 p0, 0x1

    .line 69
    return p0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
