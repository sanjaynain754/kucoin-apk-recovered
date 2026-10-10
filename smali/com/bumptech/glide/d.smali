.class public final Lcom/bumptech/glide/d;
.super Ljava/lang/Object;
.source "GlideBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/d$d;,
        Lcom/bumptech/glide/d$c;,
        Lcom/bumptech/glide/d$e;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/i<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/bumptech/glide/f$a;

.field public c:Lcom/bumptech/glide/load/engine/f;

.field public d:Lw1/d;

.field public e:Lw1/b;

.field public f:Lx1/h;

.field public g:Ly1/a;

.field public h:Ly1/a;

.field public i:Lx1/a$a;

.field public j:Lx1/i;

.field public k:Li2/d;

.field public l:I

.field public m:Lcom/bumptech/glide/c$a;

.field public n:Li2/p$b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public o:Ly1/a;

.field public p:Z

.field public q:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll2/e<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroidx/collection/ArrayMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/bumptech/glide/d;->a:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Lcom/bumptech/glide/f$a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/bumptech/glide/f$a;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/f$a;

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    iput v0, p0, Lcom/bumptech/glide/d;->l:I

    .line 21
    .line 22
    new-instance v0, Lcom/bumptech/glide/d$a;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/bumptech/glide/d$a;-><init>(Lcom/bumptech/glide/d;)V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/bumptech/glide/d;->m:Lcom/bumptech/glide/c$a;

    .line 28
    return-void
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
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/bumptech/glide/c;
    .locals 14
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/d;->g:Ly1/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ly1/a;->g()Ly1/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/bumptech/glide/d;->g:Ly1/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/d;->h:Ly1/a;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ly1/a;->e()Ly1/a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/bumptech/glide/d;->h:Ly1/a;

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/d;->o:Ly1/a;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ly1/a;->c()Ly1/a;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iput-object v0, p0, Lcom/bumptech/glide/d;->o:Ly1/a;

    .line 31
    .line 32
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/d;->j:Lx1/i;

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    new-instance v0, Lx1/i$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p1}, Lx1/i$a;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lx1/i$a;->a()Lx1/i;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    iput-object v0, p0, Lcom/bumptech/glide/d;->j:Lx1/i;

    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/d;->k:Li2/d;

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    new-instance v0, Li2/f;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Li2/f;-><init>()V

    .line 55
    .line 56
    iput-object v0, p0, Lcom/bumptech/glide/d;->k:Li2/d;

    .line 57
    .line 58
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/d;->d:Lw1/d;

    .line 59
    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    iget-object v0, p0, Lcom/bumptech/glide/d;->j:Lx1/i;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lx1/i;->b()I

    .line 66
    move-result v0

    .line 67
    .line 68
    if-lez v0, :cond_5

    .line 69
    .line 70
    new-instance v1, Lw1/j;

    .line 71
    int-to-long v2, v0

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v2, v3}, Lw1/j;-><init>(J)V

    .line 75
    .line 76
    iput-object v1, p0, Lcom/bumptech/glide/d;->d:Lw1/d;

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_5
    new-instance v0, Lw1/e;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Lw1/e;-><init>()V

    .line 83
    .line 84
    iput-object v0, p0, Lcom/bumptech/glide/d;->d:Lw1/d;

    .line 85
    .line 86
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/d;->e:Lw1/b;

    .line 87
    .line 88
    if-nez v0, :cond_7

    .line 89
    .line 90
    new-instance v0, Lw1/i;

    .line 91
    .line 92
    iget-object v1, p0, Lcom/bumptech/glide/d;->j:Lx1/i;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lx1/i;->a()I

    .line 96
    move-result v1

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, v1}, Lw1/i;-><init>(I)V

    .line 100
    .line 101
    iput-object v0, p0, Lcom/bumptech/glide/d;->e:Lw1/b;

    .line 102
    .line 103
    :cond_7
    iget-object v0, p0, Lcom/bumptech/glide/d;->f:Lx1/h;

    .line 104
    .line 105
    if-nez v0, :cond_8

    .line 106
    .line 107
    new-instance v0, Lx1/g;

    .line 108
    .line 109
    iget-object v1, p0, Lcom/bumptech/glide/d;->j:Lx1/i;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lx1/i;->d()I

    .line 113
    move-result v1

    .line 114
    int-to-long v1, v1

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, v1, v2}, Lx1/g;-><init>(J)V

    .line 118
    .line 119
    iput-object v0, p0, Lcom/bumptech/glide/d;->f:Lx1/h;

    .line 120
    .line 121
    :cond_8
    iget-object v0, p0, Lcom/bumptech/glide/d;->i:Lx1/a$a;

    .line 122
    .line 123
    if-nez v0, :cond_9

    .line 124
    .line 125
    new-instance v0, Lx1/f;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, p1}, Lx1/f;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    iput-object v0, p0, Lcom/bumptech/glide/d;->i:Lx1/a$a;

    .line 131
    .line 132
    :cond_9
    iget-object v0, p0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/engine/f;

    .line 133
    .line 134
    if-nez v0, :cond_a

    .line 135
    .line 136
    new-instance v1, Lcom/bumptech/glide/load/engine/f;

    .line 137
    .line 138
    iget-object v2, p0, Lcom/bumptech/glide/d;->f:Lx1/h;

    .line 139
    .line 140
    iget-object v3, p0, Lcom/bumptech/glide/d;->i:Lx1/a$a;

    .line 141
    .line 142
    iget-object v4, p0, Lcom/bumptech/glide/d;->h:Ly1/a;

    .line 143
    .line 144
    iget-object v5, p0, Lcom/bumptech/glide/d;->g:Ly1/a;

    .line 145
    .line 146
    .line 147
    invoke-static {}, Ly1/a;->h()Ly1/a;

    .line 148
    move-result-object v6

    .line 149
    .line 150
    iget-object v7, p0, Lcom/bumptech/glide/d;->o:Ly1/a;

    .line 151
    .line 152
    iget-boolean v8, p0, Lcom/bumptech/glide/d;->p:Z

    .line 153
    .line 154
    .line 155
    invoke-direct/range {v1 .. v8}, Lcom/bumptech/glide/load/engine/f;-><init>(Lx1/h;Lx1/a$a;Ly1/a;Ly1/a;Ly1/a;Ly1/a;Z)V

    .line 156
    .line 157
    iput-object v1, p0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/engine/f;

    .line 158
    .line 159
    :cond_a
    iget-object v0, p0, Lcom/bumptech/glide/d;->q:Ljava/util/List;

    .line 160
    .line 161
    if-nez v0, :cond_b

    .line 162
    .line 163
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 164
    .line 165
    iput-object v0, p0, Lcom/bumptech/glide/d;->q:Ljava/util/List;

    .line 166
    goto :goto_1

    .line 167
    .line 168
    .line 169
    :cond_b
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 170
    move-result-object v0

    .line 171
    .line 172
    iput-object v0, p0, Lcom/bumptech/glide/d;->q:Ljava/util/List;

    .line 173
    .line 174
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/f$a;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/bumptech/glide/f$a;->b()Lcom/bumptech/glide/f;

    .line 178
    move-result-object v13

    .line 179
    .line 180
    new-instance v7, Li2/p;

    .line 181
    .line 182
    iget-object v0, p0, Lcom/bumptech/glide/d;->n:Li2/p$b;

    .line 183
    .line 184
    .line 185
    invoke-direct {v7, v0, v13}, Li2/p;-><init>(Li2/p$b;Lcom/bumptech/glide/f;)V

    .line 186
    .line 187
    new-instance v1, Lcom/bumptech/glide/c;

    .line 188
    .line 189
    iget-object v3, p0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/engine/f;

    .line 190
    .line 191
    iget-object v4, p0, Lcom/bumptech/glide/d;->f:Lx1/h;

    .line 192
    .line 193
    iget-object v5, p0, Lcom/bumptech/glide/d;->d:Lw1/d;

    .line 194
    .line 195
    iget-object v6, p0, Lcom/bumptech/glide/d;->e:Lw1/b;

    .line 196
    .line 197
    iget-object v8, p0, Lcom/bumptech/glide/d;->k:Li2/d;

    .line 198
    .line 199
    iget v9, p0, Lcom/bumptech/glide/d;->l:I

    .line 200
    .line 201
    iget-object v10, p0, Lcom/bumptech/glide/d;->m:Lcom/bumptech/glide/c$a;

    .line 202
    .line 203
    iget-object v11, p0, Lcom/bumptech/glide/d;->a:Ljava/util/Map;

    .line 204
    .line 205
    iget-object v12, p0, Lcom/bumptech/glide/d;->q:Ljava/util/List;

    .line 206
    move-object v2, p1

    .line 207
    .line 208
    .line 209
    invoke-direct/range {v1 .. v13}, Lcom/bumptech/glide/c;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/f;Lx1/h;Lw1/d;Lw1/b;Li2/p;Li2/d;ILcom/bumptech/glide/c$a;Ljava/util/Map;Ljava/util/List;Lcom/bumptech/glide/f;)V

    .line 210
    return-object v1
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
.end method

.method public b(Lcom/bumptech/glide/c$a;)Lcom/bumptech/glide/d;
    .locals 0
    .param p1    # Lcom/bumptech/glide/c$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Lcom/bumptech/glide/c$a;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bumptech/glide/d;->m:Lcom/bumptech/glide/c$a;

    .line 9
    return-object p0
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

.method public c(Ll2/f;)Lcom/bumptech/glide/d;
    .locals 1
    .param p1    # Ll2/f;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/bumptech/glide/d$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/bumptech/glide/d$b;-><init>(Lcom/bumptech/glide/d;Ll2/f;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/d;->b(Lcom/bumptech/glide/c$a;)Lcom/bumptech/glide/d;

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
.end method

.method public d(I)Lcom/bumptech/glide/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    const/4 v0, 0x6

    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/bumptech/glide/d;->l:I

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR"

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    throw p1
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

.method public e(Lx1/h;)Lcom/bumptech/glide/d;
    .locals 0
    .param p1    # Lx1/h;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/bumptech/glide/d;->f:Lx1/h;

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

.method public f(Li2/p$b;)V
    .locals 0
    .param p1    # Li2/p$b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/bumptech/glide/d;->n:Li2/p$b;

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
.end method
