.class public Landroidx/constraintlayout/core/motion/MotionPaths;
.super Ljava/lang/Object;
.source "MotionPaths.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Landroidx/constraintlayout/core/motion/MotionPaths;",
        ">;"
    }
.end annotation


# static fields
.field public static final CARTESIAN:I = 0x0

.field public static final DEBUG:Z = false

.field static final OFF_HEIGHT:I = 0x4

.field static final OFF_PATH_ROTATE:I = 0x5

.field static final OFF_POSITION:I = 0x0

.field static final OFF_WIDTH:I = 0x3

.field static final OFF_X:I = 0x1

.field static final OFF_Y:I = 0x2

.field public static final OLD_WAY:Z = false

.field public static final PERPENDICULAR:I = 0x1

.field public static final SCREEN:I = 0x2

.field public static final TAG:Ljava/lang/String; = "MotionPaths"

.field static sNames:[Ljava/lang/String;


# instance fields
.field mAnimateCircleAngleTo:I

.field mAnimateRelativeTo:Ljava/lang/String;

.field mCustomAttributes:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/core/motion/CustomVariable;",
            ">;"
        }
    .end annotation
.end field

.field mDrawPath:I

.field mHeight:F

.field public mId:Ljava/lang/String;

.field mKeyFrameEasing:Landroidx/constraintlayout/core/motion/utils/Easing;

.field mMode:I

.field mPathMotionArc:I

.field mPathRotate:F

.field mPosition:F

.field mProgress:F

.field mRelativeAngle:F

.field mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

.field mTempDelta:[D

.field mTempValue:[D

.field mTime:F

.field mWidth:F

.field mX:F

.field mY:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-string v4, "height"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v5, "pathRotate"

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "position"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "x"

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "y"

    .line 15
    .line 16
    .line 17
    const-string/jumbo v3, "width"

    .line 18
    .line 19
    .line 20
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sput-object v0, Landroidx/constraintlayout/core/motion/MotionPaths;->sNames:[Ljava/lang/String;

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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 3
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathRotate:F

    .line 4
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mProgress:F

    const/4 v2, -0x1

    .line 5
    iput v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 7
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeAngle:F

    .line 8
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 9
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mCustomAttributes:Ljava/util/HashMap;

    .line 10
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mMode:I

    const/16 v0, 0x12

    .line 11
    new-array v1, v0, [D

    iput-object v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 12
    new-array v0, v0, [D

    iput-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempDelta:[D

    return-void
.end method

.method public constructor <init>(IILandroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 15
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathRotate:F

    .line 16
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mProgress:F

    const/4 v2, -0x1

    .line 17
    iput v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    const/4 v2, 0x0

    .line 18
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 19
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeAngle:F

    .line 20
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 21
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mCustomAttributes:Ljava/util/HashMap;

    .line 22
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mMode:I

    const/16 v0, 0x12

    .line 23
    new-array v1, v0, [D

    iput-object v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 24
    new-array v0, v0, [D

    iput-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempDelta:[D

    .line 25
    iget-object v0, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual/range {p0 .. p5}, Landroidx/constraintlayout/core/motion/MotionPaths;->initPolar(IILandroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V

    move-object p1, p0

    return-void

    :cond_0
    move-object v0, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p0

    .line 27
    iget v1, p4, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPositionType:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    .line 28
    invoke-virtual {p0, p4, p5, v0}, Landroidx/constraintlayout/core/motion/MotionPaths;->initCartesian(Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V

    return-void

    :cond_1
    move p2, p3

    move-object p3, p4

    move-object p4, p5

    move-object p5, v0

    .line 29
    invoke-virtual/range {p0 .. p5}, Landroidx/constraintlayout/core/motion/MotionPaths;->initScreen(IILandroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V

    move-object p1, p0

    return-void

    :cond_2
    move-object p1, p2

    move-object p3, p4

    move-object p4, p5

    move-object p5, v0

    .line 30
    invoke-virtual {p0, p3, p4, p5}, Landroidx/constraintlayout/core/motion/MotionPaths;->initPath(Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V

    return-void
.end method

.method private diff(FF)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sub-float/2addr p1, p2

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 20
    move-result p1

    .line 21
    .line 22
    .line 23
    const p2, 0x358637bd    # 1.0E-6f

    .line 24
    .line 25
    cmpl-float p1, p1, p2

    .line 26
    .line 27
    if-lez p1, :cond_1

    .line 28
    return v2

    .line 29
    :cond_1
    return v1

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    move-result p1

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    move-result p2

    .line 38
    .line 39
    if-eq p1, p2, :cond_3

    .line 40
    return v2

    .line 41
    :cond_3
    return v1
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private static xRotate(FFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p4, p2

    .line 2
    sub-float/2addr p5, p3

    .line 3
    mul-float/2addr p4, p1

    .line 4
    mul-float/2addr p5, p0

    .line 5
    sub-float/2addr p4, p5

    .line 6
    add-float/2addr p4, p2

    .line 7
    return p4
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
.end method

.method private static yRotate(FFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p4, p2

    .line 2
    sub-float/2addr p5, p3

    .line 3
    mul-float/2addr p4, p0

    .line 4
    mul-float/2addr p5, p1

    .line 5
    add-float/2addr p4, p5

    .line 6
    add-float/2addr p4, p3

    .line 7
    return p4
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
.end method


# virtual methods
.method public applyParameters(Landroidx/constraintlayout/core/motion/MotionWidget;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/constraintlayout/core/motion/MotionWidget;->mMotion:Landroidx/constraintlayout/core/motion/MotionWidget$Motion;

    .line 3
    .line 4
    iget-object v0, v0, Landroidx/constraintlayout/core/motion/MotionWidget$Motion;->mTransitionEasing:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroidx/constraintlayout/core/motion/utils/Easing;->getInterpolator(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mKeyFrameEasing:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 11
    .line 12
    iget-object v0, p1, Landroidx/constraintlayout/core/motion/MotionWidget;->mMotion:Landroidx/constraintlayout/core/motion/MotionWidget$Motion;

    .line 13
    .line 14
    iget v1, v0, Landroidx/constraintlayout/core/motion/MotionWidget$Motion;->mPathMotionArc:I

    .line 15
    .line 16
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    .line 17
    .line 18
    iget-object v1, v0, Landroidx/constraintlayout/core/motion/MotionWidget$Motion;->mAnimateRelativeTo:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 21
    .line 22
    iget v1, v0, Landroidx/constraintlayout/core/motion/MotionWidget$Motion;->mPathRotate:F

    .line 23
    .line 24
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathRotate:F

    .line 25
    .line 26
    iget v1, v0, Landroidx/constraintlayout/core/motion/MotionWidget$Motion;->mDrawPath:I

    .line 27
    .line 28
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    .line 29
    .line 30
    iget v0, v0, Landroidx/constraintlayout/core/motion/MotionWidget$Motion;->mAnimateCircleAngleTo:I

    .line 31
    .line 32
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateCircleAngleTo:I

    .line 33
    .line 34
    iget-object v0, p1, Landroidx/constraintlayout/core/motion/MotionWidget;->mPropertySet:Landroidx/constraintlayout/core/motion/MotionWidget$PropertySet;

    .line 35
    .line 36
    iget v0, v0, Landroidx/constraintlayout/core/motion/MotionWidget$PropertySet;->mProgress:F

    .line 37
    .line 38
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mProgress:F

    .line 39
    .line 40
    iget-object v0, p1, Landroidx/constraintlayout/core/motion/MotionWidget;->mWidgetFrame:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v0, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->widget:Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget v0, v0, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mCircleConstraintAngle:F

    .line 49
    .line 50
    iput v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeAngle:F

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/core/motion/MotionWidget;->getCustomAttributeNames()Ljava/util/Set;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/core/motion/MotionWidget;->getCustomAttribute(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Landroidx/constraintlayout/core/motion/CustomVariable;->isContinuous()Z

    .line 80
    move-result v3

    .line 81
    .line 82
    if-eqz v3, :cond_1

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mCustomAttributes:Ljava/util/HashMap;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    goto :goto_0

    .line 89
    :cond_2
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
.end method

.method public compareTo(Landroidx/constraintlayout/core/motion/MotionPaths;)I
    .locals 1

    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    iget p1, p1, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/constraintlayout/core/motion/MotionPaths;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/motion/MotionPaths;->compareTo(Landroidx/constraintlayout/core/motion/MotionPaths;)I

    move-result p1

    return p1
.end method

.method public configureRelativeTo(Landroidx/constraintlayout/core/motion/Motion;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mProgress:F

    .line 3
    float-to-double v0, v0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Landroidx/constraintlayout/core/motion/Motion;->getPos(D)[D

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
    .line 24
.end method

.method public different(Landroidx/constraintlayout/core/motion/MotionPaths;[Z[Ljava/lang/String;Z)V
    .locals 5

    .line 1
    .line 2
    iget p3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 3
    .line 4
    iget v0, p1, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p3, v0}, Landroidx/constraintlayout/core/motion/MotionPaths;->diff(FF)Z

    .line 8
    move-result p3

    .line 9
    .line 10
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 11
    .line 12
    iget v1, p1, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Landroidx/constraintlayout/core/motion/MotionPaths;->diff(FF)Z

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    aget-boolean v2, p2, v1

    .line 20
    .line 21
    iget v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 22
    .line 23
    iget v4, p1, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v3, v4}, Landroidx/constraintlayout/core/motion/MotionPaths;->diff(FF)Z

    .line 27
    move-result v3

    .line 28
    or-int/2addr v2, v3

    .line 29
    .line 30
    aput-boolean v2, p2, v1

    .line 31
    const/4 v2, 0x1

    .line 32
    .line 33
    aget-boolean v3, p2, v2

    .line 34
    .line 35
    if-nez p3, :cond_1

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    if-eqz p4, :cond_0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    move v4, v2

    .line 44
    :goto_1
    or-int/2addr v3, v4

    .line 45
    .line 46
    aput-boolean v3, p2, v2

    .line 47
    const/4 v3, 0x2

    .line 48
    .line 49
    aget-boolean v4, p2, v3

    .line 50
    .line 51
    if-nez p3, :cond_2

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    if-eqz p4, :cond_3

    .line 56
    :cond_2
    move v1, v2

    .line 57
    .line 58
    :cond_3
    or-int p3, v4, v1

    .line 59
    .line 60
    aput-boolean p3, p2, v3

    .line 61
    const/4 p3, 0x3

    .line 62
    .line 63
    aget-boolean p4, p2, p3

    .line 64
    .line 65
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 66
    .line 67
    iget v1, p1, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v0, v1}, Landroidx/constraintlayout/core/motion/MotionPaths;->diff(FF)Z

    .line 71
    move-result v0

    .line 72
    or-int/2addr p4, v0

    .line 73
    .line 74
    aput-boolean p4, p2, p3

    .line 75
    const/4 p3, 0x4

    .line 76
    .line 77
    aget-boolean p4, p2, p3

    .line 78
    .line 79
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 80
    .line 81
    iget p1, p1, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v0, p1}, Landroidx/constraintlayout/core/motion/MotionPaths;->diff(FF)Z

    .line 85
    move-result p1

    .line 86
    or-int/2addr p1, p4

    .line 87
    .line 88
    aput-boolean p1, p2, p3

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
.end method

.method public fillStandard([D[I)V
    .locals 9

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 3
    .line 4
    iget v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 5
    .line 6
    iget v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 7
    .line 8
    iget v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 9
    .line 10
    iget v4, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 11
    .line 12
    iget v5, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathRotate:F

    .line 13
    const/4 v6, 0x6

    .line 14
    .line 15
    new-array v7, v6, [F

    .line 16
    const/4 v8, 0x0

    .line 17
    .line 18
    aput v0, v7, v8

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    aput v1, v7, v0

    .line 22
    const/4 v1, 0x2

    .line 23
    .line 24
    aput v2, v7, v1

    .line 25
    const/4 v1, 0x3

    .line 26
    .line 27
    aput v3, v7, v1

    .line 28
    const/4 v1, 0x4

    .line 29
    .line 30
    aput v4, v7, v1

    .line 31
    const/4 v1, 0x5

    .line 32
    .line 33
    aput v5, v7, v1

    .line 34
    move v1, v8

    .line 35
    :goto_0
    array-length v2, p2

    .line 36
    .line 37
    if-ge v8, v2, :cond_1

    .line 38
    .line 39
    aget v2, p2, v8

    .line 40
    .line 41
    if-ge v2, v6, :cond_0

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x1

    .line 44
    .line 45
    aget v2, v7, v2

    .line 46
    float-to-double v4, v2

    .line 47
    .line 48
    aput-wide v4, p1, v1

    .line 49
    move v1, v3

    .line 50
    :cond_0
    add-int/2addr v8, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
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
.end method

.method public getBounds([I[D[FI)V
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 3
    .line 4
    iget v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    array-length v3, p1

    .line 7
    .line 8
    if-ge v2, v3, :cond_2

    .line 9
    .line 10
    aget-wide v3, p2, v2

    .line 11
    double-to-float v3, v3

    .line 12
    .line 13
    aget v4, p1, v2

    .line 14
    const/4 v5, 0x3

    .line 15
    .line 16
    if-eq v4, v5, :cond_1

    .line 17
    const/4 v5, 0x4

    .line 18
    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v3

    .line 24
    .line 25
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_2
    aput v0, p3, p4

    .line 29
    .line 30
    add-int/lit8 p4, p4, 0x1

    .line 31
    .line 32
    aput v1, p3, p4

    .line 33
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
.end method

.method public getCenter(D[I[D[FI)V
    .locals 14

    move-object/from16 v0, p3

    .line 1
    iget v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 2
    iget v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 3
    iget v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 4
    iget v4, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    const/4 v5, 0x0

    move v6, v5

    .line 5
    :goto_0
    array-length v7, v0

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-ge v6, v7, :cond_4

    .line 6
    aget-wide v10, p4, v6

    double-to-float v7, v10

    .line 7
    aget v10, v0, v6

    if-eq v10, v9, :cond_3

    if-eq v10, v8, :cond_2

    const/4 v8, 0x3

    if-eq v10, v8, :cond_1

    const/4 v8, 0x4

    if-eq v10, v8, :cond_0

    goto :goto_1

    :cond_0
    move v4, v7

    goto :goto_1

    :cond_1
    move v3, v7

    goto :goto_1

    :cond_2
    move v2, v7

    goto :goto_1

    :cond_3
    move v1, v7

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 8
    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    const/high16 v6, 0x40000000    # 2.0f

    if-eqz v0, :cond_5

    .line 9
    new-array v7, v8, [F

    .line 10
    new-array v8, v8, [F

    move-wide v10, p1

    .line 11
    invoke-virtual {v0, v10, v11, v7, v8}, Landroidx/constraintlayout/core/motion/Motion;->getCenter(D[F[F)V

    .line 12
    aget v0, v7, v5

    .line 13
    aget v5, v7, v9

    float-to-double v7, v0

    float-to-double v0, v1

    float-to-double v10, v2

    .line 14
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    mul-double/2addr v12, v0

    add-double/2addr v7, v12

    div-float v2, v3, v6

    float-to-double v12, v2

    sub-double/2addr v7, v12

    double-to-float v2, v7

    float-to-double v7, v5

    .line 15
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v0, v10

    sub-double/2addr v7, v0

    div-float v0, v4, v6

    float-to-double v0, v0

    sub-double/2addr v7, v0

    double-to-float v0, v7

    move v1, v2

    move v2, v0

    :cond_5
    div-float/2addr v3, v6

    add-float/2addr v1, v3

    const/4 v0, 0x0

    add-float/2addr v1, v0

    .line 16
    aput v1, p5, p6

    add-int/lit8 v1, p6, 0x1

    div-float/2addr v4, v6

    add-float/2addr v2, v4

    add-float/2addr v2, v0

    .line 17
    aput v2, p5, v1

    return-void
.end method

.method public getCenter(D[I[D[F[D[F)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 18
    iget v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 19
    iget v3, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 20
    iget v4, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 21
    iget v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 22
    :goto_0
    array-length v13, v1

    const/4 v15, 0x1

    if-ge v8, v13, :cond_4

    const/4 v13, 0x0

    const/16 v16, 0x0

    .line 23
    aget-wide v6, p4, v8

    double-to-float v6, v6

    move/from16 v17, v13

    .line 24
    aget-wide v13, p6, v8

    double-to-float v13, v13

    .line 25
    aget v14, v1, v8

    if-eq v14, v15, :cond_3

    const/4 v7, 0x2

    if-eq v14, v7, :cond_2

    const/4 v7, 0x3

    if-eq v14, v7, :cond_1

    const/4 v7, 0x4

    if-eq v14, v7, :cond_0

    goto :goto_1

    :cond_0
    move v5, v6

    move v12, v13

    goto :goto_1

    :cond_1
    move v4, v6

    move v10, v13

    goto :goto_1

    :cond_2
    move v3, v6

    move v11, v13

    goto :goto_1

    :cond_3
    move v2, v6

    move v9, v13

    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    const/16 v16, 0x0

    const/16 v17, 0x0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v10, v1

    add-float/2addr v10, v9

    div-float/2addr v12, v1

    add-float/2addr v12, v11

    .line 26
    iget-object v6, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    if-eqz v6, :cond_5

    const/4 v7, 0x2

    .line 27
    new-array v8, v7, [F

    .line 28
    new-array v7, v7, [F

    move-wide/from16 v12, p1

    .line 29
    invoke-virtual {v6, v12, v13, v8, v7}, Landroidx/constraintlayout/core/motion/Motion;->getCenter(D[F[F)V

    .line 30
    aget v6, v8, v16

    .line 31
    aget v8, v8, v15

    .line 32
    aget v10, v7, v16

    .line 33
    aget v7, v7, v15

    float-to-double v12, v6

    move/from16 p3, v1

    float-to-double v1, v2

    move-wide/from16 p1, v1

    float-to-double v0, v3

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double v2, v2, p1

    add-double/2addr v12, v2

    div-float v2, v4, p3

    float-to-double v2, v2

    sub-double/2addr v12, v2

    double-to-float v2, v12

    float-to-double v12, v8

    .line 35
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    mul-double v18, v18, p1

    sub-double v12, v12, v18

    div-float v3, v5, p3

    move-wide/from16 v18, v0

    float-to-double v0, v3

    sub-double/2addr v12, v0

    double-to-float v3, v12

    float-to-double v0, v10

    float-to-double v8, v9

    .line 36
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    mul-double/2addr v12, v8

    add-double/2addr v0, v12

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    float-to-double v10, v11

    mul-double/2addr v12, v10

    add-double/2addr v0, v12

    double-to-float v0, v0

    float-to-double v6, v7

    .line 37
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double/2addr v8, v12

    sub-double/2addr v6, v8

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    mul-double/2addr v8, v10

    add-double/2addr v6, v8

    double-to-float v12, v6

    move v10, v0

    goto :goto_2

    :cond_5
    move/from16 p3, v1

    :goto_2
    div-float v4, v4, p3

    add-float/2addr v2, v4

    add-float v2, v2, v17

    .line 38
    aput v2, p5, v16

    div-float v5, v5, p3

    add-float/2addr v3, v5

    add-float v3, v3, v17

    .line 39
    aput v3, p5, v15

    .line 40
    aput v10, p7, v16

    .line 41
    aput v12, p7, v15

    return-void
.end method

.method public getCenterVelocity(D[I[D[FI)V
    .locals 14

    .line 1
    .line 2
    move-object/from16 v0, p3

    .line 3
    .line 4
    iget v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 5
    .line 6
    iget v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 7
    .line 8
    iget v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 9
    .line 10
    iget v4, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 11
    const/4 v5, 0x0

    .line 12
    move v6, v5

    .line 13
    :goto_0
    array-length v7, v0

    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x1

    .line 16
    .line 17
    if-ge v6, v7, :cond_4

    .line 18
    .line 19
    aget-wide v10, p4, v6

    .line 20
    double-to-float v7, v10

    .line 21
    .line 22
    aget v10, v0, v6

    .line 23
    .line 24
    if-eq v10, v9, :cond_3

    .line 25
    .line 26
    if-eq v10, v8, :cond_2

    .line 27
    const/4 v8, 0x3

    .line 28
    .line 29
    if-eq v10, v8, :cond_1

    .line 30
    const/4 v8, 0x4

    .line 31
    .line 32
    if-eq v10, v8, :cond_0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v4, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v3, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v1, v7

    .line 41
    .line 42
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 46
    .line 47
    const/high16 v6, 0x40000000    # 2.0f

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    new-array v7, v8, [F

    .line 52
    .line 53
    new-array v8, v8, [F

    .line 54
    move-wide v10, p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v10, v11, v7, v8}, Landroidx/constraintlayout/core/motion/Motion;->getCenter(D[F[F)V

    .line 58
    .line 59
    aget v0, v7, v5

    .line 60
    .line 61
    aget v5, v7, v9

    .line 62
    float-to-double v7, v0

    .line 63
    float-to-double v0, v1

    .line 64
    float-to-double v10, v2

    .line 65
    .line 66
    .line 67
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 68
    move-result-wide v12

    .line 69
    mul-double/2addr v12, v0

    .line 70
    add-double/2addr v7, v12

    .line 71
    .line 72
    div-float v2, v3, v6

    .line 73
    float-to-double v12, v2

    .line 74
    sub-double/2addr v7, v12

    .line 75
    double-to-float v2, v7

    .line 76
    float-to-double v7, v5

    .line 77
    .line 78
    .line 79
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 80
    move-result-wide v10

    .line 81
    mul-double/2addr v0, v10

    .line 82
    sub-double/2addr v7, v0

    .line 83
    .line 84
    div-float v0, v4, v6

    .line 85
    float-to-double v0, v0

    .line 86
    sub-double/2addr v7, v0

    .line 87
    double-to-float v0, v7

    .line 88
    move v1, v2

    .line 89
    move v2, v0

    .line 90
    :cond_5
    div-float/2addr v3, v6

    .line 91
    add-float/2addr v1, v3

    .line 92
    const/4 v0, 0x0

    .line 93
    add-float/2addr v1, v0

    .line 94
    .line 95
    aput v1, p5, p6

    .line 96
    .line 97
    add-int/lit8 v1, p6, 0x1

    .line 98
    div-float/2addr v4, v6

    .line 99
    add-float/2addr v2, v4

    .line 100
    add-float/2addr v2, v0

    .line 101
    .line 102
    aput v2, p5, v1

    .line 103
    return-void
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
.end method

.method public getCustomData(Ljava/lang/String;[DI)I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mCustomAttributes:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    return v0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/core/motion/CustomVariable;->numberOfInterpolatedValues()I

    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/constraintlayout/core/motion/CustomVariable;->getValueToInterpolate()F

    .line 23
    move-result p1

    .line 24
    float-to-double v0, p1

    .line 25
    .line 26
    aput-wide v0, p2, p3

    .line 27
    return v2

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1}, Landroidx/constraintlayout/core/motion/CustomVariable;->numberOfInterpolatedValues()I

    .line 31
    move-result v1

    .line 32
    .line 33
    new-array v2, v1, [F

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2}, Landroidx/constraintlayout/core/motion/CustomVariable;->getValuesToInterpolate([F)V

    .line 37
    .line 38
    :goto_0
    if-ge v0, v1, :cond_2

    .line 39
    .line 40
    add-int/lit8 p1, p3, 0x1

    .line 41
    .line 42
    aget v3, v2, v0

    .line 43
    float-to-double v3, v3

    .line 44
    .line 45
    aput-wide v3, p2, p3

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    move p3, p1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return v1
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
.end method

.method public getCustomDataCount(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mCustomAttributes:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/core/motion/CustomVariable;->numberOfInterpolatedValues()I

    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getRect([I[D[FI)V
    .locals 10

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 3
    .line 4
    iget v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 5
    .line 6
    iget v2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 7
    .line 8
    iget v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    array-length v5, p1

    .line 11
    .line 12
    if-ge v4, v5, :cond_4

    .line 13
    .line 14
    aget-wide v5, p2, v4

    .line 15
    double-to-float v5, v5

    .line 16
    .line 17
    aget v6, p1, v4

    .line 18
    const/4 v7, 0x1

    .line 19
    .line 20
    if-eq v6, v7, :cond_3

    .line 21
    const/4 v7, 0x2

    .line 22
    .line 23
    if-eq v6, v7, :cond_2

    .line 24
    const/4 v7, 0x3

    .line 25
    .line 26
    if-eq v6, v7, :cond_1

    .line 27
    const/4 v7, 0x4

    .line 28
    .line 29
    if-eq v6, v7, :cond_0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v3, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v5

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v1, v5

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    move v0, v5

    .line 38
    .line 39
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_4
    iget-object p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/constraintlayout/core/motion/Motion;->getCenterX()F

    .line 48
    move-result p1

    .line 49
    .line 50
    iget-object p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Landroidx/constraintlayout/core/motion/Motion;->getCenterY()F

    .line 54
    move-result p2

    .line 55
    float-to-double v4, p1

    .line 56
    float-to-double v6, v0

    .line 57
    float-to-double v0, v1

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 61
    move-result-wide v8

    .line 62
    mul-double/2addr v8, v6

    .line 63
    add-double/2addr v4, v8

    .line 64
    .line 65
    const/high16 p1, 0x40000000    # 2.0f

    .line 66
    .line 67
    div-float v8, v2, p1

    .line 68
    float-to-double v8, v8

    .line 69
    sub-double/2addr v4, v8

    .line 70
    double-to-float v4, v4

    .line 71
    float-to-double v8, p2

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 75
    move-result-wide v0

    .line 76
    mul-double/2addr v6, v0

    .line 77
    sub-double/2addr v8, v6

    .line 78
    .line 79
    div-float p1, v3, p1

    .line 80
    float-to-double p1, p1

    .line 81
    sub-double/2addr v8, p1

    .line 82
    double-to-float v1, v8

    .line 83
    move v0, v4

    .line 84
    :cond_5
    add-float/2addr v2, v0

    .line 85
    add-float/2addr v3, v1

    .line 86
    .line 87
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 94
    const/4 p1, 0x0

    .line 95
    .line 96
    add-float p2, v0, p1

    .line 97
    .line 98
    add-float v4, v1, p1

    .line 99
    .line 100
    add-float v5, v2, p1

    .line 101
    add-float/2addr v1, p1

    .line 102
    add-float/2addr v2, p1

    .line 103
    .line 104
    add-float v6, v3, p1

    .line 105
    add-float/2addr v0, p1

    .line 106
    add-float/2addr v3, p1

    .line 107
    .line 108
    add-int/lit8 p1, p4, 0x1

    .line 109
    .line 110
    aput p2, p3, p4

    .line 111
    .line 112
    add-int/lit8 p2, p4, 0x2

    .line 113
    .line 114
    aput v4, p3, p1

    .line 115
    .line 116
    add-int/lit8 p1, p4, 0x3

    .line 117
    .line 118
    aput v5, p3, p2

    .line 119
    .line 120
    add-int/lit8 p2, p4, 0x4

    .line 121
    .line 122
    aput v1, p3, p1

    .line 123
    .line 124
    add-int/lit8 p1, p4, 0x5

    .line 125
    .line 126
    aput v2, p3, p2

    .line 127
    .line 128
    add-int/lit8 p2, p4, 0x6

    .line 129
    .line 130
    aput v6, p3, p1

    .line 131
    .line 132
    add-int/lit8 p4, p4, 0x7

    .line 133
    .line 134
    aput v0, p3, p2

    .line 135
    .line 136
    aput v3, p3, p4

    .line 137
    return-void
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
.end method

.method public hasCustomData(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mCustomAttributes:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

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
.end method

.method public initCartesian(Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V
    .locals 19

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
    move-object/from16 v3, p3

    .line 9
    .line 10
    iget v4, v1, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 11
    int-to-float v4, v4

    .line 12
    .line 13
    const/high16 v5, 0x42c80000    # 100.0f

    .line 14
    div-float/2addr v4, v5

    .line 15
    .line 16
    iput v4, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 17
    .line 18
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mDrawPath:I

    .line 19
    .line 20
    iput v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    .line 21
    .line 22
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 23
    .line 24
    .line 25
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 26
    move-result v5

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    move v5, v4

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 33
    .line 34
    :goto_0
    iget v6, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 35
    .line 36
    .line 37
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 38
    move-result v6

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    move v6, v4

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_1
    iget v6, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 45
    .line 46
    :goto_1
    iget v7, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 47
    .line 48
    iget v8, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 49
    .line 50
    sub-float v9, v7, v8

    .line 51
    .line 52
    iget v10, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 53
    .line 54
    iget v11, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 55
    .line 56
    sub-float v12, v10, v11

    .line 57
    .line 58
    iget v13, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 59
    .line 60
    iput v13, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 61
    .line 62
    iget v13, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 63
    .line 64
    const/high16 v14, 0x40000000    # 2.0f

    .line 65
    .line 66
    div-float v15, v8, v14

    .line 67
    add-float/2addr v15, v13

    .line 68
    .line 69
    move/from16 v16, v14

    .line 70
    .line 71
    iget v14, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 72
    .line 73
    div-float v17, v11, v16

    .line 74
    .line 75
    add-float v17, v14, v17

    .line 76
    .line 77
    move/from16 v18, v4

    .line 78
    .line 79
    iget v4, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 80
    .line 81
    div-float v7, v7, v16

    .line 82
    add-float/2addr v4, v7

    .line 83
    .line 84
    iget v3, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 85
    .line 86
    div-float v10, v10, v16

    .line 87
    add-float/2addr v3, v10

    .line 88
    sub-float/2addr v4, v15

    .line 89
    .line 90
    sub-float v3, v3, v17

    .line 91
    .line 92
    mul-float v7, v4, v18

    .line 93
    add-float/2addr v13, v7

    .line 94
    mul-float/2addr v9, v5

    .line 95
    .line 96
    div-float v5, v9, v16

    .line 97
    sub-float/2addr v13, v5

    .line 98
    float-to-int v7, v13

    .line 99
    int-to-float v7, v7

    .line 100
    .line 101
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 102
    .line 103
    mul-float v7, v3, v18

    .line 104
    add-float/2addr v14, v7

    .line 105
    mul-float/2addr v12, v6

    .line 106
    .line 107
    div-float v6, v12, v16

    .line 108
    sub-float/2addr v14, v6

    .line 109
    float-to-int v7, v14

    .line 110
    int-to-float v7, v7

    .line 111
    .line 112
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 113
    add-float/2addr v8, v9

    .line 114
    float-to-int v7, v8

    .line 115
    int-to-float v7, v7

    .line 116
    .line 117
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 118
    add-float/2addr v11, v12

    .line 119
    float-to-int v7, v11

    .line 120
    int-to-float v7, v7

    .line 121
    .line 122
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 123
    .line 124
    iget v7, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 125
    .line 126
    .line 127
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 128
    move-result v7

    .line 129
    .line 130
    if-eqz v7, :cond_2

    .line 131
    .line 132
    move/from16 v7, v18

    .line 133
    goto :goto_2

    .line 134
    .line 135
    :cond_2
    iget v7, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 136
    .line 137
    :goto_2
    iget v8, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mAltPercentY:F

    .line 138
    .line 139
    .line 140
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 141
    move-result v8

    .line 142
    const/4 v9, 0x0

    .line 143
    .line 144
    if-eqz v8, :cond_3

    .line 145
    move v8, v9

    .line 146
    goto :goto_3

    .line 147
    .line 148
    :cond_3
    iget v8, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mAltPercentY:F

    .line 149
    .line 150
    :goto_3
    iget v10, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 151
    .line 152
    .line 153
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 154
    move-result v10

    .line 155
    .line 156
    if-eqz v10, :cond_4

    .line 157
    goto :goto_4

    .line 158
    .line 159
    :cond_4
    iget v10, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 160
    .line 161
    move/from16 v18, v10

    .line 162
    .line 163
    :goto_4
    iget v10, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mAltPercentX:F

    .line 164
    .line 165
    .line 166
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 167
    move-result v10

    .line 168
    .line 169
    if-eqz v10, :cond_5

    .line 170
    goto :goto_5

    .line 171
    .line 172
    :cond_5
    iget v9, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mAltPercentX:F

    .line 173
    :goto_5
    const/4 v10, 0x0

    .line 174
    .line 175
    iput v10, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mMode:I

    .line 176
    .line 177
    iget v10, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 178
    mul-float/2addr v7, v4

    .line 179
    add-float/2addr v10, v7

    .line 180
    mul-float/2addr v9, v3

    .line 181
    add-float/2addr v10, v9

    .line 182
    sub-float/2addr v10, v5

    .line 183
    float-to-int v5, v10

    .line 184
    int-to-float v5, v5

    .line 185
    .line 186
    iput v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 187
    .line 188
    iget v2, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 189
    mul-float/2addr v4, v8

    .line 190
    add-float/2addr v2, v4

    .line 191
    .line 192
    mul-float v3, v3, v18

    .line 193
    add-float/2addr v2, v3

    .line 194
    sub-float/2addr v2, v6

    .line 195
    float-to-int v2, v2

    .line 196
    int-to-float v2, v2

    .line 197
    .line 198
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 199
    .line 200
    iget-object v2, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mTransitionEasing:Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    invoke-static {v2}, Landroidx/constraintlayout/core/motion/utils/Easing;->getInterpolator(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 204
    move-result-object v2

    .line 205
    .line 206
    iput-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mKeyFrameEasing:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 207
    .line 208
    iget v1, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPathMotionArc:I

    .line 209
    .line 210
    iput v1, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    .line 211
    return-void
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
.end method

.method public initPath(Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V
    .locals 18

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
    move-object/from16 v3, p3

    .line 9
    .line 10
    iget v4, v1, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 11
    int-to-float v4, v4

    .line 12
    .line 13
    const/high16 v5, 0x42c80000    # 100.0f

    .line 14
    div-float/2addr v4, v5

    .line 15
    .line 16
    iput v4, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 17
    .line 18
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mDrawPath:I

    .line 19
    .line 20
    iput v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    .line 21
    .line 22
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 23
    .line 24
    .line 25
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 26
    move-result v5

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    move v5, v4

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 33
    .line 34
    :goto_0
    iget v6, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 35
    .line 36
    .line 37
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 38
    move-result v6

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    move v6, v4

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_1
    iget v6, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 45
    .line 46
    :goto_1
    iget v7, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 47
    .line 48
    iget v8, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 49
    sub-float/2addr v7, v8

    .line 50
    .line 51
    iget v8, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 52
    .line 53
    iget v9, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 54
    sub-float/2addr v8, v9

    .line 55
    .line 56
    iget v9, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 57
    .line 58
    iput v9, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 59
    .line 60
    iget v9, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 61
    .line 62
    .line 63
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 64
    move-result v9

    .line 65
    .line 66
    if-eqz v9, :cond_2

    .line 67
    goto :goto_2

    .line 68
    .line 69
    :cond_2
    iget v4, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 70
    .line 71
    :goto_2
    iget v9, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 72
    .line 73
    iget v10, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 74
    .line 75
    const/high16 v11, 0x40000000    # 2.0f

    .line 76
    .line 77
    div-float v12, v10, v11

    .line 78
    add-float/2addr v12, v9

    .line 79
    .line 80
    iget v13, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 81
    .line 82
    iget v14, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 83
    .line 84
    div-float v15, v14, v11

    .line 85
    add-float/2addr v15, v13

    .line 86
    .line 87
    move/from16 v16, v11

    .line 88
    .line 89
    iget v11, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 90
    .line 91
    move/from16 v17, v4

    .line 92
    .line 93
    iget v4, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 94
    .line 95
    div-float v4, v4, v16

    .line 96
    add-float/2addr v11, v4

    .line 97
    .line 98
    iget v4, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 99
    .line 100
    iget v3, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 101
    .line 102
    div-float v3, v3, v16

    .line 103
    add-float/2addr v4, v3

    .line 104
    sub-float/2addr v11, v12

    .line 105
    sub-float/2addr v4, v15

    .line 106
    .line 107
    mul-float v3, v11, v17

    .line 108
    add-float/2addr v9, v3

    .line 109
    mul-float/2addr v7, v5

    .line 110
    .line 111
    div-float v5, v7, v16

    .line 112
    sub-float/2addr v9, v5

    .line 113
    float-to-int v9, v9

    .line 114
    int-to-float v9, v9

    .line 115
    .line 116
    iput v9, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 117
    .line 118
    mul-float v9, v4, v17

    .line 119
    add-float/2addr v13, v9

    .line 120
    mul-float/2addr v8, v6

    .line 121
    .line 122
    div-float v6, v8, v16

    .line 123
    sub-float/2addr v13, v6

    .line 124
    float-to-int v12, v13

    .line 125
    int-to-float v12, v12

    .line 126
    .line 127
    iput v12, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 128
    add-float/2addr v10, v7

    .line 129
    float-to-int v7, v10

    .line 130
    int-to-float v7, v7

    .line 131
    .line 132
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 133
    add-float/2addr v14, v8

    .line 134
    float-to-int v7, v14

    .line 135
    int-to-float v7, v7

    .line 136
    .line 137
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 138
    .line 139
    iget v7, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 140
    .line 141
    .line 142
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 143
    move-result v7

    .line 144
    .line 145
    if-eqz v7, :cond_3

    .line 146
    const/4 v7, 0x0

    .line 147
    goto :goto_3

    .line 148
    .line 149
    :cond_3
    iget v7, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 150
    :goto_3
    neg-float v4, v4

    .line 151
    mul-float/2addr v4, v7

    .line 152
    mul-float/2addr v11, v7

    .line 153
    const/4 v7, 0x1

    .line 154
    .line 155
    iput v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mMode:I

    .line 156
    .line 157
    iget v7, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 158
    add-float/2addr v7, v3

    .line 159
    sub-float/2addr v7, v5

    .line 160
    float-to-int v3, v7

    .line 161
    int-to-float v3, v3

    .line 162
    .line 163
    iget v2, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 164
    add-float/2addr v2, v9

    .line 165
    sub-float/2addr v2, v6

    .line 166
    float-to-int v2, v2

    .line 167
    int-to-float v2, v2

    .line 168
    add-float/2addr v3, v4

    .line 169
    .line 170
    iput v3, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 171
    add-float/2addr v2, v11

    .line 172
    .line 173
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 174
    .line 175
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 176
    .line 177
    iput-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v2, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mTransitionEasing:Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-static {v2}, Landroidx/constraintlayout/core/motion/utils/Easing;->getInterpolator(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 183
    move-result-object v2

    .line 184
    .line 185
    iput-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mKeyFrameEasing:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 186
    .line 187
    iget v1, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPathMotionArc:I

    .line 188
    .line 189
    iput v1, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    .line 190
    return-void
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
.end method

.method public initPolar(IILandroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V
    .locals 6

    .line 1
    .line 2
    iget p1, p3, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    const/high16 p2, 0x42c80000    # 100.0f

    .line 6
    div-float/2addr p1, p2

    .line 7
    .line 8
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 9
    .line 10
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mDrawPath:I

    .line 11
    .line 12
    iput p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    .line 13
    .line 14
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPositionType:I

    .line 15
    .line 16
    iput p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mMode:I

    .line 17
    .line 18
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 22
    move-result p2

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    move p2, p1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 29
    .line 30
    :goto_0
    iget v0, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    move v0, p1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_1
    iget v0, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 41
    .line 42
    :goto_1
    iget v1, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 43
    .line 44
    iget v2, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 45
    sub-float/2addr v1, v2

    .line 46
    .line 47
    iget v3, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 48
    .line 49
    iget v4, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 50
    sub-float/2addr v3, v4

    .line 51
    .line 52
    iget v5, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 53
    .line 54
    iput v5, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 55
    mul-float/2addr v1, p2

    .line 56
    add-float/2addr v2, v1

    .line 57
    float-to-int v1, v2

    .line 58
    int-to-float v1, v1

    .line 59
    .line 60
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 61
    mul-float/2addr v3, v0

    .line 62
    add-float/2addr v4, v3

    .line 63
    float-to-int v1, v4

    .line 64
    int-to-float v1, v1

    .line 65
    .line 66
    iput v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 67
    .line 68
    iget v1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPositionType:I

    .line 69
    const/4 v2, 0x1

    .line 70
    .line 71
    if-eq v1, v2, :cond_7

    .line 72
    const/4 v2, 0x2

    .line 73
    .line 74
    if-eq v1, v2, :cond_4

    .line 75
    .line 76
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 77
    .line 78
    .line 79
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 80
    move-result p2

    .line 81
    .line 82
    if-eqz p2, :cond_2

    .line 83
    move p2, p1

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_2
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 87
    .line 88
    :goto_2
    iget v0, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 89
    .line 90
    iget v1, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 91
    sub-float/2addr v0, v1

    .line 92
    mul-float/2addr p2, v0

    .line 93
    add-float/2addr p2, v1

    .line 94
    .line 95
    iput p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 96
    .line 97
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 101
    move-result p2

    .line 102
    .line 103
    if-eqz p2, :cond_3

    .line 104
    goto :goto_3

    .line 105
    .line 106
    :cond_3
    iget p1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 107
    .line 108
    :goto_3
    iget p2, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 109
    .line 110
    iget p5, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 111
    sub-float/2addr p2, p5

    .line 112
    mul-float/2addr p1, p2

    .line 113
    add-float/2addr p1, p5

    .line 114
    .line 115
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 116
    goto :goto_8

    .line 117
    .line 118
    :cond_4
    iget v1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 122
    move-result v1

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    iget p2, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 127
    .line 128
    iget v0, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 129
    sub-float/2addr p2, v0

    .line 130
    mul-float/2addr p2, p1

    .line 131
    add-float/2addr p2, v0

    .line 132
    goto :goto_4

    .line 133
    .line 134
    :cond_5
    iget v1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 135
    .line 136
    .line 137
    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    .line 138
    move-result p2

    .line 139
    mul-float/2addr p2, v1

    .line 140
    .line 141
    :goto_4
    iput p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 142
    .line 143
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 144
    .line 145
    .line 146
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 147
    move-result p2

    .line 148
    .line 149
    if-eqz p2, :cond_6

    .line 150
    .line 151
    iget p2, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 152
    .line 153
    iget p5, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 154
    sub-float/2addr p2, p5

    .line 155
    mul-float/2addr p1, p2

    .line 156
    add-float/2addr p1, p5

    .line 157
    goto :goto_5

    .line 158
    .line 159
    :cond_6
    iget p1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 160
    .line 161
    :goto_5
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 162
    goto :goto_8

    .line 163
    .line 164
    :cond_7
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 165
    .line 166
    .line 167
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 168
    move-result p2

    .line 169
    .line 170
    if-eqz p2, :cond_8

    .line 171
    move p2, p1

    .line 172
    goto :goto_6

    .line 173
    .line 174
    :cond_8
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 175
    .line 176
    :goto_6
    iget v0, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 177
    .line 178
    iget v1, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 179
    sub-float/2addr v0, v1

    .line 180
    mul-float/2addr p2, v0

    .line 181
    add-float/2addr p2, v1

    .line 182
    .line 183
    iput p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 184
    .line 185
    iget p2, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 186
    .line 187
    .line 188
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 189
    move-result p2

    .line 190
    .line 191
    if-eqz p2, :cond_9

    .line 192
    goto :goto_7

    .line 193
    .line 194
    :cond_9
    iget p1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 195
    .line 196
    :goto_7
    iget p2, p5, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 197
    .line 198
    iget p5, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 199
    sub-float/2addr p2, p5

    .line 200
    mul-float/2addr p1, p2

    .line 201
    add-float/2addr p1, p5

    .line 202
    .line 203
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 204
    .line 205
    :goto_8
    iget-object p1, p4, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 206
    .line 207
    iput-object p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 208
    .line 209
    iget-object p1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mTransitionEasing:Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    invoke-static {p1}, Landroidx/constraintlayout/core/motion/utils/Easing;->getInterpolator(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 213
    move-result-object p1

    .line 214
    .line 215
    iput-object p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mKeyFrameEasing:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 216
    .line 217
    iget p1, p3, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPathMotionArc:I

    .line 218
    .line 219
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    .line 220
    return-void
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
.end method

.method public initScreen(IILandroidx/constraintlayout/core/motion/key/MotionKeyPosition;Landroidx/constraintlayout/core/motion/MotionPaths;Landroidx/constraintlayout/core/motion/MotionPaths;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    move-object/from16 v2, p4

    .line 7
    .line 8
    move-object/from16 v3, p5

    .line 9
    .line 10
    iget v4, v1, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 11
    int-to-float v4, v4

    .line 12
    .line 13
    const/high16 v5, 0x42c80000    # 100.0f

    .line 14
    div-float/2addr v4, v5

    .line 15
    .line 16
    iput v4, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 17
    .line 18
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mDrawPath:I

    .line 19
    .line 20
    iput v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mDrawPath:I

    .line 21
    .line 22
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 23
    .line 24
    .line 25
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 26
    move-result v5

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    move v5, v4

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget v5, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentWidth:F

    .line 33
    .line 34
    :goto_0
    iget v6, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 35
    .line 36
    .line 37
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 38
    move-result v6

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    move v6, v4

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_1
    iget v6, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentHeight:F

    .line 45
    .line 46
    :goto_1
    iget v7, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 47
    .line 48
    iget v8, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 49
    .line 50
    sub-float v9, v7, v8

    .line 51
    .line 52
    iget v10, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 53
    .line 54
    iget v11, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 55
    .line 56
    sub-float v12, v10, v11

    .line 57
    .line 58
    iget v13, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTime:F

    .line 59
    .line 60
    iput v13, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPosition:F

    .line 61
    .line 62
    iget v13, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 63
    .line 64
    const/high16 v14, 0x40000000    # 2.0f

    .line 65
    .line 66
    div-float v15, v8, v14

    .line 67
    add-float/2addr v15, v13

    .line 68
    .line 69
    iget v2, v2, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 70
    .line 71
    div-float v16, v11, v14

    .line 72
    .line 73
    add-float v16, v2, v16

    .line 74
    .line 75
    move/from16 v17, v14

    .line 76
    .line 77
    iget v14, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 78
    .line 79
    div-float v7, v7, v17

    .line 80
    add-float/2addr v14, v7

    .line 81
    .line 82
    iget v3, v3, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 83
    .line 84
    div-float v10, v10, v17

    .line 85
    add-float/2addr v3, v10

    .line 86
    sub-float/2addr v14, v15

    .line 87
    .line 88
    sub-float v3, v3, v16

    .line 89
    mul-float/2addr v14, v4

    .line 90
    add-float/2addr v13, v14

    .line 91
    mul-float/2addr v9, v5

    .line 92
    .line 93
    div-float v5, v9, v17

    .line 94
    sub-float/2addr v13, v5

    .line 95
    float-to-int v5, v13

    .line 96
    int-to-float v5, v5

    .line 97
    .line 98
    iput v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 99
    mul-float/2addr v3, v4

    .line 100
    add-float/2addr v2, v3

    .line 101
    mul-float/2addr v12, v6

    .line 102
    .line 103
    div-float v3, v12, v17

    .line 104
    sub-float/2addr v2, v3

    .line 105
    float-to-int v2, v2

    .line 106
    int-to-float v2, v2

    .line 107
    .line 108
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 109
    add-float/2addr v8, v9

    .line 110
    float-to-int v2, v8

    .line 111
    int-to-float v2, v2

    .line 112
    .line 113
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 114
    add-float/2addr v11, v12

    .line 115
    float-to-int v2, v11

    .line 116
    int-to-float v2, v2

    .line 117
    .line 118
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 119
    const/4 v2, 0x2

    .line 120
    .line 121
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mMode:I

    .line 122
    .line 123
    iget v2, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 124
    .line 125
    .line 126
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 127
    move-result v2

    .line 128
    .line 129
    if-nez v2, :cond_2

    .line 130
    .line 131
    iget v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 132
    float-to-int v2, v2

    .line 133
    .line 134
    sub-int v2, p1, v2

    .line 135
    .line 136
    iget v3, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentX:F

    .line 137
    int-to-float v2, v2

    .line 138
    mul-float/2addr v3, v2

    .line 139
    float-to-int v2, v3

    .line 140
    int-to-float v2, v2

    .line 141
    .line 142
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 143
    .line 144
    :cond_2
    iget v2, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 148
    move-result v2

    .line 149
    .line 150
    if-nez v2, :cond_3

    .line 151
    .line 152
    iget v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 153
    float-to-int v2, v2

    .line 154
    .line 155
    sub-int v2, p2, v2

    .line 156
    .line 157
    iget v3, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPercentY:F

    .line 158
    int-to-float v2, v2

    .line 159
    mul-float/2addr v3, v2

    .line 160
    float-to-int v2, v3

    .line 161
    int-to-float v2, v2

    .line 162
    .line 163
    iput v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 164
    .line 165
    :cond_3
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 166
    .line 167
    iput-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mAnimateRelativeTo:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v2, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mTransitionEasing:Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-static {v2}, Landroidx/constraintlayout/core/motion/utils/Easing;->getInterpolator(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    iput-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mKeyFrameEasing:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 176
    .line 177
    iget v1, v1, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;->mPathMotionArc:I

    .line 178
    .line 179
    iput v1, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mPathMotionArc:I

    .line 180
    return-void
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
.end method

.method public setBounds(FFFF)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 3
    .line 4
    iput p2, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 5
    .line 6
    iput p3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 7
    .line 8
    iput p4, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

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
    .line 215
    .line 216
    .line 217
.end method

.method public setDpDt(FF[F[I[D[D)V
    .locals 12

    .line 1
    .line 2
    move-object/from16 v0, p4

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v4, v1

    .line 6
    move v5, v4

    .line 7
    move v6, v5

    .line 8
    move v7, v6

    .line 9
    move v3, v2

    .line 10
    :goto_0
    array-length v8, v0

    .line 11
    const/4 v9, 0x1

    .line 12
    .line 13
    if-ge v3, v8, :cond_4

    .line 14
    .line 15
    aget-wide v10, p5, v3

    .line 16
    double-to-float v8, v10

    .line 17
    .line 18
    aget v10, v0, v3

    .line 19
    .line 20
    if-eq v10, v9, :cond_3

    .line 21
    const/4 v9, 0x2

    .line 22
    .line 23
    if-eq v10, v9, :cond_2

    .line 24
    const/4 v9, 0x3

    .line 25
    .line 26
    if-eq v10, v9, :cond_1

    .line 27
    const/4 v9, 0x4

    .line 28
    .line 29
    if-eq v10, v9, :cond_0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v7, v8

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v8

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v6, v8

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    move v4, v8

    .line 38
    .line 39
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_4
    mul-float v0, v1, v5

    .line 43
    .line 44
    const/high16 v3, 0x40000000    # 2.0f

    .line 45
    div-float/2addr v0, v3

    .line 46
    sub-float/2addr v4, v0

    .line 47
    .line 48
    mul-float v0, v1, v7

    .line 49
    div-float/2addr v0, v3

    .line 50
    sub-float/2addr v6, v0

    .line 51
    .line 52
    const/high16 v0, 0x3f800000    # 1.0f

    .line 53
    mul-float/2addr v5, v0

    .line 54
    mul-float/2addr v7, v0

    .line 55
    add-float/2addr v5, v4

    .line 56
    add-float/2addr v7, v6

    .line 57
    .line 58
    sub-float v3, v0, p1

    .line 59
    mul-float/2addr v4, v3

    .line 60
    mul-float/2addr v5, p1

    .line 61
    add-float/2addr v4, v5

    .line 62
    add-float/2addr v4, v1

    .line 63
    .line 64
    aput v4, p3, v2

    .line 65
    sub-float/2addr v0, p2

    .line 66
    mul-float/2addr v6, v0

    .line 67
    mul-float/2addr v7, p2

    .line 68
    add-float/2addr v6, v7

    .line 69
    add-float/2addr v6, v1

    .line 70
    .line 71
    aput v6, p3, v9

    .line 72
    return-void
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
.end method

.method public setView(FLandroidx/constraintlayout/core/motion/MotionWidget;[I[D[D[D)V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    iget v4, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 9
    .line 10
    iget v5, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 11
    .line 12
    iget v6, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 13
    .line 14
    iget v7, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 15
    array-length v8, v2

    .line 16
    const/4 v9, 0x1

    .line 17
    .line 18
    if-eqz v8, :cond_0

    .line 19
    .line 20
    iget-object v8, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 21
    array-length v8, v8

    .line 22
    array-length v10, v2

    .line 23
    sub-int/2addr v10, v9

    .line 24
    .line 25
    aget v10, v2, v10

    .line 26
    .line 27
    if-gt v8, v10, :cond_0

    .line 28
    array-length v8, v2

    .line 29
    sub-int/2addr v8, v9

    .line 30
    .line 31
    aget v8, v2, v8

    .line 32
    add-int/2addr v8, v9

    .line 33
    .line 34
    new-array v10, v8, [D

    .line 35
    .line 36
    iput-object v10, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 37
    .line 38
    new-array v8, v8, [D

    .line 39
    .line 40
    iput-object v8, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempDelta:[D

    .line 41
    .line 42
    :cond_0
    iget-object v8, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 43
    .line 44
    const-wide/high16 v10, 0x7ff8000000000000L    # Double.NaN

    .line 45
    .line 46
    .line 47
    invoke-static {v8, v10, v11}, Ljava/util/Arrays;->fill([DD)V

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_0
    array-length v11, v2

    .line 50
    .line 51
    if-ge v10, v11, :cond_1

    .line 52
    .line 53
    iget-object v11, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 54
    .line 55
    aget v12, v2, v10

    .line 56
    .line 57
    aget-wide v13, p4, v10

    .line 58
    .line 59
    aput-wide v13, v11, v12

    .line 60
    .line 61
    iget-object v11, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempDelta:[D

    .line 62
    .line 63
    aget-wide v13, p5, v10

    .line 64
    .line 65
    aput-wide v13, v11, v12

    .line 66
    .line 67
    add-int/lit8 v10, v10, 0x1

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_1
    const/high16 v10, 0x7fc00000    # Float.NaN

    .line 71
    .line 72
    const/16 p3, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    const/4 v13, 0x0

    .line 76
    const/4 v14, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    .line 79
    :goto_1
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 80
    .line 81
    const/16 v16, 0x0

    .line 82
    array-length v8, v2

    .line 83
    .line 84
    if-ge v11, v8, :cond_b

    .line 85
    .line 86
    aget-wide v18, v2, v11

    .line 87
    .line 88
    .line 89
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->isNaN(D)Z

    .line 90
    move-result v2

    .line 91
    .line 92
    const-wide/16 v18, 0x0

    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    if-eqz p6, :cond_2

    .line 97
    .line 98
    aget-wide v20, p6, v11

    .line 99
    .line 100
    cmpl-double v2, v20, v18

    .line 101
    .line 102
    if-nez v2, :cond_3

    .line 103
    .line 104
    :cond_2
    move/from16 p4, v10

    .line 105
    goto :goto_4

    .line 106
    .line 107
    :cond_3
    if-eqz p6, :cond_4

    .line 108
    .line 109
    aget-wide v18, p6, v11

    .line 110
    .line 111
    :cond_4
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 112
    .line 113
    aget-wide v20, v2, v11

    .line 114
    .line 115
    .line 116
    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->isNaN(D)Z

    .line 117
    move-result v2

    .line 118
    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    :goto_2
    move/from16 p4, v10

    .line 122
    .line 123
    move-wide/from16 v9, v18

    .line 124
    goto :goto_3

    .line 125
    .line 126
    :cond_5
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempValue:[D

    .line 127
    .line 128
    aget-wide v20, v2, v11

    .line 129
    .line 130
    add-double v18, v20, v18

    .line 131
    goto :goto_2

    .line 132
    :goto_3
    double-to-float v8, v9

    .line 133
    .line 134
    iget-object v9, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mTempDelta:[D

    .line 135
    .line 136
    aget-wide v2, v9, v11

    .line 137
    double-to-float v2, v2

    .line 138
    const/4 v3, 0x1

    .line 139
    .line 140
    if-eq v11, v3, :cond_a

    .line 141
    const/4 v10, 0x2

    .line 142
    .line 143
    if-eq v11, v10, :cond_9

    .line 144
    const/4 v3, 0x3

    .line 145
    .line 146
    if-eq v11, v3, :cond_8

    .line 147
    const/4 v3, 0x4

    .line 148
    .line 149
    if-eq v11, v3, :cond_7

    .line 150
    const/4 v2, 0x5

    .line 151
    .line 152
    if-eq v11, v2, :cond_6

    .line 153
    .line 154
    :goto_4
    move/from16 v10, p4

    .line 155
    goto :goto_5

    .line 156
    :cond_6
    move v10, v8

    .line 157
    goto :goto_5

    .line 158
    .line 159
    :cond_7
    move/from16 v10, p4

    .line 160
    move v15, v2

    .line 161
    move v7, v8

    .line 162
    goto :goto_5

    .line 163
    .line 164
    :cond_8
    move/from16 v10, p4

    .line 165
    move v14, v2

    .line 166
    move v6, v8

    .line 167
    goto :goto_5

    .line 168
    .line 169
    :cond_9
    move/from16 v10, p4

    .line 170
    move v13, v2

    .line 171
    move v5, v8

    .line 172
    goto :goto_5

    .line 173
    .line 174
    :cond_a
    move/from16 v10, p4

    .line 175
    move v12, v2

    .line 176
    move v4, v8

    .line 177
    .line 178
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 179
    const/4 v9, 0x1

    .line 180
    goto :goto_1

    .line 181
    .line 182
    :cond_b
    move/from16 p4, v10

    .line 183
    .line 184
    iget-object v3, v0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 185
    .line 186
    const/high16 v8, 0x40000000    # 2.0f

    .line 187
    .line 188
    if-eqz v3, :cond_d

    .line 189
    const/4 v2, 0x2

    .line 190
    .line 191
    new-array v9, v2, [F

    .line 192
    .line 193
    new-array v10, v2, [F

    .line 194
    .line 195
    move/from16 v11, p1

    .line 196
    float-to-double v14, v11

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v14, v15, v9, v10}, Landroidx/constraintlayout/core/motion/Motion;->getCenter(D[F[F)V

    .line 200
    .line 201
    aget v3, v9, v16

    .line 202
    .line 203
    const/16 v17, 0x1

    .line 204
    .line 205
    aget v9, v9, v17

    .line 206
    .line 207
    aget v11, v10, v16

    .line 208
    .line 209
    aget v10, v10, v17

    .line 210
    float-to-double v14, v3

    .line 211
    float-to-double v3, v4

    .line 212
    .line 213
    move-wide/from16 v18, v3

    .line 214
    float-to-double v2, v5

    .line 215
    .line 216
    .line 217
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 218
    move-result-wide v4

    .line 219
    .line 220
    mul-double v4, v4, v18

    .line 221
    add-double/2addr v14, v4

    .line 222
    .line 223
    div-float v4, v6, v8

    .line 224
    float-to-double v4, v4

    .line 225
    sub-double/2addr v14, v4

    .line 226
    double-to-float v4, v14

    .line 227
    float-to-double v14, v9

    .line 228
    .line 229
    .line 230
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 231
    move-result-wide v20

    .line 232
    .line 233
    mul-double v20, v20, v18

    .line 234
    .line 235
    sub-double v14, v14, v20

    .line 236
    .line 237
    div-float v5, v7, v8

    .line 238
    float-to-double v8, v5

    .line 239
    sub-double/2addr v14, v8

    .line 240
    double-to-float v5, v14

    .line 241
    float-to-double v8, v11

    .line 242
    float-to-double v11, v12

    .line 243
    .line 244
    .line 245
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 246
    move-result-wide v14

    .line 247
    mul-double/2addr v14, v11

    .line 248
    add-double/2addr v8, v14

    .line 249
    .line 250
    .line 251
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 252
    move-result-wide v14

    .line 253
    .line 254
    mul-double v14, v14, v18

    .line 255
    .line 256
    move-wide/from16 v20, v2

    .line 257
    float-to-double v2, v13

    .line 258
    mul-double/2addr v14, v2

    .line 259
    add-double/2addr v8, v14

    .line 260
    double-to-float v8, v8

    .line 261
    float-to-double v9, v10

    .line 262
    .line 263
    .line 264
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->cos(D)D

    .line 265
    move-result-wide v13

    .line 266
    mul-double/2addr v11, v13

    .line 267
    sub-double/2addr v9, v11

    .line 268
    .line 269
    .line 270
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->sin(D)D

    .line 271
    move-result-wide v11

    .line 272
    .line 273
    mul-double v11, v11, v18

    .line 274
    mul-double/2addr v11, v2

    .line 275
    add-double/2addr v9, v11

    .line 276
    double-to-float v2, v9

    .line 277
    .line 278
    move-object/from16 v3, p5

    .line 279
    array-length v9, v3

    .line 280
    const/4 v10, 0x2

    .line 281
    .line 282
    if-lt v9, v10, :cond_c

    .line 283
    float-to-double v9, v8

    .line 284
    .line 285
    aput-wide v9, v3, v16

    .line 286
    float-to-double v9, v2

    .line 287
    .line 288
    const/16 v17, 0x1

    .line 289
    .line 290
    aput-wide v9, v3, v17

    .line 291
    .line 292
    .line 293
    :cond_c
    invoke-static/range {p4 .. p4}, Ljava/lang/Float;->isNaN(F)Z

    .line 294
    move-result v3

    .line 295
    .line 296
    if-nez v3, :cond_e

    .line 297
    .line 298
    move/from16 v10, p4

    .line 299
    float-to-double v9, v10

    .line 300
    float-to-double v2, v2

    .line 301
    float-to-double v11, v8

    .line 302
    .line 303
    .line 304
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 305
    move-result-wide v2

    .line 306
    .line 307
    .line 308
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 309
    move-result-wide v2

    .line 310
    add-double/2addr v9, v2

    .line 311
    double-to-float v2, v9

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/motion/MotionWidget;->setRotationZ(F)V

    .line 315
    goto :goto_6

    .line 316
    .line 317
    :cond_d
    move/from16 v10, p4

    .line 318
    .line 319
    .line 320
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 321
    move-result v2

    .line 322
    .line 323
    if-nez v2, :cond_e

    .line 324
    div-float/2addr v14, v8

    .line 325
    add-float/2addr v12, v14

    .line 326
    div-float/2addr v15, v8

    .line 327
    add-float/2addr v13, v15

    .line 328
    float-to-double v2, v10

    .line 329
    float-to-double v8, v13

    .line 330
    float-to-double v10, v12

    .line 331
    .line 332
    .line 333
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    .line 334
    move-result-wide v8

    .line 335
    .line 336
    .line 337
    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    .line 338
    move-result-wide v8

    .line 339
    add-double/2addr v2, v8

    .line 340
    double-to-float v2, v2

    .line 341
    .line 342
    add-float v2, v2, p3

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/motion/MotionWidget;->setRotationZ(F)V

    .line 346
    .line 347
    :cond_e
    :goto_6
    const/high16 v2, 0x3f000000    # 0.5f

    .line 348
    add-float/2addr v4, v2

    .line 349
    float-to-int v3, v4

    .line 350
    add-float/2addr v5, v2

    .line 351
    float-to-int v2, v5

    .line 352
    add-float/2addr v4, v6

    .line 353
    float-to-int v4, v4

    .line 354
    add-float/2addr v5, v7

    .line 355
    float-to-int v5, v5

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v3, v2, v4, v5}, Landroidx/constraintlayout/core/motion/MotionWidget;->layout(IIII)V

    .line 359
    return-void
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
.end method

.method public setupRelative(Landroidx/constraintlayout/core/motion/Motion;Landroidx/constraintlayout/core/motion/MotionPaths;)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 3
    .line 4
    iget v1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 5
    .line 6
    const/high16 v2, 0x40000000    # 2.0f

    .line 7
    div-float/2addr v1, v2

    .line 8
    add-float/2addr v0, v1

    .line 9
    .line 10
    iget v1, p2, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 11
    sub-float/2addr v0, v1

    .line 12
    .line 13
    iget v1, p2, Landroidx/constraintlayout/core/motion/MotionPaths;->mWidth:F

    .line 14
    div-float/2addr v1, v2

    .line 15
    sub-float/2addr v0, v1

    .line 16
    float-to-double v0, v0

    .line 17
    .line 18
    iget v3, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 19
    .line 20
    iget v4, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 21
    div-float/2addr v4, v2

    .line 22
    add-float/2addr v3, v4

    .line 23
    .line 24
    iget v4, p2, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 25
    sub-float/2addr v3, v4

    .line 26
    .line 27
    iget p2, p2, Landroidx/constraintlayout/core/motion/MotionPaths;->mHeight:F

    .line 28
    div-float/2addr p2, v2

    .line 29
    sub-float/2addr v3, p2

    .line 30
    float-to-double v2, v3

    .line 31
    .line 32
    iput-object p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeToController:Landroidx/constraintlayout/core/motion/Motion;

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    .line 36
    move-result-wide p1

    .line 37
    double-to-float p1, p1

    .line 38
    .line 39
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mX:F

    .line 40
    .line 41
    iget p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeAngle:F

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    move-result p1

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 51
    move-result-wide p1

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    const-wide v0, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 57
    add-double/2addr p1, v0

    .line 58
    double-to-float p1, p1

    .line 59
    .line 60
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 61
    return-void

    .line 62
    .line 63
    :cond_0
    iget p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mRelativeAngle:F

    .line 64
    float-to-double p1, p1

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 68
    move-result-wide p1

    .line 69
    double-to-float p1, p1

    .line 70
    .line 71
    iput p1, p0, Landroidx/constraintlayout/core/motion/MotionPaths;->mY:F

    .line 72
    return-void
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
.end method
