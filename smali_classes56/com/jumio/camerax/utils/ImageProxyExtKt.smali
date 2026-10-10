.class public final Lcom/jumio/camerax/utils/ImageProxyExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u001a\u000c\u0010\r\u001a\u00020\u0001*\u00020\u000eH\u0002\u001a\u000c\u0010\u000f\u001a\u00020\u0003*\u00020\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "INVALID_ADDRESS",
        "",
        "nv21Bytes",
        "",
        "Landroidx/camera/core/ImageProxy;",
        "getNv21Bytes",
        "(Landroidx/camera/core/ImageProxy;)[B",
        "singlePlaneByteArray",
        "getSinglePlaneByteArray",
        "overlaps",
        "",
        "Ljava/nio/ByteBuffer;",
        "other",
        "getAddress",
        "Ljava/nio/Buffer;",
        "toArray",
        "jumio-camerax_release"
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
.method public static final a(Ljava/nio/ByteBuffer;)J
    .locals 6

    .line 1
    .line 2
    const-wide/16 v0, -0x1

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->isDirect()Z

    .line 6
    move-result v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    return-wide v0

    .line 10
    .line 11
    :cond_0
    sget-object v2, Lcom/jumio/core/util/ReflectionUtil;->INSTANCE:Lcom/jumio/core/util/ReflectionUtil;

    .line 12
    .line 13
    const-class v3, Ljava/nio/Buffer;

    .line 14
    .line 15
    const-string v4, "address"

    .line 16
    const/4 v5, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, v4, p0, v5}, Lcom/jumio/core/util/ReflectionUtil;->getMember(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    check-cast p0, Ljava/lang/Number;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 26
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :catch_0
    return-wide v0
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
.end method

.method public static final getNv21Bytes(Landroidx/camera/core/ImageProxy;)[B
    .locals 18
    .param p0    # Landroidx/camera/core/ImageProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 15
    move-result v2

    .line 16
    mul-int/2addr v2, v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 24
    move-result v3

    .line 25
    mul-int/2addr v3, v0

    .line 26
    .line 27
    div-int/lit8 v3, v3, 0x4

    .line 28
    const/4 v0, 0x2

    .line 29
    mul-int/2addr v3, v0

    .line 30
    add-int/2addr v3, v2

    .line 31
    .line 32
    new-array v3, v3, [B

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 36
    move-result-object v4

    .line 37
    const/4 v5, 0x0

    .line 38
    .line 39
    aget-object v4, v4, v5

    .line 40
    .line 41
    .line 42
    invoke-interface {v4}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    const-string v6, "getBuffer(...)"

    .line 46
    .line 47
    .line 48
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 52
    move-result-object v7

    .line 53
    const/4 v8, 0x1

    .line 54
    .line 55
    aget-object v7, v7, v8

    .line 56
    .line 57
    .line 58
    invoke-interface {v7}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    .line 62
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 66
    move-result-object v9

    .line 67
    .line 68
    aget-object v9, v9, v0

    .line 69
    .line 70
    .line 71
    invoke-interface {v9}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 72
    move-result-object v9

    .line 73
    .line 74
    .line 75
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    aget-object v6, v6, v5

    .line 82
    .line 83
    .line 84
    invoke-interface {v6}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getRowStride()I

    .line 85
    move-result v6

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 89
    move-result v10

    .line 90
    .line 91
    if-ne v6, v10, :cond_0

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3, v5, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 95
    move v6, v2

    .line 96
    goto :goto_1

    .line 97
    :cond_0
    int-to-long v10, v6

    .line 98
    neg-long v12, v10

    .line 99
    move v6, v5

    .line 100
    .line 101
    :goto_0
    if-ge v6, v2, :cond_1

    .line 102
    add-long/2addr v12, v10

    .line 103
    long-to-int v14, v12

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 107
    .line 108
    .line 109
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 110
    move-result v14

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v3, v6, v14}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    .line 116
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 117
    move-result v14

    .line 118
    add-int/2addr v6, v14

    .line 119
    goto :goto_0

    .line 120
    .line 121
    .line 122
    :cond_1
    :goto_1
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    aget-object v4, v4, v0

    .line 126
    .line 127
    .line 128
    invoke-interface {v4}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getRowStride()I

    .line 129
    move-result v4

    .line 130
    .line 131
    .line 132
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 133
    move-result-object v10

    .line 134
    .line 135
    aget-object v10, v10, v0

    .line 136
    .line 137
    .line 138
    invoke-interface {v10}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getPixelStride()I

    .line 139
    move-result v10

    .line 140
    .line 141
    if-ne v10, v0, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 145
    move-result v11

    .line 146
    .line 147
    if-ne v4, v11, :cond_5

    .line 148
    .line 149
    .line 150
    invoke-static {v7}, Lcom/jumio/camerax/utils/ImageProxyExtKt;->a(Ljava/nio/ByteBuffer;)J

    .line 151
    move-result-wide v11

    .line 152
    .line 153
    .line 154
    invoke-static {v9}, Lcom/jumio/camerax/utils/ImageProxyExtKt;->a(Ljava/nio/ByteBuffer;)J

    .line 155
    move-result-wide v13

    .line 156
    .line 157
    const-wide/16 v15, -0x1

    .line 158
    .line 159
    cmp-long v17, v11, v15

    .line 160
    .line 161
    if-eqz v17, :cond_2

    .line 162
    .line 163
    cmp-long v15, v13, v15

    .line 164
    .line 165
    if-eqz v15, :cond_2

    .line 166
    .line 167
    const-wide/16 v15, 0x1

    .line 168
    add-long/2addr v13, v15

    .line 169
    .line 170
    cmp-long v11, v11, v13

    .line 171
    .line 172
    if-nez v11, :cond_4

    .line 173
    move v12, v8

    .line 174
    goto :goto_3

    .line 175
    .line 176
    .line 177
    :cond_2
    invoke-virtual {v9}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 178
    move-result v11

    .line 179
    .line 180
    if-nez v11, :cond_4

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 184
    move-result v11

    .line 185
    not-int v12, v11

    .line 186
    int-to-byte v12, v12

    .line 187
    .line 188
    .line 189
    :try_start_0
    invoke-virtual {v9, v8, v12}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 193
    move-result v13

    .line 194
    .line 195
    if-ne v13, v12, :cond_3

    .line 196
    move v12, v8

    .line 197
    goto :goto_2

    .line 198
    :cond_3
    move v12, v5

    .line 199
    .line 200
    .line 201
    :goto_2
    invoke-virtual {v9, v8, v11}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    goto :goto_3

    .line 203
    :catch_0
    :cond_4
    move v12, v5

    .line 204
    .line 205
    :goto_3
    if-eqz v12, :cond_5

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9, v3, v2, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 215
    add-int/2addr v2, v8

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 219
    move-result v0

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v3, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 223
    return-object v3

    .line 224
    .line 225
    .line 226
    :cond_5
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 227
    move-result v2

    .line 228
    div-int/2addr v2, v0

    .line 229
    move v8, v5

    .line 230
    .line 231
    :goto_4
    if-ge v8, v2, :cond_7

    .line 232
    .line 233
    .line 234
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 235
    move-result v11

    .line 236
    div-int/2addr v11, v0

    .line 237
    move v12, v5

    .line 238
    .line 239
    :goto_5
    if-ge v12, v11, :cond_6

    .line 240
    .line 241
    mul-int v13, v12, v10

    .line 242
    .line 243
    mul-int v14, v8, v4

    .line 244
    add-int/2addr v14, v13

    .line 245
    .line 246
    add-int/lit8 v13, v6, 0x1

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v14}, Ljava/nio/ByteBuffer;->get(I)B

    .line 250
    move-result v15

    .line 251
    .line 252
    aput-byte v15, v3, v6

    .line 253
    .line 254
    add-int/lit8 v6, v6, 0x2

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7, v14}, Ljava/nio/ByteBuffer;->get(I)B

    .line 258
    move-result v14

    .line 259
    .line 260
    aput-byte v14, v3, v13

    .line 261
    .line 262
    add-int/lit8 v12, v12, 0x1

    .line 263
    goto :goto_5

    .line 264
    .line 265
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 266
    goto :goto_4

    .line 267
    :cond_7
    return-object v3
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
.end method

.method public static final getSinglePlaneByteArray(Landroidx/camera/core/ImageProxy;)[B
    .locals 1
    .param p0    # Landroidx/camera/core/ImageProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string v0, "getPlanes(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    check-cast p0, Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 32
    move-result v0

    .line 33
    .line 34
    new-array v0, v0, [B

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    return-object v0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    .line 44
    new-array p0, p0, [B

    .line 45
    return-object p0
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
.end method
