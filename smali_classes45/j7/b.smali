.class public abstract Lj7/b;
.super Lf7/b;
.source "NonBlockingJsonParserBase.java"


# static fields
.field public static final i0:[Ljava/lang/String;

.field public static final j0:[D


# instance fields
.field public final S:Lk7/a;

.field public T:[I

.field public U:I

.field public V:I

.field public W:I

.field public X:I

.field public Y:I

.field public Z:I

.field public a0:I

.field public b0:I

.field public c0:I

.field public d0:I

.field public e0:Z

.field public f0:I

.field public g0:I

.field public h0:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "+Infinity"

    .line 3
    .line 4
    const-string v1, "-Infinity"

    .line 5
    .line 6
    const-string v2, "NaN"

    .line 7
    .line 8
    const-string v3, "Infinity"

    .line 9
    .line 10
    .line 11
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sput-object v0, Lj7/b;->i0:[Ljava/lang/String;

    .line 15
    const/4 v0, 0x4

    .line 16
    .line 17
    new-array v0, v0, [D

    .line 18
    .line 19
    .line 20
    fill-array-data v0, :array_0

    .line 21
    .line 22
    sput-object v0, Lj7/b;->j0:[D

    .line 23
    return-void

    .line 24
    nop

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
    :array_0
    .array-data 8
        0x7ff8000000000000L    # Double.NaN
        0x7ff0000000000000L    # Double.POSITIVE_INFINITY
        0x7ff0000000000000L    # Double.POSITIVE_INFINITY
        -0x10000000000000L    # Double.NEGATIVE_INFINITY
    .end array-data
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

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;ILk7/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lf7/b;-><init>(Lcom/fasterxml/jackson/core/io/d;I)V

    .line 4
    .line 5
    const/16 p1, 0x8

    .line 6
    .line 7
    new-array p1, p1, [I

    .line 8
    .line 9
    iput-object p1, p0, Lj7/b;->T:[I

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    iput-boolean p1, p0, Lj7/b;->e0:Z

    .line 13
    .line 14
    iput p1, p0, Lj7/b;->g0:I

    .line 15
    const/4 p2, 0x1

    .line 16
    .line 17
    iput p2, p0, Lj7/b;->h0:I

    .line 18
    .line 19
    iput-object p3, p0, Lj7/b;->S:Lk7/a;

    .line 20
    const/4 p3, 0x0

    .line 21
    .line 22
    iput-object p3, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 23
    .line 24
    iput p1, p0, Lj7/b;->a0:I

    .line 25
    .line 26
    iput p2, p0, Lj7/b;->b0:I

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

.method public static final V1(II)I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    return p0

    .line 5
    .line 6
    :cond_0
    shl-int/lit8 p1, p1, 0x3

    .line 7
    const/4 v0, -0x1

    .line 8
    .line 9
    shl-int p1, v0, p1

    .line 10
    or-int/2addr p0, p1

    .line 11
    return p0
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
.end method


# virtual methods
.method public J()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lf7/b;->G:[B

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final L1([III)Ljava/lang/String;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    move/from16 v3, p3

    .line 9
    .line 10
    shl-int/lit8 v4, v2, 0x2

    .line 11
    const/4 v5, 0x4

    .line 12
    sub-int/2addr v4, v5

    .line 13
    add-int/2addr v4, v3

    .line 14
    const/4 v7, 0x3

    .line 15
    .line 16
    if-ge v3, v5, :cond_0

    .line 17
    .line 18
    add-int/lit8 v8, v2, -0x1

    .line 19
    .line 20
    aget v9, v1, v8

    .line 21
    .line 22
    rsub-int/lit8 v10, v3, 0x4

    .line 23
    shl-int/2addr v10, v7

    .line 24
    .line 25
    shl-int v10, v9, v10

    .line 26
    .line 27
    aput v10, v1, v8

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v9, 0x0

    .line 30
    .line 31
    :goto_0
    iget-object v8, v0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v8}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 35
    move-result-object v8

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    .line 39
    :goto_1
    if-ge v10, v4, :cond_e

    .line 40
    .line 41
    shr-int/lit8 v12, v10, 0x2

    .line 42
    .line 43
    aget v12, v1, v12

    .line 44
    .line 45
    and-int/lit8 v13, v10, 0x3

    .line 46
    .line 47
    rsub-int/lit8 v13, v13, 0x3

    .line 48
    shl-int/2addr v13, v7

    .line 49
    shr-int/2addr v12, v13

    .line 50
    .line 51
    and-int/lit16 v13, v12, 0xff

    .line 52
    .line 53
    add-int/lit8 v14, v10, 0x1

    .line 54
    .line 55
    const/16 v15, 0x7f

    .line 56
    .line 57
    if-le v13, v15, :cond_c

    .line 58
    .line 59
    and-int/lit16 v15, v12, 0xe0

    .line 60
    .line 61
    move/from16 v16, v7

    .line 62
    .line 63
    const/16 v7, 0xc0

    .line 64
    const/4 v5, 0x1

    .line 65
    .line 66
    if-ne v15, v7, :cond_1

    .line 67
    .line 68
    and-int/lit8 v7, v12, 0x1f

    .line 69
    move v12, v5

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_1
    and-int/lit16 v7, v12, 0xf0

    .line 73
    .line 74
    const/16 v15, 0xe0

    .line 75
    .line 76
    if-ne v7, v15, :cond_2

    .line 77
    .line 78
    and-int/lit8 v7, v12, 0xf

    .line 79
    const/4 v12, 0x2

    .line 80
    goto :goto_2

    .line 81
    .line 82
    :cond_2
    and-int/lit16 v7, v12, 0xf8

    .line 83
    .line 84
    const/16 v15, 0xf0

    .line 85
    .line 86
    if-ne v7, v15, :cond_3

    .line 87
    .line 88
    and-int/lit8 v7, v12, 0x7

    .line 89
    .line 90
    move/from16 v12, v16

    .line 91
    goto :goto_2

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v0, v13}, Lj7/b;->X1(I)V

    .line 95
    move v7, v5

    .line 96
    move v12, v7

    .line 97
    .line 98
    :goto_2
    add-int v13, v14, v12

    .line 99
    .line 100
    if-le v13, v4, :cond_4

    .line 101
    .line 102
    const-string v13, " in field name"

    .line 103
    .line 104
    sget-object v15, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v13, v15}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 108
    .line 109
    :cond_4
    shr-int/lit8 v13, v14, 0x2

    .line 110
    .line 111
    aget v13, v1, v13

    .line 112
    .line 113
    and-int/lit8 v14, v14, 0x3

    .line 114
    .line 115
    rsub-int/lit8 v14, v14, 0x3

    .line 116
    .line 117
    shl-int/lit8 v14, v14, 0x3

    .line 118
    shr-int/2addr v13, v14

    .line 119
    .line 120
    add-int/lit8 v14, v10, 0x2

    .line 121
    .line 122
    and-int/lit16 v15, v13, 0xc0

    .line 123
    .line 124
    const/16 v6, 0x80

    .line 125
    .line 126
    if-eq v15, v6, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v13}, Lj7/b;->Y1(I)V

    .line 130
    .line 131
    :cond_5
    shl-int/lit8 v7, v7, 0x6

    .line 132
    .line 133
    and-int/lit8 v13, v13, 0x3f

    .line 134
    or-int/2addr v7, v13

    .line 135
    .line 136
    if-le v12, v5, :cond_9

    .line 137
    .line 138
    shr-int/lit8 v5, v14, 0x2

    .line 139
    .line 140
    aget v5, v1, v5

    .line 141
    .line 142
    and-int/lit8 v13, v14, 0x3

    .line 143
    .line 144
    rsub-int/lit8 v13, v13, 0x3

    .line 145
    .line 146
    shl-int/lit8 v13, v13, 0x3

    .line 147
    shr-int/2addr v5, v13

    .line 148
    .line 149
    add-int/lit8 v14, v10, 0x3

    .line 150
    .line 151
    and-int/lit16 v13, v5, 0xc0

    .line 152
    .line 153
    if-eq v13, v6, :cond_6

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v5}, Lj7/b;->Y1(I)V

    .line 157
    .line 158
    :cond_6
    shl-int/lit8 v7, v7, 0x6

    .line 159
    .line 160
    and-int/lit8 v5, v5, 0x3f

    .line 161
    or-int/2addr v5, v7

    .line 162
    const/4 v7, 0x2

    .line 163
    .line 164
    if-le v12, v7, :cond_8

    .line 165
    .line 166
    shr-int/lit8 v7, v14, 0x2

    .line 167
    .line 168
    aget v7, v1, v7

    .line 169
    .line 170
    and-int/lit8 v13, v14, 0x3

    .line 171
    .line 172
    rsub-int/lit8 v13, v13, 0x3

    .line 173
    .line 174
    shl-int/lit8 v13, v13, 0x3

    .line 175
    shr-int/2addr v7, v13

    .line 176
    .line 177
    add-int/lit8 v14, v10, 0x4

    .line 178
    .line 179
    and-int/lit16 v10, v7, 0xc0

    .line 180
    .line 181
    if-eq v10, v6, :cond_7

    .line 182
    .line 183
    and-int/lit16 v6, v7, 0xff

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v6}, Lj7/b;->Y1(I)V

    .line 187
    .line 188
    :cond_7
    shl-int/lit8 v5, v5, 0x6

    .line 189
    .line 190
    and-int/lit8 v6, v7, 0x3f

    .line 191
    or-int/2addr v5, v6

    .line 192
    move v13, v5

    .line 193
    :goto_3
    const/4 v7, 0x2

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    move v13, v5

    .line 196
    goto :goto_4

    .line 197
    :cond_9
    move v13, v7

    .line 198
    goto :goto_3

    .line 199
    .line 200
    :goto_4
    if-le v12, v7, :cond_b

    .line 201
    .line 202
    const/high16 v5, 0x10000

    .line 203
    sub-int/2addr v13, v5

    .line 204
    array-length v5, v8

    .line 205
    .line 206
    if-lt v11, v5, :cond_a

    .line 207
    .line 208
    iget-object v5, v0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 212
    move-result-object v8

    .line 213
    .line 214
    :cond_a
    add-int/lit8 v5, v11, 0x1

    .line 215
    .line 216
    shr-int/lit8 v6, v13, 0xa

    .line 217
    .line 218
    .line 219
    const v7, 0xd800

    .line 220
    add-int/2addr v6, v7

    .line 221
    int-to-char v6, v6

    .line 222
    .line 223
    aput-char v6, v8, v11

    .line 224
    .line 225
    and-int/lit16 v6, v13, 0x3ff

    .line 226
    .line 227
    .line 228
    const v7, 0xdc00

    .line 229
    .line 230
    or-int v13, v6, v7

    .line 231
    move v11, v5

    .line 232
    :cond_b
    :goto_5
    move v10, v14

    .line 233
    goto :goto_6

    .line 234
    .line 235
    :cond_c
    move/from16 v16, v7

    .line 236
    goto :goto_5

    .line 237
    :goto_6
    array-length v5, v8

    .line 238
    .line 239
    if-lt v11, v5, :cond_d

    .line 240
    .line 241
    iget-object v5, v0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 245
    move-result-object v5

    .line 246
    move-object v8, v5

    .line 247
    .line 248
    :cond_d
    add-int/lit8 v5, v11, 0x1

    .line 249
    int-to-char v6, v13

    .line 250
    .line 251
    aput-char v6, v8, v11

    .line 252
    move v11, v5

    .line 253
    .line 254
    move/from16 v7, v16

    .line 255
    const/4 v5, 0x4

    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :cond_e
    new-instance v4, Ljava/lang/String;

    .line 260
    const/4 v5, 0x0

    .line 261
    .line 262
    .line 263
    invoke-direct {v4, v8, v5, v11}, Ljava/lang/String;-><init>([CII)V

    .line 264
    const/4 v5, 0x4

    .line 265
    .line 266
    if-ge v3, v5, :cond_f

    .line 267
    .line 268
    add-int/lit8 v3, v2, -0x1

    .line 269
    .line 270
    aput v9, v1, v3

    .line 271
    .line 272
    :cond_f
    iget-object v3, v0, Lj7/b;->S:Lk7/a;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v4, v1, v2}, Lk7/a;->p(Ljava/lang/String;[II)Ljava/lang/String;

    .line 276
    move-result-object v1

    .line 277
    return-object v1
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

.method public final M1()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

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
    const/16 v0, 0x5d

    .line 11
    .line 12
    const/16 v1, 0x7d

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lf7/b;->t1(IC)V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Li7/d;->r()Li7/d;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    const/4 v0, 0x3

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    const/4 v0, 0x6

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 v0, 0x1

    .line 41
    .line 42
    :goto_0
    iput v0, p0, Lj7/b;->a0:I

    .line 43
    .line 44
    iput v0, p0, Lj7/b;->b0:I

    .line 45
    .line 46
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 47
    .line 48
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 49
    return-object v0
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

.method public final N1()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

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
    const/16 v0, 0x7d

    .line 11
    .line 12
    const/16 v1, 0x5d

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lf7/b;->t1(IC)V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Li7/d;->r()Li7/d;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    const/4 v0, 0x3

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    const/4 v0, 0x6

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 v0, 0x1

    .line 41
    .line 42
    :goto_0
    iput v0, p0, Lj7/b;->a0:I

    .line 43
    .line 44
    iput v0, p0, Lj7/b;->b0:I

    .line 45
    .line 46
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 47
    .line 48
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 49
    return-object v0
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

.method public final O1()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x7

    .line 2
    .line 3
    iput v0, p0, Lj7/b;->a0:I

    .line 4
    .line 5
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lf7/b;->G0()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lf7/b;->close()V

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 21
    return-object v0
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

.method public final P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    iput v0, p0, Lj7/b;->a0:I

    .line 4
    .line 5
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li7/d;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 11
    .line 12
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    return-object p1
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

.method public final Q1(II)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lj7/b;->V1(II)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget-object v0, p0, Lj7/b;->S:Lk7/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lk7/a;->w(I)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lj7/b;->T:[I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aput p1, v0, v1

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p1, p2}, Lj7/b;->L1([III)Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
.end method

.method public final R1(III)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2, p3}, Lj7/b;->V1(II)I

    .line 4
    move-result p2

    .line 5
    .line 6
    iget-object v0, p0, Lj7/b;->S:Lk7/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lk7/a;->x(II)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lj7/b;->T:[I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aput p1, v0, v1

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    aput p2, v0, p1

    .line 22
    const/4 p1, 0x2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, p1, p3}, Lj7/b;->L1([III)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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

.method public final S1(IIII)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p3, p4}, Lj7/b;->V1(II)I

    .line 4
    move-result p3

    .line 5
    .line 6
    iget-object v0, p0, Lj7/b;->S:Lk7/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lk7/a;->y(III)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lj7/b;->T:[I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aput p1, v0, v1

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    aput p2, v0, p1

    .line 22
    const/4 p1, 0x2

    .line 23
    .line 24
    .line 25
    invoke-static {p3, p4}, Lj7/b;->V1(II)I

    .line 26
    move-result p2

    .line 27
    .line 28
    aput p2, v0, p1

    .line 29
    const/4 p1, 0x3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, p1, p4}, Lj7/b;->L1([III)Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    return-object p1
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

.method public final T1(Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    .line 11
    if-eq v1, v2, :cond_3

    .line 12
    const/4 v0, 0x5

    .line 13
    .line 14
    if-eq v1, v0, :cond_2

    .line 15
    const/4 v0, 0x6

    .line 16
    .line 17
    if-eq v1, v0, :cond_1

    .line 18
    const/4 v0, 0x7

    .line 19
    .line 20
    if-eq v1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    if-eq v1, v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonToken;->asString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_1
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    .line 38
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Li7/d;->b()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_3
    return-object v0
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

.method public U()Lcom/fasterxml/jackson/core/util/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/core/util/f<",
            "Lcom/fasterxml/jackson/core/StreamReadCapability;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lf7/b;->R:Lcom/fasterxml/jackson/core/util/f;

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

.method public final U1(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lj7/b;->i0:[Ljava/lang/String;

    .line 3
    .line 4
    aget-object p1, v0, p1

    .line 5
    return-object p1
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

.method public W()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, v0}, Lj7/b;->T1(Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public W1(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    if-ge p1, v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lf7/c;->U0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lj7/b;->X1(I)V

    .line 11
    return-void
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

.method public X()[C
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    const/4 v1, 0x6

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    const/4 v1, 0x7

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->u()[C

    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    .line 37
    :cond_1
    iget-boolean v0, p0, Lf7/b;->E:Z

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    move-result v1

    .line 50
    .line 51
    iget-object v2, p0, Lf7/b;->D:[C

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/io/d;->f(I)[C

    .line 59
    move-result-object v2

    .line 60
    .line 61
    iput-object v2, p0, Lf7/b;->D:[C

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    array-length v2, v2

    .line 64
    .line 65
    if-ge v2, v1, :cond_3

    .line 66
    .line 67
    new-array v2, v1, [C

    .line 68
    .line 69
    iput-object v2, p0, Lf7/b;->D:[C

    .line 70
    .line 71
    :cond_3
    :goto_0
    iget-object v2, p0, Lf7/b;->D:[C

    .line 72
    const/4 v3, 0x0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v3, v1, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 76
    const/4 v0, 0x1

    .line 77
    .line 78
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 79
    .line 80
    :cond_4
    iget-object v0, p0, Lf7/b;->D:[C

    .line 81
    return-object v0

    .line 82
    :cond_5
    const/4 v0, 0x0

    .line 83
    return-object v0
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

.method public X1(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Invalid UTF-8 start byte 0x"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lf7/c;->K0(Ljava/lang/String;)V

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
    .line 78
.end method

.method public Y()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    const/4 v1, 0x6

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    const/4 v1, 0x7

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    .line 27
    move-result-object v0

    .line 28
    array-length v0, v0

    .line 29
    return v0

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 35
    move-result v0

    .line 36
    return v0

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 46
    move-result v0

    .line 47
    return v0

    .line 48
    :cond_2
    const/4 v0, 0x0

    .line 49
    return v0
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

.method public Y1(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Invalid UTF-8 middle byte 0x"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lf7/c;->K0(Ljava/lang/String;)V

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
    .line 78
.end method

.method public Z()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x6

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    const/4 v1, 0x7

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->v()I

    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 28
    return v0
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

.method public Z1(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    iput p2, p0, Lf7/b;->s:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lj7/b;->Y1(I)V

    .line 6
    return-void
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
.end method

.method public a0()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget-wide v2, p0, Lf7/b;->x:J

    .line 9
    .line 10
    iget v6, p0, Lf7/b;->y:I

    .line 11
    .line 12
    iget v7, p0, Lf7/b;->z:I

    .line 13
    .line 14
    const-wide/16 v4, -0x1

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 18
    return-object v0
.end method

.method public final a2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1, v1}, Li7/d;->m(II)Li7/d;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 10
    const/4 v0, 0x5

    .line 11
    .line 12
    iput v0, p0, Lj7/b;->a0:I

    .line 13
    const/4 v0, 0x6

    .line 14
    .line 15
    iput v0, p0, Lj7/b;->b0:I

    .line 16
    .line 17
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    .line 19
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 20
    return-object v0
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
.end method

.method public final b2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1, v1}, Li7/d;->n(II)Li7/d;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 10
    const/4 v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lj7/b;->a0:I

    .line 13
    const/4 v0, 0x3

    .line 14
    .line 15
    iput v0, p0, Lj7/b;->b0:I

    .line 16
    .line 17
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    .line 19
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 20
    return-object v0
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
.end method

.method public final c2()V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->v:I

    .line 3
    .line 4
    iget v1, p0, Lj7/b;->h0:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    move-result v0

    .line 9
    .line 10
    iput v0, p0, Lf7/b;->y:I

    .line 11
    .line 12
    iget v0, p0, Lf7/b;->s:I

    .line 13
    .line 14
    iget v1, p0, Lf7/b;->w:I

    .line 15
    .line 16
    sub-int v1, v0, v1

    .line 17
    .line 18
    iput v1, p0, Lf7/b;->z:I

    .line 19
    .line 20
    iget-wide v1, p0, Lf7/b;->u:J

    .line 21
    .line 22
    iget v3, p0, Lj7/b;->g0:I

    .line 23
    sub-int/2addr v0, v3

    .line 24
    int-to-long v3, v0

    .line 25
    add-long/2addr v1, v3

    .line 26
    .line 27
    iput-wide v1, p0, Lf7/b;->x:J

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
.end method

.method public final d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lj7/b;->b0:I

    .line 3
    .line 4
    iput v0, p0, Lj7/b;->a0:I

    .line 5
    .line 6
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    return-object p1
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

.method public final e2(ILjava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/core/util/i;->B(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 9
    move-result p2

    .line 10
    .line 11
    iput p2, p0, Lf7/b;->O:I

    .line 12
    const/4 p2, 0x1

    .line 13
    .line 14
    iput p2, p0, Lf7/b;->H:I

    .line 15
    .line 16
    iput p1, p0, Lf7/b;->I:I

    .line 17
    .line 18
    iget p1, p0, Lj7/b;->b0:I

    .line 19
    .line 20
    iput p1, p0, Lj7/b;->a0:I

    .line 21
    .line 22
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 23
    .line 24
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    return-object p1
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
.end method

.method public f1()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lj7/b;->g0:I

    .line 4
    .line 5
    iput v0, p0, Lf7/b;->t:I

    .line 6
    return-void
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

.method public final f2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lj7/b;->i0:[Ljava/lang/String;

    .line 3
    .line 4
    aget-object v0, v0, p1

    .line 5
    .line 6
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/util/i;->B(Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object v1, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->m0(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v1, "Non-standard token \'%s\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, Lf7/c;->L0(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    iput v0, p0, Lf7/b;->O:I

    .line 26
    .line 27
    const/16 v0, 0x8

    .line 28
    .line 29
    iput v0, p0, Lf7/b;->H:I

    .line 30
    .line 31
    sget-object v0, Lj7/b;->j0:[D

    .line 32
    .line 33
    aget-wide v1, v0, p1

    .line 34
    .line 35
    iput-wide v1, p0, Lf7/b;->K:D

    .line 36
    .line 37
    iget p1, p0, Lj7/b;->b0:I

    .line 38
    .line 39
    iput p1, p0, Lj7/b;->a0:I

    .line 40
    .line 41
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 42
    .line 43
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 44
    return-object p1
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

.method public g0()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf7/b;->w()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    .line 25
    .line 26
    invoke-super {p0, v0}, Lf7/c;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public h0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf7/b;->w()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-super {p0, p1}, Lf7/c;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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

.method public j0()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->w()Z

    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-boolean v0, p0, Lf7/b;->E:Z

    .line 20
    return v0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return v0
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

.method public p(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const-string v1, "Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1, v0}, Lf7/c;->L0(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lf7/b;->G:[B

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lf7/b;->l1()Lcom/fasterxml/jackson/core/util/c;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lj7/b;->W()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, p1}, Lf7/c;->E0(Ljava/lang/String;Lcom/fasterxml/jackson/core/util/c;Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 30
    move-result-object p1

    .line 31
    .line 32
    iput-object p1, p0, Lf7/b;->G:[B

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lf7/b;->G:[B

    .line 35
    return-object p1
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

.method public s1()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lf7/b;->s1()V

    .line 4
    .line 5
    iget-object v0, p0, Lj7/b;->S:Lk7/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lk7/a;->G()V

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

.method public u()Lcom/fasterxml/jackson/core/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
    .line 18
.end method

.method public v()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 9

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->w:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    .line 7
    add-int/lit8 v8, v0, 0x1

    .line 8
    .line 9
    iget v0, p0, Lf7/b;->v:I

    .line 10
    .line 11
    iget v1, p0, Lj7/b;->h0:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 15
    move-result v7

    .line 16
    .line 17
    new-instance v1, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    iget-wide v3, p0, Lf7/b;->u:J

    .line 24
    .line 25
    iget v0, p0, Lf7/b;->s:I

    .line 26
    .line 27
    iget v5, p0, Lj7/b;->g0:I

    .line 28
    sub-int/2addr v0, v5

    .line 29
    int-to-long v5, v0

    .line 30
    add-long/2addr v3, v5

    .line 31
    .line 32
    const-wide/16 v5, -0x1

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v1 .. v8}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 36
    return-object v1
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

.method public x0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lj7/b;->p(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 8
    array-length p1, p1

    .line 9
    return p1
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
.end method
