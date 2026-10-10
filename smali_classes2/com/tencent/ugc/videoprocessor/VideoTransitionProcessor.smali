.class public Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "TransitionProcessor"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mFirstFrameTime:J

.field private mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private mIsReverse:Z

.field private final mTransitionConfig:Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

.field private mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

.field private mVideoDuration:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mFirstFrameTime:J

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    iput-boolean v2, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mIsReverse:Z

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mVideoDuration:J

    .line 13
    .line 14
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mContext:Landroid/content/Context;

    .line 15
    .line 16
    new-instance p1, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;-><init>()V

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionConfig:Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

    .line 22
    return-void
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

.method private createTransitionFilter(I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    :pswitch_0
    const/4 p1, 0x0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :pswitch_1
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/SwapFilter;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/SwapFilter;-><init>(I)V

    .line 13
    :goto_0
    move-object p1, v0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :pswitch_2
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/SqueezeFilter;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/SqueezeFilter;-><init>(I)V

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :pswitch_3
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/PixelizeFilter;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/PixelizeFilter;-><init>(I)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :pswitch_4
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/FlyEyeFilter;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/FlyEyeFilter;-><init>(I)V

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :pswitch_5
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/FadeGrayScaleFilter;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/FadeGrayScaleFilter;-><init>(I)V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :pswitch_6
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/DoorWayFilter;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/DoorWayFilter;-><init>(I)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :pswitch_7
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/CubeFilter;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/CubeFilter;-><init>(I)V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :pswitch_8
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/CrossWarpFilter;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/CrossWarpFilter;-><init>(I)V

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :pswitch_9
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/CircleFilter;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/CircleFilter;-><init>(I)V

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :pswitch_a
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/BurnFilter;

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/BurnFilter;-><init>(I)V

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :pswitch_b
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/DreamyZoomFilter;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/DreamyZoomFilter;-><init>(I)V

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :pswitch_c
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/GlitchDisplaceFilter;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/GlitchDisplaceFilter;-><init>(I)V

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :pswitch_d
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/HexagonalizeFilter;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/HexagonalizeFilter;-><init>(I)V

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :pswitch_e
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/KaleidoScopeFilter;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/KaleidoScopeFilter;-><init>(I)V

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :pswitch_f
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/MosaicFilter;

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/MosaicFilter;-><init>(I)V

    .line 99
    goto :goto_0

    .line 100
    .line 101
    :pswitch_10
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/GridFlipFilter;

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/GridFlipFilter;-><init>(I)V

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :pswitch_11
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/CrossZoomFilter;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/CrossZoomFilter;-><init>(I)V

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :pswitch_12
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/SwirlFilter;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/SwirlFilter;-><init>(I)V

    .line 117
    goto :goto_0

    .line 118
    .line 119
    :pswitch_13
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/CircleCropFilter;

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/CircleCropFilter;-><init>(I)V

    .line 123
    goto :goto_0

    .line 124
    .line 125
    :pswitch_14
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/BounceFilter;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/BounceFilter;-><init>(I)V

    .line 129
    goto :goto_0

    .line 130
    .line 131
    :pswitch_15
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalWarpFilter;

    .line 132
    .line 133
    .line 134
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalWarpFilter;-><init>(I)V

    .line 135
    goto :goto_0

    .line 136
    .line 137
    :pswitch_16
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/StereoViewerFilter;

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/StereoViewerFilter;-><init>(I)V

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :pswitch_17
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/GlitchMemoriesFilter;

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/GlitchMemoriesFilter;-><init>(I)V

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :pswitch_18
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/InvertedPageCurlFilter;

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/InvertedPageCurlFilter;-><init>(I)V

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :pswitch_19
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/WaterDropFilter;

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/WaterDropFilter;-><init>(I)V

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :pswitch_1a
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/LinearBlurFilter;

    .line 166
    .line 167
    .line 168
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/LinearBlurFilter;-><init>(I)V

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :pswitch_1b
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/SimpleZoomFilter;

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/SimpleZoomFilter;-><init>(I)V

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_1c
    new-instance v0, Lcom/tencent/ugc/videoprocessor/transitions/FadeColorFilter;

    .line 180
    .line 181
    .line 182
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/transitions/FadeColorFilter;-><init>(I)V

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_1d
    new-instance v1, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;

    .line 187
    .line 188
    new-array v0, v0, [F

    .line 189
    .line 190
    .line 191
    fill-array-data v0, :array_0

    .line 192
    .line 193
    .line 194
    invoke-direct {v1, p1, v0}, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;-><init>(I[F)V

    .line 195
    :goto_1
    move-object p1, v1

    .line 196
    goto :goto_2

    .line 197
    .line 198
    :pswitch_1e
    new-instance v1, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;

    .line 199
    .line 200
    new-array v0, v0, [F

    .line 201
    .line 202
    .line 203
    fill-array-data v0, :array_1

    .line 204
    .line 205
    .line 206
    invoke-direct {v1, p1, v0}, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;-><init>(I[F)V

    .line 207
    goto :goto_1

    .line 208
    .line 209
    :pswitch_1f
    new-instance v1, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;

    .line 210
    .line 211
    new-array v0, v0, [F

    .line 212
    .line 213
    .line 214
    fill-array-data v0, :array_2

    .line 215
    .line 216
    .line 217
    invoke-direct {v1, p1, v0}, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;-><init>(I[F)V

    .line 218
    goto :goto_1

    .line 219
    .line 220
    :pswitch_20
    new-instance v1, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;

    .line 221
    .line 222
    new-array v0, v0, [F

    .line 223
    .line 224
    .line 225
    fill-array-data v0, :array_3

    .line 226
    .line 227
    .line 228
    invoke-direct {v1, p1, v0}, Lcom/tencent/ugc/videoprocessor/transitions/DirectionalFilter;-><init>(I[F)V

    .line 229
    goto :goto_1

    .line 230
    .line 231
    :goto_2
    if-eqz p1, :cond_0

    .line 232
    .line 233
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 237
    .line 238
    :cond_0
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 239
    return-void

    .line 240
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 325
    .line 326
    .line 327
    :array_1
    .array-data 4
        0x0
        -0x40800000    # -1.0f
    .end array-data

    :array_2
    .array-data 4
        -0x40800000    # -1.0f
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private getCurrentTransition(J)Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionConfig:Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;->getTransitionList()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/CollectionUtils;->isEmpty(Ljava/util/Collection;)Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    return-object v2

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v1, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    check-cast v3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, p2, v3}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->isInTransitionRange(JLcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;)Z

    .line 32
    move-result v4

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    return-object v3

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-object v2
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

.method private getTransitionProgress(Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;J)F
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mFirstFrameTime:J

    .line 3
    .line 4
    const-wide/16 v2, -0x1

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-wide p2, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mFirstFrameTime:J

    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mFirstFrameTime:J

    .line 13
    sub-long/2addr p2, v0

    .line 14
    .line 15
    .line 16
    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    .line 17
    move-result-wide p2

    .line 18
    .line 19
    iget-wide v0, p1, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->endTimeMs:J

    .line 20
    .line 21
    iget-wide v2, p1, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->startTimeMs:J

    .line 22
    sub-long/2addr v0, v2

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 26
    move-result-wide v0

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmp-long p1, v0, v2

    .line 31
    .line 32
    if-gtz p1, :cond_1

    .line 33
    .line 34
    const/high16 p1, -0x40800000    # -1.0f

    .line 35
    return p1

    .line 36
    :cond_1
    long-to-float p1, p2

    .line 37
    .line 38
    const/high16 p2, 0x3f800000    # 1.0f

    .line 39
    mul-float/2addr p1, p2

    .line 40
    long-to-float p2, v0

    .line 41
    div-float/2addr p1, p2

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/h;->a(FF)F

    .line 46
    move-result p1

    .line 47
    return p1
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

.method private isInTransitionRange(JLcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;)Z
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->startTimeMs:J

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    const/4 v3, 0x1

    .line 6
    .line 7
    if-ltz v2, :cond_0

    .line 8
    .line 9
    iget-wide v4, p3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->endTimeMs:J

    .line 10
    .line 11
    cmp-long v2, p1, v4

    .line 12
    .line 13
    if-gtz v2, :cond_0

    .line 14
    return v3

    .line 15
    .line 16
    :cond_0
    iget-wide v4, p3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->endTimeMs:J

    .line 17
    .line 18
    cmp-long p3, p1, v4

    .line 19
    .line 20
    if-ltz p3, :cond_1

    .line 21
    .line 22
    cmp-long p1, p1, v0

    .line 23
    .line 24
    if-gtz p1, :cond_1

    .line 25
    return v3

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1
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


# virtual methods
.method public applyTransitionFilter(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mIsReverse:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-wide v7, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mVideoDuration:J

    .line 11
    .line 12
    sub-long v3, v7, v0

    .line 13
    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static/range {v3 .. v8}, Lcom/tencent/liteav/base/util/h;->a(JJJ)J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->getCurrentTransition(J)Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;

    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    const-wide/16 p1, -0x1

    .line 28
    .line 29
    iput-wide p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mFirstFrameTime:J

    .line 30
    return-object v3

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-direct {p0, v2, v0, v1}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->getTransitionProgress(Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;J)F

    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    cmpg-float v1, v0, v1

    .line 38
    .line 39
    if-gez v1, :cond_2

    .line 40
    return-object v3

    .line 41
    .line 42
    :cond_2
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget v4, v1, Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;->mType:I

    .line 47
    .line 48
    iget v5, v2, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->type:I

    .line 49
    .line 50
    if-eq v4, v5, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 54
    .line 55
    iput-object v3, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 56
    .line 57
    :cond_3
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 58
    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    iget v1, v2, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->type:I

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v1}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->createTransitionFilter(I)V

    .line 65
    .line 66
    :cond_4
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 67
    .line 68
    if-nez v1, :cond_5

    .line 69
    return-object v3

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 73
    move-result v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 77
    move-result v3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2, v3}, Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;->onOutputSizeChanged(II)V

    .line 81
    .line 82
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;->setProgressForTransition(F)V

    .line 86
    .line 87
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 91
    move-result v1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 95
    move-result v2

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 111
    .line 112
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTextureId()I

    .line 116
    move-result v2

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2, v0, p2, p3}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 123
    move-result-object p2

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p2}, Lcom/tencent/ugc/videobase/frame/GLTexture;->wrap(Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 127
    move-result-object p2

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 131
    move-result-wide v1

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v1, v2}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTimestamp(J)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 138
    return-object p2
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

.method public deleteLastTransitionEffect()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionConfig:Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;->deleteLastTransitionEffect()V

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

.method public destroy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionFilter:Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;

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

.method public initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 3
    return-void
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

.method public setReverse(ZJ)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mIsReverse:Z

    .line 3
    .line 4
    iput-wide p2, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mVideoDuration:J

    .line 5
    return-void
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

.method public setTransitionEffect(IJJJ)Z
    .locals 5

    .line 1
    .line 2
    cmp-long v0, p4, p2

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "TransitionProcessor"

    .line 6
    .line 7
    if-gtz v0, :cond_4

    .line 8
    add-long/2addr p6, p4

    .line 9
    .line 10
    cmp-long p2, p6, p2

    .line 11
    .line 12
    if-lez p2, :cond_0

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object p2, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionConfig:Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;->getTransitionList()Ljava/util/List;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 23
    move-result p3

    .line 24
    .line 25
    if-eqz p3, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result p3

    .line 34
    .line 35
    if-eqz p3, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object p3

    .line 40
    .line 41
    check-cast p3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;

    .line 42
    .line 43
    iget-wide v3, p3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->startTimeMs:J

    .line 44
    .line 45
    cmp-long v0, p4, v3

    .line 46
    .line 47
    if-ltz v0, :cond_2

    .line 48
    .line 49
    iget-wide v3, p3, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->endTimeMs:J

    .line 50
    .line 51
    cmp-long v0, p4, v3

    .line 52
    .line 53
    if-gtz v0, :cond_2

    .line 54
    .line 55
    const-string p1, "setTransitionEffect,start time invalid"

    .line 56
    .line 57
    .line 58
    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-direct {p0, p6, p7, p3}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->isInTransitionRange(JLcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;)Z

    .line 63
    move-result p3

    .line 64
    .line 65
    if-eqz p3, :cond_1

    .line 66
    .line 67
    const-string p1, "setTransitionEffect,end time invalid"

    .line 68
    .line 69
    .line 70
    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :goto_0
    return v1

    .line 72
    .line 73
    :cond_3
    new-instance p2, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;

    .line 74
    .line 75
    .line 76
    invoke-direct {p2, p1}, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;-><init>(I)V

    .line 77
    .line 78
    iput-wide p4, p2, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->startTimeMs:J

    .line 79
    .line 80
    iput-wide p6, p2, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;->endTimeMs:J

    .line 81
    .line 82
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->mTransitionConfig:Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig;->addTransition(Lcom/tencent/ugc/videoprocessor/transitions/data/TransitionConfig$TransitionBean;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    const-string p2, "setTransitionEffect,success:"

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const/4 p1, 0x1

    .line 100
    return p1

    .line 101
    .line 102
    :cond_4
    :goto_1
    const-string p1, "setTransitionEffect,not suitable for videoTotalDurationMs"

    .line 103
    .line 104
    .line 105
    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return v1
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
.end method
