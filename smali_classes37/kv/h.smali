.class public final Lkv/h;
.super Ljava/lang/Object;
.source "MarketTradeBeanMapper.kt"

# interfaces
.implements Lkv/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkv/g<",
        "Lcom/kubi/quotefacade/entity/MarketListEntityItem;",
        "Lcom/kubi/quotefacade/entity/FutureTradeItemBean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/quotefacade/mapper/MarketFuturesTradeBeanMapper;",
        "Lcom/kubi/quotefacade/mapper/IMapper;",
        "Lcom/kubi/quotefacade/entity/MarketListEntityItem;",
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/quotefacade/entity/MarketListEntityItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lkv/h;->b(Lcom/kubi/quotefacade/entity/MarketListEntityItem;)Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

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

.method public b(Lcom/kubi/quotefacade/entity/MarketListEntityItem;)Lcom/kubi/quotefacade/entity/FutureTradeItemBean;
    .locals 7
    .param p1    # Lcom/kubi/quotefacade/entity/MarketListEntityItem;
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
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbol()Ljava/lang/String;

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
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getFuturesMarks()Ljava/util/List;

    .line 34
    move-result-object v2

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    const-string v5, "Mask_Funding_Rate"

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 43
    move-result v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v2, v4

    .line 46
    .line 47
    :goto_0
    if-eqz v2, :cond_1

    .line 48
    move-object v2, v3

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getFundingRate()Ljava/math/BigDecimal;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    :goto_1
    iput-object v2, v1, Lcom/kubi/data/entity/TradeItemBean;->fundingRate:Ljava/math/BigDecimal;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getMarketCap()Ljava/math/BigDecimal;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 69
    move-result v2

    .line 70
    .line 71
    if-gtz v2, :cond_2

    .line 72
    move-object v2, v3

    .line 73
    goto :goto_2

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getMarketCap()Ljava/math/BigDecimal;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    :goto_2
    iput-object v2, v1, Lcom/kubi/data/entity/TradeItemBean;->marketCap:Ljava/math/BigDecimal;

    .line 80
    .line 81
    iput-boolean v4, v1, Lcom/kubi/data/entity/TradeItemBean;->isChecked:Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getLast24HourRate()Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 91
    move-result-wide v2

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v1, v3}, Lcom/kubi/data/entity/TradeItemBean;->setChangeRate(Ljava/lang/Double;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getLastPrice()Ljava/lang/String;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    const-wide/16 v5, 0x0

    .line 105
    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 110
    move-result-wide v2

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    move-wide v2, v5

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-virtual {v1, v2, v3}, Lcom/kubi/data/entity/TradeItemBean;->setLastDealPrice(D)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbol()Ljava/lang/String;

    .line 119
    move-result-object v2

    .line 120
    .line 121
    const-string v3, ""

    .line 122
    .line 123
    if-nez v2, :cond_5

    .line 124
    move-object v2, v3

    .line 125
    .line 126
    .line 127
    :cond_5
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbol(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getLast24HourTradingVolume()Ljava/lang/String;

    .line 131
    move-result-object v2

    .line 132
    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    .line 136
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 137
    move-result-wide v5

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {v1, v5, v6}, Lcom/kubi/data/entity/TradeItemBean;->setValue(D)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getFuturesMarks()Ljava/util/List;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    const-string v5, "Price_Alarm"

    .line 149
    .line 150
    .line 151
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 152
    move-result v2

    .line 153
    goto :goto_4

    .line 154
    :cond_7
    move v2, v4

    .line 155
    .line 156
    .line 157
    :goto_4
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/TradeItemBean;->setAlarm(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getFavoritePersonal()Z

    .line 161
    move-result v2

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/TradeItemBean;->setFavor(Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getStatusIcon()Ljava/lang/String;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    if-nez v2, :cond_8

    .line 171
    .line 172
    const-string v2, "Common"

    .line 173
    .line 174
    .line 175
    :cond_8
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;->setStatusIcon(Ljava/lang/String;)V

    .line 176
    .line 177
    new-instance v2, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 178
    .line 179
    .line 180
    invoke-direct {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbol()Ljava/lang/String;

    .line 184
    move-result-object v5

    .line 185
    .line 186
    if-nez v5, :cond_9

    .line 187
    move-object v5, v3

    .line 188
    .line 189
    .line 190
    :cond_9
    invoke-virtual {v2, v5}, Lcom/kubi/data/entity/SymbolInfoEntity;->setCode(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbol()Ljava/lang/String;

    .line 194
    move-result-object p1

    .line 195
    .line 196
    if-nez p1, :cond_a

    .line 197
    goto :goto_5

    .line 198
    :cond_a
    move-object v3, p1

    .line 199
    .line 200
    .line 201
    :goto_5
    invoke-virtual {v2, v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->setSymbol(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getBaseCurrency()Ljava/lang/String;

    .line 205
    move-result-object p1

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setBaseCurrency(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getQuoteCurrency()Ljava/lang/String;

    .line 212
    move-result-object p1

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setQuoteCurrency(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getQuoteCurrency()Ljava/lang/String;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    const-string v0, "USDT"

    .line 222
    .line 223
    .line 224
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    move-result-object p1

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setQuoteCurrencyName(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->setIsolatedMarginEnabled(Z)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->setIsolatedMarginTradeEnabled(Z)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbolInfoEntity(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 238
    return-object v1
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
