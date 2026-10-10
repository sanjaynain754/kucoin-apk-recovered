.class public final Lpe/h;
.super Ljava/lang/Object;
.source "SpotSegmentTradeInputIntercept.kt"

# interfaces
.implements Lpe/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JV\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/holder/intercept/input/SpotSegmentTradeInputIntercept;",
        "Lcom/kubi/core/spot/business/holder/intercept/input/ISegmentTradeInputIntercept;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "checkInterceptFailed",
        "",
        "parentBehavior",
        "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;",
        "priceMin",
        "Ljava/math/BigDecimal;",
        "priceMax",
        "orderCount",
        "",
        "totalQty",
        "avgPrice",
        "segmentDistributionType",
        "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;",
        "hasMinQtyError",
        "onMinQtyError",
        "Lkotlin/Function0;",
        "",
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


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lpe/h;->a:Landroid/content/Context;

    .line 11
    return-void
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method


# virtual methods
.method public a(Lcom/kubi/core/spot/business/holder/f0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradebase/api/segment/SegmentDistributionType;ZLkotlin/jvm/functions/Function0;)Z
    .locals 21
    .param p1    # Lcom/kubi/core/spot/business/holder/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/kubi/tradebase/api/segment/SegmentDistributionType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/core/spot/business/holder/f0;",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "I",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v4, p2

    move-object/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v6, p5

    move-object/from16 v2, p7

    const-string v3, "parentBehavior"

    move-object/from16 v5, p1

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "priceMin"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "priceMax"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "totalQty"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "avgPrice"

    move-object/from16 v7, p6

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "segmentDistributionType"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onMinQtyError"

    move-object/from16 v7, p9

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    invoke-virtual {v4, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v8

    const/4 v9, 0x1

    if-gtz v8, :cond_0

    .line 2
    sget v0, Lcom/kubi/tradecorebiz/R$string;->kumex_segment_input_mini_price:I

    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    return v9

    .line 3
    :cond_0
    invoke-virtual {v0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v8

    if-gtz v8, :cond_1

    .line 4
    sget v0, Lcom/kubi/tradecorebiz/R$string;->kumex_segment_input_max_price:I

    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    return v9

    .line 5
    :cond_1
    invoke-virtual {v0, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v0

    if-gtz v0, :cond_2

    .line 6
    sget v0, Lcom/kubi/tradecorebiz/R$string;->kumex_segment_input_price_verification:I

    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    return v9

    :cond_2
    if-gtz v1, :cond_3

    .line 7
    sget v0, Lcom/kubi/tradecorebiz/R$string;->kumex_segment_input_order_num:I

    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    return v9

    :cond_3
    const/4 v0, 0x2

    if-lt v1, v0, :cond_4

    const/16 v0, 0x14

    if-le v1, v0, :cond_5

    :cond_4
    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 8
    :cond_5
    invoke-virtual {v6, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v0

    if-gtz v0, :cond_6

    .line 9
    sget v0, Lcom/kubi/tradecorebiz/R$string;->otc_ad_supply_amount_hint:I

    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    return v9

    .line 10
    :cond_6
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    move-result-object v8

    new-instance v10, Ljava/math/BigDecimal;

    .line 11
    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 12
    sget-object v0, Lj30/c;->a:Lj30/c;

    .line 13
    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    move-result v3

    .line 14
    invoke-virtual {v0, v1, v2, v10, v3}, Lj30/c;->i(ILcom/kubi/tradebase/api/segment/SegmentDistributionType;Ljava/math/BigDecimal;I)Ljava/math/BigDecimal;

    move-result-object v11

    new-instance v3, Ljava/math/BigDecimal;

    .line 15
    sget-object v5, Lgf/n;->a:Lgf/n;

    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Lgf/n;->z(Ljava/lang/String;)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    move-result v5

    .line 17
    invoke-virtual/range {v0 .. v5}, Lj30/c;->j(ILcom/kubi/tradebase/api/segment/SegmentDistributionType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Ljava/math/BigDecimal;

    move-result-object v0

    .line 18
    invoke-virtual {v11, v0}, Ljava/math/BigDecimal;->max(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/math/BigDecimal;->max(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v11

    .line 19
    invoke-virtual {v6, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_7

    move-object/from16 v0, p0

    .line 20
    iget-object v2, v0, Lpe/h;->a:Landroid/content/Context;

    .line 21
    sget v3, Lcom/kubi/tradecorebiz/R$string;->futures_min_quantity_for_make_order:I

    .line 22
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    move-result v13

    const/16 v19, 0x7d

    const/16 v20, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 23
    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    .line 24
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    .line 25
    invoke-static {v2, v1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    sget-object v1, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker;->a:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;

    .line 27
    sget-object v2, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;->CHECK_NUM_RANGE:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;

    .line 28
    sget-object v3, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->NUM_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 29
    invoke-virtual {v1, v2, v3}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;->trackSpotOrderFail(Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;)V

    return v9

    :cond_7
    move-object/from16 v0, p0

    if-eqz p8, :cond_8

    .line 30
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return v9

    :cond_8
    return v1

    :goto_0
    return v9
.end method
