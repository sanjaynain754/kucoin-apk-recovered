.class public final Lk7/b;
.super Ljava/lang/Object;
.source "CharsToNameCanonicalizer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/b$b;,
        Lk7/b$a;
    }
.end annotation


# instance fields
.field public final a:Lk7/b;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lk7/b$b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I

.field public e:Z

.field public f:[Ljava/lang/String;

.field public g:[Lk7/b$a;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lk7/b;->a:Lk7/b;

    .line 3
    iput p1, p0, Lk7/b;->c:I

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lk7/b;->e:Z

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lk7/b;->d:I

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lk7/b;->l:Z

    .line 7
    iput p1, p0, Lk7/b;->k:I

    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/16 v0, 0x40

    invoke-static {v0}, Lk7/b$b;->a(I)Lk7/b$b;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lk7/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lk7/b;IILk7/b$b;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lk7/b;->a:Lk7/b;

    .line 11
    iput p3, p0, Lk7/b;->c:I

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lk7/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    iput p2, p0, Lk7/b;->d:I

    .line 14
    sget-object p1, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->CANONICALIZE_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    move-result p1

    iput-boolean p1, p0, Lk7/b;->e:Z

    .line 15
    iget-object p1, p4, Lk7/b$b;->c:[Ljava/lang/String;

    iput-object p1, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 16
    iget-object p2, p4, Lk7/b$b;->d:[Lk7/b$a;

    iput-object p2, p0, Lk7/b;->g:[Lk7/b$a;

    .line 17
    iget p2, p4, Lk7/b$b;->a:I

    iput p2, p0, Lk7/b;->h:I

    .line 18
    iget p2, p4, Lk7/b$b;->b:I

    iput p2, p0, Lk7/b;->k:I

    .line 19
    array-length p1, p1

    .line 20
    invoke-static {p1}, Lk7/b;->f(I)I

    move-result p2

    iput p2, p0, Lk7/b;->i:I

    const/4 p2, 0x1

    sub-int/2addr p1, p2

    .line 21
    iput p1, p0, Lk7/b;->j:I

    .line 22
    iput-boolean p2, p0, Lk7/b;->l:Z

    return-void
.end method

.method public static f(I)I
    .locals 1

    .line 1
    .line 2
    shr-int/lit8 v0, p0, 0x2

    .line 3
    sub-int/2addr p0, v0

    .line 4
    return p0
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

.method public static j()Lk7/b;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    long-to-int v2, v0

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    ushr-long/2addr v0, v3

    .line 9
    long-to-int v0, v0

    .line 10
    add-int/2addr v2, v0

    .line 11
    .line 12
    or-int/lit8 v0, v2, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lk7/b;->k(I)Lk7/b;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public static k(I)Lk7/b;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lk7/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lk7/b;-><init>(I)V

    .line 6
    return-object v0
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
.method public final a([CIIII)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-boolean p4, p0, Lk7/b;->l:Z

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lk7/b;->i()V

    .line 8
    const/4 p4, 0x0

    .line 9
    .line 10
    iput-boolean p4, p0, Lk7/b;->l:Z

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget p4, p0, Lk7/b;->h:I

    .line 14
    .line 15
    iget v0, p0, Lk7/b;->i:I

    .line 16
    .line 17
    if-lt p4, v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lk7/b;->q()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, p3}, Lk7/b;->h([CII)I

    .line 24
    move-result p4

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p4}, Lk7/b;->d(I)I

    .line 28
    move-result p5

    .line 29
    .line 30
    :cond_1
    :goto_0
    new-instance p4, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-direct {p4, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 34
    .line 35
    sget-object p1, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->INTERN_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 36
    .line 37
    iget p2, p0, Lk7/b;->d:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    sget-object p1, Lcom/fasterxml/jackson/core/util/InternCache;->instance:Lcom/fasterxml/jackson/core/util/InternCache;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p4}, Lcom/fasterxml/jackson/core/util/InternCache;->intern(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p4

    .line 50
    .line 51
    :cond_2
    iget p1, p0, Lk7/b;->h:I

    .line 52
    .line 53
    add-int/lit8 p1, p1, 0x1

    .line 54
    .line 55
    iput p1, p0, Lk7/b;->h:I

    .line 56
    .line 57
    iget-object p1, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 58
    .line 59
    aget-object p2, p1, p5

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    aput-object p4, p1, p5

    .line 64
    return-object p4

    .line 65
    .line 66
    :cond_3
    shr-int/lit8 p1, p5, 0x1

    .line 67
    .line 68
    new-instance p2, Lk7/b$a;

    .line 69
    .line 70
    iget-object p3, p0, Lk7/b;->g:[Lk7/b$a;

    .line 71
    .line 72
    aget-object p3, p3, p1

    .line 73
    .line 74
    .line 75
    invoke-direct {p2, p4, p3}, Lk7/b$a;-><init>(Ljava/lang/String;Lk7/b$a;)V

    .line 76
    .line 77
    iget p3, p2, Lk7/b$a;->c:I

    .line 78
    .line 79
    const/16 v0, 0x96

    .line 80
    .line 81
    if-le p3, v0, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1, p2, p5}, Lk7/b;->c(ILk7/b$a;I)V

    .line 85
    return-object p4

    .line 86
    .line 87
    :cond_4
    iget-object p5, p0, Lk7/b;->g:[Lk7/b$a;

    .line 88
    .line 89
    aput-object p2, p5, p1

    .line 90
    .line 91
    iget p1, p0, Lk7/b;->k:I

    .line 92
    .line 93
    .line 94
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    .line 95
    move-result p1

    .line 96
    .line 97
    iput p1, p0, Lk7/b;->k:I

    .line 98
    return-object p4
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
.end method

.method public final b([CIILk7/b$a;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    :goto_0
    if-eqz p4, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p4, p1, p2, p3}, Lk7/b$a;->a([CII)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    iget-object p4, p4, Lk7/b$a;->b:Lk7/b$a;

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p1, 0x0

    .line 14
    return-object p1
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
.end method

.method public final c(ILk7/b$a;I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lk7/b;->m:Ljava/util/BitSet;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/BitSet;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lk7/b;->m:Ljava/util/BitSet;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->FAIL_ON_SYMBOL_HASH_OVERFLOW:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 24
    .line 25
    iget v1, p0, Lk7/b;->d:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const/16 v0, 0x96

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lk7/b;->e(I)V

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    .line 39
    iput-boolean v0, p0, Lk7/b;->e:Z

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lk7/b;->m:Ljava/util/BitSet;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 46
    .line 47
    :goto_0
    iget-object v0, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p2, Lk7/b$a;->a:Ljava/lang/String;

    .line 50
    .line 51
    aput-object v1, v0, p3

    .line 52
    .line 53
    iget-object p3, p0, Lk7/b;->g:[Lk7/b$a;

    .line 54
    const/4 v0, 0x0

    .line 55
    .line 56
    aput-object v0, p3, p1

    .line 57
    .line 58
    iget p1, p0, Lk7/b;->h:I

    .line 59
    .line 60
    iget p2, p2, Lk7/b$a;->c:I

    .line 61
    sub-int/2addr p1, p2

    .line 62
    .line 63
    iput p1, p0, Lk7/b;->h:I

    .line 64
    const/4 p1, -0x1

    .line 65
    .line 66
    iput p1, p0, Lk7/b;->k:I

    .line 67
    return-void
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
.end method

.method public d(I)I
    .locals 1

    .line 1
    .line 2
    ushr-int/lit8 v0, p1, 0xf

    .line 3
    add-int/2addr p1, v0

    .line 4
    .line 5
    shl-int/lit8 v0, p1, 0x7

    .line 6
    xor-int/2addr p1, v0

    .line 7
    .line 8
    ushr-int/lit8 v0, p1, 0x3

    .line 9
    add-int/2addr p1, v0

    .line 10
    .line 11
    iget v0, p0, Lk7/b;->j:I

    .line 12
    and-int/2addr p1, v0

    .line 13
    return p1
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

.method public e(I)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "Longest collision chain in symbol table (of size "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    iget v2, p0, Lk7/b;->h:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, ") now exceeds maximum, "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p1, " -- suspect a DoS attack based on hash collisions"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v0
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
.end method

.method public g(Ljava/lang/String;)I
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Lk7/b;->c:I

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    mul-int/lit8 v1, v1, 0x21

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    move-result v3

    .line 16
    add-int/2addr v1, v3

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    if-nez v1, :cond_1

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    return v1
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
.end method

.method public h([CII)I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lk7/b;->c:I

    .line 3
    add-int/2addr p3, p2

    .line 4
    .line 5
    :goto_0
    if-ge p2, p3, :cond_0

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x21

    .line 8
    .line 9
    aget-char v1, p1, p2

    .line 10
    add-int/2addr v0, v1

    .line 11
    .line 12
    add-int/lit8 p2, p2, 0x1

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    if-nez v0, :cond_1

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_1
    return v0
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
.end method

.method public final i()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, [Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, Lk7/b;->g:[Lk7/b$a;

    .line 14
    array-length v1, v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, [Lk7/b$a;

    .line 21
    .line 22
    iput-object v0, p0, Lk7/b;->g:[Lk7/b$a;

    .line 23
    return-void
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
.end method

.method public l([CIII)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ge p3, v0, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    return-object p1

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lk7/b;->e:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance p4, Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-direct {p4, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 16
    return-object p4

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p4}, Lk7/b;->d(I)I

    .line 20
    move-result v5

    .line 21
    .line 22
    iget-object v0, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 23
    .line 24
    aget-object v0, v0, v5

    .line 25
    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    move-result v1

    .line 31
    .line 32
    if-ne v1, p3, :cond_3

    .line 33
    const/4 v1, 0x0

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 37
    move-result v2

    .line 38
    .line 39
    add-int v3, p2, v1

    .line 40
    .line 41
    aget-char v3, p1, v3

    .line 42
    .line 43
    if-ne v2, v3, :cond_3

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    if-ne v1, p3, :cond_2

    .line 48
    return-object v0

    .line 49
    .line 50
    :cond_3
    iget-object v0, p0, Lk7/b;->g:[Lk7/b$a;

    .line 51
    .line 52
    shr-int/lit8 v1, v5, 0x1

    .line 53
    .line 54
    aget-object v0, v0, v1

    .line 55
    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, p3}, Lk7/b$a;->a([CII)Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    return-object v1

    .line 64
    .line 65
    :cond_4
    iget-object v0, v0, Lk7/b$a;->b:Lk7/b$a;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p2, p3, v0}, Lk7/b;->b([CIILk7/b$a;)Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    return-object v0

    .line 73
    :cond_5
    move-object v0, p0

    .line 74
    move-object v1, p1

    .line 75
    move v2, p2

    .line 76
    move v3, p3

    .line 77
    move v4, p4

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {v0 .. v5}, Lk7/b;->a([CIIII)Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    return-object p1
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
.end method

.method public m()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lk7/b;->c:I

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
    .line 18
.end method

.method public n(I)Lk7/b;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lk7/b;

    .line 3
    .line 4
    iget v1, p0, Lk7/b;->c:I

    .line 5
    .line 6
    iget-object v2, p0, Lk7/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    check-cast v2, Lk7/b$b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, p1, v1, v2}, Lk7/b;-><init>(Lk7/b;IILk7/b$b;)V

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public o()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lk7/b;->l:Z

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    return v0
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

.method public final p(Lk7/b$b;)V
    .locals 3

    .line 1
    .line 2
    iget v0, p1, Lk7/b$b;->a:I

    .line 3
    .line 4
    iget-object v1, p0, Lk7/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lk7/b$b;

    .line 11
    .line 12
    iget v2, v1, Lk7/b$b;->a:I

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    const/16 v2, 0x2ee0

    .line 18
    .line 19
    if-le v0, v2, :cond_1

    .line 20
    .line 21
    const/16 p1, 0x40

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lk7/b$b;->a(I)Lk7/b$b;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lk7/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, p1}, Landroidx/camera/view/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    return-void
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
.end method

.method public final q()V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    add-int v2, v1, v1

    .line 6
    .line 7
    const/high16 v3, 0x10000

    .line 8
    const/4 v4, 0x0

    .line 9
    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    iput v4, p0, Lk7/b;->h:I

    .line 13
    .line 14
    iput-boolean v4, p0, Lk7/b;->e:Z

    .line 15
    .line 16
    const/16 v0, 0x40

    .line 17
    .line 18
    new-array v0, v0, [Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 21
    .line 22
    const/16 v0, 0x20

    .line 23
    .line 24
    new-array v0, v0, [Lk7/b$a;

    .line 25
    .line 26
    iput-object v0, p0, Lk7/b;->g:[Lk7/b$a;

    .line 27
    .line 28
    const/16 v0, 0x3f

    .line 29
    .line 30
    iput v0, p0, Lk7/b;->j:I

    .line 31
    .line 32
    iput-boolean v4, p0, Lk7/b;->l:Z

    .line 33
    return-void

    .line 34
    .line 35
    :cond_0
    iget-object v3, p0, Lk7/b;->g:[Lk7/b$a;

    .line 36
    .line 37
    new-array v5, v2, [Ljava/lang/String;

    .line 38
    .line 39
    iput-object v5, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 40
    .line 41
    shr-int/lit8 v5, v2, 0x1

    .line 42
    .line 43
    new-array v5, v5, [Lk7/b$a;

    .line 44
    .line 45
    iput-object v5, p0, Lk7/b;->g:[Lk7/b$a;

    .line 46
    .line 47
    add-int/lit8 v5, v2, -0x1

    .line 48
    .line 49
    iput v5, p0, Lk7/b;->j:I

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, Lk7/b;->f(I)I

    .line 53
    move-result v2

    .line 54
    .line 55
    iput v2, p0, Lk7/b;->i:I

    .line 56
    move v2, v4

    .line 57
    move v5, v2

    .line 58
    move v6, v5

    .line 59
    .line 60
    :goto_0
    if-ge v2, v1, :cond_3

    .line 61
    .line 62
    aget-object v7, v0, v2

    .line 63
    .line 64
    if-eqz v7, :cond_2

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v7}, Lk7/b;->g(Ljava/lang/String;)I

    .line 70
    move-result v8

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v8}, Lk7/b;->d(I)I

    .line 74
    move-result v8

    .line 75
    .line 76
    iget-object v9, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 77
    .line 78
    aget-object v10, v9, v8

    .line 79
    .line 80
    if-nez v10, :cond_1

    .line 81
    .line 82
    aput-object v7, v9, v8

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_1
    shr-int/lit8 v8, v8, 0x1

    .line 86
    .line 87
    new-instance v9, Lk7/b$a;

    .line 88
    .line 89
    iget-object v10, p0, Lk7/b;->g:[Lk7/b$a;

    .line 90
    .line 91
    aget-object v10, v10, v8

    .line 92
    .line 93
    .line 94
    invoke-direct {v9, v7, v10}, Lk7/b$a;-><init>(Ljava/lang/String;Lk7/b$a;)V

    .line 95
    .line 96
    iget-object v7, p0, Lk7/b;->g:[Lk7/b$a;

    .line 97
    .line 98
    aput-object v9, v7, v8

    .line 99
    .line 100
    iget v7, v9, Lk7/b$a;->c:I

    .line 101
    .line 102
    .line 103
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 104
    move-result v6

    .line 105
    .line 106
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_3
    shr-int/lit8 v0, v1, 0x1

    .line 110
    .line 111
    :goto_2
    if-ge v4, v0, :cond_6

    .line 112
    .line 113
    aget-object v1, v3, v4

    .line 114
    .line 115
    :goto_3
    if-eqz v1, :cond_5

    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    iget-object v2, v1, Lk7/b$a;->a:Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v2}, Lk7/b;->g(Ljava/lang/String;)I

    .line 123
    move-result v7

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v7}, Lk7/b;->d(I)I

    .line 127
    move-result v7

    .line 128
    .line 129
    iget-object v8, p0, Lk7/b;->f:[Ljava/lang/String;

    .line 130
    .line 131
    aget-object v9, v8, v7

    .line 132
    .line 133
    if-nez v9, :cond_4

    .line 134
    .line 135
    aput-object v2, v8, v7

    .line 136
    goto :goto_4

    .line 137
    .line 138
    :cond_4
    shr-int/lit8 v7, v7, 0x1

    .line 139
    .line 140
    new-instance v8, Lk7/b$a;

    .line 141
    .line 142
    iget-object v9, p0, Lk7/b;->g:[Lk7/b$a;

    .line 143
    .line 144
    aget-object v9, v9, v7

    .line 145
    .line 146
    .line 147
    invoke-direct {v8, v2, v9}, Lk7/b$a;-><init>(Ljava/lang/String;Lk7/b$a;)V

    .line 148
    .line 149
    iget-object v2, p0, Lk7/b;->g:[Lk7/b$a;

    .line 150
    .line 151
    aput-object v8, v2, v7

    .line 152
    .line 153
    iget v2, v8, Lk7/b$a;->c:I

    .line 154
    .line 155
    .line 156
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 157
    move-result v6

    .line 158
    .line 159
    :goto_4
    iget-object v1, v1, Lk7/b$a;->b:Lk7/b$a;

    .line 160
    goto :goto_3

    .line 161
    .line 162
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 163
    goto :goto_2

    .line 164
    .line 165
    :cond_6
    iput v6, p0, Lk7/b;->k:I

    .line 166
    const/4 v0, 0x0

    .line 167
    .line 168
    iput-object v0, p0, Lk7/b;->m:Ljava/util/BitSet;

    .line 169
    .line 170
    iget v0, p0, Lk7/b;->h:I

    .line 171
    .line 172
    if-ne v5, v0, :cond_7

    .line 173
    return-void

    .line 174
    .line 175
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    iget v1, p0, Lk7/b;->h:I

    .line 178
    .line 179
    .line 180
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    move-result-object v1

    .line 182
    .line 183
    .line 184
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    move-result-object v2

    .line 186
    .line 187
    .line 188
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    const-string v2, "Internal error on SymbolTable.rehash(): had %d entries; now have %d"

    .line 192
    .line 193
    .line 194
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    move-result-object v1

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 199
    throw v0
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
.end method

.method public r()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lk7/b;->o()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lk7/b;->a:Lk7/b;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Lk7/b;->e:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Lk7/b$b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0}, Lk7/b$b;-><init>(Lk7/b;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lk7/b;->p(Lk7/b$b;)V

    .line 24
    const/4 v0, 0x1

    .line 25
    .line 26
    iput-boolean v0, p0, Lk7/b;->l:Z

    .line 27
    :cond_1
    :goto_0
    return-void
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
.end method
