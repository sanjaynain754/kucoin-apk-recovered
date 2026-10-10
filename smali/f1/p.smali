.class public Lf1/p;
.super Ljava/lang/Object;
.source "TransformKeyframeAnimation.java"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/Matrix;

.field public final e:[F

.field public f:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Lp1/d;",
            "Lp1/d;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lf1/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public l:Lf1/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public m:Lf1/a;
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

.field public n:Lf1/a;
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

.field public final o:Z


# direct methods
.method public constructor <init>(Li1/l;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Li1/l;->c()Li1/e;

    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    move-object v0, v1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Li1/l;->c()Li1/e;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Li1/e;->a()Lf1/a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    :goto_0
    iput-object v0, p0, Lf1/p;->f:Lf1/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Li1/l;->f()Li1/m;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    move-object v0, v1

    .line 37
    goto :goto_1

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p1}, Li1/l;->f()Li1/m;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Li1/m;->a()Lf1/a;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    :goto_1
    iput-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Li1/l;->h()Li1/g;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    move-object v0, v1

    .line 55
    goto :goto_2

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p1}, Li1/l;->h()Li1/g;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Li1/g;->a()Lf1/a;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    :goto_2
    iput-object v0, p0, Lf1/p;->h:Lf1/a;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Li1/l;->g()Li1/b;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-nez v0, :cond_3

    .line 72
    move-object v0, v1

    .line 73
    goto :goto_3

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Li1/l;->g()Li1/b;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Li1/b;->a()Lf1/a;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    :goto_3
    iput-object v0, p0, Lf1/p;->i:Lf1/a;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Li1/l;->i()Li1/b;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    move-object v0, v1

    .line 91
    goto :goto_4

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-virtual {p1}, Li1/l;->i()Li1/b;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Li1/b;->a()Lf1/a;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    check-cast v0, Lf1/d;

    .line 102
    .line 103
    :goto_4
    iput-object v0, p0, Lf1/p;->k:Lf1/d;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Li1/l;->l()Z

    .line 107
    move-result v0

    .line 108
    .line 109
    iput-boolean v0, p0, Lf1/p;->o:Z

    .line 110
    .line 111
    iget-object v0, p0, Lf1/p;->k:Lf1/d;

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    new-instance v0, Landroid/graphics/Matrix;

    .line 116
    .line 117
    .line 118
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 119
    .line 120
    iput-object v0, p0, Lf1/p;->b:Landroid/graphics/Matrix;

    .line 121
    .line 122
    new-instance v0, Landroid/graphics/Matrix;

    .line 123
    .line 124
    .line 125
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 126
    .line 127
    iput-object v0, p0, Lf1/p;->c:Landroid/graphics/Matrix;

    .line 128
    .line 129
    new-instance v0, Landroid/graphics/Matrix;

    .line 130
    .line 131
    .line 132
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 133
    .line 134
    iput-object v0, p0, Lf1/p;->d:Landroid/graphics/Matrix;

    .line 135
    .line 136
    const/16 v0, 0x9

    .line 137
    .line 138
    new-array v0, v0, [F

    .line 139
    .line 140
    iput-object v0, p0, Lf1/p;->e:[F

    .line 141
    goto :goto_5

    .line 142
    .line 143
    :cond_5
    iput-object v1, p0, Lf1/p;->b:Landroid/graphics/Matrix;

    .line 144
    .line 145
    iput-object v1, p0, Lf1/p;->c:Landroid/graphics/Matrix;

    .line 146
    .line 147
    iput-object v1, p0, Lf1/p;->d:Landroid/graphics/Matrix;

    .line 148
    .line 149
    iput-object v1, p0, Lf1/p;->e:[F

    .line 150
    .line 151
    .line 152
    :goto_5
    invoke-virtual {p1}, Li1/l;->j()Li1/b;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    if-nez v0, :cond_6

    .line 156
    move-object v0, v1

    .line 157
    goto :goto_6

    .line 158
    .line 159
    .line 160
    :cond_6
    invoke-virtual {p1}, Li1/l;->j()Li1/b;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Li1/b;->a()Lf1/a;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    check-cast v0, Lf1/d;

    .line 168
    .line 169
    :goto_6
    iput-object v0, p0, Lf1/p;->l:Lf1/d;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Li1/l;->e()Li1/d;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Li1/l;->e()Li1/d;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Li1/d;->a()Lf1/a;

    .line 183
    move-result-object v0

    .line 184
    .line 185
    iput-object v0, p0, Lf1/p;->j:Lf1/a;

    .line 186
    .line 187
    .line 188
    :cond_7
    invoke-virtual {p1}, Li1/l;->k()Li1/b;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-eqz v0, :cond_8

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Li1/l;->k()Li1/b;

    .line 195
    move-result-object v0

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Li1/b;->a()Lf1/a;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    iput-object v0, p0, Lf1/p;->m:Lf1/a;

    .line 202
    goto :goto_7

    .line 203
    .line 204
    :cond_8
    iput-object v1, p0, Lf1/p;->m:Lf1/a;

    .line 205
    .line 206
    .line 207
    :goto_7
    invoke-virtual {p1}, Li1/l;->d()Li1/b;

    .line 208
    move-result-object v0

    .line 209
    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Li1/l;->d()Li1/b;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Li1/b;->a()Lf1/a;

    .line 218
    move-result-object p1

    .line 219
    .line 220
    iput-object p1, p0, Lf1/p;->n:Lf1/a;

    .line 221
    return-void

    .line 222
    .line 223
    :cond_9
    iput-object v1, p0, Lf1/p;->n:Lf1/a;

    .line 224
    return-void
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


# virtual methods
.method public a(Lcom/airbnb/lottie/model/layer/a;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->j:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 6
    .line 7
    iget-object v0, p0, Lf1/p;->m:Lf1/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 11
    .line 12
    iget-object v0, p0, Lf1/p;->n:Lf1/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 16
    .line 17
    iget-object v0, p0, Lf1/p;->f:Lf1/a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 21
    .line 22
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 26
    .line 27
    iget-object v0, p0, Lf1/p;->h:Lf1/a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 31
    .line 32
    iget-object v0, p0, Lf1/p;->i:Lf1/a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 36
    .line 37
    iget-object v0, p0, Lf1/p;->k:Lf1/d;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 41
    .line 42
    iget-object v0, p0, Lf1/p;->l:Lf1/d;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 46
    return-void
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

.method public b(Lf1/a$b;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->j:Lf1/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lf1/p;->m:Lf1/a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lf1/p;->n:Lf1/a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lf1/p;->f:Lf1/a;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 29
    .line 30
    :cond_3
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 36
    .line 37
    :cond_4
    iget-object v0, p0, Lf1/p;->h:Lf1/a;

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 43
    .line 44
    :cond_5
    iget-object v0, p0, Lf1/p;->i:Lf1/a;

    .line 45
    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 50
    .line 51
    :cond_6
    iget-object v0, p0, Lf1/p;->k:Lf1/d;

    .line 52
    .line 53
    if-eqz v0, :cond_7

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 57
    .line 58
    :cond_7
    iget-object v0, p0, Lf1/p;->l:Lf1/d;

    .line 59
    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lf1/a;->a(Lf1/a$b;)V

    .line 64
    :cond_8
    return-void
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

.method public c(Ljava/lang/Object;Lp1/c;)Z
    .locals 3
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
            "TT;>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/airbnb/lottie/m0;->f:Landroid/graphics/PointF;

    .line 3
    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lf1/p;->f:Lf1/a;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lf1/q;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/PointF;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 19
    .line 20
    iput-object p1, p0, Lf1/p;->f:Lf1/a;

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_1
    sget-object v0, Lcom/airbnb/lottie/m0;->g:Landroid/graphics/PointF;

    .line 30
    .line 31
    if-ne p1, v0, :cond_3

    .line 32
    .line 33
    iget-object p1, p0, Lf1/p;->g:Lf1/a;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    new-instance p1, Lf1/q;

    .line 38
    .line 39
    new-instance v0, Landroid/graphics/PointF;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 46
    .line 47
    iput-object p1, p0, Lf1/p;->g:Lf1/a;

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_3
    sget-object v0, Lcom/airbnb/lottie/m0;->h:Ljava/lang/Float;

    .line 57
    .line 58
    if-ne p1, v0, :cond_4

    .line 59
    .line 60
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 61
    .line 62
    instance-of v1, v0, Lf1/n;

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    check-cast v0, Lf1/n;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Lf1/n;->s(Lp1/c;)V

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_4
    sget-object v0, Lcom/airbnb/lottie/m0;->i:Ljava/lang/Float;

    .line 74
    .line 75
    if-ne p1, v0, :cond_5

    .line 76
    .line 77
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 78
    .line 79
    instance-of v1, v0, Lf1/n;

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    check-cast v0, Lf1/n;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p2}, Lf1/n;->t(Lp1/c;)V

    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :cond_5
    sget-object v0, Lcom/airbnb/lottie/m0;->o:Lp1/d;

    .line 91
    .line 92
    if-ne p1, v0, :cond_7

    .line 93
    .line 94
    iget-object p1, p0, Lf1/p;->h:Lf1/a;

    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    new-instance p1, Lf1/q;

    .line 99
    .line 100
    new-instance v0, Lp1/d;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Lp1/d;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 107
    .line 108
    iput-object p1, p0, Lf1/p;->h:Lf1/a;

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    .line 113
    :cond_6
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 114
    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    :cond_7
    sget-object v0, Lcom/airbnb/lottie/m0;->p:Ljava/lang/Float;

    .line 118
    const/4 v1, 0x0

    .line 119
    .line 120
    if-ne p1, v0, :cond_9

    .line 121
    .line 122
    iget-object p1, p0, Lf1/p;->i:Lf1/a;

    .line 123
    .line 124
    if-nez p1, :cond_8

    .line 125
    .line 126
    new-instance p1, Lf1/q;

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 134
    .line 135
    iput-object p1, p0, Lf1/p;->i:Lf1/a;

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    .line 140
    :cond_8
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_9
    sget-object v0, Lcom/airbnb/lottie/m0;->c:Ljava/lang/Integer;

    .line 145
    .line 146
    if-ne p1, v0, :cond_b

    .line 147
    .line 148
    iget-object p1, p0, Lf1/p;->j:Lf1/a;

    .line 149
    .line 150
    if-nez p1, :cond_a

    .line 151
    .line 152
    new-instance p1, Lf1/q;

    .line 153
    .line 154
    const/16 v0, 0x64

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 162
    .line 163
    iput-object p1, p0, Lf1/p;->j:Lf1/a;

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    .line 168
    :cond_a
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_b
    sget-object v0, Lcom/airbnb/lottie/m0;->C:Ljava/lang/Float;

    .line 173
    .line 174
    const/high16 v2, 0x42c80000    # 100.0f

    .line 175
    .line 176
    if-ne p1, v0, :cond_d

    .line 177
    .line 178
    iget-object p1, p0, Lf1/p;->m:Lf1/a;

    .line 179
    .line 180
    if-nez p1, :cond_c

    .line 181
    .line 182
    new-instance p1, Lf1/q;

    .line 183
    .line 184
    .line 185
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    .line 189
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 190
    .line 191
    iput-object p1, p0, Lf1/p;->m:Lf1/a;

    .line 192
    goto :goto_0

    .line 193
    .line 194
    .line 195
    :cond_c
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 196
    goto :goto_0

    .line 197
    .line 198
    :cond_d
    sget-object v0, Lcom/airbnb/lottie/m0;->D:Ljava/lang/Float;

    .line 199
    .line 200
    if-ne p1, v0, :cond_f

    .line 201
    .line 202
    iget-object p1, p0, Lf1/p;->n:Lf1/a;

    .line 203
    .line 204
    if-nez p1, :cond_e

    .line 205
    .line 206
    new-instance p1, Lf1/q;

    .line 207
    .line 208
    .line 209
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    .line 213
    invoke-direct {p1, p2, v0}, Lf1/q;-><init>(Lp1/c;Ljava/lang/Object;)V

    .line 214
    .line 215
    iput-object p1, p0, Lf1/p;->n:Lf1/a;

    .line 216
    goto :goto_0

    .line 217
    .line 218
    .line 219
    :cond_e
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 220
    goto :goto_0

    .line 221
    .line 222
    :cond_f
    sget-object v0, Lcom/airbnb/lottie/m0;->q:Ljava/lang/Float;

    .line 223
    .line 224
    if-ne p1, v0, :cond_11

    .line 225
    .line 226
    iget-object p1, p0, Lf1/p;->k:Lf1/d;

    .line 227
    .line 228
    if-nez p1, :cond_10

    .line 229
    .line 230
    new-instance p1, Lf1/d;

    .line 231
    .line 232
    new-instance v0, Lp1/a;

    .line 233
    .line 234
    .line 235
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    .line 239
    invoke-direct {v0, v1}, Lp1/a;-><init>(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    .line 246
    invoke-direct {p1, v0}, Lf1/d;-><init>(Ljava/util/List;)V

    .line 247
    .line 248
    iput-object p1, p0, Lf1/p;->k:Lf1/d;

    .line 249
    .line 250
    :cond_10
    iget-object p1, p0, Lf1/p;->k:Lf1/d;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 254
    goto :goto_0

    .line 255
    .line 256
    :cond_11
    sget-object v0, Lcom/airbnb/lottie/m0;->r:Ljava/lang/Float;

    .line 257
    .line 258
    if-ne p1, v0, :cond_13

    .line 259
    .line 260
    iget-object p1, p0, Lf1/p;->l:Lf1/d;

    .line 261
    .line 262
    if-nez p1, :cond_12

    .line 263
    .line 264
    new-instance p1, Lf1/d;

    .line 265
    .line 266
    new-instance v0, Lp1/a;

    .line 267
    .line 268
    .line 269
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 270
    move-result-object v1

    .line 271
    .line 272
    .line 273
    invoke-direct {v0, v1}, Lp1/a;-><init>(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 277
    move-result-object v0

    .line 278
    .line 279
    .line 280
    invoke-direct {p1, v0}, Lf1/d;-><init>(Ljava/util/List;)V

    .line 281
    .line 282
    iput-object p1, p0, Lf1/p;->l:Lf1/d;

    .line 283
    .line 284
    :cond_12
    iget-object p1, p0, Lf1/p;->l:Lf1/d;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 288
    :goto_0
    const/4 p1, 0x1

    .line 289
    return p1

    .line 290
    :cond_13
    const/4 p1, 0x0

    .line 291
    return p1
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

.method public final d()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    const/16 v1, 0x9

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lf1/p;->e:[F

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    aput v2, v1, v0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e()Lf1/a;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->n:Lf1/a;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public f()Landroid/graphics/Matrix;
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 6
    .line 7
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    check-cast v2, Landroid/graphics/PointF;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 21
    .line 22
    cmpl-float v4, v3, v1

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget v4, v2, Landroid/graphics/PointF;->y:F

    .line 27
    .line 28
    cmpl-float v4, v4, v1

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    :cond_0
    iget-object v4, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 33
    .line 34
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v3, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 38
    .line 39
    :cond_1
    iget-boolean v2, p0, Lf1/p;->o:Z

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lf1/a;->f()F

    .line 47
    move-result v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    check-cast v3, Landroid/graphics/PointF;

    .line 54
    .line 55
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 56
    .line 57
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 58
    .line 59
    .line 60
    const v5, 0x38d1b717    # 1.0E-4f

    .line 61
    add-float/2addr v5, v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v5}, Lf1/a;->n(F)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 68
    move-result-object v5

    .line 69
    .line 70
    check-cast v5, Landroid/graphics/PointF;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Lf1/a;->n(F)V

    .line 74
    .line 75
    iget v0, v5, Landroid/graphics/PointF;->y:F

    .line 76
    sub-float/2addr v0, v3

    .line 77
    float-to-double v2, v0

    .line 78
    .line 79
    iget v0, v5, Landroid/graphics/PointF;->x:F

    .line 80
    sub-float/2addr v0, v4

    .line 81
    float-to-double v4, v0

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 85
    move-result-wide v2

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 89
    move-result-wide v2

    .line 90
    .line 91
    iget-object v0, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 92
    double-to-float v2, v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 96
    goto :goto_1

    .line 97
    .line 98
    :cond_2
    iget-object v0, p0, Lf1/p;->i:Lf1/a;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    instance-of v2, v0, Lf1/q;

    .line 103
    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    check-cast v0, Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 114
    move-result v0

    .line 115
    goto :goto_0

    .line 116
    .line 117
    :cond_3
    check-cast v0, Lf1/d;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lf1/d;->q()F

    .line 121
    move-result v0

    .line 122
    .line 123
    :goto_0
    cmpl-float v2, v0, v1

    .line 124
    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    iget-object v2, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 131
    .line 132
    :cond_4
    :goto_1
    iget-object v0, p0, Lf1/p;->k:Lf1/d;

    .line 133
    .line 134
    const/high16 v2, 0x3f800000    # 1.0f

    .line 135
    .line 136
    if-eqz v0, :cond_7

    .line 137
    .line 138
    iget-object v3, p0, Lf1/p;->l:Lf1/d;

    .line 139
    .line 140
    const/high16 v4, 0x42b40000    # 90.0f

    .line 141
    .line 142
    if-nez v3, :cond_5

    .line 143
    move v3, v1

    .line 144
    goto :goto_2

    .line 145
    .line 146
    .line 147
    :cond_5
    invoke-virtual {v3}, Lf1/d;->q()F

    .line 148
    move-result v3

    .line 149
    neg-float v3, v3

    .line 150
    add-float/2addr v3, v4

    .line 151
    float-to-double v5, v3

    .line 152
    .line 153
    .line 154
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 155
    move-result-wide v5

    .line 156
    .line 157
    .line 158
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 159
    move-result-wide v5

    .line 160
    double-to-float v3, v5

    .line 161
    .line 162
    :goto_2
    iget-object v5, p0, Lf1/p;->l:Lf1/d;

    .line 163
    .line 164
    if-nez v5, :cond_6

    .line 165
    move v4, v2

    .line 166
    goto :goto_3

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {v5}, Lf1/d;->q()F

    .line 170
    move-result v5

    .line 171
    neg-float v5, v5

    .line 172
    add-float/2addr v5, v4

    .line 173
    float-to-double v4, v5

    .line 174
    .line 175
    .line 176
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 177
    move-result-wide v4

    .line 178
    .line 179
    .line 180
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 181
    move-result-wide v4

    .line 182
    double-to-float v4, v4

    .line 183
    .line 184
    .line 185
    :goto_3
    invoke-virtual {v0}, Lf1/d;->q()F

    .line 186
    move-result v0

    .line 187
    float-to-double v5, v0

    .line 188
    .line 189
    .line 190
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 191
    move-result-wide v5

    .line 192
    .line 193
    .line 194
    invoke-static {v5, v6}, Ljava/lang/Math;->tan(D)D

    .line 195
    move-result-wide v5

    .line 196
    double-to-float v0, v5

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lf1/p;->d()V

    .line 200
    .line 201
    iget-object v5, p0, Lf1/p;->e:[F

    .line 202
    const/4 v6, 0x0

    .line 203
    .line 204
    aput v3, v5, v6

    .line 205
    const/4 v7, 0x1

    .line 206
    .line 207
    aput v4, v5, v7

    .line 208
    neg-float v8, v4

    .line 209
    const/4 v9, 0x3

    .line 210
    .line 211
    aput v8, v5, v9

    .line 212
    const/4 v10, 0x4

    .line 213
    .line 214
    aput v3, v5, v10

    .line 215
    .line 216
    const/16 v11, 0x8

    .line 217
    .line 218
    aput v2, v5, v11

    .line 219
    .line 220
    iget-object v12, p0, Lf1/p;->b:Landroid/graphics/Matrix;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v5}, Landroid/graphics/Matrix;->setValues([F)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Lf1/p;->d()V

    .line 227
    .line 228
    iget-object v5, p0, Lf1/p;->e:[F

    .line 229
    .line 230
    aput v2, v5, v6

    .line 231
    .line 232
    aput v0, v5, v9

    .line 233
    .line 234
    aput v2, v5, v10

    .line 235
    .line 236
    aput v2, v5, v11

    .line 237
    .line 238
    iget-object v0, p0, Lf1/p;->c:Landroid/graphics/Matrix;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v5}, Landroid/graphics/Matrix;->setValues([F)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Lf1/p;->d()V

    .line 245
    .line 246
    iget-object v0, p0, Lf1/p;->e:[F

    .line 247
    .line 248
    aput v3, v0, v6

    .line 249
    .line 250
    aput v8, v0, v7

    .line 251
    .line 252
    aput v4, v0, v9

    .line 253
    .line 254
    aput v3, v0, v10

    .line 255
    .line 256
    aput v2, v0, v11

    .line 257
    .line 258
    iget-object v3, p0, Lf1/p;->d:Landroid/graphics/Matrix;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 262
    .line 263
    iget-object v0, p0, Lf1/p;->c:Landroid/graphics/Matrix;

    .line 264
    .line 265
    iget-object v3, p0, Lf1/p;->b:Landroid/graphics/Matrix;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 269
    .line 270
    iget-object v0, p0, Lf1/p;->d:Landroid/graphics/Matrix;

    .line 271
    .line 272
    iget-object v3, p0, Lf1/p;->c:Landroid/graphics/Matrix;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 276
    .line 277
    iget-object v0, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 278
    .line 279
    iget-object v3, p0, Lf1/p;->d:Landroid/graphics/Matrix;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 283
    .line 284
    :cond_7
    iget-object v0, p0, Lf1/p;->h:Lf1/a;

    .line 285
    .line 286
    if-eqz v0, :cond_9

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 290
    move-result-object v0

    .line 291
    .line 292
    check-cast v0, Lp1/d;

    .line 293
    .line 294
    if-eqz v0, :cond_9

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lp1/d;->b()F

    .line 298
    move-result v3

    .line 299
    .line 300
    cmpl-float v3, v3, v2

    .line 301
    .line 302
    if-nez v3, :cond_8

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Lp1/d;->c()F

    .line 306
    move-result v3

    .line 307
    .line 308
    cmpl-float v2, v3, v2

    .line 309
    .line 310
    if-eqz v2, :cond_9

    .line 311
    .line 312
    :cond_8
    iget-object v2, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Lp1/d;->b()F

    .line 316
    move-result v3

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Lp1/d;->c()F

    .line 320
    move-result v0

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v3, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 324
    .line 325
    :cond_9
    iget-object v0, p0, Lf1/p;->f:Lf1/a;

    .line 326
    .line 327
    if-eqz v0, :cond_b

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 331
    move-result-object v0

    .line 332
    .line 333
    check-cast v0, Landroid/graphics/PointF;

    .line 334
    .line 335
    if-eqz v0, :cond_b

    .line 336
    .line 337
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 338
    .line 339
    cmpl-float v3, v2, v1

    .line 340
    .line 341
    if-nez v3, :cond_a

    .line 342
    .line 343
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 344
    .line 345
    cmpl-float v1, v3, v1

    .line 346
    .line 347
    if-eqz v1, :cond_b

    .line 348
    .line 349
    :cond_a
    iget-object v1, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 350
    neg-float v2, v2

    .line 351
    .line 352
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 353
    neg-float v0, v0

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 357
    .line 358
    :cond_b
    iget-object v0, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 359
    return-object v0
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

.method public g(F)Landroid/graphics/Matrix;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/PointF;

    .line 14
    .line 15
    :goto_0
    iget-object v2, p0, Lf1/p;->h:Lf1/a;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    move-object v2, v1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lp1/d;

    .line 26
    .line 27
    :goto_1
    iget-object v3, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v3, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 35
    .line 36
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 37
    mul-float/2addr v4, p1

    .line 38
    .line 39
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 40
    mul-float/2addr v0, p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 44
    .line 45
    :cond_2
    if-eqz v2, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lp1/d;->b()F

    .line 51
    move-result v3

    .line 52
    float-to-double v3, v3

    .line 53
    float-to-double v5, p1

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 57
    move-result-wide v3

    .line 58
    double-to-float v3, v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lp1/d;->c()F

    .line 62
    move-result v2

    .line 63
    float-to-double v7, v2

    .line 64
    .line 65
    .line 66
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 67
    move-result-wide v4

    .line 68
    double-to-float v2, v4

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 72
    .line 73
    :cond_3
    iget-object v0, p0, Lf1/p;->i:Lf1/a;

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    check-cast v0, Ljava/lang/Float;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 85
    move-result v0

    .line 86
    .line 87
    iget-object v2, p0, Lf1/p;->f:Lf1/a;

    .line 88
    .line 89
    if-nez v2, :cond_4

    .line 90
    goto :goto_2

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    check-cast v1, Landroid/graphics/PointF;

    .line 97
    .line 98
    :goto_2
    iget-object v2, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 99
    mul-float/2addr v0, p1

    .line 100
    const/4 p1, 0x0

    .line 101
    .line 102
    if-nez v1, :cond_5

    .line 103
    move v3, p1

    .line 104
    goto :goto_3

    .line 105
    .line 106
    :cond_5
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 107
    .line 108
    :goto_3
    if-nez v1, :cond_6

    .line 109
    goto :goto_4

    .line 110
    .line 111
    :cond_6
    iget p1, v1, Landroid/graphics/PointF;->y:F

    .line 112
    .line 113
    .line 114
    :goto_4
    invoke-virtual {v2, v0, v3, p1}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 115
    .line 116
    :cond_7
    iget-object p1, p0, Lf1/p;->a:Landroid/graphics/Matrix;

    .line 117
    return-object p1
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
.end method

.method public h()Lf1/a;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf1/a<",
            "*",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->j:Lf1/a;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public i()Lf1/a;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf1/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->m:Lf1/a;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public j(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lf1/p;->j:Lf1/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lf1/p;->m:Lf1/a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lf1/p;->n:Lf1/a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lf1/p;->f:Lf1/a;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 29
    .line 30
    :cond_3
    iget-object v0, p0, Lf1/p;->g:Lf1/a;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 36
    .line 37
    :cond_4
    iget-object v0, p0, Lf1/p;->h:Lf1/a;

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 43
    .line 44
    :cond_5
    iget-object v0, p0, Lf1/p;->i:Lf1/a;

    .line 45
    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 50
    .line 51
    :cond_6
    iget-object v0, p0, Lf1/p;->k:Lf1/d;

    .line 52
    .line 53
    if-eqz v0, :cond_7

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 57
    .line 58
    :cond_7
    iget-object v0, p0, Lf1/p;->l:Lf1/d;

    .line 59
    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lf1/a;->n(F)V

    .line 64
    :cond_8
    return-void
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
