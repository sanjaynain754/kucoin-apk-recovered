.class public final Lcom/kubi/jsbridge/impl/biz/trade/j;
.super Ljava/lang/Object;
.source "TradeMarginBridgeMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\"\u0010\u0008\u001a\u00020\t2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u000e*\u0004\u0018\u00010\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u000e*\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u000e\u0010\u0019\u001a\u00020\u001a*\u0004\u0018\u00010\u0016H\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/jsbridge/impl/biz/trade/TradeMarginBridgeMapper;",
        "",
        "<init>",
        "()V",
        "toJsMarginConfig",
        "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;",
        "config",
        "Lcom/kubi/margin/api/entity/MarginBridgeConfig;",
        "toJsMarginCurrency",
        "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;",
        "Lcom/kubi/loan/api/entity/LeverCoinConfig;",
        "coin",
        "Lcom/kubi/data/entity/CoinInfoEntity;",
        "fallbackCurrency",
        "",
        "toJsIsolatedMarginConfig",
        "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;",
        "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;",
        "fallbackSymbol",
        "emptyMarginCurrency",
        "currency",
        "toPlainStringOrZero",
        "Ljava/math/BigDecimal;",
        "toPlainStringOrDefault",
        "default",
        "toLongOrZero",
        "",
        "JsBridgeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTradeMarginBridgeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeMarginBridgeMapper.kt\ncom/kubi/jsbridge/impl/biz/trade/TradeMarginBridgeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1#2:152\n1563#3:153\n1634#3,3:154\n*S KotlinDebug\n*F\n+ 1 TradeMarginBridgeMapper.kt\ncom/kubi/jsbridge/impl/biz/trade/TradeMarginBridgeMapper\n*L\n60#1:153\n60#1:154,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/jsbridge/impl/biz/trade/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/jsbridge/impl/biz/trade/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/jsbridge/impl/biz/trade/j;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/jsbridge/impl/biz/trade/j;->a:Lcom/kubi/jsbridge/impl/biz/trade/j;

    .line 8
    return-void
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
.end method

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
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;
    .locals 29

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 6
    move-result-object v18

    .line 7
    .line 8
    const-string v27, "1"

    .line 9
    .line 10
    const/16 v28, 0x0

    .line 11
    .line 12
    const-string v1, "0"

    .line 13
    .line 14
    const-string v2, "0"

    .line 15
    .line 16
    const-string v4, "0"

    .line 17
    .line 18
    const-string v5, "0"

    .line 19
    .line 20
    const-string v6, ""

    .line 21
    .line 22
    const-string v7, ""

    .line 23
    .line 24
    const-string v8, "0"

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    .line 30
    const-string v13, "0"

    .line 31
    .line 32
    const-string v14, "0"

    .line 33
    .line 34
    const-string v15, ""

    .line 35
    .line 36
    const-string v16, "0"

    .line 37
    .line 38
    const-string v17, "0"

    .line 39
    .line 40
    const-wide/16 v19, 0x8

    .line 41
    .line 42
    const-string v21, "0"

    .line 43
    .line 44
    const-string v22, "0"

    .line 45
    .line 46
    const-string v23, "0"

    .line 47
    .line 48
    const-wide/16 v24, 0x1

    .line 49
    .line 50
    const-string v26, "0"

    .line 51
    .line 52
    move-object/from16 v3, p1

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v0 .. v28}, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-object v0
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
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
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
.end method

.method public final b(Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;Ljava/lang/String;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;
    .locals 34
    .param p1    # Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "fallbackSymbol"

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getSymbol()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 21
    move-result v3

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    move-object v1, v2

    .line 25
    :cond_0
    move-object v3, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v3, v2

    .line 28
    :goto_0
    const/4 v1, 0x0

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getFlDebtRatio()Ljava/math/BigDecimal;

    .line 34
    move-result-object v2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object v2, v1

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, v2}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getDefaultLeverage()Ljava/math/BigDecimal;

    .line 46
    move-result-object v2

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object v2, v1

    .line 49
    .line 50
    .line 51
    :goto_2
    invoke-virtual {v0, v2}, Lcom/kubi/jsbridge/impl/biz/trade/j;->e(Ljava/math/BigDecimal;)J

    .line 52
    move-result-wide v5

    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getMaxLeverage()Ljava/math/BigDecimal;

    .line 58
    move-result-object v2

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move-object v2, v1

    .line 61
    .line 62
    .line 63
    :goto_3
    invoke-virtual {v0, v2}, Lcom/kubi/jsbridge/impl/biz/trade/j;->e(Ljava/math/BigDecimal;)J

    .line 64
    move-result-wide v7

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getRiskLeverage()Ljava/math/BigDecimal;

    .line 70
    move-result-object v2

    .line 71
    goto :goto_4

    .line 72
    :cond_5
    move-object v2, v1

    .line 73
    .line 74
    .line 75
    :goto_4
    invoke-virtual {v0, v2}, Lcom/kubi/jsbridge/impl/biz/trade/j;->e(Ljava/math/BigDecimal;)J

    .line 76
    move-result-wide v9

    .line 77
    const/4 v2, 0x0

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBaseBorrowEnable()Ljava/lang/Boolean;

    .line 83
    move-result-object v11

    .line 84
    .line 85
    if-eqz v11, :cond_6

    .line 86
    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    move-result v11

    .line 90
    move v12, v11

    .line 91
    goto :goto_5

    .line 92
    :cond_6
    move v12, v2

    .line 93
    .line 94
    :goto_5
    if-eqz p1, :cond_7

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getQuoteBorrowEnable()Ljava/lang/Boolean;

    .line 98
    move-result-object v11

    .line 99
    .line 100
    if-eqz v11, :cond_7

    .line 101
    .line 102
    .line 103
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    move-result v11

    .line 105
    move v13, v11

    .line 106
    goto :goto_6

    .line 107
    :cond_7
    move v13, v2

    .line 108
    .line 109
    :goto_6
    if-eqz p1, :cond_8

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBaseMaxBorrowAmount()Ljava/math/BigDecimal;

    .line 113
    move-result-object v11

    .line 114
    goto :goto_7

    .line 115
    :cond_8
    move-object v11, v1

    .line 116
    .line 117
    .line 118
    :goto_7
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 119
    move-result-object v14

    .line 120
    .line 121
    if-eqz p1, :cond_9

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getQuoteMaxBorrowAmount()Ljava/math/BigDecimal;

    .line 125
    move-result-object v11

    .line 126
    goto :goto_8

    .line 127
    :cond_9
    move-object v11, v1

    .line 128
    .line 129
    .line 130
    :goto_8
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 131
    move-result-object v15

    .line 132
    .line 133
    if-eqz p1, :cond_a

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getAutoRenewMaxDebtRatio()Ljava/math/BigDecimal;

    .line 137
    move-result-object v11

    .line 138
    goto :goto_9

    .line 139
    :cond_a
    move-object v11, v1

    .line 140
    .line 141
    .line 142
    :goto_9
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 143
    move-result-object v16

    .line 144
    .line 145
    if-eqz p1, :cond_b

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBaseMaxBuyAmount()Ljava/math/BigDecimal;

    .line 149
    move-result-object v11

    .line 150
    goto :goto_a

    .line 151
    :cond_b
    move-object v11, v1

    .line 152
    .line 153
    .line 154
    :goto_a
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 155
    move-result-object v17

    .line 156
    .line 157
    if-eqz p1, :cond_c

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getQuoteMaxBuyAmount()Ljava/math/BigDecimal;

    .line 161
    move-result-object v11

    .line 162
    goto :goto_b

    .line 163
    :cond_c
    move-object v11, v1

    .line 164
    .line 165
    .line 166
    :goto_b
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 167
    move-result-object v18

    .line 168
    .line 169
    if-eqz p1, :cond_d

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBorrowBufferRatio()Ljava/math/BigDecimal;

    .line 173
    move-result-object v11

    .line 174
    goto :goto_c

    .line 175
    :cond_d
    move-object v11, v1

    .line 176
    .line 177
    .line 178
    :goto_c
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 179
    move-result-object v19

    .line 180
    .line 181
    if-eqz p1, :cond_e

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getWarnDebtRatio()Ljava/math/BigDecimal;

    .line 185
    move-result-object v11

    .line 186
    goto :goto_d

    .line 187
    :cond_e
    move-object v11, v1

    .line 188
    .line 189
    .line 190
    :goto_d
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 191
    move-result-object v21

    .line 192
    .line 193
    if-eqz p1, :cond_f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getTransferOutMaxDebtRatio()Ljava/math/BigDecimal;

    .line 197
    move-result-object v11

    .line 198
    goto :goto_e

    .line 199
    :cond_f
    move-object v11, v1

    .line 200
    .line 201
    .line 202
    :goto_e
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 203
    move-result-object v23

    .line 204
    .line 205
    if-eqz p1, :cond_10

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getTransferOutBufferRatio()Ljava/math/BigDecimal;

    .line 209
    move-result-object v11

    .line 210
    goto :goto_f

    .line 211
    :cond_10
    move-object v11, v1

    .line 212
    .line 213
    .line 214
    :goto_f
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 215
    move-result-object v24

    .line 216
    .line 217
    if-eqz p1, :cond_11

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBaseBorrowCoefficient()Ljava/math/BigDecimal;

    .line 221
    move-result-object v11

    .line 222
    goto :goto_10

    .line 223
    :cond_11
    move-object v11, v1

    .line 224
    .line 225
    .line 226
    :goto_10
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 227
    move-result-object v25

    .line 228
    .line 229
    if-eqz p1, :cond_12

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getQuoteBorrowCoefficient()Ljava/math/BigDecimal;

    .line 233
    move-result-object v11

    .line 234
    goto :goto_11

    .line 235
    :cond_12
    move-object v11, v1

    .line 236
    .line 237
    .line 238
    :goto_11
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 239
    move-result-object v26

    .line 240
    .line 241
    if-eqz p1, :cond_13

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBaseMarginCoefficient()Ljava/math/BigDecimal;

    .line 245
    move-result-object v11

    .line 246
    goto :goto_12

    .line 247
    :cond_13
    move-object v11, v1

    .line 248
    .line 249
    .line 250
    :goto_12
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 251
    move-result-object v27

    .line 252
    .line 253
    if-eqz p1, :cond_14

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getQuoteMarginCoefficient()Ljava/math/BigDecimal;

    .line 257
    move-result-object v11

    .line 258
    goto :goto_13

    .line 259
    :cond_14
    move-object v11, v1

    .line 260
    .line 261
    .line 262
    :goto_13
    invoke-virtual {v0, v11}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 263
    move-result-object v28

    .line 264
    .line 265
    if-eqz p1, :cond_15

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getEnable()Ljava/lang/Boolean;

    .line 269
    move-result-object v11

    .line 270
    .line 271
    if-eqz v11, :cond_15

    .line 272
    .line 273
    .line 274
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 275
    move-result v11

    .line 276
    .line 277
    move/from16 v29, v11

    .line 278
    goto :goto_14

    .line 279
    .line 280
    :cond_15
    move/from16 v29, v2

    .line 281
    .line 282
    :goto_14
    if-eqz p1, :cond_16

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getTradeEnable()Ljava/lang/Boolean;

    .line 286
    move-result-object v11

    .line 287
    .line 288
    if-eqz v11, :cond_16

    .line 289
    .line 290
    .line 291
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    move-result v11

    .line 293
    .line 294
    move/from16 v30, v11

    .line 295
    goto :goto_15

    .line 296
    .line 297
    :cond_16
    move/from16 v30, v2

    .line 298
    .line 299
    :goto_15
    if-eqz p1, :cond_17

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getBaseTransferInEnable()Ljava/lang/Boolean;

    .line 303
    move-result-object v11

    .line 304
    .line 305
    if-eqz v11, :cond_17

    .line 306
    .line 307
    .line 308
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    move-result v11

    .line 310
    .line 311
    move/from16 v31, v11

    .line 312
    goto :goto_16

    .line 313
    .line 314
    :cond_17
    move/from16 v31, v2

    .line 315
    .line 316
    :goto_16
    if-eqz p1, :cond_18

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getQuoteTransferInEnable()Ljava/lang/Boolean;

    .line 320
    move-result-object v11

    .line 321
    .line 322
    if-eqz v11, :cond_18

    .line 323
    .line 324
    .line 325
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 326
    move-result v2

    .line 327
    .line 328
    :cond_18
    move/from16 v32, v2

    .line 329
    .line 330
    if-eqz p1, :cond_19

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;->getPnlPrecision()Ljava/lang/Integer;

    .line 334
    move-result-object v2

    .line 335
    .line 336
    if-eqz v2, :cond_19

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 340
    move-result v1

    .line 341
    int-to-long v1, v1

    .line 342
    .line 343
    .line 344
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    :cond_19
    move-object/from16 v33, v1

    .line 348
    .line 349
    new-instance v2, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;

    .line 350
    .line 351
    const-string v11, ""

    .line 352
    .line 353
    const-string v20, "0"

    .line 354
    .line 355
    const-string v22, "0"

    .line 356
    .line 357
    .line 358
    invoke-direct/range {v2 .. v33}, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;-><init>(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Long;)V

    .line 359
    return-object v2
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
.end method

.method public final c(Lcom/kubi/margin/api/entity/MarginBridgeConfig;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;
    .locals 13
    .param p1    # Lcom/kubi/margin/api/entity/MarginBridgeConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getBorrowableDebtBufferRatio()Ljava/math/BigDecimal;

    .line 9
    move-result-object v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, v2}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getEarlyWarningDebtRatio()Ljava/math/BigDecimal;

    .line 21
    move-result-object v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v3, v1

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-virtual {p0, v3}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getLiquidationDebtRatio()Ljava/math/BigDecimal;

    .line 33
    move-result-object v4

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object v4, v1

    .line 36
    .line 37
    .line 38
    :goto_2
    invoke-virtual {p0, v4}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getMaxAutoLoanDebtRatio()Ljava/math/BigDecimal;

    .line 45
    move-result-object v5

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move-object v5, v1

    .line 48
    .line 49
    .line 50
    :goto_3
    invoke-virtual {p0, v5}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getMaxLeverage()Ljava/math/BigDecimal;

    .line 57
    move-result-object v6

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move-object v6, v1

    .line 60
    .line 61
    .line 62
    :goto_4
    invoke-virtual {p0, v6}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 63
    move-result-object v6

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getDefaultLeverage()Ljava/math/BigDecimal;

    .line 69
    move-result-object v7

    .line 70
    goto :goto_5

    .line 71
    :cond_5
    move-object v7, v1

    .line 72
    .line 73
    .line 74
    :goto_5
    invoke-virtual {p0, v7}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 75
    move-result-object v7

    .line 76
    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getTransferableAmountDebtBufferRatio()Ljava/math/BigDecimal;

    .line 81
    move-result-object v8

    .line 82
    goto :goto_6

    .line 83
    :cond_6
    move-object v8, v1

    .line 84
    .line 85
    .line 86
    :goto_6
    invoke-virtual {p0, v8}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 87
    move-result-object v8

    .line 88
    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getTransferableAmountDebtRatio()Ljava/math/BigDecimal;

    .line 93
    move-result-object v9

    .line 94
    goto :goto_7

    .line 95
    :cond_7
    move-object v9, v1

    .line 96
    .line 97
    .line 98
    :goto_7
    invoke-virtual {p0, v9}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 99
    move-result-object v9

    .line 100
    .line 101
    if-eqz p1, :cond_8

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getRiskLeverage()Ljava/math/BigDecimal;

    .line 105
    move-result-object v10

    .line 106
    goto :goto_8

    .line 107
    :cond_8
    move-object v10, v1

    .line 108
    .line 109
    .line 110
    :goto_8
    invoke-virtual {p0, v10}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 111
    move-result-object v10

    .line 112
    .line 113
    if-eqz p1, :cond_9

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getRiskGrade()Ljava/lang/String;

    .line 117
    move-result-object v11

    .line 118
    goto :goto_9

    .line 119
    :cond_9
    move-object v11, v1

    .line 120
    .line 121
    :goto_9
    if-eqz p1, :cond_a

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginBridgeConfig;->getRemindPriceDeviateRatio()Ljava/math/BigDecimal;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    if-eqz p1, :cond_a

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 131
    move-result-object v1

    .line 132
    :cond_a
    move-object v12, v11

    .line 133
    move-object v11, v1

    .line 134
    move-object v1, v2

    .line 135
    move-object v2, v3

    .line 136
    move-object v3, v4

    .line 137
    move-object v4, v5

    .line 138
    move-object v5, v6

    .line 139
    move-object v6, v7

    .line 140
    move-object v7, v8

    .line 141
    move-object v8, v9

    .line 142
    move-object v9, v10

    .line 143
    move-object v10, v12

    .line 144
    .line 145
    .line 146
    invoke-direct/range {v0 .. v11}, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    return-object v0
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
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
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
.end method

.method public final d(Lcom/kubi/loan/api/entity/LeverCoinConfig;Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/String;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;
    .locals 34
    .param p1    # Lcom/kubi/loan/api/entity/LeverCoinConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/data/entity/CoinInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    const-string v2, "fallbackCurrency"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->a(Ljava/lang/String;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;

    .line 15
    move-result-object v1

    .line 16
    return-object v1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getCurrency()Ljava/lang/String;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v3, ""

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    move-object v2, v3

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 29
    move-result v4

    .line 30
    .line 31
    if-nez v4, :cond_2

    .line 32
    move-object v8, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move-object v8, v2

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getBorrowMaxAmount()Ljava/math/BigDecimal;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getBorrowMinAmount()Ljava/math/BigDecimal;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 50
    move-result-object v7

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getCurrencyLoanMinUnit()Ljava/math/BigDecimal;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getFeeRatio()Ljava/math/BigDecimal;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 66
    move-result-object v10

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getId()Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    move-object v11, v3

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v11, v1

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getIndexSymbol()Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    if-nez v1, :cond_4

    .line 82
    move-object v12, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move-object v12, v1

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getInterestRateUnit()Ljava/math/BigDecimal;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 92
    move-result-object v13

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->isDebitEnabled()Ljava/lang/Boolean;

    .line 96
    move-result-object v1

    .line 97
    const/4 v2, 0x0

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    .line 102
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    move-result v1

    .line 104
    move v14, v1

    .line 105
    goto :goto_5

    .line 106
    .line 107
    :cond_5
    if-eqz p2, :cond_6

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isDebitEnabled()Z

    .line 111
    move-result v1

    .line 112
    .line 113
    .line 114
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    move-result-object v1

    .line 116
    goto :goto_4

    .line 117
    :cond_6
    const/4 v1, 0x0

    .line 118
    .line 119
    :goto_4
    if-eqz v1, :cond_7

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    move v14, v2

    .line 122
    .line 123
    .line 124
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->isBorrow()Z

    .line 125
    move-result v15

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->isMarginEnabled()Z

    .line 129
    move-result v1

    .line 130
    const/4 v5, 0x1

    .line 131
    .line 132
    if-nez v1, :cond_9

    .line 133
    .line 134
    if-eqz p2, :cond_8

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isMarginEnabled()Z

    .line 138
    move-result v1

    .line 139
    .line 140
    if-ne v1, v5, :cond_8

    .line 141
    goto :goto_6

    .line 142
    .line 143
    :cond_8
    move/from16 v16, v2

    .line 144
    goto :goto_7

    .line 145
    .line 146
    :cond_9
    :goto_6
    move/from16 v16, v5

    .line 147
    .line 148
    .line 149
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getIsolatedEnable()Ljava/lang/Boolean;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    if-eqz v1, :cond_b

    .line 153
    .line 154
    .line 155
    :goto_8
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    move-result v2

    .line 157
    .line 158
    :cond_a
    move/from16 v17, v2

    .line 159
    goto :goto_a

    .line 160
    .line 161
    :cond_b
    if-eqz p2, :cond_c

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isIsolatedEnabled()Z

    .line 165
    move-result v1

    .line 166
    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    move-result-object v1

    .line 170
    goto :goto_9

    .line 171
    :cond_c
    const/4 v1, 0x0

    .line 172
    .line 173
    :goto_9
    if-eqz v1, :cond_a

    .line 174
    goto :goto_8

    .line 175
    .line 176
    .line 177
    :goto_a
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getLendMaxAmount()Ljava/math/BigDecimal;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 182
    move-result-object v18

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getLendMinAmount()Ljava/math/BigDecimal;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 190
    move-result-object v19

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getMarkPriceSymbol()Ljava/lang/String;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    if-nez v1, :cond_d

    .line 197
    .line 198
    move-object/from16 v20, v3

    .line 199
    goto :goto_b

    .line 200
    .line 201
    :cond_d
    move-object/from16 v20, v1

    .line 202
    .line 203
    .line 204
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getMaxInterestRate()Ljava/math/BigDecimal;

    .line 205
    move-result-object v1

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 209
    move-result-object v21

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getMinInterestRate()Ljava/math/BigDecimal;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 217
    move-result-object v22

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getPeriod()Ljava/util/List;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    if-eqz v1, :cond_e

    .line 224
    .line 225
    new-instance v2, Ljava/util/ArrayList;

    .line 226
    .line 227
    const/16 v3, 0xa

    .line 228
    .line 229
    .line 230
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 231
    move-result v3

    .line 232
    .line 233
    .line 234
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    move-result-object v1

    .line 239
    .line 240
    .line 241
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    move-result v3

    .line 243
    .line 244
    if-eqz v3, :cond_f

    .line 245
    .line 246
    .line 247
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    move-result-object v3

    .line 249
    .line 250
    check-cast v3, Ljava/lang/Number;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 254
    move-result v3

    .line 255
    int-to-long v4, v3

    .line 256
    .line 257
    .line 258
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    move-result-object v3

    .line 260
    .line 261
    .line 262
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 263
    goto :goto_c

    .line 264
    :cond_e
    const/4 v2, 0x0

    .line 265
    .line 266
    :cond_f
    if-nez v2, :cond_10

    .line 267
    .line 268
    .line 269
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 270
    move-result-object v2

    .line 271
    .line 272
    :cond_10
    move-object/from16 v23, v2

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getPrecision()I

    .line 276
    move-result v1

    .line 277
    int-to-long v1, v1

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getRiskFundsRate()Ljava/math/BigDecimal;

    .line 281
    move-result-object v3

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v3}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 285
    move-result-object v26

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getSevenBonusLendRate()Ljava/math/BigDecimal;

    .line 289
    move-result-object v3

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v3}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 293
    move-result-object v27

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getSixMonthBonusLendRate()Ljava/math/BigDecimal;

    .line 297
    move-result-object v3

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v3}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 301
    move-result-object v28

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getSort()Ljava/lang/Integer;

    .line 305
    move-result-object v3

    .line 306
    .line 307
    if-eqz v3, :cond_11

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 311
    move-result v3

    .line 312
    int-to-long v3, v3

    .line 313
    .line 314
    :goto_d
    move-wide/from16 v29, v3

    .line 315
    goto :goto_e

    .line 316
    .line 317
    :cond_11
    const-wide/16 v3, 0x1

    .line 318
    goto :goto_d

    .line 319
    .line 320
    .line 321
    :goto_e
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getYearBonusLendRate()Ljava/math/BigDecimal;

    .line 322
    move-result-object v3

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v3}, Lcom/kubi/jsbridge/impl/biz/trade/j;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 326
    move-result-object v31

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getMarginCoefficient()Ljava/math/BigDecimal;

    .line 330
    move-result-object v3

    .line 331
    .line 332
    const-string v4, "1"

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v3, v4}, Lcom/kubi/jsbridge/impl/biz/trade/j;->f(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    move-result-object v32

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/loan/api/entity/LeverCoinConfig;->getBorrowCoefficient()Ljava/math/BigDecimal;

    .line 340
    move-result-object v3

    .line 341
    .line 342
    if-eqz v3, :cond_12

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 346
    move-result-object v4

    .line 347
    .line 348
    move-object/from16 v33, v4

    .line 349
    goto :goto_f

    .line 350
    .line 351
    :cond_12
    const/16 v33, 0x0

    .line 352
    .line 353
    :goto_f
    new-instance v5, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;

    .line 354
    .line 355
    move-wide/from16 v24, v1

    .line 356
    .line 357
    .line 358
    invoke-direct/range {v5 .. v33}, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    return-object v5
.end method

.method public final e(Ljava/math/BigDecimal;)J
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0

    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, 0x0

    .line 10
    return-wide v0
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
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
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
.end method

.method public final f(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p1

    .line 11
    :cond_1
    :goto_0
    return-object p2
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
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
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
.end method

.method public final g(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "0"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/kubi/jsbridge/impl/biz/trade/j;->f(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
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
.end method
