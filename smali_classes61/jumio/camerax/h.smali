.class public final Ljumio/camerax/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageAnalysis$Analyzer;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final synthetic b:Lcom/jumio/camerax/CameraXManager;


# direct methods
.method public constructor <init>(Lcom/jumio/camerax/CameraXManager;Lcom/jumio/commons/camera/CameraCallbackInterface;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "cameraCallback"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Ljumio/camerax/h;->b:Lcom/jumio/camerax/CameraXManager;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    iput-object p1, p0, Ljumio/camerax/h;->a:Ljava/lang/ref/WeakReference;

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


# virtual methods
.method public final analyze(Landroidx/camera/core/ImageProxy;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "imageProxy"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Ljumio/camerax/h;->b:Lcom/jumio/camerax/CameraXManager;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/jumio/camerax/CameraXManager;->access$getImageAnalysisCaptureCallback$p(Lcom/jumio/camerax/CameraXManager;)Ljumio/camerax/a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljumio/camerax/a;->a()Ljumio/camerax/r;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Ljumio/camerax/h;->b:Lcom/jumio/camerax/CameraXManager;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/jumio/camerax/CameraXManager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Frame$Metadata;->deepCopy()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    iget-object v1, p0, Ljumio/camerax/h;->b:Lcom/jumio/camerax/CameraXManager;

    .line 28
    .line 29
    iget v2, v0, Ljumio/camerax/r;->b:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setIso(I)V

    .line 33
    .line 34
    iget v2, v0, Ljumio/camerax/r;->e:F

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setLensPosition(F)V

    .line 38
    .line 39
    iget-wide v2, v0, Ljumio/camerax/r;->a:J

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v2, v3}, Lcom/jumio/commons/camera/Frame$Metadata;->setShutterSpeed(J)V

    .line 43
    .line 44
    iget-object v2, v0, Ljumio/camerax/r;->f:Landroid/hardware/camera2/params/ColorSpaceTransform;

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lcom/jumio/commons/camera/FrameKt;->toFloatArray(Landroid/hardware/camera2/params/ColorSpaceTransform;)[F

    .line 50
    move-result-object v2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v2, 0x0

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {v4, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setColorSpaceTransform([F)V

    .line 56
    .line 57
    iget v2, v0, Ljumio/camerax/r;->c:F

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setAperture(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 68
    move-result v3

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Lcom/jumio/commons/camera/Size;->setWidth(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lcom/jumio/commons/camera/Frame$Metadata;->getSize()Lcom/jumio/commons/camera/Size;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 79
    move-result v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, Lcom/jumio/commons/camera/Size;->setHeight(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    .line 89
    invoke-interface {v2}, Landroidx/camera/core/ImageInfo;->getRotationDegrees()I

    .line 90
    move-result v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setRotation(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    move-result-wide v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v2, v3}, Lcom/jumio/commons/camera/Frame$Metadata;->setTimestamp(J)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/jumio/camerax/CameraXManager;->isFlashOn()Z

    .line 104
    move-result v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setFlashOn(Z)V

    .line 108
    .line 109
    sget-object v2, Lcom/jumio/core/camera/CameraConnectionData;->Companion:Lcom/jumio/core/camera/CameraConnectionData$Companion;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/jumio/camerax/CameraXManager;->getCollectCameraConnection()Z

    .line 113
    move-result v1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v1}, Lcom/jumio/core/camera/CameraConnectionData$Companion;->get(Z)Lcom/jumio/core/camera/CameraConnectionData;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v1}, Lcom/jumio/commons/camera/Frame$Metadata;->setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V

    .line 121
    .line 122
    iget-object v0, v0, Ljumio/camerax/r;->h:Lcom/jumio/core/enums/FlashState;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v0}, Lcom/jumio/commons/camera/Frame$Metadata;->setFlashState(Lcom/jumio/core/enums/FlashState;)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    move-result-wide v0

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lcom/jumio/camerax/utils/ImageProxyExtKt;->getNv21Bytes(Landroidx/camera/core/ImageProxy;)[B

    .line 133
    move-result-object v3

    .line 134
    .line 135
    new-instance v2, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v5, "Flattening YUV bytes took "

    .line 138
    .line 139
    .line 140
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 144
    move-result-wide v5

    .line 145
    sub-long/2addr v5, v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v0, " ms"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    const-string v1, "CameraXManager"

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    iget-object v0, p0, Ljumio/camerax/h;->a:Ljava/lang/ref/WeakReference;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    check-cast v0, Lcom/jumio/commons/camera/CameraCallbackInterface;

    .line 171
    .line 172
    if-eqz v0, :cond_1

    .line 173
    .line 174
    new-instance v2, Lcom/jumio/commons/camera/Frame;

    .line 175
    const/4 v6, 0x4

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    .line 179
    .line 180
    invoke-direct/range {v2 .. v7}, Lcom/jumio/commons/camera/Frame;-><init>([BLcom/jumio/commons/camera/Frame$Metadata;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v0, v2}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onPreviewFrame(Lcom/jumio/commons/camera/Frame;)V

    .line 184
    .line 185
    .line 186
    :cond_1
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 187
    return-void
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
