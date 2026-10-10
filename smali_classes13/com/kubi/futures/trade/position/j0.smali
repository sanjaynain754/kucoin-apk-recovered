.class public final Lcom/kubi/futures/trade/position/j0;
.super Ljava/lang/Object;
.source "FuturesPositionAggregateManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a2\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a(\u0010\t\u001a\u00020\n*\u00020\u00062\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000cH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "calculateEstPnlForOrder",
        "Lkotlin/Pair;",
        "",
        "order",
        "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "contract",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "toAggregateEntity",
        "Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;",
        "tpOrders",
        "",
        "slOrders",
        "logLong",
        "",
        "tag",
        "msg",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFuturesPositionAggregateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesPositionAggregateManager.kt\ncom/kubi/futures/trade/position/FuturesPositionAggregateManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1563#2:475\n1634#2,3:476\n1563#2:479\n1634#2,3:480\n*S KotlinDebug\n*F\n+ 1 FuturesPositionAggregateManager.kt\ncom/kubi/futures/trade/position/FuturesPositionAggregateManagerKt\n*L\n448#1:475\n448#1:476,3\n454#1:479\n454#1:480,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/util/List;Ljava/util/List;)Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/trade/position/j0;->d(Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/util/List;Ljava/util/List;)Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;

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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static final b(Lcom/kubi/kumex/data/trade/model/OrderEntity;Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lkotlin/Pair;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    new-instance p0, Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    if-eqz p0, :cond_12

    .line 16
    .line 17
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 21
    move-result v2

    .line 22
    .line 23
    if-gtz v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_d

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p1}, Lfm/d;->A(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Z

    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealLeverage()Ljava/math/BigDecimal;

    .line 36
    move-result-object v2

    .line 37
    goto :goto_4

    .line 38
    .line 39
    :cond_2
    sget-object v4, Luk/d;->a:Luk/d;

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 43
    move-result v2

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 51
    move-result v5

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 61
    move-result-object v2

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    move-object v2, v0

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {v2, v0, v3, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAvgEntryPrice()Ljava/math/BigDecimal;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 77
    move-result-object v2

    .line 78
    move-object v8, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move-object v8, v0

    .line 81
    .line 82
    .line 83
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 90
    move-result-object v2

    .line 91
    move-object v7, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    move-object v7, v0

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosInit()Ljava/math/BigDecimal;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    .line 102
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 103
    move-result-object v2

    .line 104
    move-object v9, v2

    .line 105
    goto :goto_3

    .line 106
    :cond_6
    move-object v9, v0

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-virtual/range {v4 .. v9}, Luk/d;->a(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 116
    move-result-object v2

    .line 117
    goto :goto_4

    .line 118
    :cond_7
    move-object v2, v0

    .line 119
    .line 120
    :goto_4
    sget-object v4, Luk/d;->a:Luk/d;

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 124
    move-result v5

    .line 125
    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    move-result-object v5

    .line 129
    .line 130
    .line 131
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 132
    move-result v5

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Lfm/d;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Z

    .line 136
    move-result v6

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAvgEntryPrice()Ljava/math/BigDecimal;

    .line 140
    move-result-object v7

    .line 141
    .line 142
    if-eqz v7, :cond_8

    .line 143
    .line 144
    .line 145
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 146
    move-result-object v7

    .line 147
    goto :goto_5

    .line 148
    :cond_8
    move-object v7, v0

    .line 149
    .line 150
    .line 151
    :goto_5
    invoke-static {p0}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 152
    move-result-object v9

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    .line 157
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 158
    move-result-object v2

    .line 159
    move-object v8, v2

    .line 160
    goto :goto_6

    .line 161
    :cond_9
    move-object v8, v0

    .line 162
    .line 163
    .line 164
    :goto_6
    invoke-virtual/range {v4 .. v9}, Luk/d;->d(ZZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 165
    move-result-object v2

    .line 166
    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    if-eqz v2, :cond_a

    .line 174
    .line 175
    new-instance v5, Ljava/math/BigDecimal;

    .line 176
    .line 177
    const-string v6, "100"

    .line 178
    .line 179
    .line 180
    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v5}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 184
    move-result-object v2

    .line 185
    goto :goto_7

    .line 186
    :cond_a
    move-object v2, v0

    .line 187
    .line 188
    .line 189
    :goto_7
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 190
    move-result v5

    .line 191
    .line 192
    .line 193
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 194
    move-result-object v5

    .line 195
    .line 196
    .line 197
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 198
    move-result v5

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 202
    move-result-object v6

    .line 203
    .line 204
    if-eqz v6, :cond_b

    .line 205
    .line 206
    .line 207
    invoke-static {v6}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 208
    move-result-object v6

    .line 209
    goto :goto_8

    .line 210
    :cond_b
    move-object v6, v0

    .line 211
    .line 212
    .line 213
    :goto_8
    invoke-static {v6, v0, v3, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 214
    move-result-object v6

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAvgEntryPrice()Ljava/math/BigDecimal;

    .line 218
    move-result-object v3

    .line 219
    .line 220
    if-eqz v3, :cond_c

    .line 221
    .line 222
    .line 223
    invoke-static {v3}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 224
    move-result-object v3

    .line 225
    move-object v7, v3

    .line 226
    goto :goto_9

    .line 227
    :cond_c
    move-object v7, v0

    .line 228
    .line 229
    .line 230
    :goto_9
    invoke-static {p0}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 231
    move-result-object v8

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 235
    move-result-object p0

    .line 236
    .line 237
    if-eqz p0, :cond_d

    .line 238
    .line 239
    .line 240
    invoke-static {p0}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 241
    move-result-object p0

    .line 242
    move-object v9, p0

    .line 243
    goto :goto_a

    .line 244
    :cond_d
    move-object v9, v0

    .line 245
    .line 246
    .line 247
    :goto_a
    invoke-virtual/range {v4 .. v9}, Luk/d;->b(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 248
    move-result-object p0

    .line 249
    .line 250
    if-eqz p0, :cond_e

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 254
    move-result-object p0

    .line 255
    move-object v3, p0

    .line 256
    goto :goto_b

    .line 257
    :cond_e
    move-object v3, v0

    .line 258
    .line 259
    :goto_b
    if-eqz v3, :cond_f

    .line 260
    .line 261
    .line 262
    invoke-static/range {p2 .. p2}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 263
    move-result v5

    .line 264
    .line 265
    const/16 v11, 0x61

    .line 266
    const/4 v12, 0x0

    .line 267
    const/4 v4, 0x0

    .line 268
    const/4 v6, 0x1

    .line 269
    const/4 v7, 0x1

    .line 270
    const/4 v8, 0x1

    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    .line 274
    .line 275
    invoke-static/range {v3 .. v12}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 276
    move-result-object p0

    .line 277
    goto :goto_c

    .line 278
    :cond_f
    move-object p0, v0

    .line 279
    .line 280
    :goto_c
    if-eqz v3, :cond_10

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 284
    move-result v1

    .line 285
    .line 286
    if-lez v1, :cond_10

    .line 287
    .line 288
    if-eqz p0, :cond_10

    .line 289
    .line 290
    new-instance v1, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    const/16 v3, 0x2b

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    move-result-object p0

    .line 306
    .line 307
    :cond_10
    if-eqz v2, :cond_11

    .line 308
    .line 309
    const/16 v12, 0x37

    .line 310
    const/4 v13, 0x0

    .line 311
    const/4 v6, 0x0

    .line 312
    const/4 v7, 0x0

    .line 313
    const/4 v8, 0x0

    .line 314
    const/4 v9, 0x1

    .line 315
    const/4 v10, 0x0

    .line 316
    const/4 v11, 0x0

    .line 317
    move-object v5, v2

    .line 318
    .line 319
    .line 320
    invoke-static/range {v5 .. v13}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 321
    move-result-object v0

    .line 322
    .line 323
    :cond_11
    new-instance v1, Lkotlin/Pair;

    .line 324
    .line 325
    .line 326
    invoke-direct {v1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 327
    return-object v1

    .line 328
    .line 329
    :cond_12
    :goto_d
    new-instance p0, Lkotlin/Pair;

    .line 330
    .line 331
    .line 332
    invoke-direct {p0, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 333
    return-object p0
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "tag"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "msg"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    :goto_0
    if-ge v1, v0, :cond_0

    .line 18
    .line 19
    add-int/lit16 v2, v1, 0xbb8

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 23
    move-result v2

    .line 24
    .line 25
    sget-object v3, Lcom/kubi/kumex/utils/v;->a:Lcom/kubi/kumex/utils/v;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const-string v4, "substring(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, p0, v1}, Lcom/kubi/kumex/utils/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    move v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
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
.end method

.method public static final d(Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/util/List;Ljava/util/List;)Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;
    .locals 74
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;)",
            "Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lfm/d;->b(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lfm/b;->m(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 13
    move-result v3

    .line 14
    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v3, v2

    .line 20
    :goto_0
    const/4 v4, 0x2

    .line 21
    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 24
    move-result v7

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lfm/b;->j(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 40
    move-result-object v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v3, v2

    .line 43
    .line 44
    :cond_2
    :goto_1
    sget-object v5, Lji/a;->a:Lji/a;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Lji/a;->c()Z

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lfm/d;->J(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/math/BigDecimal;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lfm/d;->K(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/math/BigDecimal;

    .line 55
    move-result-object v15

    .line 56
    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    const/16 v13, 0x61

    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v8, 0x1

    .line 63
    const/4 v9, 0x1

    .line 64
    const/4 v10, 0x1

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    if-eqz v6, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-static {v6}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-static {v6}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v6

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v6, v2

    .line 85
    .line 86
    :goto_2
    if-eqz v5, :cond_4

    .line 87
    .line 88
    sget-object v8, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 92
    move-result v5

    .line 93
    .line 94
    if-lez v5, :cond_4

    .line 95
    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    new-instance v5, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    const/16 v8, 0x2b

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    move-result-object v6

    .line 114
    .line 115
    :cond_4
    const-string v5, "--"

    .line 116
    .line 117
    .line 118
    invoke-static {v6, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    move-result-object v17

    .line 120
    .line 121
    if-eqz v15, :cond_8

    .line 122
    .line 123
    new-instance v6, Ljava/math/BigDecimal;

    .line 124
    .line 125
    const/16 v8, 0x64

    .line 126
    .line 127
    .line 128
    invoke-direct {v6, v8}, Ljava/math/BigDecimal;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v15, v6}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 132
    move-result-object v6

    .line 133
    const/4 v8, 0x1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v4, v8}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 137
    move-result-object v6

    .line 138
    .line 139
    sget-object v8, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 143
    move-result v9

    .line 144
    .line 145
    if-lez v9, :cond_5

    .line 146
    .line 147
    const-string v8, "+"

    .line 148
    goto :goto_3

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v15, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 152
    move-result v8

    .line 153
    .line 154
    if-gez v8, :cond_6

    .line 155
    .line 156
    const-string v8, "-"

    .line 157
    goto :goto_3

    .line 158
    .line 159
    :cond_6
    const-string v8, ""

    .line 160
    .line 161
    :goto_3
    new-instance v9, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 171
    move-result-object v6

    .line 172
    .line 173
    .line 174
    invoke-static {v6}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 175
    move-result-object v6

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 179
    move-result-object v6

    .line 180
    .line 181
    .line 182
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const/16 v6, 0x25

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    move-result-object v6

    .line 192
    .line 193
    if-nez v6, :cond_7

    .line 194
    goto :goto_4

    .line 195
    .line 196
    :cond_7
    move-object/from16 v18, v6

    .line 197
    move-object v6, v5

    .line 198
    goto :goto_5

    .line 199
    :cond_8
    :goto_4
    move-object v6, v5

    .line 200
    .line 201
    move-object/from16 v18, v6

    .line 202
    .line 203
    .line 204
    :goto_5
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 205
    move-result-object v5

    .line 206
    .line 207
    if-eqz v5, :cond_9

    .line 208
    .line 209
    const/16 v13, 0x61

    .line 210
    const/4 v14, 0x0

    .line 211
    move-object v8, v6

    .line 212
    const/4 v6, 0x0

    .line 213
    move-object v9, v8

    .line 214
    const/4 v8, 0x1

    .line 215
    move-object v10, v9

    .line 216
    const/4 v9, 0x1

    .line 217
    move-object v11, v10

    .line 218
    const/4 v10, 0x1

    .line 219
    move-object v12, v11

    .line 220
    const/4 v11, 0x0

    .line 221
    move-object v15, v12

    .line 222
    const/4 v12, 0x0

    .line 223
    .line 224
    .line 225
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 226
    move-result-object v5

    .line 227
    .line 228
    if-eqz v5, :cond_9

    .line 229
    .line 230
    .line 231
    invoke-static {v5}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    move-result-object v8

    .line 233
    .line 234
    if-eqz v8, :cond_9

    .line 235
    .line 236
    .line 237
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    move-result-object v9

    .line 239
    const/4 v12, 0x4

    .line 240
    const/4 v13, 0x0

    .line 241
    const/4 v10, 0x1

    .line 242
    const/4 v11, 0x0

    .line 243
    .line 244
    .line 245
    invoke-static/range {v8 .. v13}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 246
    move-result-object v3

    .line 247
    .line 248
    if-eqz v3, :cond_9

    .line 249
    .line 250
    .line 251
    invoke-static {v3}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    move-result-object v3

    .line 253
    .line 254
    if-eqz v3, :cond_9

    .line 255
    .line 256
    .line 257
    invoke-static {v3, v15}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    :cond_9
    new-instance v16, Lcom/kubi/futures/trade/position/KLineShowEntity;

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v1}, Lfm/d;->e(Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 263
    move-result-object v19

    .line 264
    .line 265
    .line 266
    invoke-static {v0}, Lfm/d;->d(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/lang/String;

    .line 267
    move-result-object v20

    .line 268
    .line 269
    .line 270
    invoke-static {v0, v1}, Lfm/d;->k(Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 271
    move-result-object v21

    .line 272
    .line 273
    .line 274
    invoke-static {v0, v1, v2, v4, v2}, Lfm/d;->n(Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;Lki/a;ILjava/lang/Object;)Ljava/lang/String;

    .line 275
    move-result-object v22

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMaintMargin()Ljava/math/BigDecimal;

    .line 279
    move-result-object v5

    .line 280
    .line 281
    if-eqz v5, :cond_a

    .line 282
    .line 283
    const/16 v13, 0x7d

    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v6, 0x0

    .line 286
    const/4 v8, 0x0

    .line 287
    const/4 v9, 0x0

    .line 288
    const/4 v10, 0x0

    .line 289
    const/4 v11, 0x0

    .line 290
    const/4 v12, 0x0

    .line 291
    .line 292
    .line 293
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 294
    move-result-object v2

    .line 295
    .line 296
    :cond_a
    move-object/from16 v23, v2

    .line 297
    .line 298
    .line 299
    invoke-direct/range {v16 .. v23}, Lcom/kubi/futures/trade/position/KLineShowEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getId()Ljava/lang/String;

    .line 303
    move-result-object v20

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 307
    move-result-object v21

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isOpen()Ljava/lang/Boolean;

    .line 311
    move-result-object v22

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAutoDeposit()Ljava/lang/Boolean;

    .line 315
    move-result-object v23

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAvgEntryPrice()Ljava/math/BigDecimal;

    .line 319
    move-result-object v25

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentCost()Ljava/math/BigDecimal;

    .line 323
    move-result-object v26

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 327
    move-result-object v27

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getDelevPercentage()Ljava/math/BigDecimal;

    .line 331
    move-result-object v28

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getLiquidationPrice()Ljava/math/BigDecimal;

    .line 335
    move-result-object v29

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMaintMargin()Ljava/math/BigDecimal;

    .line 339
    move-result-object v30

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarkPrice()Ljava/math/BigDecimal;

    .line 343
    move-result-object v31

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarkValue()Ljava/math/BigDecimal;

    .line 347
    move-result-object v32

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getOpeningTimestamp()Ljava/lang/Long;

    .line 351
    move-result-object v33

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosComm()Ljava/math/BigDecimal;

    .line 355
    move-result-object v34

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 359
    move-result-object v35

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCross()Ljava/math/BigDecimal;

    .line 363
    move-result-object v36

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosInit()Ljava/math/BigDecimal;

    .line 367
    move-result-object v37

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosLoss()Ljava/math/BigDecimal;

    .line 371
    move-result-object v38

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMaint()Ljava/math/BigDecimal;

    .line 375
    move-result-object v39

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAggRate()Ljava/math/BigDecimal;

    .line 379
    move-result-object v40

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 383
    move-result-object v41

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealLeverage()Ljava/math/BigDecimal;

    .line 387
    move-result-object v42

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealisedGrossCost()Ljava/math/BigDecimal;

    .line 391
    move-result-object v43

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealisedGrossPnl()Ljava/math/BigDecimal;

    .line 395
    move-result-object v44

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 399
    move-result-object v45

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRiskLimit()Ljava/math/BigDecimal;

    .line 403
    move-result-object v46

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getUnrealisedPnl()Ljava/math/BigDecimal;

    .line 407
    move-result-object v47

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getUnrealisedRoePcnt()Ljava/math/BigDecimal;

    .line 411
    move-result-object v48

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 415
    move-result-object v49

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 419
    move-result v50

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPrizeType()Ljava/lang/String;

    .line 423
    move-result-object v51

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getTrialCoupon()Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;

    .line 427
    move-result-object v52

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarginMode()Ljava/lang/String;

    .line 431
    move-result-object v53

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRiskRatio()Ljava/math/BigDecimal;

    .line 435
    move-result-object v54

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCrossIMR()Ljava/math/BigDecimal;

    .line 439
    move-result-object v55

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCrossMMR()Ljava/math/BigDecimal;

    .line 443
    move-result-object v56

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAdjustCrossIMR()Ljava/math/BigDecimal;

    .line 447
    move-result-object v57

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAdjustCrossMMR()Ljava/math/BigDecimal;

    .line 451
    move-result-object v58

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getLatestPrice()Ljava/math/BigDecimal;

    .line 455
    move-result-object v59

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getLatestUnrealisedPnl()Ljava/math/BigDecimal;

    .line 459
    move-result-object v60

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getLatestUnrealisedRoePcnt()Ljava/math/BigDecimal;

    .line 463
    move-result-object v61

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getWithdrawPnl()Ljava/math/BigDecimal;

    .line 467
    move-result-object v62

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getDealComm()Ljava/math/BigDecimal;

    .line 471
    move-result-object v63

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getFundingFee()Ljava/math/BigDecimal;

    .line 475
    move-result-object v64

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getTax()Ljava/math/BigDecimal;

    .line 479
    move-result-object v65

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 483
    move-result-object v66

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getBestAskPrice()Ljava/math/BigDecimal;

    .line 487
    move-result-object v67

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getBestBidPrice()Ljava/math/BigDecimal;

    .line 491
    move-result-object v68

    .line 492
    .line 493
    new-instance v2, Ljava/util/ArrayList;

    .line 494
    .line 495
    const/16 v3, 0xa

    .line 496
    .line 497
    move-object/from16 v4, p1

    .line 498
    .line 499
    .line 500
    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 501
    move-result v5

    .line 502
    .line 503
    .line 504
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 508
    move-result-object v4

    .line 509
    .line 510
    .line 511
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    move-result v5

    .line 513
    .line 514
    if-eqz v5, :cond_b

    .line 515
    .line 516
    .line 517
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 518
    move-result-object v5

    .line 519
    .line 520
    check-cast v5, Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 521
    .line 522
    .line 523
    invoke-static {v5, v0, v1}, Lcom/kubi/futures/trade/position/j0;->b(Lcom/kubi/kumex/data/trade/model/OrderEntity;Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lkotlin/Pair;

    .line 524
    move-result-object v6

    .line 525
    .line 526
    .line 527
    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 528
    move-result-object v7

    .line 529
    .line 530
    check-cast v7, Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 534
    move-result-object v6

    .line 535
    .line 536
    check-cast v6, Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v5, v7}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setEstPnl(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v5, v6}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setEstPnlRate(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 546
    goto :goto_6

    .line 547
    .line 548
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    .line 549
    .line 550
    move-object/from16 v5, p2

    .line 551
    .line 552
    .line 553
    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 554
    move-result v3

    .line 555
    .line 556
    .line 557
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 558
    .line 559
    .line 560
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 561
    move-result-object v3

    .line 562
    .line 563
    .line 564
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    move-result v5

    .line 566
    .line 567
    if-eqz v5, :cond_c

    .line 568
    .line 569
    .line 570
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    move-result-object v5

    .line 572
    .line 573
    check-cast v5, Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 574
    .line 575
    .line 576
    invoke-static {v5, v0, v1}, Lcom/kubi/futures/trade/position/j0;->b(Lcom/kubi/kumex/data/trade/model/OrderEntity;Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lkotlin/Pair;

    .line 577
    move-result-object v6

    .line 578
    .line 579
    .line 580
    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 581
    move-result-object v7

    .line 582
    .line 583
    check-cast v7, Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 587
    move-result-object v6

    .line 588
    .line 589
    check-cast v6, Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5, v7}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setEstPnl(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v5, v6}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setEstPnlRate(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 599
    goto :goto_7

    .line 600
    .line 601
    :cond_c
    new-instance v0, Lcom/kubi/futures/trade/position/TpslOrderData;

    .line 602
    .line 603
    .line 604
    invoke-direct {v0, v2, v4}, Lcom/kubi/futures/trade/position/TpslOrderData;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 605
    .line 606
    new-instance v19, Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;

    .line 607
    .line 608
    const/16 v24, 0x0

    .line 609
    .line 610
    const/16 v71, 0x10

    .line 611
    .line 612
    const/16 v72, 0x0

    .line 613
    .line 614
    const/16 v73, 0x0

    .line 615
    .line 616
    move-object/from16 v69, v0

    .line 617
    .line 618
    move-object/from16 v70, v16

    .line 619
    .line 620
    .line 621
    invoke-direct/range {v19 .. v73}, Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/futures/trade/position/TpslOrderData;Lcom/kubi/futures/trade/position/KLineShowEntity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 622
    return-object v19
.end method
