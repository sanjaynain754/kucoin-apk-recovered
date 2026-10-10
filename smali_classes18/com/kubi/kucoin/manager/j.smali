.class public final Lcom/kubi/kucoin/manager/j;
.super Ljava/lang/Object;
.source "MarketFutureContractPbWsApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "FUTURE_SNAPSHORT_PB_PREFIX",
        "",
        "buildMarketSnapshotV2PbWsApi",
        "Lcom/kubi/kucoin/manager/IMarketSnapShortPbWsApi;",
        "toWsFutureSnapshotEntity",
        "Lcom/kubi/data/entity/WsFutureSnapshotEntity;",
        "Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;",
        "LDataProvider_googleRelease"
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
.method public static final a()Lcom/kubi/kucoin/manager/c;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/restful/b$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/network/restful/b$a;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lgr/b;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ler/b;->b()Ler/a;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Lgr/b;-><init>(Ler/a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->b(Lkr/b;)Lcom/kubi/network/restful/b$a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    new-instance v1, Lgr/e;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Lgr/e;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->c(Lkr/d;)Lcom/kubi/network/restful/b$a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/network/restful/b$a;->a()Lcom/kubi/network/restful/b;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-class v1, Lcom/kubi/kucoin/manager/c;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    check-cast v0, Lcom/kubi/kucoin/manager/c;

    .line 40
    return-object v0
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
.end method

.method public static final b(Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;)Lcom/kubi/data/entity/WsFutureSnapshotEntity;
    .locals 19
    .param p0    # Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;
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
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/data/entity/WsFutureSnapshotEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getSymbol()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    const-string v0, "getSymbol(...)"

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getVolume()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v3, "getVolume(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 37
    move-result-wide v5

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getTurnover()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    const-string v7, "getTurnover(...)"

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 59
    move-result-wide v7

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_1
    const-wide/16 v7, 0x0

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getLastPrice()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    const-string v9, "getLastPrice(...)"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 81
    move-result-wide v9

    .line 82
    goto :goto_2

    .line 83
    .line 84
    :cond_2
    const-wide/16 v9, 0x0

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getLowPrice()Ljava/lang/String;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    const-string v11, "getLowPrice(...)"

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 103
    move-result-wide v11

    .line 104
    goto :goto_3

    .line 105
    .line 106
    :cond_3
    const-wide/16 v11, 0x0

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getHighPrice()Ljava/lang/String;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    const-string v13, "getHighPrice(...)"

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 125
    move-result-wide v13

    .line 126
    goto :goto_4

    .line 127
    .line 128
    :cond_4
    const-wide/16 v13, 0x0

    .line 129
    .line 130
    .line 131
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getPriceChg()Ljava/lang/String;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    const-string v15, "getPriceChg(...)"

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 147
    move-result-wide v15

    .line 148
    goto :goto_5

    .line 149
    .line 150
    :cond_5
    const-wide/16 v15, 0x0

    .line 151
    .line 152
    .line 153
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;->getPriceChgPct()Ljava/lang/String;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    const-string v3, "getPriceChgPct(...)"

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 169
    move-result-wide v3

    .line 170
    .line 171
    move-wide/from16 v17, v15

    .line 172
    move-wide v15, v3

    .line 173
    move-wide v3, v5

    .line 174
    move-wide v5, v7

    .line 175
    move-wide v7, v9

    .line 176
    move-wide v9, v11

    .line 177
    move-wide v11, v13

    .line 178
    .line 179
    move-wide/from16 v13, v17

    .line 180
    goto :goto_6

    .line 181
    :cond_6
    move-wide v3, v5

    .line 182
    move-wide v5, v7

    .line 183
    move-wide v7, v9

    .line 184
    move-wide v9, v11

    .line 185
    move-wide v11, v13

    .line 186
    move-wide v13, v15

    .line 187
    .line 188
    const-wide/16 v15, 0x0

    .line 189
    .line 190
    .line 191
    :goto_6
    invoke-direct/range {v1 .. v16}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;-><init>(Ljava/lang/String;DDDDDDD)V

    .line 192
    return-object v1
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
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
.end method
