.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic k:I


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final b:Landroid/content/Context;

.field public c:Lkotlinx/coroutines/x1;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Landroid/widget/TextView;

.field public f:Ljava/lang/String;

.field public g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

.field public h:Ljava/util/Map;

.field public i:Ljava/util/Map;

.field public j:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

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
    const-string v0, "file"

    .line 11
    .line 12
    const-string v1, "AtomicXCore-Call"

    .line 13
    .line 14
    const-string v2, "CallPipView"

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b:Landroid/content/Context;

    .line 27
    .line 28
    const-string v0, ""

    .line 29
    .line 30
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->h:Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->i:Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->j:Ljava/util/Map;

    .line 49
    .line 50
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 54
    const/4 v1, 0x0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 58
    .line 59
    new-instance v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 60
    const/4 v3, -0x1

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v3, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 64
    .line 65
    iput v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 66
    .line 67
    iput v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 68
    .line 69
    iput v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 70
    .line 71
    iput v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    .line 76
    new-instance v2, Landroid/widget/FrameLayout;

    .line 77
    .line 78
    .line 79
    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 80
    .line 81
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->d:Landroid/widget/FrameLayout;

    .line 82
    .line 83
    new-instance v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 84
    .line 85
    .line 86
    invoke-direct {v4, v3, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    new-instance v2, Landroid/widget/TextView;

    .line 92
    .line 93
    .line 94
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    const/16 v4, 0x11

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 103
    const/4 v3, 0x2

    .line 104
    .line 105
    const/high16 v4, 0x41400000    # 12.0f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 109
    .line 110
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->e:Landroid/widget/TextView;

    .line 111
    .line 112
    new-instance v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 113
    const/4 v4, -0x2

    .line 114
    .line 115
    .line 116
    invoke-direct {v3, v4, v4}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 127
    .line 128
    const/high16 v4, 0x40c00000    # 6.0f

    .line 129
    mul-float/2addr p1, v4

    .line 130
    .line 131
    const/high16 v4, 0x3f000000    # 0.5f

    .line 132
    add-float/2addr p1, v4

    .line 133
    float-to-int p1, p1

    .line 134
    .line 135
    iput p1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 136
    .line 137
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 138
    .line 139
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 140
    .line 141
    iput v1, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    return-void
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

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getActiveCall()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/b;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/b;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/a;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/d;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/d;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/c;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSpeakerVolumes()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/f;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/f;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/e;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 8
    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->d:Landroid/widget/FrameLayout;

    if-nez v0, :cond_3

    const-string/jumbo v0, "videoContainer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    return-void
.end method

.method public final b()V
    .locals 7

    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "show video, userId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->getParticipantId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 9
    :cond_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->a()V

    .line 10
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b:Landroid/content/Context;

    const-string v4, "context"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 11
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x42a00000    # 80.0f

    mul-float/2addr v1, v4

    const/high16 v5, 0x3f000000    # 0.5f

    add-float/2addr v1, v5

    float-to-int v1, v1

    .line 12
    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    const/high16 v5, 0x41400000    # 12.0f

    const/4 v6, 0x1

    .line 13
    invoke-virtual {v0, v6, v1, v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->a(ZIIF)V

    .line 14
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->h:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 15
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->j:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setNetworkQualityIcons(Ljava/util/Map;)V

    .line 16
    :cond_3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->i:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setVolumeLevelIcons(Ljava/util/Map;)V

    .line 17
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->d:Landroid/widget/FrameLayout;

    const-string/jumbo v1, "videoContainer"

    if-nez v0, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 18
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->d:Landroid/widget/FrameLayout;

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v3, v0

    :goto_1
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final c()V
    .locals 8

    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    move-result-object v1

    .line 6
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    move-result-object v0

    .line 7
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getDuration()J

    move-result-wide v2

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    if-ne v1, v0, :cond_9

    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->e:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const-string/jumbo v0, "textCallDuration"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    long-to-int v1, v2

    .line 10
    rem-int/lit8 v2, v1, 0x3c

    .line 11
    div-int/lit8 v1, v1, 0x3c

    const-string v3, "0"

    const/16 v4, 0xa

    if-lez v1, :cond_7

    .line 12
    rem-int/lit8 v5, v1, 0x3c

    .line 13
    div-int/lit8 v1, v1, 0x3c

    const/16 v6, 0x3a

    if-lez v1, :cond_4

    if-lt v1, v4, :cond_1

    .line 14
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-lt v5, v4, :cond_2

    .line 15
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_1
    if-lt v2, v4, :cond_3

    .line 16
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 17
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_4
    if-lt v5, v4, :cond_5

    .line 18
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_3
    if-lt v2, v4, :cond_6

    .line 19
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 20
    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_7
    if-lt v2, v4, :cond_8

    .line 21
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 22
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "00:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 23
    :goto_6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    return-void
.end method

.method public final d()V
    .locals 12

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    .line 21
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 22
    .line 23
    const/16 v10, 0x7f

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v2 .. v11}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v4, "updateView self status="

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    const-string v4, "message"

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    const/4 v5, 0x0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v5, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->None:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 75
    .line 76
    if-ne v2, v3, :cond_0

    .line 77
    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_0
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->e:Landroid/widget/TextView;

    .line 81
    .line 82
    if-nez v2, :cond_1

    .line 83
    .line 84
    .line 85
    const-string/jumbo v2, "textCallDuration"

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 89
    const/4 v2, 0x0

    .line 90
    .line 91
    .line 92
    :cond_1
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Waiting:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 96
    .line 97
    if-ne v1, v3, :cond_2

    .line 98
    .line 99
    const/16 v5, 0x8

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getActiveCall()Lkotlinx/coroutines/flow/w;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviteeIds()Ljava/util/LinkedHashSet;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 128
    move-result v1

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getChatGroupId()Ljava/lang/String;

    .line 138
    move-result-object v2

    .line 139
    const/4 v5, 0x1

    .line 140
    .line 141
    if-gt v1, v5, :cond_8

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 145
    move-result v1

    .line 146
    .line 147
    if-lez v1, :cond_3

    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    .line 152
    :cond_3
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 157
    move-result-object v1

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    .line 164
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 165
    move-result-object v1

    .line 166
    .line 167
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviteeIds()Ljava/util/LinkedHashSet;

    .line 177
    move-result-object v2

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 181
    move-result-object v5

    .line 182
    .line 183
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getMediaType()Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 187
    move-result-object v5

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 191
    move-result v2

    .line 192
    .line 193
    if-nez v2, :cond_4

    .line 194
    .line 195
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 196
    .line 197
    const-string v1, "inviteeIds is empty"

    .line 198
    const/4 v2, 0x2

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1, v4, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 202
    return-void

    .line 203
    .line 204
    .line 205
    :cond_4
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 206
    move-result-object v2

    .line 207
    .line 208
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviterId()Ljava/lang/String;

    .line 212
    move-result-object v2

    .line 213
    .line 214
    .line 215
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviteeIds()Ljava/util/LinkedHashSet;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 226
    move-result-object v0

    .line 227
    .line 228
    check-cast v0, Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 232
    move-result-object v4

    .line 233
    .line 234
    .line 235
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    move-result v4

    .line 237
    .line 238
    if-eqz v4, :cond_5

    .line 239
    goto :goto_0

    .line 240
    :cond_5
    move-object v2, v0

    .line 241
    .line 242
    .line 243
    :goto_0
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 244
    move-result-object v0

    .line 245
    .line 246
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 247
    .line 248
    if-ne v0, v4, :cond_6

    .line 249
    .line 250
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b()V

    .line 254
    return-void

    .line 255
    .line 256
    .line 257
    :cond_6
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    if-ne v0, v3, :cond_c

    .line 261
    .line 262
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Video:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 263
    .line 264
    if-ne v5, v0, :cond_7

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 268
    move-result-object v2

    .line 269
    .line 270
    :cond_7
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b()V

    .line 274
    return-void

    .line 275
    .line 276
    .line 277
    :cond_8
    :goto_1
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 278
    move-result-object v1

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 282
    move-result-object v1

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    .line 289
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 293
    .line 294
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 295
    .line 296
    const-string v3, ""

    .line 297
    .line 298
    .line 299
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    move-result v2

    .line 301
    .line 302
    if-eqz v2, :cond_9

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 306
    move-result-object v1

    .line 307
    .line 308
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b()V

    .line 312
    .line 313
    .line 314
    :cond_9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 315
    move-result-object v0

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 319
    move-result-object v0

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSpeakerVolumes()Lkotlinx/coroutines/flow/w;

    .line 323
    move-result-object v0

    .line 324
    .line 325
    .line 326
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 327
    move-result-object v0

    .line 328
    .line 329
    check-cast v0, Ljava/util/Map;

    .line 330
    .line 331
    .line 332
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 333
    move-result-object v0

    .line 334
    .line 335
    .line 336
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 337
    move-result-object v0

    .line 338
    .line 339
    .line 340
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    move-result v1

    .line 342
    .line 343
    if-eqz v1, :cond_c

    .line 344
    .line 345
    .line 346
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    move-result-object v1

    .line 348
    .line 349
    check-cast v1, Ljava/util/Map$Entry;

    .line 350
    .line 351
    .line 352
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 353
    move-result-object v2

    .line 354
    .line 355
    check-cast v2, Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 359
    move-result-object v1

    .line 360
    .line 361
    check-cast v1, Ljava/lang/Number;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 365
    move-result v1

    .line 366
    .line 367
    const/16 v3, 0xa

    .line 368
    .line 369
    if-le v1, v3, :cond_a

    .line 370
    .line 371
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    move-result v0

    .line 376
    .line 377
    if-eqz v0, :cond_b

    .line 378
    goto :goto_2

    .line 379
    .line 380
    :cond_b
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->f:Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->b()V

    .line 384
    :cond_c
    :goto_2
    return-void
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
.end method

.method public final onAttachedToWindow()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->d()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->c()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/k;

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v4, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/k;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V

    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->c:Lkotlinx/coroutines/x1;

    .line 34
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
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->c:Lkotlinx/coroutines/x1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->a()V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final setNetworkQualityIcons(Ljava/util/Map;)V
    .locals 1
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->j:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setNetworkQualityIcons(Ljava/util/Map;)V

    .line 15
    :cond_0
    return-void
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

.method public final setParticipantsAvatar(Ljava/util/Map;)V
    .locals 1
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->h:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 15
    :cond_0
    return-void
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

.method public final setVolumeLevelIcons(Ljava/util/Map;)V
    .locals 1
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->i:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setVolumeLevelIcons(Ljava/util/Map;)V

    .line 15
    :cond_0
    return-void
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
