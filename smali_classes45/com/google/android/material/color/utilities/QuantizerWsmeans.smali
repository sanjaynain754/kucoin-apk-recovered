.class public final Lcom/google/android/material/color/utilities/QuantizerWsmeans;
.super Ljava/lang/Object;
.source "QuantizerWsmeans.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;
    }
.end annotation


# static fields
.field private static final MAX_ITERATIONS:I = 0xa

.field private static final MIN_MOVEMENT_DISTANCE:D = 3.0


# direct methods
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
.end method

.method public static quantize([I[II)Ljava/util/Map;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[II)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    new-instance v3, Ljava/util/Random;

    .line 8
    .line 9
    .line 10
    const-wide/32 v4, 0x42688

    .line 11
    .line 12
    .line 13
    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 14
    .line 15
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    .line 18
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    array-length v5, v0

    .line 20
    .line 21
    new-array v5, v5, [[D

    .line 22
    array-length v6, v0

    .line 23
    .line 24
    new-array v6, v6, [I

    .line 25
    .line 26
    new-instance v7, Lcom/google/android/material/color/utilities/PointProviderLab;

    .line 27
    .line 28
    .line 29
    invoke-direct {v7}, Lcom/google/android/material/color/utilities/PointProviderLab;-><init>()V

    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v10, 0x0

    .line 32
    :goto_0
    array-length v11, v0

    .line 33
    .line 34
    if-ge v9, v11, :cond_1

    .line 35
    .line 36
    aget v11, v0, v9

    .line 37
    .line 38
    .line 39
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object v12

    .line 41
    .line 42
    .line 43
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    move-result-object v12

    .line 45
    .line 46
    check-cast v12, Ljava/lang/Integer;

    .line 47
    .line 48
    if-nez v12, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-interface {v7, v11}, Lcom/google/android/material/color/utilities/PointProvider;->fromInt(I)[D

    .line 52
    move-result-object v12

    .line 53
    .line 54
    aput-object v12, v5, v10

    .line 55
    .line 56
    aput v11, v6, v10

    .line 57
    add-int/2addr v10, v2

    .line 58
    .line 59
    .line 60
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    move-result-object v11

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v12

    .line 66
    .line 67
    .line 68
    invoke-interface {v4, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    move-result-object v11

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 77
    move-result v12

    .line 78
    add-int/2addr v12, v2

    .line 79
    .line 80
    .line 81
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    move-result-object v12

    .line 83
    .line 84
    .line 85
    invoke-interface {v4, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :goto_1
    add-int/2addr v9, v2

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :cond_1
    new-array v0, v10, [I

    .line 90
    const/4 v9, 0x0

    .line 91
    .line 92
    :goto_2
    if-ge v9, v10, :cond_2

    .line 93
    .line 94
    aget v11, v6, v9

    .line 95
    .line 96
    .line 97
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    move-result-object v11

    .line 99
    .line 100
    .line 101
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    move-result-object v11

    .line 103
    .line 104
    check-cast v11, Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 108
    move-result v11

    .line 109
    .line 110
    aput v11, v0, v9

    .line 111
    add-int/2addr v9, v2

    .line 112
    goto :goto_2

    .line 113
    .line 114
    :cond_2
    move/from16 v9, p2

    .line 115
    .line 116
    .line 117
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 118
    move-result v4

    .line 119
    array-length v6, v1

    .line 120
    .line 121
    if-eqz v6, :cond_3

    .line 122
    array-length v6, v1

    .line 123
    .line 124
    .line 125
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 126
    move-result v4

    .line 127
    .line 128
    :cond_3
    new-array v6, v4, [[D

    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    :goto_3
    array-length v12, v1

    .line 132
    .line 133
    if-ge v9, v12, :cond_4

    .line 134
    .line 135
    aget v12, v1, v9

    .line 136
    .line 137
    .line 138
    invoke-interface {v7, v12}, Lcom/google/android/material/color/utilities/PointProvider;->fromInt(I)[D

    .line 139
    move-result-object v12

    .line 140
    .line 141
    aput-object v12, v6, v9

    .line 142
    add-int/2addr v11, v2

    .line 143
    add-int/2addr v9, v2

    .line 144
    goto :goto_3

    .line 145
    .line 146
    :cond_4
    sub-int v1, v4, v11

    .line 147
    .line 148
    if-lez v1, :cond_5

    .line 149
    const/4 v9, 0x0

    .line 150
    .line 151
    :goto_4
    if-ge v9, v1, :cond_5

    .line 152
    add-int/2addr v9, v2

    .line 153
    goto :goto_4

    .line 154
    .line 155
    :cond_5
    new-array v1, v10, [I

    .line 156
    const/4 v9, 0x0

    .line 157
    .line 158
    :goto_5
    if-ge v9, v10, :cond_6

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    .line 162
    move-result v11

    .line 163
    .line 164
    aput v11, v1, v9

    .line 165
    add-int/2addr v9, v2

    .line 166
    goto :goto_5

    .line 167
    .line 168
    :cond_6
    new-array v3, v4, [[I

    .line 169
    const/4 v9, 0x0

    .line 170
    .line 171
    :goto_6
    if-ge v9, v4, :cond_7

    .line 172
    .line 173
    new-array v11, v4, [I

    .line 174
    .line 175
    aput-object v11, v3, v9

    .line 176
    add-int/2addr v9, v2

    .line 177
    goto :goto_6

    .line 178
    .line 179
    :cond_7
    new-array v9, v4, [[Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;

    .line 180
    const/4 v11, 0x0

    .line 181
    .line 182
    :goto_7
    if-ge v11, v4, :cond_9

    .line 183
    .line 184
    new-array v12, v4, [Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;

    .line 185
    .line 186
    aput-object v12, v9, v11

    .line 187
    const/4 v12, 0x0

    .line 188
    .line 189
    :goto_8
    if-ge v12, v4, :cond_8

    .line 190
    .line 191
    aget-object v13, v9, v11

    .line 192
    .line 193
    new-instance v14, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;

    .line 194
    .line 195
    .line 196
    invoke-direct {v14}, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;-><init>()V

    .line 197
    .line 198
    aput-object v14, v13, v12

    .line 199
    add-int/2addr v12, v2

    .line 200
    goto :goto_8

    .line 201
    :cond_8
    add-int/2addr v11, v2

    .line 202
    goto :goto_7

    .line 203
    .line 204
    :cond_9
    new-array v11, v4, [I

    .line 205
    const/4 v12, 0x0

    .line 206
    .line 207
    :goto_9
    const/16 v13, 0xa

    .line 208
    .line 209
    if-ge v12, v13, :cond_16

    .line 210
    const/4 v13, 0x0

    .line 211
    .line 212
    :goto_a
    if-ge v13, v4, :cond_c

    .line 213
    .line 214
    add-int/lit8 v14, v13, 0x1

    .line 215
    move v15, v14

    .line 216
    .line 217
    :goto_b
    if-ge v15, v4, :cond_a

    .line 218
    .line 219
    move/from16 v16, v2

    .line 220
    .line 221
    aget-object v2, v6, v13

    .line 222
    .line 223
    aget-object v8, v6, v15

    .line 224
    .line 225
    move-object/from16 p0, v0

    .line 226
    .line 227
    move-object/from16 p1, v1

    .line 228
    .line 229
    .line 230
    invoke-interface {v7, v2, v8}, Lcom/google/android/material/color/utilities/PointProvider;->distance([D[D)D

    .line 231
    move-result-wide v0

    .line 232
    .line 233
    aget-object v2, v9, v15

    .line 234
    .line 235
    aget-object v2, v2, v13

    .line 236
    .line 237
    iput-wide v0, v2, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->distance:D

    .line 238
    .line 239
    iput v13, v2, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->index:I

    .line 240
    .line 241
    aget-object v2, v9, v13

    .line 242
    .line 243
    aget-object v2, v2, v15

    .line 244
    .line 245
    iput-wide v0, v2, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->distance:D

    .line 246
    .line 247
    iput v15, v2, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->index:I

    .line 248
    .line 249
    add-int/lit8 v15, v15, 0x1

    .line 250
    .line 251
    move-object/from16 v0, p0

    .line 252
    .line 253
    move-object/from16 v1, p1

    .line 254
    .line 255
    move/from16 v2, v16

    .line 256
    goto :goto_b

    .line 257
    .line 258
    :cond_a
    move-object/from16 p0, v0

    .line 259
    .line 260
    move-object/from16 p1, v1

    .line 261
    .line 262
    move/from16 v16, v2

    .line 263
    .line 264
    aget-object v0, v9, v13

    .line 265
    .line 266
    .line 267
    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 268
    const/4 v0, 0x0

    .line 269
    .line 270
    :goto_c
    if-ge v0, v4, :cond_b

    .line 271
    .line 272
    aget-object v1, v3, v13

    .line 273
    .line 274
    aget-object v2, v9, v13

    .line 275
    .line 276
    aget-object v2, v2, v0

    .line 277
    .line 278
    iget v2, v2, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->index:I

    .line 279
    .line 280
    aput v2, v1, v0

    .line 281
    .line 282
    add-int/lit8 v0, v0, 0x1

    .line 283
    goto :goto_c

    .line 284
    .line 285
    :cond_b
    move-object/from16 v0, p0

    .line 286
    .line 287
    move-object/from16 v1, p1

    .line 288
    move v13, v14

    .line 289
    .line 290
    move/from16 v2, v16

    .line 291
    goto :goto_a

    .line 292
    .line 293
    :cond_c
    move-object/from16 p0, v0

    .line 294
    .line 295
    move-object/from16 p1, v1

    .line 296
    .line 297
    move/from16 v16, v2

    .line 298
    const/4 v0, 0x0

    .line 299
    const/4 v1, 0x0

    .line 300
    .line 301
    :goto_d
    if-ge v0, v10, :cond_11

    .line 302
    .line 303
    aget-object v2, v5, v0

    .line 304
    .line 305
    aget v8, p1, v0

    .line 306
    .line 307
    aget-object v13, v6, v8

    .line 308
    .line 309
    .line 310
    invoke-interface {v7, v2, v13}, Lcom/google/android/material/color/utilities/PointProvider;->distance([D[D)D

    .line 311
    move-result-wide v13

    .line 312
    .line 313
    move/from16 v18, v0

    .line 314
    .line 315
    move-wide/from16 v19, v13

    .line 316
    const/4 v0, -0x1

    .line 317
    const/4 v15, 0x0

    .line 318
    .line 319
    :goto_e
    if-ge v15, v4, :cond_f

    .line 320
    .line 321
    aget-object v21, v9, v8

    .line 322
    .line 323
    move/from16 v22, v1

    .line 324
    .line 325
    aget-object v1, v21, v15

    .line 326
    .line 327
    move-object/from16 v21, v5

    .line 328
    .line 329
    move-object/from16 v23, v6

    .line 330
    .line 331
    iget-wide v5, v1, Lcom/google/android/material/color/utilities/QuantizerWsmeans$Distance;->distance:D

    .line 332
    .line 333
    const-wide/high16 v24, 0x4010000000000000L    # 4.0

    .line 334
    .line 335
    mul-double v24, v24, v13

    .line 336
    .line 337
    cmpl-double v1, v5, v24

    .line 338
    .line 339
    if-ltz v1, :cond_d

    .line 340
    goto :goto_f

    .line 341
    .line 342
    :cond_d
    aget-object v1, v23, v15

    .line 343
    .line 344
    .line 345
    invoke-interface {v7, v2, v1}, Lcom/google/android/material/color/utilities/PointProvider;->distance([D[D)D

    .line 346
    move-result-wide v5

    .line 347
    .line 348
    cmpg-double v1, v5, v19

    .line 349
    .line 350
    if-gez v1, :cond_e

    .line 351
    .line 352
    move-wide/from16 v19, v5

    .line 353
    move v0, v15

    .line 354
    .line 355
    :cond_e
    :goto_f
    add-int/lit8 v15, v15, 0x1

    .line 356
    .line 357
    move-object/from16 v5, v21

    .line 358
    .line 359
    move/from16 v1, v22

    .line 360
    .line 361
    move-object/from16 v6, v23

    .line 362
    goto :goto_e

    .line 363
    .line 364
    :cond_f
    move/from16 v22, v1

    .line 365
    .line 366
    move-object/from16 v21, v5

    .line 367
    .line 368
    move-object/from16 v23, v6

    .line 369
    const/4 v1, -0x1

    .line 370
    .line 371
    if-eq v0, v1, :cond_10

    .line 372
    .line 373
    .line 374
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sqrt(D)D

    .line 375
    move-result-wide v1

    .line 376
    .line 377
    .line 378
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    .line 379
    move-result-wide v5

    .line 380
    sub-double/2addr v1, v5

    .line 381
    .line 382
    .line 383
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 384
    move-result-wide v1

    .line 385
    .line 386
    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 387
    .line 388
    cmpl-double v1, v1, v5

    .line 389
    .line 390
    if-lez v1, :cond_10

    .line 391
    .line 392
    add-int/lit8 v1, v22, 0x1

    .line 393
    .line 394
    aput v0, p1, v18

    .line 395
    goto :goto_10

    .line 396
    .line 397
    :cond_10
    move/from16 v1, v22

    .line 398
    .line 399
    :goto_10
    add-int/lit8 v0, v18, 0x1

    .line 400
    .line 401
    move-object/from16 v5, v21

    .line 402
    .line 403
    move-object/from16 v6, v23

    .line 404
    goto :goto_d

    .line 405
    .line 406
    :cond_11
    move/from16 v22, v1

    .line 407
    .line 408
    move-object/from16 v21, v5

    .line 409
    .line 410
    move-object/from16 v23, v6

    .line 411
    .line 412
    if-nez v22, :cond_12

    .line 413
    .line 414
    if-eqz v12, :cond_12

    .line 415
    .line 416
    :goto_11
    const/16 v17, 0x0

    .line 417
    .line 418
    goto/16 :goto_15

    .line 419
    .line 420
    :cond_12
    new-array v0, v4, [D

    .line 421
    .line 422
    new-array v1, v4, [D

    .line 423
    .line 424
    new-array v2, v4, [D

    .line 425
    const/4 v5, 0x0

    .line 426
    .line 427
    .line 428
    invoke-static {v11, v5}, Ljava/util/Arrays;->fill([II)V

    .line 429
    move v6, v5

    .line 430
    .line 431
    :goto_12
    if-ge v6, v10, :cond_13

    .line 432
    .line 433
    aget v13, p1, v6

    .line 434
    .line 435
    aget-object v14, v21, v6

    .line 436
    .line 437
    aget v15, p0, v6

    .line 438
    .line 439
    aget v17, v11, v13

    .line 440
    .line 441
    add-int v17, v17, v15

    .line 442
    .line 443
    aput v17, v11, v13

    .line 444
    .line 445
    aget-wide v18, v0, v13

    .line 446
    .line 447
    aget-wide v24, v14, v5

    .line 448
    move-object v5, v9

    .line 449
    .line 450
    const/16 p2, 0x2

    .line 451
    int-to-double v8, v15

    .line 452
    .line 453
    mul-double v24, v24, v8

    .line 454
    .line 455
    add-double v18, v18, v24

    .line 456
    .line 457
    aput-wide v18, v0, v13

    .line 458
    .line 459
    aget-wide v18, v1, v13

    .line 460
    .line 461
    aget-wide v24, v14, v16

    .line 462
    .line 463
    mul-double v24, v24, v8

    .line 464
    .line 465
    add-double v18, v18, v24

    .line 466
    .line 467
    aput-wide v18, v1, v13

    .line 468
    .line 469
    aget-wide v18, v2, v13

    .line 470
    .line 471
    aget-wide v24, v14, p2

    .line 472
    .line 473
    mul-double v24, v24, v8

    .line 474
    .line 475
    add-double v18, v18, v24

    .line 476
    .line 477
    aput-wide v18, v2, v13

    .line 478
    .line 479
    add-int/lit8 v6, v6, 0x1

    .line 480
    move-object v9, v5

    .line 481
    const/4 v5, 0x0

    .line 482
    goto :goto_12

    .line 483
    :cond_13
    move-object v5, v9

    .line 484
    .line 485
    const/16 p2, 0x2

    .line 486
    const/4 v6, 0x0

    .line 487
    .line 488
    :goto_13
    if-ge v6, v4, :cond_15

    .line 489
    .line 490
    aget v8, v11, v6

    .line 491
    .line 492
    if-nez v8, :cond_14

    .line 493
    const/4 v8, 0x3

    .line 494
    .line 495
    new-array v8, v8, [D

    .line 496
    .line 497
    .line 498
    fill-array-data v8, :array_0

    .line 499
    .line 500
    aput-object v8, v23, v6

    .line 501
    .line 502
    const/16 v17, 0x0

    .line 503
    goto :goto_14

    .line 504
    .line 505
    :cond_14
    aget-wide v13, v0, v6

    .line 506
    int-to-double v8, v8

    .line 507
    div-double/2addr v13, v8

    .line 508
    .line 509
    aget-wide v18, v1, v6

    .line 510
    .line 511
    div-double v18, v18, v8

    .line 512
    .line 513
    aget-wide v24, v2, v6

    .line 514
    .line 515
    div-double v24, v24, v8

    .line 516
    .line 517
    aget-object v8, v23, v6

    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    aput-wide v13, v8, v17

    .line 522
    .line 523
    aput-wide v18, v8, v16

    .line 524
    .line 525
    aput-wide v24, v8, p2

    .line 526
    .line 527
    :goto_14
    add-int/lit8 v6, v6, 0x1

    .line 528
    goto :goto_13

    .line 529
    .line 530
    :cond_15
    const/16 v17, 0x0

    .line 531
    .line 532
    add-int/lit8 v12, v12, 0x1

    .line 533
    .line 534
    move-object/from16 v0, p0

    .line 535
    .line 536
    move-object/from16 v1, p1

    .line 537
    move-object v9, v5

    .line 538
    .line 539
    move/from16 v2, v16

    .line 540
    .line 541
    move-object/from16 v5, v21

    .line 542
    .line 543
    move-object/from16 v6, v23

    .line 544
    .line 545
    goto/16 :goto_9

    .line 546
    .line 547
    :cond_16
    move/from16 v16, v2

    .line 548
    .line 549
    move-object/from16 v23, v6

    .line 550
    .line 551
    goto/16 :goto_11

    .line 552
    .line 553
    :goto_15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 554
    .line 555
    .line 556
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 557
    .line 558
    move/from16 v8, v17

    .line 559
    .line 560
    :goto_16
    if-ge v8, v4, :cond_19

    .line 561
    .line 562
    aget v1, v11, v8

    .line 563
    .line 564
    if-nez v1, :cond_17

    .line 565
    goto :goto_17

    .line 566
    .line 567
    :cond_17
    aget-object v2, v23, v8

    .line 568
    .line 569
    .line 570
    invoke-interface {v7, v2}, Lcom/google/android/material/color/utilities/PointProvider;->toInt([D)I

    .line 571
    move-result v2

    .line 572
    .line 573
    .line 574
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 575
    move-result-object v3

    .line 576
    .line 577
    .line 578
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 579
    move-result v3

    .line 580
    .line 581
    if-eqz v3, :cond_18

    .line 582
    goto :goto_17

    .line 583
    .line 584
    .line 585
    :cond_18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 586
    move-result-object v2

    .line 587
    .line 588
    .line 589
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 590
    move-result-object v1

    .line 591
    .line 592
    .line 593
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    :goto_17
    add-int/lit8 v8, v8, 0x1

    .line 596
    goto :goto_16

    .line 597
    :cond_19
    return-object v0

    .line 598
    nop

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
    :array_0
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
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
.end method
