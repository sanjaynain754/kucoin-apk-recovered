.class public final Lcom/kubi/futures/trade/position/vm/t1;
.super Lcom/kubi/futures/trade/position/vm/b0;
.source "MarketClosePositionViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/vm/MarketClosePositionViewModel;",
        "Lcom/kubi/futures/trade/position/vm/BaseClosePositionViewModel;",
        "<init>",
        "()V",
        "createOrderRequest",
        "Lcom/kubi/kumex/request/OrderRequest;",
        "price",
        "Ljava/math/BigDecimal;",
        "qty",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "KumexLib_googleRelease"
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
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/vm/b0;-><init>()V

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
.end method


# virtual methods
.method public H(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lsm/a;
    .locals 34
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/kumex/data/trade/model/PositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "qty"

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "position"

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    new-instance v3, Lsm/a;

    .line 17
    .line 18
    .line 19
    const v32, 0xfffffff

    .line 20
    .line 21
    const/16 v33, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v15, 0x0

    .line 34
    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    const/16 v18, 0x0

    .line 40
    .line 41
    const/16 v19, 0x0

    .line 42
    .line 43
    const/16 v20, 0x0

    .line 44
    .line 45
    const/16 v21, 0x0

    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    const/16 v23, 0x0

    .line 50
    .line 51
    const/16 v24, 0x0

    .line 52
    .line 53
    const/16 v25, 0x0

    .line 54
    .line 55
    const/16 v26, 0x0

    .line 56
    .line 57
    const/16 v27, 0x0

    .line 58
    .line 59
    const/16 v28, 0x0

    .line 60
    .line 61
    const/16 v29, 0x0

    .line 62
    .line 63
    const/16 v30, 0x0

    .line 64
    .line 65
    const/16 v31, 0x0

    .line 66
    .line 67
    .line 68
    invoke-direct/range {v3 .. v33}, Lsm/a;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v0}, Lsm/a;->y(Ljava/lang/String;)V

    .line 76
    .line 77
    const-wide/16 v4, 0x1

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v5}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    const-string v4, "valueOf(...)"

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v0}, Lsm/a;->o(Ljava/math/BigDecimal;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lfm/d;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Z

    .line 93
    move-result v0

    .line 94
    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    const-string v0, "sell"

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_0
    const-string v0, "buy"

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {v3, v0}, Lsm/a;->v(Ljava/lang/String;)V

    .line 104
    .line 105
    const-string v0, "market"

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v0}, Lsm/a;->r(Ljava/lang/String;)V

    .line 109
    .line 110
    move-object/from16 v0, p1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v0}, Lsm/a;->n(Ljava/math/BigDecimal;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 133
    move-result v0

    .line 134
    .line 135
    if-ltz v0, :cond_1

    .line 136
    const/4 v0, 0x0

    .line 137
    goto :goto_1

    .line 138
    .line 139
    .line 140
    :cond_1
    invoke-virtual {v1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-virtual {v3, v0}, Lsm/a;->m(Ljava/math/BigDecimal;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarginMode()Ljava/lang/String;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v0}, Lsm/a;->q(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v0}, Lsm/a;->s(Ljava/lang/String;)V

    .line 159
    return-object v3
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method
