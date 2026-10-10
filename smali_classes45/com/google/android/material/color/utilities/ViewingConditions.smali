.class public final Lcom/google/android/material/color/utilities/ViewingConditions;
.super Ljava/lang/Object;
.source "ViewingConditions.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;


# instance fields
.field private final aw:D

.field private final c:D

.field private final fl:D

.field private final flRoot:D

.field private final n:D

.field private final nbb:D

.field private final nc:D

.field private final ncb:D

.field private final rgbD:[D

.field private final z:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/material/color/utilities/ViewingConditions;->defaultWithBackgroundLstar(D)Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/google/android/material/color/utilities/ViewingConditions;->DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;

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
.end method

.method private constructor <init>(DDDDDD[DDDD)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->n:D

    .line 6
    .line 7
    iput-wide p3, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->aw:D

    .line 8
    .line 9
    iput-wide p5, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->nbb:D

    .line 10
    .line 11
    iput-wide p7, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->ncb:D

    .line 12
    .line 13
    iput-wide p9, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->c:D

    .line 14
    .line 15
    iput-wide p11, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->nc:D

    .line 16
    .line 17
    iput-object p13, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->rgbD:[D

    .line 18
    .line 19
    iput-wide p14, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->fl:D

    .line 20
    .line 21
    move-wide/from16 p1, p16

    .line 22
    .line 23
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->flRoot:D

    .line 24
    .line 25
    move-wide/from16 p1, p18

    .line 26
    .line 27
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->z:D

    .line 28
    return-void
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
.end method

.method public static defaultWithBackgroundLstar(D)Lcom/google/android/material/color/utilities/ViewingConditions;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/material/color/utilities/ColorUtils;->whitePointD65()[D

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const-wide v3, 0x404fd4bbab8b494cL    # 63.66197723675813

    .line 16
    mul-double/2addr v1, v3

    .line 17
    .line 18
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 19
    div-double/2addr v1, v3

    .line 20
    .line 21
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 22
    const/4 v7, 0x0

    .line 23
    move-wide v3, p0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v7}, Lcom/google/android/material/color/utilities/ViewingConditions;->make([DDDDZ)Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
.end method

.method public static make([DDDDZ)Lcom/google/android/material/color/utilities/ViewingConditions;
    .locals 44

    .line 1
    .line 2
    move-wide/from16 v0, p1

    .line 3
    const/4 v2, 0x3

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v3, 0x3fb999999999999aL    # 0.1

    .line 9
    .line 10
    move-wide/from16 v5, p3

    .line 11
    .line 12
    .line 13
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 14
    move-result-wide v5

    .line 15
    .line 16
    sget-object v7, Lcom/google/android/material/color/utilities/Cam16;->XYZ_TO_CAM16RGB:[[D

    .line 17
    const/4 v8, 0x0

    .line 18
    .line 19
    aget-wide v9, p0, v8

    .line 20
    .line 21
    aget-object v11, v7, v8

    .line 22
    .line 23
    aget-wide v12, v11, v8

    .line 24
    mul-double/2addr v12, v9

    .line 25
    const/4 v14, 0x1

    .line 26
    .line 27
    aget-wide v15, p0, v14

    .line 28
    .line 29
    aget-wide v17, v11, v14

    .line 30
    .line 31
    mul-double v17, v17, v15

    .line 32
    .line 33
    add-double v12, v12, v17

    .line 34
    .line 35
    const/16 v17, 0x2

    .line 36
    .line 37
    aget-wide v18, p0, v17

    .line 38
    .line 39
    aget-wide v20, v11, v17

    .line 40
    .line 41
    mul-double v20, v20, v18

    .line 42
    .line 43
    add-double v12, v12, v20

    .line 44
    .line 45
    aget-object v11, v7, v14

    .line 46
    .line 47
    aget-wide v20, v11, v8

    .line 48
    .line 49
    mul-double v20, v20, v9

    .line 50
    .line 51
    aget-wide v22, v11, v14

    .line 52
    .line 53
    mul-double v22, v22, v15

    .line 54
    .line 55
    add-double v20, v20, v22

    .line 56
    .line 57
    aget-wide v22, v11, v17

    .line 58
    .line 59
    mul-double v22, v22, v18

    .line 60
    .line 61
    add-double v20, v20, v22

    .line 62
    .line 63
    aget-object v7, v7, v17

    .line 64
    .line 65
    aget-wide v22, v7, v8

    .line 66
    .line 67
    mul-double v9, v9, v22

    .line 68
    .line 69
    aget-wide v22, v7, v14

    .line 70
    .line 71
    mul-double v15, v15, v22

    .line 72
    add-double/2addr v9, v15

    .line 73
    .line 74
    aget-wide v15, v7, v17

    .line 75
    .line 76
    mul-double v18, v18, v15

    .line 77
    .line 78
    add-double v9, v9, v18

    .line 79
    .line 80
    const-wide/high16 v15, 0x4024000000000000L    # 10.0

    .line 81
    .line 82
    div-double v18, p5, v15

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    const-wide v22, 0x3fe999999999999aL    # 0.8

    .line 88
    .line 89
    add-double v35, v18, v22

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    const-wide v18, 0x3feccccccccccccdL    # 0.9

    .line 95
    .line 96
    cmpl-double v7, v35, v18

    .line 97
    .line 98
    if-ltz v7, :cond_0

    .line 99
    .line 100
    sub-double v18, v35, v18

    .line 101
    .line 102
    mul-double v26, v18, v15

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    const-wide v22, 0x3fe2e147ae147ae1L    # 0.59

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    const-wide v24, 0x3fe6147ae147ae14L    # 0.69

    .line 113
    .line 114
    .line 115
    invoke-static/range {v22 .. v27}, Lcom/google/android/material/color/utilities/MathUtils;->lerp(DDD)D

    .line 116
    move-result-wide v15

    .line 117
    .line 118
    :goto_0
    move-wide/from16 v33, v15

    .line 119
    goto :goto_1

    .line 120
    .line 121
    :cond_0
    sub-double v18, v35, v22

    .line 122
    .line 123
    mul-double v26, v18, v15

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    const-wide v22, 0x3fe0cccccccccccdL    # 0.525

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    const-wide v24, 0x3fe2e147ae147ae1L    # 0.59

    .line 134
    .line 135
    .line 136
    invoke-static/range {v22 .. v27}, Lcom/google/android/material/color/utilities/MathUtils;->lerp(DDD)D

    .line 137
    move-result-wide v15

    .line 138
    goto :goto_0

    .line 139
    .line 140
    :goto_1
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 141
    .line 142
    if-eqz p7, :cond_1

    .line 143
    .line 144
    move-wide/from16 v18, v3

    .line 145
    .line 146
    move-wide/from16 v26, v15

    .line 147
    goto :goto_2

    .line 148
    .line 149
    :cond_1
    move-wide/from16 v18, v3

    .line 150
    neg-double v3, v0

    .line 151
    .line 152
    const-wide/high16 v22, 0x4045000000000000L    # 42.0

    .line 153
    .line 154
    sub-double v3, v3, v22

    .line 155
    .line 156
    const-wide/high16 v22, 0x4057000000000000L    # 92.0

    .line 157
    .line 158
    div-double v3, v3, v22

    .line 159
    .line 160
    .line 161
    invoke-static {v3, v4}, Ljava/lang/Math;->exp(D)D

    .line 162
    move-result-wide v3

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    const-wide v22, 0x3fd1c71c71c71c72L    # 0.2777777777777778

    .line 168
    .line 169
    mul-double v3, v3, v22

    .line 170
    .line 171
    sub-double v3, v15, v3

    .line 172
    .line 173
    mul-double v3, v3, v35

    .line 174
    .line 175
    move-wide/from16 v26, v3

    .line 176
    .line 177
    :goto_2
    const-wide/16 v22, 0x0

    .line 178
    .line 179
    const-wide/high16 v24, 0x3ff0000000000000L    # 1.0

    .line 180
    .line 181
    .line 182
    invoke-static/range {v22 .. v27}, Lcom/google/android/material/color/utilities/MathUtils;->clampDouble(DDD)D

    .line 183
    move-result-wide v3

    .line 184
    .line 185
    const-wide/high16 v22, 0x4059000000000000L    # 100.0

    .line 186
    .line 187
    div-double v24, v22, v12

    .line 188
    .line 189
    mul-double v24, v24, v3

    .line 190
    .line 191
    add-double v24, v24, v15

    .line 192
    .line 193
    sub-double v24, v24, v3

    .line 194
    .line 195
    div-double v26, v22, v20

    .line 196
    .line 197
    mul-double v26, v26, v3

    .line 198
    .line 199
    add-double v26, v26, v15

    .line 200
    .line 201
    sub-double v26, v26, v3

    .line 202
    .line 203
    div-double v28, v22, v9

    .line 204
    .line 205
    mul-double v28, v28, v3

    .line 206
    .line 207
    add-double v28, v28, v15

    .line 208
    .line 209
    sub-double v28, v28, v3

    .line 210
    .line 211
    new-array v3, v2, [D

    .line 212
    .line 213
    aput-wide v24, v3, v8

    .line 214
    .line 215
    aput-wide v26, v3, v14

    .line 216
    .line 217
    aput-wide v28, v3, v17

    .line 218
    .line 219
    const-wide/high16 v24, 0x4014000000000000L    # 5.0

    .line 220
    .line 221
    mul-double v24, v24, v0

    .line 222
    .line 223
    add-double v26, v24, v15

    .line 224
    .line 225
    div-double v26, v15, v26

    .line 226
    .line 227
    mul-double v28, v26, v26

    .line 228
    .line 229
    mul-double v28, v28, v26

    .line 230
    .line 231
    mul-double v28, v28, v26

    .line 232
    .line 233
    sub-double v15, v15, v28

    .line 234
    .line 235
    mul-double v28, v28, v0

    .line 236
    .line 237
    mul-double v0, v15, v18

    .line 238
    mul-double/2addr v0, v15

    .line 239
    .line 240
    .line 241
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->cbrt(D)D

    .line 242
    move-result-wide v15

    .line 243
    mul-double/2addr v0, v15

    .line 244
    .line 245
    add-double v0, v28, v0

    .line 246
    .line 247
    .line 248
    invoke-static {v5, v6}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    .line 249
    move-result-wide v4

    .line 250
    .line 251
    aget-wide v6, p0, v14

    .line 252
    div-double/2addr v4, v6

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    const-wide v6, 0x3ff7ae147ae147aeL    # 1.48

    .line 258
    .line 259
    .line 260
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 261
    move-result-wide v15

    .line 262
    .line 263
    add-double v42, v15, v6

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    const-wide v6, 0x3fc999999999999aL    # 0.2

    .line 269
    .line 270
    .line 271
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 272
    move-result-wide v6

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    const-wide v15, 0x3fe7333333333333L    # 0.725

    .line 278
    .line 279
    div-double v29, v15, v6

    .line 280
    .line 281
    aget-wide v6, v3, v8

    .line 282
    mul-double/2addr v6, v0

    .line 283
    mul-double/2addr v6, v12

    .line 284
    .line 285
    div-double v6, v6, v22

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    const-wide v11, 0x3fdae147ae147ae1L    # 0.42

    .line 291
    .line 292
    .line 293
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 294
    move-result-wide v6

    .line 295
    .line 296
    aget-wide v15, v3, v14

    .line 297
    mul-double/2addr v15, v0

    .line 298
    .line 299
    mul-double v15, v15, v20

    .line 300
    .line 301
    move/from16 p3, v8

    .line 302
    .line 303
    move-wide/from16 v18, v9

    .line 304
    .line 305
    div-double v8, v15, v22

    .line 306
    .line 307
    .line 308
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 309
    move-result-wide v8

    .line 310
    .line 311
    aget-wide v15, v3, v17

    .line 312
    mul-double/2addr v15, v0

    .line 313
    .line 314
    mul-double v15, v15, v18

    .line 315
    .line 316
    move/from16 p4, v14

    .line 317
    .line 318
    div-double v14, v15, v22

    .line 319
    .line 320
    .line 321
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 322
    move-result-wide v10

    .line 323
    .line 324
    new-array v12, v2, [D

    .line 325
    .line 326
    aput-wide v6, v12, p3

    .line 327
    .line 328
    aput-wide v8, v12, p4

    .line 329
    .line 330
    aput-wide v10, v12, v17

    .line 331
    .line 332
    aget-wide v6, v12, p3

    .line 333
    .line 334
    const-wide/high16 v8, 0x4079000000000000L    # 400.0

    .line 335
    .line 336
    mul-double v10, v6, v8

    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    const-wide v13, 0x403b2147ae147ae1L    # 27.13

    .line 342
    add-double/2addr v6, v13

    .line 343
    div-double/2addr v10, v6

    .line 344
    .line 345
    aget-wide v6, v12, p4

    .line 346
    .line 347
    mul-double v15, v6, v8

    .line 348
    add-double/2addr v6, v13

    .line 349
    div-double/2addr v15, v6

    .line 350
    .line 351
    aget-wide v6, v12, v17

    .line 352
    mul-double/2addr v8, v6

    .line 353
    add-double/2addr v6, v13

    .line 354
    div-double/2addr v8, v6

    .line 355
    .line 356
    new-array v2, v2, [D

    .line 357
    .line 358
    aput-wide v10, v2, p3

    .line 359
    .line 360
    aput-wide v15, v2, p4

    .line 361
    .line 362
    aput-wide v8, v2, v17

    .line 363
    .line 364
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 365
    .line 366
    aget-wide v8, v2, p3

    .line 367
    mul-double/2addr v8, v6

    .line 368
    .line 369
    aget-wide v6, v2, p4

    .line 370
    add-double/2addr v8, v6

    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    const-wide v6, 0x3fa999999999999aL    # 0.05

    .line 376
    .line 377
    aget-wide v10, v2, v17

    .line 378
    mul-double/2addr v10, v6

    .line 379
    add-double/2addr v8, v10

    .line 380
    .line 381
    mul-double v27, v8, v29

    .line 382
    .line 383
    new-instance v24, Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 384
    .line 385
    const-wide/high16 v6, 0x3fd0000000000000L    # 0.25

    .line 386
    .line 387
    .line 388
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 389
    move-result-wide v40

    .line 390
    .line 391
    move-wide/from16 v31, v29

    .line 392
    .line 393
    move-wide/from16 v38, v0

    .line 394
    .line 395
    move-object/from16 v37, v3

    .line 396
    .line 397
    move-wide/from16 v25, v4

    .line 398
    .line 399
    .line 400
    invoke-direct/range {v24 .. v43}, Lcom/google/android/material/color/utilities/ViewingConditions;-><init>(DDDDDD[DDDD)V

    .line 401
    return-object v24
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
.end method


# virtual methods
.method public getAw()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->aw:D

    .line 3
    return-wide v0
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
.end method

.method public getC()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->c:D

    .line 3
    return-wide v0
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
.end method

.method public getFl()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->fl:D

    .line 3
    return-wide v0
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
.end method

.method public getFlRoot()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->flRoot:D

    .line 3
    return-wide v0
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
.end method

.method public getN()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->n:D

    .line 3
    return-wide v0
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
.end method

.method public getNbb()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->nbb:D

    .line 3
    return-wide v0
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
.end method

.method public getNc()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->nc:D

    .line 3
    return-wide v0
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
.end method

.method public getNcb()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->ncb:D

    .line 3
    return-wide v0
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
.end method

.method public getRgbD()[D
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->rgbD:[D

    .line 3
    return-object v0
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
.end method

.method public getZ()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->z:D

    .line 3
    return-wide v0
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
.end method
