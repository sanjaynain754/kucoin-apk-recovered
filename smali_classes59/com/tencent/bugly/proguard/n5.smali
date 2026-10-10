.class public Lcom/tencent/bugly/proguard/n5;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static e:Lcom/tencent/bugly/proguard/n5;


# instance fields
.field public a:Lcom/tencent/bugly/proguard/pg;

.field public b:Lcom/tencent/bugly/proguard/l2;

.field public c:Lcom/tencent/bugly/proguard/j3;

.field public d:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    iput-object v1, p0, Lcom/tencent/bugly/proguard/n5;->a:Lcom/tencent/bugly/proguard/pg;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    iput-object v1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/proguard/n5;->c:Lcom/tencent/bugly/proguard/j3;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/tencent/bugly/proguard/n5;->d:Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    new-instance v0, Lcom/tencent/bugly/proguard/n5$a;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/n5$a;-><init>(Lcom/tencent/bugly/proguard/n5;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 41
    return-void
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
.end method

.method public static synthetic a()Lcom/tencent/bugly/proguard/n5;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/n5;->e:Lcom/tencent/bugly/proguard/n5;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/n5;
    .locals 1

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/n5;->e:Lcom/tencent/bugly/proguard/n5;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/n5;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/n5;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/tencent/bugly/proguard/n5;->e:Lcom/tencent/bugly/proguard/n5;

    .line 6
    :cond_0
    sget-object p0, Lcom/tencent/bugly/proguard/n5;->e:Lcom/tencent/bugly/proguard/n5;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/n5;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/n5;->b()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/n5;Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/tencent/bugly/proguard/n5;->a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static c(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "error_report"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    instance-of v1, v0, Lcom/tencent/bugly/proguard/d5;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Lcom/tencent/bugly/proguard/d5;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/d5;->c()Ljava/lang/Boolean;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    const/4 p0, 0x0

    .line 30
    .line 31
    new-array p0, p0, [Ljava/lang/Object;

    .line 32
    .line 33
    const-string p1, "extra error report is disabled, please modify your project\'s setting"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    new-instance v1, Lcom/tencent/bugly/proguard/n5$b;

    .line 44
    move-object v2, p0

    .line 45
    move v3, p1

    .line 46
    move-object v4, p2

    .line 47
    move-object v5, p3

    .line 48
    move-object v6, p4

    .line 49
    move-object v7, p5

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/proguard/n5$b;-><init>(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 56
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move/from16 v0, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    const-string v8, "[ExtraCrashManager] Successfully handled."

    if-nez p1, :cond_0

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    const/4 v1, 0x4

    const/4 v3, 0x6

    const/16 v7, 0x8

    const/4 v9, 0x5

    if-eq v0, v1, :cond_3

    if-eq v0, v9, :cond_2

    if-eq v0, v3, :cond_2

    if-eq v0, v7, :cond_1

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[ExtraCrashManager] Unknown extra crash type: %d"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 9
    :cond_1
    const-string v1, "H5"

    goto :goto_1

    .line 10
    :cond_2
    const-string v1, "Cocos"

    goto :goto_1

    .line 11
    :cond_3
    const-string v1, "Unity"

    .line 12
    :goto_1
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v10

    const-string v11, "[ExtraCrashManager] %s Crash Happen"

    invoke-static {v11, v10}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 v10, 0x0

    .line 13
    :try_start_0
    iget-object v11, p0, Lcom/tencent/bugly/proguard/n5;->a:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v11}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v11

    if-nez v11, :cond_4

    .line 14
    const-string v11, "[ExtraCrashManager] There is no remote strategy, but still store it."

    new-array v12, v10, [Ljava/lang/Object;

    .line 15
    sget-object v13, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v13, v11, v12}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    .line 16
    :cond_4
    :goto_2
    iget-object v11, p0, Lcom/tencent/bugly/proguard/n5;->a:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v11}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v11

    .line 17
    iget-boolean v12, v11, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v13, "\n"

    if-nez v12, :cond_5

    :try_start_1
    iget-object v12, p0, Lcom/tencent/bugly/proguard/n5;->a:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v12}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v12

    if-eqz v12, :cond_5

    .line 18
    const-string v0, "[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!"

    new-array v3, v10, [Ljava/lang/Object;

    .line 19
    sget-object v7, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v7, v0, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 20
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 21
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 p2, v0

    move-object p1, v1

    move-object/from16 p4, v2

    move-object/from16 p3, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    .line 22
    invoke-static/range {p1 .. p6}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    new-array v0, v10, [Ljava/lang/Object;

    .line 24
    invoke-static {v7, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_5
    move-object v12, v1

    const-string v1, "[ExtraCrashManager] %s report is disabled."

    if-eq v0, v9, :cond_7

    if-eq v0, v3, :cond_7

    if-eq v0, v7, :cond_6

    goto :goto_3

    .line 25
    :cond_6
    :try_start_2
    iget-boolean v3, v11, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->j:Z

    if-nez v3, :cond_8

    .line 26
    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v0

    .line 27
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    new-array v0, v10, [Ljava/lang/Object;

    .line 29
    invoke-static {v2, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 30
    :cond_7
    :try_start_3
    iget-boolean v3, v11, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->i:Z

    if-nez v3, :cond_8

    .line 31
    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v0

    .line 32
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    new-array v0, v10, [Ljava/lang/Object;

    .line 34
    invoke-static {v2, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_8
    :goto_3
    if-ne v0, v7, :cond_9

    move v3, v9

    :goto_4
    move-object v1, p0

    move-object/from16 v7, p6

    goto :goto_5

    :cond_9
    move v3, v0

    goto :goto_4

    .line 35
    :goto_5
    :try_start_4
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/n5;->b(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v0

    if-nez v0, :cond_a

    .line 36
    const-string v0, "[ExtraCrashManager] Failed to package crash data."

    new-array v2, v10, [Ljava/lang/Object;

    .line 37
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v0, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 38
    new-array v0, v10, [Ljava/lang/Object;

    .line 39
    invoke-static {v3, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 40
    :cond_a
    :try_start_5
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v7, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v7, v7, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 41
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 p6, v0

    move-object/from16 p4, v2

    move-object/from16 p2, v3

    move-object/from16 p5, v4

    move-object/from16 p3, v7

    move-object p1, v12

    .line 42
    invoke-static/range {p1 .. p6}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    move-object/from16 v0, p6

    .line 43
    iget-object v2, p0, Lcom/tencent/bugly/proguard/n5;->c:Lcom/tencent/bugly/proguard/j3;

    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/k3;->k()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v0, v3}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)Z

    move-result v2

    if-nez v2, :cond_b

    .line 44
    iget-object v2, p0, Lcom/tencent/bugly/proguard/n5;->c:Lcom/tencent/bugly/proguard/j3;

    const-wide/16 v3, 0xbb8

    invoke-virtual {v2, v0, v3, v4, v10}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 45
    :cond_b
    new-array v0, v10, [Ljava/lang/Object;

    .line 46
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 47
    :goto_6
    :try_start_6
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 48
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_8

    .line 49
    :cond_c
    :goto_7
    new-array v0, v10, [Ljava/lang/Object;

    .line 50
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 51
    :goto_8
    new-array v2, v10, [Ljava/lang/Object;

    .line 52
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v8, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 53
    throw v0
.end method

.method public final b(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;"
        }
    .end annotation

    .line 10
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->i()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->k()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->e()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 14
    iget-object v1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->C()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:J

    .line 15
    iget-object v1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->D()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:J

    .line 16
    iget-object v1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->E()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Q:J

    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/proguard/n5;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/o4;->b(Landroid/content/Context;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    .line 18
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->o()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->f()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:J

    .line 20
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    .line 21
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:J

    .line 22
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v1

    .line 23
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:J

    .line 24
    iput p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 25
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    .line 26
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-boolean v1, p2, Lcom/tencent/bugly/proguard/l2;->i0:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h:Z

    .line 27
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j:Ljava/lang/String;

    .line 28
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, p2, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    .line 29
    iget-object v1, p2, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    .line 30
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->j()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 31
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, p2, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    .line 32
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 33
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    .line 34
    sget-object p2, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    invoke-virtual {p2}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->getOperationLogString()Ljava/util/List;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/util/List;

    .line 35
    const-string p2, ""

    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 36
    iput-object p3, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 37
    invoke-static {p2, p4}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 38
    iput-object p3, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    const/4 p3, 0x0

    if-eqz p5, :cond_0

    .line 39
    const-string p4, "\n"

    invoke-virtual {p5, p4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p4

    .line 40
    array-length v1, p4

    if-lez v1, :cond_1

    .line 41
    aget-object p2, p4, p3

    goto :goto_0

    :cond_0
    move-object p5, p2

    .line 42
    :cond_1
    :goto_0
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    .line 43
    iput-object p5, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 45
    iget-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->c([B)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    .line 46
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->M()Z

    move-result p2

    sget p4, Lcom/tencent/bugly/proguard/k3;->B:I

    invoke-static {p2, p4, p3, p3}, Lcom/tencent/bugly/proguard/bi;->a(ZIZZ)Ljava/util/Map;

    move-result-object p2

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 47
    iget-object p2, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object p2, p2, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 48
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 49
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->x()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->W:Ljava/lang/String;

    .line 50
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->v()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    .line 51
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    iget-wide p2, p1, Lcom/tencent/bugly/proguard/l2;->c:J

    iput-wide p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    .line 52
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result p1

    iput-boolean p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    .line 53
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->H()I

    move-result p1

    iput p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    .line 54
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->A()I

    move-result p1

    iput p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    .line 55
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 56
    iget-object p1, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    .line 57
    invoke-static {}, Lcom/tencent/bugly/proguard/eb;->b()[B

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    .line 58
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m0:Ljava/lang/String;

    .line 59
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/u7;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n0:Ljava/lang/String;

    .line 60
    iget-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    if-nez p1, :cond_2

    .line 61
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    :cond_2
    if-eqz p6, :cond_3

    .line 62
    iget-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    invoke-interface {p1, p6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 63
    :cond_3
    invoke-static {v0}, Lcom/tencent/bugly/proguard/g5;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    return-object v0
.end method

.method public final b()V
    .locals 5

    const/4 v0, 0x0

    .line 1
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "[ExtraCrashManager] Trying to notify Bugly agents."

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 2
    :try_start_0
    const-class v1, Lcom/tencent/bugly/proguard/i7;

    sget-object v2, Lcom/tencent/bugly/proguard/i7;->a:Ljava/lang/String;

    .line 3
    const-string v2, "com.tencent.bugly"

    .line 4
    iget-object v3, p0, Lcom/tencent/bugly/proguard/n5;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    const-string/jumbo v3, "sdkPackageName"

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v4}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    const-string v1, "[ExtraCrashManager] Bugly game agent has been notified."

    new-array v2, v0, [Ljava/lang/Object;

    .line 7
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 8
    :catchall_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v2, "[ExtraCrashManager] no game agent"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method
