.class public Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "CSSBackgroundDrawable.java"


# annotations
.annotation runtime Lcom/facebook/react/common/annotations/UnstableReactNativeAPI;
.end annotation


# static fields
.field private static final ALL_BITS_SET:I = -0x1

.field private static final ALL_BITS_UNSET:I = 0x0

.field private static final DEFAULT_BORDER_ALPHA:I = 0xff

.field private static final DEFAULT_BORDER_COLOR:I = -0x1000000

.field private static final DEFAULT_BORDER_RGB:I


# instance fields
.field private mAlpha:I

.field private mBackgroundColorRenderPath:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mBackgroundImageLayers:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;",
            ">;"
        }
    .end annotation
.end field

.field private mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mBorderRGB:Lcom/facebook/react/uimanager/Spacing;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

.field private mBorderStyle:Lcom/facebook/react/uimanager/style/BorderStyle;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mBorderWidth:Lcom/facebook/react/uimanager/Spacing;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mCenterDrawPath:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mColor:I

.field private mComputedBorderRadius:Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

.field private final mContext:Landroid/content/Context;

.field private final mGapBetweenPaths:F

.field private mInnerBottomLeftCorner:Landroid/graphics/PointF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mInnerBottomRightCorner:Landroid/graphics/PointF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mInnerClipPathForBorderRadius:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mInnerTopLeftCorner:Landroid/graphics/PointF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mInnerTopRightCorner:Landroid/graphics/PointF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mLayoutDirectionOverride:I

.field private mNeedUpdatePathForBorderRadius:Z

.field private mOuterClipPathForBorderRadius:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mPaint:Landroid/graphics/Paint;

.field private mPathForBorder:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mPathForBorderRadiusOutline:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mPathForSingleBorder:Landroid/graphics/Path;

.field private mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mTempRectForCenterDrawPath:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Path;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 14
    .line 15
    new-instance v1, Landroid/graphics/Paint;

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 22
    .line 23
    iput v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mColor:I

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundImageLayers:Ljava/util/List;

    .line 27
    .line 28
    const/16 v0, 0xff

    .line 29
    .line 30
    iput v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 31
    .line 32
    .line 33
    const v0, 0x3f4ccccd    # 0.8f

    .line 34
    .line 35
    iput v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mGapBetweenPaths:F

    .line 36
    .line 37
    new-instance v0, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0}, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;-><init>()V

    .line 41
    .line 42
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    .line 43
    .line 44
    new-instance v0, Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Lcom/facebook/react/uimanager/style/ComputedBorderRadius;-><init>()V

    .line 48
    .line 49
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mComputedBorderRadius:Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 50
    const/4 v0, -0x1

    .line 51
    .line 52
    iput v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mLayoutDirectionOverride:I

    .line 53
    .line 54
    iput-object p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 55
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
.end method

.method private static colorFromAlphaAndRGBComponents(FF)I
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, 0xffffff

    .line 4
    float-to-int p1, p1

    .line 5
    and-int/2addr p1, v0

    .line 6
    float-to-int p0, p0

    .line 7
    .line 8
    shl-int/lit8 p0, p0, 0x18

    .line 9
    .line 10
    const/high16 v0, -0x1000000

    .line 11
    and-int/2addr p0, v0

    .line 12
    or-int/2addr p0, p1

    .line 13
    return p0
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

.method private drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V
    .locals 1

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/Path;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    .line 21
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 25
    .line 26
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 30
    .line 31
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p5, p6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 35
    .line 36
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p7, p8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 40
    .line 41
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p9, p10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 45
    .line 46
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 50
    .line 51
    iget-object p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 52
    .line 53
    iget-object p3, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 57
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
.end method

.method private drawRectangularBackgroundWithBorders(Landroid/graphics/Canvas;)V
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 7
    .line 8
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    .line 13
    iget v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mColor:I

    .line 14
    .line 15
    iget v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->multiplyColorAlpha(II)I

    .line 19
    move-result v2

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 23
    move-result v3

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 40
    .line 41
    :cond_0
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundImageLayers:Ljava/util/List;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 47
    move-result v2

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBackgroundImageShader()Landroid/graphics/Shader;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 68
    .line 69
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 70
    const/4 v3, 0x0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 83
    move-result v4

    .line 84
    .line 85
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 89
    move-result v5

    .line 90
    .line 91
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 95
    move-result v6

    .line 96
    .line 97
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 98
    .line 99
    .line 100
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 101
    move-result v7

    .line 102
    .line 103
    if-gtz v4, :cond_2

    .line 104
    .line 105
    if-gtz v6, :cond_2

    .line 106
    .line 107
    if-gtz v5, :cond_2

    .line 108
    .line 109
    if-lez v7, :cond_15

    .line 110
    .line 111
    .line 112
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 113
    move-result-object v3

    .line 114
    const/4 v12, 0x0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v12}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 118
    move-result v8

    .line 119
    const/4 v13, 0x1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v13}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 123
    move-result v9

    .line 124
    const/4 v14, 0x2

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 128
    move-result v10

    .line 129
    const/4 v11, 0x3

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v11}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 133
    move-result v11

    .line 134
    .line 135
    const/16 v15, 0x9

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v15}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 139
    move-result v16

    .line 140
    .line 141
    move/from16 v17, v14

    .line 142
    .line 143
    const/16 v14, 0xb

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 147
    move-result v18

    .line 148
    .line 149
    const/16 v12, 0xa

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v12}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 153
    move-result v19

    .line 154
    .line 155
    .line 156
    invoke-direct {v0, v15}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 157
    move-result v15

    .line 158
    .line 159
    if-eqz v15, :cond_3

    .line 160
    .line 161
    move/from16 v9, v16

    .line 162
    move v11, v9

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-direct {v0, v12}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 166
    move-result v12

    .line 167
    .line 168
    if-eqz v12, :cond_4

    .line 169
    .line 170
    move/from16 v11, v19

    .line 171
    .line 172
    .line 173
    :cond_4
    invoke-direct {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 174
    move-result v12

    .line 175
    .line 176
    if-eqz v12, :cond_5

    .line 177
    .line 178
    move/from16 v9, v18

    .line 179
    .line 180
    .line 181
    :cond_5
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getLayoutDirection()I

    .line 182
    move-result v12

    .line 183
    .line 184
    if-ne v12, v13, :cond_6

    .line 185
    move v12, v13

    .line 186
    goto :goto_0

    .line 187
    :cond_6
    const/4 v12, 0x0

    .line 188
    :goto_0
    const/4 v14, 0x4

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 192
    move-result v15

    .line 193
    const/4 v13, 0x5

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v13}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 197
    move-result v18

    .line 198
    .line 199
    .line 200
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 201
    move-result-object v13

    .line 202
    .line 203
    iget-object v14, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v13, v14}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 207
    move-result v13

    .line 208
    .line 209
    if-eqz v13, :cond_b

    .line 210
    const/4 v13, 0x4

    .line 211
    .line 212
    .line 213
    invoke-direct {v0, v13}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 214
    move-result v13

    .line 215
    .line 216
    if-nez v13, :cond_7

    .line 217
    :goto_1
    const/4 v13, 0x5

    .line 218
    goto :goto_2

    .line 219
    :cond_7
    move v8, v15

    .line 220
    goto :goto_1

    .line 221
    .line 222
    .line 223
    :goto_2
    invoke-direct {v0, v13}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 224
    move-result v13

    .line 225
    .line 226
    if-nez v13, :cond_8

    .line 227
    goto :goto_3

    .line 228
    .line 229
    :cond_8
    move/from16 v10, v18

    .line 230
    .line 231
    :goto_3
    if-eqz v12, :cond_9

    .line 232
    move v13, v10

    .line 233
    goto :goto_4

    .line 234
    :cond_9
    move v13, v8

    .line 235
    .line 236
    :goto_4
    if-eqz v12, :cond_a

    .line 237
    move v10, v8

    .line 238
    .line 239
    :cond_a
    move/from16 v18, v4

    .line 240
    move v8, v13

    .line 241
    goto :goto_a

    .line 242
    .line 243
    :cond_b
    if-eqz v12, :cond_c

    .line 244
    .line 245
    move/from16 v13, v18

    .line 246
    goto :goto_5

    .line 247
    :cond_c
    move v13, v15

    .line 248
    .line 249
    :goto_5
    if-eqz v12, :cond_d

    .line 250
    :goto_6
    const/4 v14, 0x4

    .line 251
    goto :goto_7

    .line 252
    .line 253
    :cond_d
    move/from16 v15, v18

    .line 254
    goto :goto_6

    .line 255
    .line 256
    .line 257
    :goto_7
    invoke-direct {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 258
    move-result v14

    .line 259
    .line 260
    move/from16 v18, v4

    .line 261
    const/4 v4, 0x5

    .line 262
    .line 263
    .line 264
    invoke-direct {v0, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 265
    move-result v4

    .line 266
    .line 267
    if-eqz v12, :cond_e

    .line 268
    .line 269
    move/from16 v19, v4

    .line 270
    goto :goto_8

    .line 271
    .line 272
    :cond_e
    move/from16 v19, v14

    .line 273
    .line 274
    :goto_8
    if-eqz v12, :cond_f

    .line 275
    goto :goto_9

    .line 276
    :cond_f
    move v14, v4

    .line 277
    .line 278
    :goto_9
    if-eqz v19, :cond_10

    .line 279
    move v8, v13

    .line 280
    .line 281
    :cond_10
    if-eqz v14, :cond_11

    .line 282
    move v10, v15

    .line 283
    .line 284
    :cond_11
    :goto_a
    iget v12, v3, Landroid/graphics/Rect;->left:I

    .line 285
    .line 286
    iget v13, v3, Landroid/graphics/Rect;->top:I

    .line 287
    .line 288
    move/from16 v4, v18

    .line 289
    .line 290
    .line 291
    invoke-static/range {v4 .. v11}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->fastBorderCompatibleColorOrZero(IIIIIIII)I

    .line 292
    move-result v14

    .line 293
    move v15, v6

    .line 294
    .line 295
    move/from16 v19, v7

    .line 296
    .line 297
    move/from16 v21, v9

    .line 298
    .line 299
    move/from16 v22, v10

    .line 300
    .line 301
    move/from16 v20, v11

    .line 302
    move v11, v5

    .line 303
    .line 304
    if-eqz v14, :cond_16

    .line 305
    .line 306
    .line 307
    invoke-static {v14}, Landroid/graphics/Color;->alpha(I)I

    .line 308
    move-result v4

    .line 309
    .line 310
    if-eqz v4, :cond_15

    .line 311
    .line 312
    iget v4, v3, Landroid/graphics/Rect;->right:I

    .line 313
    .line 314
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 315
    .line 316
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 320
    .line 321
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 322
    .line 323
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 327
    .line 328
    if-lez v18, :cond_12

    .line 329
    .line 330
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 334
    .line 335
    iget v5, v2, Landroid/graphics/RectF;->left:F

    .line 336
    .line 337
    .line 338
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 339
    move-result v5

    .line 340
    .line 341
    .line 342
    invoke-direct {v0, v5}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePathEffect(I)V

    .line 343
    .line 344
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 345
    int-to-float v7, v5

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 349
    .line 350
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 351
    .line 352
    div-int/lit8 v5, v5, 0x2

    .line 353
    add-int/2addr v5, v12

    .line 354
    int-to-float v5, v5

    .line 355
    int-to-float v7, v13

    .line 356
    .line 357
    .line 358
    invoke-virtual {v6, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 359
    .line 360
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 361
    int-to-float v7, v3

    .line 362
    .line 363
    .line 364
    invoke-virtual {v6, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 365
    .line 366
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 367
    .line 368
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 372
    .line 373
    :cond_12
    if-lez v11, :cond_13

    .line 374
    .line 375
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 379
    .line 380
    iget v5, v2, Landroid/graphics/RectF;->top:F

    .line 381
    .line 382
    .line 383
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 384
    move-result v5

    .line 385
    .line 386
    .line 387
    invoke-direct {v0, v5}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePathEffect(I)V

    .line 388
    .line 389
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 390
    int-to-float v7, v5

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 394
    .line 395
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 396
    int-to-float v7, v12

    .line 397
    .line 398
    div-int/lit8 v5, v5, 0x2

    .line 399
    add-int/2addr v5, v13

    .line 400
    int-to-float v5, v5

    .line 401
    .line 402
    .line 403
    invoke-virtual {v6, v7, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 404
    .line 405
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 406
    int-to-float v7, v4

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 410
    .line 411
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 412
    .line 413
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 417
    .line 418
    :cond_13
    if-lez v15, :cond_14

    .line 419
    .line 420
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 424
    .line 425
    iget v5, v2, Landroid/graphics/RectF;->right:F

    .line 426
    .line 427
    .line 428
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 429
    move-result v5

    .line 430
    .line 431
    .line 432
    invoke-direct {v0, v5}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePathEffect(I)V

    .line 433
    .line 434
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 435
    int-to-float v7, v5

    .line 436
    .line 437
    .line 438
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 439
    .line 440
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 441
    .line 442
    div-int/lit8 v5, v5, 0x2

    .line 443
    .line 444
    sub-int v5, v4, v5

    .line 445
    int-to-float v5, v5

    .line 446
    int-to-float v7, v13

    .line 447
    .line 448
    .line 449
    invoke-virtual {v6, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 450
    .line 451
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 452
    int-to-float v7, v3

    .line 453
    .line 454
    .line 455
    invoke-virtual {v6, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 456
    .line 457
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 458
    .line 459
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 463
    .line 464
    :cond_14
    if-lez v19, :cond_15

    .line 465
    .line 466
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 470
    .line 471
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 472
    .line 473
    .line 474
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 475
    move-result v2

    .line 476
    .line 477
    .line 478
    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePathEffect(I)V

    .line 479
    .line 480
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 481
    int-to-float v6, v2

    .line 482
    .line 483
    .line 484
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 485
    .line 486
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 487
    int-to-float v6, v12

    .line 488
    .line 489
    div-int/lit8 v2, v2, 0x2

    .line 490
    sub-int/2addr v3, v2

    .line 491
    int-to-float v2, v3

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v6, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 495
    .line 496
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 497
    int-to-float v4, v4

    .line 498
    .line 499
    .line 500
    invoke-virtual {v3, v4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 501
    .line 502
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 503
    .line 504
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 508
    :cond_15
    return-void

    .line 509
    .line 510
    :cond_16
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 511
    const/4 v4, 0x0

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 518
    move-result v14

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 522
    move-result v17

    .line 523
    .line 524
    if-lez v18, :cond_17

    .line 525
    int-to-float v3, v12

    .line 526
    int-to-float v4, v13

    .line 527
    .line 528
    add-int v2, v12, v18

    .line 529
    int-to-float v5, v2

    .line 530
    .line 531
    add-int v2, v13, v11

    .line 532
    int-to-float v6, v2

    .line 533
    .line 534
    add-int v2, v13, v17

    .line 535
    .line 536
    sub-int v7, v2, v19

    .line 537
    int-to-float v7, v7

    .line 538
    int-to-float v10, v2

    .line 539
    move v2, v8

    .line 540
    move v8, v7

    .line 541
    move v7, v5

    .line 542
    move v9, v3

    .line 543
    .line 544
    .line 545
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 546
    .line 547
    :cond_17
    if-lez v11, :cond_18

    .line 548
    int-to-float v3, v12

    .line 549
    int-to-float v4, v13

    .line 550
    .line 551
    add-int v0, v12, v18

    .line 552
    int-to-float v5, v0

    .line 553
    .line 554
    add-int v0, v13, v11

    .line 555
    int-to-float v6, v0

    .line 556
    .line 557
    add-int v0, v12, v14

    .line 558
    .line 559
    sub-int v1, v0, v15

    .line 560
    int-to-float v7, v1

    .line 561
    int-to-float v9, v0

    .line 562
    move v8, v6

    .line 563
    move v10, v4

    .line 564
    .line 565
    move-object/from16 v0, p0

    .line 566
    .line 567
    move-object/from16 v1, p1

    .line 568
    .line 569
    move/from16 v2, v21

    .line 570
    .line 571
    .line 572
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 573
    .line 574
    :cond_18
    if-lez v15, :cond_19

    .line 575
    .line 576
    add-int v0, v12, v14

    .line 577
    int-to-float v3, v0

    .line 578
    int-to-float v4, v13

    .line 579
    .line 580
    add-int v1, v13, v17

    .line 581
    int-to-float v6, v1

    .line 582
    sub-int/2addr v0, v15

    .line 583
    int-to-float v7, v0

    .line 584
    .line 585
    sub-int v1, v1, v19

    .line 586
    int-to-float v8, v1

    .line 587
    .line 588
    add-int v5, v13, v11

    .line 589
    int-to-float v10, v5

    .line 590
    move v5, v3

    .line 591
    move v9, v7

    .line 592
    .line 593
    move-object/from16 v0, p0

    .line 594
    .line 595
    move-object/from16 v1, p1

    .line 596
    .line 597
    move/from16 v2, v22

    .line 598
    .line 599
    .line 600
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 601
    .line 602
    :cond_19
    if-lez v19, :cond_1a

    .line 603
    int-to-float v3, v12

    .line 604
    .line 605
    add-int v13, v13, v17

    .line 606
    int-to-float v4, v13

    .line 607
    add-int/2addr v14, v12

    .line 608
    int-to-float v5, v14

    .line 609
    sub-int/2addr v14, v15

    .line 610
    int-to-float v7, v14

    .line 611
    .line 612
    sub-int v13, v13, v19

    .line 613
    int-to-float v8, v13

    .line 614
    .line 615
    add-int v12, v12, v18

    .line 616
    int-to-float v9, v12

    .line 617
    move v6, v4

    .line 618
    move v10, v8

    .line 619
    .line 620
    move-object/from16 v0, p0

    .line 621
    .line 622
    move-object/from16 v1, p1

    .line 623
    .line 624
    move/from16 v2, v20

    .line 625
    .line 626
    .line 627
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 628
    goto :goto_b

    .line 629
    .line 630
    :cond_1a
    move-object/from16 v0, p0

    .line 631
    .line 632
    :goto_b
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 633
    const/4 v2, 0x1

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 637
    return-void
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
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
.end method

.method private drawRoundedBackgroundWithBorders(Landroid/graphics/Canvas;)V
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePath()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 11
    .line 12
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    check-cast v2, Landroid/graphics/Path;

    .line 19
    .line 20
    sget-object v3, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 24
    .line 25
    iget v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mColor:I

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 29
    move-result v3

    .line 30
    .line 31
    iget v4, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 32
    mul-int/2addr v3, v4

    .line 33
    .line 34
    const/16 v4, 0x8

    .line 35
    shr-int/2addr v3, v4

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 43
    move-result v3

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    .line 52
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 53
    .line 54
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 58
    .line 59
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundColorRenderPath:Landroid/graphics/Path;

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    check-cast v2, Landroid/graphics/Path;

    .line 66
    .line 67
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 71
    .line 72
    :cond_0
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundImageLayers:Ljava/util/List;

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 78
    move-result v2

    .line 79
    .line 80
    if-nez v2, :cond_1

    .line 81
    .line 82
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBackgroundImageShader()Landroid/graphics/Shader;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 90
    .line 91
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 92
    .line 93
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    .line 98
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundColorRenderPath:Landroid/graphics/Path;

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    check-cast v2, Landroid/graphics/Path;

    .line 105
    .line 106
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 112
    const/4 v3, 0x0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    .line 119
    move-result-object v11

    .line 120
    const/4 v2, 0x0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 124
    move-result v3

    .line 125
    const/4 v5, 0x1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v5}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 129
    move-result v6

    .line 130
    const/4 v7, 0x2

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v7}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 134
    move-result v7

    .line 135
    const/4 v8, 0x3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v8}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 139
    move-result v8

    .line 140
    .line 141
    const/16 v9, 0x9

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v9}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 145
    move-result v10

    .line 146
    .line 147
    const/16 v12, 0xb

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v12}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 151
    move-result v13

    .line 152
    .line 153
    const/16 v14, 0xa

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 157
    move-result v15

    .line 158
    .line 159
    .line 160
    invoke-direct {v0, v9}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 161
    move-result v9

    .line 162
    .line 163
    if-eqz v9, :cond_2

    .line 164
    move v6, v10

    .line 165
    move v8, v6

    .line 166
    .line 167
    .line 168
    :cond_2
    invoke-direct {v0, v14}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 169
    move-result v9

    .line 170
    .line 171
    if-eqz v9, :cond_3

    .line 172
    goto :goto_0

    .line 173
    :cond_3
    move v15, v8

    .line 174
    .line 175
    .line 176
    :goto_0
    invoke-direct {v0, v12}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 177
    move-result v8

    .line 178
    .line 179
    if-eqz v8, :cond_4

    .line 180
    goto :goto_1

    .line 181
    :cond_4
    move v13, v6

    .line 182
    .line 183
    :goto_1
    iget v6, v11, Landroid/graphics/RectF;->top:F

    .line 184
    const/4 v12, 0x0

    .line 185
    .line 186
    cmpl-float v6, v6, v12

    .line 187
    .line 188
    if-gtz v6, :cond_5

    .line 189
    .line 190
    iget v6, v11, Landroid/graphics/RectF;->bottom:F

    .line 191
    .line 192
    cmpl-float v6, v6, v12

    .line 193
    .line 194
    if-gtz v6, :cond_5

    .line 195
    .line 196
    iget v6, v11, Landroid/graphics/RectF;->left:F

    .line 197
    .line 198
    cmpl-float v6, v6, v12

    .line 199
    .line 200
    if-gtz v6, :cond_5

    .line 201
    .line 202
    iget v6, v11, Landroid/graphics/RectF;->right:F

    .line 203
    .line 204
    cmpl-float v6, v6, v12

    .line 205
    .line 206
    if-lez v6, :cond_16

    .line 207
    .line 208
    .line 209
    :cond_5
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getFullBorderWidth()F

    .line 210
    move-result v6

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 214
    move-result v4

    .line 215
    .line 216
    iget v8, v11, Landroid/graphics/RectF;->top:F

    .line 217
    .line 218
    cmpl-float v8, v8, v6

    .line 219
    .line 220
    if-nez v8, :cond_6

    .line 221
    .line 222
    iget v8, v11, Landroid/graphics/RectF;->bottom:F

    .line 223
    .line 224
    cmpl-float v8, v8, v6

    .line 225
    .line 226
    if-nez v8, :cond_6

    .line 227
    .line 228
    iget v8, v11, Landroid/graphics/RectF;->left:F

    .line 229
    .line 230
    cmpl-float v8, v8, v6

    .line 231
    .line 232
    if-nez v8, :cond_6

    .line 233
    .line 234
    iget v8, v11, Landroid/graphics/RectF;->right:F

    .line 235
    .line 236
    cmpl-float v8, v8, v6

    .line 237
    .line 238
    if-nez v8, :cond_6

    .line 239
    .line 240
    if-ne v3, v4, :cond_6

    .line 241
    .line 242
    if-ne v13, v4, :cond_6

    .line 243
    .line 244
    if-ne v7, v4, :cond_6

    .line 245
    .line 246
    if-ne v15, v4, :cond_6

    .line 247
    .line 248
    cmpl-float v2, v6, v12

    .line 249
    .line 250
    if-lez v2, :cond_16

    .line 251
    .line 252
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 253
    .line 254
    iget v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 255
    .line 256
    .line 257
    invoke-static {v4, v3}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->multiplyColorAlpha(II)I

    .line 258
    move-result v3

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 262
    .line 263
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 264
    .line 265
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 269
    .line 270
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 274
    .line 275
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 276
    .line 277
    .line 278
    invoke-static {v2}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    move-result-object v2

    .line 280
    .line 281
    check-cast v2, Landroid/graphics/Path;

    .line 282
    .line 283
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 287
    .line 288
    goto/16 :goto_b

    .line 289
    .line 290
    :cond_6
    iget-object v4, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 291
    .line 292
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 296
    .line 297
    iget-object v4, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 298
    .line 299
    .line 300
    invoke-static {v4}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    move-result-object v4

    .line 302
    .line 303
    check-cast v4, Landroid/graphics/Path;

    .line 304
    .line 305
    sget-object v6, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v4, v6}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getLayoutDirection()I

    .line 312
    move-result v4

    .line 313
    .line 314
    if-ne v4, v5, :cond_7

    .line 315
    move v2, v5

    .line 316
    :cond_7
    const/4 v4, 0x4

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 320
    move-result v5

    .line 321
    const/4 v6, 0x5

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v6}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 325
    move-result v8

    .line 326
    .line 327
    .line 328
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 329
    move-result-object v9

    .line 330
    .line 331
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v9, v10}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 335
    move-result v9

    .line 336
    .line 337
    if-eqz v9, :cond_d

    .line 338
    .line 339
    .line 340
    invoke-direct {v0, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 341
    move-result v4

    .line 342
    .line 343
    if-nez v4, :cond_8

    .line 344
    goto :goto_2

    .line 345
    :cond_8
    move v3, v5

    .line 346
    .line 347
    .line 348
    :goto_2
    invoke-direct {v0, v6}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-nez v4, :cond_9

    .line 352
    goto :goto_3

    .line 353
    :cond_9
    move v7, v8

    .line 354
    .line 355
    :goto_3
    if-eqz v2, :cond_a

    .line 356
    move v4, v7

    .line 357
    goto :goto_4

    .line 358
    :cond_a
    move v4, v3

    .line 359
    .line 360
    :goto_4
    if-eqz v2, :cond_b

    .line 361
    move v7, v3

    .line 362
    :cond_b
    move v2, v4

    .line 363
    :cond_c
    move v14, v7

    .line 364
    goto :goto_9

    .line 365
    .line 366
    :cond_d
    if-eqz v2, :cond_e

    .line 367
    move v9, v8

    .line 368
    goto :goto_5

    .line 369
    :cond_e
    move v9, v5

    .line 370
    .line 371
    :goto_5
    if-eqz v2, :cond_f

    .line 372
    goto :goto_6

    .line 373
    :cond_f
    move v5, v8

    .line 374
    .line 375
    .line 376
    :goto_6
    invoke-direct {v0, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 377
    move-result v4

    .line 378
    .line 379
    .line 380
    invoke-direct {v0, v6}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 381
    move-result v6

    .line 382
    .line 383
    if-eqz v2, :cond_10

    .line 384
    move v8, v6

    .line 385
    goto :goto_7

    .line 386
    :cond_10
    move v8, v4

    .line 387
    .line 388
    :goto_7
    if-eqz v2, :cond_11

    .line 389
    goto :goto_8

    .line 390
    :cond_11
    move v4, v6

    .line 391
    .line 392
    :goto_8
    if-eqz v8, :cond_12

    .line 393
    move v3, v9

    .line 394
    :cond_12
    move v2, v3

    .line 395
    .line 396
    if-eqz v4, :cond_c

    .line 397
    move v14, v5

    .line 398
    .line 399
    :goto_9
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 400
    .line 401
    .line 402
    invoke-static {v3}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    move-result-object v3

    .line 404
    .line 405
    check-cast v3, Landroid/graphics/RectF;

    .line 406
    .line 407
    iget v4, v3, Landroid/graphics/RectF;->left:F

    .line 408
    .line 409
    iget v5, v3, Landroid/graphics/RectF;->right:F

    .line 410
    .line 411
    iget v6, v3, Landroid/graphics/RectF;->top:F

    .line 412
    .line 413
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 414
    .line 415
    iget-object v7, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 416
    .line 417
    .line 418
    invoke-static {v7}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    move-result-object v7

    .line 420
    .line 421
    check-cast v7, Landroid/graphics/PointF;

    .line 422
    .line 423
    iget-object v8, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 424
    .line 425
    .line 426
    invoke-static {v8}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    move-result-object v8

    .line 428
    .line 429
    check-cast v8, Landroid/graphics/PointF;

    .line 430
    .line 431
    iget-object v9, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 432
    .line 433
    .line 434
    invoke-static {v9}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    move-result-object v9

    .line 436
    .line 437
    check-cast v9, Landroid/graphics/PointF;

    .line 438
    .line 439
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 440
    .line 441
    .line 442
    invoke-static {v10}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    move-result-object v10

    .line 444
    .line 445
    check-cast v10, Landroid/graphics/PointF;

    .line 446
    .line 447
    move/from16 v16, v12

    .line 448
    .line 449
    iget v12, v11, Landroid/graphics/RectF;->left:F

    .line 450
    .line 451
    cmpl-float v12, v12, v16

    .line 452
    .line 453
    .line 454
    const v17, 0x3f4ccccd    # 0.8f

    .line 455
    .line 456
    if-lez v12, :cond_13

    .line 457
    move v12, v3

    .line 458
    move v3, v4

    .line 459
    .line 460
    sub-float v4, v6, v17

    .line 461
    .line 462
    move/from16 v18, v5

    .line 463
    .line 464
    iget v5, v7, Landroid/graphics/PointF;->x:F

    .line 465
    .line 466
    iget v0, v7, Landroid/graphics/PointF;->y:F

    .line 467
    .line 468
    sub-float v0, v0, v17

    .line 469
    .line 470
    move-object/from16 v19, v7

    .line 471
    .line 472
    iget v7, v9, Landroid/graphics/PointF;->x:F

    .line 473
    .line 474
    move/from16 v20, v0

    .line 475
    .line 476
    iget v0, v9, Landroid/graphics/PointF;->y:F

    .line 477
    .line 478
    add-float v0, v0, v17

    .line 479
    .line 480
    move-object/from16 v21, v10

    .line 481
    .line 482
    add-float v10, v12, v17

    .line 483
    .line 484
    move-object/from16 v22, v9

    .line 485
    move v9, v3

    .line 486
    .line 487
    move/from16 v23, v20

    .line 488
    .line 489
    move/from16 v20, v6

    .line 490
    .line 491
    move/from16 v6, v23

    .line 492
    .line 493
    move-object/from16 v23, v19

    .line 494
    .line 495
    move/from16 v19, v12

    .line 496
    .line 497
    move-object/from16 v12, v23

    .line 498
    .line 499
    move-object/from16 v23, v22

    .line 500
    .line 501
    move/from16 v22, v14

    .line 502
    .line 503
    move-object/from16 v14, v23

    .line 504
    .line 505
    move/from16 v23, v15

    .line 506
    .line 507
    move-object/from16 v15, v21

    .line 508
    .line 509
    move/from16 v21, v13

    .line 510
    move-object v13, v8

    .line 511
    move v8, v0

    .line 512
    .line 513
    move-object/from16 v0, p0

    .line 514
    .line 515
    .line 516
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 517
    .line 518
    move/from16 v24, v3

    .line 519
    goto :goto_a

    .line 520
    .line 521
    :cond_13
    move/from16 v19, v3

    .line 522
    .line 523
    move/from16 v24, v4

    .line 524
    .line 525
    move/from16 v18, v5

    .line 526
    .line 527
    move/from16 v20, v6

    .line 528
    move-object v12, v7

    .line 529
    .line 530
    move/from16 v21, v13

    .line 531
    .line 532
    move/from16 v22, v14

    .line 533
    .line 534
    move/from16 v23, v15

    .line 535
    move-object v13, v8

    .line 536
    move-object v14, v9

    .line 537
    move-object v15, v10

    .line 538
    .line 539
    :goto_a
    iget v0, v11, Landroid/graphics/RectF;->top:F

    .line 540
    .line 541
    cmpl-float v0, v0, v16

    .line 542
    .line 543
    if-lez v0, :cond_14

    .line 544
    .line 545
    sub-float v3, v24, v17

    .line 546
    .line 547
    iget v0, v12, Landroid/graphics/PointF;->x:F

    .line 548
    .line 549
    sub-float v5, v0, v17

    .line 550
    .line 551
    iget v6, v12, Landroid/graphics/PointF;->y:F

    .line 552
    .line 553
    iget v0, v13, Landroid/graphics/PointF;->x:F

    .line 554
    .line 555
    add-float v7, v0, v17

    .line 556
    .line 557
    iget v8, v13, Landroid/graphics/PointF;->y:F

    .line 558
    .line 559
    add-float v9, v18, v17

    .line 560
    .line 561
    move/from16 v10, v20

    .line 562
    .line 563
    move-object/from16 v0, p0

    .line 564
    .line 565
    move-object/from16 v1, p1

    .line 566
    .line 567
    move/from16 v4, v20

    .line 568
    .line 569
    move/from16 v2, v21

    .line 570
    .line 571
    .line 572
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 573
    .line 574
    :cond_14
    iget v0, v11, Landroid/graphics/RectF;->right:F

    .line 575
    .line 576
    cmpl-float v0, v0, v16

    .line 577
    .line 578
    if-lez v0, :cond_15

    .line 579
    .line 580
    sub-float v4, v20, v17

    .line 581
    .line 582
    iget v5, v13, Landroid/graphics/PointF;->x:F

    .line 583
    .line 584
    iget v0, v13, Landroid/graphics/PointF;->y:F

    .line 585
    .line 586
    sub-float v6, v0, v17

    .line 587
    .line 588
    iget v7, v15, Landroid/graphics/PointF;->x:F

    .line 589
    .line 590
    iget v0, v15, Landroid/graphics/PointF;->y:F

    .line 591
    .line 592
    add-float v8, v0, v17

    .line 593
    .line 594
    add-float v10, v19, v17

    .line 595
    .line 596
    move/from16 v9, v18

    .line 597
    .line 598
    move-object/from16 v0, p0

    .line 599
    .line 600
    move-object/from16 v1, p1

    .line 601
    .line 602
    move/from16 v3, v18

    .line 603
    .line 604
    move/from16 v2, v22

    .line 605
    .line 606
    .line 607
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 608
    .line 609
    :cond_15
    iget v0, v11, Landroid/graphics/RectF;->bottom:F

    .line 610
    .line 611
    cmpl-float v0, v0, v16

    .line 612
    .line 613
    if-lez v0, :cond_16

    .line 614
    .line 615
    sub-float v3, v24, v17

    .line 616
    .line 617
    iget v0, v14, Landroid/graphics/PointF;->x:F

    .line 618
    .line 619
    sub-float v5, v0, v17

    .line 620
    .line 621
    iget v6, v14, Landroid/graphics/PointF;->y:F

    .line 622
    .line 623
    iget v0, v15, Landroid/graphics/PointF;->x:F

    .line 624
    .line 625
    add-float v7, v0, v17

    .line 626
    .line 627
    iget v8, v15, Landroid/graphics/PointF;->y:F

    .line 628
    .line 629
    add-float v9, v18, v17

    .line 630
    .line 631
    move/from16 v10, v19

    .line 632
    .line 633
    move-object/from16 v0, p0

    .line 634
    .line 635
    move-object/from16 v1, p1

    .line 636
    .line 637
    move/from16 v4, v19

    .line 638
    .line 639
    move/from16 v2, v23

    .line 640
    .line 641
    .line 642
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 643
    .line 644
    .line 645
    :cond_16
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 646
    return-void
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
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
.end method

.method private static fastBorderCompatibleColorOrZero(IIIIIIII)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    move v1, p4

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    .line 8
    :goto_0
    if-lez p1, :cond_1

    .line 9
    move v2, p5

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    move v2, v0

    .line 12
    :goto_1
    and-int/2addr v1, v2

    .line 13
    .line 14
    if-lez p2, :cond_2

    .line 15
    move v2, p6

    .line 16
    goto :goto_2

    .line 17
    :cond_2
    move v2, v0

    .line 18
    :goto_2
    and-int/2addr v1, v2

    .line 19
    .line 20
    if-lez p3, :cond_3

    .line 21
    move v0, p7

    .line 22
    :cond_3
    and-int/2addr v0, v1

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    if-lez p0, :cond_4

    .line 26
    goto :goto_3

    .line 27
    :cond_4
    move p4, v1

    .line 28
    .line 29
    :goto_3
    if-lez p1, :cond_5

    .line 30
    goto :goto_4

    .line 31
    :cond_5
    move p5, v1

    .line 32
    .line 33
    :goto_4
    or-int p0, p4, p5

    .line 34
    .line 35
    if-lez p2, :cond_6

    .line 36
    goto :goto_5

    .line 37
    :cond_6
    move p6, v1

    .line 38
    :goto_5
    or-int/2addr p0, p6

    .line 39
    .line 40
    if-lez p3, :cond_7

    .line 41
    goto :goto_6

    .line 42
    :cond_7
    move p7, v1

    .line 43
    :goto_6
    or-int/2addr p0, p7

    .line 44
    .line 45
    if-ne v0, p0, :cond_8

    .line 46
    return v0

    .line 47
    :cond_8
    return v1
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
.end method

.method private getBackgroundImageShader()Landroid/graphics/Shader;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundImageLayers:Ljava/util/List;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v2

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    check-cast v2, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;->getShader(Landroid/graphics/Rect;)Landroid/graphics/Shader;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    if-nez v1, :cond_2

    .line 36
    move-object v1, v2

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_2
    new-instance v3, Landroid/graphics/ComposeShader;

    .line 40
    .line 41
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, v2, v1, v4}, Landroid/graphics/ComposeShader;-><init>(Landroid/graphics/Shader;Landroid/graphics/Shader;Landroid/graphics/PorterDuff$Mode;)V

    .line 45
    move-object v1, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    return-object v1
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

.method private static getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p16

    .line 3
    .line 4
    add-double v1, p0, p4

    .line 5
    .line 6
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 7
    div-double/2addr v1, v3

    .line 8
    .line 9
    add-double v5, p2, p6

    .line 10
    div-double/2addr v5, v3

    .line 11
    .line 12
    sub-double v7, p8, v1

    .line 13
    .line 14
    sub-double v9, p10, v5

    .line 15
    .line 16
    sub-double v11, p12, v1

    .line 17
    .line 18
    sub-double v13, p14, v5

    .line 19
    .line 20
    sub-double v15, p4, p0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 24
    move-result-wide v15

    .line 25
    div-double/2addr v15, v3

    .line 26
    .line 27
    sub-double v17, p6, p2

    .line 28
    .line 29
    .line 30
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 31
    move-result-wide v17

    .line 32
    .line 33
    div-double v17, v17, v3

    .line 34
    sub-double/2addr v13, v9

    .line 35
    sub-double/2addr v11, v7

    .line 36
    div-double/2addr v13, v11

    .line 37
    mul-double/2addr v7, v13

    .line 38
    sub-double/2addr v9, v7

    .line 39
    .line 40
    mul-double v17, v17, v17

    .line 41
    .line 42
    mul-double v7, v15, v15

    .line 43
    .line 44
    mul-double v11, v7, v13

    .line 45
    mul-double/2addr v11, v13

    .line 46
    .line 47
    add-double v11, v17, v11

    .line 48
    .line 49
    mul-double v19, v15, v3

    .line 50
    .line 51
    mul-double v19, v19, v15

    .line 52
    .line 53
    mul-double v19, v19, v9

    .line 54
    move-wide v15, v3

    .line 55
    .line 56
    mul-double v3, v19, v13

    .line 57
    .line 58
    mul-double v19, v9, v9

    .line 59
    .line 60
    sub-double v19, v19, v17

    .line 61
    .line 62
    mul-double v7, v7, v19

    .line 63
    neg-double v7, v7

    .line 64
    div-double/2addr v7, v11

    .line 65
    mul-double/2addr v11, v15

    .line 66
    .line 67
    move-wide/from16 v17, v1

    .line 68
    .line 69
    div-double v1, v3, v11

    .line 70
    .line 71
    move-wide/from16 v19, v5

    .line 72
    move-wide v5, v15

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 76
    move-result-wide v1

    .line 77
    add-double/2addr v7, v1

    .line 78
    .line 79
    .line 80
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 81
    move-result-wide v1

    .line 82
    neg-double v3, v3

    .line 83
    div-double/2addr v3, v11

    .line 84
    sub-double/2addr v3, v1

    .line 85
    mul-double/2addr v13, v3

    .line 86
    add-double/2addr v13, v9

    .line 87
    .line 88
    add-double v3, v3, v17

    .line 89
    .line 90
    add-double v13, v13, v19

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 94
    move-result v1

    .line 95
    .line 96
    if-nez v1, :cond_0

    .line 97
    .line 98
    .line 99
    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    .line 100
    move-result v1

    .line 101
    .line 102
    if-nez v1, :cond_0

    .line 103
    double-to-float v1, v3

    .line 104
    .line 105
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 106
    double-to-float v1, v13

    .line 107
    .line 108
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 109
    :cond_0
    return-void
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
.end method

.method private static getPathEffect(Lcom/facebook/react/uimanager/style/BorderStyle;F)Landroid/graphics/PathEffect;
    .locals 7
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x2

    .line 6
    .line 7
    sget-object v5, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable$1;->$SwitchMap$com$facebook$react$uimanager$style$BorderStyle:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result p0

    .line 12
    .line 13
    aget p0, v5, p0

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    if-eq p0, v4, :cond_1

    .line 17
    .line 18
    if-eq p0, v3, :cond_0

    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    .line 22
    :cond_0
    new-instance p0, Landroid/graphics/DashPathEffect;

    .line 23
    .line 24
    new-array v2, v2, [F

    .line 25
    .line 26
    aput p1, v2, v1

    .line 27
    .line 28
    aput p1, v2, v0

    .line 29
    .line 30
    aput p1, v2, v4

    .line 31
    .line 32
    aput p1, v2, v3

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v2, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 36
    return-object p0

    .line 37
    .line 38
    :cond_1
    new-instance p0, Landroid/graphics/DashPathEffect;

    .line 39
    .line 40
    const/high16 v6, 0x40400000    # 3.0f

    .line 41
    mul-float/2addr p1, v6

    .line 42
    .line 43
    new-array v2, v2, [F

    .line 44
    .line 45
    aput p1, v2, v1

    .line 46
    .line 47
    aput p1, v2, v0

    .line 48
    .line 49
    aput p1, v2, v4

    .line 50
    .line 51
    aput p1, v2, v3

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v2, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 55
    return-object p0
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
.end method

.method private isBorderColorDefined(I)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    .line 4
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    return p1
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

.method private static multiplyColorAlpha(II)I
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0xff

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    return p0

    .line 6
    .line 7
    .line 8
    :cond_0
    const v0, 0xffffff

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    and-int/2addr p0, v0

    .line 12
    return p0

    .line 13
    .line 14
    :cond_1
    shr-int/lit8 v1, p1, 0x7

    .line 15
    add-int/2addr p1, v1

    .line 16
    .line 17
    ushr-int/lit8 v1, p0, 0x18

    .line 18
    mul-int/2addr v1, p1

    .line 19
    .line 20
    shr-int/lit8 p1, v1, 0x8

    .line 21
    .line 22
    shl-int/lit8 p1, p1, 0x18

    .line 23
    and-int/2addr p0, v0

    .line 24
    or-int/2addr p0, p1

    .line 25
    return p0
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

.method private setBorderAlpha(IF)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/uimanager/Spacing;

    .line 7
    .line 8
    const/high16 v1, 0x437f0000    # 255.0f

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/Spacing;-><init>(F)V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/Spacing;->set(IF)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 34
    :cond_1
    return-void
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

.method private setBorderRGB(IF)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/uimanager/Spacing;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/Spacing;-><init>(F)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/Spacing;->set(IF)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 33
    :cond_1
    return-void
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

.method private updatePath()V
    .locals 55

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const/16 v5, 0x8

    .line 5
    const/4 v6, 0x3

    .line 6
    const/4 v7, 0x2

    .line 7
    const/4 v8, 0x1

    .line 8
    const/4 v9, 0x0

    .line 9
    .line 10
    iget-boolean v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 11
    .line 12
    if-nez v10, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    iput-boolean v9, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 16
    .line 17
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 18
    .line 19
    if-nez v10, :cond_1

    .line 20
    .line 21
    new-instance v10, Landroid/graphics/Path;

    .line 22
    .line 23
    .line 24
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 27
    .line 28
    :cond_1
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundColorRenderPath:Landroid/graphics/Path;

    .line 29
    .line 30
    if-nez v10, :cond_2

    .line 31
    .line 32
    new-instance v10, Landroid/graphics/Path;

    .line 33
    .line 34
    .line 35
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 36
    .line 37
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundColorRenderPath:Landroid/graphics/Path;

    .line 38
    .line 39
    :cond_2
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 40
    .line 41
    if-nez v10, :cond_3

    .line 42
    .line 43
    new-instance v10, Landroid/graphics/Path;

    .line 44
    .line 45
    .line 46
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 47
    .line 48
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 49
    .line 50
    :cond_3
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 51
    .line 52
    if-nez v10, :cond_4

    .line 53
    .line 54
    new-instance v10, Landroid/graphics/Path;

    .line 55
    .line 56
    .line 57
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 58
    .line 59
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 60
    .line 61
    :cond_4
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 62
    .line 63
    if-nez v10, :cond_5

    .line 64
    .line 65
    new-instance v10, Landroid/graphics/Path;

    .line 66
    .line 67
    .line 68
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 69
    .line 70
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 71
    .line 72
    :cond_5
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 73
    .line 74
    if-nez v10, :cond_6

    .line 75
    .line 76
    new-instance v10, Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    .line 80
    .line 81
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 82
    .line 83
    :cond_6
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 84
    .line 85
    if-nez v10, :cond_7

    .line 86
    .line 87
    new-instance v10, Landroid/graphics/RectF;

    .line 88
    .line 89
    .line 90
    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    .line 91
    .line 92
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 93
    .line 94
    :cond_7
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    .line 95
    .line 96
    if-nez v10, :cond_8

    .line 97
    .line 98
    new-instance v10, Landroid/graphics/RectF;

    .line 99
    .line 100
    .line 101
    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    .line 102
    .line 103
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    .line 104
    .line 105
    :cond_8
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    .line 106
    .line 107
    if-nez v10, :cond_9

    .line 108
    .line 109
    new-instance v10, Landroid/graphics/RectF;

    .line 110
    .line 111
    .line 112
    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    .line 113
    .line 114
    iput-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    .line 115
    .line 116
    :cond_9
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 120
    .line 121
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundColorRenderPath:Landroid/graphics/Path;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 125
    .line 126
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 130
    .line 131
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 135
    .line 136
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 140
    .line 141
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 145
    move-result-object v11

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 149
    .line 150
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 154
    move-result-object v11

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 158
    .line 159
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 163
    move-result-object v11

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 167
    .line 168
    iget-object v10, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 172
    move-result-object v11

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    .line 179
    move-result-object v10

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v9}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 183
    move-result v11

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v8}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 187
    move-result v12

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v7}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 191
    move-result v13

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v6}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 195
    move-result v14

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v5}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 199
    move-result v15

    .line 200
    .line 201
    const/16 v16, 0x7

    .line 202
    .line 203
    const/16 v1, 0x9

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 207
    move-result v17

    .line 208
    .line 209
    const/16 v18, 0x6

    .line 210
    .line 211
    const/16 v2, 0xb

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 215
    move-result v19

    .line 216
    .line 217
    const/16 v20, 0x5

    .line 218
    .line 219
    const/16 v3, 0xa

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v3}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderColor(I)I

    .line 223
    move-result v21

    .line 224
    .line 225
    .line 226
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 227
    move-result v1

    .line 228
    .line 229
    if-eqz v1, :cond_a

    .line 230
    .line 231
    move/from16 v12, v17

    .line 232
    move v14, v12

    .line 233
    .line 234
    .line 235
    :cond_a
    invoke-direct {v0, v3}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 236
    move-result v1

    .line 237
    .line 238
    if-eqz v1, :cond_b

    .line 239
    goto :goto_0

    .line 240
    .line 241
    :cond_b
    move/from16 v21, v14

    .line 242
    .line 243
    .line 244
    :goto_0
    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 245
    move-result v1

    .line 246
    .line 247
    if-eqz v1, :cond_c

    .line 248
    goto :goto_1

    .line 249
    .line 250
    :cond_c
    move/from16 v19, v12

    .line 251
    .line 252
    .line 253
    :goto_1
    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    .line 254
    move-result v1

    .line 255
    .line 256
    if-eqz v1, :cond_d

    .line 257
    .line 258
    .line 259
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->alpha(I)I

    .line 260
    move-result v1

    .line 261
    .line 262
    if-eqz v1, :cond_d

    .line 263
    .line 264
    .line 265
    invoke-static {v13}, Landroid/graphics/Color;->alpha(I)I

    .line 266
    move-result v1

    .line 267
    .line 268
    if-eqz v1, :cond_d

    .line 269
    .line 270
    .line 271
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->alpha(I)I

    .line 272
    move-result v1

    .line 273
    .line 274
    if-eqz v1, :cond_d

    .line 275
    .line 276
    .line 277
    invoke-static {v15}, Landroid/graphics/Color;->alpha(I)I

    .line 278
    move-result v1

    .line 279
    .line 280
    if-eqz v1, :cond_d

    .line 281
    .line 282
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 283
    .line 284
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 285
    .line 286
    iget v11, v10, Landroid/graphics/RectF;->top:F

    .line 287
    add-float/2addr v3, v11

    .line 288
    .line 289
    iput v3, v1, Landroid/graphics/RectF;->top:F

    .line 290
    .line 291
    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 292
    .line 293
    iget v11, v10, Landroid/graphics/RectF;->bottom:F

    .line 294
    sub-float/2addr v3, v11

    .line 295
    .line 296
    iput v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 297
    .line 298
    iget v3, v1, Landroid/graphics/RectF;->left:F

    .line 299
    .line 300
    iget v11, v10, Landroid/graphics/RectF;->left:F

    .line 301
    add-float/2addr v3, v11

    .line 302
    .line 303
    iput v3, v1, Landroid/graphics/RectF;->left:F

    .line 304
    .line 305
    iget v3, v1, Landroid/graphics/RectF;->right:F

    .line 306
    .line 307
    iget v11, v10, Landroid/graphics/RectF;->right:F

    .line 308
    sub-float/2addr v3, v11

    .line 309
    .line 310
    iput v3, v1, Landroid/graphics/RectF;->right:F

    .line 311
    .line 312
    .line 313
    const v1, 0x3f4ccccd    # 0.8f

    .line 314
    goto :goto_2

    .line 315
    :cond_d
    const/4 v1, 0x0

    .line 316
    .line 317
    :goto_2
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    .line 318
    .line 319
    iget v11, v3, Landroid/graphics/RectF;->top:F

    .line 320
    .line 321
    iget v12, v10, Landroid/graphics/RectF;->top:F

    .line 322
    .line 323
    const/high16 v13, 0x3f000000    # 0.5f

    .line 324
    mul-float/2addr v12, v13

    .line 325
    add-float/2addr v11, v12

    .line 326
    .line 327
    iput v11, v3, Landroid/graphics/RectF;->top:F

    .line 328
    .line 329
    iget v11, v3, Landroid/graphics/RectF;->bottom:F

    .line 330
    .line 331
    iget v12, v10, Landroid/graphics/RectF;->bottom:F

    .line 332
    mul-float/2addr v12, v13

    .line 333
    sub-float/2addr v11, v12

    .line 334
    .line 335
    iput v11, v3, Landroid/graphics/RectF;->bottom:F

    .line 336
    .line 337
    iget v11, v3, Landroid/graphics/RectF;->left:F

    .line 338
    .line 339
    iget v12, v10, Landroid/graphics/RectF;->left:F

    .line 340
    mul-float/2addr v12, v13

    .line 341
    add-float/2addr v11, v12

    .line 342
    .line 343
    iput v11, v3, Landroid/graphics/RectF;->left:F

    .line 344
    .line 345
    iget v11, v3, Landroid/graphics/RectF;->right:F

    .line 346
    .line 347
    iget v12, v10, Landroid/graphics/RectF;->right:F

    .line 348
    mul-float/2addr v12, v13

    .line 349
    sub-float/2addr v11, v12

    .line 350
    .line 351
    iput v11, v3, Landroid/graphics/RectF;->right:F

    .line 352
    .line 353
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getLayoutDirection()I

    .line 357
    move-result v11

    .line 358
    .line 359
    iget-object v12, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 360
    .line 361
    iget-object v14, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    .line 365
    move-result v14

    .line 366
    .line 367
    .line 368
    invoke-static {v14}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 369
    move-result v14

    .line 370
    .line 371
    iget-object v15, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    .line 375
    move-result v15

    .line 376
    .line 377
    .line 378
    invoke-static {v15}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 379
    move-result v15

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v11, v12, v14, v15}, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;->resolve(ILandroid/content/Context;FF)Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 383
    move-result-object v3

    .line 384
    .line 385
    iput-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mComputedBorderRadius:Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/style/ComputedBorderRadius;->getTopLeft()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 389
    move-result-object v3

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/style/CornerRadii;->toPixelFromDIP()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 393
    move-result-object v3

    .line 394
    .line 395
    iget-object v11, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mComputedBorderRadius:Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/ComputedBorderRadius;->getTopRight()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 399
    move-result-object v11

    .line 400
    .line 401
    .line 402
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->toPixelFromDIP()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 403
    move-result-object v11

    .line 404
    .line 405
    iget-object v12, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mComputedBorderRadius:Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/ComputedBorderRadius;->getBottomLeft()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 409
    move-result-object v12

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->toPixelFromDIP()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 413
    move-result-object v12

    .line 414
    .line 415
    iget-object v14, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mComputedBorderRadius:Lcom/facebook/react/uimanager/style/ComputedBorderRadius;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/ComputedBorderRadius;->getBottomRight()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 419
    move-result-object v14

    .line 420
    .line 421
    .line 422
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->toPixelFromDIP()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 423
    move-result-object v14

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 427
    move-result v15

    .line 428
    .line 429
    iget v2, v10, Landroid/graphics/RectF;->left:F

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v15, v2}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 433
    move-result v2

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 437
    move-result v15

    .line 438
    .line 439
    const/16 v19, 0x4

    .line 440
    .line 441
    iget v4, v10, Landroid/graphics/RectF;->top:F

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v15, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 445
    move-result v4

    .line 446
    .line 447
    .line 448
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 449
    move-result v15

    .line 450
    .line 451
    move/from16 v21, v6

    .line 452
    .line 453
    iget v6, v10, Landroid/graphics/RectF;->right:F

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v15, v6}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 457
    move-result v6

    .line 458
    .line 459
    .line 460
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 461
    move-result v15

    .line 462
    .line 463
    move/from16 v22, v7

    .line 464
    .line 465
    iget v7, v10, Landroid/graphics/RectF;->top:F

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v15, v7}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 469
    move-result v7

    .line 470
    .line 471
    .line 472
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 473
    move-result v15

    .line 474
    .line 475
    move/from16 v23, v8

    .line 476
    .line 477
    iget v8, v10, Landroid/graphics/RectF;->right:F

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v15, v8}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 481
    move-result v8

    .line 482
    .line 483
    .line 484
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 485
    move-result v15

    .line 486
    .line 487
    move/from16 v24, v9

    .line 488
    .line 489
    iget v9, v10, Landroid/graphics/RectF;->bottom:F

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v15, v9}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 493
    move-result v9

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 497
    move-result v15

    .line 498
    .line 499
    move/from16 v25, v13

    .line 500
    .line 501
    iget v13, v10, Landroid/graphics/RectF;->left:F

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0, v15, v13}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 505
    move-result v13

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 509
    move-result v15

    .line 510
    .line 511
    iget v5, v10, Landroid/graphics/RectF;->bottom:F

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v15, v5}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getInnerBorderRadius(FF)F

    .line 515
    move-result v5

    .line 516
    .line 517
    iget-object v15, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 518
    .line 519
    move/from16 v27, v1

    .line 520
    .line 521
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 522
    .line 523
    move/from16 v28, v2

    .line 524
    .line 525
    move-object/from16 v29, v3

    .line 526
    .line 527
    const/16 v2, 0x8

    .line 528
    .line 529
    new-array v3, v2, [F

    .line 530
    .line 531
    aput v28, v3, v24

    .line 532
    .line 533
    aput v4, v3, v23

    .line 534
    .line 535
    aput v6, v3, v22

    .line 536
    .line 537
    aput v7, v3, v21

    .line 538
    .line 539
    aput v8, v3, v19

    .line 540
    .line 541
    aput v9, v3, v20

    .line 542
    .line 543
    aput v13, v3, v18

    .line 544
    .line 545
    aput v5, v3, v16

    .line 546
    .line 547
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v15, v1, v3, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 551
    .line 552
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundColorRenderPath:Landroid/graphics/Path;

    .line 553
    .line 554
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 555
    .line 556
    iget v15, v3, Landroid/graphics/RectF;->left:F

    .line 557
    .line 558
    sub-float v31, v15, v27

    .line 559
    .line 560
    iget v15, v3, Landroid/graphics/RectF;->top:F

    .line 561
    .line 562
    sub-float v32, v15, v27

    .line 563
    .line 564
    iget v15, v3, Landroid/graphics/RectF;->right:F

    .line 565
    .line 566
    add-float v33, v15, v27

    .line 567
    .line 568
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 569
    .line 570
    add-float v34, v3, v27

    .line 571
    .line 572
    const/16 v3, 0x8

    .line 573
    .line 574
    new-array v15, v3, [F

    .line 575
    .line 576
    aput v28, v15, v24

    .line 577
    .line 578
    aput v4, v15, v23

    .line 579
    .line 580
    aput v6, v15, v22

    .line 581
    .line 582
    aput v7, v15, v21

    .line 583
    .line 584
    aput v8, v15, v19

    .line 585
    .line 586
    aput v9, v15, v20

    .line 587
    .line 588
    aput v13, v15, v18

    .line 589
    .line 590
    aput v5, v15, v16

    .line 591
    .line 592
    move-object/from16 v30, v1

    .line 593
    .line 594
    move-object/from16 v36, v2

    .line 595
    .line 596
    move-object/from16 v35, v15

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v30 .. v36}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    .line 600
    .line 601
    move-object/from16 v1, v36

    .line 602
    .line 603
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 604
    .line 605
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v29 .. v29}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 609
    move-result v15

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v29 .. v29}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 613
    move-result v27

    .line 614
    .line 615
    .line 616
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 617
    move-result v30

    .line 618
    .line 619
    .line 620
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 621
    move-result v31

    .line 622
    .line 623
    .line 624
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 625
    move-result v32

    .line 626
    .line 627
    .line 628
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 629
    move-result v33

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 633
    move-result v34

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 637
    move-result v35

    .line 638
    .line 639
    move/from16 v36, v4

    .line 640
    .line 641
    move/from16 v37, v5

    .line 642
    .line 643
    const/16 v4, 0x8

    .line 644
    .line 645
    new-array v5, v4, [F

    .line 646
    .line 647
    aput v15, v5, v24

    .line 648
    .line 649
    aput v27, v5, v23

    .line 650
    .line 651
    aput v30, v5, v22

    .line 652
    .line 653
    aput v31, v5, v21

    .line 654
    .line 655
    aput v32, v5, v19

    .line 656
    .line 657
    aput v33, v5, v20

    .line 658
    .line 659
    aput v34, v5, v18

    .line 660
    .line 661
    aput v35, v5, v16

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2, v3, v5, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 665
    .line 666
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 667
    .line 668
    const/high16 v3, 0x40000000    # 2.0f

    .line 669
    .line 670
    if-eqz v2, :cond_e

    .line 671
    .line 672
    const/16 v4, 0x8

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v4}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 676
    move-result v2

    .line 677
    div-float/2addr v2, v3

    .line 678
    goto :goto_3

    .line 679
    :cond_e
    const/4 v2, 0x0

    .line 680
    .line 681
    :goto_3
    iget-object v4, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 682
    .line 683
    iget-object v5, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v29 .. v29}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 687
    move-result v15

    .line 688
    add-float/2addr v15, v2

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v29 .. v29}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 692
    move-result v17

    .line 693
    .line 694
    add-float v17, v17, v2

    .line 695
    .line 696
    .line 697
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 698
    move-result v27

    .line 699
    .line 700
    add-float v27, v27, v2

    .line 701
    .line 702
    .line 703
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 704
    move-result v30

    .line 705
    .line 706
    add-float v30, v30, v2

    .line 707
    .line 708
    .line 709
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 710
    move-result v31

    .line 711
    .line 712
    add-float v31, v31, v2

    .line 713
    .line 714
    .line 715
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 716
    move-result v32

    .line 717
    .line 718
    add-float v32, v32, v2

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 722
    move-result v33

    .line 723
    .line 724
    add-float v33, v33, v2

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 728
    move-result v34

    .line 729
    .line 730
    add-float v34, v34, v2

    .line 731
    .line 732
    move/from16 v35, v3

    .line 733
    .line 734
    const/16 v2, 0x8

    .line 735
    .line 736
    new-array v3, v2, [F

    .line 737
    .line 738
    aput v15, v3, v24

    .line 739
    .line 740
    aput v17, v3, v23

    .line 741
    .line 742
    aput v27, v3, v22

    .line 743
    .line 744
    aput v30, v3, v21

    .line 745
    .line 746
    aput v31, v3, v19

    .line 747
    .line 748
    aput v32, v3, v20

    .line 749
    .line 750
    aput v33, v3, v18

    .line 751
    .line 752
    aput v34, v3, v16

    .line 753
    .line 754
    .line 755
    invoke-virtual {v4, v5, v3, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 756
    .line 757
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 758
    .line 759
    iget-object v3, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v29 .. v29}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 763
    move-result v4

    .line 764
    .line 765
    iget v5, v10, Landroid/graphics/RectF;->left:F

    .line 766
    .line 767
    mul-float v5, v5, v25

    .line 768
    sub-float/2addr v4, v5

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v29 .. v29}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 772
    move-result v5

    .line 773
    .line 774
    iget v15, v10, Landroid/graphics/RectF;->top:F

    .line 775
    .line 776
    mul-float v15, v15, v25

    .line 777
    sub-float/2addr v5, v15

    .line 778
    .line 779
    .line 780
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 781
    move-result v15

    .line 782
    .line 783
    move/from16 v17, v4

    .line 784
    .line 785
    iget v4, v10, Landroid/graphics/RectF;->right:F

    .line 786
    .line 787
    mul-float v4, v4, v25

    .line 788
    sub-float/2addr v15, v4

    .line 789
    .line 790
    .line 791
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 792
    move-result v4

    .line 793
    .line 794
    iget v11, v10, Landroid/graphics/RectF;->top:F

    .line 795
    .line 796
    mul-float v11, v11, v25

    .line 797
    sub-float/2addr v4, v11

    .line 798
    .line 799
    .line 800
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 801
    move-result v11

    .line 802
    .line 803
    move/from16 v27, v4

    .line 804
    .line 805
    iget v4, v10, Landroid/graphics/RectF;->right:F

    .line 806
    .line 807
    mul-float v4, v4, v25

    .line 808
    sub-float/2addr v11, v4

    .line 809
    .line 810
    .line 811
    invoke-virtual {v14}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 812
    move-result v4

    .line 813
    .line 814
    iget v14, v10, Landroid/graphics/RectF;->bottom:F

    .line 815
    .line 816
    mul-float v14, v14, v25

    .line 817
    sub-float/2addr v4, v14

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 821
    move-result v14

    .line 822
    .line 823
    move/from16 v29, v4

    .line 824
    .line 825
    iget v4, v10, Landroid/graphics/RectF;->left:F

    .line 826
    .line 827
    mul-float v4, v4, v25

    .line 828
    sub-float/2addr v14, v4

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/CornerRadii;->getVertical()F

    .line 832
    move-result v4

    .line 833
    .line 834
    iget v10, v10, Landroid/graphics/RectF;->bottom:F

    .line 835
    .line 836
    mul-float v10, v10, v25

    .line 837
    sub-float/2addr v4, v10

    .line 838
    .line 839
    const/16 v10, 0x8

    .line 840
    .line 841
    new-array v10, v10, [F

    .line 842
    .line 843
    aput v17, v10, v24

    .line 844
    .line 845
    aput v5, v10, v23

    .line 846
    .line 847
    aput v15, v10, v22

    .line 848
    .line 849
    aput v27, v10, v21

    .line 850
    .line 851
    aput v11, v10, v19

    .line 852
    .line 853
    aput v29, v10, v20

    .line 854
    .line 855
    aput v14, v10, v18

    .line 856
    .line 857
    aput v4, v10, v16

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2, v3, v10, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 861
    .line 862
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 863
    .line 864
    if-nez v1, :cond_f

    .line 865
    .line 866
    new-instance v1, Landroid/graphics/PointF;

    .line 867
    .line 868
    .line 869
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 870
    .line 871
    iput-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 872
    .line 873
    :cond_f
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 874
    .line 875
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 876
    .line 877
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 878
    .line 879
    iput v3, v1, Landroid/graphics/PointF;->x:F

    .line 880
    .line 881
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 882
    .line 883
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 884
    float-to-double v4, v3

    .line 885
    float-to-double v10, v2

    .line 886
    .line 887
    mul-float v12, v28, v35

    .line 888
    add-float/2addr v12, v3

    .line 889
    float-to-double v14, v12

    .line 890
    .line 891
    mul-float v12, v36, v35

    .line 892
    add-float/2addr v12, v2

    .line 893
    .line 894
    move-wide/from16 v38, v4

    .line 895
    float-to-double v4, v12

    .line 896
    .line 897
    iget-object v12, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 898
    .line 899
    move-object/from16 v54, v1

    .line 900
    .line 901
    iget v1, v12, Landroid/graphics/RectF;->left:F

    .line 902
    .line 903
    move-wide/from16 v44, v4

    .line 904
    float-to-double v4, v1

    .line 905
    .line 906
    iget v1, v12, Landroid/graphics/RectF;->top:F

    .line 907
    .line 908
    move-wide/from16 v46, v4

    .line 909
    float-to-double v4, v1

    .line 910
    .line 911
    move-wide/from16 v48, v4

    .line 912
    float-to-double v3, v3

    .line 913
    float-to-double v1, v2

    .line 914
    .line 915
    move-wide/from16 v52, v1

    .line 916
    .line 917
    move-wide/from16 v50, v3

    .line 918
    .line 919
    move-wide/from16 v40, v10

    .line 920
    .line 921
    move-wide/from16 v42, v14

    .line 922
    .line 923
    .line 924
    invoke-static/range {v38 .. v54}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 925
    .line 926
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 927
    .line 928
    if-nez v1, :cond_10

    .line 929
    .line 930
    new-instance v1, Landroid/graphics/PointF;

    .line 931
    .line 932
    .line 933
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 934
    .line 935
    iput-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 936
    .line 937
    :cond_10
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 938
    .line 939
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 940
    .line 941
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 942
    .line 943
    iput v3, v1, Landroid/graphics/PointF;->x:F

    .line 944
    .line 945
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 946
    .line 947
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 948
    float-to-double v14, v3

    .line 949
    .line 950
    mul-float v5, v37, v35

    .line 951
    .line 952
    sub-float v4, v2, v5

    .line 953
    float-to-double v4, v4

    .line 954
    .line 955
    mul-float v13, v13, v35

    .line 956
    add-float/2addr v13, v3

    .line 957
    float-to-double v10, v13

    .line 958
    float-to-double v12, v2

    .line 959
    .line 960
    move-object/from16 v30, v1

    .line 961
    .line 962
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 963
    .line 964
    move-wide/from16 v16, v4

    .line 965
    .line 966
    iget v4, v1, Landroid/graphics/RectF;->left:F

    .line 967
    float-to-double v4, v4

    .line 968
    .line 969
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 970
    .line 971
    move-wide/from16 v22, v4

    .line 972
    float-to-double v4, v1

    .line 973
    .line 974
    move-wide/from16 v24, v4

    .line 975
    float-to-double v3, v3

    .line 976
    float-to-double v1, v2

    .line 977
    .line 978
    move-wide/from16 v28, v1

    .line 979
    .line 980
    move-wide/from16 v26, v3

    .line 981
    .line 982
    move-wide/from16 v18, v10

    .line 983
    .line 984
    move-wide/from16 v20, v12

    .line 985
    .line 986
    .line 987
    invoke-static/range {v14 .. v30}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 988
    .line 989
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 990
    .line 991
    if-nez v1, :cond_11

    .line 992
    .line 993
    new-instance v1, Landroid/graphics/PointF;

    .line 994
    .line 995
    .line 996
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 997
    .line 998
    iput-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 999
    .line 1000
    :cond_11
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 1001
    .line 1002
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 1003
    .line 1004
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 1005
    .line 1006
    iput v3, v1, Landroid/graphics/PointF;->x:F

    .line 1007
    .line 1008
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 1009
    .line 1010
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 1011
    .line 1012
    mul-float v6, v6, v35

    .line 1013
    .line 1014
    sub-float v4, v3, v6

    .line 1015
    float-to-double v10, v4

    .line 1016
    float-to-double v12, v2

    .line 1017
    float-to-double v14, v3

    .line 1018
    .line 1019
    mul-float v7, v7, v35

    .line 1020
    add-float/2addr v7, v2

    .line 1021
    float-to-double v4, v7

    .line 1022
    .line 1023
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 1024
    .line 1025
    iget v7, v6, Landroid/graphics/RectF;->right:F

    .line 1026
    .line 1027
    move-wide/from16 v16, v4

    .line 1028
    float-to-double v4, v7

    .line 1029
    .line 1030
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 1031
    float-to-double v6, v6

    .line 1032
    .line 1033
    move-wide/from16 v18, v4

    .line 1034
    float-to-double v3, v3

    .line 1035
    .line 1036
    move-object/from16 v26, v1

    .line 1037
    float-to-double v1, v2

    .line 1038
    .line 1039
    move-wide/from16 v24, v1

    .line 1040
    .line 1041
    move-wide/from16 v22, v3

    .line 1042
    .line 1043
    move-wide/from16 v20, v6

    .line 1044
    .line 1045
    .line 1046
    invoke-static/range {v10 .. v26}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 1047
    .line 1048
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 1049
    .line 1050
    if-nez v1, :cond_12

    .line 1051
    .line 1052
    new-instance v1, Landroid/graphics/PointF;

    .line 1053
    .line 1054
    .line 1055
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 1056
    .line 1057
    iput-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 1058
    .line 1059
    :cond_12
    iget-object v1, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 1060
    .line 1061
    iget-object v2, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 1062
    .line 1063
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 1064
    .line 1065
    iput v3, v1, Landroid/graphics/PointF;->x:F

    .line 1066
    .line 1067
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 1068
    .line 1069
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 1070
    .line 1071
    mul-float v8, v8, v35

    .line 1072
    .line 1073
    sub-float v4, v3, v8

    .line 1074
    float-to-double v10, v4

    .line 1075
    .line 1076
    mul-float v9, v9, v35

    .line 1077
    .line 1078
    sub-float v4, v2, v9

    .line 1079
    float-to-double v12, v4

    .line 1080
    float-to-double v14, v3

    .line 1081
    float-to-double v4, v2

    .line 1082
    .line 1083
    iget-object v6, v0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 1084
    .line 1085
    iget v7, v6, Landroid/graphics/RectF;->right:F

    .line 1086
    float-to-double v7, v7

    .line 1087
    .line 1088
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 1089
    .line 1090
    move-object/from16 v26, v1

    .line 1091
    float-to-double v0, v6

    .line 1092
    .line 1093
    move-wide/from16 v20, v0

    .line 1094
    float-to-double v0, v3

    .line 1095
    float-to-double v2, v2

    .line 1096
    .line 1097
    move-wide/from16 v22, v0

    .line 1098
    .line 1099
    move-wide/from16 v24, v2

    .line 1100
    .line 1101
    move-wide/from16 v16, v4

    .line 1102
    .line 1103
    move-wide/from16 v18, v7

    .line 1104
    .line 1105
    .line 1106
    invoke-static/range {v10 .. v26}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 1107
    return-void
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method private updatePathEffect()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/uimanager/style/BorderStyle;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getFullBorderWidth()F

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getPathEffect(Lcom/facebook/react/uimanager/style/BorderStyle;F)Landroid/graphics/PathEffect;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method private updatePathEffect(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/uimanager/style/BorderStyle;

    if-eqz v0, :cond_0

    int-to-float p1, p1

    .line 4
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getPathEffect(Lcom/facebook/react/uimanager/style/BorderStyle;F)Landroid/graphics/PathEffect;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePathEffect()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->hasRoundedBorders()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawRectangularBackgroundWithBorders(Landroid/graphics/Canvas;)V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->drawRoundedBackgroundWithBorders(Landroid/graphics/Canvas;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

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

.method public getBorderBoxPath()Landroid/graphics/Path;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->hasRoundedBorders()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePath()V

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
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

.method public getBorderBoxRect()Landroid/graphics/RectF;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getBorderColor(I)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 18
    move-result p1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_1
    const/high16 p1, 0x437f0000    # 255.0f

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->colorFromAlphaAndRGBComponents(FF)I

    .line 25
    move-result p1

    .line 26
    return p1
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

.method public getBorderRadius()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

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

.method public getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/uimanager/style/BorderStyle;

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

.method public getBorderWidth(I)Ljava/lang/Float;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    return-object v1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
.end method

.method public getBorderWidthOrDefaultTo(FI)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderWidth(I)Ljava/lang/Float;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    return p1

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 11
    move-result p1

    .line 12
    return p1
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

.method public getColor()I
    .locals 1
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mColor:I

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

.method public getDirectionAwareBorderInsets()Landroid/graphics/RectF;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v3}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v4}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v6}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 27
    move-result v0

    .line 28
    .line 29
    iget-object v6, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 30
    .line 31
    if-eqz v6, :cond_9

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getLayoutDirection()I

    .line 35
    move-result v6

    .line 36
    .line 37
    if-ne v6, v1, :cond_0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v4

    .line 40
    .line 41
    :goto_0
    iget-object v4, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 42
    const/4 v6, 0x4

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v6}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 46
    move-result v4

    .line 47
    .line 48
    iget-object v6, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 49
    const/4 v7, 0x5

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v7}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 53
    move-result v6

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 57
    move-result-object v7

    .line 58
    .line 59
    iget-object v8, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v8}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 63
    move-result v7

    .line 64
    .line 65
    if-eqz v7, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 69
    move-result v7

    .line 70
    .line 71
    if-eqz v7, :cond_1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v5, v4

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 77
    move-result v4

    .line 78
    .line 79
    if-eqz v4, :cond_2

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v0, v6

    .line 82
    .line 83
    :goto_2
    if-eqz v1, :cond_3

    .line 84
    move v4, v0

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move v4, v5

    .line 87
    .line 88
    :goto_3
    if-eqz v1, :cond_4

    .line 89
    move v0, v5

    .line 90
    :cond_4
    move v5, v4

    .line 91
    goto :goto_6

    .line 92
    .line 93
    :cond_5
    if-eqz v1, :cond_6

    .line 94
    move v7, v6

    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move v7, v4

    .line 97
    .line 98
    :goto_4
    if-eqz v1, :cond_7

    .line 99
    goto :goto_5

    .line 100
    :cond_7
    move v4, v6

    .line 101
    .line 102
    .line 103
    :goto_5
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 104
    move-result v1

    .line 105
    .line 106
    if-nez v1, :cond_8

    .line 107
    move v5, v7

    .line 108
    .line 109
    .line 110
    :cond_8
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 111
    move-result v1

    .line 112
    .line 113
    if-nez v1, :cond_9

    .line 114
    move v0, v4

    .line 115
    .line 116
    :cond_9
    :goto_6
    new-instance v1, Landroid/graphics/RectF;

    .line 117
    .line 118
    .line 119
    invoke-direct {v1, v5, v2, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 120
    return-object v1
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

.method public getFullBorderWidth()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
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

.method public getInnerBorderRadius(FF)F
    .locals 0

    .line 1
    sub-float/2addr p1, p2

    .line 2
    const/4 p2, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public getLayoutDirection()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mLayoutDirectionOverride:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 9
    move-result v0

    .line 10
    :cond_0
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOpacity()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mColor:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    shr-int/lit8 v0, v0, 0x8

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/16 v1, 0xff

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    const/4 v0, -0x3

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, -0x1

    .line 21
    return v0

    .line 22
    :cond_1
    const/4 v0, -0x2

    .line 23
    return v0
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

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->hasRoundedBorders()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePath()V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Landroid/graphics/Path;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 21
    return-void

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setRect(Landroid/graphics/Rect;)V

    .line 29
    return-void
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

.method public getPaddingBoxPath()Landroid/graphics/Path;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->hasRoundedBorders()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->updatePath()V

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
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

.method public getPaddingBoxRect()Landroid/graphics/RectF;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    const/4 v3, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 31
    return-object v0

    .line 32
    .line 33
    :cond_0
    new-instance v1, Landroid/graphics/RectF;

    .line 34
    .line 35
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 36
    .line 37
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 45
    move-result v4

    .line 46
    int-to-float v4, v4

    .line 47
    .line 48
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 49
    sub-float/2addr v4, v5

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 57
    move-result v5

    .line 58
    int-to-float v5, v5

    .line 59
    .line 60
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 61
    sub-float/2addr v5, v0

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 65
    return-object v1
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

.method public hasRoundedBorders()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;->hasRoundedBorders()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 4
    const/4 p1, 0x1

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 7
    return-void
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

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mAlpha:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    :cond_0
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
.end method

.method public setBackgroundImage(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBackgroundImageLayers:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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
.end method

.method public setBorderColor(ILjava/lang/Integer;)V
    .locals 3
    .param p2    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    move v1, v0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    const v2, 0xffffff

    .line 14
    and-int/2addr v1, v2

    .line 15
    int-to-float v1, v1

    .line 16
    .line 17
    :goto_0
    if-nez p2, :cond_1

    .line 18
    goto :goto_1

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    move-result p2

    .line 23
    .line 24
    ushr-int/lit8 p2, p2, 0x18

    .line 25
    int-to-float v0, p2

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-direct {p0, p1, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->setBorderRGB(IF)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->setBorderAlpha(IF)V

    .line 32
    const/4 p1, 0x1

    .line 33
    .line 34
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

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
.end method

.method public setBorderRadius(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V
    .locals 1
    .param p2    # Lcom/facebook/react/uimanager/LengthPercentage;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;->get(Lcom/facebook/react/uimanager/style/BorderRadiusProp;)Lcom/facebook/react/uimanager/LengthPercentage;

    move-result-object v0

    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;->set(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    return-void
.end method

.method public setBorderStyle(Lcom/facebook/react/uimanager/style/BorderStyle;)V
    .locals 1
    .param p1    # Lcom/facebook/react/uimanager/style/BorderStyle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/uimanager/style/BorderStyle;

    if-eq v0, p1, :cond_0

    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/uimanager/style/BorderStyle;

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/react/uimanager/style/BorderStyle;->valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/BorderStyle;

    move-result-object p1

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->setBorderStyle(Lcom/facebook/react/uimanager/style/BorderStyle;)V

    return-void
.end method

.method public setBorderWidth(IF)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/uimanager/Spacing;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/facebook/react/uimanager/Spacing;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/Spacing;->set(IF)Z

    .line 29
    const/4 p2, 0x1

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    if-eq p1, p2, :cond_1

    .line 34
    const/4 v0, 0x2

    .line 35
    .line 36
    if-eq p1, v0, :cond_1

    .line 37
    const/4 v0, 0x3

    .line 38
    .line 39
    if-eq p1, v0, :cond_1

    .line 40
    const/4 v0, 0x4

    .line 41
    .line 42
    if-eq p1, v0, :cond_1

    .line 43
    const/4 v0, 0x5

    .line 44
    .line 45
    if-eq p1, v0, :cond_1

    .line 46
    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    if-eq p1, v0, :cond_1

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_1
    iput-boolean p2, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 56
    :cond_2
    return-void
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
.end method

.method public setColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mColor:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
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
    .line 23
.end method

.method public setLayoutDirectionOverride(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mLayoutDirectionOverride:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mLayoutDirectionOverride:I

    .line 7
    :cond_0
    return-void
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

.method public setRadius(F)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "0.75.0"
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    invoke-virtual {p0, p1, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->setBorderRadius(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void

    .line 3
    :cond_1
    sget-object v0, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    new-instance v1, Lcom/facebook/react/uimanager/LengthPercentage;

    .line 4
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    sget-object v2, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v1, p1, v2}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->setBorderRadius(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public setRadius(FI)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "0.75.0"
    .end annotation

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->mBorderRadius:Lcom/facebook/react/uimanager/style/BorderRadiusStyle;

    invoke-static {}, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->values()[Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-virtual {p1, p2, v1}, Lcom/facebook/react/uimanager/style/BorderRadiusStyle;->set(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 9
    :cond_1
    invoke-static {}, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->values()[Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    move-result-object v0

    aget-object p2, v0, p2

    new-instance v0, Lcom/facebook/react/uimanager/LengthPercentage;

    .line 10
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    .line 11
    invoke-virtual {p0, p2, v0}, Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;->setBorderRadius(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method
