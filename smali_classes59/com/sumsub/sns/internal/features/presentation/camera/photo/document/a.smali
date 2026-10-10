.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/ml/autocapture/d;

.field public final b:Z

.field public c:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/ml/autocapture/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a:Lcom/sumsub/sns/internal/ml/autocapture/d;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/ml/autocapture/d;I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a:Lcom/sumsub/sns/internal/ml/autocapture/d;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->b:Z

    return-void
.end method


# virtual methods
.method public final a(FFLandroid/graphics/Rect;Lcom/sumsub/sns/internal/ml/docdetector/a;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    .line 10
    move-object/from16 v4, p4

    .line 11
    .line 12
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/ml/docdetector/a;->a()Landroid/graphics/Rect;

    .line 16
    move-result-object v6

    .line 17
    .line 18
    .line 19
    invoke-static {v6, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Landroid/graphics/Rect;FF)Landroid/graphics/Rect;

    .line 20
    move-result-object v6

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v6}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    .line 24
    move-result v6

    .line 25
    .line 26
    const-string v7, "DocCapture"

    .line 27
    const/4 v8, 0x0

    .line 28
    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    iget-boolean v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->c:Z

    .line 32
    .line 33
    if-nez v9, :cond_0

    .line 34
    .line 35
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 36
    .line 37
    iget-object v9, v9, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 38
    .line 39
    const-string v10, "Documents hits the frame"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v9, v7, v10, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    :cond_0
    if-nez v6, :cond_1

    .line 45
    .line 46
    iget-boolean v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->c:Z

    .line 47
    .line 48
    if-eqz v9, :cond_1

    .line 49
    .line 50
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 51
    .line 52
    iget-object v9, v9, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 53
    .line 54
    const-string v10, "Documents is NOT in the frame"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v9, v7, v10, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    :cond_1
    iput-boolean v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->c:Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/ml/docdetector/a;->a()Landroid/graphics/Rect;

    .line 63
    move-result-object v9

    .line 64
    .line 65
    .line 66
    invoke-static {v9, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Landroid/graphics/Rect;FF)Landroid/graphics/Rect;

    .line 67
    move-result-object v9

    .line 68
    .line 69
    .line 70
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 71
    move-result v10

    .line 72
    .line 73
    .line 74
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 75
    move-result v11

    .line 76
    mul-int/2addr v11, v10

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 80
    move-result v10

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 84
    move-result v12

    .line 85
    mul-int/2addr v12, v10

    .line 86
    int-to-float v10, v11

    .line 87
    int-to-float v11, v12

    .line 88
    div-float/2addr v10, v11

    .line 89
    .line 90
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 91
    .line 92
    iget-boolean v12, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->b:Z

    .line 93
    .line 94
    if-eqz v12, :cond_2

    .line 95
    .line 96
    iget v11, v11, Lcom/sumsub/sns/internal/ml/autocapture/d;->f:F

    .line 97
    goto :goto_0

    .line 98
    .line 99
    :cond_2
    iget v11, v11, Lcom/sumsub/sns/internal/ml/autocapture/d;->e:F

    .line 100
    .line 101
    :goto_0
    cmpl-float v10, v10, v11

    .line 102
    .line 103
    if-ltz v10, :cond_3

    .line 104
    const/4 v10, 0x1

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/4 v10, 0x0

    .line 107
    .line 108
    :goto_1
    new-instance v13, Landroid/graphics/RectF;

    .line 109
    .line 110
    .line 111
    invoke-direct {v13, v9}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 112
    .line 113
    new-instance v14, Landroid/graphics/RectF;

    .line 114
    .line 115
    .line 116
    invoke-direct {v14, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 120
    move-result v3

    .line 121
    .line 122
    .line 123
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    .line 124
    move-result v15

    .line 125
    .line 126
    cmpg-float v3, v3, v15

    .line 127
    .line 128
    const/high16 v15, 0x3f800000    # 1.0f

    .line 129
    .line 130
    if-gez v3, :cond_5

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 134
    move-result v3

    .line 135
    .line 136
    .line 137
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    .line 138
    move-result v16

    .line 139
    .line 140
    div-float v3, v3, v16

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v15}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 144
    move-result v3

    .line 145
    .line 146
    sub-float v3, v15, v3

    .line 147
    .line 148
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 149
    .line 150
    iget-boolean v12, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->b:Z

    .line 151
    .line 152
    if-eqz v12, :cond_4

    .line 153
    .line 154
    iget v11, v11, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 155
    goto :goto_2

    .line 156
    .line 157
    :cond_4
    iget v11, v11, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 158
    .line 159
    :goto_2
    cmpg-float v3, v3, v11

    .line 160
    .line 161
    if-gtz v3, :cond_5

    .line 162
    const/4 v3, 0x1

    .line 163
    goto :goto_3

    .line 164
    :cond_5
    const/4 v3, 0x0

    .line 165
    .line 166
    .line 167
    :goto_3
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 168
    move-result v11

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    .line 172
    move-result v12

    .line 173
    .line 174
    cmpg-float v11, v11, v12

    .line 175
    .line 176
    if-gez v11, :cond_6

    .line 177
    .line 178
    .line 179
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 180
    move-result v11

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    .line 184
    move-result v12

    .line 185
    .line 186
    cmpl-float v11, v11, v12

    .line 187
    .line 188
    if-lez v11, :cond_6

    .line 189
    .line 190
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->BIG:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 191
    goto :goto_7

    .line 192
    .line 193
    .line 194
    :cond_6
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 195
    move-result v11

    .line 196
    .line 197
    .line 198
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    .line 199
    move-result v12

    .line 200
    .line 201
    cmpg-float v11, v11, v12

    .line 202
    .line 203
    if-gez v11, :cond_8

    .line 204
    .line 205
    .line 206
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 207
    move-result v11

    .line 208
    .line 209
    .line 210
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    .line 211
    move-result v12

    .line 212
    div-float/2addr v11, v12

    .line 213
    .line 214
    sub-float v11, v15, v11

    .line 215
    .line 216
    .line 217
    invoke-static {v11, v15}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 218
    move-result v11

    .line 219
    .line 220
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 221
    .line 222
    iget-boolean v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->b:Z

    .line 223
    .line 224
    if-eqz v15, :cond_7

    .line 225
    .line 226
    iget v12, v12, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 227
    goto :goto_4

    .line 228
    .line 229
    :cond_7
    iget v12, v12, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 230
    .line 231
    :goto_4
    cmpg-float v11, v11, v12

    .line 232
    .line 233
    if-gtz v11, :cond_8

    .line 234
    const/4 v11, 0x1

    .line 235
    goto :goto_5

    .line 236
    :cond_8
    const/4 v11, 0x0

    .line 237
    .line 238
    .line 239
    :goto_5
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 240
    move-result v12

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 244
    move-result v9

    .line 245
    .line 246
    if-le v12, v9, :cond_9

    .line 247
    move v3, v11

    .line 248
    .line 249
    .line 250
    :cond_9
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 251
    move-result v9

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14}, Landroid/graphics/RectF;->height()F

    .line 255
    move-result v11

    .line 256
    .line 257
    cmpg-float v9, v9, v11

    .line 258
    .line 259
    if-gez v9, :cond_a

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 263
    move-result v9

    .line 264
    .line 265
    .line 266
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    .line 267
    move-result v11

    .line 268
    .line 269
    cmpl-float v9, v9, v11

    .line 270
    .line 271
    if-lez v9, :cond_a

    .line 272
    .line 273
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->BIG:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 274
    goto :goto_7

    .line 275
    .line 276
    :cond_a
    sget-object v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->OK:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 277
    .line 278
    if-eqz v10, :cond_b

    .line 279
    .line 280
    if-eqz v3, :cond_b

    .line 281
    move-object v3, v9

    .line 282
    goto :goto_6

    .line 283
    :cond_b
    move-object v3, v8

    .line 284
    .line 285
    :goto_6
    if-nez v3, :cond_c

    .line 286
    .line 287
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->SMALL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 288
    .line 289
    :cond_c
    :goto_7
    iget v9, v4, Lcom/sumsub/sns/internal/ml/docdetector/a;->a:I

    .line 290
    .line 291
    iget v10, v4, Lcom/sumsub/sns/internal/ml/docdetector/a;->c:I

    .line 292
    .line 293
    div-int/lit8 v11, v10, 0x2

    .line 294
    sub-int/2addr v9, v11

    .line 295
    .line 296
    iget v11, v4, Lcom/sumsub/sns/internal/ml/docdetector/a;->b:I

    .line 297
    .line 298
    iget v4, v4, Lcom/sumsub/sns/internal/ml/docdetector/a;->d:I

    .line 299
    .line 300
    div-int/lit8 v12, v4, 0x2

    .line 301
    sub-int/2addr v11, v12

    .line 302
    int-to-float v10, v10

    .line 303
    mul-float/2addr v10, v1

    .line 304
    float-to-int v10, v10

    .line 305
    int-to-float v4, v4

    .line 306
    mul-float/2addr v4, v2

    .line 307
    float-to-int v4, v4

    .line 308
    int-to-float v9, v9

    .line 309
    mul-float/2addr v9, v1

    .line 310
    float-to-int v1, v9

    .line 311
    int-to-float v9, v11

    .line 312
    mul-float/2addr v9, v2

    .line 313
    float-to-int v2, v9

    .line 314
    .line 315
    new-instance v9, Landroid/graphics/Rect;

    .line 316
    add-int/2addr v10, v1

    .line 317
    add-int/2addr v4, v2

    .line 318
    .line 319
    .line 320
    invoke-direct {v9, v1, v2, v10, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 324
    move-result v1

    .line 325
    int-to-float v1, v1

    .line 326
    .line 327
    .line 328
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 329
    move-result v2

    .line 330
    int-to-float v2, v2

    .line 331
    div-float/2addr v1, v2

    .line 332
    .line 333
    new-instance v2, Ljava/math/BigDecimal;

    .line 334
    float-to-double v9, v1

    .line 335
    .line 336
    .line 337
    invoke-direct {v2, v9, v10}, Ljava/math/BigDecimal;-><init>(D)V

    .line 338
    .line 339
    sget-object v1, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 340
    const/4 v4, 0x2

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 344
    .line 345
    new-instance v9, Ljava/math/BigDecimal;

    .line 346
    .line 347
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 348
    .line 349
    iget v10, v10, Lcom/sumsub/sns/internal/ml/autocapture/d;->i:F

    .line 350
    float-to-double v10, v10

    .line 351
    .line 352
    .line 353
    invoke-direct {v9, v10, v11}, Ljava/math/BigDecimal;-><init>(D)V

    .line 354
    .line 355
    new-instance v10, Ljava/math/BigDecimal;

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    const-wide v11, 0x3fc999999999999aL    # 0.2

    .line 361
    .line 362
    .line 363
    invoke-direct {v10, v11, v12}, Ljava/math/BigDecimal;-><init>(D)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v9, v10}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 367
    move-result-object v11

    .line 368
    .line 369
    .line 370
    invoke-virtual {v9, v11}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 371
    move-result-object v11

    .line 372
    .line 373
    .line 374
    invoke-virtual {v11, v4, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 375
    move-result-object v11

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v10}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 379
    move-result-object v10

    .line 380
    .line 381
    .line 382
    invoke-virtual {v9, v10}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 383
    move-result-object v9

    .line 384
    .line 385
    .line 386
    invoke-virtual {v9, v4, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 387
    move-result-object v1

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/lang/Object;)I

    .line 391
    move-result v4

    .line 392
    .line 393
    if-ltz v4, :cond_d

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/lang/Object;)I

    .line 397
    move-result v1

    .line 398
    .line 399
    if-gtz v1, :cond_d

    .line 400
    const/4 v11, 0x1

    .line 401
    goto :goto_8

    .line 402
    :cond_d
    const/4 v11, 0x0

    .line 403
    .line 404
    .line 405
    :goto_8
    invoke-direct {v5, v6, v3, v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;Z)V

    .line 406
    .line 407
    new-instance v1, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 411
    .line 412
    .line 413
    const-string/jumbo v2, "processor result -> "

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    move-result-object v1

    .line 424
    .line 425
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 426
    .line 427
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v7, v1, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 431
    return-object v5
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
.end method
