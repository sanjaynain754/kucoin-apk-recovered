.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final b:Landroid/content/Context;

.field public c:Lkotlinx/coroutines/x1;

.field public final d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

.field public final e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public f:Ljava/lang/String;

.field public g:Ljava/util/Map;

.field public h:Ljava/util/Map;

.field public i:Ljava/lang/String;

.field public j:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    const-string v1, "file"

    .line 11
    .line 12
    const-string v2, "AtomicXCore-Call"

    .line 13
    .line 14
    const-string v3, "CallGridView"

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->b:Landroid/content/Context;

    .line 27
    .line 28
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 32
    .line 33
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 34
    .line 35
    const-string v1, ""

    .line 36
    .line 37
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->f:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->g:Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->h:Ljava/util/Map;

    .line 50
    .line 51
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->i:Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->j:Ljava/util/Map;

    .line 58
    const/4 v1, 0x0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 62
    .line 63
    new-instance v2, Landroid/widget/ImageView;

    .line 64
    .line 65
    .line 66
    invoke-direct {v2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 75
    .line 76
    new-instance v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 77
    const/4 v4, -0x1

    .line 78
    .line 79
    .line 80
    invoke-direct {v3, v4, v4}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    new-instance v2, Landroid/widget/FrameLayout;

    .line 86
    .line 87
    .line 88
    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    new-instance v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 91
    .line 92
    .line 93
    invoke-direct {v3, v4, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 101
    move-result-object v5

    .line 102
    .line 103
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 104
    .line 105
    const/high16 v6, 0x41000000    # 8.0f

    .line 106
    mul-float/2addr v5, v6

    .line 107
    .line 108
    const/high16 v6, 0x3f000000    # 0.5f

    .line 109
    add-float/2addr v5, v6

    .line 110
    float-to-int v5, v5

    .line 111
    .line 112
    iput v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 113
    .line 114
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 115
    .line 116
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 117
    .line 118
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 119
    .line 120
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 121
    .line 122
    const/high16 v1, 0x3f800000    # 1.0f

    .line 123
    .line 124
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->verticalWeight:F

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    .line 129
    new-instance v1, Landroid/widget/ScrollView;

    .line 130
    .line 131
    .line 132
    invoke-direct {v1, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 133
    .line 134
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 135
    .line 136
    .line 137
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    .line 142
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    .line 143
    .line 144
    .line 145
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-direct {v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    .line 151
    .line 152
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 153
    const/4 v0, -0x2

    .line 154
    .line 155
    .line 156
    invoke-direct {p1, v4, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2, p1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 160
    return-void
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

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$participant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/lang/Iterable;Ljava/lang/Object;)I

    move-result v0

    .line 77
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->getShowLargeViewIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 78
    :cond_0
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 79
    :goto_0
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->f:Ljava/lang/String;

    .line 80
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 81
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->f:Ljava/lang/String;

    .line 82
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 83
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    const/16 v0, -0x63

    .line 84
    :goto_2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    invoke-static {p1}, Landroid/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;)V

    .line 85
    invoke-direct {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->setLargeViewIndex(I)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;Landroid/view/View;)V
    .locals 0

    const-string/jumbo p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$participant"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance p2, Lhg0/a;

    invoke-direct {p2, p0, p1}, Lhg0/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;Ljava/util/Set;)V
    .locals 5

    .line 6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 9
    check-cast v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 10
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 11
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 15
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 16
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 17
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 19
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 20
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 21
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 22
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a(Ljava/lang/String;)V

    goto :goto_3

    .line 23
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 24
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 25
    iget-object v4, v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 26
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_7
    move-object v2, v3

    :goto_5
    check-cast v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    if-nez v2, :cond_8

    goto :goto_4

    .line 27
    :cond_8
    iget-object v1, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_9

    .line 28
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    :cond_9
    iget-object v1, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_a

    .line 30
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 31
    :cond_a
    iget-object v1, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_b

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    :cond_b
    if-eqz v3, :cond_c

    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 34
    :cond_c
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    if-eqz v1, :cond_d

    .line 35
    iget-object v3, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 36
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 37
    :cond_d
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 38
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->f:Ljava/lang/String;

    .line 39
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 40
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 41
    invoke-static {p0}, Landroid/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;)V

    .line 42
    const-string v1, ""

    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->f:Ljava/lang/String;

    const/16 v1, -0x63

    .line 43
    invoke-direct {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->setLargeViewIndex(I)V

    .line 44
    :cond_e
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 45
    const-string v2, "message"

    const/4 v3, 0x0

    const-string v4, "remove participant="

    invoke-static {v4, v0, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    goto/16 :goto_4

    :cond_f
    return-void
.end method

.method public static final a(Landroid/view/GestureDetector;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const-string p1, "$detector"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-virtual {p0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private final setLargeViewIndex(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->getShowLargeViewIndex()I

    .line 9
    move-result v1

    .line 10
    .line 11
    if-ne p1, v1, :cond_1

    .line 12
    .line 13
    const/16 p1, -0x63

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->setShowLargeViewIndex(I)V

    .line 17
    .line 18
    :goto_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 35
    .line 36
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->f:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->f:Landroid/widget/TextView;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    .line 53
    const-string/jumbo v0, "textUserName"

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 57
    const/4 v0, 0x0

    .line 58
    .line 59
    :cond_3
    if-eqz v1, :cond_4

    .line 60
    const/4 v1, 0x0

    .line 61
    goto :goto_2

    .line 62
    .line 63
    :cond_4
    const/16 v1, 0x8

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_5
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 75
    :cond_6
    return-void
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


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lhg0/b;

    invoke-direct {v1, p0, p1}, Lhg0/b;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    :cond_0
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->b:Landroid/content/Context;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/e;

    invoke-direct {v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/e;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 4
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz p1, :cond_1

    .line 5
    new-instance v1, Lhg0/c;

    invoke-direct {v1, v0}, Lhg0/c;-><init>(Landroid/view/GestureDetector;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .line 46
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;-><init>()V

    .line 47
    const-string v1, "<set-?>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->a:Ljava/lang/String;

    .line 49
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 50
    :cond_0
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-nez v1, :cond_1

    .line 51
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->b:Landroid/content/Context;

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 52
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 53
    :cond_1
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 54
    invoke-virtual {v1, v3, v2, v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->a(ZIIF)V

    .line 55
    :cond_2
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_3

    .line 56
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->g:Ljava/util/Map;

    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 57
    :cond_3
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_4

    .line 58
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->j:Ljava/util/Map;

    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setVolumeLevelIcons(Ljava/util/Map;)V

    .line 59
    :cond_4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_5

    .line 60
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->h:Ljava/util/Map;

    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setNetworkQualityIcons(Ljava/util/Map;)V

    .line 61
    :cond_5
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_6

    .line 62
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->i:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setWaitingAnimation(Ljava/lang/String;)V

    .line 63
    :cond_6
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_7

    .line 64
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    goto :goto_0

    :cond_7
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_8

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 66
    :cond_8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 67
    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 68
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    if-eqz v2, :cond_9

    .line 69
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 70
    invoke-virtual {v2, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    :cond_9
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;)V

    .line 72
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    const-string v1, "add new participant="

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    const-string v1, "message"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 74
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviterId()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviteeIds()Ljava/util/LinkedHashSet;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->a(Ljava/lang/String;)V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/g;

    .line 62
    const/4 v0, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct {v4, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;Lkotlin/coroutines/Continuation;)V

    .line 66
    const/4 v5, 0x3

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->c:Lkotlinx/coroutines/x1;

    .line 76
    return-void
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
.end method

.method public final onDetachedFromWindow()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->c:Lkotlinx/coroutines/x1;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    check-cast v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 38
    .line 39
    iget-object v3, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    :cond_3
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 58
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
.end method

.method public final setNetworkQualityIcons(Ljava/util/Map;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "icons"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->h:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 26
    .line 27
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setNetworkQualityIcons(Ljava/util/Map;)V

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
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
.end method

.method public final setParticipantsAvatar(Ljava/util/Map;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "avatars"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->g:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 26
    .line 27
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
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
.end method

.method public final setVolumeLevelIcons(Ljava/util/Map;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lio/trtc/tuikit/atomicxcore/api/view/VolumeLevel;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "icons"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->j:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 26
    .line 27
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setVolumeLevelIcons(Ljava/util/Map;)V

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
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
.end method

.method public final setWaitingAnimation(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "path"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->i:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;

    .line 26
    .line 27
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/d;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setWaitingAnimation(Ljava/lang/String;)V

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
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
.end method
