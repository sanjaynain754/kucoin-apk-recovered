.class public final Lcom/appsflyer/internal/AFf1mSDK;
.super Lcom/appsflyer/internal/AFf1tSDK;
.source ""


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFInAppEventParameterName:[C = null

.field private static AFInAppEventType:I = 0x1

.field private static AFKeystoreWrapper:I

.field private static registerClient:C


# instance fields
.field private final copydefault:Lcom/appsflyer/internal/AFc1fSDK;

.field private final equals:Lcom/appsflyer/internal/AFg1pSDK;

.field private final hashCode:Lcom/appsflyer/internal/AFc1kSDK;

.field private final toString:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const v0, 0xcdfd

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    new-array v1, v1, [C

    .line 8
    .line 9
    .line 10
    fill-array-data v1, :array_0

    .line 11
    .line 12
    sput-object v1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventParameterName:[C

    .line 13
    .line 14
    sput-char v0, Lcom/appsflyer/internal/AFf1mSDK;->registerClient:C

    .line 15
    return-void

    .line 16
    nop

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :array_0
    .array-data 2
        -0x3206s
        -0x800s
        -0x3204s
        -0x7fbs
        -0x7fas
        -0x3203s
        -0x7eas
        -0x3201s
        -0x7f6s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFg1tSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/appsflyer/internal/AFg1tSDK;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, p2, p1}, Lcom/appsflyer/internal/AFf1tSDK;-><init>(Lcom/appsflyer/internal/AFh1mSDK;Lcom/appsflyer/internal/AFd1zSDK;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFc1fSDK;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->copydefault:Lcom/appsflyer/internal/AFc1fSDK;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1mSDK;->toString:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->component2()Lcom/appsflyer/internal/AFg1pSDK;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1mSDK;->equals:Lcom/appsflyer/internal/AFg1pSDK;

    .line 29
    return-void
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
.end method

.method private static a(BLjava/lang/String;I[Ljava/lang/Object;)V
    .locals 15

    .line 1
    .line 2
    move/from16 v0, p2

    .line 3
    .line 4
    sget v1, Lcom/appsflyer/internal/AFf1mSDK;->$11:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x7d

    .line 7
    .line 8
    rem-int/lit16 v2, v1, 0x80

    .line 9
    .line 10
    sput v2, Lcom/appsflyer/internal/AFf1mSDK;->$10:I

    .line 11
    .line 12
    rem-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    if-nez v1, :cond_9

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    move-object/from16 v1, p1

    .line 24
    .line 25
    :goto_0
    check-cast v1, [C

    .line 26
    .line 27
    new-instance v2, Lcom/appsflyer/internal/AFk1mSDK;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Lcom/appsflyer/internal/AFk1mSDK;-><init>()V

    .line 31
    .line 32
    sget-object v3, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventParameterName:[C

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide v4, -0x7fb8f963e9bb3202L

    .line 38
    const/4 v6, 0x0

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    array-length v7, v3

    .line 42
    .line 43
    new-array v8, v7, [C

    .line 44
    move v9, v6

    .line 45
    .line 46
    :goto_1
    if-ge v9, v7, :cond_1

    .line 47
    .line 48
    aget-char v10, v3, v9

    .line 49
    int-to-long v10, v10

    .line 50
    xor-long/2addr v10, v4

    .line 51
    long-to-int v10, v10

    .line 52
    int-to-char v10, v10

    .line 53
    .line 54
    aput-char v10, v8, v9

    .line 55
    .line 56
    add-int/lit8 v9, v9, 0x1

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    sget v3, Lcom/appsflyer/internal/AFf1mSDK;->$10:I

    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x45

    .line 62
    .line 63
    rem-int/lit16 v3, v3, 0x80

    .line 64
    .line 65
    sput v3, Lcom/appsflyer/internal/AFf1mSDK;->$11:I

    .line 66
    move-object v3, v8

    .line 67
    .line 68
    :cond_2
    sget-char v7, Lcom/appsflyer/internal/AFf1mSDK;->registerClient:C

    .line 69
    int-to-long v7, v7

    .line 70
    xor-long/2addr v4, v7

    .line 71
    long-to-int v4, v4

    .line 72
    int-to-char v4, v4

    .line 73
    .line 74
    new-array v5, v0, [C

    .line 75
    .line 76
    rem-int/lit8 v7, v0, 0x2

    .line 77
    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    add-int/lit8 v7, v0, -0x1

    .line 81
    .line 82
    aget-char v8, v1, v7

    .line 83
    sub-int/2addr v8, p0

    .line 84
    int-to-char v8, v8

    .line 85
    .line 86
    aput-char v8, v5, v7

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move v7, v0

    .line 89
    :goto_2
    const/4 v8, 0x1

    .line 90
    .line 91
    if-le v7, v8, :cond_7

    .line 92
    .line 93
    iput v6, v2, Lcom/appsflyer/internal/AFk1mSDK;->getRevenue:I

    .line 94
    .line 95
    :goto_3
    iget v9, v2, Lcom/appsflyer/internal/AFk1mSDK;->getRevenue:I

    .line 96
    .line 97
    if-ge v9, v7, :cond_7

    .line 98
    .line 99
    sget v10, Lcom/appsflyer/internal/AFf1mSDK;->$10:I

    .line 100
    .line 101
    add-int/lit8 v11, v10, 0x59

    .line 102
    .line 103
    rem-int/lit16 v11, v11, 0x80

    .line 104
    .line 105
    sput v11, Lcom/appsflyer/internal/AFf1mSDK;->$11:I

    .line 106
    .line 107
    aget-char v11, v1, v9

    .line 108
    .line 109
    iput-char v11, v2, Lcom/appsflyer/internal/AFk1mSDK;->AFAdRevenueData:C

    .line 110
    .line 111
    add-int/lit8 v12, v9, 0x1

    .line 112
    .line 113
    aget-char v12, v1, v12

    .line 114
    .line 115
    iput-char v12, v2, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:C

    .line 116
    .line 117
    if-ne v11, v12, :cond_4

    .line 118
    sub-int/2addr v11, p0

    .line 119
    int-to-char v10, v11

    .line 120
    .line 121
    aput-char v10, v5, v9

    .line 122
    .line 123
    add-int/lit8 v10, v9, 0x1

    .line 124
    sub-int/2addr v12, p0

    .line 125
    int-to-char v11, v12

    .line 126
    .line 127
    aput-char v11, v5, v10

    .line 128
    goto :goto_4

    .line 129
    .line 130
    :cond_4
    div-int v13, v11, v4

    .line 131
    .line 132
    iput v13, v2, Lcom/appsflyer/internal/AFk1mSDK;->getCurrencyIso4217Code:I

    .line 133
    rem-int/2addr v11, v4

    .line 134
    .line 135
    iput v11, v2, Lcom/appsflyer/internal/AFk1mSDK;->component4:I

    .line 136
    .line 137
    div-int v14, v12, v4

    .line 138
    .line 139
    iput v14, v2, Lcom/appsflyer/internal/AFk1mSDK;->getMonetizationNetwork:I

    .line 140
    rem-int/2addr v12, v4

    .line 141
    .line 142
    iput v12, v2, Lcom/appsflyer/internal/AFk1mSDK;->areAllFieldsValid:I

    .line 143
    .line 144
    if-ne v11, v12, :cond_5

    .line 145
    add-int/2addr v13, v4

    .line 146
    sub-int/2addr v13, v8

    .line 147
    rem-int/2addr v13, v4

    .line 148
    .line 149
    iput v13, v2, Lcom/appsflyer/internal/AFk1mSDK;->getCurrencyIso4217Code:I

    .line 150
    add-int/2addr v14, v4

    .line 151
    sub-int/2addr v14, v8

    .line 152
    rem-int/2addr v14, v4

    .line 153
    .line 154
    iput v14, v2, Lcom/appsflyer/internal/AFk1mSDK;->getMonetizationNetwork:I

    .line 155
    mul-int/2addr v13, v4

    .line 156
    add-int/2addr v13, v11

    .line 157
    mul-int/2addr v14, v4

    .line 158
    add-int/2addr v14, v12

    .line 159
    .line 160
    aget-char v10, v3, v13

    .line 161
    .line 162
    aput-char v10, v5, v9

    .line 163
    .line 164
    add-int/lit8 v10, v9, 0x1

    .line 165
    .line 166
    aget-char v11, v3, v14

    .line 167
    .line 168
    aput-char v11, v5, v10

    .line 169
    goto :goto_4

    .line 170
    .line 171
    :cond_5
    if-ne v13, v14, :cond_6

    .line 172
    .line 173
    add-int/lit8 v10, v10, 0x5d

    .line 174
    .line 175
    rem-int/lit16 v10, v10, 0x80

    .line 176
    .line 177
    sput v10, Lcom/appsflyer/internal/AFf1mSDK;->$11:I

    .line 178
    add-int/2addr v11, v4

    .line 179
    sub-int/2addr v11, v8

    .line 180
    rem-int/2addr v11, v4

    .line 181
    .line 182
    iput v11, v2, Lcom/appsflyer/internal/AFk1mSDK;->component4:I

    .line 183
    add-int/2addr v12, v4

    .line 184
    sub-int/2addr v12, v8

    .line 185
    rem-int/2addr v12, v4

    .line 186
    .line 187
    iput v12, v2, Lcom/appsflyer/internal/AFk1mSDK;->areAllFieldsValid:I

    .line 188
    mul-int/2addr v13, v4

    .line 189
    add-int/2addr v13, v11

    .line 190
    mul-int/2addr v14, v4

    .line 191
    add-int/2addr v14, v12

    .line 192
    .line 193
    aget-char v10, v3, v13

    .line 194
    .line 195
    aput-char v10, v5, v9

    .line 196
    .line 197
    add-int/lit8 v10, v9, 0x1

    .line 198
    .line 199
    aget-char v11, v3, v14

    .line 200
    .line 201
    aput-char v11, v5, v10

    .line 202
    goto :goto_4

    .line 203
    :cond_6
    mul-int/2addr v13, v4

    .line 204
    add-int/2addr v13, v12

    .line 205
    mul-int/2addr v14, v4

    .line 206
    add-int/2addr v14, v11

    .line 207
    .line 208
    aget-char v10, v3, v13

    .line 209
    .line 210
    aput-char v10, v5, v9

    .line 211
    .line 212
    add-int/lit8 v10, v9, 0x1

    .line 213
    .line 214
    aget-char v11, v3, v14

    .line 215
    .line 216
    aput-char v11, v5, v10

    .line 217
    .line 218
    :goto_4
    add-int/lit8 v9, v9, 0x2

    .line 219
    .line 220
    iput v9, v2, Lcom/appsflyer/internal/AFk1mSDK;->getRevenue:I

    .line 221
    goto :goto_3

    .line 222
    :cond_7
    move p0, v6

    .line 223
    .line 224
    :goto_5
    if-ge p0, v0, :cond_8

    .line 225
    .line 226
    aget-char v1, v5, p0

    .line 227
    .line 228
    xor-int/lit16 v1, v1, 0x359a

    .line 229
    int-to-char v1, v1

    .line 230
    .line 231
    aput-char v1, v5, p0

    .line 232
    .line 233
    add-int/lit8 p0, p0, 0x1

    .line 234
    .line 235
    sget v1, Lcom/appsflyer/internal/AFf1mSDK;->$10:I

    .line 236
    .line 237
    add-int/lit8 v1, v1, 0x43

    .line 238
    .line 239
    rem-int/lit16 v1, v1, 0x80

    .line 240
    .line 241
    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->$11:I

    .line 242
    goto :goto_5

    .line 243
    .line 244
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    invoke-direct {p0, v5}, Ljava/lang/String;-><init>([C)V

    .line 248
    .line 249
    aput-object p0, p3, v6

    .line 250
    return-void

    .line 251
    :cond_9
    const/4 p0, 0x0

    .line 252
    throw p0
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
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
.end method

.method private copy()V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x4b

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const-string v1, "[register] Successfully registered for Uninstall Tracking"

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "sentRegisterRequestToAF"

    .line 17
    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1tSDK;->component1:Lcom/appsflyer/internal/AFc1pSDK;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v3, v2}, Lcom/appsflyer/internal/AFc1pSDK;->getRevenue(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 25
    .line 26
    sget v0, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x37

    .line 29
    .line 30
    rem-int/lit16 v1, v0, 0x80

    .line 31
    .line 32
    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 33
    .line 34
    rem-int/lit8 v0, v0, 0x2

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    throw v0
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
.end method

.method private static synthetic getCurrencyIso4217Code([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    aget-object v1, p0, v0

    check-cast v1, Lcom/appsflyer/internal/AFf1mSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Lcom/appsflyer/internal/AFh1mSDK;

    .line 1
    sget p0, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    add-int/lit8 p0, p0, 0x4f

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    rem-int/lit8 p0, p0, 0x2

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    const/16 p0, 0x15

    div-int/2addr p0, v0

    :cond_0
    return-object v1
.end method

.method public static synthetic getMonetizationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    mul-int/lit16 v0, p1, 0x8d

    mul-int/lit16 v1, p2, -0x117

    add-int/2addr v0, v1

    or-int v1, p2, p3

    mul-int/lit16 v1, v1, 0x8c

    add-int/2addr v0, v1

    not-int v1, p1

    or-int/2addr v1, p2

    not-int v2, v1

    not-int v3, p3

    or-int v4, v3, p2

    not-int v4, v4

    or-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x118

    add-int/2addr v0, v2

    not-int p2, p2

    or-int/2addr p2, p1

    not-int p2, p2

    or-int/2addr p1, v3

    not-int p1, p1

    or-int/2addr p1, p2

    or-int p2, v1, p3

    not-int p2, p2

    or-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x8c

    add-int/2addr v0, p1

    const/4 p1, 0x1

    if-eq v0, p1, :cond_0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1mSDK;->getRevenue([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1mSDK;->getCurrencyIso4217Code([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic getRevenue([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFf1mSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Landroid/content/pm/PackageManager;

    .line 1
    sget v2, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    add-int/lit8 v2, v2, 0x2b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    rem-int/lit8 v2, v2, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 2
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez v0, :cond_1

    .line 3
    sget p0, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    add-int/2addr p0, v1

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    throw v3

    .line 4
    :cond_1
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 5
    :cond_2
    iget-object p0, v0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 6
    throw v3
.end method

.method private s_(Landroid/content/pm/PackageManager;)Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    const v1, -0x2e7d8b66

    .line 12
    .line 13
    .line 14
    const v2, 0x2e7d8b66

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFf1mSDK;->getMonetizationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    return-object p1
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
.end method


# virtual methods
.method public final AFAdRevenueData(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    const v1, -0x1f3bd34a

    .line 12
    .line 13
    .line 14
    const v2, 0x1f3bd34b

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFf1mSDK;->getMonetizationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 18
    return-void
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
.end method

.method public final component2(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x6b

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1kSDK;->areAllFieldsValid()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const/16 v1, 0x49

    .line 21
    .line 22
    div-int/lit8 v1, v1, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1kSDK;->areAllFieldsValid()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    :goto_0
    sget v1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x73

    .line 39
    .line 40
    rem-int/lit16 v2, v1, 0x80

    .line 41
    .line 42
    sput v2, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 43
    .line 44
    rem-int/lit8 v1, v1, 0x2

    .line 45
    .line 46
    const-string v2, "advertiserId"

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 52
    return-void

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 56
    const/4 p1, 0x0

    .line 57
    throw p1

    .line 58
    :cond_3
    return-void
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
.end method

.method public final equals()Z
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x33

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final getCurrencyIso4217Code(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 2
    sget p1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    add-int/lit8 p1, p1, 0x7d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    return-void
.end method

.method public final getMediationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 1
    .line 2
    sget p1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 3
    .line 4
    add-int/lit8 p1, p1, 0x53

    .line 5
    .line 6
    rem-int/lit16 p1, p1, 0x80

    .line 7
    .line 8
    sput p1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 9
    return-void
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
.end method

.method public final getMonetizationNetwork()V
    .locals 3

    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    add-int/lit8 v0, v0, 0x1d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 3
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->getMonetizationNetwork()V

    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1cSDK;->component2:Lcom/appsflyer/internal/AFe1zSDK;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFe1zSDK;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    sget v0, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    add-int/lit8 v0, v0, 0x15

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 7
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1mSDK;->copy()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1mSDK;->copy()V

    .line 8
    throw v1

    :cond_1
    return-void

    .line 9
    :cond_2
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->getMonetizationNetwork()V

    .line 10
    throw v1
.end method

.method public final getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 7

    .line 11
    invoke-super {p0, p1}, Lcom/appsflyer/internal/AFf1tSDK;->getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V

    .line 12
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->copydefault:Lcom/appsflyer/internal/AFc1fSDK;

    .line 13
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1fSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 14
    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getMonetizationNetwork()Lcom/appsflyer/internal/AFa1ySDK;

    move-result-object v1

    if-eqz v0, :cond_5

    .line 15
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFa1ySDK;->getCurrencyIso4217Code()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    .line 16
    :try_start_0
    const-string v1, "app_version_code"

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    .line 17
    invoke-virtual {v3}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 18
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 19
    const-string v1, "app_version_name"

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    .line 20
    invoke-virtual {v3}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 21
    invoke-virtual {p1, v1, v3}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 22
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 23
    const-string v3, "app_name"

    filled-new-array {p0, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    const v5, -0x2e7d8b66

    const v6, 0x2e7d8b66

    invoke-static {v1, v5, v6, v4}, Lcom/appsflyer/internal/AFf1mSDK;->getMonetizationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v3, v1}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 24
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-wide v3, v1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 25
    const-string/jumbo v1, "yyyy-MM-dd_HHmmssZ"

    .line 26
    new-instance v5, Ljava/text/SimpleDateFormat;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v5, v1, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 27
    const-string v1, "installDate"

    invoke-static {v5, v3, v4}, Lcom/appsflyer/internal/AFa1ySDK;->getMediationNetwork(Ljava/text/SimpleDateFormat;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 28
    const-string v3, "Exception while collecting application version info."

    invoke-static {v3, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1mSDK;->equals:Lcom/appsflyer/internal/AFg1pSDK;

    .line 30
    iget-object v3, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 31
    invoke-interface {v1, v3}, Lcom/appsflyer/internal/AFg1pSDK;->getMonetizationNetwork(Ljava/util/Map;)V

    .line 32
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 33
    const-string v3, "ivc"

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->AFAdRevenueData()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 35
    const-string v3, "appUserId"

    invoke-virtual {p1, v3, v1}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    :cond_0
    const/4 v1, 0x0

    .line 36
    :try_start_1
    const-string v3, "model"

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v3, v4}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 37
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    rsub-int/lit8 v3, v3, 0x3

    int-to-byte v3, v3

    const-string v4, "\u0003\u0007\u0005\u0006\u3601"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v5

    shr-int/lit8 v5, v5, 0x16

    rsub-int/lit8 v5, v5, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v5, v2}, Lcom/appsflyer/internal/AFf1mSDK;->a(BLjava/lang/String;I[Ljava/lang/Object;)V

    aget-object v2, v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    .line 38
    const-string v3, "Exception while collecting device brand and model."

    invoke-static {v3, v2}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    :goto_1
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v2

    const-string v3, "deviceTrackingDisabled"

    invoke-virtual {v2, v3, v1}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 40
    const-string/jumbo v2, "true"

    invoke-virtual {p1, v3, v2}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 41
    sget v2, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    add-int/lit8 v2, v2, 0x4f

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 42
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1iSDK;->l_(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFb1jSDK;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 43
    sget v2, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    add-int/lit8 v2, v2, 0x73

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    .line 44
    const-string v2, "amazon_aid"

    .line 45
    iget-object v3, v0, Lcom/appsflyer/internal/AFb1jSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 46
    invoke-virtual {p1, v2, v3}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 47
    iget-object v0, v0, Lcom/appsflyer/internal/AFb1jSDK;->getMediationNetwork:Ljava/lang/Boolean;

    .line 48
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "amazon_aid_limit"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 49
    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1cSDK;->component3:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->getMonetizationNetwork()Ljava/lang/String;

    move-result-object v0

    const-string v2, "devkey"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 50
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    .line 51
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1kSDK;->getRevenue:Lcom/appsflyer/internal/AFc1pSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1mSDK;->getRevenue(Lcom/appsflyer/internal/AFc1pSDK;)Ljava/lang/String;

    move-result-object v0

    .line 52
    const-string/jumbo v2, "uid"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 53
    const-string v0, "af_gcm_token"

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1mSDK;->toString:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 54
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1tSDK;->component1:Lcom/appsflyer/internal/AFc1pSDK;

    const-string v2, "appsFlyerCount"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFc1pSDK;->AFAdRevenueData(Ljava/lang/String;I)I

    move-result v0

    .line 55
    const-string v1, "launch_counter"

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdk"

    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 57
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1mSDK;->hashCode:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1kSDK;->component4()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 58
    sget v1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    .line 59
    const-string v1, "channel"

    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    :cond_3
    return-void

    .line 60
    :cond_4
    const-string p1, "CustomerUserId not set, Tracking is disabled"

    invoke-static {p1, v2}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;Z)V

    .line 61
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "CustomerUserId not set, register is not sent"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Context is not provided, can\'t send register request"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getRevenue(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 7
    sget p1, Lcom/appsflyer/internal/AFf1mSDK;->AFInAppEventType:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1mSDK;->AFKeystoreWrapper:I

    return-void
.end method
