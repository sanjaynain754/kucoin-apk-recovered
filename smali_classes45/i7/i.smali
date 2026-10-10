.class public Li7/i;
.super Li7/c;
.source "UTF8JsonGenerator.java"


# static fields
.field public static final C:[B

.field public static final D:[B

.field public static final E:[B

.field public static final F:[B


# instance fields
.field public final A:I

.field public B:Z

.field public final t:Ljava/io/OutputStream;

.field public u:B

.field public v:[B

.field public w:I

.field public final x:I

.field public final y:I

.field public z:[C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->c()[B

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Li7/i;->C:[B

    .line 7
    const/4 v0, 0x4

    .line 8
    .line 9
    new-array v1, v0, [B

    .line 10
    .line 11
    .line 12
    fill-array-data v1, :array_0

    .line 13
    .line 14
    sput-object v1, Li7/i;->D:[B

    .line 15
    .line 16
    new-array v0, v0, [B

    .line 17
    .line 18
    .line 19
    fill-array-data v0, :array_1

    .line 20
    .line 21
    sput-object v0, Li7/i;->E:[B

    .line 22
    const/4 v0, 0x5

    .line 23
    .line 24
    new-array v0, v0, [B

    .line 25
    .line 26
    .line 27
    fill-array-data v0, :array_2

    .line 28
    .line 29
    sput-object v0, Li7/i;->F:[B

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    :array_0
    .array-data 1
        0x6et
        0x75t
        0x6ct
        0x6ct
    .end array-data

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :array_1
    .array-data 1
        0x74t
        0x72t
        0x75t
        0x65t
    .end array-data

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    :array_2
    .array-data 1
        0x66t
        0x61t
        0x6ct
        0x73t
        0x65t
    .end array-data
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

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;ILcom/fasterxml/jackson/core/g;Ljava/io/OutputStream;C)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Li7/c;-><init>(Lcom/fasterxml/jackson/core/io/d;ILcom/fasterxml/jackson/core/g;)V

    .line 4
    .line 5
    iput-object p4, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 6
    int-to-byte p2, p5

    .line 7
    .line 8
    iput-byte p2, p0, Li7/i;->u:B

    .line 9
    .line 10
    const/16 p2, 0x22

    .line 11
    .line 12
    if-eq p5, p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {p5}, Lcom/fasterxml/jackson/core/io/b;->f(I)[I

    .line 16
    move-result-object p2

    .line 17
    .line 18
    iput-object p2, p0, Li7/c;->m:[I

    .line 19
    :cond_0
    const/4 p2, 0x1

    .line 20
    .line 21
    iput-boolean p2, p0, Li7/i;->B:Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/d;->j()[B

    .line 25
    move-result-object p2

    .line 26
    .line 27
    iput-object p2, p0, Li7/i;->v:[B

    .line 28
    array-length p2, p2

    .line 29
    .line 30
    iput p2, p0, Li7/i;->x:I

    .line 31
    .line 32
    shr-int/lit8 p2, p2, 0x3

    .line 33
    .line 34
    iput p2, p0, Li7/i;->y:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/d;->e()[C

    .line 38
    move-result-object p1

    .line 39
    .line 40
    iput-object p1, p0, Li7/i;->z:[C

    .line 41
    array-length p1, p1

    .line 42
    .line 43
    iput p1, p0, Li7/i;->A:I

    .line 44
    .line 45
    sget-object p1, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->ESCAPE_NON_ASCII:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lf7/a;->q(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    .line 49
    move-result p1

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    const/16 p1, 0x7f

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Li7/c;->C(I)Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 57
    :cond_1
    return-void
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
.end method


# virtual methods
.method public final B0(Lcom/fasterxml/jackson/core/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a string"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    iget v1, p0, Li7/i;->x:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 18
    .line 19
    iget v1, p0, Li7/i;->w:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Li7/i;->w:I

    .line 24
    .line 25
    iget-byte v3, p0, Li7/i;->u:B

    .line 26
    .line 27
    aput-byte v3, v0, v1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0, v2}, Lcom/fasterxml/jackson/core/i;->appendQuotedUTF8([BI)I

    .line 31
    move-result v0

    .line 32
    .line 33
    if-gez v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asQuotedUTF8()[B

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_1
    iget p1, p0, Li7/i;->w:I

    .line 44
    add-int/2addr p1, v0

    .line 45
    .line 46
    iput p1, p0, Li7/i;->w:I

    .line 47
    .line 48
    :goto_0
    iget p1, p0, Li7/i;->w:I

    .line 49
    .line 50
    iget v0, p0, Li7/i;->x:I

    .line 51
    .line 52
    if-lt p1, v0, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, Li7/i;->v:[B

    .line 58
    .line 59
    iget v0, p0, Li7/i;->w:I

    .line 60
    .line 61
    add-int/lit8 v1, v0, 0x1

    .line 62
    .line 63
    iput v1, p0, Li7/i;->w:I

    .line 64
    .line 65
    iget-byte v1, p0, Li7/i;->u:B

    .line 66
    .line 67
    aput-byte v1, p1, v0

    .line 68
    return-void
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

.method public C0(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a string"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->d1()V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    move-result v0

    .line 17
    .line 18
    iget v1, p0, Li7/i;->y:I

    .line 19
    .line 20
    if-le v0, v1, :cond_1

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Li7/i;->t1(Ljava/lang/String;Z)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    iget v1, p0, Li7/i;->w:I

    .line 28
    add-int/2addr v1, v0

    .line 29
    .line 30
    iget v2, p0, Li7/i;->x:I

    .line 31
    .line 32
    if-lt v1, v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 36
    .line 37
    :cond_2
    iget-object v1, p0, Li7/i;->v:[B

    .line 38
    .line 39
    iget v2, p0, Li7/i;->w:I

    .line 40
    .line 41
    add-int/lit8 v3, v2, 0x1

    .line 42
    .line 43
    iput v3, p0, Li7/i;->w:I

    .line 44
    .line 45
    iget-byte v3, p0, Li7/i;->u:B

    .line 46
    .line 47
    aput-byte v3, v1, v2

    .line 48
    const/4 v1, 0x0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, v1, v0}, Li7/i;->m1(Ljava/lang/String;II)V

    .line 52
    .line 53
    iget p1, p0, Li7/i;->w:I

    .line 54
    .line 55
    iget v0, p0, Li7/i;->x:I

    .line 56
    .line 57
    if-lt p1, v0, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 61
    .line 62
    :cond_3
    iget-object p1, p0, Li7/i;->v:[B

    .line 63
    .line 64
    iget v0, p0, Li7/i;->w:I

    .line 65
    .line 66
    add-int/lit8 v1, v0, 0x1

    .line 67
    .line 68
    iput v1, p0, Li7/i;->w:I

    .line 69
    .line 70
    iget-byte v1, p0, Li7/i;->u:B

    .line 71
    .line 72
    aput-byte v1, p1, v0

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public D0([CII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a string"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    iget v1, p0, Li7/i;->x:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 18
    .line 19
    iget v1, p0, Li7/i;->w:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Li7/i;->w:I

    .line 24
    .line 25
    iget-byte v3, p0, Li7/i;->u:B

    .line 26
    .line 27
    aput-byte v3, v0, v1

    .line 28
    .line 29
    iget v0, p0, Li7/i;->y:I

    .line 30
    .line 31
    if-gt p3, v0, :cond_2

    .line 32
    add-int/2addr v2, p3

    .line 33
    .line 34
    iget v0, p0, Li7/i;->x:I

    .line 35
    .line 36
    if-le v2, v0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->n1([CII)V

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->u1([CII)V

    .line 47
    .line 48
    :goto_0
    iget p1, p0, Li7/i;->w:I

    .line 49
    .line 50
    iget p2, p0, Li7/i;->x:I

    .line 51
    .line 52
    if-lt p1, p2, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 56
    .line 57
    :cond_3
    iget-object p1, p0, Li7/i;->v:[B

    .line 58
    .line 59
    iget p2, p0, Li7/i;->w:I

    .line 60
    .line 61
    add-int/lit8 p3, p2, 0x1

    .line 62
    .line 63
    iput p3, p0, Li7/i;->w:I

    .line 64
    .line 65
    iget-byte p3, p0, Li7/i;->u:B

    .line 66
    .line 67
    aput-byte p3, p1, p2

    .line 68
    return-void
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

.method public final L0(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Li7/e;->x()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Li7/c;->N0(Ljava/lang/String;I)V

    .line 14
    return-void

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    .line 17
    if-eq v0, v1, :cond_5

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    if-eq v0, v1, :cond_4

    .line 21
    const/4 v1, 0x3

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    const/4 v1, 0x5

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0, p1}, Li7/c;->M0(Ljava/lang/String;)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_2
    iget-object p1, p0, Li7/c;->p:Lcom/fasterxml/jackson/core/i;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asUnquotedUTF8()[B

    .line 39
    move-result-object p1

    .line 40
    array-length v0, p1

    .line 41
    .line 42
    if-lez v0, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 46
    :cond_3
    :goto_0
    return-void

    .line 47
    .line 48
    :cond_4
    const/16 p1, 0x3a

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_5
    const/16 p1, 0x2c

    .line 52
    .line 53
    :goto_1
    iget v0, p0, Li7/i;->w:I

    .line 54
    .line 55
    iget v1, p0, Li7/i;->x:I

    .line 56
    .line 57
    if-lt v0, v1, :cond_6

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 61
    .line 62
    :cond_6
    iget-object v0, p0, Li7/i;->v:[B

    .line 63
    .line 64
    iget v1, p0, Li7/i;->w:I

    .line 65
    .line 66
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    iput v2, p0, Li7/i;->w:I

    .line 69
    .line 70
    aput-byte p1, v0, v1

    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final O0()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    iput v1, p0, Li7/i;->w:I

    .line 8
    .line 9
    iget-object v2, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 10
    .line 11
    iget-object v3, p0, Li7/i;->v:[B

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v3, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
.end method

.method public P(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a binary value"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    iget v1, p0, Li7/i;->x:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 18
    .line 19
    iget v1, p0, Li7/i;->w:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Li7/i;->w:I

    .line 24
    .line 25
    iget-byte v2, p0, Li7/i;->u:B

    .line 26
    .line 27
    aput-byte v2, v0, v1

    .line 28
    .line 29
    iget-object v0, p0, Li7/c;->l:Lcom/fasterxml/jackson/core/io/d;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/d;->d()[B

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-gez p3, :cond_1

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Li7/i;->V0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;[B)I

    .line 39
    move-result p3

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0, p1, p2, v0, p3}, Li7/i;->W0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;[BI)I

    .line 46
    move-result p1

    .line 47
    .line 48
    if-lez p1, :cond_2

    .line 49
    .line 50
    new-instance p2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    const-string v1, "Too few bytes available: missing "

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string p1, " bytes (out of "

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string p1, ")"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    :cond_2
    :goto_0
    iget-object p1, p0, Li7/c;->l:Lcom/fasterxml/jackson/core/io/d;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/io/d;->o([B)V

    .line 87
    .line 88
    iget p1, p0, Li7/i;->w:I

    .line 89
    .line 90
    iget p2, p0, Li7/i;->x:I

    .line 91
    .line 92
    if-lt p1, p2, :cond_3

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 96
    .line 97
    :cond_3
    iget-object p1, p0, Li7/i;->v:[B

    .line 98
    .line 99
    iget p2, p0, Li7/i;->w:I

    .line 100
    .line 101
    add-int/lit8 v0, p2, 0x1

    .line 102
    .line 103
    iput v0, p0, Li7/i;->w:I

    .line 104
    .line 105
    iget-byte v0, p0, Li7/i;->u:B

    .line 106
    .line 107
    aput-byte v0, p1, p2

    .line 108
    return p3

    .line 109
    .line 110
    :goto_1
    iget-object p2, p0, Li7/c;->l:Lcom/fasterxml/jackson/core/io/d;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/io/d;->o([B)V

    .line 114
    throw p1
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
.end method

.method public final P0([BII[BI)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    array-length v0, p4

    .line 2
    .line 3
    add-int v1, p2, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-le v1, p3, :cond_0

    .line 7
    .line 8
    iput p2, p0, Li7/i;->w:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    iget p2, p0, Li7/i;->w:I

    .line 14
    array-length v1, p1

    .line 15
    .line 16
    if-le v0, v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p4, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 22
    return p2

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {p4, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    add-int/2addr p2, v0

    .line 27
    .line 28
    mul-int/lit8 p5, p5, 0x6

    .line 29
    add-int/2addr p5, p2

    .line 30
    .line 31
    if-le p5, p3, :cond_1

    .line 32
    .line 33
    iput p2, p0, Li7/i;->w:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 37
    .line 38
    iget p1, p0, Li7/i;->w:I

    .line 39
    return p1

    .line 40
    :cond_1
    return p2
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

.method public final Q0(II)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/i;->v:[B

    .line 3
    .line 4
    .line 5
    const v1, 0xd800

    .line 6
    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    .line 10
    const v1, 0xdfff

    .line 11
    .line 12
    if-gt p1, v1, :cond_0

    .line 13
    .line 14
    add-int/lit8 v1, p2, 0x1

    .line 15
    .line 16
    const/16 v2, 0x5c

    .line 17
    .line 18
    aput-byte v2, v0, p2

    .line 19
    .line 20
    add-int/lit8 v2, p2, 0x2

    .line 21
    .line 22
    const/16 v3, 0x75

    .line 23
    .line 24
    aput-byte v3, v0, v1

    .line 25
    .line 26
    add-int/lit8 v1, p2, 0x3

    .line 27
    .line 28
    sget-object v3, Li7/i;->C:[B

    .line 29
    .line 30
    shr-int/lit8 v4, p1, 0xc

    .line 31
    .line 32
    and-int/lit8 v4, v4, 0xf

    .line 33
    .line 34
    aget-byte v4, v3, v4

    .line 35
    .line 36
    aput-byte v4, v0, v2

    .line 37
    .line 38
    add-int/lit8 v2, p2, 0x4

    .line 39
    .line 40
    shr-int/lit8 v4, p1, 0x8

    .line 41
    .line 42
    and-int/lit8 v4, v4, 0xf

    .line 43
    .line 44
    aget-byte v4, v3, v4

    .line 45
    .line 46
    aput-byte v4, v0, v1

    .line 47
    .line 48
    add-int/lit8 v1, p2, 0x5

    .line 49
    .line 50
    shr-int/lit8 v4, p1, 0x4

    .line 51
    .line 52
    and-int/lit8 v4, v4, 0xf

    .line 53
    .line 54
    aget-byte v4, v3, v4

    .line 55
    .line 56
    aput-byte v4, v0, v2

    .line 57
    .line 58
    add-int/lit8 p2, p2, 0x6

    .line 59
    .line 60
    and-int/lit8 p1, p1, 0xf

    .line 61
    .line 62
    aget-byte p1, v3, p1

    .line 63
    .line 64
    aput-byte p1, v0, v1

    .line 65
    return p2

    .line 66
    .line 67
    :cond_0
    add-int/lit8 v1, p2, 0x1

    .line 68
    .line 69
    shr-int/lit8 v2, p1, 0xc

    .line 70
    .line 71
    or-int/lit16 v2, v2, 0xe0

    .line 72
    int-to-byte v2, v2

    .line 73
    .line 74
    aput-byte v2, v0, p2

    .line 75
    .line 76
    add-int/lit8 v2, p2, 0x2

    .line 77
    .line 78
    shr-int/lit8 v3, p1, 0x6

    .line 79
    .line 80
    and-int/lit8 v3, v3, 0x3f

    .line 81
    .line 82
    or-int/lit16 v3, v3, 0x80

    .line 83
    int-to-byte v3, v3

    .line 84
    .line 85
    aput-byte v3, v0, v1

    .line 86
    .line 87
    add-int/lit8 p2, p2, 0x3

    .line 88
    .line 89
    and-int/lit8 p1, p1, 0x3f

    .line 90
    .line 91
    or-int/lit16 p1, p1, 0x80

    .line 92
    int-to-byte p1, p1

    .line 93
    .line 94
    aput-byte p1, v0, v2

    .line 95
    return p2
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

.method public R(Lcom/fasterxml/jackson/core/Base64Variant;[BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a binary value"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    iget v1, p0, Li7/i;->x:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 18
    .line 19
    iget v1, p0, Li7/i;->w:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Li7/i;->w:I

    .line 24
    .line 25
    iget-byte v2, p0, Li7/i;->u:B

    .line 26
    .line 27
    aput-byte v2, v0, v1

    .line 28
    add-int/2addr p4, p3

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1, p2, p3, p4}, Li7/i;->X0(Lcom/fasterxml/jackson/core/Base64Variant;[BII)V

    .line 32
    .line 33
    iget p1, p0, Li7/i;->w:I

    .line 34
    .line 35
    iget p2, p0, Li7/i;->x:I

    .line 36
    .line 37
    if-lt p1, p2, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 41
    .line 42
    :cond_1
    iget-object p1, p0, Li7/i;->v:[B

    .line 43
    .line 44
    iget p2, p0, Li7/i;->w:I

    .line 45
    .line 46
    add-int/lit8 p3, p2, 0x1

    .line 47
    .line 48
    iput p3, p0, Li7/i;->w:I

    .line 49
    .line 50
    iget-byte p3, p0, Li7/i;->u:B

    .line 51
    .line 52
    aput-byte p3, p1, p2

    .line 53
    return-void
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

.method public final R0(I[CII)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const v0, 0xd800

    .line 4
    .line 5
    if-lt p1, v0, :cond_2

    .line 6
    .line 7
    .line 8
    const v0, 0xdfff

    .line 9
    .line 10
    if-gt p1, v0, :cond_2

    .line 11
    .line 12
    if-ge p3, p4, :cond_1

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    aget-char p2, p2, p3

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Li7/i;->S0(II)V

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    const-string p2, "Split surrogate on writeRaw() input (last character): first character 0x%4x"

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 41
    return p3

    .line 42
    .line 43
    :cond_2
    iget-object p2, p0, Li7/i;->v:[B

    .line 44
    .line 45
    iget p4, p0, Li7/i;->w:I

    .line 46
    .line 47
    add-int/lit8 v0, p4, 0x1

    .line 48
    .line 49
    iput v0, p0, Li7/i;->w:I

    .line 50
    .line 51
    shr-int/lit8 v1, p1, 0xc

    .line 52
    .line 53
    or-int/lit16 v1, v1, 0xe0

    .line 54
    int-to-byte v1, v1

    .line 55
    .line 56
    aput-byte v1, p2, p4

    .line 57
    .line 58
    add-int/lit8 v1, p4, 0x2

    .line 59
    .line 60
    iput v1, p0, Li7/i;->w:I

    .line 61
    .line 62
    shr-int/lit8 v2, p1, 0x6

    .line 63
    .line 64
    and-int/lit8 v2, v2, 0x3f

    .line 65
    .line 66
    or-int/lit16 v2, v2, 0x80

    .line 67
    int-to-byte v2, v2

    .line 68
    .line 69
    aput-byte v2, p2, v0

    .line 70
    .line 71
    add-int/lit8 p4, p4, 0x3

    .line 72
    .line 73
    iput p4, p0, Li7/i;->w:I

    .line 74
    .line 75
    and-int/lit8 p1, p1, 0x3f

    .line 76
    .line 77
    or-int/lit16 p1, p1, 0x80

    .line 78
    int-to-byte p1, p1

    .line 79
    .line 80
    aput-byte p1, p2, v1

    .line 81
    return p3
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

.method public final S0(II)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf7/a;->K0(II)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget p2, p0, Li7/i;->w:I

    .line 7
    .line 8
    add-int/lit8 p2, p2, 0x4

    .line 9
    .line 10
    iget v0, p0, Li7/i;->x:I

    .line 11
    .line 12
    if-le p2, v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 16
    .line 17
    :cond_0
    iget-object p2, p0, Li7/i;->v:[B

    .line 18
    .line 19
    iget v0, p0, Li7/i;->w:I

    .line 20
    .line 21
    add-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    iput v1, p0, Li7/i;->w:I

    .line 24
    .line 25
    shr-int/lit8 v2, p1, 0x12

    .line 26
    .line 27
    or-int/lit16 v2, v2, 0xf0

    .line 28
    int-to-byte v2, v2

    .line 29
    .line 30
    aput-byte v2, p2, v0

    .line 31
    .line 32
    add-int/lit8 v2, v0, 0x2

    .line 33
    .line 34
    iput v2, p0, Li7/i;->w:I

    .line 35
    .line 36
    shr-int/lit8 v3, p1, 0xc

    .line 37
    .line 38
    and-int/lit8 v3, v3, 0x3f

    .line 39
    .line 40
    or-int/lit16 v3, v3, 0x80

    .line 41
    int-to-byte v3, v3

    .line 42
    .line 43
    aput-byte v3, p2, v1

    .line 44
    .line 45
    add-int/lit8 v1, v0, 0x3

    .line 46
    .line 47
    iput v1, p0, Li7/i;->w:I

    .line 48
    .line 49
    shr-int/lit8 v3, p1, 0x6

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0x3f

    .line 52
    .line 53
    or-int/lit16 v3, v3, 0x80

    .line 54
    int-to-byte v3, v3

    .line 55
    .line 56
    aput-byte v3, p2, v2

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x4

    .line 59
    .line 60
    iput v0, p0, Li7/i;->w:I

    .line 61
    .line 62
    and-int/lit8 p1, p1, 0x3f

    .line 63
    .line 64
    or-int/lit16 p1, p1, 0x80

    .line 65
    int-to-byte p1, p1

    .line 66
    .line 67
    aput-byte p1, p2, v1

    .line 68
    return-void
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
.end method

.method public final T0(Ljava/io/InputStream;[BIII)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    if-ge p3, p4, :cond_0

    .line 4
    .line 5
    add-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    add-int/lit8 v2, p3, 0x1

    .line 8
    .line 9
    aget-byte p3, p2, p3

    .line 10
    .line 11
    aput-byte p3, p2, v0

    .line 12
    move v0, v1

    .line 13
    move p3, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    array-length p3, p2

    .line 16
    .line 17
    .line 18
    invoke-static {p5, p3}, Ljava/lang/Math;->min(II)I

    .line 19
    move-result p3

    .line 20
    .line 21
    :cond_1
    sub-int p4, p3, v0

    .line 22
    .line 23
    if-nez p4, :cond_2

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {p1, p2, v0, p4}, Ljava/io/InputStream;->read([BII)I

    .line 28
    move-result p4

    .line 29
    .line 30
    if-gez p4, :cond_3

    .line 31
    :goto_1
    return v0

    .line 32
    :cond_3
    add-int/2addr v0, p4

    .line 33
    const/4 p4, 0x3

    .line 34
    .line 35
    if-lt v0, p4, :cond_1

    .line 36
    return v0
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

.method public U(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a boolean value"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x5

    .line 11
    .line 12
    iget v1, p0, Li7/i;->x:I

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 18
    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    sget-object p1, Li7/i;->E:[B

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    sget-object p1, Li7/i;->F:[B

    .line 25
    :goto_0
    array-length v0, p1

    .line 26
    .line 27
    iget-object v1, p0, Li7/i;->v:[B

    .line 28
    .line 29
    iget v2, p0, Li7/i;->w:I

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    iget p1, p0, Li7/i;->w:I

    .line 36
    add-int/2addr p1, v0

    .line 37
    .line 38
    iput p1, p0, Li7/i;->w:I

    .line 39
    return-void
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

.method public U0()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Li7/i;->v:[B

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v2, p0, Li7/i;->B:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iput-object v1, p0, Li7/i;->v:[B

    .line 12
    .line 13
    iget-object v2, p0, Li7/c;->l:Lcom/fasterxml/jackson/core/io/d;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/core/io/d;->t([B)V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Li7/i;->z:[C

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Li7/i;->z:[C

    .line 23
    .line 24
    iget-object v1, p0, Li7/c;->l:Lcom/fasterxml/jackson/core/io/d;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/d;->p([C)V

    .line 28
    :cond_1
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
.end method

.method public final V0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;[B)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v2, p3

    .line 3
    .line 4
    iget v0, p0, Li7/i;->x:I

    .line 5
    .line 6
    add-int/lit8 v6, v0, -0x6

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    .line 10
    move-result v0

    .line 11
    const/4 v7, 0x2

    .line 12
    shr-int/2addr v0, v7

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v1, -0x3

    .line 15
    move v9, v0

    .line 16
    move v3, v8

    .line 17
    move v4, v3

    .line 18
    move v10, v4

    .line 19
    :goto_0
    const/4 v11, 0x3

    .line 20
    .line 21
    if-le v3, v1, :cond_4

    .line 22
    array-length v5, v2

    .line 23
    move-object v0, p0

    .line 24
    move-object v1, p2

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {v0 .. v5}, Li7/i;->T0(Ljava/io/InputStream;[BIII)I

    .line 28
    move-result v4

    .line 29
    .line 30
    if-ge v4, v11, :cond_3

    .line 31
    .line 32
    if-lez v4, :cond_2

    .line 33
    .line 34
    iget p2, p0, Li7/i;->w:I

    .line 35
    .line 36
    if-le p2, v6, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 40
    .line 41
    :cond_0
    aget-byte p2, p3, v8

    .line 42
    .line 43
    shl-int/lit8 p2, p2, 0x10

    .line 44
    const/4 v1, 0x1

    .line 45
    .line 46
    if-ge v1, v4, :cond_1

    .line 47
    .line 48
    aget-byte v1, p3, v1

    .line 49
    .line 50
    and-int/lit16 v1, v1, 0xff

    .line 51
    .line 52
    shl-int/lit8 v1, v1, 0x8

    .line 53
    or-int/2addr p2, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v7, v1

    .line 56
    :goto_1
    add-int/2addr v10, v7

    .line 57
    .line 58
    iget-object v1, p0, Li7/i;->v:[B

    .line 59
    .line 60
    iget v2, p0, Li7/i;->w:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2, v7, v1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Partial(II[BI)I

    .line 64
    move-result p1

    .line 65
    .line 66
    iput p1, p0, Li7/i;->w:I

    .line 67
    :cond_2
    return v10

    .line 68
    .line 69
    :cond_3
    add-int/lit8 v1, v4, -0x3

    .line 70
    move v3, v8

    .line 71
    .line 72
    :cond_4
    iget v2, p0, Li7/i;->w:I

    .line 73
    .line 74
    if-le v2, v6, :cond_5

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 78
    .line 79
    :cond_5
    add-int/lit8 v2, v3, 0x1

    .line 80
    .line 81
    aget-byte v5, p3, v3

    .line 82
    .line 83
    shl-int/lit8 v5, v5, 0x8

    .line 84
    .line 85
    add-int/lit8 v12, v3, 0x2

    .line 86
    .line 87
    aget-byte v2, p3, v2

    .line 88
    .line 89
    and-int/lit16 v2, v2, 0xff

    .line 90
    or-int/2addr v2, v5

    .line 91
    .line 92
    shl-int/lit8 v2, v2, 0x8

    .line 93
    add-int/2addr v3, v11

    .line 94
    .line 95
    aget-byte v5, p3, v12

    .line 96
    .line 97
    and-int/lit16 v5, v5, 0xff

    .line 98
    or-int/2addr v2, v5

    .line 99
    .line 100
    add-int/lit8 v10, v10, 0x3

    .line 101
    .line 102
    iget-object v5, p0, Li7/i;->v:[B

    .line 103
    .line 104
    iget v11, p0, Li7/i;->w:I

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2, v5, v11}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Chunk(I[BI)I

    .line 108
    move-result v2

    .line 109
    .line 110
    iput v2, p0, Li7/i;->w:I

    .line 111
    .line 112
    add-int/lit8 v9, v9, -0x1

    .line 113
    .line 114
    if-gtz v9, :cond_6

    .line 115
    .line 116
    iget-object v5, p0, Li7/i;->v:[B

    .line 117
    .line 118
    add-int/lit8 v9, v2, 0x1

    .line 119
    .line 120
    iput v9, p0, Li7/i;->w:I

    .line 121
    .line 122
    const/16 v11, 0x5c

    .line 123
    .line 124
    aput-byte v11, v5, v2

    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x2

    .line 127
    .line 128
    iput v2, p0, Li7/i;->w:I

    .line 129
    .line 130
    const/16 v2, 0x6e

    .line 131
    .line 132
    aput-byte v2, v5, v9

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    .line 136
    move-result v2

    .line 137
    shr-int/2addr v2, v7

    .line 138
    move v9, v2

    .line 139
    .line 140
    :cond_6
    move-object/from16 v2, p3

    .line 141
    goto :goto_0
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
.end method

.method public final W()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v1, "Current context not Array but "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-object v1, p0, Lf7/a;->i:Li7/e;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lf7/a;->i:Li7/e;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->d()I

    .line 44
    move-result v1

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p0, v1}, Lcom/fasterxml/jackson/core/h;->writeEndArray(Lcom/fasterxml/jackson/core/JsonGenerator;I)V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    iget v0, p0, Li7/i;->w:I

    .line 51
    .line 52
    iget v1, p0, Li7/i;->x:I

    .line 53
    .line 54
    if-lt v0, v1, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Li7/i;->v:[B

    .line 60
    .line 61
    iget v1, p0, Li7/i;->w:I

    .line 62
    .line 63
    add-int/lit8 v2, v1, 0x1

    .line 64
    .line 65
    iput v2, p0, Li7/i;->w:I

    .line 66
    .line 67
    const/16 v2, 0x5d

    .line 68
    .line 69
    aput-byte v2, v0, v1

    .line 70
    .line 71
    :goto_0
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Li7/e;->l()Li7/e;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    iput-object v0, p0, Lf7/a;->i:Li7/e;

    .line 78
    return-void
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
.end method

.method public final W0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;[BI)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->x:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x6

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    shr-int/2addr v1, v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, -0x3

    .line 13
    .line 14
    move/from16 v10, p4

    .line 15
    move v8, v3

    .line 16
    move v9, v8

    .line 17
    .line 18
    :cond_0
    :goto_0
    if-le v10, v2, :cond_4

    .line 19
    const/4 v11, 0x3

    .line 20
    .line 21
    if-le v8, v4, :cond_2

    .line 22
    move-object v5, p0

    .line 23
    move-object v6, p2

    .line 24
    .line 25
    move-object/from16 v7, p3

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {v5 .. v10}, Li7/i;->T0(Ljava/io/InputStream;[BIII)I

    .line 29
    move-result v9

    .line 30
    .line 31
    if-ge v9, v11, :cond_1

    .line 32
    move v8, v3

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    add-int/lit8 v4, v9, -0x3

    .line 36
    move v8, v3

    .line 37
    .line 38
    :cond_2
    iget v6, p0, Li7/i;->w:I

    .line 39
    .line 40
    if-le v6, v0, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 44
    .line 45
    :cond_3
    add-int/lit8 v6, v8, 0x1

    .line 46
    .line 47
    aget-byte v7, p3, v8

    .line 48
    .line 49
    shl-int/lit8 v7, v7, 0x8

    .line 50
    .line 51
    add-int/lit8 v12, v8, 0x2

    .line 52
    .line 53
    aget-byte v6, p3, v6

    .line 54
    .line 55
    and-int/lit16 v6, v6, 0xff

    .line 56
    or-int/2addr v6, v7

    .line 57
    .line 58
    shl-int/lit8 v6, v6, 0x8

    .line 59
    add-int/2addr v8, v11

    .line 60
    .line 61
    aget-byte v7, p3, v12

    .line 62
    .line 63
    and-int/lit16 v7, v7, 0xff

    .line 64
    or-int/2addr v6, v7

    .line 65
    .line 66
    add-int/lit8 v10, v10, -0x3

    .line 67
    .line 68
    iget-object v7, p0, Li7/i;->v:[B

    .line 69
    .line 70
    iget v11, p0, Li7/i;->w:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v6, v7, v11}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Chunk(I[BI)I

    .line 74
    move-result v6

    .line 75
    .line 76
    iput v6, p0, Li7/i;->w:I

    .line 77
    .line 78
    add-int/lit8 v1, v1, -0x1

    .line 79
    .line 80
    if-gtz v1, :cond_0

    .line 81
    .line 82
    iget-object v1, p0, Li7/i;->v:[B

    .line 83
    .line 84
    add-int/lit8 v7, v6, 0x1

    .line 85
    .line 86
    iput v7, p0, Li7/i;->w:I

    .line 87
    .line 88
    const/16 v11, 0x5c

    .line 89
    .line 90
    aput-byte v11, v1, v6

    .line 91
    .line 92
    add-int/lit8 v6, v6, 0x2

    .line 93
    .line 94
    iput v6, p0, Li7/i;->w:I

    .line 95
    .line 96
    const/16 v6, 0x6e

    .line 97
    .line 98
    aput-byte v6, v1, v7

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    .line 102
    move-result v1

    .line 103
    shr-int/2addr v1, v2

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_4
    :goto_1
    if-lez v10, :cond_7

    .line 107
    move-object v5, p0

    .line 108
    move-object v6, p2

    .line 109
    .line 110
    move-object/from16 v7, p3

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v5 .. v10}, Li7/i;->T0(Ljava/io/InputStream;[BIII)I

    .line 114
    move-result p2

    .line 115
    .line 116
    if-lez p2, :cond_7

    .line 117
    .line 118
    iget v1, p0, Li7/i;->w:I

    .line 119
    .line 120
    if-le v1, v0, :cond_5

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 124
    .line 125
    :cond_5
    aget-byte v0, p3, v3

    .line 126
    .line 127
    shl-int/lit8 v0, v0, 0x10

    .line 128
    const/4 v1, 0x1

    .line 129
    .line 130
    if-ge v1, p2, :cond_6

    .line 131
    .line 132
    aget-byte p2, p3, v1

    .line 133
    .line 134
    and-int/lit16 p2, p2, 0xff

    .line 135
    .line 136
    shl-int/lit8 p2, p2, 0x8

    .line 137
    or-int/2addr v0, p2

    .line 138
    goto :goto_2

    .line 139
    :cond_6
    move v2, v1

    .line 140
    .line 141
    :goto_2
    iget-object p2, p0, Li7/i;->v:[B

    .line 142
    .line 143
    iget v1, p0, Li7/i;->w:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0, v2, p2, v1}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Partial(II[BI)I

    .line 147
    move-result p1

    .line 148
    .line 149
    iput p1, p0, Li7/i;->w:I

    .line 150
    sub-int/2addr v10, v2

    .line 151
    :cond_7
    return v10
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

.method public final X()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v1, "Current context not Object but "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-object v1, p0, Lf7/a;->i:Li7/e;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lf7/a;->i:Li7/e;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->d()I

    .line 44
    move-result v1

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p0, v1}, Lcom/fasterxml/jackson/core/h;->writeEndObject(Lcom/fasterxml/jackson/core/JsonGenerator;I)V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    iget v0, p0, Li7/i;->w:I

    .line 51
    .line 52
    iget v1, p0, Li7/i;->x:I

    .line 53
    .line 54
    if-lt v0, v1, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Li7/i;->v:[B

    .line 60
    .line 61
    iget v1, p0, Li7/i;->w:I

    .line 62
    .line 63
    add-int/lit8 v2, v1, 0x1

    .line 64
    .line 65
    iput v2, p0, Li7/i;->w:I

    .line 66
    .line 67
    const/16 v2, 0x7d

    .line 68
    .line 69
    aput-byte v2, v0, v1

    .line 70
    .line 71
    :goto_0
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Li7/e;->l()Li7/e;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    iput-object v0, p0, Lf7/a;->i:Li7/e;

    .line 78
    return-void
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
.end method

.method public final X0(Lcom/fasterxml/jackson/core/Base64Variant;[BII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    .line 2
    add-int/lit8 v0, p4, -0x3

    .line 3
    .line 4
    iget v1, p0, Li7/i;->x:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x6

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x2

    .line 12
    :goto_0
    shr-int/2addr v2, v3

    .line 13
    .line 14
    :cond_0
    if-gt p3, v0, :cond_2

    .line 15
    .line 16
    iget v4, p0, Li7/i;->w:I

    .line 17
    .line 18
    if-le v4, v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 22
    .line 23
    :cond_1
    add-int/lit8 v4, p3, 0x1

    .line 24
    .line 25
    aget-byte v5, p2, p3

    .line 26
    .line 27
    shl-int/lit8 v5, v5, 0x8

    .line 28
    .line 29
    add-int/lit8 v6, p3, 0x2

    .line 30
    .line 31
    aget-byte v4, p2, v4

    .line 32
    .line 33
    and-int/lit16 v4, v4, 0xff

    .line 34
    or-int/2addr v4, v5

    .line 35
    .line 36
    shl-int/lit8 v4, v4, 0x8

    .line 37
    .line 38
    add-int/lit8 p3, p3, 0x3

    .line 39
    .line 40
    aget-byte v5, p2, v6

    .line 41
    .line 42
    and-int/lit16 v5, v5, 0xff

    .line 43
    or-int/2addr v4, v5

    .line 44
    .line 45
    iget-object v5, p0, Li7/i;->v:[B

    .line 46
    .line 47
    iget v6, p0, Li7/i;->w:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v4, v5, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Chunk(I[BI)I

    .line 51
    move-result v4

    .line 52
    .line 53
    iput v4, p0, Li7/i;->w:I

    .line 54
    .line 55
    add-int/lit8 v2, v2, -0x1

    .line 56
    .line 57
    if-gtz v2, :cond_0

    .line 58
    .line 59
    iget-object v2, p0, Li7/i;->v:[B

    .line 60
    .line 61
    add-int/lit8 v5, v4, 0x1

    .line 62
    .line 63
    iput v5, p0, Li7/i;->w:I

    .line 64
    .line 65
    const/16 v6, 0x5c

    .line 66
    .line 67
    aput-byte v6, v2, v4

    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x2

    .line 70
    .line 71
    iput v4, p0, Li7/i;->w:I

    .line 72
    .line 73
    const/16 v4, 0x6e

    .line 74
    .line 75
    aput-byte v4, v2, v5

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    .line 79
    move-result v2

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    sub-int/2addr p4, p3

    .line 82
    .line 83
    if-lez p4, :cond_5

    .line 84
    .line 85
    iget v0, p0, Li7/i;->w:I

    .line 86
    .line 87
    if-le v0, v1, :cond_3

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 91
    .line 92
    :cond_3
    add-int/lit8 v0, p3, 0x1

    .line 93
    .line 94
    aget-byte p3, p2, p3

    .line 95
    .line 96
    shl-int/lit8 p3, p3, 0x10

    .line 97
    .line 98
    if-ne p4, v3, :cond_4

    .line 99
    .line 100
    aget-byte p2, p2, v0

    .line 101
    .line 102
    and-int/lit16 p2, p2, 0xff

    .line 103
    .line 104
    shl-int/lit8 p2, p2, 0x8

    .line 105
    or-int/2addr p3, p2

    .line 106
    .line 107
    :cond_4
    iget-object p2, p0, Li7/i;->v:[B

    .line 108
    .line 109
    iget v0, p0, Li7/i;->w:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p3, p4, p2, v0}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Partial(II[BI)I

    .line 113
    move-result p1

    .line 114
    .line 115
    iput p1, p0, Li7/i;->w:I

    .line 116
    :cond_5
    return-void
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

.method public final Y0([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    iget v1, p0, Li7/i;->w:I

    .line 4
    add-int/2addr v1, v0

    .line 5
    .line 6
    iget v2, p0, Li7/i;->x:I

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-le v1, v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 13
    .line 14
    const/16 v1, 0x200

    .line 15
    .line 16
    if-le v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Li7/i;->v:[B

    .line 25
    .line 26
    iget v2, p0, Li7/i;->w:I

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    iget p1, p0, Li7/i;->w:I

    .line 32
    add-int/2addr p1, v0

    .line 33
    .line 34
    iput p1, p0, Li7/i;->w:I

    .line 35
    return-void
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

.method public Z(Lcom/fasterxml/jackson/core/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li7/i;->e1(Lcom/fasterxml/jackson/core/i;)V

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->getValue()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Li7/e;->w(Ljava/lang/String;)I

    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x4

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    const-string v1, "Can not write a field name, expecting a value"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 27
    :cond_1
    const/4 v1, 0x1

    .line 28
    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    iget v0, p0, Li7/i;->w:I

    .line 32
    .line 33
    iget v1, p0, Li7/i;->x:I

    .line 34
    .line 35
    if-lt v0, v1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Li7/i;->v:[B

    .line 41
    .line 42
    iget v1, p0, Li7/i;->w:I

    .line 43
    .line 44
    add-int/lit8 v2, v1, 0x1

    .line 45
    .line 46
    iput v2, p0, Li7/i;->w:I

    .line 47
    .line 48
    const/16 v2, 0x2c

    .line 49
    .line 50
    aput-byte v2, v0, v1

    .line 51
    .line 52
    :cond_3
    iget-boolean v0, p0, Li7/c;->q:Z

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Li7/i;->v1(Lcom/fasterxml/jackson/core/i;)V

    .line 58
    return-void

    .line 59
    .line 60
    :cond_4
    iget v0, p0, Li7/i;->w:I

    .line 61
    .line 62
    iget v1, p0, Li7/i;->x:I

    .line 63
    .line 64
    if-lt v0, v1, :cond_5

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 68
    .line 69
    :cond_5
    iget-object v0, p0, Li7/i;->v:[B

    .line 70
    .line 71
    iget v1, p0, Li7/i;->w:I

    .line 72
    .line 73
    add-int/lit8 v2, v1, 0x1

    .line 74
    .line 75
    iput v2, p0, Li7/i;->w:I

    .line 76
    .line 77
    iget-byte v3, p0, Li7/i;->u:B

    .line 78
    .line 79
    aput-byte v3, v0, v1

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v0, v2}, Lcom/fasterxml/jackson/core/i;->appendQuotedUTF8([BI)I

    .line 83
    move-result v0

    .line 84
    .line 85
    if-gez v0, :cond_6

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asQuotedUTF8()[B

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :cond_6
    iget p1, p0, Li7/i;->w:I

    .line 96
    add-int/2addr p1, v0

    .line 97
    .line 98
    iput p1, p0, Li7/i;->w:I

    .line 99
    .line 100
    :goto_0
    iget p1, p0, Li7/i;->w:I

    .line 101
    .line 102
    iget v0, p0, Li7/i;->x:I

    .line 103
    .line 104
    if-lt p1, v0, :cond_7

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 108
    .line 109
    :cond_7
    iget-object p1, p0, Li7/i;->v:[B

    .line 110
    .line 111
    iget v0, p0, Li7/i;->w:I

    .line 112
    .line 113
    add-int/lit8 v1, v0, 0x1

    .line 114
    .line 115
    iput v1, p0, Li7/i;->w:I

    .line 116
    .line 117
    iget-byte v1, p0, Li7/i;->u:B

    .line 118
    .line 119
    aput-byte v1, p1, v0

    .line 120
    return-void
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
.end method

.method public final Z0([BILcom/fasterxml/jackson/core/i;I)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonGenerationException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p3}, Lcom/fasterxml/jackson/core/i;->asUnquotedUTF8()[B

    .line 4
    move-result-object v4

    .line 5
    array-length p3, v4

    .line 6
    const/4 v0, 0x6

    .line 7
    .line 8
    if-le p3, v0, :cond_0

    .line 9
    .line 10
    iget v3, p0, Li7/i;->x:I

    .line 11
    move-object v0, p0

    .line 12
    move-object v1, p1

    .line 13
    move v2, p2

    .line 14
    move v5, p4

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {v0 .. v5}, Li7/i;->P0([BII[BI)I

    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    move-object v1, p1

    .line 21
    move v2, p2

    .line 22
    const/4 p1, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static {v4, p1, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    add-int p2, v2, p3

    .line 28
    return p2
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

.method public a0(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li7/i;->f1(Ljava/lang/String;)V

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Li7/e;->w(Ljava/lang/String;)I

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x4

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    const-string v1, "Can not write a field name, expecting a value"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 23
    :cond_1
    const/4 v1, 0x1

    .line 24
    .line 25
    if-ne v0, v1, :cond_3

    .line 26
    .line 27
    iget v0, p0, Li7/i;->w:I

    .line 28
    .line 29
    iget v2, p0, Li7/i;->x:I

    .line 30
    .line 31
    if-lt v0, v2, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Li7/i;->v:[B

    .line 37
    .line 38
    iget v2, p0, Li7/i;->w:I

    .line 39
    .line 40
    add-int/lit8 v3, v2, 0x1

    .line 41
    .line 42
    iput v3, p0, Li7/i;->w:I

    .line 43
    .line 44
    const/16 v3, 0x2c

    .line 45
    .line 46
    aput-byte v3, v0, v2

    .line 47
    .line 48
    :cond_3
    iget-boolean v0, p0, Li7/c;->q:Z

    .line 49
    const/4 v2, 0x0

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v2}, Li7/i;->t1(Ljava/lang/String;Z)V

    .line 55
    return-void

    .line 56
    .line 57
    .line 58
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 59
    move-result v0

    .line 60
    .line 61
    iget v3, p0, Li7/i;->A:I

    .line 62
    .line 63
    if-le v0, v3, :cond_5

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1, v1}, Li7/i;->t1(Ljava/lang/String;Z)V

    .line 67
    return-void

    .line 68
    .line 69
    :cond_5
    iget v1, p0, Li7/i;->w:I

    .line 70
    .line 71
    iget v3, p0, Li7/i;->x:I

    .line 72
    .line 73
    if-lt v1, v3, :cond_6

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 77
    .line 78
    :cond_6
    iget-object v1, p0, Li7/i;->v:[B

    .line 79
    .line 80
    iget v3, p0, Li7/i;->w:I

    .line 81
    .line 82
    add-int/lit8 v4, v3, 0x1

    .line 83
    .line 84
    iput v4, p0, Li7/i;->w:I

    .line 85
    .line 86
    iget-byte v5, p0, Li7/i;->u:B

    .line 87
    .line 88
    aput-byte v5, v1, v3

    .line 89
    .line 90
    iget v1, p0, Li7/i;->y:I

    .line 91
    .line 92
    if-gt v0, v1, :cond_8

    .line 93
    add-int/2addr v4, v0

    .line 94
    .line 95
    iget v1, p0, Li7/i;->x:I

    .line 96
    .line 97
    if-le v4, v1, :cond_7

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-virtual {p0, p1, v2, v0}, Li7/i;->m1(Ljava/lang/String;II)V

    .line 104
    goto :goto_0

    .line 105
    .line 106
    .line 107
    :cond_8
    invoke-virtual {p0, p1, v2, v0}, Li7/i;->s1(Ljava/lang/String;II)V

    .line 108
    .line 109
    :goto_0
    iget p1, p0, Li7/i;->w:I

    .line 110
    .line 111
    iget v0, p0, Li7/i;->x:I

    .line 112
    .line 113
    if-lt p1, v0, :cond_9

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 117
    .line 118
    :cond_9
    iget-object p1, p0, Li7/i;->v:[B

    .line 119
    .line 120
    iget v0, p0, Li7/i;->w:I

    .line 121
    .line 122
    add-int/lit8 v1, v0, 0x1

    .line 123
    .line 124
    iput v1, p0, Li7/i;->w:I

    .line 125
    .line 126
    iget-byte v1, p0, Li7/i;->u:B

    .line 127
    .line 128
    aput-byte v1, p1, v0

    .line 129
    return-void
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
.end method

.method public final a1(Ljava/lang/String;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    sub-int v1, p3, p2

    .line 5
    .line 6
    mul-int/lit8 v1, v1, 0x6

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Li7/i;->x:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->v:[B

    .line 19
    .line 20
    iget-object v2, p0, Li7/c;->m:[I

    .line 21
    .line 22
    iget v3, p0, Li7/c;->n:I

    .line 23
    .line 24
    if-gtz v3, :cond_1

    .line 25
    .line 26
    .line 27
    const v3, 0xffff

    .line 28
    .line 29
    :cond_1
    iget-object v4, p0, Li7/c;->o:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    .line 30
    .line 31
    :goto_0
    if-ge p2, p3, :cond_a

    .line 32
    .line 33
    add-int/lit8 v5, p2, 0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 37
    move-result p2

    .line 38
    .line 39
    const/16 v6, 0x7f

    .line 40
    .line 41
    if-gt p2, v6, :cond_6

    .line 42
    .line 43
    aget v6, v2, p2

    .line 44
    .line 45
    if-nez v6, :cond_2

    .line 46
    .line 47
    add-int/lit8 v6, v0, 0x1

    .line 48
    int-to-byte p2, p2

    .line 49
    .line 50
    aput-byte p2, v1, v0

    .line 51
    move p2, v5

    .line 52
    move v0, v6

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_2
    if-lez v6, :cond_3

    .line 56
    .line 57
    add-int/lit8 p2, v0, 0x1

    .line 58
    .line 59
    const/16 v7, 0x5c

    .line 60
    .line 61
    aput-byte v7, v1, v0

    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x2

    .line 64
    int-to-byte v6, v6

    .line 65
    .line 66
    aput-byte v6, v1, p2

    .line 67
    :goto_1
    move p2, v5

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v7, -0x2

    .line 70
    .line 71
    if-ne v6, v7, :cond_5

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, p2}, Lcom/fasterxml/jackson/core/io/CharacterEscapes;->getEscapeSequence(I)Lcom/fasterxml/jackson/core/i;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    if-nez v6, :cond_4

    .line 78
    .line 79
    new-instance v7, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    const-string v8, "Invalid custom escape definitions; custom escape not found for character code 0x"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string p2, ", although was supposed to have one"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object p2

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 107
    .line 108
    :cond_4
    sub-int p2, p3, v5

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v1, v0, v6, p2}, Li7/i;->Z0([BILcom/fasterxml/jackson/core/i;I)I

    .line 112
    move-result v0

    .line 113
    goto :goto_1

    .line 114
    .line 115
    .line 116
    :cond_5
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 117
    move-result v0

    .line 118
    goto :goto_1

    .line 119
    .line 120
    :cond_6
    if-le p2, v3, :cond_7

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 124
    move-result v0

    .line 125
    goto :goto_1

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {v4, p2}, Lcom/fasterxml/jackson/core/io/CharacterEscapes;->getEscapeSequence(I)Lcom/fasterxml/jackson/core/i;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    if-eqz v6, :cond_8

    .line 132
    .line 133
    sub-int p2, p3, v5

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v1, v0, v6, p2}, Li7/i;->Z0([BILcom/fasterxml/jackson/core/i;I)I

    .line 137
    move-result v0

    .line 138
    goto :goto_1

    .line 139
    .line 140
    :cond_8
    const/16 v6, 0x7ff

    .line 141
    .line 142
    if-gt p2, v6, :cond_9

    .line 143
    .line 144
    add-int/lit8 v6, v0, 0x1

    .line 145
    .line 146
    shr-int/lit8 v7, p2, 0x6

    .line 147
    .line 148
    or-int/lit16 v7, v7, 0xc0

    .line 149
    int-to-byte v7, v7

    .line 150
    .line 151
    aput-byte v7, v1, v0

    .line 152
    .line 153
    add-int/lit8 v0, v0, 0x2

    .line 154
    .line 155
    and-int/lit8 p2, p2, 0x3f

    .line 156
    .line 157
    or-int/lit16 p2, p2, 0x80

    .line 158
    int-to-byte p2, p2

    .line 159
    .line 160
    aput-byte p2, v1, v6

    .line 161
    goto :goto_1

    .line 162
    .line 163
    .line 164
    :cond_9
    invoke-virtual {p0, p2, v0}, Li7/i;->Q0(II)I

    .line 165
    move-result p2

    .line 166
    move v0, p2

    .line 167
    goto :goto_1

    .line 168
    .line 169
    :cond_a
    iput v0, p0, Li7/i;->w:I

    .line 170
    return-void
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
.end method

.method public b0()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a null"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/i;->d1()V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final b1([CII)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    sub-int v1, p3, p2

    .line 5
    .line 6
    mul-int/lit8 v1, v1, 0x6

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Li7/i;->x:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->v:[B

    .line 19
    .line 20
    iget-object v2, p0, Li7/c;->m:[I

    .line 21
    .line 22
    iget v3, p0, Li7/c;->n:I

    .line 23
    .line 24
    if-gtz v3, :cond_1

    .line 25
    .line 26
    .line 27
    const v3, 0xffff

    .line 28
    .line 29
    :cond_1
    iget-object v4, p0, Li7/c;->o:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    .line 30
    .line 31
    :goto_0
    if-ge p2, p3, :cond_a

    .line 32
    .line 33
    add-int/lit8 v5, p2, 0x1

    .line 34
    .line 35
    aget-char p2, p1, p2

    .line 36
    .line 37
    const/16 v6, 0x7f

    .line 38
    .line 39
    if-gt p2, v6, :cond_6

    .line 40
    .line 41
    aget v6, v2, p2

    .line 42
    .line 43
    if-nez v6, :cond_2

    .line 44
    .line 45
    add-int/lit8 v6, v0, 0x1

    .line 46
    int-to-byte p2, p2

    .line 47
    .line 48
    aput-byte p2, v1, v0

    .line 49
    move p2, v5

    .line 50
    move v0, v6

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_2
    if-lez v6, :cond_3

    .line 54
    .line 55
    add-int/lit8 p2, v0, 0x1

    .line 56
    .line 57
    const/16 v7, 0x5c

    .line 58
    .line 59
    aput-byte v7, v1, v0

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x2

    .line 62
    int-to-byte v6, v6

    .line 63
    .line 64
    aput-byte v6, v1, p2

    .line 65
    :goto_1
    move p2, v5

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v7, -0x2

    .line 68
    .line 69
    if-ne v6, v7, :cond_5

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p2}, Lcom/fasterxml/jackson/core/io/CharacterEscapes;->getEscapeSequence(I)Lcom/fasterxml/jackson/core/i;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    if-nez v6, :cond_4

    .line 76
    .line 77
    new-instance v7, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    const-string v8, "Invalid custom escape definitions; custom escape not found for character code 0x"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string p2, ", although was supposed to have one"

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 105
    .line 106
    :cond_4
    sub-int p2, p3, v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1, v0, v6, p2}, Li7/i;->Z0([BILcom/fasterxml/jackson/core/i;I)I

    .line 110
    move-result v0

    .line 111
    goto :goto_1

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 115
    move-result v0

    .line 116
    goto :goto_1

    .line 117
    .line 118
    :cond_6
    if-le p2, v3, :cond_7

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 122
    move-result v0

    .line 123
    goto :goto_1

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {v4, p2}, Lcom/fasterxml/jackson/core/io/CharacterEscapes;->getEscapeSequence(I)Lcom/fasterxml/jackson/core/i;

    .line 127
    move-result-object v6

    .line 128
    .line 129
    if-eqz v6, :cond_8

    .line 130
    .line 131
    sub-int p2, p3, v5

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v1, v0, v6, p2}, Li7/i;->Z0([BILcom/fasterxml/jackson/core/i;I)I

    .line 135
    move-result v0

    .line 136
    goto :goto_1

    .line 137
    .line 138
    :cond_8
    const/16 v6, 0x7ff

    .line 139
    .line 140
    if-gt p2, v6, :cond_9

    .line 141
    .line 142
    add-int/lit8 v6, v0, 0x1

    .line 143
    .line 144
    shr-int/lit8 v7, p2, 0x6

    .line 145
    .line 146
    or-int/lit16 v7, v7, 0xc0

    .line 147
    int-to-byte v7, v7

    .line 148
    .line 149
    aput-byte v7, v1, v0

    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x2

    .line 152
    .line 153
    and-int/lit8 p2, p2, 0x3f

    .line 154
    .line 155
    or-int/lit16 p2, p2, 0x80

    .line 156
    int-to-byte p2, p2

    .line 157
    .line 158
    aput-byte p2, v1, v6

    .line 159
    goto :goto_1

    .line 160
    .line 161
    .line 162
    :cond_9
    invoke-virtual {p0, p2, v0}, Li7/i;->Q0(II)I

    .line 163
    move-result p2

    .line 164
    move v0, p2

    .line 165
    goto :goto_1

    .line 166
    .line 167
    :cond_a
    iput v0, p0, Li7/i;->w:I

    .line 168
    return-void
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
.end method

.method public c0(D)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/core/io/h;->o(D)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->QUOTE_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 13
    .line 14
    iget v1, p0, Lf7/a;->g:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->enabledIn(I)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    const-string/jumbo v0, "write a number"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Li7/i;->q0(Ljava/lang/String;)V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Li7/i;->C0(Ljava/lang/String;)V

    .line 43
    return-void
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

.method public final c1(II)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/i;->v:[B

    .line 3
    .line 4
    add-int/lit8 v1, p2, 0x1

    .line 5
    .line 6
    const/16 v2, 0x5c

    .line 7
    .line 8
    aput-byte v2, v0, p2

    .line 9
    .line 10
    add-int/lit8 v2, p2, 0x2

    .line 11
    .line 12
    const/16 v3, 0x75

    .line 13
    .line 14
    aput-byte v3, v0, v1

    .line 15
    .line 16
    const/16 v1, 0xff

    .line 17
    .line 18
    if-le p1, v1, :cond_0

    .line 19
    .line 20
    shr-int/lit8 v1, p1, 0x8

    .line 21
    .line 22
    and-int/lit16 v3, v1, 0xff

    .line 23
    .line 24
    add-int/lit8 v4, p2, 0x3

    .line 25
    .line 26
    sget-object v5, Li7/i;->C:[B

    .line 27
    .line 28
    shr-int/lit8 v3, v3, 0x4

    .line 29
    .line 30
    aget-byte v3, v5, v3

    .line 31
    .line 32
    aput-byte v3, v0, v2

    .line 33
    .line 34
    add-int/lit8 p2, p2, 0x4

    .line 35
    .line 36
    and-int/lit8 v1, v1, 0xf

    .line 37
    .line 38
    aget-byte v1, v5, v1

    .line 39
    .line 40
    aput-byte v1, v0, v4

    .line 41
    .line 42
    and-int/lit16 p1, p1, 0xff

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, p2, 0x3

    .line 46
    .line 47
    const/16 v3, 0x30

    .line 48
    .line 49
    aput-byte v3, v0, v2

    .line 50
    .line 51
    add-int/lit8 p2, p2, 0x4

    .line 52
    .line 53
    aput-byte v3, v0, v1

    .line 54
    .line 55
    :goto_0
    add-int/lit8 v1, p2, 0x1

    .line 56
    .line 57
    sget-object v2, Li7/i;->C:[B

    .line 58
    .line 59
    shr-int/lit8 v3, p1, 0x4

    .line 60
    .line 61
    aget-byte v3, v2, v3

    .line 62
    .line 63
    aput-byte v3, v0, p2

    .line 64
    .line 65
    add-int/lit8 p2, p2, 0x2

    .line 66
    .line 67
    and-int/lit8 p1, p1, 0xf

    .line 68
    .line 69
    aget-byte p1, v2, p1

    .line 70
    .line 71
    aput-byte p1, v0, v1

    .line 72
    return p2
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
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lf7/a;->close()V

    .line 4
    .line 5
    iget-object v0, p0, Li7/i;->v:[B

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->AUTO_CLOSE_JSON_CONTENT:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lf7/a;->q(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Lf7/a;->o()Lcom/fasterxml/jackson/core/f;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Li7/i;->W()V

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li7/i;->X()V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 43
    const/4 v0, 0x0

    .line 44
    .line 45
    iput v0, p0, Li7/i;->w:I

    .line 46
    .line 47
    iget-object v0, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    iget-object v0, p0, Li7/c;->l:Lcom/fasterxml/jackson/core/io/d;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/d;->n()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->AUTO_CLOSE_TARGET:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lf7/a;->q(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->FLUSH_PASSED_TO_STREAM:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lf7/a;->q(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v0, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 80
    goto :goto_2

    .line 81
    .line 82
    :cond_3
    :goto_1
    iget-object v0, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_2
    invoke-virtual {p0}, Li7/i;->U0()V

    .line 89
    return-void
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
.end method

.method public d0(F)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/h;->p(F)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->QUOTE_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 13
    .line 14
    iget v1, p0, Lf7/a;->g:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->enabledIn(I)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    const-string/jumbo v0, "write a number"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Li7/i;->q0(Ljava/lang/String;)V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Li7/i;->C0(Ljava/lang/String;)V

    .line 43
    return-void
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

.method public final d1()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    const/4 v1, 0x4

    .line 4
    add-int/2addr v0, v1

    .line 5
    .line 6
    iget v2, p0, Li7/i;->x:I

    .line 7
    .line 8
    if-lt v0, v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    :cond_0
    sget-object v0, Li7/i;->D:[B

    .line 14
    .line 15
    iget-object v2, p0, Li7/i;->v:[B

    .line 16
    .line 17
    iget v3, p0, Li7/i;->w:I

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v4, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    iget v0, p0, Li7/i;->w:I

    .line 24
    add-int/2addr v0, v1

    .line 25
    .line 26
    iput v0, p0, Li7/i;->w:I

    .line 27
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

.method public e0(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a number"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0xb

    .line 11
    .line 12
    iget v1, p0, Li7/i;->x:I

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 18
    .line 19
    :cond_0
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Li7/i;->g1(I)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Li7/i;->v:[B

    .line 28
    .line 29
    iget v1, p0, Li7/i;->w:I

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v1}, Lcom/fasterxml/jackson/core/io/h;->q(I[BI)I

    .line 33
    move-result p1

    .line 34
    .line 35
    iput p1, p0, Li7/i;->w:I

    .line 36
    return-void
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

.method public final e1(Lcom/fasterxml/jackson/core/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->getValue()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Li7/e;->w(Ljava/lang/String;)I

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const-string v1, "Can not write a field name, expecting a value"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/core/h;->writeObjectEntrySeparator(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/core/h;->beforeObjectEntries(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 33
    .line 34
    :goto_0
    iget-boolean v0, p0, Li7/c;->q:Z

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iget v1, p0, Li7/i;->w:I

    .line 39
    .line 40
    iget v2, p0, Li7/i;->x:I

    .line 41
    .line 42
    if-lt v1, v2, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, Li7/i;->v:[B

    .line 48
    .line 49
    iget v2, p0, Li7/i;->w:I

    .line 50
    .line 51
    add-int/lit8 v3, v2, 0x1

    .line 52
    .line 53
    iput v3, p0, Li7/i;->w:I

    .line 54
    .line 55
    iget-byte v3, p0, Li7/i;->u:B

    .line 56
    .line 57
    aput-byte v3, v1, v2

    .line 58
    .line 59
    :cond_3
    iget-object v1, p0, Li7/i;->v:[B

    .line 60
    .line 61
    iget v2, p0, Li7/i;->w:I

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v1, v2}, Lcom/fasterxml/jackson/core/i;->appendQuotedUTF8([BI)I

    .line 65
    move-result v1

    .line 66
    .line 67
    if-gez v1, :cond_4

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asQuotedUTF8()[B

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_4
    iget p1, p0, Li7/i;->w:I

    .line 78
    add-int/2addr p1, v1

    .line 79
    .line 80
    iput p1, p0, Li7/i;->w:I

    .line 81
    .line 82
    :goto_1
    if-nez v0, :cond_6

    .line 83
    .line 84
    iget p1, p0, Li7/i;->w:I

    .line 85
    .line 86
    iget v0, p0, Li7/i;->x:I

    .line 87
    .line 88
    if-lt p1, v0, :cond_5

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 92
    .line 93
    :cond_5
    iget-object p1, p0, Li7/i;->v:[B

    .line 94
    .line 95
    iget v0, p0, Li7/i;->w:I

    .line 96
    .line 97
    add-int/lit8 v1, v0, 0x1

    .line 98
    .line 99
    iput v1, p0, Li7/i;->w:I

    .line 100
    .line 101
    iget-byte v1, p0, Li7/i;->u:B

    .line 102
    .line 103
    aput-byte v1, p1, v0

    .line 104
    :cond_6
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
.end method

.method public f0(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a number"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Li7/i;->h1(J)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x15

    .line 19
    .line 20
    iget v1, p0, Li7/i;->x:I

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Li7/i;->v:[B

    .line 28
    .line 29
    iget v1, p0, Li7/i;->w:I

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2, v0, v1}, Lcom/fasterxml/jackson/core/io/h;->s(J[BI)I

    .line 33
    move-result p1

    .line 34
    .line 35
    iput p1, p0, Li7/i;->w:I

    .line 36
    return-void
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

.method public final f1(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li7/e;->w(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const-string v1, "Can not write a field name, expecting a value"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->a(Ljava/lang/String;)V

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/core/h;->writeObjectEntrySeparator(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/core/h;->beforeObjectEntries(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 29
    .line 30
    :goto_0
    iget-boolean v0, p0, Li7/c;->q:Z

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, v2}, Li7/i;->t1(Ljava/lang/String;Z)V

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 41
    move-result v0

    .line 42
    .line 43
    iget v3, p0, Li7/i;->A:I

    .line 44
    .line 45
    if-le v0, v3, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, v1}, Li7/i;->t1(Ljava/lang/String;Z)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_3
    iget v1, p0, Li7/i;->w:I

    .line 52
    .line 53
    iget v3, p0, Li7/i;->x:I

    .line 54
    .line 55
    if-lt v1, v3, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 59
    .line 60
    :cond_4
    iget-object v1, p0, Li7/i;->v:[B

    .line 61
    .line 62
    iget v3, p0, Li7/i;->w:I

    .line 63
    .line 64
    add-int/lit8 v4, v3, 0x1

    .line 65
    .line 66
    iput v4, p0, Li7/i;->w:I

    .line 67
    .line 68
    iget-byte v4, p0, Li7/i;->u:B

    .line 69
    .line 70
    aput-byte v4, v1, v3

    .line 71
    .line 72
    iget-object v1, p0, Li7/i;->z:[C

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 76
    .line 77
    iget p1, p0, Li7/i;->y:I

    .line 78
    .line 79
    if-gt v0, p1, :cond_6

    .line 80
    .line 81
    iget p1, p0, Li7/i;->w:I

    .line 82
    add-int/2addr p1, v0

    .line 83
    .line 84
    iget v1, p0, Li7/i;->x:I

    .line 85
    .line 86
    if-le p1, v1, :cond_5

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 90
    .line 91
    :cond_5
    iget-object p1, p0, Li7/i;->z:[C

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1, v2, v0}, Li7/i;->n1([CII)V

    .line 95
    goto :goto_1

    .line 96
    .line 97
    :cond_6
    iget-object p1, p0, Li7/i;->z:[C

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, v2, v0}, Li7/i;->u1([CII)V

    .line 101
    .line 102
    :goto_1
    iget p1, p0, Li7/i;->w:I

    .line 103
    .line 104
    iget v0, p0, Li7/i;->x:I

    .line 105
    .line 106
    if-lt p1, v0, :cond_7

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 110
    .line 111
    :cond_7
    iget-object p1, p0, Li7/i;->v:[B

    .line 112
    .line 113
    iget v0, p0, Li7/i;->w:I

    .line 114
    .line 115
    add-int/lit8 v1, v0, 0x1

    .line 116
    .line 117
    iput v1, p0, Li7/i;->w:I

    .line 118
    .line 119
    iget-byte v1, p0, Li7/i;->u:B

    .line 120
    .line 121
    aput-byte v1, p1, v0

    .line 122
    return-void
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
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 4
    .line 5
    iget-object v0, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->FLUSH_PASSED_TO_STREAM:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lf7/a;->q(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Li7/i;->t:Ljava/io/OutputStream;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 21
    :cond_0
    return-void
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
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a number"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->d1()V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Li7/i;->i1(Ljava/lang/String;)V

    .line 20
    return-void

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Li7/i;->q0(Ljava/lang/String;)V

    .line 24
    return-void
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

.method public final g1(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0xd

    .line 5
    .line 6
    iget v1, p0, Li7/i;->x:I

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 14
    .line 15
    iget v1, p0, Li7/i;->w:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Li7/i;->w:I

    .line 20
    .line 21
    iget-byte v3, p0, Li7/i;->u:B

    .line 22
    .line 23
    aput-byte v3, v0, v1

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0, v2}, Lcom/fasterxml/jackson/core/io/h;->q(I[BI)I

    .line 27
    move-result p1

    .line 28
    .line 29
    iget-object v0, p0, Li7/i;->v:[B

    .line 30
    .line 31
    add-int/lit8 v1, p1, 0x1

    .line 32
    .line 33
    iput v1, p0, Li7/i;->w:I

    .line 34
    .line 35
    iget-byte v1, p0, Li7/i;->u:B

    .line 36
    .line 37
    aput-byte v1, v0, p1

    .line 38
    return-void
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

.method public h0(Ljava/math/BigDecimal;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a number"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->d1()V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lf7/a;->I0(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Li7/i;->i1(Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, p1}, Lf7/a;->I0(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Li7/i;->q0(Ljava/lang/String;)V

    .line 32
    return-void
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

.method public final h1(J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x17

    .line 5
    .line 6
    iget v1, p0, Li7/i;->x:I

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 14
    .line 15
    iget v1, p0, Li7/i;->w:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Li7/i;->w:I

    .line 20
    .line 21
    iget-byte v3, p0, Li7/i;->u:B

    .line 22
    .line 23
    aput-byte v3, v0, v1

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2, v0, v2}, Lcom/fasterxml/jackson/core/io/h;->s(J[BI)I

    .line 27
    move-result p1

    .line 28
    .line 29
    iget-object p2, p0, Li7/i;->v:[B

    .line 30
    .line 31
    add-int/lit8 v0, p1, 0x1

    .line 32
    .line 33
    iput v0, p0, Li7/i;->w:I

    .line 34
    .line 35
    iget-byte v0, p0, Li7/i;->u:B

    .line 36
    .line 37
    aput-byte v0, p2, p1

    .line 38
    return-void
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

.method public i0(Ljava/math/BigInteger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a number"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->d1()V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Li7/i;->i1(Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Li7/i;->q0(Ljava/lang/String;)V

    .line 32
    return-void
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

.method public final i1(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    iget v1, p0, Li7/i;->x:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 12
    .line 13
    iget v1, p0, Li7/i;->w:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Li7/i;->w:I

    .line 18
    .line 19
    iget-byte v2, p0, Li7/i;->u:B

    .line 20
    .line 21
    aput-byte v2, v0, v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Li7/i;->q0(Ljava/lang/String;)V

    .line 25
    .line 26
    iget p1, p0, Li7/i;->w:I

    .line 27
    .line 28
    iget v0, p0, Li7/i;->x:I

    .line 29
    .line 30
    if-lt p1, v0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 34
    .line 35
    :cond_1
    iget-object p1, p0, Li7/i;->v:[B

    .line 36
    .line 37
    iget v0, p0, Li7/i;->w:I

    .line 38
    .line 39
    add-int/lit8 v1, v0, 0x1

    .line 40
    .line 41
    iput v1, p0, Li7/i;->w:I

    .line 42
    .line 43
    iget-byte v1, p0, Li7/i;->u:B

    .line 44
    .line 45
    aput-byte v1, p1, v0

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
.end method

.method public j0(S)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a number"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget v0, p0, Li7/i;->w:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x6

    .line 11
    .line 12
    iget v1, p0, Li7/i;->x:I

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 18
    .line 19
    :cond_0
    iget-boolean v0, p0, Lf7/a;->h:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Li7/i;->j1(S)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Li7/i;->v:[B

    .line 28
    .line 29
    iget v1, p0, Li7/i;->w:I

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v1}, Lcom/fasterxml/jackson/core/io/h;->q(I[BI)I

    .line 33
    move-result p1

    .line 34
    .line 35
    iput p1, p0, Li7/i;->w:I

    .line 36
    return-void
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

.method public final j1(S)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x8

    .line 5
    .line 6
    iget v1, p0, Li7/i;->x:I

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 14
    .line 15
    iget v1, p0, Li7/i;->w:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Li7/i;->w:I

    .line 20
    .line 21
    iget-byte v3, p0, Li7/i;->u:B

    .line 22
    .line 23
    aput-byte v3, v0, v1

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0, v2}, Lcom/fasterxml/jackson/core/io/h;->q(I[BI)I

    .line 27
    move-result p1

    .line 28
    .line 29
    iget-object v0, p0, Li7/i;->v:[B

    .line 30
    .line 31
    add-int/lit8 v1, p1, 0x1

    .line 32
    .line 33
    iput v1, p0, Li7/i;->w:I

    .line 34
    .line 35
    iget-byte v1, p0, Li7/i;->u:B

    .line 36
    .line 37
    aput-byte v1, v0, p1

    .line 38
    return-void
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

.method public final k1([CII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    if-ge p2, p3, :cond_3

    .line 3
    .line 4
    :cond_0
    aget-char v0, p1, p2

    .line 5
    .line 6
    const/16 v1, 0x7f

    .line 7
    .line 8
    if-le v0, v1, :cond_2

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    const/16 v1, 0x800

    .line 13
    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Li7/i;->v:[B

    .line 17
    .line 18
    iget v2, p0, Li7/i;->w:I

    .line 19
    .line 20
    add-int/lit8 v3, v2, 0x1

    .line 21
    .line 22
    iput v3, p0, Li7/i;->w:I

    .line 23
    .line 24
    shr-int/lit8 v4, v0, 0x6

    .line 25
    .line 26
    or-int/lit16 v4, v4, 0xc0

    .line 27
    int-to-byte v4, v4

    .line 28
    .line 29
    aput-byte v4, v1, v2

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x2

    .line 32
    .line 33
    iput v2, p0, Li7/i;->w:I

    .line 34
    .line 35
    and-int/lit8 v0, v0, 0x3f

    .line 36
    .line 37
    or-int/lit16 v0, v0, 0x80

    .line 38
    int-to-byte v0, v0

    .line 39
    .line 40
    aput-byte v0, v1, v3

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0, v0, p1, p2, p3}, Li7/i;->R0(I[CII)I

    .line 45
    move-result p2

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_2
    iget-object v1, p0, Li7/i;->v:[B

    .line 49
    .line 50
    iget v2, p0, Li7/i;->w:I

    .line 51
    .line 52
    add-int/lit8 v3, v2, 0x1

    .line 53
    .line 54
    iput v3, p0, Li7/i;->w:I

    .line 55
    int-to-byte v0, v0

    .line 56
    .line 57
    aput-byte v0, v1, v2

    .line 58
    .line 59
    add-int/lit8 p2, p2, 0x1

    .line 60
    .line 61
    if-lt p2, p3, :cond_0

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

.method public final l1([CII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->x:I

    .line 3
    .line 4
    iget-object v1, p0, Li7/i;->v:[B

    .line 5
    add-int/2addr p3, p2

    .line 6
    .line 7
    :goto_0
    if-ge p2, p3, :cond_5

    .line 8
    .line 9
    :cond_0
    aget-char v2, p1, p2

    .line 10
    .line 11
    const/16 v3, 0x80

    .line 12
    .line 13
    if-lt v2, v3, :cond_3

    .line 14
    .line 15
    iget v2, p0, Li7/i;->w:I

    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x3

    .line 18
    .line 19
    iget v4, p0, Li7/i;->x:I

    .line 20
    .line 21
    if-lt v2, v4, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 25
    .line 26
    :cond_1
    add-int/lit8 v2, p2, 0x1

    .line 27
    .line 28
    aget-char p2, p1, p2

    .line 29
    .line 30
    const/16 v4, 0x800

    .line 31
    .line 32
    if-ge p2, v4, :cond_2

    .line 33
    .line 34
    iget v4, p0, Li7/i;->w:I

    .line 35
    .line 36
    add-int/lit8 v5, v4, 0x1

    .line 37
    .line 38
    iput v5, p0, Li7/i;->w:I

    .line 39
    .line 40
    shr-int/lit8 v6, p2, 0x6

    .line 41
    .line 42
    or-int/lit16 v6, v6, 0xc0

    .line 43
    int-to-byte v6, v6

    .line 44
    .line 45
    aput-byte v6, v1, v4

    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x2

    .line 48
    .line 49
    iput v4, p0, Li7/i;->w:I

    .line 50
    .line 51
    and-int/lit8 p2, p2, 0x3f

    .line 52
    or-int/2addr p2, v3

    .line 53
    int-to-byte p2, p2

    .line 54
    .line 55
    aput-byte p2, v1, v5

    .line 56
    move p2, v2

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0, p2, p1, v2, p3}, Li7/i;->R0(I[CII)I

    .line 61
    move-result p2

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_3
    iget v3, p0, Li7/i;->w:I

    .line 65
    .line 66
    if-lt v3, v0, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 70
    .line 71
    :cond_4
    iget v3, p0, Li7/i;->w:I

    .line 72
    .line 73
    add-int/lit8 v4, v3, 0x1

    .line 74
    .line 75
    iput v4, p0, Li7/i;->w:I

    .line 76
    int-to-byte v2, v2

    .line 77
    .line 78
    aput-byte v2, v1, v3

    .line 79
    .line 80
    add-int/lit8 p2, p2, 0x1

    .line 81
    .line 82
    if-lt p2, p3, :cond_0

    .line 83
    :cond_5
    return-void
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

.method public final m1(Ljava/lang/String;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    add-int/2addr p3, p2

    .line 2
    .line 3
    iget v0, p0, Li7/i;->w:I

    .line 4
    .line 5
    iget-object v1, p0, Li7/i;->v:[B

    .line 6
    .line 7
    iget-object v2, p0, Li7/c;->m:[I

    .line 8
    .line 9
    :goto_0
    if-ge p2, p3, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 13
    move-result v3

    .line 14
    .line 15
    const/16 v4, 0x7f

    .line 16
    .line 17
    if-gt v3, v4, :cond_1

    .line 18
    .line 19
    aget v4, v2, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v4, v0, 0x1

    .line 25
    int-to-byte v3, v3

    .line 26
    .line 27
    aput-byte v3, v1, v0

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    move v0, v4

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    :goto_1
    iput v0, p0, Li7/i;->w:I

    .line 34
    .line 35
    if-ge p2, p3, :cond_4

    .line 36
    .line 37
    iget-object v0, p0, Li7/c;->o:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->a1(Ljava/lang/String;II)V

    .line 43
    return-void

    .line 44
    .line 45
    :cond_2
    iget v0, p0, Li7/c;->n:I

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->o1(Ljava/lang/String;II)V

    .line 51
    return-void

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->q1(Ljava/lang/String;II)V

    .line 55
    :cond_4
    return-void
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

.method public final n1([CII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    add-int/2addr p3, p2

    .line 2
    .line 3
    iget v0, p0, Li7/i;->w:I

    .line 4
    .line 5
    iget-object v1, p0, Li7/i;->v:[B

    .line 6
    .line 7
    iget-object v2, p0, Li7/c;->m:[I

    .line 8
    .line 9
    :goto_0
    if-ge p2, p3, :cond_1

    .line 10
    .line 11
    aget-char v3, p1, p2

    .line 12
    .line 13
    const/16 v4, 0x7f

    .line 14
    .line 15
    if-gt v3, v4, :cond_1

    .line 16
    .line 17
    aget v4, v2, v3

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v4, v0, 0x1

    .line 23
    int-to-byte v3, v3

    .line 24
    .line 25
    aput-byte v3, v1, v0

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x1

    .line 28
    move v0, v4

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    :goto_1
    iput v0, p0, Li7/i;->w:I

    .line 32
    .line 33
    if-ge p2, p3, :cond_4

    .line 34
    .line 35
    iget-object v0, p0, Li7/c;->o:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->b1([CII)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_2
    iget v0, p0, Li7/c;->n:I

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->p1([CII)V

    .line 49
    return-void

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->r1([CII)V

    .line 53
    :cond_4
    return-void
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

.method public o0(C)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    iget v1, p0, Li7/i;->x:I

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 14
    .line 15
    const/16 v1, 0x7f

    .line 16
    .line 17
    if-gt p1, v1, :cond_1

    .line 18
    .line 19
    iget v1, p0, Li7/i;->w:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Li7/i;->w:I

    .line 24
    int-to-byte p1, p1

    .line 25
    .line 26
    aput-byte p1, v0, v1

    .line 27
    return-void

    .line 28
    .line 29
    :cond_1
    const/16 v1, 0x800

    .line 30
    .line 31
    if-ge p1, v1, :cond_2

    .line 32
    .line 33
    iget v1, p0, Li7/i;->w:I

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    iput v2, p0, Li7/i;->w:I

    .line 38
    .line 39
    shr-int/lit8 v3, p1, 0x6

    .line 40
    .line 41
    or-int/lit16 v3, v3, 0xc0

    .line 42
    int-to-byte v3, v3

    .line 43
    .line 44
    aput-byte v3, v0, v1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    iput v1, p0, Li7/i;->w:I

    .line 49
    .line 50
    and-int/lit8 p1, p1, 0x3f

    .line 51
    .line 52
    or-int/lit16 p1, p1, 0x80

    .line 53
    int-to-byte p1, p1

    .line 54
    .line 55
    aput-byte p1, v0, v2

    .line 56
    return-void

    .line 57
    :cond_2
    const/4 v0, 0x0

    .line 58
    const/4 v1, 0x0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, v0, v1, v1}, Li7/i;->R0(I[CII)I

    .line 62
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
.end method

.method public final o1(Ljava/lang/String;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    sub-int v1, p3, p2

    .line 5
    .line 6
    mul-int/lit8 v1, v1, 0x6

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Li7/i;->x:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->v:[B

    .line 19
    .line 20
    iget-object v2, p0, Li7/c;->m:[I

    .line 21
    .line 22
    :goto_0
    if-ge p2, p3, :cond_5

    .line 23
    .line 24
    add-int/lit8 v3, p2, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 28
    move-result p2

    .line 29
    .line 30
    const/16 v4, 0x7f

    .line 31
    .line 32
    if-gt p2, v4, :cond_3

    .line 33
    .line 34
    aget v4, v2, p2

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    add-int/lit8 v4, v0, 0x1

    .line 39
    int-to-byte p2, p2

    .line 40
    .line 41
    aput-byte p2, v1, v0

    .line 42
    move p2, v3

    .line 43
    move v0, v4

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    if-lez v4, :cond_2

    .line 47
    .line 48
    add-int/lit8 p2, v0, 0x1

    .line 49
    .line 50
    const/16 v5, 0x5c

    .line 51
    .line 52
    aput-byte v5, v1, v0

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x2

    .line 55
    int-to-byte v4, v4

    .line 56
    .line 57
    aput-byte v4, v1, p2

    .line 58
    :goto_1
    move p2, v3

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 63
    move-result v0

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_3
    const/16 v4, 0x7ff

    .line 67
    .line 68
    if-gt p2, v4, :cond_4

    .line 69
    .line 70
    add-int/lit8 v4, v0, 0x1

    .line 71
    .line 72
    shr-int/lit8 v5, p2, 0x6

    .line 73
    .line 74
    or-int/lit16 v5, v5, 0xc0

    .line 75
    int-to-byte v5, v5

    .line 76
    .line 77
    aput-byte v5, v1, v0

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x2

    .line 80
    .line 81
    and-int/lit8 p2, p2, 0x3f

    .line 82
    .line 83
    or-int/lit16 p2, p2, 0x80

    .line 84
    int-to-byte p2, p2

    .line 85
    .line 86
    aput-byte p2, v1, v4

    .line 87
    goto :goto_1

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0, p2, v0}, Li7/i;->Q0(II)I

    .line 91
    move-result p2

    .line 92
    move v0, p2

    .line 93
    goto :goto_1

    .line 94
    .line 95
    :cond_5
    iput v0, p0, Li7/i;->w:I

    .line 96
    return-void
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method

.method public p0(Lcom/fasterxml/jackson/core/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/i;->v:[B

    .line 3
    .line 4
    iget v1, p0, Li7/i;->w:I

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Lcom/fasterxml/jackson/core/i;->appendUnquotedUTF8([BI)I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asUnquotedUTF8()[B

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget p1, p0, Li7/i;->w:I

    .line 21
    add-int/2addr p1, v0

    .line 22
    .line 23
    iput p1, p0, Li7/i;->w:I

    .line 24
    return-void
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

.method public final p1([CII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    sub-int v1, p3, p2

    .line 5
    .line 6
    mul-int/lit8 v1, v1, 0x6

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Li7/i;->x:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->v:[B

    .line 19
    .line 20
    iget-object v2, p0, Li7/c;->m:[I

    .line 21
    .line 22
    :goto_0
    if-ge p2, p3, :cond_5

    .line 23
    .line 24
    add-int/lit8 v3, p2, 0x1

    .line 25
    .line 26
    aget-char p2, p1, p2

    .line 27
    .line 28
    const/16 v4, 0x7f

    .line 29
    .line 30
    if-gt p2, v4, :cond_3

    .line 31
    .line 32
    aget v4, v2, p2

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    add-int/lit8 v4, v0, 0x1

    .line 37
    int-to-byte p2, p2

    .line 38
    .line 39
    aput-byte p2, v1, v0

    .line 40
    move p2, v3

    .line 41
    move v0, v4

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_1
    if-lez v4, :cond_2

    .line 45
    .line 46
    add-int/lit8 p2, v0, 0x1

    .line 47
    .line 48
    const/16 v5, 0x5c

    .line 49
    .line 50
    aput-byte v5, v1, v0

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x2

    .line 53
    int-to-byte v4, v4

    .line 54
    .line 55
    aput-byte v4, v1, p2

    .line 56
    :goto_1
    move p2, v3

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 61
    move-result v0

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_3
    const/16 v4, 0x7ff

    .line 65
    .line 66
    if-gt p2, v4, :cond_4

    .line 67
    .line 68
    add-int/lit8 v4, v0, 0x1

    .line 69
    .line 70
    shr-int/lit8 v5, p2, 0x6

    .line 71
    .line 72
    or-int/lit16 v5, v5, 0xc0

    .line 73
    int-to-byte v5, v5

    .line 74
    .line 75
    aput-byte v5, v1, v0

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x2

    .line 78
    .line 79
    and-int/lit8 p2, p2, 0x3f

    .line 80
    .line 81
    or-int/lit16 p2, p2, 0x80

    .line 82
    int-to-byte p2, p2

    .line 83
    .line 84
    aput-byte p2, v1, v4

    .line 85
    goto :goto_1

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0, p2, v0}, Li7/i;->Q0(II)I

    .line 89
    move-result p2

    .line 90
    move v0, p2

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_5
    iput v0, p0, Li7/i;->w:I

    .line 94
    return-void
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

.method public q0(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Li7/i;->z:[C

    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    if-gt v0, v2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v3, v0, v1, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1, v3, v0}, Li7/i;->r0([CII)V

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, p1, v3, v0}, Li7/i;->w1(Ljava/lang/String;II)V

    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public final q1(Ljava/lang/String;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    sub-int v1, p3, p2

    .line 5
    .line 6
    mul-int/lit8 v1, v1, 0x6

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Li7/i;->x:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->v:[B

    .line 19
    .line 20
    iget-object v2, p0, Li7/c;->m:[I

    .line 21
    .line 22
    iget v3, p0, Li7/c;->n:I

    .line 23
    .line 24
    :goto_0
    if-ge p2, p3, :cond_6

    .line 25
    .line 26
    add-int/lit8 v4, p2, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 30
    move-result p2

    .line 31
    .line 32
    const/16 v5, 0x7f

    .line 33
    .line 34
    if-gt p2, v5, :cond_3

    .line 35
    .line 36
    aget v5, v2, p2

    .line 37
    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    add-int/lit8 v5, v0, 0x1

    .line 41
    int-to-byte p2, p2

    .line 42
    .line 43
    aput-byte p2, v1, v0

    .line 44
    move p2, v4

    .line 45
    move v0, v5

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    if-lez v5, :cond_2

    .line 49
    .line 50
    add-int/lit8 p2, v0, 0x1

    .line 51
    .line 52
    const/16 v6, 0x5c

    .line 53
    .line 54
    aput-byte v6, v1, v0

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x2

    .line 57
    int-to-byte v5, v5

    .line 58
    .line 59
    aput-byte v5, v1, p2

    .line 60
    :goto_1
    move p2, v4

    .line 61
    goto :goto_0

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 65
    move-result v0

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_3
    if-le p2, v3, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 72
    move-result v0

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_4
    const/16 v5, 0x7ff

    .line 76
    .line 77
    if-gt p2, v5, :cond_5

    .line 78
    .line 79
    add-int/lit8 v5, v0, 0x1

    .line 80
    .line 81
    shr-int/lit8 v6, p2, 0x6

    .line 82
    .line 83
    or-int/lit16 v6, v6, 0xc0

    .line 84
    int-to-byte v6, v6

    .line 85
    .line 86
    aput-byte v6, v1, v0

    .line 87
    .line 88
    add-int/lit8 v0, v0, 0x2

    .line 89
    .line 90
    and-int/lit8 p2, p2, 0x3f

    .line 91
    .line 92
    or-int/lit16 p2, p2, 0x80

    .line 93
    int-to-byte p2, p2

    .line 94
    .line 95
    aput-byte p2, v1, v5

    .line 96
    goto :goto_1

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-virtual {p0, p2, v0}, Li7/i;->Q0(II)I

    .line 100
    move-result p2

    .line 101
    move v0, p2

    .line 102
    goto :goto_1

    .line 103
    .line 104
    :cond_6
    iput v0, p0, Li7/i;->w:I

    .line 105
    return-void
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
.end method

.method public final r0([CII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    add-int v0, p3, p3

    .line 3
    add-int/2addr v0, p3

    .line 4
    .line 5
    iget v1, p0, Li7/i;->w:I

    .line 6
    add-int/2addr v1, v0

    .line 7
    .line 8
    iget v2, p0, Li7/i;->x:I

    .line 9
    .line 10
    if-le v1, v2, :cond_1

    .line 11
    .line 12
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Li7/i;->l1([CII)V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 20
    :cond_1
    add-int/2addr p3, p2

    .line 21
    .line 22
    :goto_0
    if-ge p2, p3, :cond_5

    .line 23
    .line 24
    :cond_2
    aget-char v0, p1, p2

    .line 25
    .line 26
    const/16 v1, 0x7f

    .line 27
    .line 28
    if-le v0, v1, :cond_4

    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    const/16 v1, 0x800

    .line 33
    .line 34
    if-ge v0, v1, :cond_3

    .line 35
    .line 36
    iget-object v1, p0, Li7/i;->v:[B

    .line 37
    .line 38
    iget v2, p0, Li7/i;->w:I

    .line 39
    .line 40
    add-int/lit8 v3, v2, 0x1

    .line 41
    .line 42
    iput v3, p0, Li7/i;->w:I

    .line 43
    .line 44
    shr-int/lit8 v4, v0, 0x6

    .line 45
    .line 46
    or-int/lit16 v4, v4, 0xc0

    .line 47
    int-to-byte v4, v4

    .line 48
    .line 49
    aput-byte v4, v1, v2

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x2

    .line 52
    .line 53
    iput v2, p0, Li7/i;->w:I

    .line 54
    .line 55
    and-int/lit8 v0, v0, 0x3f

    .line 56
    .line 57
    or-int/lit16 v0, v0, 0x80

    .line 58
    int-to-byte v0, v0

    .line 59
    .line 60
    aput-byte v0, v1, v3

    .line 61
    goto :goto_0

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0, v0, p1, p2, p3}, Li7/i;->R0(I[CII)I

    .line 65
    move-result p2

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_4
    iget-object v1, p0, Li7/i;->v:[B

    .line 69
    .line 70
    iget v2, p0, Li7/i;->w:I

    .line 71
    .line 72
    add-int/lit8 v3, v2, 0x1

    .line 73
    .line 74
    iput v3, p0, Li7/i;->w:I

    .line 75
    int-to-byte v0, v0

    .line 76
    .line 77
    aput-byte v0, v1, v2

    .line 78
    .line 79
    add-int/lit8 p2, p2, 0x1

    .line 80
    .line 81
    if-lt p2, p3, :cond_2

    .line 82
    :cond_5
    return-void
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

.method public final r1([CII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/i;->w:I

    .line 3
    .line 4
    sub-int v1, p3, p2

    .line 5
    .line 6
    mul-int/lit8 v1, v1, 0x6

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Li7/i;->x:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 17
    .line 18
    iget-object v1, p0, Li7/i;->v:[B

    .line 19
    .line 20
    iget-object v2, p0, Li7/c;->m:[I

    .line 21
    .line 22
    iget v3, p0, Li7/c;->n:I

    .line 23
    .line 24
    :goto_0
    if-ge p2, p3, :cond_6

    .line 25
    .line 26
    add-int/lit8 v4, p2, 0x1

    .line 27
    .line 28
    aget-char p2, p1, p2

    .line 29
    .line 30
    const/16 v5, 0x7f

    .line 31
    .line 32
    if-gt p2, v5, :cond_3

    .line 33
    .line 34
    aget v5, v2, p2

    .line 35
    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    add-int/lit8 v5, v0, 0x1

    .line 39
    int-to-byte p2, p2

    .line 40
    .line 41
    aput-byte p2, v1, v0

    .line 42
    move p2, v4

    .line 43
    move v0, v5

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    if-lez v5, :cond_2

    .line 47
    .line 48
    add-int/lit8 p2, v0, 0x1

    .line 49
    .line 50
    const/16 v6, 0x5c

    .line 51
    .line 52
    aput-byte v6, v1, v0

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x2

    .line 55
    int-to-byte v5, v5

    .line 56
    .line 57
    aput-byte v5, v1, p2

    .line 58
    :goto_1
    move p2, v4

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 63
    move-result v0

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_3
    if-le p2, v3, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2, v0}, Li7/i;->c1(II)I

    .line 70
    move-result v0

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_4
    const/16 v5, 0x7ff

    .line 74
    .line 75
    if-gt p2, v5, :cond_5

    .line 76
    .line 77
    add-int/lit8 v5, v0, 0x1

    .line 78
    .line 79
    shr-int/lit8 v6, p2, 0x6

    .line 80
    .line 81
    or-int/lit16 v6, v6, 0xc0

    .line 82
    int-to-byte v6, v6

    .line 83
    .line 84
    aput-byte v6, v1, v0

    .line 85
    .line 86
    add-int/lit8 v0, v0, 0x2

    .line 87
    .line 88
    and-int/lit8 p2, p2, 0x3f

    .line 89
    .line 90
    or-int/lit16 p2, p2, 0x80

    .line 91
    int-to-byte p2, p2

    .line 92
    .line 93
    aput-byte p2, v1, v5

    .line 94
    goto :goto_1

    .line 95
    .line 96
    .line 97
    :cond_5
    invoke-virtual {p0, p2, v0}, Li7/i;->Q0(II)I

    .line 98
    move-result p2

    .line 99
    move v0, p2

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_6
    iput v0, p0, Li7/i;->w:I

    .line 103
    return-void
    .line 104
.end method

.method public s0(Lcom/fasterxml/jackson/core/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "write a raw (unencoded) value"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Li7/i;->v:[B

    .line 9
    .line 10
    iget v1, p0, Li7/i;->w:I

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0, v1}, Lcom/fasterxml/jackson/core/i;->appendUnquotedUTF8([BI)I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asUnquotedUTF8()[B

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    iget p1, p0, Li7/i;->w:I

    .line 27
    add-int/2addr p1, v0

    .line 28
    .line 29
    iput p1, p0, Li7/i;->w:I

    .line 30
    return-void
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

.method public final s1(Ljava/lang/String;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    iget v0, p0, Li7/i;->y:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Li7/i;->w:I

    .line 9
    add-int/2addr v1, v0

    .line 10
    .line 11
    iget v2, p0, Li7/i;->x:I

    .line 12
    .line 13
    if-le v1, v2, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1, p2, v0}, Li7/i;->m1(Ljava/lang/String;II)V

    .line 20
    add-int/2addr p2, v0

    .line 21
    sub-int/2addr p3, v0

    .line 22
    .line 23
    if-gtz p3, :cond_0

    .line 24
    return-void
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

.method public final t1(Ljava/lang/String;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    iget v0, p0, Li7/i;->w:I

    .line 5
    .line 6
    iget v1, p0, Li7/i;->x:I

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Li7/i;->v:[B

    .line 14
    .line 15
    iget v1, p0, Li7/i;->w:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Li7/i;->w:I

    .line 20
    .line 21
    iget-byte v2, p0, Li7/i;->u:B

    .line 22
    .line 23
    aput-byte v2, v0, v1

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    :goto_0
    if-lez v0, :cond_3

    .line 31
    .line 32
    iget v2, p0, Li7/i;->y:I

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 36
    move-result v2

    .line 37
    .line 38
    iget v3, p0, Li7/i;->w:I

    .line 39
    add-int/2addr v3, v2

    .line 40
    .line 41
    iget v4, p0, Li7/i;->x:I

    .line 42
    .line 43
    if-le v3, v4, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0, p1, v1, v2}, Li7/i;->m1(Ljava/lang/String;II)V

    .line 50
    add-int/2addr v1, v2

    .line 51
    sub-int/2addr v0, v2

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_3
    if-eqz p2, :cond_5

    .line 55
    .line 56
    iget p1, p0, Li7/i;->w:I

    .line 57
    .line 58
    iget p2, p0, Li7/i;->x:I

    .line 59
    .line 60
    if-lt p1, p2, :cond_4

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 64
    .line 65
    :cond_4
    iget-object p1, p0, Li7/i;->v:[B

    .line 66
    .line 67
    iget p2, p0, Li7/i;->w:I

    .line 68
    .line 69
    add-int/lit8 v0, p2, 0x1

    .line 70
    .line 71
    iput v0, p0, Li7/i;->w:I

    .line 72
    .line 73
    iget-byte v0, p0, Li7/i;->u:B

    .line 74
    .line 75
    aput-byte v0, p1, p2

    .line 76
    :cond_5
    return-void
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
.end method

.method public final u0()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "start an array"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Li7/e;->m()Li7/e;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lf7/a;->i:Li7/e;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/core/h;->writeStartArray(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 25
    .line 26
    iget v1, p0, Li7/i;->x:I

    .line 27
    .line 28
    if-lt v0, v1, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Li7/i;->v:[B

    .line 34
    .line 35
    iget v1, p0, Li7/i;->w:I

    .line 36
    .line 37
    add-int/lit8 v2, v1, 0x1

    .line 38
    .line 39
    iput v2, p0, Li7/i;->w:I

    .line 40
    .line 41
    const/16 v2, 0x5b

    .line 42
    .line 43
    aput-byte v2, v0, v1

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
.end method

.method public final u1([CII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    iget v0, p0, Li7/i;->y:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Li7/i;->w:I

    .line 9
    add-int/2addr v1, v0

    .line 10
    .line 11
    iget v2, p0, Li7/i;->x:I

    .line 12
    .line 13
    if-le v1, v2, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1, p2, v0}, Li7/i;->n1([CII)V

    .line 20
    add-int/2addr p2, v0

    .line 21
    sub-int/2addr p3, v0

    .line 22
    .line 23
    if-gtz p3, :cond_0

    .line 24
    return-void
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

.method public final v1(Lcom/fasterxml/jackson/core/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/i;->v:[B

    .line 3
    .line 4
    iget v1, p0, Li7/i;->w:I

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Lcom/fasterxml/jackson/core/i;->appendQuotedUTF8([BI)I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/i;->asQuotedUTF8()[B

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Li7/i;->Y0([B)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget p1, p0, Li7/i;->w:I

    .line 21
    add-int/2addr p1, v0

    .line 22
    .line 23
    iput p1, p0, Li7/i;->w:I

    .line 24
    return-void
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

.method public final w0(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "start an array"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Li7/e;->n(Ljava/lang/Object;)Li7/e;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lf7/a;->i:Li7/e;

    .line 15
    .line 16
    iget-object p1, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/core/h;->writeStartArray(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget p1, p0, Li7/i;->w:I

    .line 25
    .line 26
    iget v0, p0, Li7/i;->x:I

    .line 27
    .line 28
    if-lt p1, v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Li7/i;->v:[B

    .line 34
    .line 35
    iget v0, p0, Li7/i;->w:I

    .line 36
    .line 37
    add-int/lit8 v1, v0, 0x1

    .line 38
    .line 39
    iput v1, p0, Li7/i;->w:I

    .line 40
    .line 41
    const/16 v1, 0x5b

    .line 42
    .line 43
    aput-byte v1, p1, v0

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
.end method

.method public w1(Ljava/lang/String;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/i;->z:[C

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-gt p3, v1, :cond_0

    .line 7
    .line 8
    add-int v1, p2, p3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2, v1, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v2, p3}, Li7/i;->r0([CII)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget v3, p0, Li7/i;->x:I

    .line 18
    .line 19
    shr-int/lit8 v4, v3, 0x2

    .line 20
    .line 21
    shr-int/lit8 v3, v3, 0x4

    .line 22
    add-int/2addr v4, v3

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 26
    move-result v1

    .line 27
    .line 28
    mul-int/lit8 v3, v1, 0x3

    .line 29
    .line 30
    :goto_0
    if-lez p3, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    .line 34
    move-result v4

    .line 35
    .line 36
    add-int v5, p2, v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2, v5, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 40
    .line 41
    iget v5, p0, Li7/i;->w:I

    .line 42
    add-int/2addr v5, v3

    .line 43
    .line 44
    iget v6, p0, Li7/i;->x:I

    .line 45
    .line 46
    if-le v5, v6, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 50
    :cond_1
    const/4 v5, 0x1

    .line 51
    .line 52
    if-le v4, v5, :cond_2

    .line 53
    .line 54
    add-int/lit8 v5, v4, -0x1

    .line 55
    .line 56
    aget-char v5, v0, v5

    .line 57
    .line 58
    .line 59
    const v6, 0xd800

    .line 60
    .line 61
    if-lt v5, v6, :cond_2

    .line 62
    .line 63
    .line 64
    const v6, 0xdbff

    .line 65
    .line 66
    if-gt v5, v6, :cond_2

    .line 67
    .line 68
    add-int/lit8 v4, v4, -0x1

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0, v0, v2, v4}, Li7/i;->k1([CII)V

    .line 72
    add-int/2addr p2, v4

    .line 73
    sub-int/2addr p3, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return-void
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

.method public x0(Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo p2, "start an array"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object p2, p0, Lf7/a;->i:Li7/e;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p1}, Li7/e;->n(Ljava/lang/Object;)Li7/e;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lf7/a;->i:Li7/e;

    .line 15
    .line 16
    iget-object p1, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/core/h;->writeStartArray(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget p1, p0, Li7/i;->w:I

    .line 25
    .line 26
    iget p2, p0, Li7/i;->x:I

    .line 27
    .line 28
    if-lt p1, p2, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Li7/i;->v:[B

    .line 34
    .line 35
    iget p2, p0, Li7/i;->w:I

    .line 36
    .line 37
    add-int/lit8 v0, p2, 0x1

    .line 38
    .line 39
    iput v0, p0, Li7/i;->w:I

    .line 40
    .line 41
    const/16 v0, 0x5b

    .line 42
    .line 43
    aput-byte v0, p1, p2

    .line 44
    return-void
    .line 45
.end method

.method public final y0()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "start an object"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Li7/e;->o()Li7/e;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lf7/a;->i:Li7/e;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/core/h;->writeStartObject(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget v0, p0, Li7/i;->w:I

    .line 25
    .line 26
    iget v1, p0, Li7/i;->x:I

    .line 27
    .line 28
    if-lt v0, v1, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Li7/i;->v:[B

    .line 34
    .line 35
    iget v1, p0, Li7/i;->w:I

    .line 36
    .line 37
    add-int/lit8 v2, v1, 0x1

    .line 38
    .line 39
    iput v2, p0, Li7/i;->w:I

    .line 40
    .line 41
    const/16 v2, 0x7b

    .line 42
    .line 43
    aput-byte v2, v0, v1

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
.end method

.method public z0(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "start an object"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li7/i;->L0(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lf7/a;->i:Li7/e;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Li7/e;->p(Ljava/lang/Object;)Li7/e;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lf7/a;->i:Li7/e;

    .line 15
    .line 16
    iget-object p1, p0, Lcom/fasterxml/jackson/core/JsonGenerator;->b:Lcom/fasterxml/jackson/core/h;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/core/h;->writeStartObject(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget p1, p0, Li7/i;->w:I

    .line 25
    .line 26
    iget v0, p0, Li7/i;->x:I

    .line 27
    .line 28
    if-lt p1, v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Li7/i;->O0()V

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Li7/i;->v:[B

    .line 34
    .line 35
    iget v0, p0, Li7/i;->w:I

    .line 36
    .line 37
    add-int/lit8 v1, v0, 0x1

    .line 38
    .line 39
    iput v1, p0, Li7/i;->w:I

    .line 40
    .line 41
    const/16 v1, 0x7b

    .line 42
    .line 43
    aput-byte v1, p1, v0

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
.end method
