.class public Lcom/facebook/cache/disk/c;
.super Ljava/lang/Object;
.source "DiskStorageCache.java"

# interfaces
.implements Lr3/e;
.implements Lt3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/cache/disk/c$c;,
        Lcom/facebook/cache/disk/c$b;
    }
.end annotation


# static fields
.field public static final r:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final s:J

.field public static final t:J


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/util/concurrent/CountDownLatch;

.field public d:J

.field public final e:Lcom/facebook/cache/common/CacheEventListener;

.field public final f:Ljava/util/Set;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:J

.field public final h:J

.field public final i:Lcom/facebook/common/statfs/StatFsHelper;

.field public final j:Lcom/facebook/cache/disk/b;

.field public final k:Lr3/d;

.field public final l:Lcom/facebook/cache/common/CacheErrorLogger;

.field public final m:Z

.field public final n:Lcom/facebook/cache/disk/c$b;

.field public final o:Lc4/a;

.field public final p:Ljava/lang/Object;

.field public q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const-class v0, Lcom/facebook/cache/disk/c;

    .line 3
    .line 4
    sput-object v0, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 5
    .line 6
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v1, 0x2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    sput-wide v0, Lcom/facebook/cache/disk/c;->s:J

    .line 15
    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v1, 0x1e

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    sput-wide v0, Lcom/facebook/cache/disk/c;->t:J

    .line 25
    return-void
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
.end method

.method public constructor <init>(Lcom/facebook/cache/disk/b;Lr3/d;Lcom/facebook/cache/disk/c$c;Lcom/facebook/cache/common/CacheEventListener;Lcom/facebook/cache/common/CacheErrorLogger;Lt3/b;Ljava/util/concurrent/Executor;Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iget-wide v0, p3, Lcom/facebook/cache/disk/c$c;->b:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/facebook/cache/disk/c;->a:J

    .line 15
    .line 16
    iget-wide v0, p3, Lcom/facebook/cache/disk/c$c;->c:J

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/facebook/cache/disk/c;->b:J

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/facebook/cache/disk/c;->d:J

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/facebook/common/statfs/StatFsHelper;->d()Lcom/facebook/common/statfs/StatFsHelper;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/facebook/cache/disk/c;->i:Lcom/facebook/common/statfs/StatFsHelper;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 29
    .line 30
    iput-object p2, p0, Lcom/facebook/cache/disk/c;->k:Lr3/d;

    .line 31
    .line 32
    const-wide/16 p1, -0x1

    .line 33
    .line 34
    iput-wide p1, p0, Lcom/facebook/cache/disk/c;->g:J

    .line 35
    .line 36
    iput-object p4, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 37
    .line 38
    iget-wide p1, p3, Lcom/facebook/cache/disk/c$c;->a:J

    .line 39
    .line 40
    iput-wide p1, p0, Lcom/facebook/cache/disk/c;->h:J

    .line 41
    .line 42
    iput-object p5, p0, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 43
    .line 44
    new-instance p1, Lcom/facebook/cache/disk/c$b;

    .line 45
    .line 46
    .line 47
    invoke-direct {p1}, Lcom/facebook/cache/disk/c$b;-><init>()V

    .line 48
    .line 49
    iput-object p1, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lc4/d;->a()Lc4/d;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    iput-object p1, p0, Lcom/facebook/cache/disk/c;->o:Lc4/a;

    .line 56
    .line 57
    iput-boolean p8, p0, Lcom/facebook/cache/disk/c;->m:Z

    .line 58
    .line 59
    new-instance p1, Ljava/util/HashSet;

    .line 60
    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 63
    .line 64
    iput-object p1, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 65
    .line 66
    if-eqz p6, :cond_0

    .line 67
    .line 68
    .line 69
    invoke-interface {p6, p0}, Lt3/b;->a(Lt3/a;)V

    .line 70
    .line 71
    :cond_0
    if-eqz p8, :cond_1

    .line 72
    .line 73
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 74
    const/4 p2, 0x1

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 78
    .line 79
    iput-object p1, p0, Lcom/facebook/cache/disk/c;->c:Ljava/util/concurrent/CountDownLatch;

    .line 80
    .line 81
    new-instance p1, Lcom/facebook/cache/disk/c$a;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, p0}, Lcom/facebook/cache/disk/c$a;-><init>(Lcom/facebook/cache/disk/c;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p7, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 88
    return-void

    .line 89
    .line 90
    :cond_1
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 91
    const/4 p2, 0x0

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 95
    .line 96
    iput-object p1, p0, Lcom/facebook/cache/disk/c;->c:Ljava/util/concurrent/CountDownLatch;

    .line 97
    return-void
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

.method public static bridge synthetic h(Lcom/facebook/cache/disk/c;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/cache/disk/c;->c:Ljava/util/concurrent/CountDownLatch;

    .line 3
    return-object p0
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
.end method

.method public static bridge synthetic i(Lcom/facebook/cache/disk/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    return-object p0
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
.end method

.method public static bridge synthetic j(Lcom/facebook/cache/disk/c;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/cache/disk/c;->q:Z

    .line 3
    return-void
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
.end method

.method public static bridge synthetic k(Lcom/facebook/cache/disk/c;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/cache/disk/c;->p()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Lcom/facebook/cache/disk/b;->a()V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lcom/facebook/cache/common/CacheEventListener;->d()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_2

    .line 24
    :catch_0
    move-exception v1

    .line 25
    goto :goto_0

    .line 26
    :catch_1
    move-exception v1

    .line 27
    .line 28
    :goto_0
    :try_start_1
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 29
    .line 30
    sget-object v3, Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;->EVICTION:Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;

    .line 31
    .line 32
    sget-object v4, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 33
    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    const-string v6, "clearAll: "

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    invoke-interface {v2, v3, v4, v5, v1}, Lcom/facebook/cache/common/CacheErrorLogger;->a(Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    :cond_0
    :goto_1
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/facebook/cache/disk/c$b;->e()V

    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
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

.method public b(Lq3/a;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 5
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-static {p1}, Lq3/b;->b(Lq3/a;)Ljava/util/List;

    .line 9
    move-result-object v3

    .line 10
    move v4, v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 14
    move-result v5

    .line 15
    .line 16
    if-ge v4, v5, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    move-result-object v5

    .line 21
    .line 22
    check-cast v5, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    :try_start_2
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v5, p1}, Lcom/facebook/cache/disk/b;->f(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    const/4 v1, 0x1

    .line 37
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    return v1

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 43
    move-object v1, v5

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v3

    .line 46
    move-object v5, v1

    .line 47
    move-object v1, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 50
    return v0

    .line 51
    :goto_1
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    :try_start_5
    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 53
    :catch_0
    move-exception v1

    .line 54
    goto :goto_2

    .line 55
    :catch_1
    move-exception v2

    .line 56
    move-object v5, v1

    .line 57
    move-object v1, v2

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-static {}, Lr3/f;->a()Lr3/f;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, p1}, Lr3/f;->d(Lq3/a;)Lr3/f;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v5}, Lr3/f;->j(Ljava/lang/String;)Lr3/f;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lr3/f;->h(Ljava/io/IOException;)Lr3/f;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-interface {v1, p1}, Lcom/facebook/cache/common/CacheEventListener;->a(Lcom/facebook/cache/common/a;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {p1}, Lr3/f;->b()V

    .line 84
    return v0
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
.end method

.method public c(Lq3/a;Lq3/f;)Lo3/a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lr3/f;->a()Lr3/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lr3/f;->d(Lq3/a;)Lr3/f;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v0}, Lcom/facebook/cache/common/CacheEventListener;->b(Lcom/facebook/cache/common/a;)V

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 18
    monitor-enter v1

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lq3/b;->a(Lq3/a;)Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lr3/f;->j(Ljava/lang/String;)Lr3/f;

    .line 27
    .line 28
    .line 29
    :try_start_1
    invoke-virtual {p0, v2, p1}, Lcom/facebook/cache/disk/c;->r(Ljava/lang/String;Lq3/a;)Lcom/facebook/cache/disk/b$b;

    .line 30
    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_2
    invoke-interface {v1, p2, p1}, Lcom/facebook/cache/disk/b$b;->b(Lq3/f;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1, p1, v2}, Lcom/facebook/cache/disk/c;->l(Lcom/facebook/cache/disk/b$b;Lq3/a;Ljava/lang/String;)Lo3/a;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Lo3/a;->size()J

    .line 41
    move-result-wide v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v3}, Lr3/f;->i(J)Lr3/f;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/facebook/cache/disk/c$b;->b()J

    .line 51
    move-result-wide v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v2, v3}, Lr3/f;->f(J)Lr3/f;

    .line 55
    .line 56
    iget-object p2, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-interface {p2, v0}, Lcom/facebook/cache/common/CacheEventListener;->f(Lcom/facebook/cache/common/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_0
    :try_start_3
    invoke-interface {v1}, Lcom/facebook/cache/disk/b$b;->cleanUp()Z

    .line 68
    move-result p2

    .line 69
    .line 70
    if-nez p2, :cond_2

    .line 71
    .line 72
    sget-object p2, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 73
    .line 74
    const-string v1, "Failed to delete temp file"

    .line 75
    .line 76
    .line 77
    invoke-static {p2, v1}, Lx3/a;->i(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    goto :goto_1

    .line 79
    :catchall_1
    move-exception p1

    .line 80
    goto :goto_4

    .line 81
    :catch_0
    move-exception p1

    .line 82
    goto :goto_3

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lr3/f;->b()V

    .line 86
    return-object p1

    .line 87
    .line 88
    .line 89
    :goto_2
    :try_start_4
    invoke-interface {v1}, Lcom/facebook/cache/disk/b$b;->cleanUp()Z

    .line 90
    move-result p2

    .line 91
    .line 92
    if-nez p2, :cond_3

    .line 93
    .line 94
    sget-object p2, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 95
    .line 96
    const-string v1, "Failed to delete temp file"

    .line 97
    .line 98
    .line 99
    invoke-static {p2, v1}, Lx3/a;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 100
    :cond_3
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 101
    .line 102
    .line 103
    :goto_3
    :try_start_5
    invoke-virtual {v0, p1}, Lr3/f;->h(Ljava/io/IOException;)Lr3/f;

    .line 104
    .line 105
    iget-object p2, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 106
    .line 107
    if-eqz p2, :cond_4

    .line 108
    .line 109
    .line 110
    invoke-interface {p2, v0}, Lcom/facebook/cache/common/CacheEventListener;->g(Lcom/facebook/cache/common/a;)V

    .line 111
    .line 112
    :cond_4
    sget-object p2, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 113
    .line 114
    const-string v1, "Failed inserting a file into the cache"

    .line 115
    .line 116
    .line 117
    invoke-static {p2, v1, p1}, Lx3/a;->j(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 119
    .line 120
    .line 121
    :goto_4
    invoke-virtual {v0}, Lr3/f;->b()V

    .line 122
    throw p1

    .line 123
    :catchall_2
    move-exception p1

    .line 124
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 125
    throw p1
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

.method public d(Lq3/a;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lq3/b;->b(Lq3/a;)Ljava/util/List;

    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    move-result v2

    .line 13
    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 23
    .line 24
    .line 25
    invoke-interface {v3, v2}, Lcom/facebook/cache/disk/b;->remove(Ljava/lang/String;)J

    .line 26
    .line 27
    iget-object v3, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    .line 38
    :try_start_1
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 39
    .line 40
    sget-object v2, Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;->DELETE_FILE:Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;

    .line 41
    .line 42
    sget-object v3, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 43
    .line 44
    new-instance v4, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    const-string v5, "delete: "

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    move-result-object v5

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v2, v3, v4, p1}, Lcom/facebook/cache/common/CacheErrorLogger;->a(Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    :cond_0
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
    .line 71
    .line 72
.end method

.method public e(Lq3/a;)Lo3/a;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lr3/f;->a()Lr3/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lr3/f;->d(Lq3/a;)Lr3/f;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    :try_start_0
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 12
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-static {p1}, Lq3/b;->b(Lq3/a;)Ljava/util/List;

    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v5, v1

    .line 19
    move-object v6, v5

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 23
    move-result v7

    .line 24
    .line 25
    if-ge v4, v7, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v5}, Lr3/f;->j(Ljava/lang/String;)Lr3/f;

    .line 35
    .line 36
    iget-object v6, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 37
    .line 38
    .line 39
    invoke-interface {v6, v5, p1}, Lcom/facebook/cache/disk/b;->g(Ljava/lang/String;Ljava/lang/Object;)Lo3/a;

    .line 40
    move-result-object v6

    .line 41
    .line 42
    if-eqz v6, :cond_0

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    :goto_1
    if-nez v6, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0}, Lcom/facebook/cache/common/CacheEventListener;->e(Lcom/facebook/cache/common/a;)V

    .line 58
    .line 59
    :cond_2
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 63
    goto :goto_2

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-static {v5}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0}, Lcom/facebook/cache/common/CacheEventListener;->h(Lcom/facebook/cache/common/a;)V

    .line 74
    .line 75
    :cond_4
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 79
    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lr3/f;->b()V

    .line 83
    return-object v6

    .line 84
    :goto_3
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 86
    :catchall_1
    move-exception p1

    .line 87
    goto :goto_4

    .line 88
    :catch_0
    move-exception p1

    .line 89
    .line 90
    :try_start_4
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 91
    .line 92
    sget-object v3, Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;->GENERIC_IO:Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;

    .line 93
    .line 94
    sget-object v4, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 95
    .line 96
    const-string v5, "getResource"

    .line 97
    .line 98
    .line 99
    invoke-interface {v2, v3, v4, v5, p1}, Lcom/facebook/cache/common/CacheErrorLogger;->a(Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Lr3/f;->h(Ljava/io/IOException;)Lr3/f;

    .line 103
    .line 104
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 105
    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, v0}, Lcom/facebook/cache/common/CacheEventListener;->a(Lcom/facebook/cache/common/a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 110
    .line 111
    .line 112
    :cond_5
    invoke-virtual {v0}, Lr3/f;->b()V

    .line 113
    return-object v1

    .line 114
    .line 115
    .line 116
    :goto_4
    invoke-virtual {v0}, Lr3/f;->b()V

    .line 117
    throw p1
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
.end method

.method public f(Lq3/a;)Z
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/cache/disk/c;->g(Lq3/a;)Z

    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return v2

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-static {p1}, Lq3/b;->b(Lq3/a;)Ljava/util/List;

    .line 19
    move-result-object v3

    .line 20
    move v4, v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    move-result v5

    .line 25
    .line 26
    if-ge v4, v5, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    move-result-object v5

    .line 31
    .line 32
    check-cast v5, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v6, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 35
    .line 36
    .line 37
    invoke-interface {v6, v5, p1}, Lcom/facebook/cache/disk/b;->d(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 38
    move-result v6

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :try_start_2
    monitor-exit v0

    .line 47
    return v2

    .line 48
    .line 49
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    monitor-exit v0

    .line 52
    return v1

    .line 53
    :catch_0
    monitor-exit v0

    .line 54
    return v1

    .line 55
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    throw p1
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
.end method

.method public g(Lq3/a;)Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lq3/b;->b(Lq3/a;)Ljava/util/List;

    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    move-result v3

    .line 14
    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    const/4 p1, 0x1

    .line 31
    monitor-exit v0

    .line 32
    return p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return v1

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p1
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
.end method

.method public final l(Lcom/facebook/cache/disk/b$b;Lq3/a;Ljava/lang/String;)Lo3/a;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1, p2}, Lcom/facebook/cache/disk/b$b;->a(Ljava/lang/Object;)Lo3/a;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iget-object p2, p0, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    iget-object p2, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lo3/a;->size()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    const-wide/16 v3, 0x1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v1, v2, v3, v4}, Lcom/facebook/cache/disk/c$b;->c(JJ)V

    .line 24
    monitor-exit v0

    .line 25
    return-object p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
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
.end method

.method public final m(JLcom/facebook/cache/common/CacheEventListener$EvictionReason;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-wide/from16 v2, p1

    .line 5
    .line 6
    :try_start_0
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/cache/disk/b;->getEntries()Ljava/util/Collection;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/facebook/cache/disk/c;->n(Ljava/util/Collection;)Ljava/util/Collection;

    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/facebook/cache/disk/c$b;->b()J

    .line 20
    move-result-wide v4

    .line 21
    .line 22
    sub-long v6, v4, v2

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 26
    move-result-object v0

    .line 27
    const/4 v10, 0x0

    .line 28
    .line 29
    const-wide/16 v11, 0x0

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v13

    .line 34
    .line 35
    if-eqz v13, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v13

    .line 40
    .line 41
    check-cast v13, Lcom/facebook/cache/disk/b$a;

    .line 42
    .line 43
    cmp-long v14, v11, v6

    .line 44
    .line 45
    if-lez v14, :cond_0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_0
    iget-object v14, v1, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 49
    .line 50
    .line 51
    invoke-interface {v14, v13}, Lcom/facebook/cache/disk/b;->b(Lcom/facebook/cache/disk/b$a;)J

    .line 52
    move-result-wide v14

    .line 53
    .line 54
    const-wide/16 v16, 0x0

    .line 55
    .line 56
    iget-object v8, v1, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    invoke-interface {v13}, Lcom/facebook/cache/disk/b$a;->getId()Ljava/lang/String;

    .line 60
    move-result-object v9

    .line 61
    .line 62
    .line 63
    invoke-interface {v8, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 64
    .line 65
    cmp-long v8, v14, v16

    .line 66
    .line 67
    if-lez v8, :cond_2

    .line 68
    .line 69
    add-int/lit8 v10, v10, 0x1

    .line 70
    add-long/2addr v11, v14

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lr3/f;->a()Lr3/f;

    .line 74
    move-result-object v8

    .line 75
    .line 76
    .line 77
    invoke-interface {v13}, Lcom/facebook/cache/disk/b$a;->getId()Ljava/lang/String;

    .line 78
    move-result-object v9

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v9}, Lr3/f;->j(Ljava/lang/String;)Lr3/f;

    .line 82
    move-result-object v8

    .line 83
    .line 84
    move-object/from16 v9, p3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8, v9}, Lr3/f;->g(Lcom/facebook/cache/common/CacheEventListener$EvictionReason;)Lr3/f;

    .line 88
    move-result-object v8

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v14, v15}, Lr3/f;->i(J)Lr3/f;

    .line 92
    move-result-object v8

    .line 93
    .line 94
    sub-long v13, v4, v11

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8, v13, v14}, Lr3/f;->f(J)Lr3/f;

    .line 98
    move-result-object v8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v2, v3}, Lr3/f;->e(J)Lr3/f;

    .line 102
    move-result-object v8

    .line 103
    .line 104
    iget-object v13, v1, Lcom/facebook/cache/disk/c;->e:Lcom/facebook/cache/common/CacheEventListener;

    .line 105
    .line 106
    if-eqz v13, :cond_1

    .line 107
    .line 108
    .line 109
    invoke-interface {v13, v8}, Lcom/facebook/cache/common/CacheEventListener;->c(Lcom/facebook/cache/common/a;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {v8}, Lr3/f;->b()V

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_2
    move-object/from16 v9, p3

    .line 116
    goto :goto_0

    .line 117
    .line 118
    :cond_3
    :goto_1
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 119
    neg-long v2, v11

    .line 120
    neg-int v4, v10

    .line 121
    int-to-long v4, v4

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/facebook/cache/disk/c$b;->c(JJ)V

    .line 125
    .line 126
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 127
    .line 128
    .line 129
    invoke-interface {v0}, Lcom/facebook/cache/disk/b;->e()V

    .line 130
    return-void

    .line 131
    :catch_0
    move-exception v0

    .line 132
    .line 133
    iget-object v2, v1, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 134
    .line 135
    sget-object v3, Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;->EVICTION:Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;

    .line 136
    .line 137
    sget-object v4, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 138
    .line 139
    new-instance v5, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    const-string v6, "evictAboveSize: "

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 151
    move-result-object v6

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    move-result-object v5

    .line 159
    .line 160
    .line 161
    invoke-interface {v2, v3, v4, v5, v0}, Lcom/facebook/cache/common/CacheErrorLogger;->a(Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    throw v0
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

.method public final n(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/facebook/cache/disk/b$a;",
            ">;)",
            "Ljava/util/Collection<",
            "Lcom/facebook/cache/disk/b$a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->o:Lc4/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/a;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    sget-wide v2, Lcom/facebook/cache/disk/c;->s:J

    .line 9
    add-long/2addr v0, v2

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 15
    move-result v3

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 24
    move-result v4

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v4

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    check-cast v4, Lcom/facebook/cache/disk/b$a;

    .line 44
    .line 45
    .line 46
    invoke-interface {v4}, Lcom/facebook/cache/disk/b$a;->getTimestamp()J

    .line 47
    move-result-wide v5

    .line 48
    .line 49
    cmp-long v5, v5, v0

    .line 50
    .line 51
    if-lez v5, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_1
    iget-object p1, p0, Lcom/facebook/cache/disk/c;->k:Lr3/d;

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Lr3/d;->get()Lcom/facebook/cache/disk/e;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-static {v3, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 72
    return-object v2
.end method

.method public final o()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->p:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/cache/disk/c;->p()Z

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/cache/disk/c;->s()V

    .line 11
    .line 12
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/facebook/cache/disk/c$b;->b()J

    .line 16
    move-result-wide v2

    .line 17
    .line 18
    iget-wide v4, p0, Lcom/facebook/cache/disk/c;->d:J

    .line 19
    .line 20
    cmp-long v4, v2, v4

    .line 21
    .line 22
    if-lez v4, :cond_0

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/facebook/cache/disk/c$b;->e()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/cache/disk/c;->p()Z

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_0
    :goto_0
    iget-wide v4, p0, Lcom/facebook/cache/disk/c;->d:J

    .line 38
    .line 39
    cmp-long v1, v2, v4

    .line 40
    .line 41
    if-lez v1, :cond_1

    .line 42
    .line 43
    const-wide/16 v1, 0x9

    .line 44
    mul-long/2addr v4, v1

    .line 45
    .line 46
    const-wide/16 v1, 0xa

    .line 47
    div-long/2addr v4, v1

    .line 48
    .line 49
    sget-object v1, Lcom/facebook/cache/common/CacheEventListener$EvictionReason;->CACHE_FULL:Lcom/facebook/cache/common/CacheEventListener$EvictionReason;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v4, v5, v1}, Lcom/facebook/cache/disk/c;->m(JLcom/facebook/cache/common/CacheEventListener$EvictionReason;)V

    .line 53
    :cond_1
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    throw v1
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
.end method

.method public final p()Z
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->o:Lc4/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/a;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/facebook/cache/disk/c$b;->d()Z

    .line 12
    move-result v2

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    iget-wide v2, p0, Lcom/facebook/cache/disk/c;->g:J

    .line 17
    .line 18
    const-wide/16 v4, -0x1

    .line 19
    .line 20
    cmp-long v4, v2, v4

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    sub-long/2addr v0, v2

    .line 24
    .line 25
    sget-wide v2, Lcom/facebook/cache/disk/c;->t:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-lez v0, :cond_0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/cache/disk/c;->q()Z

    .line 36
    move-result v0

    .line 37
    return v0
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
.end method

.method public final q()Z
    .locals 24

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->o:Lc4/a;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lc4/a;->now()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    sget-wide v4, Lcom/facebook/cache/disk/c;->s:J

    .line 11
    add-long/2addr v4, v2

    .line 12
    .line 13
    iget-boolean v0, v1, Lcom/facebook/cache/disk/c;->m:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-boolean v0, v1, Lcom/facebook/cache/disk/c;->m:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashSet;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    .line 39
    :goto_0
    :try_start_0
    iget-object v8, v1, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 40
    .line 41
    .line 42
    invoke-interface {v8}, Lcom/facebook/cache/disk/b;->getEntries()Ljava/util/Collection;

    .line 43
    move-result-object v8

    .line 44
    .line 45
    .line 46
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 47
    move-result-object v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 48
    .line 49
    const-wide/16 v9, 0x0

    .line 50
    .line 51
    const-wide/16 v11, -0x1

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v13, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    .line 60
    :goto_1
    :try_start_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v17

    .line 62
    .line 63
    const/16 v18, 0x1

    .line 64
    .line 65
    if-eqz v17, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    move-result-object v17

    .line 70
    .line 71
    check-cast v17, Lcom/facebook/cache/disk/b$a;

    .line 72
    .line 73
    add-int/lit8 v14, v14, 0x1

    .line 74
    .line 75
    .line 76
    invoke-interface/range {v17 .. v17}, Lcom/facebook/cache/disk/b$a;->getSize()J

    .line 77
    move-result-wide v19

    .line 78
    .line 79
    add-long v9, v9, v19

    .line 80
    .line 81
    .line 82
    invoke-interface/range {v17 .. v17}, Lcom/facebook/cache/disk/b$a;->getTimestamp()J

    .line 83
    move-result-wide v19

    .line 84
    .line 85
    cmp-long v19, v19, v4

    .line 86
    .line 87
    if-lez v19, :cond_2

    .line 88
    .line 89
    add-int/lit8 v15, v15, 0x1

    .line 90
    int-to-long v6, v7

    .line 91
    .line 92
    .line 93
    invoke-interface/range {v17 .. v17}, Lcom/facebook/cache/disk/b$a;->getSize()J

    .line 94
    move-result-wide v20

    .line 95
    .line 96
    add-long v6, v6, v20

    .line 97
    long-to-int v7, v6

    .line 98
    .line 99
    .line 100
    invoke-interface/range {v17 .. v17}, Lcom/facebook/cache/disk/b$a;->getTimestamp()J

    .line 101
    move-result-wide v20

    .line 102
    .line 103
    move-wide/from16 v22, v4

    .line 104
    .line 105
    sub-long v4, v20, v2

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 109
    move-result-wide v4

    .line 110
    move-wide v11, v4

    .line 111
    .line 112
    move/from16 v13, v18

    .line 113
    goto :goto_2

    .line 114
    :catch_0
    move-exception v0

    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_2
    move-wide/from16 v22, v4

    .line 119
    .line 120
    iget-boolean v4, v1, Lcom/facebook/cache/disk/c;->m:Z

    .line 121
    .line 122
    if-eqz v4, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-interface/range {v17 .. v17}, Lcom/facebook/cache/disk/b$a;->getId()Ljava/lang/String;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    .line 132
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    :cond_3
    :goto_2
    move-wide/from16 v4, v22

    .line 135
    goto :goto_1

    .line 136
    .line 137
    :cond_4
    if-eqz v13, :cond_5

    .line 138
    .line 139
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 140
    .line 141
    sget-object v5, Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;->READ_INVALID_ENTRY:Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;

    .line 142
    .line 143
    sget-object v6, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 144
    .line 145
    new-instance v8, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    const-string v13, "Future timestamp found in "

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v13, " files , with a total size of "

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v7, " bytes, and a maximum time delta of "

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v7, "ms"

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    move-result-object v7

    .line 182
    const/4 v8, 0x0

    .line 183
    .line 184
    .line 185
    invoke-interface {v4, v5, v6, v7, v8}, Lcom/facebook/cache/common/CacheErrorLogger;->a(Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    :cond_5
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Lcom/facebook/cache/disk/c$b;->a()J

    .line 191
    move-result-wide v4

    .line 192
    int-to-long v6, v14

    .line 193
    .line 194
    cmp-long v4, v4, v6

    .line 195
    .line 196
    if-nez v4, :cond_6

    .line 197
    .line 198
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Lcom/facebook/cache/disk/c$b;->b()J

    .line 202
    move-result-wide v4

    .line 203
    .line 204
    cmp-long v4, v4, v9

    .line 205
    .line 206
    if-eqz v4, :cond_8

    .line 207
    .line 208
    :cond_6
    iget-boolean v4, v1, Lcom/facebook/cache/disk/c;->m:Z

    .line 209
    .line 210
    if-eqz v4, :cond_7

    .line 211
    .line 212
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 213
    .line 214
    if-eq v4, v0, :cond_7

    .line 215
    .line 216
    .line 217
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 220
    .line 221
    .line 222
    invoke-interface {v4}, Ljava/util/Set;->clear()V

    .line 223
    .line 224
    iget-object v4, v1, Lcom/facebook/cache/disk/c;->f:Ljava/util/Set;

    .line 225
    .line 226
    .line 227
    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 228
    .line 229
    :cond_7
    iget-object v0, v1, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v9, v10, v6, v7}, Lcom/facebook/cache/disk/c$b;->f(JJ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 233
    .line 234
    :cond_8
    iput-wide v2, v1, Lcom/facebook/cache/disk/c;->g:J

    .line 235
    return v18

    .line 236
    :catch_1
    move-exception v0

    .line 237
    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    :goto_3
    iget-object v2, v1, Lcom/facebook/cache/disk/c;->l:Lcom/facebook/cache/common/CacheErrorLogger;

    .line 241
    .line 242
    sget-object v3, Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;->GENERIC_IO:Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;

    .line 243
    .line 244
    sget-object v4, Lcom/facebook/cache/disk/c;->r:Ljava/lang/Class;

    .line 245
    .line 246
    new-instance v5, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    const-string v6, "calcFileCacheSize: "

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 258
    move-result-object v6

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    move-result-object v5

    .line 266
    .line 267
    .line 268
    invoke-interface {v2, v3, v4, v5, v0}, Lcom/facebook/cache/common/CacheErrorLogger;->a(Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    return v16
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
.end method

.method public final r(Ljava/lang/String;Lq3/a;)Lcom/facebook/cache/disk/b$b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/cache/disk/c;->o()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Lcom/facebook/cache/disk/b;->c(Ljava/lang/String;Ljava/lang/Object;)Lcom/facebook/cache/disk/b$b;

    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method public final s()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c;->j:Lcom/facebook/cache/disk/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/cache/disk/b;->isExternal()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/facebook/common/statfs/StatFsHelper$StorageType;->EXTERNAL:Lcom/facebook/common/statfs/StatFsHelper$StorageType;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/facebook/common/statfs/StatFsHelper$StorageType;->INTERNAL:Lcom/facebook/common/statfs/StatFsHelper$StorageType;

    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, Lcom/facebook/cache/disk/c;->i:Lcom/facebook/common/statfs/StatFsHelper;

    .line 16
    .line 17
    iget-wide v2, p0, Lcom/facebook/cache/disk/c;->b:J

    .line 18
    .line 19
    iget-object v4, p0, Lcom/facebook/cache/disk/c;->n:Lcom/facebook/cache/disk/c$b;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/facebook/cache/disk/c$b;->b()J

    .line 23
    move-result-wide v4

    .line 24
    sub-long/2addr v2, v4

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/common/statfs/StatFsHelper;->f(Lcom/facebook/common/statfs/StatFsHelper$StorageType;J)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-wide v0, p0, Lcom/facebook/cache/disk/c;->a:J

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/facebook/cache/disk/c;->d:J

    .line 35
    return-void

    .line 36
    .line 37
    :cond_1
    iget-wide v0, p0, Lcom/facebook/cache/disk/c;->b:J

    .line 38
    .line 39
    iput-wide v0, p0, Lcom/facebook/cache/disk/c;->d:J

    .line 40
    return-void
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
.end method
