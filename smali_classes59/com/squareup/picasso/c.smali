.class public Lcom/squareup/picasso/c;
.super Ljava/lang/Object;
.source "BitmapHunter.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final u:Ljava/lang/Object;

.field public static final v:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/StringBuilder;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final x:Lcom/squareup/picasso/t;


# instance fields
.field public final b:I

.field public final c:Lcom/squareup/picasso/Picasso;

.field public final d:Lcom/squareup/picasso/i;

.field public final e:Lcom/squareup/picasso/d;

.field public final f:Lcom/squareup/picasso/v;

.field public final g:Ljava/lang/String;

.field public final h:Lcom/squareup/picasso/r;

.field public final i:I

.field public j:I

.field public final k:Lcom/squareup/picasso/t;

.field public l:Lcom/squareup/picasso/a;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/squareup/picasso/a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Landroid/graphics/Bitmap;

.field public o:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public p:Lcom/squareup/picasso/Picasso$LoadedFrom;

.field public q:Ljava/lang/Exception;

.field public r:I

.field public s:I

.field public t:Lcom/squareup/picasso/Picasso$Priority;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/squareup/picasso/c;->u:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Lcom/squareup/picasso/c$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/squareup/picasso/c$a;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/squareup/picasso/c;->v:Ljava/lang/ThreadLocal;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/squareup/picasso/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    new-instance v0, Lcom/squareup/picasso/c$b;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/squareup/picasso/c$b;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lcom/squareup/picasso/c;->x:Lcom/squareup/picasso/t;

    .line 29
    return-void
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
.end method

.method public constructor <init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/i;Lcom/squareup/picasso/d;Lcom/squareup/picasso/v;Lcom/squareup/picasso/a;Lcom/squareup/picasso/t;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/squareup/picasso/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 9
    move-result v0

    .line 10
    .line 11
    iput v0, p0, Lcom/squareup/picasso/c;->b:I

    .line 12
    .line 13
    iput-object p1, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/squareup/picasso/c;->e:Lcom/squareup/picasso/d;

    .line 18
    .line 19
    iput-object p4, p0, Lcom/squareup/picasso/c;->f:Lcom/squareup/picasso/v;

    .line 20
    .line 21
    iput-object p5, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p5}, Lcom/squareup/picasso/a;->d()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lcom/squareup/picasso/c;->g:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p5}, Lcom/squareup/picasso/a;->i()Lcom/squareup/picasso/r;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p5}, Lcom/squareup/picasso/a;->h()Lcom/squareup/picasso/Picasso$Priority;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iput-object p1, p0, Lcom/squareup/picasso/c;->t:Lcom/squareup/picasso/Picasso$Priority;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p5}, Lcom/squareup/picasso/a;->e()I

    .line 43
    move-result p1

    .line 44
    .line 45
    iput p1, p0, Lcom/squareup/picasso/c;->i:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p5}, Lcom/squareup/picasso/a;->f()I

    .line 49
    move-result p1

    .line 50
    .line 51
    iput p1, p0, Lcom/squareup/picasso/c;->j:I

    .line 52
    .line 53
    iput-object p6, p0, Lcom/squareup/picasso/c;->k:Lcom/squareup/picasso/t;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p6}, Lcom/squareup/picasso/t;->e()I

    .line 57
    move-result p1

    .line 58
    .line 59
    iput p1, p0, Lcom/squareup/picasso/c;->s:I

    .line 60
    return-void
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

.method public static a(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/picasso/x;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    if-ge v1, v0, :cond_4

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    check-cast v2, Lcom/squareup/picasso/x;

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {v2, p1}, Lcom/squareup/picasso/x;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 18
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    const-string v0, "Transformation "

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Lcom/squareup/picasso/x;->key()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v0, " returned null after "

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, " previous transformation(s).\n\nTransformation list:\n"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    check-cast v0, Lcom/squareup/picasso/x;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Lcom/squareup/picasso/x;->key()Ljava/lang/String;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const/16 v0, 0xa

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_0
    sget-object p0, Lcom/squareup/picasso/Picasso;->p:Landroid/os/Handler;

    .line 82
    .line 83
    new-instance v0, Lcom/squareup/picasso/c$d;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, p1}, Lcom/squareup/picasso/c$d;-><init>(Ljava/lang/StringBuilder;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 90
    return-object v3

    .line 91
    .line 92
    :cond_1
    if-ne v4, p1, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 96
    move-result v5

    .line 97
    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    sget-object p0, Lcom/squareup/picasso/Picasso;->p:Landroid/os/Handler;

    .line 101
    .line 102
    new-instance p1, Lcom/squareup/picasso/c$e;

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, v2}, Lcom/squareup/picasso/c$e;-><init>(Lcom/squareup/picasso/x;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 109
    return-object v3

    .line 110
    .line 111
    :cond_2
    if-eq v4, p1, :cond_3

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 115
    move-result p1

    .line 116
    .line 117
    if-nez p1, :cond_3

    .line 118
    .line 119
    sget-object p0, Lcom/squareup/picasso/Picasso;->p:Landroid/os/Handler;

    .line 120
    .line 121
    new-instance p1, Lcom/squareup/picasso/c$f;

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v2}, Lcom/squareup/picasso/c$f;-><init>(Lcom/squareup/picasso/x;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 128
    return-object v3

    .line 129
    .line 130
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 131
    move-object p1, v4

    .line 132
    goto :goto_0

    .line 133
    :catch_0
    move-exception p0

    .line 134
    .line 135
    sget-object p1, Lcom/squareup/picasso/Picasso;->p:Landroid/os/Handler;

    .line 136
    .line 137
    new-instance v0, Lcom/squareup/picasso/c$c;

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, v2, p0}, Lcom/squareup/picasso/c$c;-><init>(Lcom/squareup/picasso/x;Ljava/lang/RuntimeException;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 144
    return-object v3

    .line 145
    :cond_4
    return-object p1
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
.end method

.method public static e(Lokio/Source;Lcom/squareup/picasso/r;)Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/squareup/picasso/y;->r(Lokio/BufferedSource;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    iget-boolean v1, p1, Lcom/squareup/picasso/r;->r:Z

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/squareup/picasso/t;->d(Lcom/squareup/picasso/r;)Landroid/graphics/BitmapFactory$Options;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/squareup/picasso/t;->g(Landroid/graphics/BitmapFactory$Options;)Z

    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 25
    move-result-object p0

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    new-instance v2, Lcom/squareup/picasso/n;

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p0}, Lcom/squareup/picasso/n;-><init>(Ljava/io/InputStream;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lcom/squareup/picasso/n;->a(Z)V

    .line 37
    .line 38
    const/16 p0, 0x400

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p0}, Lcom/squareup/picasso/n;->g(I)J

    .line 42
    move-result-wide v3

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 46
    .line 47
    iget p0, p1, Lcom/squareup/picasso/r;->h:I

    .line 48
    .line 49
    iget v5, p1, Lcom/squareup/picasso/r;->i:I

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v5, v1, p1}, Lcom/squareup/picasso/t;->b(IILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/r;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Lcom/squareup/picasso/n;->b(J)V

    .line 56
    const/4 p0, 0x1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p0}, Lcom/squareup/picasso/n;->a(Z)V

    .line 60
    move-object p0, v2

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    return-object p0

    .line 68
    .line 69
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 70
    .line 71
    const-string p1, "Failed to decode stream."

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 75
    throw p0

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-interface {p0}, Lokio/BufferedSource;->readByteArray()[B

    .line 79
    move-result-object p0

    .line 80
    .line 81
    if-eqz v2, :cond_3

    .line 82
    array-length v0, p0

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 86
    .line 87
    iget v0, p1, Lcom/squareup/picasso/r;->h:I

    .line 88
    .line 89
    iget v2, p1, Lcom/squareup/picasso/r;->i:I

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v2, v1, p1}, Lcom/squareup/picasso/t;->b(IILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/r;)V

    .line 93
    :cond_3
    array-length p1, p0

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v3, p1, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 97
    move-result-object p0

    .line 98
    return-object p0
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
.end method

.method public static g(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/i;Lcom/squareup/picasso/d;Lcom/squareup/picasso/v;Lcom/squareup/picasso/a;)Lcom/squareup/picasso/c;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p4 .. p4}, Lcom/squareup/picasso/a;->i()Lcom/squareup/picasso/r;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/squareup/picasso/Picasso;->g()Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    move-result-object v4

    .line 20
    move-object v11, v4

    .line 21
    .line 22
    check-cast v11, Lcom/squareup/picasso/t;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v11, v0}, Lcom/squareup/picasso/t;->c(Lcom/squareup/picasso/r;)Z

    .line 26
    move-result v4

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    new-instance v5, Lcom/squareup/picasso/c;

    .line 31
    move-object v6, p0

    .line 32
    move-object v7, p1

    .line 33
    move-object v8, p2

    .line 34
    .line 35
    move-object/from16 v9, p3

    .line 36
    .line 37
    move-object/from16 v10, p4

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v5 .. v11}, Lcom/squareup/picasso/c;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/i;Lcom/squareup/picasso/d;Lcom/squareup/picasso/v;Lcom/squareup/picasso/a;Lcom/squareup/picasso/t;)V

    .line 41
    return-object v5

    .line 42
    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    new-instance v6, Lcom/squareup/picasso/c;

    .line 47
    .line 48
    sget-object v12, Lcom/squareup/picasso/c;->x:Lcom/squareup/picasso/t;

    .line 49
    move-object v7, p0

    .line 50
    move-object v8, p1

    .line 51
    move-object v9, p2

    .line 52
    .line 53
    move-object/from16 v10, p3

    .line 54
    .line 55
    move-object/from16 v11, p4

    .line 56
    .line 57
    .line 58
    invoke-direct/range {v6 .. v12}, Lcom/squareup/picasso/c;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/i;Lcom/squareup/picasso/d;Lcom/squareup/picasso/v;Lcom/squareup/picasso/a;Lcom/squareup/picasso/t;)V

    .line 59
    return-object v6
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
.end method

.method public static l(I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    const/4 p0, 0x0

    .line 5
    return p0

    .line 6
    .line 7
    :pswitch_0
    const/16 p0, 0x10e

    .line 8
    return p0

    .line 9
    .line 10
    :pswitch_1
    const/16 p0, 0x5a

    .line 11
    return p0

    .line 12
    .line 13
    :pswitch_2
    const/16 p0, 0xb4

    .line 14
    return p0

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
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static m(I)I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    const/4 v0, 0x7

    .line 5
    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    const/4 v0, 0x4

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    const/4 v0, 0x5

    .line 11
    .line 12
    if-eq p0, v0, :cond_0

    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, -0x1

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static v(ZIIII)Z
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    if-gt p1, p3, :cond_2

    .line 7
    .line 8
    :cond_0
    if-eqz p4, :cond_1

    .line 9
    .line 10
    if-le p2, p4, :cond_1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
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
.end method

.method public static y(Lcom/squareup/picasso/r;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 27

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    move-result v2

    .line 11
    .line 12
    iget-boolean v3, v0, Lcom/squareup/picasso/r;->m:Z

    .line 13
    .line 14
    new-instance v5, Landroid/graphics/Matrix;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/squareup/picasso/r;->e()Z

    .line 21
    move-result v4

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v3, v1

    .line 28
    move v6, v2

    .line 29
    .line 30
    goto/16 :goto_15

    .line 31
    .line 32
    :cond_1
    :goto_0
    iget v4, v0, Lcom/squareup/picasso/r;->h:I

    .line 33
    .line 34
    iget v7, v0, Lcom/squareup/picasso/r;->i:I

    .line 35
    .line 36
    iget v8, v0, Lcom/squareup/picasso/r;->n:F

    .line 37
    const/4 v9, 0x0

    .line 38
    .line 39
    cmpl-float v9, v8, v9

    .line 40
    .line 41
    if-eqz v9, :cond_3

    .line 42
    float-to-double v9, v8

    .line 43
    .line 44
    .line 45
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 46
    move-result-wide v11

    .line 47
    .line 48
    .line 49
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 50
    move-result-wide v11

    .line 51
    .line 52
    .line 53
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 54
    move-result-wide v9

    .line 55
    .line 56
    .line 57
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 58
    move-result-wide v9

    .line 59
    .line 60
    iget-boolean v4, v0, Lcom/squareup/picasso/r;->q:Z

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    iget v4, v0, Lcom/squareup/picasso/r;->o:F

    .line 65
    .line 66
    iget v7, v0, Lcom/squareup/picasso/r;->p:F

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v8, v4, v7}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 70
    .line 71
    iget v4, v0, Lcom/squareup/picasso/r;->o:F

    .line 72
    float-to-double v7, v4

    .line 73
    .line 74
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 75
    sub-double/2addr v13, v11

    .line 76
    mul-double/2addr v7, v13

    .line 77
    .line 78
    iget v15, v0, Lcom/squareup/picasso/r;->p:F

    .line 79
    .line 80
    move-wide/from16 v17, v7

    .line 81
    float-to-double v6, v15

    .line 82
    mul-double/2addr v6, v9

    .line 83
    .line 84
    add-double v7, v17, v6

    .line 85
    .line 86
    move-wide/from16 v17, v9

    .line 87
    float-to-double v9, v15

    .line 88
    mul-double/2addr v9, v13

    .line 89
    float-to-double v13, v4

    .line 90
    .line 91
    mul-double v13, v13, v17

    .line 92
    sub-double/2addr v9, v13

    .line 93
    .line 94
    iget v4, v0, Lcom/squareup/picasso/r;->h:I

    .line 95
    int-to-double v13, v4

    .line 96
    mul-double/2addr v13, v11

    .line 97
    add-double/2addr v13, v7

    .line 98
    .line 99
    move-wide/from16 v19, v11

    .line 100
    int-to-double v11, v4

    .line 101
    .line 102
    mul-double v11, v11, v17

    .line 103
    add-double/2addr v11, v9

    .line 104
    move v6, v2

    .line 105
    move v15, v3

    .line 106
    int-to-double v2, v4

    .line 107
    .line 108
    mul-double v2, v2, v19

    .line 109
    add-double/2addr v2, v7

    .line 110
    .line 111
    move-wide/from16 v21, v2

    .line 112
    .line 113
    iget v2, v0, Lcom/squareup/picasso/r;->i:I

    .line 114
    move v3, v1

    .line 115
    int-to-double v0, v2

    .line 116
    .line 117
    mul-double v0, v0, v17

    .line 118
    .line 119
    sub-double v0, v21, v0

    .line 120
    .line 121
    move/from16 v21, v3

    .line 122
    int-to-double v3, v4

    .line 123
    .line 124
    mul-double v3, v3, v17

    .line 125
    add-double/2addr v3, v9

    .line 126
    .line 127
    move-wide/from16 v22, v3

    .line 128
    int-to-double v3, v2

    .line 129
    .line 130
    mul-double v3, v3, v19

    .line 131
    .line 132
    add-double v3, v22, v3

    .line 133
    .line 134
    move-object/from16 v22, v5

    .line 135
    .line 136
    move/from16 v23, v6

    .line 137
    int-to-double v5, v2

    .line 138
    .line 139
    mul-double v5, v5, v17

    .line 140
    .line 141
    sub-double v5, v7, v5

    .line 142
    .line 143
    move-wide/from16 v24, v3

    .line 144
    int-to-double v2, v2

    .line 145
    .line 146
    mul-double v2, v2, v19

    .line 147
    add-double/2addr v2, v9

    .line 148
    .line 149
    move-wide/from16 v17, v2

    .line 150
    .line 151
    .line 152
    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->max(DD)D

    .line 153
    move-result-wide v2

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 157
    move-result-wide v2

    .line 158
    .line 159
    .line 160
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 161
    move-result-wide v2

    .line 162
    .line 163
    .line 164
    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->min(DD)D

    .line 165
    move-result-wide v7

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->min(DD)D

    .line 169
    move-result-wide v0

    .line 170
    .line 171
    .line 172
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 173
    move-result-wide v0

    .line 174
    .line 175
    .line 176
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(DD)D

    .line 177
    move-result-wide v4

    .line 178
    .line 179
    move-wide/from16 v6, v24

    .line 180
    .line 181
    .line 182
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 183
    move-result-wide v4

    .line 184
    .line 185
    move-wide/from16 v13, v17

    .line 186
    .line 187
    .line 188
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 189
    move-result-wide v4

    .line 190
    .line 191
    .line 192
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->min(DD)D

    .line 193
    move-result-wide v8

    .line 194
    .line 195
    .line 196
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(DD)D

    .line 197
    move-result-wide v6

    .line 198
    .line 199
    .line 200
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->min(DD)D

    .line 201
    move-result-wide v6

    .line 202
    sub-double/2addr v2, v0

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 206
    move-result-wide v0

    .line 207
    double-to-int v0, v0

    .line 208
    sub-double/2addr v4, v6

    .line 209
    .line 210
    .line 211
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 212
    move-result-wide v1

    .line 213
    double-to-int v7, v1

    .line 214
    move v4, v0

    .line 215
    .line 216
    move/from16 v17, v15

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :cond_2
    move/from16 v21, v1

    .line 221
    .line 222
    move/from16 v23, v2

    .line 223
    move v15, v3

    .line 224
    .line 225
    move-wide/from16 v17, v9

    .line 226
    .line 227
    move-wide/from16 v19, v11

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5, v8}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 231
    .line 232
    move-object/from16 v0, p0

    .line 233
    .line 234
    iget v1, v0, Lcom/squareup/picasso/r;->h:I

    .line 235
    int-to-double v2, v1

    .line 236
    .line 237
    mul-double v2, v2, v19

    .line 238
    int-to-double v6, v1

    .line 239
    .line 240
    mul-double v6, v6, v17

    .line 241
    int-to-double v8, v1

    .line 242
    .line 243
    mul-double v8, v8, v19

    .line 244
    .line 245
    iget v4, v0, Lcom/squareup/picasso/r;->i:I

    .line 246
    int-to-double v10, v4

    .line 247
    .line 248
    mul-double v10, v10, v17

    .line 249
    sub-double/2addr v8, v10

    .line 250
    int-to-double v10, v1

    .line 251
    .line 252
    mul-double v10, v10, v17

    .line 253
    int-to-double v12, v4

    .line 254
    .line 255
    mul-double v12, v12, v19

    .line 256
    add-double/2addr v10, v12

    .line 257
    int-to-double v12, v4

    .line 258
    .line 259
    mul-double v12, v12, v17

    .line 260
    neg-double v12, v12

    .line 261
    move v1, v15

    .line 262
    int-to-double v14, v4

    .line 263
    .line 264
    mul-double v14, v14, v19

    .line 265
    .line 266
    move/from16 v17, v1

    .line 267
    .line 268
    const-wide/16 v0, 0x0

    .line 269
    .line 270
    move-object/from16 v22, v5

    .line 271
    .line 272
    .line 273
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 274
    move-result-wide v4

    .line 275
    .line 276
    .line 277
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 278
    move-result-wide v4

    .line 279
    .line 280
    .line 281
    invoke-static {v12, v13, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 282
    move-result-wide v4

    .line 283
    .line 284
    .line 285
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 286
    move-result-wide v2

    .line 287
    .line 288
    .line 289
    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 290
    move-result-wide v2

    .line 291
    .line 292
    .line 293
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 294
    move-result-wide v2

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->max(DD)D

    .line 298
    move-result-wide v8

    .line 299
    .line 300
    .line 301
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 302
    move-result-wide v8

    .line 303
    .line 304
    .line 305
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 306
    move-result-wide v8

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(DD)D

    .line 310
    move-result-wide v0

    .line 311
    .line 312
    .line 313
    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 314
    move-result-wide v0

    .line 315
    .line 316
    .line 317
    invoke-static {v14, v15, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 318
    move-result-wide v0

    .line 319
    sub-double/2addr v4, v2

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 323
    move-result-wide v2

    .line 324
    double-to-int v4, v2

    .line 325
    sub-double/2addr v8, v0

    .line 326
    .line 327
    .line 328
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 329
    move-result-wide v0

    .line 330
    double-to-int v7, v0

    .line 331
    goto :goto_1

    .line 332
    .line 333
    :cond_3
    move/from16 v21, v1

    .line 334
    .line 335
    move/from16 v23, v2

    .line 336
    .line 337
    move/from16 v17, v3

    .line 338
    .line 339
    move-object/from16 v22, v5

    .line 340
    .line 341
    :goto_1
    if-eqz p2, :cond_8

    .line 342
    .line 343
    .line 344
    invoke-static/range {p2 .. p2}, Lcom/squareup/picasso/c;->l(I)I

    .line 345
    move-result v0

    .line 346
    .line 347
    .line 348
    invoke-static/range {p2 .. p2}, Lcom/squareup/picasso/c;->m(I)I

    .line 349
    move-result v1

    .line 350
    .line 351
    if-eqz v0, :cond_5

    .line 352
    int-to-float v2, v0

    .line 353
    .line 354
    move-object/from16 v5, v22

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 358
    .line 359
    const/16 v2, 0x5a

    .line 360
    .line 361
    if-eq v0, v2, :cond_4

    .line 362
    .line 363
    const/16 v2, 0x10e

    .line 364
    .line 365
    if-ne v0, v2, :cond_6

    .line 366
    .line 367
    :cond_4
    move/from16 v26, v7

    .line 368
    move v7, v4

    .line 369
    .line 370
    move/from16 v4, v26

    .line 371
    goto :goto_2

    .line 372
    .line 373
    :cond_5
    move-object/from16 v5, v22

    .line 374
    :cond_6
    :goto_2
    const/4 v0, 0x1

    .line 375
    .line 376
    if-eq v1, v0, :cond_7

    .line 377
    int-to-float v0, v1

    .line 378
    .line 379
    const/high16 v1, 0x3f800000    # 1.0f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 383
    .line 384
    :cond_7
    :goto_3
    move-object/from16 v0, p0

    .line 385
    goto :goto_4

    .line 386
    .line 387
    :cond_8
    move-object/from16 v5, v22

    .line 388
    goto :goto_3

    .line 389
    .line 390
    :goto_4
    iget-boolean v1, v0, Lcom/squareup/picasso/r;->j:Z

    .line 391
    .line 392
    if-eqz v1, :cond_12

    .line 393
    .line 394
    if-eqz v4, :cond_9

    .line 395
    int-to-float v1, v4

    .line 396
    .line 397
    move/from16 v3, v21

    .line 398
    int-to-float v2, v3

    .line 399
    div-float/2addr v1, v2

    .line 400
    .line 401
    move/from16 v6, v23

    .line 402
    goto :goto_5

    .line 403
    .line 404
    :cond_9
    move/from16 v3, v21

    .line 405
    int-to-float v1, v7

    .line 406
    .line 407
    move/from16 v6, v23

    .line 408
    int-to-float v2, v6

    .line 409
    div-float/2addr v1, v2

    .line 410
    .line 411
    :goto_5
    if-eqz v7, :cond_a

    .line 412
    int-to-float v2, v7

    .line 413
    int-to-float v8, v6

    .line 414
    :goto_6
    div-float/2addr v2, v8

    .line 415
    goto :goto_7

    .line 416
    :cond_a
    int-to-float v2, v4

    .line 417
    int-to-float v8, v3

    .line 418
    goto :goto_6

    .line 419
    .line 420
    :goto_7
    cmpl-float v8, v1, v2

    .line 421
    .line 422
    if-lez v8, :cond_d

    .line 423
    int-to-float v8, v6

    .line 424
    div-float/2addr v2, v1

    .line 425
    mul-float/2addr v8, v2

    .line 426
    float-to-double v8, v8

    .line 427
    .line 428
    .line 429
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 430
    move-result-wide v8

    .line 431
    double-to-int v2, v8

    .line 432
    .line 433
    iget v0, v0, Lcom/squareup/picasso/r;->k:I

    .line 434
    .line 435
    and-int/lit8 v8, v0, 0x30

    .line 436
    .line 437
    const/16 v9, 0x30

    .line 438
    .line 439
    if-ne v8, v9, :cond_b

    .line 440
    const/4 v0, 0x0

    .line 441
    goto :goto_8

    .line 442
    .line 443
    :cond_b
    const/16 v8, 0x50

    .line 444
    and-int/2addr v0, v8

    .line 445
    .line 446
    if-ne v0, v8, :cond_c

    .line 447
    .line 448
    sub-int v0, v6, v2

    .line 449
    goto :goto_8

    .line 450
    .line 451
    :cond_c
    sub-int v0, v6, v2

    .line 452
    .line 453
    div-int/lit8 v0, v0, 0x2

    .line 454
    :goto_8
    int-to-float v8, v7

    .line 455
    int-to-float v9, v2

    .line 456
    div-float/2addr v8, v9

    .line 457
    .line 458
    move/from16 v23, v2

    .line 459
    .line 460
    move/from16 v21, v3

    .line 461
    move v2, v8

    .line 462
    .line 463
    move/from16 v15, v17

    .line 464
    .line 465
    :goto_9
    const/16 v16, 0x0

    .line 466
    goto :goto_b

    .line 467
    .line 468
    :cond_d
    cmpg-float v8, v1, v2

    .line 469
    .line 470
    if-gez v8, :cond_10

    .line 471
    int-to-float v8, v3

    .line 472
    div-float/2addr v1, v2

    .line 473
    mul-float/2addr v8, v1

    .line 474
    float-to-double v8, v8

    .line 475
    .line 476
    .line 477
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 478
    move-result-wide v8

    .line 479
    double-to-int v1, v8

    .line 480
    .line 481
    iget v0, v0, Lcom/squareup/picasso/r;->k:I

    .line 482
    .line 483
    and-int/lit8 v8, v0, 0x3

    .line 484
    const/4 v9, 0x3

    .line 485
    .line 486
    if-ne v8, v9, :cond_e

    .line 487
    const/4 v0, 0x0

    .line 488
    goto :goto_a

    .line 489
    :cond_e
    const/4 v8, 0x5

    .line 490
    and-int/2addr v0, v8

    .line 491
    .line 492
    if-ne v0, v8, :cond_f

    .line 493
    .line 494
    sub-int v0, v3, v1

    .line 495
    goto :goto_a

    .line 496
    .line 497
    :cond_f
    sub-int v0, v3, v1

    .line 498
    .line 499
    div-int/lit8 v0, v0, 0x2

    .line 500
    :goto_a
    int-to-float v8, v4

    .line 501
    int-to-float v9, v1

    .line 502
    div-float/2addr v8, v9

    .line 503
    .line 504
    move/from16 v16, v0

    .line 505
    .line 506
    move/from16 v21, v1

    .line 507
    .line 508
    move/from16 v23, v6

    .line 509
    move v1, v8

    .line 510
    .line 511
    move/from16 v15, v17

    .line 512
    const/4 v0, 0x0

    .line 513
    goto :goto_b

    .line 514
    :cond_10
    move v1, v2

    .line 515
    .line 516
    move/from16 v21, v3

    .line 517
    .line 518
    move/from16 v23, v6

    .line 519
    .line 520
    move/from16 v15, v17

    .line 521
    const/4 v0, 0x0

    .line 522
    goto :goto_9

    .line 523
    .line 524
    .line 525
    :goto_b
    invoke-static {v15, v3, v6, v4, v7}, Lcom/squareup/picasso/c;->v(ZIIII)Z

    .line 526
    move-result v3

    .line 527
    .line 528
    if-eqz v3, :cond_11

    .line 529
    .line 530
    .line 531
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 532
    :cond_11
    move v2, v0

    .line 533
    .line 534
    move/from16 v1, v16

    .line 535
    .line 536
    move/from16 v3, v21

    .line 537
    .line 538
    move/from16 v4, v23

    .line 539
    goto :goto_16

    .line 540
    .line 541
    :cond_12
    move/from16 v15, v17

    .line 542
    .line 543
    move/from16 v3, v21

    .line 544
    .line 545
    move/from16 v6, v23

    .line 546
    .line 547
    iget-boolean v0, v0, Lcom/squareup/picasso/r;->l:Z

    .line 548
    .line 549
    if-eqz v0, :cond_16

    .line 550
    .line 551
    if-eqz v4, :cond_13

    .line 552
    int-to-float v0, v4

    .line 553
    int-to-float v1, v3

    .line 554
    :goto_c
    div-float/2addr v0, v1

    .line 555
    goto :goto_d

    .line 556
    :cond_13
    int-to-float v0, v7

    .line 557
    int-to-float v1, v6

    .line 558
    goto :goto_c

    .line 559
    .line 560
    :goto_d
    if-eqz v7, :cond_14

    .line 561
    int-to-float v1, v7

    .line 562
    int-to-float v2, v6

    .line 563
    :goto_e
    div-float/2addr v1, v2

    .line 564
    goto :goto_f

    .line 565
    :cond_14
    int-to-float v1, v4

    .line 566
    int-to-float v2, v3

    .line 567
    goto :goto_e

    .line 568
    .line 569
    :goto_f
    cmpg-float v2, v0, v1

    .line 570
    .line 571
    if-gez v2, :cond_15

    .line 572
    goto :goto_10

    .line 573
    :cond_15
    move v0, v1

    .line 574
    .line 575
    .line 576
    :goto_10
    invoke-static {v15, v3, v6, v4, v7}, Lcom/squareup/picasso/c;->v(ZIIII)Z

    .line 577
    move-result v1

    .line 578
    .line 579
    if-eqz v1, :cond_1b

    .line 580
    .line 581
    .line 582
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 583
    goto :goto_15

    .line 584
    .line 585
    :cond_16
    if-nez v4, :cond_17

    .line 586
    .line 587
    if-eqz v7, :cond_1b

    .line 588
    .line 589
    :cond_17
    if-ne v4, v3, :cond_18

    .line 590
    .line 591
    if-eq v7, v6, :cond_1b

    .line 592
    .line 593
    :cond_18
    if-eqz v4, :cond_19

    .line 594
    int-to-float v0, v4

    .line 595
    int-to-float v1, v3

    .line 596
    :goto_11
    div-float/2addr v0, v1

    .line 597
    goto :goto_12

    .line 598
    :cond_19
    int-to-float v0, v7

    .line 599
    int-to-float v1, v6

    .line 600
    goto :goto_11

    .line 601
    .line 602
    :goto_12
    if-eqz v7, :cond_1a

    .line 603
    int-to-float v1, v7

    .line 604
    int-to-float v2, v6

    .line 605
    :goto_13
    div-float/2addr v1, v2

    .line 606
    goto :goto_14

    .line 607
    :cond_1a
    int-to-float v1, v4

    .line 608
    int-to-float v2, v3

    .line 609
    goto :goto_13

    .line 610
    .line 611
    .line 612
    :goto_14
    invoke-static {v15, v3, v6, v4, v7}, Lcom/squareup/picasso/c;->v(ZIIII)Z

    .line 613
    move-result v2

    .line 614
    .line 615
    if-eqz v2, :cond_1b

    .line 616
    .line 617
    .line 618
    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 619
    :cond_1b
    :goto_15
    move v4, v6

    .line 620
    const/4 v1, 0x0

    .line 621
    const/4 v2, 0x0

    .line 622
    :goto_16
    const/4 v6, 0x1

    .line 623
    .line 624
    move-object/from16 v0, p1

    .line 625
    .line 626
    .line 627
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 628
    move-result-object v1

    .line 629
    .line 630
    if-eq v1, v0, :cond_1c

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 634
    return-object v1

    .line 635
    :cond_1c
    return-object v0
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
.end method

.method public static z(Lcom/squareup/picasso/r;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/squareup/picasso/r;->a()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    sget-object v0, Lcom/squareup/picasso/c;->v:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    move-result v1

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    add-int/2addr v1, v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2, v1, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

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


# virtual methods
.method public b(Lcom/squareup/picasso/a;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/squareup/picasso/Picasso;->n:Z

    .line 5
    .line 6
    iget-object v1, p1, Lcom/squareup/picasso/a;->b:Lcom/squareup/picasso/r;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v3, "to "

    .line 12
    .line 13
    const-string v4, "joined"

    .line 14
    .line 15
    const-string v5, "Hunter"

    .line 16
    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    iput-object p1, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iget-object p1, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 29
    move-result p1

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v3}, Lcom/squareup/picasso/y;->k(Lcom/squareup/picasso/c;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-static {v5, v4, p1, v0}, Lcom/squareup/picasso/y;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    const-string/jumbo v0, "to empty hunter"

    .line 52
    .line 53
    .line 54
    invoke-static {v5, v4, p1, v0}, Lcom/squareup/picasso/y;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_2
    iget-object v2, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    const/4 v6, 0x3

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    iput-object v2, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 68
    .line 69
    :cond_3
    iget-object v2, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 70
    .line 71
    .line 72
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v3}, Lcom/squareup/picasso/y;->k(Lcom/squareup/picasso/c;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v4, v0, v1}, Lcom/squareup/picasso/y;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Lcom/squareup/picasso/a;->h()Lcom/squareup/picasso/Picasso$Priority;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 93
    move-result v0

    .line 94
    .line 95
    iget-object v1, p0, Lcom/squareup/picasso/c;->t:Lcom/squareup/picasso/Picasso$Priority;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 99
    move-result v1

    .line 100
    .line 101
    if-le v0, v1, :cond_5

    .line 102
    .line 103
    iput-object p1, p0, Lcom/squareup/picasso/c;->t:Lcom/squareup/picasso/Picasso$Priority;

    .line 104
    :cond_5
    return-void
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
.end method

.method public c()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/c;->o:Ljava/util/concurrent/Future;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_1
    return v1
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
.end method

.method public final d()Lcom/squareup/picasso/Picasso$Priority;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/squareup/picasso/Picasso$Priority;->LOW:Lcom/squareup/picasso/Picasso$Priority;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v2

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    return-object v0

    .line 25
    .line 26
    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/squareup/picasso/a;->h()Lcom/squareup/picasso/Picasso$Priority;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    :cond_3
    if-eqz v1, :cond_5

    .line 33
    .line 34
    iget-object v1, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 38
    move-result v1

    .line 39
    .line 40
    :goto_2
    if-ge v2, v1, :cond_5

    .line 41
    .line 42
    iget-object v3, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 43
    .line 44
    .line 45
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    check-cast v3, Lcom/squareup/picasso/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/squareup/picasso/a;->h()Lcom/squareup/picasso/Picasso$Priority;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 56
    move-result v4

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v5

    .line 61
    .line 62
    if-le v4, v5, :cond_4

    .line 63
    move-object v0, v3

    .line 64
    .line 65
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 66
    goto :goto_2

    .line 67
    :cond_5
    return-object v0
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
.end method

.method public f(Lcom/squareup/picasso/a;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    iput-object v0, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/squareup/picasso/a;->h()Lcom/squareup/picasso/Picasso$Priority;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/squareup/picasso/c;->t:Lcom/squareup/picasso/Picasso$Priority;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/squareup/picasso/c;->d()Lcom/squareup/picasso/Picasso$Priority;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iput-object v0, p0, Lcom/squareup/picasso/c;->t:Lcom/squareup/picasso/Picasso$Priority;

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 38
    .line 39
    iget-boolean v0, v0, Lcom/squareup/picasso/Picasso;->n:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object p1, p1, Lcom/squareup/picasso/a;->b:Lcom/squareup/picasso/r;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    const-string v0, "from "

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v0}, Lcom/squareup/picasso/y;->k(Lcom/squareup/picasso/c;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    const-string v1, "Hunter"

    .line 56
    .line 57
    .line 58
    const-string/jumbo v2, "removed"

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, p1, v0}, Lcom/squareup/picasso/y;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :cond_3
    return-void
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

.method public h()Lcom/squareup/picasso/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->l:Lcom/squareup/picasso/a;

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
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/squareup/picasso/a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->m:Ljava/util/List;

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
.end method

.method public j()Lcom/squareup/picasso/r;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

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
.end method

.method public k()Ljava/lang/Exception;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->q:Ljava/lang/Exception;

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
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->g:Ljava/lang/String;

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
.end method

.method public o()Lcom/squareup/picasso/Picasso$LoadedFrom;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->p:Lcom/squareup/picasso/Picasso$LoadedFrom;

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
.end method

.method public p()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/c;->i:I

    .line 3
    return v0
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

.method public q()Lcom/squareup/picasso/Picasso;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

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
.end method

.method public r()Lcom/squareup/picasso/Picasso$Priority;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->t:Lcom/squareup/picasso/Picasso$Priority;

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
.end method

.method public run()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "Picasso-Idle"

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lcom/squareup/picasso/c;->z(Lcom/squareup/picasso/r;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 10
    .line 11
    iget-boolean v1, v1, Lcom/squareup/picasso/Picasso;->n:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "Hunter"

    .line 16
    .line 17
    const-string v2, "executing"

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/squareup/picasso/y;->j(Lcom/squareup/picasso/c;)Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2, v3}, Lcom/squareup/picasso/y;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    :catch_0
    move-exception v1

    .line 30
    goto :goto_2

    .line 31
    :catch_1
    move-exception v1

    .line 32
    goto :goto_4

    .line 33
    :catch_2
    move-exception v1

    .line 34
    goto :goto_5

    .line 35
    :catch_3
    move-exception v1

    .line 36
    goto :goto_6

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/picasso/c;->t()Landroid/graphics/Bitmap;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iput-object v1, p0, Lcom/squareup/picasso/c;->n:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Lcom/squareup/picasso/i;->e(Lcom/squareup/picasso/c;)V

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0}, Lcom/squareup/picasso/i;->d(Lcom/squareup/picasso/c;)V
    :try_end_0
    .catch Lcom/squareup/picasso/NetworkRequestHandler$ResponseException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 63
    return-void

    .line 64
    .line 65
    :goto_2
    :try_start_1
    iput-object v1, p0, Lcom/squareup/picasso/c;->q:Ljava/lang/Exception;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p0}, Lcom/squareup/picasso/i;->e(Lcom/squareup/picasso/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    :goto_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 78
    goto :goto_7

    .line 79
    .line 80
    :goto_4
    :try_start_2
    new-instance v2, Ljava/io/StringWriter;

    .line 81
    .line 82
    .line 83
    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 84
    .line 85
    iget-object v3, p0, Lcom/squareup/picasso/c;->f:Lcom/squareup/picasso/v;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Lcom/squareup/picasso/v;->a()Lcom/squareup/picasso/w;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    new-instance v4, Ljava/io/PrintWriter;

    .line 92
    .line 93
    .line 94
    invoke-direct {v4, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v4}, Lcom/squareup/picasso/w;->a(Ljava/io/PrintWriter;)V

    .line 98
    .line 99
    new-instance v3, Ljava/lang/RuntimeException;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    .line 106
    invoke-direct {v3, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    iput-object v3, p0, Lcom/squareup/picasso/c;->q:Ljava/lang/Exception;

    .line 109
    .line 110
    iget-object v1, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, p0}, Lcom/squareup/picasso/i;->e(Lcom/squareup/picasso/c;)V

    .line 114
    goto :goto_3

    .line 115
    .line 116
    :goto_5
    iput-object v1, p0, Lcom/squareup/picasso/c;->q:Ljava/lang/Exception;

    .line 117
    .line 118
    iget-object v1, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p0}, Lcom/squareup/picasso/i;->g(Lcom/squareup/picasso/c;)V

    .line 122
    goto :goto_3

    .line 123
    .line 124
    :goto_6
    iget v2, v1, Lcom/squareup/picasso/NetworkRequestHandler$ResponseException;->networkPolicy:I

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Lcom/squareup/picasso/NetworkPolicy;->isOfflineOnly(I)Z

    .line 128
    move-result v2

    .line 129
    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    iget v2, v1, Lcom/squareup/picasso/NetworkRequestHandler$ResponseException;->code:I

    .line 133
    .line 134
    const/16 v3, 0x1f8

    .line 135
    .line 136
    if-eq v2, v3, :cond_3

    .line 137
    .line 138
    :cond_2
    iput-object v1, p0, Lcom/squareup/picasso/c;->q:Ljava/lang/Exception;

    .line 139
    .line 140
    :cond_3
    iget-object v1, p0, Lcom/squareup/picasso/c;->d:Lcom/squareup/picasso/i;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p0}, Lcom/squareup/picasso/i;->e(Lcom/squareup/picasso/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    goto :goto_3

    .line 145
    :goto_7
    return-void

    .line 146
    .line 147
    .line 148
    :goto_8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 153
    throw v1
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
.end method

.method public s()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->n:Landroid/graphics/Bitmap;

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
.end method

.method public t()Landroid/graphics/Bitmap;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/c;->i:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/squareup/picasso/MemoryPolicy;->shouldReadFromMemoryCache(I)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/squareup/picasso/c;->e:Lcom/squareup/picasso/d;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/squareup/picasso/c;->g:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/squareup/picasso/d;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lcom/squareup/picasso/c;->f:Lcom/squareup/picasso/v;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/squareup/picasso/v;->d()V

    .line 24
    .line 25
    sget-object v1, Lcom/squareup/picasso/Picasso$LoadedFrom;->MEMORY:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/squareup/picasso/c;->p:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 30
    .line 31
    iget-boolean v1, v1, Lcom/squareup/picasso/Picasso;->n:Z

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const-string v1, "Hunter"

    .line 36
    .line 37
    const-string v2, "decoded"

    .line 38
    .line 39
    iget-object v3, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    const-string v4, "from cache"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2, v3, v4}, Lcom/squareup/picasso/y;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_0
    return-object v0

    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    .line 52
    :cond_2
    iget v1, p0, Lcom/squareup/picasso/c;->s:I

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    sget-object v1, Lcom/squareup/picasso/NetworkPolicy;->OFFLINE:Lcom/squareup/picasso/NetworkPolicy;

    .line 57
    .line 58
    iget v1, v1, Lcom/squareup/picasso/NetworkPolicy;->index:I

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_3
    iget v1, p0, Lcom/squareup/picasso/c;->j:I

    .line 62
    .line 63
    :goto_0
    iput v1, p0, Lcom/squareup/picasso/c;->j:I

    .line 64
    .line 65
    iget-object v2, p0, Lcom/squareup/picasso/c;->k:Lcom/squareup/picasso/t;

    .line 66
    .line 67
    iget-object v3, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3, v1}, Lcom/squareup/picasso/t;->f(Lcom/squareup/picasso/r;I)Lcom/squareup/picasso/t$a;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/squareup/picasso/t$a;->c()Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    iput-object v0, p0, Lcom/squareup/picasso/c;->p:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/squareup/picasso/t$a;->b()I

    .line 83
    move-result v0

    .line 84
    .line 85
    iput v0, p0, Lcom/squareup/picasso/c;->r:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/squareup/picasso/t$a;->a()Landroid/graphics/Bitmap;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/squareup/picasso/t$a;->d()Lokio/Source;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Lcom/squareup/picasso/c;->e(Lokio/Source;Lcom/squareup/picasso/r;)Landroid/graphics/Bitmap;

    .line 101
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    :try_start_1
    invoke-interface {v0}, Lokio/Source;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 105
    :catch_0
    move-object v0, v1

    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v1

    .line 108
    .line 109
    .line 110
    :try_start_2
    invoke-interface {v0}, Lokio/Source;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 111
    :catch_1
    throw v1

    .line 112
    .line 113
    :cond_4
    :goto_1
    if-eqz v0, :cond_a

    .line 114
    .line 115
    iget-object v1, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 116
    .line 117
    iget-boolean v1, v1, Lcom/squareup/picasso/Picasso;->n:Z

    .line 118
    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    const-string v1, "Hunter"

    .line 122
    .line 123
    const-string v2, "decoded"

    .line 124
    .line 125
    iget-object v3, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 129
    move-result-object v3

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v2, v3}, Lcom/squareup/picasso/y;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    :cond_5
    iget-object v1, p0, Lcom/squareup/picasso/c;->f:Lcom/squareup/picasso/v;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v0}, Lcom/squareup/picasso/v;->b(Landroid/graphics/Bitmap;)V

    .line 138
    .line 139
    iget-object v1, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/squareup/picasso/r;->f()Z

    .line 143
    move-result v1

    .line 144
    .line 145
    if-nez v1, :cond_6

    .line 146
    .line 147
    iget v1, p0, Lcom/squareup/picasso/c;->r:I

    .line 148
    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    :cond_6
    sget-object v1, Lcom/squareup/picasso/c;->u:Ljava/lang/Object;

    .line 152
    monitor-enter v1

    .line 153
    .line 154
    :try_start_3
    iget-object v2, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/squareup/picasso/r;->e()Z

    .line 158
    move-result v2

    .line 159
    .line 160
    if-nez v2, :cond_7

    .line 161
    .line 162
    iget v2, p0, Lcom/squareup/picasso/c;->r:I

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    goto :goto_2

    .line 166
    :catchall_1
    move-exception v0

    .line 167
    goto :goto_3

    .line 168
    .line 169
    :cond_7
    :goto_2
    iget-object v2, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 170
    .line 171
    iget v3, p0, Lcom/squareup/picasso/c;->r:I

    .line 172
    .line 173
    .line 174
    invoke-static {v2, v0, v3}, Lcom/squareup/picasso/c;->y(Lcom/squareup/picasso/r;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    iget-object v2, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 178
    .line 179
    iget-boolean v2, v2, Lcom/squareup/picasso/Picasso;->n:Z

    .line 180
    .line 181
    if-eqz v2, :cond_8

    .line 182
    .line 183
    const-string v2, "Hunter"

    .line 184
    .line 185
    .line 186
    const-string/jumbo v3, "transformed"

    .line 187
    .line 188
    iget-object v4, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 192
    move-result-object v4

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v3, v4}, Lcom/squareup/picasso/y;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    :cond_8
    iget-object v2, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Lcom/squareup/picasso/r;->b()Z

    .line 201
    move-result v2

    .line 202
    .line 203
    if-eqz v2, :cond_9

    .line 204
    .line 205
    iget-object v2, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 206
    .line 207
    iget-object v2, v2, Lcom/squareup/picasso/r;->g:Ljava/util/List;

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v0}, Lcom/squareup/picasso/c;->a(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 211
    move-result-object v0

    .line 212
    .line 213
    iget-object v2, p0, Lcom/squareup/picasso/c;->c:Lcom/squareup/picasso/Picasso;

    .line 214
    .line 215
    iget-boolean v2, v2, Lcom/squareup/picasso/Picasso;->n:Z

    .line 216
    .line 217
    if-eqz v2, :cond_9

    .line 218
    .line 219
    const-string v2, "Hunter"

    .line 220
    .line 221
    .line 222
    const-string/jumbo v3, "transformed"

    .line 223
    .line 224
    iget-object v4, p0, Lcom/squareup/picasso/c;->h:Lcom/squareup/picasso/r;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Lcom/squareup/picasso/r;->d()Ljava/lang/String;

    .line 228
    move-result-object v4

    .line 229
    .line 230
    const-string v5, "from custom transformations"

    .line 231
    .line 232
    .line 233
    invoke-static {v2, v3, v4, v5}, Lcom/squareup/picasso/y;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    :cond_9
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 235
    .line 236
    if-eqz v0, :cond_a

    .line 237
    .line 238
    iget-object v1, p0, Lcom/squareup/picasso/c;->f:Lcom/squareup/picasso/v;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v0}, Lcom/squareup/picasso/v;->c(Landroid/graphics/Bitmap;)V

    .line 242
    goto :goto_4

    .line 243
    :goto_3
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 244
    throw v0

    .line 245
    :cond_a
    :goto_4
    return-object v0
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
.end method

.method public u()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->o:Ljava/util/concurrent/Future;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method public w(ZLandroid/net/NetworkInfo;)Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/picasso/c;->s:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    iput v0, p0, Lcom/squareup/picasso/c;->s:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/squareup/picasso/c;->k:Lcom/squareup/picasso/t;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/squareup/picasso/t;->h(ZLandroid/net/NetworkInfo;)Z

    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
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
.end method

.method public x()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/picasso/c;->k:Lcom/squareup/picasso/t;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/squareup/picasso/t;->i()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
