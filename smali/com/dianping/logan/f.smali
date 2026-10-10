.class public Lcom/dianping/logan/f;
.super Ljava/lang/Thread;
.source "LoganThread.java"


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public volatile d:Z

.field public e:J

.field public volatile f:Z

.field public g:Ljava/io/File;

.field public h:Z

.field public i:J

.field public j:Lcom/dianping/logan/d;

.field public k:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/dianping/logan/LoganModel;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:J

.field public o:J

.field public p:J

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:I

.field public t:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/dianping/logan/LoganModel;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/dianping/logan/LoganModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/dianping/logan/f;->b:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/dianping/logan/f;->c:Ljava/lang/Object;

    .line 18
    const/4 v0, 0x1

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/dianping/logan/f;->d:Z

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/dianping/logan/f;->t:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/dianping/logan/f;->k:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/dianping/logan/f;->l:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 34
    .line 35
    iput-wide p4, p0, Lcom/dianping/logan/f;->n:J

    .line 36
    .line 37
    iput-wide p6, p0, Lcom/dianping/logan/f;->o:J

    .line 38
    .line 39
    iput-wide p8, p0, Lcom/dianping/logan/f;->p:J

    .line 40
    .line 41
    iput-object p10, p0, Lcom/dianping/logan/f;->q:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p11, p0, Lcom/dianping/logan/f;->r:Ljava/lang/String;

    .line 44
    return-void
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
.end method

.method public static synthetic a(Lcom/dianping/logan/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/dianping/logan/f;->c:Ljava/lang/Object;

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic b(Lcom/dianping/logan/f;I)I
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/dianping/logan/f;->s:I

    .line 3
    return p1
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
.end method

.method public static synthetic c(Lcom/dianping/logan/f;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/dianping/logan/f;->t:Ljava/util/concurrent/ConcurrentLinkedQueue;

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic d(Lcom/dianping/logan/f;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/dianping/logan/f;->k:Ljava/util/concurrent/ConcurrentLinkedQueue;

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public final e(Lcom/dianping/logan/LoganModel;)V
    .locals 8

    .line 1
    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/dianping/logan/LoganModel;->a()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/dianping/logan/d;->g()Lcom/dianping/logan/d;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 20
    .line 21
    new-instance v1, Lcom/dianping/logan/f$a;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/dianping/logan/f$a;-><init>(Lcom/dianping/logan/f;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/dianping/logan/d;->f(Lcom/dianping/logan/g;)V

    .line 28
    .line 29
    iget-object v2, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/dianping/logan/f;->l:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 34
    .line 35
    iget-wide v0, p0, Lcom/dianping/logan/f;->o:J

    .line 36
    long-to-int v5, v0

    .line 37
    .line 38
    iget-object v6, p0, Lcom/dianping/logan/f;->q:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v7, p0, Lcom/dianping/logan/f;->r:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual/range {v2 .. v7}, Lcom/dianping/logan/d;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 46
    .line 47
    sget-boolean v1, Lcom/dianping/logan/a;->c:Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/dianping/logan/d;->e(Z)V

    .line 51
    .line 52
    :cond_1
    iget-object v0, p1, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 53
    .line 54
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->WRITE:Lcom/dianping/logan/LoganModel$Action;

    .line 55
    .line 56
    if-ne v0, v1, :cond_2

    .line 57
    .line 58
    iget-object p1, p1, Lcom/dianping/logan/LoganModel;->b:Lcom/dianping/logan/k;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/dianping/logan/f;->j(Lcom/dianping/logan/k;)V

    .line 62
    return-void

    .line 63
    .line 64
    :cond_2
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->SEND:Lcom/dianping/logan/LoganModel$Action;

    .line 65
    .line 66
    if-ne v0, v1, :cond_4

    .line 67
    .line 68
    iget-object v0, p1, Lcom/dianping/logan/LoganModel;->c:Lcom/dianping/logan/h;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/dianping/logan/h;->d:Lcom/dianping/logan/i;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v1, p0, Lcom/dianping/logan/f;->c:Ljava/lang/Object;

    .line 75
    monitor-enter v1

    .line 76
    .line 77
    :try_start_0
    iget v0, p0, Lcom/dianping/logan/f;->s:I

    .line 78
    .line 79
    const/16 v2, 0x2711

    .line 80
    .line 81
    if-ne v0, v2, :cond_3

    .line 82
    .line 83
    iget-object v0, p0, Lcom/dianping/logan/f;->t:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto :goto_1

    .line 91
    .line 92
    :cond_3
    iget-object p1, p1, Lcom/dianping/logan/LoganModel;->c:Lcom/dianping/logan/h;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lcom/dianping/logan/f;->i(Lcom/dianping/logan/h;)V

    .line 96
    :goto_0
    monitor-exit v1

    .line 97
    return-void

    .line 98
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    throw p1

    .line 100
    .line 101
    :cond_4
    sget-object p1, Lcom/dianping/logan/LoganModel$Action;->FLUSH:Lcom/dianping/logan/LoganModel$Action;

    .line 102
    .line 103
    if-ne v0, p1, :cond_5

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/dianping/logan/f;->h()V

    .line 107
    :cond_5
    :goto_2
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 5
    .line 6
    new-instance v3, Ljava/io/File;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    .line 14
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 15
    .line 16
    new-instance v3, Ljava/io/File;

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    const/16 p2, 0x400

    .line 25
    .line 26
    :try_start_2
    new-array p2, p2, [B

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v2, p2}, Ljava/io/FileInputStream;->read([B)I

    .line 30
    move-result v1

    .line 31
    .line 32
    if-ltz v1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2, v0, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p2

    .line 41
    :goto_1
    move-object v1, v2

    .line 42
    .line 43
    goto/16 :goto_b

    .line 44
    :catch_0
    move-exception p2

    .line 45
    :goto_2
    move-object v1, v2

    .line 46
    goto :goto_6

    .line 47
    :catch_1
    move-exception p2

    .line 48
    :goto_3
    move-object v1, v2

    .line 49
    goto :goto_8

    .line 50
    .line 51
    .line 52
    :cond_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 53
    goto :goto_4

    .line 54
    :catch_2
    move-exception p2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    :goto_4
    :try_start_4
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 61
    goto :goto_5

    .line 62
    :catch_3
    move-exception p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    :goto_5
    const/4 v0, 0x1

    .line 67
    goto :goto_a

    .line 68
    :catchall_1
    move-exception p2

    .line 69
    move-object p1, v1

    .line 70
    goto :goto_1

    .line 71
    :catch_4
    move-exception p2

    .line 72
    move-object p1, v1

    .line 73
    goto :goto_2

    .line 74
    :catch_5
    move-exception p2

    .line 75
    move-object p1, v1

    .line 76
    goto :goto_3

    .line 77
    :catchall_2
    move-exception p2

    .line 78
    move-object p1, v1

    .line 79
    goto :goto_b

    .line 80
    :catch_6
    move-exception p2

    .line 81
    move-object p1, v1

    .line 82
    goto :goto_6

    .line 83
    :catch_7
    move-exception p2

    .line 84
    move-object p1, v1

    .line 85
    goto :goto_8

    .line 86
    .line 87
    .line 88
    :goto_6
    :try_start_5
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 89
    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    .line 93
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8

    .line 94
    goto :goto_7

    .line 95
    :catch_8
    move-exception p2

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    :cond_1
    :goto_7
    if-eqz p1, :cond_3

    .line 101
    .line 102
    .line 103
    :try_start_7
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_9

    .line 104
    goto :goto_a

    .line 105
    :catch_9
    move-exception p1

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 109
    goto :goto_a

    .line 110
    :catchall_3
    move-exception p2

    .line 111
    goto :goto_b

    .line 112
    .line 113
    .line 114
    :goto_8
    :try_start_8
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 115
    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    .line 119
    :try_start_9
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a

    .line 120
    goto :goto_9

    .line 121
    :catch_a
    move-exception p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    :cond_2
    :goto_9
    if-eqz p1, :cond_3

    .line 127
    .line 128
    .line 129
    :try_start_a
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    .line 130
    :cond_3
    :goto_a
    return v0

    .line 131
    .line 132
    :goto_b
    if-eqz v1, :cond_4

    .line 133
    .line 134
    .line 135
    :try_start_b
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    .line 136
    goto :goto_c

    .line 137
    :catch_b
    move-exception v0

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 141
    .line 142
    :cond_4
    :goto_c
    if-eqz p1, :cond_5

    .line 143
    .line 144
    .line 145
    :try_start_c
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    .line 146
    goto :goto_d

    .line 147
    :catch_c
    move-exception p1

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 151
    :cond_5
    :goto_d
    throw p2
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
.end method

.method public final g(J)V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    array-length v1, v0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    .line 24
    :goto_0
    if-ge v3, v1, :cond_2

    .line 25
    .line 26
    aget-object v4, v0, v3

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v5

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_0
    const-string v5, "\\."

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 39
    move-result-object v5

    .line 40
    array-length v6, v5

    .line 41
    .line 42
    if-lez v6, :cond_1

    .line 43
    .line 44
    aget-object v6, v5, v2

    .line 45
    .line 46
    .line 47
    invoke-static {v6}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 52
    move-result-wide v6

    .line 53
    .line 54
    cmp-long v6, v6, p1

    .line 55
    .line 56
    if-gtz v6, :cond_1

    .line 57
    array-length v5, v5

    .line 58
    const/4 v6, 0x1

    .line 59
    .line 60
    if-ne v5, v6, :cond_1

    .line 61
    .line 62
    new-instance v5, Ljava/io/File;

    .line 63
    .line 64
    iget-object v6, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    goto :goto_1

    .line 72
    :catch_0
    move-exception v4

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    return-void
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
.end method

.method public final h()V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/dianping/logan/a;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "LoganThread"

    .line 7
    .line 8
    const-string v1, "Logan flush start"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/dianping/logan/d;->a()V

    .line 19
    :cond_1
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public final i(Lcom/dianping/logan/h;)V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/dianping/logan/a;->c:Z

    .line 3
    .line 4
    const-string v1, "LoganThread"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Logan send start"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    if-eqz p1, :cond_4

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/dianping/logan/h;->a()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Lcom/dianping/logan/f;->o(Lcom/dianping/logan/h;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    sget-boolean p1, Lcom/dianping/logan/a;->c:Z

    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    const-string p1, "Logan prepare log file failed, can\'t find log file"

    .line 41
    .line 42
    .line 43
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    return-void

    .line 45
    .line 46
    :cond_2
    iget-object v0, p1, Lcom/dianping/logan/h;->d:Lcom/dianping/logan/i;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lcom/dianping/logan/i;->c(Lcom/dianping/logan/h;)V

    .line 50
    .line 51
    iget-object v0, p1, Lcom/dianping/logan/h;->d:Lcom/dianping/logan/i;

    .line 52
    .line 53
    new-instance v1, Lcom/dianping/logan/f$b;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/dianping/logan/f$b;-><init>(Lcom/dianping/logan/f;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/dianping/logan/i;->setCallBackListener(Lcom/dianping/logan/i$a;)V

    .line 60
    .line 61
    const/16 v0, 0x2711

    .line 62
    .line 63
    iput v0, p0, Lcom/dianping/logan/f;->s:I

    .line 64
    .line 65
    iget-object v0, p0, Lcom/dianping/logan/f;->u:Ljava/util/concurrent/ExecutorService;

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    new-instance v0, Lcom/dianping/logan/f$c;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, p0}, Lcom/dianping/logan/f$c;-><init>(Lcom/dianping/logan/f;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    iput-object v0, p0, Lcom/dianping/logan/f;->u:Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, Lcom/dianping/logan/f;->u:Ljava/util/concurrent/ExecutorService;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/dianping/logan/h;->d:Lcom/dianping/logan/i;

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 86
    :cond_4
    :goto_0
    return-void
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
.end method

.method public final j(Lcom/dianping/logan/k;)V
    .locals 10

    .line 1
    .line 2
    sget-boolean v0, Lcom/dianping/logan/a;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "LoganThread"

    .line 7
    .line 8
    const-string v1, "Logan write start"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/dianping/logan/f;->g:Ljava/io/File;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/dianping/logan/f;->g:Ljava/io/File;

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/dianping/logan/f;->l()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/dianping/logan/j;->a()J

    .line 34
    move-result-wide v0

    .line 35
    .line 36
    iget-wide v2, p0, Lcom/dianping/logan/f;->n:J

    .line 37
    .line 38
    sub-long v2, v0, v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v2, v3}, Lcom/dianping/logan/f;->g(J)V

    .line 42
    .line 43
    iput-wide v0, p0, Lcom/dianping/logan/f;->e:J

    .line 44
    .line 45
    iget-object v2, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Lcom/dianping/logan/d;->d(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    move-result-wide v0

    .line 57
    .line 58
    iget-wide v2, p0, Lcom/dianping/logan/f;->i:J

    .line 59
    sub-long/2addr v0, v2

    .line 60
    .line 61
    .line 62
    const-wide/32 v2, 0xea60

    .line 63
    .line 64
    cmp-long v0, v0, v2

    .line 65
    .line 66
    if-lez v0, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/dianping/logan/f;->k()Z

    .line 70
    move-result v0

    .line 71
    .line 72
    iput-boolean v0, p0, Lcom/dianping/logan/f;->h:Z

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    move-result-wide v0

    .line 77
    .line 78
    iput-wide v0, p0, Lcom/dianping/logan/f;->i:J

    .line 79
    .line 80
    iget-boolean v0, p0, Lcom/dianping/logan/f;->h:Z

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    return-void

    .line 84
    .line 85
    :cond_4
    iget-object v1, p0, Lcom/dianping/logan/f;->j:Lcom/dianping/logan/d;

    .line 86
    .line 87
    iget v2, p1, Lcom/dianping/logan/k;->f:I

    .line 88
    .line 89
    iget-object v3, p1, Lcom/dianping/logan/k;->a:Ljava/lang/String;

    .line 90
    .line 91
    iget-wide v4, p1, Lcom/dianping/logan/k;->e:J

    .line 92
    .line 93
    iget-object v6, p1, Lcom/dianping/logan/k;->d:Ljava/lang/String;

    .line 94
    .line 95
    iget-wide v7, p1, Lcom/dianping/logan/k;->c:J

    .line 96
    .line 97
    iget-boolean v9, p1, Lcom/dianping/logan/k;->b:Z

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v1 .. v9}, Lcom/dianping/logan/d;->c(ILjava/lang/String;JLjava/lang/String;JZ)V

    .line 101
    return-void
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
.end method

.method public final k()Z
    .locals 5

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroid/os/StatFs;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    .line 11
    move-result v1

    .line 12
    int-to-long v1, v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    .line 16
    move-result v0

    .line 17
    int-to-long v3, v0

    .line 18
    mul-long/2addr v3, v1

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/dianping/logan/f;->p:J
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    cmp-long v0, v3, v0

    .line 23
    .line 24
    if-lez v0, :cond_0

    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
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
.end method

.method public final l()Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/dianping/logan/f;->e:J

    .line 7
    .line 8
    cmp-long v4, v2, v0

    .line 9
    .line 10
    if-gez v4, :cond_0

    .line 11
    .line 12
    .line 13
    const-wide/32 v4, 0x5265c00

    .line 14
    add-long/2addr v2, v4

    .line 15
    .line 16
    cmp-long v0, v2, v0

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final m(Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    iget-object v3, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 47
    move-result p1

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    return v1
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
.end method

.method public n()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/dianping/logan/f;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/dianping/logan/f;->b:Ljava/lang/Object;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/dianping/logan/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final o(Lcom/dianping/logan/h;)Z
    .locals 5

    .line 1
    .line 2
    sget-boolean v0, Lcom/dianping/logan/a;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "LoganThread"

    .line 7
    .line 8
    const-string v1, "prepare log file"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    :cond_0
    iget-object v0, p1, Lcom/dianping/logan/h;->b:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/dianping/logan/f;->m(Ljava/lang/String;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    iget-object v1, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    iget-object v2, p1, Lcom/dianping/logan/h;->b:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    iget-object v2, p1, Lcom/dianping/logan/h;->b:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/dianping/logan/j;->a()J

    .line 49
    move-result-wide v3

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result v2

    .line 58
    const/4 v3, 0x1

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/dianping/logan/f;->h()V

    .line 64
    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    iget-object v4, p0, Lcom/dianping/logan/f;->m:Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    iget-object v1, p1, Lcom/dianping/logan/h;->b:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v1, ".copy"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, Lcom/dianping/logan/f;->f(Ljava/lang/String;Ljava/lang/String;)Z

    .line 94
    move-result v0

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    iput-object v1, p1, Lcom/dianping/logan/h;->c:Ljava/lang/String;

    .line 99
    return v3

    .line 100
    .line 101
    :cond_1
    iput-object v0, p1, Lcom/dianping/logan/h;->c:Ljava/lang/String;

    .line 102
    return v3

    .line 103
    .line 104
    :cond_2
    const-string v0, ""

    .line 105
    .line 106
    iput-object v0, p1, Lcom/dianping/logan/h;->c:Ljava/lang/String;

    .line 107
    :cond_3
    const/4 p1, 0x0

    .line 108
    return p1
    .line 109
    .line 110
    .line 111
.end method

.method public run()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 4
    .line 5
    :goto_0
    iget-boolean v0, p0, Lcom/dianping/logan/f;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/dianping/logan/f;->b:Ljava/lang/Object;

    .line 10
    monitor-enter v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    :try_start_0
    iput-boolean v1, p0, Lcom/dianping/logan/f;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    :try_start_1
    iget-object v3, p0, Lcom/dianping/logan/f;->k:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    check-cast v3, Lcom/dianping/logan/LoganModel;

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    iput-boolean v2, p0, Lcom/dianping/logan/f;->f:Z

    .line 27
    .line 28
    iget-object v3, p0, Lcom/dianping/logan/f;->b:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->wait()V

    .line 32
    .line 33
    iput-boolean v1, p0, Lcom/dianping/logan/f;->f:Z

    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_3

    .line 37
    :catch_0
    move-exception v1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0, v3}, Lcom/dianping/logan/f;->e(Lcom/dianping/logan/LoganModel;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    goto :goto_2

    .line 43
    .line 44
    .line 45
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    iput-boolean v2, p0, Lcom/dianping/logan/f;->f:Z

    .line 48
    :goto_2
    monitor-exit v0

    .line 49
    goto :goto_0

    .line 50
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    throw v1

    .line 52
    :cond_1
    return-void
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
.end method
