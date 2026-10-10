.class public Lpw/b;
.super Ljava/lang/Object;
.source "DepthRegionRender.java"


# instance fields
.field public a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Path;

.field public d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 6
    .line 7
    new-instance p1, Landroid/graphics/Path;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Paint;

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 19
    .line 20
    iput-object p1, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 21
    .line 22
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    .line 27
    iget-object p1, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 28
    .line 29
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 33
    .line 34
    iget-object p1, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 35
    .line 36
    const/high16 v1, 0x3f800000    # 1.0f

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 40
    move-result v1

    .line 41
    int-to-float v1, v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    new-instance p1, Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 50
    .line 51
    iput-object p1, p0, Lpw/b;->b:Landroid/graphics/Paint;

    .line 52
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
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/depth/DepthEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    iget-object v0, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget-object v1, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 11
    .line 12
    iget v1, v1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->r:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    iget-object v0, p0, Lpw/b;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget-object v1, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 20
    .line 21
    iget v1, v1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->s:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 30
    const/4 v0, 0x0

    .line 31
    move v1, v0

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 35
    move-result v2

    .line 36
    .line 37
    if-ge v1, v2, :cond_1

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    iget-object v2, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 42
    .line 43
    .line 44
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 51
    move-result v3

    .line 52
    .line 53
    .line 54
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    check-cast v4, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 61
    move-result v4

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_0
    iget-object v2, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 68
    .line 69
    .line 70
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 77
    move-result v3

    .line 78
    .line 79
    .line 80
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    check-cast v4, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 87
    move-result v4

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 91
    .line 92
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 93
    goto :goto_0

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 97
    move-result v1

    .line 98
    .line 99
    if-nez v1, :cond_2

    .line 100
    .line 101
    .line 102
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 103
    move-result v1

    .line 104
    .line 105
    add-int/lit8 v1, v1, -0x1

    .line 106
    .line 107
    .line 108
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    check-cast v1, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 115
    move-result v1

    .line 116
    float-to-double v1, v1

    .line 117
    .line 118
    iget-object v3, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 119
    .line 120
    iget v4, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 121
    float-to-double v4, v4

    .line 122
    .line 123
    iget-wide v6, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 124
    add-double/2addr v4, v6

    .line 125
    .line 126
    cmpg-double v1, v1, v4

    .line 127
    .line 128
    if-gez v1, :cond_2

    .line 129
    .line 130
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 131
    .line 132
    .line 133
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 134
    move-result v2

    .line 135
    .line 136
    add-int/lit8 v2, v2, -0x1

    .line 137
    .line 138
    .line 139
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 146
    move-result v2

    .line 147
    .line 148
    iget-object v3, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 149
    .line 150
    iget v4, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 151
    float-to-double v4, v4

    .line 152
    .line 153
    iget-wide v6, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 154
    add-double/2addr v4, v6

    .line 155
    double-to-float v3, v4

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 159
    .line 160
    :cond_2
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 161
    .line 162
    iget-object v2, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 163
    .line 164
    iget v3, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->d:F

    .line 165
    .line 166
    iget v4, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 167
    float-to-double v4, v4

    .line 168
    .line 169
    iget-wide v6, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 170
    add-double/2addr v4, v6

    .line 171
    double-to-float v2, v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 175
    .line 176
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 180
    .line 181
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 182
    .line 183
    iget-object v2, p0, Lpw/b;->b:Landroid/graphics/Paint;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 187
    .line 188
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 192
    .line 193
    .line 194
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 195
    move-result v1

    .line 196
    .line 197
    if-ge v0, v1, :cond_4

    .line 198
    .line 199
    if-nez v0, :cond_3

    .line 200
    .line 201
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 202
    .line 203
    .line 204
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 211
    move-result v2

    .line 212
    .line 213
    .line 214
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    move-result-object v3

    .line 216
    .line 217
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 221
    move-result v3

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 225
    goto :goto_3

    .line 226
    .line 227
    :cond_3
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 228
    .line 229
    .line 230
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    move-result-object v2

    .line 232
    .line 233
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 237
    move-result v2

    .line 238
    .line 239
    .line 240
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    move-result-object v3

    .line 242
    .line 243
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 247
    move-result v3

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 251
    .line 252
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 253
    goto :goto_2

    .line 254
    .line 255
    :cond_4
    iget-object p2, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 256
    .line 257
    iget-object v0, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 261
    :cond_5
    return-void
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
.end method

.method public b(Landroid/graphics/Canvas;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/depth/DepthEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    iget-object v0, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget-object v1, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 11
    .line 12
    iget v1, v1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->t:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    iget-object v0, p0, Lpw/b;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget-object v1, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 20
    .line 21
    iget v1, v1, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->u:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 33
    move-result v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    :goto_0
    if-ltz v0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 41
    move-result v1

    .line 42
    .line 43
    add-int/lit8 v1, v1, -0x1

    .line 44
    .line 45
    if-ne v0, v1, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 57
    move-result v2

    .line 58
    .line 59
    .line 60
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 67
    move-result v3

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_0
    iget-object v1, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 74
    .line 75
    .line 76
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 83
    move-result v2

    .line 84
    .line 85
    .line 86
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 93
    move-result v3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 97
    .line 98
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 99
    goto :goto_0

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 103
    move-result v0

    .line 104
    const/4 v1, 0x0

    .line 105
    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    .line 109
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    check-cast v0, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 116
    move-result v0

    .line 117
    .line 118
    iget-object v2, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 119
    .line 120
    iget v3, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 121
    float-to-double v3, v3

    .line 122
    .line 123
    iget-wide v5, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 124
    add-double/2addr v3, v5

    .line 125
    double-to-float v2, v3

    .line 126
    .line 127
    cmpg-float v0, v0, v2

    .line 128
    .line 129
    if-gez v0, :cond_2

    .line 130
    .line 131
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 132
    .line 133
    .line 134
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 141
    move-result v2

    .line 142
    .line 143
    iget-object v3, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 144
    .line 145
    iget v4, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 146
    float-to-double v4, v4

    .line 147
    .line 148
    iget-wide v6, v3, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 149
    add-double/2addr v4, v6

    .line 150
    double-to-float v3, v4

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 154
    .line 155
    :cond_2
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 156
    .line 157
    iget-object v2, p0, Lpw/b;->d:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 158
    .line 159
    iget v3, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->f:F

    .line 160
    .line 161
    iget v4, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->e:F

    .line 162
    float-to-double v4, v4

    .line 163
    .line 164
    iget-wide v6, v2, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->i:D

    .line 165
    add-double/2addr v4, v6

    .line 166
    double-to-float v2, v4

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 170
    .line 171
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 175
    .line 176
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 177
    .line 178
    iget-object v2, p0, Lpw/b;->b:Landroid/graphics/Paint;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 182
    .line 183
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 187
    .line 188
    .line 189
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 190
    move-result v0

    .line 191
    .line 192
    if-ge v1, v0, :cond_4

    .line 193
    .line 194
    if-nez v1, :cond_3

    .line 195
    .line 196
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 197
    .line 198
    .line 199
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    move-result-object v2

    .line 201
    .line 202
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 206
    move-result v2

    .line 207
    .line 208
    .line 209
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    move-result-object v3

    .line 211
    .line 212
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 216
    move-result v3

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 220
    goto :goto_3

    .line 221
    .line 222
    :cond_3
    iget-object v0, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 223
    .line 224
    .line 225
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    move-result-object v2

    .line 227
    .line 228
    check-cast v2, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getX()F

    .line 232
    move-result v2

    .line 233
    .line 234
    .line 235
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    move-result-object v3

    .line 237
    .line 238
    check-cast v3, Lcom/kubi/resources/widget/chart/depth/DepthEntity;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Lcom/kubi/resources/widget/chart/depth/DepthEntity;->getY()F

    .line 242
    move-result v3

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 246
    .line 247
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 248
    goto :goto_2

    .line 249
    .line 250
    :cond_4
    iget-object p2, p0, Lpw/b;->c:Landroid/graphics/Path;

    .line 251
    .line 252
    iget-object v0, p0, Lpw/b;->a:Landroid/graphics/Paint;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 256
    :cond_5
    return-void
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
.end method
