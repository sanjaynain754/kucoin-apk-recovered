.class public final Lcv/e;
.super Ljava/lang/Object;
.source "RankEntity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "convert",
        "Lcom/kubi/quotefacade/entity/RankEntity;",
        "input",
        "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;",
        "QuoteFacadeLib_googleRelease"
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
.method public static final a(Lcom/kubi/quotefacade/entity/RankEntity;Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;)Lcom/kubi/quotefacade/entity/RankEntity;
    .locals 1
    .param p0    # Lcom/kubi/quotefacade/entity/RankEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "input"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getOrder()Ljava/lang/Integer;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setOrder(Ljava/lang/Integer;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getCurrency()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setCurrency(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getSymbol()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setSymbol(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getSymbolCode()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setSymbolCode(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getQuote()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setQuote(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getChangeRate()Ljava/math/BigDecimal;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setChangeRate(Ljava/math/BigDecimal;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getPrice()Ljava/math/BigDecimal;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setPrice(Ljava/math/BigDecimal;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getValue()Ljava/math/BigDecimal;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setValue(Ljava/math/BigDecimal;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getMarkCap()Ljava/math/BigDecimal;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setMarkCap(Ljava/math/BigDecimal;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getVolValue()Ljava/math/BigDecimal;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setVolValue(Ljava/math/BigDecimal;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getOpeningTime()Ljava/lang/Long;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setOpeningTime(Ljava/lang/Long;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getInverseSymbol()Ljava/lang/Boolean;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/entity/RankEntity;->setInverseSymbol(Ljava/lang/Boolean;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;->getIconUrl()Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/RankEntity;->setIconUrl(Ljava/lang/String;)V

    .line 102
    return-object p0
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method
