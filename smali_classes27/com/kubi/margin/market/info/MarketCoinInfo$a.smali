.class public final Lcom/kubi/margin/market/info/MarketCoinInfo$a;
.super Ljava/lang/Object;
.source "MarginMarketInfoEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/margin/market/info/MarketCoinInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/margin/market/info/MarketCoinInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
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
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/margin/market/info/MarketCoinInfo;
    .locals 38

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "parcel"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    move-object v7, v3

    .line 17
    goto :goto_2

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 21
    move-result v1

    .line 22
    .line 23
    new-instance v4, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    move v5, v2

    .line 28
    .line 29
    :goto_0
    if-eq v5, v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 33
    move-result v6

    .line 34
    .line 35
    if-nez v6, :cond_1

    .line 36
    move-object v6, v3

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_1
    sget-object v6, Lcom/kubi/margin/market/info/MarketBannerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 40
    .line 41
    .line 42
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v7, v4

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 54
    move-result-object v8

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 62
    move-result-object v10

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 66
    move-result-object v11

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 70
    move-result-object v12

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 74
    move-result-object v13

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 78
    move-result v1

    .line 79
    .line 80
    if-nez v1, :cond_3

    .line 81
    move-object v14, v3

    .line 82
    goto :goto_5

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 86
    move-result v1

    .line 87
    .line 88
    new-instance v4, Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    move v5, v2

    .line 93
    .line 94
    :goto_3
    if-eq v5, v1, :cond_5

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 98
    move-result v6

    .line 99
    .line 100
    if-nez v6, :cond_4

    .line 101
    move-object v6, v3

    .line 102
    goto :goto_4

    .line 103
    .line 104
    :cond_4
    sget-object v6, Lcom/kubi/margin/market/info/MarketCoinInfoParagraph;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 105
    .line 106
    .line 107
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 108
    move-result-object v6

    .line 109
    .line 110
    .line 111
    :goto_4
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x1

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move-object v14, v4

    .line 116
    .line 117
    .line 118
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 119
    move-result v1

    .line 120
    .line 121
    if-nez v1, :cond_6

    .line 122
    move-object v1, v3

    .line 123
    goto :goto_6

    .line 124
    .line 125
    :cond_6
    sget-object v1, Lcom/kubi/margin/market/info/MarketCoinInfoRecommend;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 126
    .line 127
    .line 128
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 129
    move-result-object v1

    .line 130
    :goto_6
    move-object v15, v1

    .line 131
    .line 132
    check-cast v15, Lcom/kubi/margin/market/info/MarketCoinInfoRecommend;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 136
    move-result v1

    .line 137
    .line 138
    if-nez v1, :cond_7

    .line 139
    .line 140
    move-object/from16 v16, v3

    .line 141
    goto :goto_9

    .line 142
    .line 143
    .line 144
    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 145
    move-result v1

    .line 146
    .line 147
    new-instance v4, Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    move v5, v2

    .line 152
    .line 153
    :goto_7
    if-eq v5, v1, :cond_9

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 157
    move-result v6

    .line 158
    .line 159
    if-nez v6, :cond_8

    .line 160
    move-object v6, v3

    .line 161
    goto :goto_8

    .line 162
    .line 163
    :cond_8
    sget-object v6, Lcom/kubi/margin/entity/Tag;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 164
    .line 165
    .line 166
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 167
    move-result-object v6

    .line 168
    .line 169
    .line 170
    :goto_8
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    add-int/lit8 v5, v5, 0x1

    .line 173
    goto :goto_7

    .line 174
    .line 175
    :cond_9
    move-object/from16 v16, v4

    .line 176
    .line 177
    .line 178
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 179
    move-result-object v17

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 183
    move-result-object v18

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 187
    move-result v1

    .line 188
    .line 189
    if-nez v1, :cond_a

    .line 190
    .line 191
    move-object/from16 v19, v3

    .line 192
    goto :goto_c

    .line 193
    .line 194
    .line 195
    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 196
    move-result v1

    .line 197
    .line 198
    new-instance v4, Ljava/util/ArrayList;

    .line 199
    .line 200
    .line 201
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    move v5, v2

    .line 203
    .line 204
    :goto_a
    if-eq v5, v1, :cond_c

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 208
    move-result v6

    .line 209
    .line 210
    if-nez v6, :cond_b

    .line 211
    move-object v6, v3

    .line 212
    goto :goto_b

    .line 213
    .line 214
    :cond_b
    sget-object v6, Lcom/kubi/margin/market/info/MarketCoinInfoFAQ;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 215
    .line 216
    .line 217
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 218
    move-result-object v6

    .line 219
    .line 220
    .line 221
    :goto_b
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    add-int/lit8 v5, v5, 0x1

    .line 224
    goto :goto_a

    .line 225
    .line 226
    :cond_c
    move-object/from16 v19, v4

    .line 227
    .line 228
    .line 229
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 230
    move-result-object v20

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 234
    move-result-object v21

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 238
    move-result-object v22

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 242
    move-result-object v23

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 246
    move-result-object v24

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 250
    move-result v1

    .line 251
    .line 252
    if-nez v1, :cond_d

    .line 253
    move-object v1, v3

    .line 254
    goto :goto_d

    .line 255
    .line 256
    :cond_d
    sget-object v1, Lcom/kubi/margin/market/info/PriceLiveData;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 257
    .line 258
    .line 259
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 260
    move-result-object v1

    .line 261
    .line 262
    :goto_d
    move-object/from16 v25, v1

    .line 263
    .line 264
    check-cast v25, Lcom/kubi/margin/market/info/PriceLiveData;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 268
    move-result-object v26

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 272
    move-result-object v27

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 276
    move-result-object v28

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 280
    move-result-object v29

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 284
    move-result v1

    .line 285
    .line 286
    if-nez v1, :cond_e

    .line 287
    .line 288
    move-object/from16 v30, v3

    .line 289
    goto :goto_10

    .line 290
    .line 291
    .line 292
    :cond_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 293
    move-result v1

    .line 294
    .line 295
    new-instance v4, Ljava/util/ArrayList;

    .line 296
    .line 297
    .line 298
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    move v5, v2

    .line 300
    .line 301
    :goto_e
    if-eq v5, v1, :cond_10

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 305
    move-result v6

    .line 306
    .line 307
    if-nez v6, :cond_f

    .line 308
    move-object v6, v3

    .line 309
    goto :goto_f

    .line 310
    .line 311
    :cond_f
    sget-object v6, Lcom/kubi/margin/market/info/MarketBannerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 312
    .line 313
    .line 314
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 315
    move-result-object v6

    .line 316
    .line 317
    .line 318
    :goto_f
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    add-int/lit8 v5, v5, 0x1

    .line 321
    goto :goto_e

    .line 322
    .line 323
    :cond_10
    move-object/from16 v30, v4

    .line 324
    .line 325
    .line 326
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 327
    move-result-object v31

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 331
    move-result v1

    .line 332
    const/4 v3, 0x1

    .line 333
    .line 334
    if-eqz v1, :cond_11

    .line 335
    .line 336
    move/from16 v32, v3

    .line 337
    goto :goto_11

    .line 338
    .line 339
    :cond_11
    move/from16 v32, v2

    .line 340
    .line 341
    .line 342
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 343
    move-result v1

    .line 344
    .line 345
    if-eqz v1, :cond_12

    .line 346
    .line 347
    move/from16 v33, v3

    .line 348
    goto :goto_12

    .line 349
    .line 350
    :cond_12
    move/from16 v33, v2

    .line 351
    .line 352
    .line 353
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 354
    move-result v1

    .line 355
    .line 356
    if-eqz v1, :cond_13

    .line 357
    .line 358
    move/from16 v34, v3

    .line 359
    goto :goto_13

    .line 360
    .line 361
    :cond_13
    move/from16 v34, v2

    .line 362
    .line 363
    .line 364
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 365
    move-result v1

    .line 366
    .line 367
    if-eqz v1, :cond_14

    .line 368
    .line 369
    move/from16 v35, v3

    .line 370
    goto :goto_14

    .line 371
    .line 372
    :cond_14
    move/from16 v35, v2

    .line 373
    .line 374
    .line 375
    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 376
    move-result v1

    .line 377
    .line 378
    if-eqz v1, :cond_15

    .line 379
    .line 380
    move/from16 v36, v3

    .line 381
    goto :goto_15

    .line 382
    .line 383
    :cond_15
    move/from16 v36, v2

    .line 384
    .line 385
    .line 386
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 387
    move-result v0

    .line 388
    .line 389
    if-eqz v0, :cond_16

    .line 390
    .line 391
    move/from16 v37, v3

    .line 392
    goto :goto_16

    .line 393
    .line 394
    :cond_16
    move/from16 v37, v2

    .line 395
    .line 396
    :goto_16
    new-instance v6, Lcom/kubi/margin/market/info/MarketCoinInfo;

    .line 397
    .line 398
    .line 399
    invoke-direct/range {v6 .. v37}, Lcom/kubi/margin/market/info/MarketCoinInfo;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kubi/margin/market/info/MarketCoinInfoRecommend;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/margin/market/info/PriceLiveData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZZZ)V

    .line 400
    return-object v6
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
.end method

.method public final b(I)[Lcom/kubi/margin/market/info/MarketCoinInfo;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/margin/market/info/MarketCoinInfo;

    .line 3
    return-object p1
    .line 4
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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/margin/market/info/MarketCoinInfo$a;->a(Landroid/os/Parcel;)Lcom/kubi/margin/market/info/MarketCoinInfo;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/margin/market/info/MarketCoinInfo$a;->b(I)[Lcom/kubi/margin/market/info/MarketCoinInfo;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method
