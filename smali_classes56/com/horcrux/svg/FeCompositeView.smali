.class Lcom/horcrux/svg/FeCompositeView;
.super Lcom/horcrux/svg/FilterPrimitiveView;
.source "FeCompositeView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/FilterPrimitiveView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    return-void
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
.end method


# virtual methods
.method public f(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroid/graphics/Bitmap;"
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
    move-object/from16 v2, p2

    .line 7
    .line 8
    iget-object v3, v0, Lcom/horcrux/svg/FeCompositeView;->d:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v3}, Lcom/horcrux/svg/FilterPrimitiveView;->h(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    iget-object v4, v0, Lcom/horcrux/svg/FeCompositeView;->e:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v4}, Lcom/horcrux/svg/FilterPrimitiveView;->h(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 18
    move-result-object v5

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    move-result v2

    .line 27
    .line 28
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 32
    move-result-object v6

    .line 33
    .line 34
    new-instance v1, Landroid/graphics/Canvas;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 38
    .line 39
    new-instance v2, Landroid/graphics/Paint;

    .line 40
    const/4 v4, 0x1

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 44
    const/4 v4, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v3, v4, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 48
    .line 49
    sget-object v3, Lcom/horcrux/svg/FeCompositeView$a;->a:[I

    .line 50
    .line 51
    iget-object v7, v0, Lcom/horcrux/svg/FeCompositeView;->j:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 55
    move-result v7

    .line 56
    .line 57
    aget v3, v3, v7

    .line 58
    .line 59
    .line 60
    packed-switch v3, :pswitch_data_0

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    .line 65
    :pswitch_0
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 66
    move-result v3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 70
    move-result v7

    .line 71
    mul-int/2addr v3, v7

    .line 72
    .line 73
    new-array v7, v3, [I

    .line 74
    .line 75
    new-array v14, v3, [I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 79
    move-result v9

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 83
    move-result v12

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 87
    move-result v13

    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 94
    move-object v13, v6

    .line 95
    move-object v15, v7

    .line 96
    .line 97
    .line 98
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 99
    move-result v8

    .line 100
    .line 101
    .line 102
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 103
    move-result v11

    .line 104
    .line 105
    .line 106
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    .line 107
    move-result v12

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v9, 0x0

    .line 110
    move-object v6, v14

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 114
    const/4 v8, 0x0

    .line 115
    .line 116
    :goto_0
    if-ge v8, v3, :cond_0

    .line 117
    .line 118
    aget v9, v15, v8

    .line 119
    .line 120
    aget v10, v6, v8

    .line 121
    .line 122
    shr-int/lit8 v11, v9, 0x10

    .line 123
    .line 124
    const/16 v12, 0xff

    .line 125
    and-int/2addr v11, v12

    .line 126
    .line 127
    shr-int/lit8 v14, v9, 0x8

    .line 128
    and-int/2addr v14, v12

    .line 129
    .line 130
    and-int/lit16 v4, v9, 0xff

    .line 131
    .line 132
    ushr-int/lit8 v9, v9, 0x18

    .line 133
    .line 134
    shr-int/lit8 v7, v10, 0x10

    .line 135
    and-int/2addr v7, v12

    .line 136
    .line 137
    move/from16 v16, v3

    .line 138
    .line 139
    shr-int/lit8 v3, v10, 0x8

    .line 140
    and-int/2addr v3, v12

    .line 141
    .line 142
    and-int/lit16 v12, v10, 0xff

    .line 143
    .line 144
    ushr-int/lit8 v10, v10, 0x18

    .line 145
    .line 146
    move-object/from16 v17, v6

    .line 147
    .line 148
    iget v6, v0, Lcom/horcrux/svg/FeCompositeView;->f:F

    .line 149
    int-to-float v11, v11

    .line 150
    .line 151
    mul-float v18, v6, v11

    .line 152
    int-to-float v7, v7

    .line 153
    .line 154
    mul-float v18, v18, v7

    .line 155
    .line 156
    move/from16 v19, v6

    .line 157
    .line 158
    iget v6, v0, Lcom/horcrux/svg/FeCompositeView;->g:F

    .line 159
    mul-float/2addr v11, v6

    .line 160
    .line 161
    add-float v18, v18, v11

    .line 162
    .line 163
    iget v11, v0, Lcom/horcrux/svg/FeCompositeView;->h:F

    .line 164
    mul-float/2addr v7, v11

    .line 165
    .line 166
    add-float v18, v18, v7

    .line 167
    .line 168
    iget v7, v0, Lcom/horcrux/svg/FeCompositeView;->i:F

    .line 169
    .line 170
    move/from16 v20, v6

    .line 171
    .line 172
    add-float v6, v18, v7

    .line 173
    float-to-int v6, v6

    .line 174
    int-to-float v14, v14

    .line 175
    .line 176
    mul-float v18, v19, v14

    .line 177
    int-to-float v3, v3

    .line 178
    .line 179
    mul-float v18, v18, v3

    .line 180
    .line 181
    mul-float v14, v14, v20

    .line 182
    .line 183
    add-float v18, v18, v14

    .line 184
    mul-float/2addr v3, v11

    .line 185
    .line 186
    add-float v18, v18, v3

    .line 187
    .line 188
    add-float v3, v18, v7

    .line 189
    float-to-int v3, v3

    .line 190
    int-to-float v4, v4

    .line 191
    .line 192
    mul-float v14, v19, v4

    .line 193
    int-to-float v12, v12

    .line 194
    mul-float/2addr v14, v12

    .line 195
    .line 196
    mul-float v4, v4, v20

    .line 197
    add-float/2addr v14, v4

    .line 198
    mul-float/2addr v12, v11

    .line 199
    add-float/2addr v14, v12

    .line 200
    add-float/2addr v14, v7

    .line 201
    float-to-int v4, v14

    .line 202
    int-to-float v9, v9

    .line 203
    .line 204
    mul-float v12, v19, v9

    .line 205
    int-to-float v10, v10

    .line 206
    mul-float/2addr v12, v10

    .line 207
    .line 208
    mul-float v9, v9, v20

    .line 209
    add-float/2addr v12, v9

    .line 210
    mul-float/2addr v11, v10

    .line 211
    add-float/2addr v12, v11

    .line 212
    add-float/2addr v12, v7

    .line 213
    float-to-int v7, v12

    .line 214
    const/4 v9, 0x0

    .line 215
    .line 216
    .line 217
    invoke-static {v9, v6}, Ljava/lang/Math;->max(II)I

    .line 218
    move-result v6

    .line 219
    .line 220
    const/16 v10, 0xff

    .line 221
    .line 222
    .line 223
    invoke-static {v10, v6}, Ljava/lang/Math;->min(II)I

    .line 224
    move-result v6

    .line 225
    .line 226
    .line 227
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    .line 228
    move-result v3

    .line 229
    .line 230
    .line 231
    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    .line 232
    move-result v3

    .line 233
    .line 234
    .line 235
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 236
    move-result v4

    .line 237
    .line 238
    .line 239
    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    .line 240
    move-result v4

    .line 241
    .line 242
    .line 243
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 244
    move-result v7

    .line 245
    .line 246
    .line 247
    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    .line 248
    move-result v7

    .line 249
    .line 250
    shl-int/lit8 v7, v7, 0x18

    .line 251
    .line 252
    shl-int/lit8 v6, v6, 0x10

    .line 253
    or-int/2addr v6, v7

    .line 254
    .line 255
    shl-int/lit8 v3, v3, 0x8

    .line 256
    or-int/2addr v3, v6

    .line 257
    or-int/2addr v3, v4

    .line 258
    .line 259
    aput v3, v15, v8

    .line 260
    .line 261
    add-int/lit8 v8, v8, 0x1

    .line 262
    .line 263
    move/from16 v3, v16

    .line 264
    .line 265
    move-object/from16 v6, v17

    .line 266
    const/4 v4, 0x0

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    .line 271
    :cond_0
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 272
    move-result v9

    .line 273
    .line 274
    .line 275
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 276
    move-result v12

    .line 277
    move-object v6, v13

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 281
    move-result v13

    .line 282
    const/4 v8, 0x0

    .line 283
    const/4 v10, 0x0

    .line 284
    const/4 v11, 0x0

    .line 285
    move-object v7, v15

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 289
    goto :goto_1

    .line 290
    .line 291
    :pswitch_1
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 292
    .line 293
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    .line 294
    .line 295
    .line 296
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 300
    goto :goto_1

    .line 301
    .line 302
    :pswitch_2
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 303
    .line 304
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 305
    .line 306
    .line 307
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 311
    goto :goto_1

    .line 312
    .line 313
    :pswitch_3
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 314
    .line 315
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 316
    .line 317
    .line 318
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 322
    goto :goto_1

    .line 323
    .line 324
    :pswitch_4
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 325
    .line 326
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 327
    .line 328
    .line 329
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 333
    goto :goto_1

    .line 334
    .line 335
    :pswitch_5
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 336
    .line 337
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 338
    .line 339
    .line 340
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 344
    .line 345
    :goto_1
    iget-object v3, v0, Lcom/horcrux/svg/FeCompositeView;->j:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    .line 346
    .line 347
    sget-object v4, Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;->ARITHMETIC:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    .line 348
    .line 349
    if-eq v3, v4, :cond_1

    .line 350
    const/4 v3, 0x0

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v5, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 354
    :cond_1
    return-object v6

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/FeCompositeView;->d:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/FeCompositeView;->e:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public p(Ljava/lang/Float;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    move-result p1

    .line 5
    .line 6
    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->f:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public q(Ljava/lang/Float;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    move-result p1

    .line 5
    .line 6
    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->g:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public r(Ljava/lang/Float;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    move-result p1

    .line 5
    .line 6
    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->h:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public s(Ljava/lang/Float;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    move-result p1

    .line 5
    .line 6
    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->i:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public t(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;->getEnum(Ljava/lang/String;)Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/FeCompositeView;->j:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
