.class public Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;
.super Ljava/lang/Object;
.source "BitEncoding.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final FORCE_8TO7_ENCODING:Z


# direct methods
.method private static synthetic $$$reportNull$$$0(I)V
    .locals 19

    .line 1
    .line 2
    move/from16 v0, p0

    .line 3
    .line 4
    const/16 v1, 0xe

    .line 5
    .line 6
    const/16 v2, 0xc

    .line 7
    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    const/16 v4, 0x8

    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x3

    .line 13
    const/4 v7, 0x1

    .line 14
    .line 15
    if-eq v0, v7, :cond_0

    .line 16
    .line 17
    if-eq v0, v6, :cond_0

    .line 18
    .line 19
    if-eq v0, v5, :cond_0

    .line 20
    .line 21
    if-eq v0, v4, :cond_0

    .line 22
    .line 23
    if-eq v0, v3, :cond_0

    .line 24
    .line 25
    if-eq v0, v2, :cond_0

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    const-string v8, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    const-string v8, "@NotNull method %s.%s must not return null"

    .line 33
    :goto_0
    const/4 v9, 0x2

    .line 34
    .line 35
    if-eq v0, v7, :cond_1

    .line 36
    .line 37
    if-eq v0, v6, :cond_1

    .line 38
    .line 39
    if-eq v0, v5, :cond_1

    .line 40
    .line 41
    if-eq v0, v4, :cond_1

    .line 42
    .line 43
    if-eq v0, v3, :cond_1

    .line 44
    .line 45
    if-eq v0, v2, :cond_1

    .line 46
    .line 47
    if-eq v0, v1, :cond_1

    .line 48
    move v10, v6

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v10, v9

    .line 51
    .line 52
    :goto_1
    new-array v10, v10, [Ljava/lang/Object;

    .line 53
    .line 54
    const-string v11, "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding"

    .line 55
    const/4 v12, 0x0

    .line 56
    .line 57
    if-eq v0, v7, :cond_2

    .line 58
    .line 59
    if-eq v0, v6, :cond_2

    .line 60
    .line 61
    if-eq v0, v5, :cond_2

    .line 62
    .line 63
    if-eq v0, v4, :cond_2

    .line 64
    .line 65
    if-eq v0, v3, :cond_2

    .line 66
    .line 67
    if-eq v0, v2, :cond_2

    .line 68
    .line 69
    if-eq v0, v1, :cond_2

    .line 70
    .line 71
    const-string v13, "data"

    .line 72
    .line 73
    aput-object v13, v10, v12

    .line 74
    goto :goto_2

    .line 75
    .line 76
    :cond_2
    aput-object v11, v10, v12

    .line 77
    .line 78
    :goto_2
    const-string v12, "encodeBytes"

    .line 79
    .line 80
    const-string v13, "encode8to7"

    .line 81
    .line 82
    .line 83
    const-string/jumbo v14, "splitBytesToStringArray"

    .line 84
    .line 85
    const-string v15, "decodeBytes"

    .line 86
    .line 87
    const-string v16, "dropMarker"

    .line 88
    .line 89
    const-string v17, "combineStringArrayIntoBytes"

    .line 90
    .line 91
    const-string v18, "decode7to8"

    .line 92
    .line 93
    if-eq v0, v7, :cond_9

    .line 94
    .line 95
    if-eq v0, v6, :cond_8

    .line 96
    .line 97
    if-eq v0, v5, :cond_7

    .line 98
    .line 99
    if-eq v0, v4, :cond_6

    .line 100
    .line 101
    if-eq v0, v3, :cond_5

    .line 102
    .line 103
    if-eq v0, v2, :cond_4

    .line 104
    .line 105
    if-eq v0, v1, :cond_3

    .line 106
    .line 107
    aput-object v11, v10, v7

    .line 108
    goto :goto_3

    .line 109
    .line 110
    :cond_3
    aput-object v18, v10, v7

    .line 111
    goto :goto_3

    .line 112
    .line 113
    :cond_4
    aput-object v17, v10, v7

    .line 114
    goto :goto_3

    .line 115
    .line 116
    :cond_5
    aput-object v16, v10, v7

    .line 117
    goto :goto_3

    .line 118
    .line 119
    :cond_6
    aput-object v15, v10, v7

    .line 120
    goto :goto_3

    .line 121
    .line 122
    :cond_7
    aput-object v14, v10, v7

    .line 123
    goto :goto_3

    .line 124
    .line 125
    :cond_8
    aput-object v13, v10, v7

    .line 126
    goto :goto_3

    .line 127
    .line 128
    :cond_9
    aput-object v12, v10, v7

    .line 129
    .line 130
    .line 131
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 132
    .line 133
    aput-object v12, v10, v9

    .line 134
    goto :goto_4

    .line 135
    .line 136
    :pswitch_0
    aput-object v18, v10, v9

    .line 137
    goto :goto_4

    .line 138
    .line 139
    :pswitch_1
    aput-object v17, v10, v9

    .line 140
    goto :goto_4

    .line 141
    .line 142
    :pswitch_2
    aput-object v16, v10, v9

    .line 143
    goto :goto_4

    .line 144
    .line 145
    :pswitch_3
    aput-object v15, v10, v9

    .line 146
    goto :goto_4

    .line 147
    .line 148
    :pswitch_4
    aput-object v14, v10, v9

    .line 149
    goto :goto_4

    .line 150
    .line 151
    :pswitch_5
    const-string v11, "addModuloByte"

    .line 152
    .line 153
    aput-object v11, v10, v9

    .line 154
    goto :goto_4

    .line 155
    .line 156
    :pswitch_6
    aput-object v13, v10, v9

    .line 157
    .line 158
    .line 159
    :goto_4
    :pswitch_7
    invoke-static {v8, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    move-result-object v8

    .line 161
    .line 162
    if-eq v0, v7, :cond_a

    .line 163
    .line 164
    if-eq v0, v6, :cond_a

    .line 165
    .line 166
    if-eq v0, v5, :cond_a

    .line 167
    .line 168
    if-eq v0, v4, :cond_a

    .line 169
    .line 170
    if-eq v0, v3, :cond_a

    .line 171
    .line 172
    if-eq v0, v2, :cond_a

    .line 173
    .line 174
    if-eq v0, v1, :cond_a

    .line 175
    .line 176
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    .line 179
    invoke-direct {v0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    goto :goto_5

    .line 181
    .line 182
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    .line 185
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 186
    :goto_5
    throw v0

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch
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
.end method

.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    const-string v0, "kotlin.jvm.serialization.use8to7"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    const-string/jumbo v1, "true"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    sput-boolean v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->FORCE_8TO7_ENCODING:Z

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method private constructor <init>()V
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
.end method

.method private static addModuloByte([BI)V
    .locals 3
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 v0, 0x4

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->$$$reportNull$$$0(I)V

    .line 7
    :cond_0
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    aget-byte v2, p0, v1

    .line 13
    add-int/2addr v2, p1

    .line 14
    .line 15
    and-int/lit8 v2, v2, 0x7f

    .line 16
    int-to-byte v2, v2

    .line 17
    .line 18
    aput-byte v2, p0, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
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
.end method

.method private static combineStringArrayIntoBytes([Ljava/lang/String;)[B
    .locals 10
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const/16 v0, 0xb

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->$$$reportNull$$$0(I)V

    .line 8
    :cond_0
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    move v3, v2

    .line 12
    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    aget-object v4, p0, v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 19
    move-result v4

    .line 20
    add-int/2addr v3, v4

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    new-array v0, v3, [B

    .line 26
    array-length v2, p0

    .line 27
    move v3, v1

    .line 28
    move v4, v3

    .line 29
    .line 30
    :goto_1
    if-ge v3, v2, :cond_3

    .line 31
    .line 32
    aget-object v5, p0, v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 36
    move-result v6

    .line 37
    move v7, v1

    .line 38
    .line 39
    :goto_2
    if-ge v7, v6, :cond_2

    .line 40
    .line 41
    add-int/lit8 v8, v4, 0x1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    .line 45
    move-result v9

    .line 46
    int-to-byte v9, v9

    .line 47
    .line 48
    aput-byte v9, v0, v4

    .line 49
    .line 50
    add-int/lit8 v7, v7, 0x1

    .line 51
    move v4, v8

    .line 52
    goto :goto_2

    .line 53
    .line 54
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 55
    goto :goto_1

    .line 56
    :cond_3
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
.end method

.method private static decode7to8([B)[B
    .locals 12
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const/16 v0, 0xd

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->$$$reportNull$$$0(I)V

    .line 8
    :cond_0
    array-length v0, p0

    .line 9
    .line 10
    mul-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    div-int/lit8 v0, v0, 0x8

    .line 13
    .line 14
    new-array v1, v0, [B

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    move v5, v4

    .line 19
    .line 20
    :goto_0
    if-ge v3, v0, :cond_2

    .line 21
    .line 22
    aget-byte v6, p0, v4

    .line 23
    .line 24
    and-int/lit16 v6, v6, 0xff

    .line 25
    ushr-int/2addr v6, v5

    .line 26
    .line 27
    add-int/lit8 v7, v4, 0x1

    .line 28
    .line 29
    aget-byte v8, p0, v7

    .line 30
    .line 31
    add-int/lit8 v9, v5, 0x1

    .line 32
    const/4 v10, 0x1

    .line 33
    .line 34
    shl-int v11, v10, v9

    .line 35
    sub-int/2addr v11, v10

    .line 36
    and-int/2addr v8, v11

    .line 37
    .line 38
    rsub-int/lit8 v10, v5, 0x7

    .line 39
    shl-int/2addr v8, v10

    .line 40
    add-int/2addr v6, v8

    .line 41
    int-to-byte v6, v6

    .line 42
    .line 43
    aput-byte v6, v1, v3

    .line 44
    const/4 v6, 0x6

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x2

    .line 49
    move v5, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v4, v7

    .line 52
    move v5, v9

    .line 53
    .line 54
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-object v1
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
.end method

.method public static decodeBytes([Ljava/lang/String;)[B
    .locals 2
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 v0, 0x7

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->$$$reportNull$$$0(I)V

    .line 7
    :cond_0
    array-length v0, p0

    .line 8
    .line 9
    if-lez v0, :cond_3

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    aget-object v1, p0, v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    aget-object v1, p0, v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->dropMarker([Ljava/lang/String;)[Ljava/lang/String;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/UtfEncodingKt;->stringsToBytes([Ljava/lang/String;)[B

    .line 34
    move-result-object p0

    .line 35
    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    const/16 v0, 0x8

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->$$$reportNull$$$0(I)V

    .line 42
    :cond_1
    return-object p0

    .line 43
    .line 44
    .line 45
    :cond_2
    const v1, 0xffff

    .line 46
    .line 47
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->dropMarker([Ljava/lang/String;)[Ljava/lang/String;

    .line 51
    move-result-object p0

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->combineStringArrayIntoBytes([Ljava/lang/String;)[B

    .line 55
    move-result-object p0

    .line 56
    .line 57
    const/16 v0, 0x7f

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->addModuloByte([BI)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->decode7to8([B)[B

    .line 64
    move-result-object p0

    .line 65
    return-object p0
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
.end method

.method private static dropMarker([Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const/16 v0, 0x9

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->$$$reportNull$$$0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, [Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    aget-object v1, p0, v0

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    aput-object v1, p0, v0

    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
