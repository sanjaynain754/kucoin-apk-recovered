.class Lcom/horcrux/svg/FeColorMatrixView;
.super Lcom/horcrux/svg/FilterPrimitiveView;
.source "FeColorMatrixView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public d:Ljava/lang/String;

.field public e:Lcom/horcrux/svg/FilterProperties$FeColorMatrixType;

.field public f:Lcom/facebook/react/bridge/ReadableArray;


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
    .locals 26
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
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x4

    .line 8
    .line 9
    const/16 v6, 0x14

    .line 10
    const/4 v7, 0x1

    .line 11
    const/4 v8, 0x0

    .line 12
    .line 13
    iget-object v9, v0, Lcom/horcrux/svg/FeColorMatrixView;->d:Ljava/lang/String;

    .line 14
    .line 15
    move-object/from16 v10, p1

    .line 16
    .line 17
    move-object/from16 v11, p2

    .line 18
    .line 19
    .line 20
    invoke-static {v10, v11, v9}, Lcom/horcrux/svg/FilterPrimitiveView;->h(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 21
    move-result-object v9

    .line 22
    .line 23
    new-instance v10, Landroid/graphics/ColorMatrix;

    .line 24
    .line 25
    .line 26
    invoke-direct {v10}, Landroid/graphics/ColorMatrix;-><init>()V

    .line 27
    .line 28
    sget-object v11, Lcom/horcrux/svg/FeColorMatrixView$a;->a:[I

    .line 29
    .line 30
    iget-object v12, v0, Lcom/horcrux/svg/FeColorMatrixView;->e:Lcom/horcrux/svg/FilterProperties$FeColorMatrixType;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result v12

    .line 35
    .line 36
    aget v11, v11, v12

    .line 37
    .line 38
    if-eq v11, v7, :cond_5

    .line 39
    .line 40
    if-eq v11, v3, :cond_3

    .line 41
    .line 42
    if-eq v11, v2, :cond_1

    .line 43
    .line 44
    if-eq v11, v5, :cond_0

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_0
    new-array v1, v6, [F

    .line 49
    .line 50
    .line 51
    fill-array-data v1, :array_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v10, v1}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_1
    iget-object v11, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 59
    .line 60
    .line 61
    invoke-interface {v11}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 62
    move-result v11

    .line 63
    .line 64
    if-eq v11, v7, :cond_2

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_2
    iget-object v11, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 69
    .line 70
    .line 71
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 72
    move-result-wide v11

    .line 73
    double-to-float v11, v11

    .line 74
    float-to-double v11, v11

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    const-wide v13, 0x400921fb54442d18L    # Math.PI

    .line 80
    mul-double/2addr v11, v13

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const-wide v13, 0x4066800000000000L    # 180.0

    .line 86
    div-double/2addr v11, v13

    .line 87
    .line 88
    .line 89
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 90
    move-result-wide v13

    .line 91
    double-to-float v13, v13

    .line 92
    .line 93
    .line 94
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 95
    move-result-wide v11

    .line 96
    double-to-float v11, v11

    .line 97
    .line 98
    .line 99
    const v12, 0x3f4978d5    # 0.787f

    .line 100
    .line 101
    mul-float v14, v13, v12

    .line 102
    .line 103
    .line 104
    const v15, 0x3e5a1cac    # 0.213f

    .line 105
    add-float/2addr v14, v15

    .line 106
    .line 107
    mul-float v16, v11, v15

    .line 108
    .line 109
    sub-float v14, v14, v16

    .line 110
    .line 111
    .line 112
    const v16, 0x3f370a3d    # 0.715f

    .line 113
    .line 114
    mul-float v17, v13, v16

    .line 115
    .line 116
    sub-float v17, v16, v17

    .line 117
    .line 118
    mul-float v18, v11, v16

    .line 119
    .line 120
    sub-float v19, v17, v18

    .line 121
    .line 122
    .line 123
    const v20, 0x3d9374bc    # 0.072f

    .line 124
    .line 125
    mul-float v21, v13, v20

    .line 126
    .line 127
    sub-float v21, v20, v21

    .line 128
    .line 129
    .line 130
    const v22, 0x3f6d9168    # 0.928f

    .line 131
    .line 132
    mul-float v23, v11, v22

    .line 133
    .line 134
    add-float v23, v21, v23

    .line 135
    .line 136
    mul-float v24, v13, v15

    .line 137
    .line 138
    sub-float v15, v15, v24

    .line 139
    .line 140
    .line 141
    const v24, 0x3e126e98    # 0.143f

    .line 142
    .line 143
    mul-float v24, v24, v11

    .line 144
    .line 145
    add-float v24, v15, v24

    .line 146
    .line 147
    .line 148
    const v25, 0x3e91eb85    # 0.285f

    .line 149
    .line 150
    mul-float v25, v25, v13

    .line 151
    .line 152
    add-float v25, v25, v16

    .line 153
    .line 154
    .line 155
    const v16, 0x3e0f5c29    # 0.14f

    .line 156
    .line 157
    mul-float v16, v16, v11

    .line 158
    .line 159
    add-float v25, v25, v16

    .line 160
    .line 161
    .line 162
    const v16, 0x3e90e560    # 0.283f

    .line 163
    .line 164
    mul-float v16, v16, v11

    .line 165
    .line 166
    sub-float v21, v21, v16

    .line 167
    mul-float/2addr v12, v11

    .line 168
    sub-float/2addr v15, v12

    .line 169
    .line 170
    add-float v17, v17, v18

    .line 171
    .line 172
    mul-float v13, v13, v22

    .line 173
    .line 174
    add-float v13, v13, v20

    .line 175
    .line 176
    mul-float v11, v11, v20

    .line 177
    add-float/2addr v13, v11

    .line 178
    .line 179
    new-array v6, v6, [F

    .line 180
    .line 181
    aput v14, v6, v4

    .line 182
    .line 183
    aput v19, v6, v7

    .line 184
    .line 185
    aput v23, v6, v3

    .line 186
    .line 187
    aput v8, v6, v2

    .line 188
    .line 189
    aput v8, v6, v5

    .line 190
    .line 191
    aput v24, v6, v1

    .line 192
    const/4 v1, 0x6

    .line 193
    .line 194
    aput v25, v6, v1

    .line 195
    const/4 v1, 0x7

    .line 196
    .line 197
    aput v21, v6, v1

    .line 198
    .line 199
    const/16 v1, 0x8

    .line 200
    .line 201
    aput v8, v6, v1

    .line 202
    .line 203
    const/16 v1, 0x9

    .line 204
    .line 205
    aput v8, v6, v1

    .line 206
    .line 207
    const/16 v1, 0xa

    .line 208
    .line 209
    aput v15, v6, v1

    .line 210
    .line 211
    const/16 v1, 0xb

    .line 212
    .line 213
    aput v17, v6, v1

    .line 214
    .line 215
    const/16 v1, 0xc

    .line 216
    .line 217
    aput v13, v6, v1

    .line 218
    .line 219
    const/16 v1, 0xd

    .line 220
    .line 221
    aput v8, v6, v1

    .line 222
    .line 223
    const/16 v1, 0xe

    .line 224
    .line 225
    aput v8, v6, v1

    .line 226
    .line 227
    const/16 v1, 0xf

    .line 228
    .line 229
    aput v8, v6, v1

    .line 230
    .line 231
    const/16 v1, 0x10

    .line 232
    .line 233
    aput v8, v6, v1

    .line 234
    .line 235
    const/16 v1, 0x11

    .line 236
    .line 237
    aput v8, v6, v1

    .line 238
    .line 239
    const/high16 v1, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/16 v2, 0x12

    .line 242
    .line 243
    aput v1, v6, v2

    .line 244
    .line 245
    const/16 v1, 0x13

    .line 246
    .line 247
    aput v8, v6, v1

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v6}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 251
    goto :goto_3

    .line 252
    .line 253
    :cond_3
    iget-object v1, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 254
    .line 255
    .line 256
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 257
    move-result v1

    .line 258
    .line 259
    if-eq v1, v7, :cond_4

    .line 260
    goto :goto_0

    .line 261
    .line 262
    :cond_4
    iget-object v1, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 263
    .line 264
    .line 265
    invoke-interface {v1, v4}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 266
    move-result-wide v1

    .line 267
    double-to-float v1, v1

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10, v1}, Landroid/graphics/ColorMatrix;->setSaturation(F)V

    .line 271
    goto :goto_3

    .line 272
    .line 273
    :cond_5
    iget-object v2, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 274
    .line 275
    .line 276
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 277
    move-result v2

    .line 278
    .line 279
    if-ge v2, v6, :cond_6

    .line 280
    :goto_0
    return-object v9

    .line 281
    .line 282
    :cond_6
    iget-object v2, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 283
    .line 284
    .line 285
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 286
    move-result v2

    .line 287
    .line 288
    new-array v2, v2, [F

    .line 289
    .line 290
    :goto_1
    iget-object v3, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 291
    .line 292
    .line 293
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 294
    move-result v3

    .line 295
    .line 296
    if-ge v4, v3, :cond_8

    .line 297
    .line 298
    iget-object v3, v0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

    .line 299
    .line 300
    .line 301
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 302
    move-result-wide v11

    .line 303
    double-to-float v3, v11

    .line 304
    .line 305
    rem-int/lit8 v6, v4, 0x5

    .line 306
    .line 307
    if-ne v6, v5, :cond_7

    .line 308
    .line 309
    const/16 v6, 0xff

    .line 310
    goto :goto_2

    .line 311
    :cond_7
    move v6, v7

    .line 312
    :goto_2
    int-to-float v6, v6

    .line 313
    mul-float/2addr v3, v6

    .line 314
    .line 315
    aput v3, v2, v4

    .line 316
    add-int/2addr v4, v7

    .line 317
    goto :goto_1

    .line 318
    .line 319
    .line 320
    :cond_8
    invoke-virtual {v10, v2}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 321
    .line 322
    .line 323
    :goto_3
    invoke-static {v10, v9}, Lcom/horcrux/svg/FilterUtils;->getBitmapWithColorMatrix(Landroid/graphics/ColorMatrix;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 324
    move-result-object v1

    .line 325
    return-object v1

    .line 326
    nop

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
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3e59999a    # 0.2125f
        0x3f372474    # 0.7154f
        0x3d93a92a    # 0.0721f
        0x0
        0x0
    .end array-data
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
    iput-object p1, p0, Lcom/horcrux/svg/FeColorMatrixView;->d:Ljava/lang/String;

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
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/FilterProperties$FeColorMatrixType;->getEnum(Ljava/lang/String;)Lcom/horcrux/svg/FilterProperties$FeColorMatrixType;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/FeColorMatrixView;->e:Lcom/horcrux/svg/FilterProperties$FeColorMatrixType;

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

.method public p(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/FeColorMatrixView;->f:Lcom/facebook/react/bridge/ReadableArray;

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
