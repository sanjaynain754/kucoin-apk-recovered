.class public Le1/n;
.super Ljava/lang/Object;
.source "PolystarContent.java"

# interfaces
.implements Le1/m;
.implements Lf1/a$b;
.implements Le1/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/PathMeasure;

.field public final d:[F

.field public final e:Ljava/lang/String;

.field public final f:Lcom/airbnb/lottie/LottieDrawable;

.field public final g:Lcom/airbnb/lottie/model/content/PolystarShape$Type;

.field public final h:Z

.field public final i:Z

.field public final j:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Le1/b;

.field public r:Z


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieDrawable;Lcom/airbnb/lottie/model/layer/a;Lcom/airbnb/lottie/model/content/PolystarShape;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Path;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Path;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Le1/n;->b:Landroid/graphics/Path;

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/PathMeasure;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Le1/n;->c:Landroid/graphics/PathMeasure;

    .line 25
    const/4 v0, 0x2

    .line 26
    .line 27
    new-array v0, v0, [F

    .line 28
    .line 29
    iput-object v0, p0, Le1/n;->d:[F

    .line 30
    .line 31
    new-instance v0, Le1/b;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Le1/b;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Le1/n;->q:Le1/b;

    .line 37
    .line 38
    iput-object p1, p0, Le1/n;->f:Lcom/airbnb/lottie/LottieDrawable;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->d()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    iput-object p1, p0, Le1/n;->e:Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->j()Lcom/airbnb/lottie/model/content/PolystarShape$Type;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Le1/n;->g:Lcom/airbnb/lottie/model/content/PolystarShape$Type;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->k()Z

    .line 54
    move-result v0

    .line 55
    .line 56
    iput-boolean v0, p0, Le1/n;->h:Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->l()Z

    .line 60
    move-result v0

    .line 61
    .line 62
    iput-boolean v0, p0, Le1/n;->i:Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->g()Li1/b;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Li1/b;->a()Lf1/a;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    iput-object v0, p0, Le1/n;->j:Lf1/a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->h()Li1/m;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, Li1/m;->a()Lf1/a;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    iput-object v1, p0, Le1/n;->k:Lf1/a;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->i()Li1/b;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Li1/b;->a()Lf1/a;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    iput-object v2, p0, Le1/n;->l:Lf1/a;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->e()Li1/b;

    .line 96
    move-result-object v3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Li1/b;->a()Lf1/a;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    iput-object v3, p0, Le1/n;->n:Lf1/a;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->f()Li1/b;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Li1/b;->a()Lf1/a;

    .line 110
    move-result-object v4

    .line 111
    .line 112
    iput-object v4, p0, Le1/n;->p:Lf1/a;

    .line 113
    .line 114
    sget-object v5, Lcom/airbnb/lottie/model/content/PolystarShape$Type;->STAR:Lcom/airbnb/lottie/model/content/PolystarShape$Type;

    .line 115
    .line 116
    if-ne p1, v5, :cond_0

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->b()Li1/b;

    .line 120
    move-result-object v6

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Li1/b;->a()Lf1/a;

    .line 124
    move-result-object v6

    .line 125
    .line 126
    iput-object v6, p0, Le1/n;->m:Lf1/a;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/PolystarShape;->c()Li1/b;

    .line 130
    move-result-object p3

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3}, Li1/b;->a()Lf1/a;

    .line 134
    move-result-object p3

    .line 135
    .line 136
    iput-object p3, p0, Le1/n;->o:Lf1/a;

    .line 137
    goto :goto_0

    .line 138
    :cond_0
    const/4 p3, 0x0

    .line 139
    .line 140
    iput-object p3, p0, Le1/n;->m:Lf1/a;

    .line 141
    .line 142
    iput-object p3, p0, Le1/n;->o:Lf1/a;

    .line 143
    .line 144
    .line 145
    :goto_0
    invoke-virtual {p2, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, v1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v2}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v3}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v4}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 158
    .line 159
    if-ne p1, v5, :cond_1

    .line 160
    .line 161
    iget-object p3, p0, Le1/n;->m:Lf1/a;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, p3}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 165
    .line 166
    iget-object p3, p0, Le1/n;->o:Lf1/a;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p3}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 170
    .line 171
    .line 172
    :cond_1
    invoke-virtual {v0, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 185
    .line 186
    if-ne p1, v5, :cond_2

    .line 187
    .line 188
    iget-object p1, p0, Le1/n;->m:Lf1/a;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 192
    .line 193
    iget-object p1, p0, Le1/n;->o:Lf1/a;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 197
    :cond_2
    return-void
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

.method private j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Le1/n;->r:Z

    .line 4
    .line 5
    iget-object v0, p0, Le1/n;->f:Lcom/airbnb/lottie/LottieDrawable;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieDrawable;->invalidateSelf()V

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


# virtual methods
.method public a(Ljava/lang/Object;Lp1/c;)V
    .locals 1
    .param p2    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lp1/c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/airbnb/lottie/m0;->w:Ljava/lang/Float;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Le1/n;->j:Lf1/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/airbnb/lottie/m0;->x:Ljava/lang/Float;

    .line 13
    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Le1/n;->l:Lf1/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_1
    sget-object v0, Lcom/airbnb/lottie/m0;->n:Landroid/graphics/PointF;

    .line 23
    .line 24
    if-ne p1, v0, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Le1/n;->k:Lf1/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_2
    sget-object v0, Lcom/airbnb/lottie/m0;->y:Ljava/lang/Float;

    .line 33
    .line 34
    if-ne p1, v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Le1/n;->m:Lf1/a;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p2}, Lf1/a;->o(Lp1/c;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_3
    sget-object v0, Lcom/airbnb/lottie/m0;->z:Ljava/lang/Float;

    .line 45
    .line 46
    if-ne p1, v0, :cond_4

    .line 47
    .line 48
    iget-object p1, p0, Le1/n;->n:Lf1/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 52
    return-void

    .line 53
    .line 54
    :cond_4
    sget-object v0, Lcom/airbnb/lottie/m0;->A:Ljava/lang/Float;

    .line 55
    .line 56
    if-ne p1, v0, :cond_5

    .line 57
    .line 58
    iget-object v0, p0, Le1/n;->o:Lf1/a;

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p2}, Lf1/a;->o(Lp1/c;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_5
    sget-object v0, Lcom/airbnb/lottie/m0;->B:Ljava/lang/Float;

    .line 67
    .line 68
    if-ne p1, v0, :cond_6

    .line 69
    .line 70
    iget-object p1, p0, Le1/n;->p:Lf1/a;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 74
    :cond_6
    return-void
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
.end method

.method public final c()V
    .locals 39

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Le1/n;->j:Lf1/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 14
    move-result v1

    .line 15
    float-to-double v1, v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 19
    move-result-wide v1

    .line 20
    double-to-int v1, v1

    .line 21
    .line 22
    iget-object v2, v0, Le1/n;->l:Lf1/a;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 37
    move-result v2

    .line 38
    float-to-double v2, v2

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    :goto_0
    const-wide v4, 0x4056800000000000L    # 90.0

    .line 44
    sub-double/2addr v2, v4

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 48
    move-result-wide v2

    .line 49
    int-to-double v4, v1

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    .line 55
    div-double/2addr v6, v4

    .line 56
    double-to-float v1, v6

    .line 57
    .line 58
    iget-object v6, v0, Le1/n;->p:Lf1/a;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6}, Lf1/a;->h()Ljava/lang/Object;

    .line 62
    move-result-object v6

    .line 63
    .line 64
    check-cast v6, Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 68
    move-result v6

    .line 69
    .line 70
    const/high16 v7, 0x42c80000    # 100.0f

    .line 71
    div-float/2addr v6, v7

    .line 72
    .line 73
    iget-object v7, v0, Le1/n;->n:Lf1/a;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7}, Lf1/a;->h()Ljava/lang/Object;

    .line 77
    move-result-object v7

    .line 78
    .line 79
    check-cast v7, Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 83
    move-result v7

    .line 84
    float-to-double v8, v7

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 88
    move-result-wide v10

    .line 89
    mul-double/2addr v10, v8

    .line 90
    double-to-float v10, v10

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 94
    move-result-wide v11

    .line 95
    mul-double/2addr v11, v8

    .line 96
    double-to-float v11, v11

    .line 97
    .line 98
    iget-object v12, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 102
    float-to-double v12, v1

    .line 103
    add-double/2addr v2, v12

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 107
    move-result-wide v4

    .line 108
    .line 109
    move-wide/from16 v16, v2

    .line 110
    const/4 v14, 0x0

    .line 111
    :goto_1
    int-to-double v1, v14

    .line 112
    .line 113
    cmpg-double v3, v1, v4

    .line 114
    .line 115
    if-gez v3, :cond_4

    .line 116
    .line 117
    .line 118
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    .line 119
    move-result-wide v18

    .line 120
    .line 121
    move-wide/from16 v20, v1

    .line 122
    .line 123
    mul-double v1, v8, v18

    .line 124
    double-to-float v1, v1

    .line 125
    .line 126
    .line 127
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    .line 128
    move-result-wide v2

    .line 129
    mul-double/2addr v2, v8

    .line 130
    double-to-float v2, v2

    .line 131
    const/4 v3, 0x0

    .line 132
    .line 133
    cmpl-float v3, v6, v3

    .line 134
    .line 135
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 136
    .line 137
    if-eqz v3, :cond_2

    .line 138
    .line 139
    move-wide/from16 v29, v4

    .line 140
    float-to-double v3, v11

    .line 141
    .line 142
    move/from16 v31, v6

    .line 143
    float-to-double v5, v10

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 147
    move-result-wide v3

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    const-wide v5, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 153
    sub-double/2addr v3, v5

    .line 154
    double-to-float v3, v3

    .line 155
    float-to-double v3, v3

    .line 156
    .line 157
    move-wide/from16 v22, v5

    .line 158
    .line 159
    .line 160
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 161
    move-result-wide v5

    .line 162
    double-to-float v5, v5

    .line 163
    .line 164
    .line 165
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 166
    move-result-wide v3

    .line 167
    double-to-float v3, v3

    .line 168
    move v6, v3

    .line 169
    float-to-double v3, v2

    .line 170
    .line 171
    move/from16 v24, v5

    .line 172
    .line 173
    move/from16 v25, v6

    .line 174
    float-to-double v5, v1

    .line 175
    .line 176
    .line 177
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 178
    move-result-wide v3

    .line 179
    .line 180
    sub-double v3, v3, v22

    .line 181
    double-to-float v3, v3

    .line 182
    float-to-double v3, v3

    .line 183
    .line 184
    .line 185
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 186
    move-result-wide v5

    .line 187
    double-to-float v5, v5

    .line 188
    .line 189
    .line 190
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 191
    move-result-wide v3

    .line 192
    double-to-float v3, v3

    .line 193
    .line 194
    mul-float v6, v7, v31

    .line 195
    .line 196
    const/high16 v4, 0x3e800000    # 0.25f

    .line 197
    mul-float/2addr v6, v4

    .line 198
    .line 199
    mul-float v4, v6, v24

    .line 200
    .line 201
    mul-float v22, v6, v25

    .line 202
    mul-float/2addr v5, v6

    .line 203
    mul-float/2addr v6, v3

    .line 204
    .line 205
    sub-double v18, v29, v18

    .line 206
    .line 207
    cmpl-double v3, v20, v18

    .line 208
    .line 209
    if-nez v3, :cond_1

    .line 210
    .line 211
    iget-object v3, v0, Le1/n;->b:Landroid/graphics/Path;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 215
    .line 216
    iget-object v3, v0, Le1/n;->b:Landroid/graphics/Path;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 220
    .line 221
    iget-object v3, v0, Le1/n;->b:Landroid/graphics/Path;

    .line 222
    .line 223
    sub-float v33, v10, v4

    .line 224
    .line 225
    sub-float v34, v11, v22

    .line 226
    .line 227
    add-float v35, v1, v5

    .line 228
    .line 229
    add-float v36, v2, v6

    .line 230
    .line 231
    move/from16 v27, v1

    .line 232
    .line 233
    move/from16 v28, v2

    .line 234
    .line 235
    move-object/from16 v22, v3

    .line 236
    .line 237
    move/from16 v23, v33

    .line 238
    .line 239
    move/from16 v24, v34

    .line 240
    .line 241
    move/from16 v25, v35

    .line 242
    .line 243
    move/from16 v26, v36

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v22 .. v28}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 247
    .line 248
    iget-object v1, v0, Le1/n;->c:Landroid/graphics/PathMeasure;

    .line 249
    .line 250
    iget-object v2, v0, Le1/n;->b:Landroid/graphics/Path;

    .line 251
    const/4 v15, 0x0

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2, v15}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 255
    .line 256
    iget-object v1, v0, Le1/n;->c:Landroid/graphics/PathMeasure;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 260
    move-result v2

    .line 261
    .line 262
    .line 263
    const v3, 0x3f7ff972    # 0.9999f

    .line 264
    mul-float/2addr v2, v3

    .line 265
    .line 266
    iget-object v3, v0, Le1/n;->d:[F

    .line 267
    const/4 v4, 0x0

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 271
    .line 272
    iget-object v1, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 273
    .line 274
    iget-object v2, v0, Le1/n;->d:[F

    .line 275
    .line 276
    aget v37, v2, v15

    .line 277
    const/4 v3, 0x1

    .line 278
    .line 279
    aget v38, v2, v3

    .line 280
    .line 281
    move-object/from16 v32, v1

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v32 .. v38}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 285
    .line 286
    :goto_2
    move/from16 v10, v27

    .line 287
    .line 288
    move/from16 v11, v28

    .line 289
    goto :goto_3

    .line 290
    .line 291
    :cond_1
    move/from16 v27, v1

    .line 292
    .line 293
    move/from16 v28, v2

    .line 294
    const/4 v15, 0x0

    .line 295
    .line 296
    iget-object v1, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 297
    .line 298
    sub-float v23, v10, v4

    .line 299
    .line 300
    sub-float v24, v11, v22

    .line 301
    .line 302
    add-float v25, v27, v5

    .line 303
    .line 304
    add-float v26, v28, v6

    .line 305
    .line 306
    move-object/from16 v22, v1

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v22 .. v28}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 310
    goto :goto_2

    .line 311
    :cond_2
    move v10, v1

    .line 312
    move v11, v2

    .line 313
    .line 314
    move-wide/from16 v29, v4

    .line 315
    .line 316
    move/from16 v31, v6

    .line 317
    const/4 v15, 0x0

    .line 318
    .line 319
    sub-double v4, v29, v18

    .line 320
    .line 321
    cmpl-double v1, v20, v4

    .line 322
    .line 323
    if-nez v1, :cond_3

    .line 324
    goto :goto_4

    .line 325
    .line 326
    :cond_3
    iget-object v1, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 330
    .line 331
    :goto_3
    add-double v16, v16, v12

    .line 332
    .line 333
    :goto_4
    add-int/lit8 v14, v14, 0x1

    .line 334
    .line 335
    move-wide/from16 v4, v29

    .line 336
    .line 337
    move/from16 v6, v31

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :cond_4
    iget-object v1, v0, Le1/n;->k:Lf1/a;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    check-cast v1, Landroid/graphics/PointF;

    .line 348
    .line 349
    iget-object v2, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 350
    .line 351
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 352
    .line 353
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->offset(FF)V

    .line 357
    .line 358
    iget-object v1, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 362
    return-void
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
.end method

.method public e()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Le1/n;->j()V

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

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le1/c;",
            ">;",
            "Ljava/util/List<",
            "Le1/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p2, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 5
    move-result v0

    .line 6
    .line 7
    if-ge p2, v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Le1/c;

    .line 14
    .line 15
    instance-of v1, v0, Le1/u;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Le1/u;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Le1/u;->j()Lcom/airbnb/lottie/model/content/ShapeTrimPath$Type;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    sget-object v2, Lcom/airbnb/lottie/model/content/ShapeTrimPath$Type;->SIMULTANEOUSLY:Lcom/airbnb/lottie/model/content/ShapeTrimPath$Type;

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Le1/n;->q:Le1/b;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Le1/b;->a(Le1/u;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Le1/u;->a(Lf1/a$b;)V

    .line 36
    .line 37
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
    .line 40
    .line 41
    .line 42
.end method

.method public g(Lh1/d;ILjava/util/List;Lh1/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/d;",
            "I",
            "Ljava/util/List<",
            "Lh1/d;",
            ">;",
            "Lh1/d;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2, p3, p4, p0}, Lo1/k;->k(Lh1/d;ILjava/util/List;Lh1/d;Le1/k;)V

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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le1/n;->e:Ljava/lang/String;

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

.method public getPath()Landroid/graphics/Path;
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Le1/n;->r:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 13
    .line 14
    iget-boolean v0, p0, Le1/n;->h:Z

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iput-boolean v1, p0, Le1/n;->r:Z

    .line 20
    .line 21
    iget-object v0, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_1
    sget-object v0, Le1/n$a;->a:[I

    .line 25
    .line 26
    iget-object v2, p0, Le1/n;->g:Lcom/airbnb/lottie/model/content/PolystarShape$Type;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    move-result v2

    .line 31
    .line 32
    aget v0, v0, v2

    .line 33
    .line 34
    if-eq v0, v1, :cond_3

    .line 35
    const/4 v2, 0x2

    .line 36
    .line 37
    if-eq v0, v2, :cond_2

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Le1/n;->c()V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-virtual {p0}, Le1/n;->i()V

    .line 46
    .line 47
    :goto_0
    iget-object v0, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 51
    .line 52
    iget-object v0, p0, Le1/n;->q:Le1/b;

    .line 53
    .line 54
    iget-object v2, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Le1/b;->b(Landroid/graphics/Path;)V

    .line 58
    .line 59
    iput-boolean v1, p0, Le1/n;->r:Z

    .line 60
    .line 61
    iget-object v0, p0, Le1/n;->a:Landroid/graphics/Path;

    .line 62
    return-object v0
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
.end method

.method public final i()V
    .locals 43

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Le1/n;->j:Lf1/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 14
    move-result v1

    .line 15
    .line 16
    iget-object v2, v0, Le1/n;->l:Lf1/a;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 31
    move-result v2

    .line 32
    float-to-double v2, v2

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    :goto_0
    const-wide v4, 0x4056800000000000L    # 90.0

    .line 38
    sub-double/2addr v2, v4

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 42
    move-result-wide v2

    .line 43
    float-to-double v4, v1

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    .line 49
    div-double/2addr v6, v4

    .line 50
    double-to-float v6, v6

    .line 51
    .line 52
    iget-boolean v7, v0, Le1/n;->i:Z

    .line 53
    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    const/high16 v7, -0x40800000    # -1.0f

    .line 57
    mul-float/2addr v6, v7

    .line 58
    .line 59
    :cond_1
    const/high16 v7, 0x40000000    # 2.0f

    .line 60
    .line 61
    div-float v8, v6, v7

    .line 62
    float-to-int v9, v1

    .line 63
    int-to-float v9, v9

    .line 64
    sub-float/2addr v1, v9

    .line 65
    const/4 v9, 0x0

    .line 66
    .line 67
    cmpl-float v10, v1, v9

    .line 68
    .line 69
    if-eqz v10, :cond_2

    .line 70
    .line 71
    const/high16 v11, 0x3f800000    # 1.0f

    .line 72
    sub-float/2addr v11, v1

    .line 73
    mul-float/2addr v11, v8

    .line 74
    float-to-double v11, v11

    .line 75
    add-double/2addr v2, v11

    .line 76
    .line 77
    :cond_2
    iget-object v11, v0, Le1/n;->n:Lf1/a;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v11}, Lf1/a;->h()Ljava/lang/Object;

    .line 81
    move-result-object v11

    .line 82
    .line 83
    check-cast v11, Ljava/lang/Float;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 87
    move-result v11

    .line 88
    .line 89
    iget-object v12, v0, Le1/n;->m:Lf1/a;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12}, Lf1/a;->h()Ljava/lang/Object;

    .line 93
    move-result-object v12

    .line 94
    .line 95
    check-cast v12, Ljava/lang/Float;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 99
    move-result v12

    .line 100
    .line 101
    iget-object v13, v0, Le1/n;->o:Lf1/a;

    .line 102
    .line 103
    const/high16 v14, 0x42c80000    # 100.0f

    .line 104
    .line 105
    if-eqz v13, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13}, Lf1/a;->h()Ljava/lang/Object;

    .line 109
    move-result-object v13

    .line 110
    .line 111
    check-cast v13, Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 115
    move-result v13

    .line 116
    div-float/2addr v13, v14

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    move v13, v9

    .line 119
    .line 120
    :goto_1
    iget-object v15, v0, Le1/n;->p:Lf1/a;

    .line 121
    .line 122
    if-eqz v15, :cond_4

    .line 123
    .line 124
    .line 125
    invoke-virtual {v15}, Lf1/a;->h()Ljava/lang/Object;

    .line 126
    move-result-object v15

    .line 127
    .line 128
    check-cast v15, Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 132
    move-result v15

    .line 133
    div-float/2addr v15, v14

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    move v15, v9

    .line 136
    .line 137
    :goto_2
    if-eqz v10, :cond_5

    .line 138
    .line 139
    sub-float v14, v11, v12

    .line 140
    mul-float/2addr v14, v1

    .line 141
    add-float/2addr v14, v12

    .line 142
    .line 143
    move/from16 v16, v9

    .line 144
    .line 145
    move/from16 v17, v10

    .line 146
    float-to-double v9, v14

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 150
    move-result-wide v18

    .line 151
    .line 152
    move/from16 v20, v7

    .line 153
    .line 154
    move/from16 v21, v8

    .line 155
    .line 156
    mul-double v7, v9, v18

    .line 157
    double-to-float v7, v7

    .line 158
    .line 159
    .line 160
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 161
    move-result-wide v18

    .line 162
    .line 163
    mul-double v9, v9, v18

    .line 164
    double-to-float v8, v9

    .line 165
    .line 166
    iget-object v9, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 170
    .line 171
    mul-float v9, v6, v1

    .line 172
    .line 173
    div-float v9, v9, v20

    .line 174
    float-to-double v9, v9

    .line 175
    add-double/2addr v2, v9

    .line 176
    move v10, v1

    .line 177
    move v9, v7

    .line 178
    .line 179
    move/from16 v7, v21

    .line 180
    goto :goto_3

    .line 181
    .line 182
    :cond_5
    move/from16 v20, v7

    .line 183
    .line 184
    move/from16 v21, v8

    .line 185
    .line 186
    move/from16 v16, v9

    .line 187
    .line 188
    move/from16 v17, v10

    .line 189
    float-to-double v7, v11

    .line 190
    .line 191
    .line 192
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 193
    move-result-wide v9

    .line 194
    mul-double/2addr v9, v7

    .line 195
    double-to-float v9, v9

    .line 196
    .line 197
    .line 198
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 199
    move-result-wide v18

    .line 200
    .line 201
    mul-double v7, v7, v18

    .line 202
    double-to-float v8, v7

    .line 203
    .line 204
    iget-object v7, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 208
    move v10, v1

    .line 209
    .line 210
    move-wide/from16 v18, v2

    .line 211
    .line 212
    move/from16 v7, v21

    .line 213
    float-to-double v1, v7

    .line 214
    .line 215
    add-double v2, v18, v1

    .line 216
    .line 217
    move/from16 v14, v16

    .line 218
    .line 219
    .line 220
    :goto_3
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 221
    move-result-wide v4

    .line 222
    .line 223
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 224
    .line 225
    mul-double v4, v4, v18

    .line 226
    const/4 v1, 0x0

    .line 227
    .line 228
    move/from16 v21, v1

    .line 229
    .line 230
    move-wide/from16 v22, v4

    .line 231
    .line 232
    move-wide/from16 v41, v2

    .line 233
    move v3, v8

    .line 234
    move v2, v9

    .line 235
    .line 236
    move-wide/from16 v8, v41

    .line 237
    :goto_4
    int-to-double v4, v1

    .line 238
    .line 239
    cmpg-double v24, v4, v22

    .line 240
    .line 241
    if-gez v24, :cond_10

    .line 242
    .line 243
    if-eqz v21, :cond_6

    .line 244
    .line 245
    move/from16 v24, v11

    .line 246
    goto :goto_5

    .line 247
    .line 248
    :cond_6
    move/from16 v24, v12

    .line 249
    .line 250
    :goto_5
    cmpl-float v25, v14, v16

    .line 251
    .line 252
    if-eqz v25, :cond_7

    .line 253
    .line 254
    sub-double v26, v22, v18

    .line 255
    .line 256
    cmpl-double v26, v4, v26

    .line 257
    .line 258
    if-nez v26, :cond_7

    .line 259
    .line 260
    mul-float v26, v6, v10

    .line 261
    .line 262
    div-float v26, v26, v20

    .line 263
    .line 264
    move/from16 v41, v26

    .line 265
    .line 266
    move/from16 v26, v1

    .line 267
    .line 268
    move/from16 v1, v41

    .line 269
    goto :goto_6

    .line 270
    .line 271
    :cond_7
    move/from16 v26, v1

    .line 272
    move v1, v7

    .line 273
    .line 274
    :goto_6
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    .line 275
    .line 276
    if-eqz v25, :cond_8

    .line 277
    .line 278
    sub-double v29, v22, v27

    .line 279
    .line 280
    cmpl-double v25, v4, v29

    .line 281
    .line 282
    if-nez v25, :cond_8

    .line 283
    .line 284
    move-wide/from16 v29, v4

    .line 285
    move v4, v14

    .line 286
    goto :goto_7

    .line 287
    .line 288
    :cond_8
    move-wide/from16 v29, v4

    .line 289
    .line 290
    move/from16 v4, v24

    .line 291
    :goto_7
    float-to-double v4, v4

    .line 292
    .line 293
    .line 294
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 295
    move-result-wide v24

    .line 296
    .line 297
    move-wide/from16 v31, v4

    .line 298
    .line 299
    mul-double v4, v31, v24

    .line 300
    double-to-float v4, v4

    .line 301
    .line 302
    .line 303
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 304
    move-result-wide v24

    .line 305
    .line 306
    move/from16 v40, v6

    .line 307
    .line 308
    mul-double v5, v31, v24

    .line 309
    double-to-float v5, v5

    .line 310
    .line 311
    cmpl-float v6, v13, v16

    .line 312
    .line 313
    if-nez v6, :cond_9

    .line 314
    .line 315
    cmpl-float v6, v15, v16

    .line 316
    .line 317
    if-nez v6, :cond_9

    .line 318
    .line 319
    iget-object v2, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 323
    .line 324
    move/from16 v38, v4

    .line 325
    .line 326
    move/from16 v39, v5

    .line 327
    .line 328
    move/from16 v24, v7

    .line 329
    .line 330
    move-wide/from16 v31, v8

    .line 331
    .line 332
    goto/16 :goto_d

    .line 333
    .line 334
    :cond_9
    move/from16 v24, v7

    .line 335
    float-to-double v6, v3

    .line 336
    .line 337
    move-wide/from16 v31, v8

    .line 338
    float-to-double v8, v2

    .line 339
    .line 340
    .line 341
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    .line 342
    move-result-wide v6

    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    const-wide v8, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 348
    sub-double/2addr v6, v8

    .line 349
    double-to-float v6, v6

    .line 350
    float-to-double v6, v6

    .line 351
    .line 352
    move-wide/from16 v33, v8

    .line 353
    .line 354
    .line 355
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 356
    move-result-wide v8

    .line 357
    double-to-float v8, v8

    .line 358
    .line 359
    .line 360
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 361
    move-result-wide v6

    .line 362
    double-to-float v6, v6

    .line 363
    move v9, v2

    .line 364
    move v7, v3

    .line 365
    float-to-double v2, v5

    .line 366
    .line 367
    move/from16 v39, v5

    .line 368
    .line 369
    move/from16 v25, v6

    .line 370
    float-to-double v5, v4

    .line 371
    .line 372
    .line 373
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 374
    move-result-wide v2

    .line 375
    .line 376
    sub-double v2, v2, v33

    .line 377
    double-to-float v2, v2

    .line 378
    float-to-double v2, v2

    .line 379
    .line 380
    .line 381
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 382
    move-result-wide v5

    .line 383
    double-to-float v5, v5

    .line 384
    .line 385
    .line 386
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 387
    move-result-wide v2

    .line 388
    double-to-float v2, v2

    .line 389
    .line 390
    if-eqz v21, :cond_a

    .line 391
    move v3, v13

    .line 392
    goto :goto_8

    .line 393
    :cond_a
    move v3, v15

    .line 394
    .line 395
    :goto_8
    if-eqz v21, :cond_b

    .line 396
    move v6, v15

    .line 397
    goto :goto_9

    .line 398
    :cond_b
    move v6, v13

    .line 399
    .line 400
    :goto_9
    if-eqz v21, :cond_c

    .line 401
    .line 402
    move/from16 v33, v12

    .line 403
    goto :goto_a

    .line 404
    .line 405
    :cond_c
    move/from16 v33, v11

    .line 406
    .line 407
    :goto_a
    if-eqz v21, :cond_d

    .line 408
    .line 409
    move/from16 v34, v11

    .line 410
    goto :goto_b

    .line 411
    .line 412
    :cond_d
    move/from16 v34, v12

    .line 413
    .line 414
    :goto_b
    mul-float v33, v33, v3

    .line 415
    .line 416
    .line 417
    const v3, 0x3ef4e26d    # 0.47829f

    .line 418
    .line 419
    mul-float v33, v33, v3

    .line 420
    .line 421
    mul-float v8, v8, v33

    .line 422
    .line 423
    mul-float v33, v33, v25

    .line 424
    .line 425
    mul-float v34, v34, v6

    .line 426
    .line 427
    mul-float v34, v34, v3

    .line 428
    .line 429
    mul-float v5, v5, v34

    .line 430
    .line 431
    mul-float v34, v34, v2

    .line 432
    .line 433
    if-eqz v17, :cond_f

    .line 434
    .line 435
    if-nez v26, :cond_e

    .line 436
    mul-float/2addr v8, v10

    .line 437
    .line 438
    mul-float v33, v33, v10

    .line 439
    goto :goto_c

    .line 440
    .line 441
    :cond_e
    sub-double v2, v22, v27

    .line 442
    .line 443
    cmpl-double v2, v29, v2

    .line 444
    .line 445
    if-nez v2, :cond_f

    .line 446
    mul-float/2addr v5, v10

    .line 447
    .line 448
    mul-float v34, v34, v10

    .line 449
    .line 450
    :cond_f
    :goto_c
    iget-object v2, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 451
    .line 452
    sub-float v3, v9, v8

    .line 453
    .line 454
    sub-float v35, v7, v33

    .line 455
    .line 456
    add-float v36, v4, v5

    .line 457
    .line 458
    add-float v37, v39, v34

    .line 459
    .line 460
    move-object/from16 v33, v2

    .line 461
    .line 462
    move/from16 v34, v3

    .line 463
    .line 464
    move/from16 v38, v4

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v33 .. v39}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 468
    :goto_d
    float-to-double v1, v1

    .line 469
    .line 470
    add-double v8, v31, v1

    .line 471
    .line 472
    xor-int/lit8 v21, v21, 0x1

    .line 473
    .line 474
    add-int/lit8 v1, v26, 0x1

    .line 475
    .line 476
    move/from16 v7, v24

    .line 477
    .line 478
    move/from16 v2, v38

    .line 479
    .line 480
    move/from16 v3, v39

    .line 481
    .line 482
    move/from16 v6, v40

    .line 483
    .line 484
    goto/16 :goto_4

    .line 485
    .line 486
    :cond_10
    iget-object v1, v0, Le1/n;->k:Lf1/a;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 490
    move-result-object v1

    .line 491
    .line 492
    check-cast v1, Landroid/graphics/PointF;

    .line 493
    .line 494
    iget-object v2, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 495
    .line 496
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 497
    .line 498
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->offset(FF)V

    .line 502
    .line 503
    iget-object v1, v0, Le1/n;->a:Landroid/graphics/Path;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 507
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
.end method
