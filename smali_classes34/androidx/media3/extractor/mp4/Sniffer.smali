.class public final Landroidx/media3/extractor/mp4/Sniffer;
.super Ljava/lang/Object;
.source "Sniffer.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# static fields
.field public static final BRAND_HEIC:I = 0x68656963

.field public static final BRAND_QUICKTIME:I = 0x71742020

.field private static final COMPATIBLE_BRANDS:[I

.field private static final SEARCH_LENGTH:I = 0x1000


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1d

    .line 3
    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Landroidx/media3/extractor/mp4/Sniffer;->COMPATIBLE_BRANDS:[I

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.8909645E8f
        0x4d344120    # 1.8901043E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
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
.end method

.method private static isCompatibleBrand(IZ)Z
    .locals 5

    .line 1
    .line 2
    ushr-int/lit8 v0, p0, 0x8

    .line 3
    .line 4
    .line 5
    const v1, 0x336770

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    return v2

    .line 10
    .line 11
    .line 12
    :cond_0
    const v0, 0x68656963

    .line 13
    .line 14
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    return v2

    .line 18
    .line 19
    :cond_1
    sget-object p1, Landroidx/media3/extractor/mp4/Sniffer;->COMPATIBLE_BRANDS:[I

    .line 20
    array-length v0, p1

    .line 21
    const/4 v1, 0x0

    .line 22
    move v3, v1

    .line 23
    .line 24
    :goto_0
    if-ge v3, v0, :cond_3

    .line 25
    .line 26
    aget v4, p1, v3

    .line 27
    .line 28
    if-ne v4, p0, :cond_2

    .line 29
    return v2

    .line 30
    .line 31
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_3
    return v1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static sniffFragmented(Landroidx/media3/extractor/ExtractorInput;)Landroidx/media3/extractor/SniffFailure;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Landroidx/media3/extractor/mp4/Sniffer;->sniffInternal(Landroidx/media3/extractor/ExtractorInput;ZZ)Landroidx/media3/extractor/SniffFailure;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method private static sniffInternal(Landroidx/media3/extractor/ExtractorInput;ZZ)Landroidx/media3/extractor/SniffFailure;
    .locals 25
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/media3/extractor/ExtractorInput;->getLength()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v6, v2, v4

    .line 13
    .line 14
    const-wide/16 v7, 0x1000

    .line 15
    .line 16
    if-eqz v6, :cond_1

    .line 17
    .line 18
    cmp-long v9, v2, v7

    .line 19
    .line 20
    if-lez v9, :cond_0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v7, v2

    .line 23
    :cond_1
    :goto_0
    long-to-int v7, v7

    .line 24
    .line 25
    new-instance v8, Landroidx/media3/common/util/ParsableByteArray;

    .line 26
    .line 27
    const/16 v9, 0x40

    .line 28
    .line 29
    .line 30
    invoke-direct {v8, v9}, Landroidx/media3/common/util/ParsableByteArray;-><init>(I)V

    .line 31
    const/4 v9, 0x0

    .line 32
    move v10, v9

    .line 33
    move v11, v10

    .line 34
    .line 35
    :goto_1
    if-ge v10, v7, :cond_2

    .line 36
    .line 37
    const/16 v13, 0x8

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8, v13}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 44
    move-result-object v14

    .line 45
    const/4 v15, 0x1

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v14, v9, v13, v15}, Landroidx/media3/extractor/ExtractorInput;->peekFully([BIIZ)Z

    .line 49
    move-result v14

    .line 50
    .line 51
    if-nez v14, :cond_3

    .line 52
    :cond_2
    move v4, v9

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    goto/16 :goto_9

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedInt()J

    .line 60
    move-result-wide v16

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->readInt()I

    .line 64
    move-result v14

    .line 65
    .line 66
    const-wide/16 v18, 0x1

    .line 67
    .line 68
    cmp-long v18, v16, v18

    .line 69
    .line 70
    if-nez v18, :cond_4

    .line 71
    .line 72
    move-wide/from16 v18, v4

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v4, v13, v13}, Landroidx/media3/extractor/ExtractorInput;->peekFully([BII)V

    .line 80
    .line 81
    const/16 v4, 0x10

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v4}, Landroidx/media3/common/util/ParsableByteArray;->setLimit(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->readLong()J

    .line 88
    move-result-wide v16

    .line 89
    .line 90
    move/from16 v21, v10

    .line 91
    .line 92
    :goto_2
    move-wide/from16 v9, v16

    .line 93
    const/4 v5, 0x0

    .line 94
    goto :goto_4

    .line 95
    .line 96
    :cond_4
    move-wide/from16 v18, v4

    .line 97
    .line 98
    const-wide/16 v4, 0x0

    .line 99
    .line 100
    cmp-long v4, v16, v4

    .line 101
    .line 102
    if-nez v4, :cond_5

    .line 103
    .line 104
    .line 105
    invoke-interface {v0}, Landroidx/media3/extractor/ExtractorInput;->getLength()J

    .line 106
    move-result-wide v4

    .line 107
    .line 108
    cmp-long v20, v4, v18

    .line 109
    .line 110
    if-eqz v20, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Landroidx/media3/extractor/ExtractorInput;->getPeekPosition()J

    .line 114
    move-result-wide v16

    .line 115
    .line 116
    sub-long v4, v4, v16

    .line 117
    .line 118
    move/from16 v21, v10

    .line 119
    int-to-long v9, v13

    .line 120
    .line 121
    add-long v16, v4, v9

    .line 122
    :goto_3
    move v4, v13

    .line 123
    goto :goto_2

    .line 124
    .line 125
    :cond_5
    move/from16 v21, v10

    .line 126
    goto :goto_3

    .line 127
    :goto_4
    int-to-long v12, v4

    .line 128
    .line 129
    cmp-long v17, v9, v12

    .line 130
    .line 131
    if-gez v17, :cond_6

    .line 132
    .line 133
    new-instance v0, Landroidx/media3/extractor/mp4/AtomSizeTooSmallSniffFailure;

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, v14, v9, v10, v4}, Landroidx/media3/extractor/mp4/AtomSizeTooSmallSniffFailure;-><init>(IJI)V

    .line 137
    return-object v0

    .line 138
    .line 139
    :cond_6
    add-int v4, v21, v4

    .line 140
    .line 141
    move-object/from16 v17, v5

    .line 142
    .line 143
    .line 144
    const v5, 0x6d6f6f76

    .line 145
    .line 146
    if-ne v14, v5, :cond_8

    .line 147
    long-to-int v5, v9

    .line 148
    add-int/2addr v7, v5

    .line 149
    .line 150
    if-eqz v6, :cond_7

    .line 151
    int-to-long v9, v7

    .line 152
    .line 153
    cmp-long v5, v9, v2

    .line 154
    .line 155
    if-lez v5, :cond_7

    .line 156
    long-to-int v7, v2

    .line 157
    :cond_7
    move v10, v4

    .line 158
    .line 159
    move-wide/from16 v4, v18

    .line 160
    const/4 v9, 0x0

    .line 161
    goto :goto_1

    .line 162
    .line 163
    .line 164
    :cond_8
    const v5, 0x6d6f6f66

    .line 165
    .line 166
    if-eq v14, v5, :cond_14

    .line 167
    .line 168
    .line 169
    const v5, 0x6d766578

    .line 170
    .line 171
    if-ne v14, v5, :cond_9

    .line 172
    .line 173
    goto/16 :goto_8

    .line 174
    .line 175
    .line 176
    :cond_9
    const v5, 0x6d646174

    .line 177
    .line 178
    if-ne v14, v5, :cond_a

    .line 179
    move v11, v15

    .line 180
    .line 181
    :cond_a
    move-wide/from16 v21, v2

    .line 182
    int-to-long v2, v4

    .line 183
    add-long/2addr v2, v9

    .line 184
    sub-long/2addr v2, v12

    .line 185
    .line 186
    move-wide/from16 v23, v2

    .line 187
    int-to-long v2, v7

    .line 188
    .line 189
    cmp-long v2, v23, v2

    .line 190
    .line 191
    if-ltz v2, :cond_b

    .line 192
    const/4 v9, 0x0

    .line 193
    .line 194
    goto/16 :goto_a

    .line 195
    :cond_b
    sub-long/2addr v9, v12

    .line 196
    long-to-int v2, v9

    .line 197
    .line 198
    add-int v10, v4, v2

    .line 199
    .line 200
    .line 201
    const v3, 0x66747970

    .line 202
    .line 203
    if-ne v14, v3, :cond_12

    .line 204
    .line 205
    const/16 v3, 0x8

    .line 206
    .line 207
    if-ge v2, v3, :cond_c

    .line 208
    .line 209
    new-instance v0, Landroidx/media3/extractor/mp4/AtomSizeTooSmallSniffFailure;

    .line 210
    int-to-long v1, v2

    .line 211
    .line 212
    .line 213
    invoke-direct {v0, v14, v1, v2, v3}, Landroidx/media3/extractor/mp4/AtomSizeTooSmallSniffFailure;-><init>(IJI)V

    .line 214
    return-object v0

    .line 215
    .line 216
    .line 217
    :cond_c
    invoke-virtual {v8, v2}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 221
    move-result-object v3

    .line 222
    const/4 v4, 0x0

    .line 223
    .line 224
    .line 225
    invoke-interface {v0, v3, v4, v2}, Landroidx/media3/extractor/ExtractorInput;->peekFully([BII)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->readInt()I

    .line 229
    move-result v2

    .line 230
    .line 231
    .line 232
    invoke-static {v2, v1}, Landroidx/media3/extractor/mp4/Sniffer;->isCompatibleBrand(IZ)Z

    .line 233
    move-result v3

    .line 234
    .line 235
    if-eqz v3, :cond_d

    .line 236
    move v11, v15

    .line 237
    :cond_d
    const/4 v3, 0x4

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v3}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 244
    move-result v5

    .line 245
    div-int/2addr v5, v3

    .line 246
    .line 247
    if-nez v11, :cond_10

    .line 248
    .line 249
    if-lez v5, :cond_10

    .line 250
    .line 251
    new-array v12, v5, [I

    .line 252
    move v3, v4

    .line 253
    .line 254
    :goto_5
    if-ge v3, v5, :cond_f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Landroidx/media3/common/util/ParsableByteArray;->readInt()I

    .line 258
    move-result v9

    .line 259
    .line 260
    aput v9, v12, v3

    .line 261
    .line 262
    .line 263
    invoke-static {v9, v1}, Landroidx/media3/extractor/mp4/Sniffer;->isCompatibleBrand(IZ)Z

    .line 264
    move-result v9

    .line 265
    .line 266
    if-eqz v9, :cond_e

    .line 267
    goto :goto_6

    .line 268
    .line 269
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 270
    goto :goto_5

    .line 271
    :cond_f
    move v15, v11

    .line 272
    goto :goto_6

    .line 273
    :cond_10
    move v15, v11

    .line 274
    .line 275
    move-object/from16 v12, v17

    .line 276
    .line 277
    :goto_6
    if-nez v15, :cond_11

    .line 278
    .line 279
    new-instance v0, Landroidx/media3/extractor/mp4/UnsupportedBrandsSniffFailure;

    .line 280
    .line 281
    .line 282
    invoke-direct {v0, v2, v12}, Landroidx/media3/extractor/mp4/UnsupportedBrandsSniffFailure;-><init>(I[I)V

    .line 283
    return-object v0

    .line 284
    :cond_11
    move v11, v15

    .line 285
    goto :goto_7

    .line 286
    :cond_12
    const/4 v4, 0x0

    .line 287
    .line 288
    if-eqz v2, :cond_13

    .line 289
    .line 290
    .line 291
    invoke-interface {v0, v2}, Landroidx/media3/extractor/ExtractorInput;->advancePeekPosition(I)V

    .line 292
    :cond_13
    :goto_7
    move v9, v4

    .line 293
    .line 294
    move-wide/from16 v4, v18

    .line 295
    .line 296
    move-wide/from16 v2, v21

    .line 297
    .line 298
    goto/16 :goto_1

    .line 299
    :cond_14
    :goto_8
    move v9, v15

    .line 300
    goto :goto_a

    .line 301
    :goto_9
    move v9, v4

    .line 302
    .line 303
    :goto_a
    if-nez v11, :cond_15

    .line 304
    .line 305
    sget-object v0, Landroidx/media3/extractor/mp4/NoDeclaredBrandSniffFailure;->INSTANCE:Landroidx/media3/extractor/mp4/NoDeclaredBrandSniffFailure;

    .line 306
    return-object v0

    .line 307
    .line 308
    :cond_15
    move/from16 v0, p1

    .line 309
    .line 310
    if-eq v0, v9, :cond_17

    .line 311
    .line 312
    if-eqz v9, :cond_16

    .line 313
    .line 314
    sget-object v0, Landroidx/media3/extractor/mp4/IncorrectFragmentationSniffFailure;->FILE_FRAGMENTED:Landroidx/media3/extractor/mp4/IncorrectFragmentationSniffFailure;

    .line 315
    return-object v0

    .line 316
    .line 317
    :cond_16
    sget-object v0, Landroidx/media3/extractor/mp4/IncorrectFragmentationSniffFailure;->FILE_NOT_FRAGMENTED:Landroidx/media3/extractor/mp4/IncorrectFragmentationSniffFailure;

    .line 318
    return-object v0

    .line 319
    :cond_17
    return-object v17
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
.end method

.method public static sniffUnfragmented(Landroidx/media3/extractor/ExtractorInput;Z)Landroidx/media3/extractor/SniffFailure;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0, p1}, Landroidx/media3/extractor/mp4/Sniffer;->sniffInternal(Landroidx/media3/extractor/ExtractorInput;ZZ)Landroidx/media3/extractor/SniffFailure;

    .line 5
    move-result-object p0

    .line 6
    return-object p0
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
.end method
