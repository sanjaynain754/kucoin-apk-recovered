.class public final Lkv/c;
.super Ljava/lang/Object;
.source "FavTradeBeanMapper.kt"

# interfaces
.implements Lkv/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkv/g<",
        "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;",
        "Lcom/kubi/quotefacade/entity/FutureTradeItemBean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/quotefacade/mapper/FavFutureTradeBeanMapper;",
        "Lcom/kubi/quotefacade/mapper/IMapper;",
        "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;",
        "Lcom/kubi/quotefacade/entity/FutureTradeItemBean;",
        "<init>",
        "()V",
        "map",
        "input",
        "QuoteFacadeLib_googleRelease"
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
.end method

.method public static final c(Lcom/kubi/kumex/entity/ContractEntityOpenData;Lcom/kubi/quotefacade/entity/FutureQuoteEntity;)Ljava/lang/Double;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->isInverse()Z

    .line 4
    move-result p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 12
    move-result p0

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getVolume()Ljava/math/BigDecimal;

    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getTurnover()Ljava/math/BigDecimal;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    :goto_0
    if-eqz p0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 29
    move-result-wide p0

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lkv/c;->b(Lcom/kubi/quotefacade/entity/FutureQuoteEntity;)Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

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
.end method

.method public b(Lcom/kubi/quotefacade/entity/FutureQuoteEntity;)Lcom/kubi/quotefacade/entity/FutureTradeItemBean;
    .locals 8
    .param p1    # Lcom/kubi/quotefacade/entity/FutureQuoteEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "input"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/quotefacade/service/a;->c()Lcom/kubi/kumex/api/IKuMexService;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getSymbol()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/kubi/kumex/api/IKuMexService;->y(Ljava/lang/String;)Lcom/kubi/kumex/entity/ContractEntityOpenData;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    new-instance v1, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 26
    const/4 v2, 0x2

    .line 27
    const/4 v3, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v0, v3, v2, v3}, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;-><init>(Lcom/kubi/kumex/entity/ContractEntityOpenData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    iput-boolean v2, v1, Lcom/kubi/data/entity/TradeItemBean;->isChecked:Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getPriceChgPct()Ljava/math/BigDecimal;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/math/BigDecimal;->doubleValue()D

    .line 43
    move-result-wide v3

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v1, v3}, Lcom/kubi/data/entity/TradeItemBean;->setChangeRate(Ljava/lang/Double;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getLastPrice()Ljava/math/BigDecimal;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 66
    move-result-wide v6

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v6, v7}, Lcom/kubi/data/entity/TradeItemBean;->setLastDealPrice(D)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getSymbol()Ljava/lang/String;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    const-string v6, ""

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    move-object v3, v6

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {v1, v3}, Lcom/kubi/data/entity/TradeItemBean;->setSymbol(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p1}, Lkv/c;->c(Lcom/kubi/kumex/entity/ContractEntityOpenData;Lcom/kubi/quotefacade/entity/FutureQuoteEntity;)Ljava/lang/Double;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 91
    move-result-wide v4

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v1, v4, v5}, Lcom/kubi/data/entity/TradeItemBean;->setValue(D)V

    .line 95
    const/4 v3, 0x1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v3}, Lcom/kubi/data/entity/TradeItemBean;->setFavor(Z)V

    .line 99
    .line 100
    new-instance v3, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 101
    .line 102
    .line 103
    invoke-direct {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getSymbol()Ljava/lang/String;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    if-nez v4, :cond_4

    .line 110
    move-object v4, v6

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-virtual {v3, v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->setCode(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureQuoteEntity;->getSymbol()Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    if-nez p1, :cond_5

    .line 120
    goto :goto_0

    .line 121
    :cond_5
    move-object v6, p1

    .line 122
    .line 123
    .line 124
    :goto_0
    invoke-virtual {v3, v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->setSymbol(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getBaseCurrency()Ljava/lang/String;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setBaseCurrency(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getQuoteCurrency()Ljava/lang/String;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setQuoteCurrency(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getQuoteCurrency()Ljava/lang/String;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    const-string v0, "USDT"

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setQuoteCurrencyName(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setIsolatedMarginEnabled(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setIsolatedMarginTradeEnabled(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v3}, Lcom/kubi/data/entity/TradeItemBean;->setSymbolInfoEntity(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 161
    return-object v1
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
.end method
