.class public final Lj20/b;
.super Ljava/lang/Object;
.source "CallAuctionEstimateInfoMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/spot/business/callAuction/mapper/CallAuctionEstimateInfoMapper;",
        "Lcom/kubi/spot/business/callAuction/mapper/IMapper;",
        "Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;",
        "Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;",
        "<init>",
        "()V",
        "map",
        "input",
        "SpotLib_googleRelease"
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
.end method


# virtual methods
.method public a(Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;)Li20/a;
    .locals 27
    .param p1    # Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    new-instance v1, Li20/a;

    .line 7
    .line 8
    const/16 v8, 0x3f

    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v1 .. v9}, Li20/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getEstimatedDealPrice()Ljava/math/BigDecimal;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    const/16 v14, 0x8

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    sget-object v3, Lgf/n;->a:Lgf/n;

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v4}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 52
    move-result v3

    .line 53
    .line 54
    .line 55
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object v3

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object v3, v0

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-static {v3, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 62
    move-result v4

    .line 63
    .line 64
    const/16 v12, 0x1fd

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static/range {v2 .. v13}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 77
    move-result-object v2

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-object v2, v0

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Li20/a;->j(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getEstimatedDealSize()Ljava/math/BigDecimal;

    .line 90
    move-result-object v15

    .line 91
    .line 92
    if-eqz v15, :cond_4

    .line 93
    .line 94
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 106
    move-result-object v2

    .line 107
    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    if-eqz v2, :cond_3

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 118
    move-result v2

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    move-result-object v2

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    move-object v2, v0

    .line 125
    .line 126
    .line 127
    :goto_2
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 128
    move-result v17

    .line 129
    .line 130
    const/16 v25, 0x1fd

    .line 131
    .line 132
    const/16 v26, 0x0

    .line 133
    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const/16 v19, 0x0

    .line 139
    .line 140
    const/16 v20, 0x0

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const/16 v22, 0x0

    .line 145
    .line 146
    const/16 v23, 0x0

    .line 147
    .line 148
    const/16 v24, 0x0

    .line 149
    .line 150
    .line 151
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 152
    move-result-object v2

    .line 153
    goto :goto_3

    .line 154
    :cond_4
    move-object v2, v0

    .line 155
    .line 156
    .line 157
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Li20/a;->k(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getLowestBuyDeclaredPrice()Ljava/math/BigDecimal;

    .line 165
    move-result-object v15

    .line 166
    .line 167
    if-eqz v15, :cond_6

    .line 168
    .line 169
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    move-result-object v3

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 181
    move-result-object v2

    .line 182
    .line 183
    if-eqz v2, :cond_5

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    if-eqz v2, :cond_5

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 193
    move-result v2

    .line 194
    .line 195
    .line 196
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    move-result-object v2

    .line 198
    goto :goto_4

    .line 199
    :cond_5
    move-object v2, v0

    .line 200
    .line 201
    .line 202
    :goto_4
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 203
    move-result v17

    .line 204
    .line 205
    const/16 v25, 0x1fd

    .line 206
    .line 207
    const/16 v26, 0x0

    .line 208
    .line 209
    const/16 v16, 0x0

    .line 210
    .line 211
    const/16 v18, 0x0

    .line 212
    .line 213
    const/16 v19, 0x0

    .line 214
    .line 215
    const/16 v20, 0x0

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const/16 v22, 0x0

    .line 220
    .line 221
    const/16 v23, 0x0

    .line 222
    .line 223
    const/16 v24, 0x0

    .line 224
    .line 225
    .line 226
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 227
    move-result-object v2

    .line 228
    goto :goto_5

    .line 229
    :cond_6
    move-object v2, v0

    .line 230
    .line 231
    .line 232
    :goto_5
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    move-result-object v2

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v2}, Li20/a;->h(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getHighestBuyDeclaredPrice()Ljava/math/BigDecimal;

    .line 240
    move-result-object v15

    .line 241
    .line 242
    if-eqz v15, :cond_8

    .line 243
    .line 244
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    .line 248
    move-result-object v3

    .line 249
    .line 250
    .line 251
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    move-result-object v3

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    if-eqz v2, :cond_7

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 262
    move-result-object v2

    .line 263
    .line 264
    if-eqz v2, :cond_7

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 268
    move-result v2

    .line 269
    .line 270
    .line 271
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    move-result-object v2

    .line 273
    goto :goto_6

    .line 274
    :cond_7
    move-object v2, v0

    .line 275
    .line 276
    .line 277
    :goto_6
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 278
    move-result v17

    .line 279
    .line 280
    const/16 v25, 0x1fd

    .line 281
    .line 282
    const/16 v26, 0x0

    .line 283
    .line 284
    const/16 v16, 0x0

    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    const/16 v21, 0x0

    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/16 v23, 0x0

    .line 297
    .line 298
    const/16 v24, 0x0

    .line 299
    .line 300
    .line 301
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 302
    move-result-object v2

    .line 303
    goto :goto_7

    .line 304
    :cond_8
    move-object v2, v0

    .line 305
    .line 306
    .line 307
    :goto_7
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    move-result-object v2

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v2}, Li20/a;->i(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getLowestSellDeclaredPrice()Ljava/math/BigDecimal;

    .line 315
    move-result-object v15

    .line 316
    .line 317
    if-eqz v15, :cond_a

    .line 318
    .line 319
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    .line 323
    move-result-object v3

    .line 324
    .line 325
    .line 326
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    move-result-object v3

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 331
    move-result-object v2

    .line 332
    .line 333
    if-eqz v2, :cond_9

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    if-eqz v2, :cond_9

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 343
    move-result v2

    .line 344
    .line 345
    .line 346
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    move-result-object v2

    .line 348
    goto :goto_8

    .line 349
    :cond_9
    move-object v2, v0

    .line 350
    .line 351
    .line 352
    :goto_8
    invoke-static {v2, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 353
    move-result v17

    .line 354
    .line 355
    const/16 v25, 0x1fd

    .line 356
    .line 357
    const/16 v26, 0x0

    .line 358
    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v18, 0x0

    .line 362
    .line 363
    const/16 v19, 0x0

    .line 364
    .line 365
    const/16 v20, 0x0

    .line 366
    .line 367
    const/16 v21, 0x0

    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    const/16 v23, 0x0

    .line 372
    .line 373
    const/16 v24, 0x0

    .line 374
    .line 375
    .line 376
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 377
    move-result-object v2

    .line 378
    goto :goto_9

    .line 379
    :cond_a
    move-object v2, v0

    .line 380
    .line 381
    .line 382
    :goto_9
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    move-result-object v2

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v2}, Li20/a;->l(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getHighestSellDeclaredPrice()Ljava/math/BigDecimal;

    .line 390
    move-result-object v15

    .line 391
    .line 392
    if-eqz v15, :cond_c

    .line 393
    .line 394
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;->getSymbol()Ljava/lang/String;

    .line 398
    move-result-object v3

    .line 399
    .line 400
    .line 401
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    move-result-object v3

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v3}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 406
    move-result-object v2

    .line 407
    .line 408
    if-eqz v2, :cond_b

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 412
    move-result-object v2

    .line 413
    .line 414
    if-eqz v2, :cond_b

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 418
    move-result v0

    .line 419
    .line 420
    .line 421
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    move-result-object v0

    .line 423
    .line 424
    .line 425
    :cond_b
    invoke-static {v0, v14}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 426
    move-result v17

    .line 427
    .line 428
    const/16 v25, 0x1fd

    .line 429
    .line 430
    const/16 v26, 0x0

    .line 431
    .line 432
    const/16 v16, 0x0

    .line 433
    .line 434
    const/16 v18, 0x0

    .line 435
    .line 436
    const/16 v19, 0x0

    .line 437
    .line 438
    const/16 v20, 0x0

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    const/16 v22, 0x0

    .line 443
    .line 444
    const/16 v23, 0x0

    .line 445
    .line 446
    const/16 v24, 0x0

    .line 447
    .line 448
    .line 449
    invoke-static/range {v15 .. v26}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 450
    move-result-object v0

    .line 451
    .line 452
    .line 453
    :cond_c
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    move-result-object v0

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v0}, Li20/a;->m(Ljava/lang/String;)V

    .line 458
    return-object v1
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
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
.end method
