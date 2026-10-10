.class public Lcom/tencent/ugc/renderer/PostProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private mNeedUpdatePerspectivePointsToFilter:Z

.field private mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

.field private mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

.field private final mOutputSize:Lcom/tencent/liteav/base/util/Size;

.field private mPerspectiveCorrectionDstViewPoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

.field private mPerspectiveCorrectionSrcViewPoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

.field private mRenderViewTransformMatrix:Landroid/graphics/Matrix;

.field private final mTAG:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/ugc/videobase/frame/GLTexturePool;II)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "PostProcessor_"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mTAG:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    iput-boolean v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNeedUpdatePerspectivePointsToFilter:Z

    .line 34
    .line 35
    iput-object p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2, p3}, Lcom/tencent/liteav/base/util/Size;->set(II)V

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
.end method

.method private initializePerspectiveCorrectionFilter()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    return-void

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_1
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createNormalCubeVerticesBuffer()Ljava/nio/FloatBuffer;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 34
    .line 35
    sget-object v0, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 36
    const/4 v1, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createTextureCoordsBuffer(Lcom/tencent/liteav/base/util/l;ZZ)Ljava/nio/FloatBuffer;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

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
    .line 79
    .line 80
    .line 81
.end method

.method private static reversePointWithTransformMatrix(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    new-instance v3, Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    :goto_0
    return-object p0

    .line 19
    .line 20
    :cond_1
    new-array p1, v2, [F

    .line 21
    .line 22
    iget v4, p0, Landroid/graphics/PointF;->x:F

    .line 23
    .line 24
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 25
    .line 26
    new-array v2, v2, [F

    .line 27
    .line 28
    aput v4, v2, v1

    .line 29
    .line 30
    aput p0, v2, v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, p1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 34
    .line 35
    new-instance p0, Landroid/graphics/PointF;

    .line 36
    .line 37
    aget v1, p1, v1

    .line 38
    .line 39
    aget p1, p1, v0

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 43
    return-object p0
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
.end method

.method private reverseViewPointsToMappingGLPoints(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Landroid/graphics/PointF;

    .line 22
    .line 23
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 24
    .line 25
    iget-object v3, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 26
    .line 27
    iget v4, v3, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 28
    int-to-float v4, v4

    .line 29
    mul-float/2addr v2, v4

    .line 30
    .line 31
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 32
    .line 33
    iget v3, v3, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 34
    int-to-float v3, v3

    .line 35
    mul-float/2addr v1, v3

    .line 36
    .line 37
    new-instance v3, Landroid/graphics/PointF;

    .line 38
    .line 39
    .line 40
    invoke-direct {v3, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 41
    .line 42
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mRenderViewTransformMatrix:Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v1}, Lcom/tencent/ugc/renderer/PostProcessor;->reversePointWithTransformMatrix(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    new-instance v2, Landroid/graphics/PointF;

    .line 49
    .line 50
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 51
    .line 52
    iget-object v4, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 53
    .line 54
    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 55
    int-to-float v5, v5

    .line 56
    div-float/2addr v3, v5

    .line 57
    .line 58
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 59
    .line 60
    iget v4, v4, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 61
    int-to-float v4, v4

    .line 62
    div-float/2addr v1, v4

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v3, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 66
    .line 67
    const/high16 v1, 0x3f800000    # 1.0f

    .line 68
    .line 69
    iget v3, v2, Landroid/graphics/PointF;->y:F

    .line 70
    sub-float/2addr v1, v3

    .line 71
    .line 72
    iput v1, v2, Landroid/graphics/PointF;->y:F

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    return-object v0
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
.end method

.method private setPerspectivePointsToFilter(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1}, Lcom/tencent/ugc/renderer/PostProcessor;->reverseViewPointsToMappingGLPoints(Ljava/util/List;)Ljava/util/List;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p2}, Lcom/tencent/ugc/renderer/PostProcessor;->reverseViewPointsToMappingGLPoints(Ljava/util/List;)Ljava/util/List;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1, p2}, Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;->setPerspectiveCorrectionPoints(Ljava/util/List;Ljava/util/List;)V

    .line 45
    :cond_2
    :goto_0
    return-void
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
.end method

.method private uninitializePerspectiveCorrectionFilter()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 12
    return-void
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
.end method

.method private uninitializePixelFrameRender()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->uninitialize()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 11
    :cond_0
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
.end method


# virtual methods
.method public processFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mTAG:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "create PixelFrameRenderer, size ="

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    iget-object v2, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    new-instance v0, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 39
    .line 40
    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 41
    .line 42
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v2, v1}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;-><init>(II)V

    .line 46
    .line 47
    iput-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 50
    .line 51
    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 52
    .line 53
    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 54
    const/4 v2, 0x0

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v2, v1, v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 58
    .line 59
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 62
    .line 63
    iget v3, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 64
    .line 65
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3, v1}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 77
    move-result-object v3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1, v3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 81
    .line 82
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 83
    .line 84
    iget-object v3, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 85
    .line 86
    iget v4, v3, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 87
    .line 88
    iget v3, v3, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v4, v3}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->setOutputSize(II)V

    .line 92
    .line 93
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPixelFrameRender:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p1, p2, v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->renderFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/ugc/videobase/frame/GLTexture;)V

    .line 97
    .line 98
    iget-object p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 99
    .line 100
    if-nez p1, :cond_2

    .line 101
    .line 102
    .line 103
    invoke-direct {p0}, Lcom/tencent/ugc/renderer/PostProcessor;->initializePerspectiveCorrectionFilter()V

    .line 104
    .line 105
    :cond_2
    iget-boolean p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNeedUpdatePerspectivePointsToFilter:Z

    .line 106
    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    iget-object p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionSrcViewPoints:Ljava/util/List;

    .line 110
    .line 111
    iget-object p2, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionDstViewPoints:Ljava/util/List;

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, p1, p2}, Lcom/tencent/ugc/renderer/PostProcessor;->setPerspectivePointsToFilter(Ljava/util/List;Ljava/util/List;)V

    .line 115
    .line 116
    iput-boolean v2, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNeedUpdatePerspectivePointsToFilter:Z

    .line 117
    .line 118
    :cond_3
    iget-object p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionFilter:Lcom/tencent/ugc/videobase/filter/TXCGPUImagePerspectiveCorrectionFilter;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 122
    move-result p2

    .line 123
    .line 124
    iget-object v1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 125
    .line 126
    iget-object v2, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 127
    const/4 v3, 0x0

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2, v3, v1, v2}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 134
    return-void
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
.end method

.method public setOutputSize(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 3
    .line 4
    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 5
    .line 6
    if-ne v1, p1, :cond_0

    .line 7
    .line 8
    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 9
    .line 10
    if-ne v1, p2, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 15
    const/4 p1, 0x1

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNeedUpdatePerspectivePointsToFilter:Z

    .line 18
    return-void
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
.end method

.method public setPerspectiveCorrectionPoints(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionSrcViewPoints:Ljava/util/List;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mPerspectiveCorrectionDstViewPoints:Ljava/util/List;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNeedUpdatePerspectivePointsToFilter:Z

    .line 8
    return-void
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
.end method

.method public setRenderViewTransformMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mRenderViewTransformMatrix:Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mRenderViewTransformMatrix:Landroid/graphics/Matrix;

    .line 12
    const/4 p1, 0x1

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/tencent/ugc/renderer/PostProcessor;->mNeedUpdatePerspectivePointsToFilter:Z

    .line 15
    return-void
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
.end method

.method public uninitialize()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/renderer/PostProcessor;->uninitializePixelFrameRender()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/tencent/ugc/renderer/PostProcessor;->uninitializePerspectiveCorrectionFilter()V

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
.end method
