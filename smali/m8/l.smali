.class public Lm8/l;
.super Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;
.source "WebPDecoder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder<",
        "Ln8/a;",
        "Ln8/b;",
        ">;"
    }
.end annotation


# instance fields
.field public A:I

.field public B:Z

.field public C:I

.field public D:Ln8/b;

.field public final w:Landroid/graphics/Paint;

.field public x:Landroid/graphics/Paint;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(Lk8/b;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;-><init>(Lk8/b;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lm8/l;->w:Landroid/graphics/Paint;

    .line 11
    const/4 p2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    .line 16
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 22
    .line 23
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

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
.end method


# virtual methods
.method public bridge synthetic A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm8/l;->T(Lcom/github/penfeizhou/animation/io/Reader;)Ln8/a;

    .line 4
    move-result-object p1

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public bridge synthetic C()Lcom/github/penfeizhou/animation/io/e;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lm8/l;->U()Ln8/b;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public bridge synthetic I(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    check-cast p1, Ln8/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lm8/l;->V(Ln8/a;)Landroid/graphics/Rect;

    .line 6
    move-result-object p1

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public K()V
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public M(Lcom/github/penfeizhou/animation/decode/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/penfeizhou/animation/decode/a<",
            "Ln8/a;",
            "Ln8/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-lez v0, :cond_8

    .line 17
    .line 18
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-gtz v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 32
    move-result v0

    .line 33
    .line 34
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 35
    div-int/2addr v0, v1

    .line 36
    .line 37
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 41
    move-result v1

    .line 42
    .line 43
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 44
    div-int/2addr v1, v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->H(II)Landroid/graphics/Bitmap;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_2
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->n:Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    check-cast v1, Landroid/graphics/Canvas;

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    new-instance v1, Landroid/graphics/Canvas;

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 68
    .line 69
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->n:Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    :cond_3
    move-object v3, v1

    .line 74
    .line 75
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 84
    .line 85
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->e:I

    .line 86
    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    iget-boolean v1, p0, Lm8/l;->B:Z

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    const/4 v1, 0x0

    .line 93
    .line 94
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_4
    iget v1, p0, Lm8/l;->C:I

    .line 101
    .line 102
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :cond_5
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->d:Ljava/util/List;

    .line 109
    .line 110
    add-int/lit8 v1, v1, -0x1

    .line 111
    .line 112
    .line 113
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    check-cast v1, Lcom/github/penfeizhou/animation/decode/a;

    .line 117
    .line 118
    instance-of v2, v1, Lm8/d;

    .line 119
    .line 120
    if-eqz v2, :cond_6

    .line 121
    move-object v2, v1

    .line 122
    .line 123
    check-cast v2, Lm8/d;

    .line 124
    .line 125
    iget-boolean v2, v2, Lm8/d;->d:Z

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    iget v2, v1, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 130
    int-to-float v4, v2

    .line 131
    .line 132
    const/high16 v5, 0x40000000    # 2.0f

    .line 133
    mul-float/2addr v4, v5

    .line 134
    .line 135
    iget v6, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 136
    int-to-float v7, v6

    .line 137
    div-float/2addr v4, v7

    .line 138
    .line 139
    iget v7, v1, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 140
    int-to-float v8, v7

    .line 141
    mul-float/2addr v8, v5

    .line 142
    int-to-float v5, v6

    .line 143
    .line 144
    div-float v5, v8, v5

    .line 145
    .line 146
    mul-int/lit8 v2, v2, 0x2

    .line 147
    .line 148
    iget v8, v1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 149
    add-int/2addr v2, v8

    .line 150
    int-to-float v2, v2

    .line 151
    int-to-float v8, v6

    .line 152
    div-float/2addr v2, v8

    .line 153
    .line 154
    mul-int/lit8 v7, v7, 0x2

    .line 155
    .line 156
    iget v1, v1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 157
    add-int/2addr v7, v1

    .line 158
    int-to-float v1, v7

    .line 159
    int-to-float v6, v6

    .line 160
    .line 161
    div-float v7, v1, v6

    .line 162
    .line 163
    iget-object v8, p0, Lm8/l;->w:Landroid/graphics/Paint;

    .line 164
    move v6, v2

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 168
    .line 169
    :cond_6
    :goto_0
    iget v1, p1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 170
    .line 171
    if-lez v1, :cond_7

    .line 172
    .line 173
    iget v2, p1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 174
    .line 175
    if-lez v2, :cond_7

    .line 176
    .line 177
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 178
    div-int/2addr v1, v4

    .line 179
    div-int/2addr v2, v4

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v1, v2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->H(II)Landroid/graphics/Bitmap;

    .line 183
    move-result-object v1

    .line 184
    :goto_1
    move-object v7, v1

    .line 185
    goto :goto_2

    .line 186
    :cond_7
    const/4 v1, 0x0

    .line 187
    goto :goto_1

    .line 188
    .line 189
    :goto_2
    iget-object v5, p0, Lm8/l;->x:Landroid/graphics/Paint;

    .line 190
    .line 191
    iget v6, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Lm8/l;->U()Ln8/b;

    .line 195
    move-result-object v8

    .line 196
    move-object v4, v3

    .line 197
    move-object v3, p1

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v3 .. v8}, Lcom/github/penfeizhou/animation/decode/a;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Lcom/github/penfeizhou/animation/io/e;)Landroid/graphics/Bitmap;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, p1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, v7}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 208
    .line 209
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 213
    .line 214
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 221
    :cond_8
    :goto_3
    return-void
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

.method public T(Lcom/github/penfeizhou/animation/io/Reader;)Ln8/a;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ln8/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Ln8/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public U()Ln8/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lm8/l;->D:Ln8/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ln8/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ln8/b;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lm8/l;->D:Ln8/b;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lm8/l;->D:Ln8/b;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public V(Ln8/a;)Landroid/graphics/Rect;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/github/penfeizhou/animation/webp/decode/WebPParser;->b(Ln8/a;)Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    move v3, v2

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x1

    .line 17
    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    check-cast v4, Lm8/e;

    .line 25
    .line 26
    instance-of v6, v4, Lm8/k;

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    check-cast v4, Lm8/k;

    .line 31
    .line 32
    iget v3, v4, Lm8/k;->e:I

    .line 33
    .line 34
    iput v3, p0, Lm8/l;->z:I

    .line 35
    .line 36
    iget v3, v4, Lm8/k;->f:I

    .line 37
    .line 38
    iput v3, p0, Lm8/l;->A:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lm8/k;->d()Z

    .line 42
    move-result v3

    .line 43
    .line 44
    iput-boolean v3, p0, Lm8/l;->B:Z

    .line 45
    move v3, v5

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    instance-of v6, v4, Lm8/b;

    .line 49
    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    check-cast v4, Lm8/b;

    .line 53
    .line 54
    iget v2, v4, Lm8/b;->d:I

    .line 55
    .line 56
    iput v2, p0, Lm8/l;->C:I

    .line 57
    .line 58
    iget v2, v4, Lm8/b;->e:I

    .line 59
    .line 60
    iput v2, p0, Lm8/l;->y:I

    .line 61
    move v2, v5

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_2
    instance-of v5, v4, Lm8/c;

    .line 65
    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    iget-object v5, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->d:Ljava/util/List;

    .line 69
    .line 70
    new-instance v6, Lm8/d;

    .line 71
    .line 72
    check-cast v4, Lm8/c;

    .line 73
    .line 74
    .line 75
    invoke-direct {v6, p1, v4}, Lm8/d;-><init>(Ln8/a;Lm8/c;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_3
    if-nez v2, :cond_5

    .line 82
    .line 83
    if-nez v3, :cond_4

    .line 84
    .line 85
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 86
    .line 87
    .line 88
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 89
    .line 90
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->toInputStream()Ljava/io/InputStream;

    .line 94
    move-result-object v2

    .line 95
    const/4 v3, 0x0

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 99
    .line 100
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 101
    .line 102
    iput v2, p0, Lm8/l;->z:I

    .line 103
    .line 104
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 105
    .line 106
    iput v0, p0, Lm8/l;->A:I

    .line 107
    .line 108
    :cond_4
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->d:Ljava/util/List;

    .line 109
    .line 110
    new-instance v2, Lm8/h;

    .line 111
    .line 112
    iget v3, p0, Lm8/l;->z:I

    .line 113
    .line 114
    iget v4, p0, Lm8/l;->A:I

    .line 115
    .line 116
    .line 117
    invoke-direct {v2, p1, v3, v4}, Lm8/h;-><init>(Ln8/a;II)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    iput v5, p0, Lm8/l;->y:I

    .line 123
    .line 124
    :cond_5
    new-instance p1, Landroid/graphics/Paint;

    .line 125
    .line 126
    .line 127
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 128
    .line 129
    iput-object p1, p0, Lm8/l;->x:Landroid/graphics/Paint;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 133
    .line 134
    iget-boolean p1, p0, Lm8/l;->B:Z

    .line 135
    .line 136
    if-nez p1, :cond_6

    .line 137
    .line 138
    iget-object p1, p0, Lm8/l;->w:Landroid/graphics/Paint;

    .line 139
    .line 140
    iget v0, p0, Lm8/l;->C:I

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 144
    .line 145
    :cond_6
    new-instance p1, Landroid/graphics/Rect;

    .line 146
    .line 147
    iget v0, p0, Lm8/l;->z:I

    .line 148
    .line 149
    iget v2, p0, Lm8/l;->A:I

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 153
    return-object p1
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

.method public x()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lm8/l;->y:I

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method
