.class public final Lle/a;
.super Ljava/lang/Object;
.source "CallAuctionEstimateInfoMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/callAuction/mapper/CallAuctionEstimateInfoMapper;",
        "Lcom/kubi/core/spot/business/callAuction/mapper/IMapper;",
        "Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;",
        "Lcom/kubi/core/spot/business/callAuction/bean/CallAuctionInfo;",
        "<init>",
        "()V",
        "map",
        "input",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
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
    .line 129
    .line 130
    .line 131
    .line 132
.end method


# virtual methods
.method public a(Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;)Lke/a;
    .locals 27
    .param p1    # Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    new-instance v1, Lke/a;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lke/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getEstimatedDealPrice()Ljava/math/BigDecimal;

    move-result-object v2

    const/16 v14, 0x8

    if-eqz v2, :cond_2

    .line 3
    sget-object v3, Lgf/n;->a:Lgf/n;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    invoke-static {v3, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v4

    const/16 v12, 0x1fd

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 4
    invoke-static/range {v2 .. v13}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v0

    .line 5
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Lke/a;->j(Ljava/lang/String;)V

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getEstimatedDealSize()Ljava/math/BigDecimal;

    move-result-object v15

    if-eqz v15, :cond_4

    .line 8
    sget-object v2, Lgf/n;->a:Lgf/n;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v0

    :goto_2
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v17

    const/16 v25, 0x1fd

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 9
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v0

    .line 10
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Lke/a;->k(Ljava/lang/String;)V

    .line 12
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getLowestBuyDeclaredPrice()Ljava/math/BigDecimal;

    move-result-object v15

    if-eqz v15, :cond_6

    .line 13
    sget-object v2, Lgf/n;->a:Lgf/n;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_4

    :cond_5
    move-object v2, v0

    :goto_4
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v17

    const/16 v25, 0x1fd

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 14
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_6
    move-object v2, v0

    .line 15
    :goto_5
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Lke/a;->h(Ljava/lang/String;)V

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getHighestBuyDeclaredPrice()Ljava/math/BigDecimal;

    move-result-object v15

    if-eqz v15, :cond_8

    .line 18
    sget-object v2, Lgf/n;->a:Lgf/n;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_6

    :cond_7
    move-object v2, v0

    :goto_6
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v17

    const/16 v25, 0x1fd

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 19
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_8
    move-object v2, v0

    .line 20
    :goto_7
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Lke/a;->i(Ljava/lang/String;)V

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getLowestSellDeclaredPrice()Ljava/math/BigDecimal;

    move-result-object v15

    if-eqz v15, :cond_a

    .line 23
    sget-object v2, Lgf/n;->a:Lgf/n;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_8

    :cond_9
    move-object v2, v0

    :goto_8
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v17

    const/16 v25, 0x1fd

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 24
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_9

    :cond_a
    move-object v2, v0

    .line 25
    :goto_9
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Lke/a;->l(Ljava/lang/String;)V

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getHighestSellDeclaredPrice()Ljava/math/BigDecimal;

    move-result-object v15

    if-eqz v15, :cond_c

    .line 28
    sget-object v2, Lgf/n;->a:Lgf/n;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_b
    invoke-static {v0, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v17

    const/16 v25, 0x1fd

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 29
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 30
    :cond_c
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {v1, v0}, Lke/a;->m(Ljava/lang/String;)V

    return-object v1
.end method
