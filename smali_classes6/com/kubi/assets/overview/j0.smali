.class public final Lcom/kubi/assets/overview/j0;
.super Ljava/lang/Object;
.source "AssetOverviewViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "filterSmallAssets",
        "",
        "accountInfo",
        "Lcom/kubi/assets/entity/OverviewAccountInfo;",
        "AssetsCenterLib_googleRelease"
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
.method public static final a(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z
    .locals 6
    .param p0    # Lcom/kubi/assets/entity/OverviewAccountInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    if-nez v1, :cond_d

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v1, v2

    .line 30
    .line 31
    :goto_0
    if-nez v1, :cond_d

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/kubi/assets/entity/MarginEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 41
    move-result-object v1

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    move-object v1, v2

    .line 44
    .line 45
    :goto_1
    if-nez v1, :cond_d

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kubi/assets/entity/EquityEntity;->getTotalEquity()Ljava/math/BigDecimal;

    .line 55
    move-result-object v1

    .line 56
    goto :goto_2

    .line 57
    :cond_4
    move-object v1, v2

    .line 58
    .line 59
    :goto_2
    if-nez v1, :cond_d

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/kubi/assets/entity/EarnBalance;->getTotalValue()Ljava/math/BigDecimal;

    .line 69
    move-result-object v1

    .line 70
    goto :goto_3

    .line 71
    :cond_5
    move-object v1, v2

    .line 72
    .line 73
    :goto_3
    if-nez v1, :cond_d

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 83
    move-result-object v1

    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move-object v1, v2

    .line 86
    .line 87
    :goto_4
    if-nez v1, :cond_d

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 97
    move-result-object v1

    .line 98
    goto :goto_5

    .line 99
    :cond_7
    move-object v1, v2

    .line 100
    .line 101
    :goto_5
    if-nez v1, :cond_d

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 111
    move-result-object v1

    .line 112
    goto :goto_6

    .line 113
    :cond_8
    move-object v1, v2

    .line 114
    .line 115
    :goto_6
    if-nez v1, :cond_d

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 125
    move-result-object v1

    .line 126
    goto :goto_7

    .line 127
    :cond_9
    move-object v1, v2

    .line 128
    .line 129
    :goto_7
    if-nez v1, :cond_d

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    if-eqz v1, :cond_a

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lcom/kubi/data/entity/UnifiedAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 139
    move-result-object v1

    .line 140
    goto :goto_8

    .line 141
    :cond_a
    move-object v1, v2

    .line 142
    .line 143
    :goto_8
    if-nez v1, :cond_d

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    if-eqz v1, :cond_b

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 153
    move-result-object v1

    .line 154
    goto :goto_9

    .line 155
    :cond_b
    move-object v1, v2

    .line 156
    .line 157
    :goto_9
    if-nez v1, :cond_d

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    if-eqz v1, :cond_c

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 167
    move-result-object v1

    .line 168
    goto :goto_a

    .line 169
    :cond_c
    move-object v1, v2

    .line 170
    .line 171
    .line 172
    :cond_d
    :goto_a
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    if-eqz v3, :cond_e

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 179
    move-result-object v3

    .line 180
    .line 181
    if-nez v3, :cond_1a

    .line 182
    .line 183
    .line 184
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 185
    move-result-object v3

    .line 186
    .line 187
    if-eqz v3, :cond_f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 191
    move-result-object v3

    .line 192
    goto :goto_b

    .line 193
    :cond_f
    move-object v3, v2

    .line 194
    .line 195
    :goto_b
    if-nez v3, :cond_1a

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 199
    move-result-object v3

    .line 200
    .line 201
    if-eqz v3, :cond_10

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Lcom/kubi/assets/entity/MarginEntity;->getExecute()Ljava/lang/Boolean;

    .line 205
    move-result-object v3

    .line 206
    goto :goto_c

    .line 207
    :cond_10
    move-object v3, v2

    .line 208
    .line 209
    :goto_c
    if-nez v3, :cond_1a

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 213
    move-result-object v3

    .line 214
    .line 215
    if-eqz v3, :cond_11

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Lcom/kubi/assets/entity/EquityEntity;->getExecute()Ljava/lang/Boolean;

    .line 219
    move-result-object v3

    .line 220
    goto :goto_d

    .line 221
    :cond_11
    move-object v3, v2

    .line 222
    .line 223
    :goto_d
    if-nez v3, :cond_1a

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 227
    move-result-object v3

    .line 228
    .line 229
    if-eqz v3, :cond_12

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, Lcom/kubi/assets/entity/EarnBalance;->getExecute()Ljava/lang/Boolean;

    .line 233
    move-result-object v3

    .line 234
    goto :goto_e

    .line 235
    :cond_12
    move-object v3, v2

    .line 236
    .line 237
    :goto_e
    if-nez v3, :cond_1a

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 241
    move-result-object v3

    .line 242
    .line 243
    if-eqz v3, :cond_13

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Lcom/kubi/data/entity/SubAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 247
    move-result-object v3

    .line 248
    goto :goto_f

    .line 249
    :cond_13
    move-object v3, v2

    .line 250
    .line 251
    :goto_f
    if-nez v3, :cond_1a

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 255
    move-result-object v3

    .line 256
    .line 257
    if-eqz v3, :cond_14

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Lcom/kubi/data/entity/SubAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 261
    move-result-object v3

    .line 262
    goto :goto_10

    .line 263
    :cond_14
    move-object v3, v2

    .line 264
    .line 265
    :goto_10
    if-nez v3, :cond_1a

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 269
    move-result-object v3

    .line 270
    .line 271
    if-eqz v3, :cond_15

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/kubi/assets/entity/CommonAccountEntity;->getExecute()Ljava/lang/Boolean;

    .line 275
    move-result-object v3

    .line 276
    goto :goto_11

    .line 277
    :cond_15
    move-object v3, v2

    .line 278
    .line 279
    :goto_11
    if-nez v3, :cond_1a

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 283
    move-result-object v3

    .line 284
    .line 285
    if-eqz v3, :cond_16

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3}, Lcom/kubi/assets/entity/CommonAccountEntity;->getExecute()Ljava/lang/Boolean;

    .line 289
    move-result-object v3

    .line 290
    goto :goto_12

    .line 291
    :cond_16
    move-object v3, v2

    .line 292
    .line 293
    :goto_12
    if-nez v3, :cond_1a

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 297
    move-result-object v3

    .line 298
    .line 299
    if-eqz v3, :cond_17

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3}, Lcom/kubi/data/entity/UnifiedAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 303
    move-result-object v3

    .line 304
    goto :goto_13

    .line 305
    :cond_17
    move-object v3, v2

    .line 306
    .line 307
    :goto_13
    if-nez v3, :cond_1a

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 311
    move-result-object v3

    .line 312
    .line 313
    if-eqz v3, :cond_18

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3}, Lcom/kubi/assets/entity/CommonAccountEntity;->getExecute()Ljava/lang/Boolean;

    .line 317
    move-result-object v3

    .line 318
    goto :goto_14

    .line 319
    :cond_18
    move-object v3, v2

    .line 320
    .line 321
    :goto_14
    if-nez v3, :cond_1a

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 325
    move-result-object p0

    .line 326
    .line 327
    if-eqz p0, :cond_19

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0}, Lcom/kubi/data/entity/SubAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 331
    move-result-object v3

    .line 332
    goto :goto_15

    .line 333
    :cond_19
    move-object v3, v2

    .line 334
    .line 335
    :cond_1a
    :goto_15
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    invoke-static {v3, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    move-result p0

    .line 340
    .line 341
    if-eqz p0, :cond_1b

    .line 342
    return v0

    .line 343
    :cond_1b
    const/4 p0, 0x0

    .line 344
    .line 345
    if-nez v1, :cond_1c

    .line 346
    return p0

    .line 347
    .line 348
    :cond_1c
    sget-object v3, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 352
    move-result-object v3

    .line 353
    .line 354
    .line 355
    invoke-interface {v3}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 356
    move-result-object v3

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 360
    move-result-object v3

    .line 361
    .line 362
    sget-object v4, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v4}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 366
    move-result-object v5

    .line 367
    .line 368
    if-eqz v5, :cond_1d

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5}, Lcom/kubi/assets/entity/SmallEntity;->getBaseCurrency()Ljava/lang/String;

    .line 372
    move-result-object v5

    .line 373
    goto :goto_16

    .line 374
    :cond_1d
    move-object v5, v2

    .line 375
    .line 376
    .line 377
    :goto_16
    invoke-static {v1, v3, v5}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 378
    move-result-object v1

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 382
    move-result-object v3

    .line 383
    .line 384
    if-eqz v3, :cond_1e

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3}, Lcom/kubi/assets/entity/SmallEntity;->getQuotaLimit()Ljava/math/BigDecimal;

    .line 388
    move-result-object v2

    .line 389
    .line 390
    .line 391
    :cond_1e
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 392
    move-result v1

    .line 393
    .line 394
    if-ltz v1, :cond_1f

    .line 395
    return v0

    .line 396
    :cond_1f
    return p0
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
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
.end method
