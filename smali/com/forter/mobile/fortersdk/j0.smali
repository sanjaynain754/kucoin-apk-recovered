.class public final Lcom/forter/mobile/fortersdk/j0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/forter/mobile/fortersdk/v3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public c:Lcom/forter/mobile/fortersdk/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->y()Ljava/util/concurrent/ExecutorService;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->b:Ljava/util/concurrent/ExecutorService;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public final a()Z
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 4
    move-result-object v0

    .line 5
    const/4 v6, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v6}, Lcom/forter/mobile/fortersdk/c;->l(Z)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 15
    return v6

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 21
    move-result v0

    .line 22
    const/4 v7, 0x1

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 28
    return v7

    .line 29
    :cond_1
    const/4 v8, 0x0

    .line 30
    .line 31
    :try_start_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 35
    move-result v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    iget-object v2, v2, Lcom/forter/mobile/fortersdk/c;->d:Lcom/forter/mobile/fortersdk/am;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, v2, Lcom/forter/mobile/fortersdk/am;->b:Lcom/forter/mobile/fortersdk/p;

    .line 46
    .line 47
    iget-object v2, v2, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    .line 51
    move-result v2

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :catch_1
    move-exception v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move v2, v6

    .line 58
    :goto_0
    add-int/2addr v0, v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lt7/a;->b()I

    .line 70
    move-result v2

    .line 71
    .line 72
    if-le v0, v2, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    move-result-wide v4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 85
    move-result v3

    .line 86
    .line 87
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    iget-object v7, p0, Lcom/forter/mobile/fortersdk/j0;->b:Ljava/util/concurrent/ExecutorService;

    .line 94
    .line 95
    new-instance v0, Lcom/forter/mobile/fortersdk/j0$b;

    .line 96
    move-object v1, p0

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v0 .. v5}, Lcom/forter/mobile/fortersdk/j0$b;-><init>(Lcom/forter/mobile/fortersdk/j0;Ljava/util/Iterator;IJ)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v7, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 109
    return v6

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    move-result-wide v4

    .line 114
    .line 115
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 119
    move-result v3

    .line 120
    .line 121
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    iget-object v9, p0, Lcom/forter/mobile/fortersdk/j0;->b:Ljava/util/concurrent/ExecutorService;

    .line 128
    .line 129
    new-instance v0, Lcom/forter/mobile/fortersdk/j0$a;

    .line 130
    move-object v1, p0

    .line 131
    .line 132
    .line 133
    invoke-direct/range {v0 .. v5}, Lcom/forter/mobile/fortersdk/j0$a;-><init>(Lcom/forter/mobile/fortersdk/j0;Ljava/util/Iterator;IJ)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v9, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    return v7

    .line 144
    .line 145
    .line 146
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->a()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    const-string v1, "Failed to create a thread that will process all buffered events."

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1, v8}, Lcom/forter/mobile/fortersdk/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    goto :goto_3

    .line 160
    .line 161
    .line 162
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    const-string v1, "EventsBuffer::internalSendAllEvents() Failed to execute submission, got ex: %s"

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v0, v8}, Lcom/forter/mobile/fortersdk/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 184
    :goto_3
    return v6
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
.end method

.method public final b(Lcom/forter/mobile/fortersdk/v3;)Z
    .locals 4
    .param p1    # Lcom/forter/mobile/fortersdk/v3;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lcom/forter/mobile/fortersdk/c;->l(Z)Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/forter/mobile/fortersdk/j0;->e(Lcom/forter/mobile/fortersdk/v3;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 32
    move-result v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lt7/a;->b()I

    .line 36
    move-result v3

    .line 37
    .line 38
    if-lt v2, v3, :cond_1

    .line 39
    return v0

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v1}, Lt7/a;->F()Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    instance-of v1, p1, Lcom/forter/mobile/fortersdk/u3;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    move-object v1, p1

    .line 51
    .line 52
    check-cast v1, Lcom/forter/mobile/fortersdk/u3;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/k0;->a(Lcom/forter/mobile/fortersdk/u3;)Z

    .line 56
    move-result v1

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    const/4 p1, 0x1

    .line 60
    return p1

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-interface {p1}, Lcom/forter/mobile/fortersdk/v3;->b()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->h()V

    .line 67
    .line 68
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/j0;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 72
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    return p1

    .line 74
    :cond_3
    :goto_0
    return v0

    .line 75
    .line 76
    .line 77
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 78
    return v0
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

.method public final c()Lcom/forter/mobile/fortersdk/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/j0;->c:Lcom/forter/mobile/fortersdk/c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 9
    move-result-object v0

    .line 10
    return-object v0
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
.end method

.method public final d(Lcom/forter/mobile/fortersdk/v3;)Z
    .locals 5
    .param p1    # Lcom/forter/mobile/fortersdk/v3;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lcom/forter/mobile/fortersdk/v3;->c()J

    .line 16
    move-result-wide v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lt7/a;->g()I

    .line 20
    move-result p1

    .line 21
    .line 22
    mul-int/lit16 p1, p1, 0x3e8

    .line 23
    int-to-long v3, p1

    .line 24
    add-long/2addr v1, v3

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    move-result-wide v3

    .line 29
    .line 30
    cmp-long p1, v1, v3

    .line 31
    .line 32
    if-gez p1, :cond_0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 37
    return p1
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
.end method

.method public final e(Lcom/forter/mobile/fortersdk/v3;)Z
    .locals 6
    .param p1    # Lcom/forter/mobile/fortersdk/v3;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/forter/mobile/fortersdk/j0;->d(Lcom/forter/mobile/fortersdk/v3;)Z

    .line 5
    move-result v1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    return v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/j0;->c()Lcom/forter/mobile/fortersdk/c;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lcom/forter/mobile/fortersdk/v3;->d()Lorg/json/JSONObject;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lcom/forter/mobile/fortersdk/f3;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    return v0

    .line 28
    .line 29
    :cond_1
    const-string v3, "UTF-8"

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 37
    move-result-object v2

    .line 38
    array-length v2, v2

    .line 39
    int-to-long v2, v2

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lcom/forter/mobile/fortersdk/v3;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->h()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lt7/a;->k()J

    .line 49
    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    cmp-long p1, v2, v4

    .line 52
    .line 53
    if-ltz p1, :cond_2

    .line 54
    return v0

    .line 55
    :cond_2
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 64
    return v0
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
