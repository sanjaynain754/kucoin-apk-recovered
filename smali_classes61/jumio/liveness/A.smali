.class public final Ljumio/liveness/A;
.super Lcom/jumio/core/overlay/BaseLivenessOverlay;
.source "SourceFile"


# instance fields
.field public m:Landroid/graphics/RectF;

.field public n:Z

.field public final o:I

.field public final p:I


# direct methods
.method public constructor <init>(Lcom/jumio/core/MobileContext;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "mobileContext"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;-><init>(Lcom/jumio/core/MobileContext;)V

    .line 9
    .line 10
    new-instance p1, Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Ljumio/liveness/A;->m:Landroid/graphics/RectF;

    .line 16
    .line 17
    new-instance p1, Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->getStyleMap()Ljava/util/Map;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    sget v0, Lcom/jumio/core/R$attr;->jumio_scanOverlay_livenessStrokeAnimation:I

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    check-cast p1, Ljava/lang/Integer;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 42
    move-result p1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    sget p1, Lcom/jumio/core/R$color;->jumio_green_3:I

    .line 46
    .line 47
    :goto_0
    iput p1, p0, Ljumio/liveness/A;->o:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->getStyleMap()Ljava/util/Map;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    sget v0, Lcom/jumio/core/R$attr;->jumio_scanOverlay_livenessStrokeAnimationCompleted:I

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    check-cast p1, Ljava/lang/Integer;

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 69
    move-result p1

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_1
    sget p1, Lcom/jumio/core/R$color;->jumio_green_6:I

    .line 73
    .line 74
    :goto_1
    iput p1, p0, Ljumio/liveness/A;->p:I

    .line 75
    .line 76
    new-instance p1, Landroid/graphics/Paint;

    .line 77
    const/4 v0, 0x1

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 81
    .line 82
    sget-object v1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->getStyleMap()Ljava/util/Map;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    sget v3, Lcom/jumio/core/R$attr;->jumio_scanOverlay:I

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    .line 98
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    check-cast v2, Ljava/lang/Integer;

    .line 102
    .line 103
    const/high16 v3, -0x10000

    .line 104
    .line 105
    if-eqz v2, :cond_2

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 109
    move-result v2

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    move v2, v3

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 115
    .line 116
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    new-instance p1, Landroid/graphics/Paint;

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 134
    .line 135
    new-instance p1, Landroid/graphics/Paint;

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 142
    .line 143
    .line 144
    const v0, -0xff0100

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 151
    return-void
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


# virtual methods
.method public final calculate(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "cameraSettings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "extractionArea"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->calculate(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V

    .line 14
    return-void
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
.end method

.method public final doDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    return-void
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
.end method

.method public final update(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "extractionUpdate"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->update(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getState()Ljava/lang/Integer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceRoiRect()I

    .line 18
    move-result v2

    .line 19
    .line 20
    const-string v3, "LivenessOverlay"

    .line 21
    const/4 v4, 0x0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    move-result v5

    .line 29
    .line 30
    if-ne v5, v2, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    instance-of v0, p1, Landroid/graphics/RectF;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    move-object v4, p1

    .line 40
    .line 41
    check-cast v4, Landroid/graphics/RectF;

    .line 42
    .line 43
    :cond_1
    if-nez v4, :cond_2

    .line 44
    .line 45
    new-instance v4, Landroid/graphics/RectF;

    .line 46
    .line 47
    .line 48
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 49
    .line 50
    :cond_2
    iput-object v4, p0, Ljumio/liveness/A;->m:Landroid/graphics/RectF;

    .line 51
    .line 52
    new-instance p1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v0, "Current corners are "

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    iget-object v0, p0, Ljumio/liveness/A;->m:Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-static {v3, p1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    return-void

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceCenterArea()I

    .line 74
    move-result v2

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    goto :goto_1

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    move-result v5

    .line 82
    .line 83
    if-ne v5, v2, :cond_6

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    instance-of v0, p1, Landroid/graphics/RectF;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    move-object v4, p1

    .line 93
    .line 94
    check-cast v4, Landroid/graphics/RectF;

    .line 95
    .line 96
    :cond_5
    if-nez v4, :cond_c

    .line 97
    .line 98
    new-instance p1, Landroid/graphics/RectF;

    .line 99
    .line 100
    .line 101
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 102
    return-void

    .line 103
    .line 104
    :cond_6
    :goto_1
    sget-object v2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getResetOverlay()I

    .line 108
    move-result v5

    .line 109
    const/4 v6, 0x0

    .line 110
    .line 111
    if-nez v0, :cond_7

    .line 112
    goto :goto_3

    .line 113
    .line 114
    .line 115
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 116
    move-result v7

    .line 117
    .line 118
    if-ne v7, v5, :cond_a

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->resetOverlayAnimation()V

    .line 122
    .line 123
    iput-boolean v6, p0, Ljumio/liveness/A;->n:Z

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    instance-of v0, p1, Ljava/lang/Float;

    .line 130
    .line 131
    if-eqz v0, :cond_8

    .line 132
    move-object v4, p1

    .line 133
    .line 134
    check-cast v4, Ljava/lang/Float;

    .line 135
    .line 136
    :cond_8
    if-eqz v4, :cond_9

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 140
    move-result p1

    .line 141
    goto :goto_2

    .line 142
    .line 143
    :cond_9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 144
    .line 145
    .line 146
    :goto_2
    invoke-virtual {p0, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->resizeOverlay(F)V

    .line 147
    return-void

    .line 148
    .line 149
    .line 150
    :cond_a
    :goto_3
    invoke-virtual {v2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStill()I

    .line 151
    move-result v4

    .line 152
    .line 153
    if-nez v0, :cond_b

    .line 154
    goto :goto_4

    .line 155
    .line 156
    .line 157
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 158
    move-result v5

    .line 159
    .line 160
    if-ne v5, v4, :cond_f

    .line 161
    .line 162
    iget-boolean p1, p0, Ljumio/liveness/A;->n:Z

    .line 163
    .line 164
    if-eqz p1, :cond_d

    .line 165
    :cond_c
    return-void

    .line 166
    :cond_d
    const/4 p1, 0x1

    .line 167
    .line 168
    iput-boolean p1, p0, Ljumio/liveness/A;->n:Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->getOverlayView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    if-eqz p1, :cond_e

    .line 175
    .line 176
    sget v0, Lcom/jumio/core/R$id;->liveness_overlay_main:I

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v0}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->animatedDrawable(Landroid/widget/ImageView;I)Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    if-eqz p1, :cond_e

    .line 183
    .line 184
    iget v0, p0, Ljumio/liveness/A;->o:I

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v0}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->setColor(Landroid/graphics/drawable/Drawable;I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    .line 191
    .line 192
    :cond_e
    iget p1, p0, Ljumio/liveness/A;->p:I

    .line 193
    .line 194
    const-wide/16 v0, 0x1f4

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, p1, v0, v1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->changeColorOfOverlayCircle(IJ)Ljava/lang/Boolean;

    .line 198
    .line 199
    iget p1, p0, Ljumio/liveness/A;->o:I

    .line 200
    .line 201
    const-wide/16 v0, 0x294

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, p1, v0, v1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->changeColorOfOverlayCircle(IJ)Ljava/lang/Boolean;

    .line 205
    .line 206
    iget p1, p0, Ljumio/liveness/A;->p:I

    .line 207
    .line 208
    const-wide/16 v0, 0x33e

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, p1, v0, v1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->changeColorOfOverlayCircle(IJ)Ljava/lang/Boolean;

    .line 212
    return-void

    .line 213
    .line 214
    .line 215
    :cond_f
    :goto_4
    invoke-virtual {v2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getFallbackRequired()I

    .line 216
    move-result v2

    .line 217
    .line 218
    if-nez v0, :cond_10

    .line 219
    goto :goto_5

    .line 220
    .line 221
    .line 222
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 223
    move-result v4

    .line 224
    .line 225
    if-eq v4, v2, :cond_1d

    .line 226
    .line 227
    .line 228
    :goto_5
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceIntoFrame()I

    .line 229
    move-result v2

    .line 230
    .line 231
    if-nez v0, :cond_11

    .line 232
    goto :goto_6

    .line 233
    .line 234
    .line 235
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 236
    move-result v4

    .line 237
    .line 238
    if-eq v4, v2, :cond_1d

    .line 239
    .line 240
    .line 241
    :goto_6
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getCenterFace()I

    .line 242
    move-result v2

    .line 243
    .line 244
    if-nez v0, :cond_12

    .line 245
    goto :goto_7

    .line 246
    .line 247
    .line 248
    :cond_12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 249
    move-result v4

    .line 250
    .line 251
    if-eq v4, v2, :cond_1d

    .line 252
    .line 253
    .line 254
    :goto_7
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceCloser()I

    .line 255
    move-result v2

    .line 256
    .line 257
    if-nez v0, :cond_13

    .line 258
    goto :goto_8

    .line 259
    .line 260
    .line 261
    :cond_13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 262
    move-result v4

    .line 263
    .line 264
    if-eq v4, v2, :cond_1d

    .line 265
    .line 266
    .line 267
    :goto_8
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTooClose()I

    .line 268
    move-result v2

    .line 269
    .line 270
    if-nez v0, :cond_14

    .line 271
    goto :goto_9

    .line 272
    .line 273
    .line 274
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 275
    move-result v4

    .line 276
    .line 277
    if-eq v4, v2, :cond_1d

    .line 278
    .line 279
    .line 280
    :goto_9
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getLevelEyesAndDevice()I

    .line 281
    move-result v2

    .line 282
    .line 283
    if-nez v0, :cond_15

    .line 284
    goto :goto_a

    .line 285
    .line 286
    .line 287
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 288
    move-result v4

    .line 289
    .line 290
    if-eq v4, v2, :cond_1d

    .line 291
    .line 292
    .line 293
    :goto_a
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltUp()I

    .line 294
    move-result v2

    .line 295
    .line 296
    if-nez v0, :cond_16

    .line 297
    goto :goto_b

    .line 298
    .line 299
    .line 300
    :cond_16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 301
    move-result v4

    .line 302
    .line 303
    if-eq v4, v2, :cond_1d

    .line 304
    .line 305
    .line 306
    :goto_b
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltDown()I

    .line 307
    move-result v2

    .line 308
    .line 309
    if-nez v0, :cond_17

    .line 310
    goto :goto_c

    .line 311
    .line 312
    .line 313
    :cond_17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 314
    move-result v4

    .line 315
    .line 316
    if-eq v4, v2, :cond_1d

    .line 317
    .line 318
    .line 319
    :goto_c
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltLeft()I

    .line 320
    move-result v2

    .line 321
    .line 322
    if-nez v0, :cond_18

    .line 323
    goto :goto_d

    .line 324
    .line 325
    .line 326
    :cond_18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 327
    move-result v4

    .line 328
    .line 329
    if-eq v4, v2, :cond_1d

    .line 330
    .line 331
    .line 332
    :goto_d
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltRight()I

    .line 333
    move-result v2

    .line 334
    .line 335
    if-nez v0, :cond_19

    .line 336
    goto :goto_e

    .line 337
    .line 338
    .line 339
    :cond_19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 340
    move-result v4

    .line 341
    .line 342
    if-ne v4, v2, :cond_1a

    .line 343
    goto :goto_10

    .line 344
    .line 345
    .line 346
    :cond_1a
    :goto_e
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getUpdateColor()I

    .line 347
    move-result v1

    .line 348
    .line 349
    if-nez v0, :cond_1b

    .line 350
    goto :goto_f

    .line 351
    .line 352
    .line 353
    :cond_1b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 354
    move-result v0

    .line 355
    .line 356
    if-ne v0, v1, :cond_1c

    .line 357
    .line 358
    .line 359
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 360
    move-result-object p1

    .line 361
    .line 362
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 363
    .line 364
    .line 365
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 366
    .line 367
    check-cast p1, Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 371
    move-result p1

    .line 372
    .line 373
    .line 374
    invoke-virtual {p0, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->setPhotinusColor(I)V

    .line 375
    return-void

    .line 376
    .line 377
    :cond_1c
    :goto_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v1, "Skipped handling for update "

    .line 380
    .line 381
    .line 382
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    move-result-object p1

    .line 390
    .line 391
    .line 392
    invoke-static {v3, p1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    return-void

    .line 394
    .line 395
    .line 396
    :cond_1d
    :goto_10
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->resetOverlayAnimation()V

    .line 397
    .line 398
    iput-boolean v6, p0, Ljumio/liveness/A;->n:Z

    .line 399
    return-void
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
