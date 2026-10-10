.class final Landroidx/core/content/res/ViewingConditions;
.super Ljava/lang/Object;
.source "ViewingConditions.java"


# static fields
.field static final DEFAULT:Landroidx/core/content/res/ViewingConditions;


# instance fields
.field private final mAw:F

.field private final mC:F

.field private final mFl:F

.field private final mFlRoot:F

.field private final mN:F

.field private final mNbb:F

.field private final mNc:F

.field private final mNcb:F

.field private final mRgbD:[F

.field private final mZ:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Landroidx/core/content/res/CamUtils;->WHITE_POINT_D65:[F

    .line 3
    .line 4
    const/high16 v1, 0x42480000    # 50.0f

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Landroidx/core/content/res/CamUtils;->yFromLStar(F)F

    .line 8
    move-result v2

    .line 9
    float-to-double v2, v2

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide v4, 0x404fd4bbab8b494cL    # 63.66197723675813

    .line 15
    mul-double/2addr v2, v4

    .line 16
    .line 17
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 18
    div-double/2addr v2, v4

    .line 19
    double-to-float v2, v2

    .line 20
    .line 21
    const/high16 v3, 0x40000000    # 2.0f

    .line 22
    const/4 v4, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v2, v1, v3, v4}, Landroidx/core/content/res/ViewingConditions;->make([FFFFZ)Landroidx/core/content/res/ViewingConditions;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sput-object v0, Landroidx/core/content/res/ViewingConditions;->DEFAULT:Landroidx/core/content/res/ViewingConditions;

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
    .line 79
    .line 80
.end method

.method private constructor <init>(FFFFFF[FFFF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Landroidx/core/content/res/ViewingConditions;->mN:F

    .line 6
    .line 7
    iput p2, p0, Landroidx/core/content/res/ViewingConditions;->mAw:F

    .line 8
    .line 9
    iput p3, p0, Landroidx/core/content/res/ViewingConditions;->mNbb:F

    .line 10
    .line 11
    iput p4, p0, Landroidx/core/content/res/ViewingConditions;->mNcb:F

    .line 12
    .line 13
    iput p5, p0, Landroidx/core/content/res/ViewingConditions;->mC:F

    .line 14
    .line 15
    iput p6, p0, Landroidx/core/content/res/ViewingConditions;->mNc:F

    .line 16
    .line 17
    iput-object p7, p0, Landroidx/core/content/res/ViewingConditions;->mRgbD:[F

    .line 18
    .line 19
    iput p8, p0, Landroidx/core/content/res/ViewingConditions;->mFl:F

    .line 20
    .line 21
    iput p9, p0, Landroidx/core/content/res/ViewingConditions;->mFlRoot:F

    .line 22
    .line 23
    iput p10, p0, Landroidx/core/content/res/ViewingConditions;->mZ:F

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
.end method

.method public static make([FFFFZ)Landroidx/core/content/res/ViewingConditions;
    .locals 23
    .param p0    # [F
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move/from16 v0, p1

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    sget-object v2, Landroidx/core/content/res/CamUtils;->XYZ_TO_CAM16RGB:[[F

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    aget v4, p0, v3

    .line 9
    .line 10
    aget-object v5, v2, v3

    .line 11
    .line 12
    aget v6, v5, v3

    .line 13
    mul-float/2addr v6, v4

    .line 14
    const/4 v7, 0x1

    .line 15
    .line 16
    aget v8, p0, v7

    .line 17
    .line 18
    aget v9, v5, v7

    .line 19
    mul-float/2addr v9, v8

    .line 20
    add-float/2addr v6, v9

    .line 21
    const/4 v9, 0x2

    .line 22
    .line 23
    aget v10, p0, v9

    .line 24
    .line 25
    aget v5, v5, v9

    .line 26
    mul-float/2addr v5, v10

    .line 27
    add-float/2addr v6, v5

    .line 28
    .line 29
    aget-object v5, v2, v7

    .line 30
    .line 31
    aget v11, v5, v3

    .line 32
    mul-float/2addr v11, v4

    .line 33
    .line 34
    aget v12, v5, v7

    .line 35
    mul-float/2addr v12, v8

    .line 36
    add-float/2addr v11, v12

    .line 37
    .line 38
    aget v5, v5, v9

    .line 39
    mul-float/2addr v5, v10

    .line 40
    add-float/2addr v11, v5

    .line 41
    .line 42
    aget-object v2, v2, v9

    .line 43
    .line 44
    aget v5, v2, v3

    .line 45
    mul-float/2addr v4, v5

    .line 46
    .line 47
    aget v5, v2, v7

    .line 48
    mul-float/2addr v8, v5

    .line 49
    add-float/2addr v4, v8

    .line 50
    .line 51
    aget v2, v2, v9

    .line 52
    mul-float/2addr v10, v2

    .line 53
    add-float/2addr v4, v10

    .line 54
    .line 55
    const/high16 v2, 0x41200000    # 10.0f

    .line 56
    .line 57
    div-float v5, p3, v2

    .line 58
    .line 59
    .line 60
    const v8, 0x3f4ccccd    # 0.8f

    .line 61
    add-float/2addr v5, v8

    .line 62
    float-to-double v12, v5

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const-wide v14, 0x3feccccccccccccdL    # 0.9

    .line 68
    .line 69
    cmpl-double v10, v12, v14

    .line 70
    .line 71
    .line 72
    const v12, 0x3f170a3d    # 0.59f

    .line 73
    .line 74
    if-ltz v10, :cond_0

    .line 75
    .line 76
    .line 77
    const v8, 0x3f666666    # 0.9f

    .line 78
    .line 79
    sub-float v8, v5, v8

    .line 80
    mul-float/2addr v8, v2

    .line 81
    .line 82
    .line 83
    const v2, 0x3f30a3d7    # 0.69f

    .line 84
    .line 85
    .line 86
    invoke-static {v12, v2, v8}, Landroidx/core/content/res/CamUtils;->lerp(FFF)F

    .line 87
    move-result v2

    .line 88
    .line 89
    :goto_0
    move/from16 v17, v2

    .line 90
    goto :goto_1

    .line 91
    .line 92
    :cond_0
    sub-float v8, v5, v8

    .line 93
    mul-float/2addr v8, v2

    .line 94
    .line 95
    .line 96
    const v2, 0x3f066666    # 0.525f

    .line 97
    .line 98
    .line 99
    invoke-static {v2, v12, v8}, Landroidx/core/content/res/CamUtils;->lerp(FFF)F

    .line 100
    move-result v2

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :goto_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 104
    .line 105
    if-eqz p4, :cond_1

    .line 106
    move v8, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_1
    neg-float v8, v0

    .line 109
    .line 110
    const/high16 v10, 0x42280000    # 42.0f

    .line 111
    sub-float/2addr v8, v10

    .line 112
    .line 113
    const/high16 v10, 0x42b80000    # 92.0f

    .line 114
    div-float/2addr v8, v10

    .line 115
    float-to-double v12, v8

    .line 116
    .line 117
    .line 118
    invoke-static {v12, v13}, Ljava/lang/Math;->exp(D)D

    .line 119
    move-result-wide v12

    .line 120
    double-to-float v8, v12

    .line 121
    .line 122
    .line 123
    const v10, 0x3e8e38e4

    .line 124
    mul-float/2addr v8, v10

    .line 125
    .line 126
    sub-float v8, v2, v8

    .line 127
    mul-float/2addr v8, v5

    .line 128
    :goto_2
    float-to-double v12, v8

    .line 129
    .line 130
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 131
    .line 132
    cmpl-double v10, v12, v14

    .line 133
    .line 134
    if-lez v10, :cond_2

    .line 135
    move v8, v2

    .line 136
    goto :goto_3

    .line 137
    .line 138
    :cond_2
    const-wide/16 v14, 0x0

    .line 139
    .line 140
    cmpg-double v10, v12, v14

    .line 141
    .line 142
    if-gez v10, :cond_3

    .line 143
    const/4 v8, 0x0

    .line 144
    .line 145
    :cond_3
    :goto_3
    const/high16 v10, 0x42c80000    # 100.0f

    .line 146
    .line 147
    div-float v12, v10, v6

    .line 148
    mul-float/2addr v12, v8

    .line 149
    add-float/2addr v12, v2

    .line 150
    sub-float/2addr v12, v8

    .line 151
    .line 152
    div-float v13, v10, v11

    .line 153
    mul-float/2addr v13, v8

    .line 154
    add-float/2addr v13, v2

    .line 155
    sub-float/2addr v13, v8

    .line 156
    div-float/2addr v10, v4

    .line 157
    mul-float/2addr v10, v8

    .line 158
    add-float/2addr v10, v2

    .line 159
    sub-float/2addr v10, v8

    .line 160
    .line 161
    new-array v8, v1, [F

    .line 162
    .line 163
    aput v12, v8, v3

    .line 164
    .line 165
    aput v13, v8, v7

    .line 166
    .line 167
    aput v10, v8, v9

    .line 168
    .line 169
    const/high16 v10, 0x40a00000    # 5.0f

    .line 170
    mul-float/2addr v10, v0

    .line 171
    add-float/2addr v10, v2

    .line 172
    .line 173
    div-float v10, v2, v10

    .line 174
    .line 175
    mul-float v12, v10, v10

    .line 176
    mul-float/2addr v12, v10

    .line 177
    mul-float/2addr v12, v10

    .line 178
    sub-float/2addr v2, v12

    .line 179
    mul-float/2addr v12, v0

    .line 180
    .line 181
    .line 182
    const v10, 0x3dcccccd    # 0.1f

    .line 183
    mul-float/2addr v10, v2

    .line 184
    mul-float/2addr v10, v2

    .line 185
    .line 186
    const-wide/high16 v13, 0x4014000000000000L    # 5.0

    .line 187
    move v2, v3

    .line 188
    move v15, v4

    .line 189
    float-to-double v3, v0

    .line 190
    mul-double/2addr v3, v13

    .line 191
    .line 192
    .line 193
    invoke-static {v3, v4}, Ljava/lang/Math;->cbrt(D)D

    .line 194
    move-result-wide v3

    .line 195
    double-to-float v0, v3

    .line 196
    mul-float/2addr v10, v0

    .line 197
    add-float/2addr v12, v10

    .line 198
    .line 199
    .line 200
    invoke-static/range {p2 .. p2}, Landroidx/core/content/res/CamUtils;->yFromLStar(F)F

    .line 201
    move-result v0

    .line 202
    .line 203
    aget v3, p0, v7

    .line 204
    .line 205
    div-float v13, v0, v3

    .line 206
    float-to-double v3, v13

    .line 207
    move v0, v7

    .line 208
    .line 209
    move-object/from16 v19, v8

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 213
    move-result-wide v7

    .line 214
    double-to-float v7, v7

    .line 215
    .line 216
    .line 217
    const v8, 0x3fbd70a4    # 1.48f

    .line 218
    .line 219
    add-float v22, v7, v8

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    const-wide v7, 0x3fc999999999999aL    # 0.2

    .line 225
    .line 226
    .line 227
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 228
    move-result-wide v3

    .line 229
    double-to-float v3, v3

    .line 230
    .line 231
    .line 232
    const v4, 0x3f39999a    # 0.725f

    .line 233
    div-float/2addr v4, v3

    .line 234
    .line 235
    aget v3, v19, v2

    .line 236
    mul-float/2addr v3, v12

    .line 237
    mul-float/2addr v3, v6

    .line 238
    float-to-double v6, v3

    .line 239
    .line 240
    const-wide/high16 v20, 0x4059000000000000L    # 100.0

    .line 241
    .line 242
    div-double v6, v6, v20

    .line 243
    .line 244
    move/from16 p3, v2

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    const-wide v2, 0x3fdae147ae147ae1L    # 0.42

    .line 250
    .line 251
    .line 252
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 253
    move-result-wide v6

    .line 254
    double-to-float v6, v6

    .line 255
    .line 256
    aget v7, v19, v0

    .line 257
    mul-float/2addr v7, v12

    .line 258
    mul-float/2addr v7, v11

    .line 259
    float-to-double v7, v7

    .line 260
    .line 261
    div-double v7, v7, v20

    .line 262
    .line 263
    .line 264
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 265
    move-result-wide v7

    .line 266
    double-to-float v7, v7

    .line 267
    .line 268
    aget v8, v19, v9

    .line 269
    mul-float/2addr v8, v12

    .line 270
    mul-float/2addr v8, v15

    .line 271
    float-to-double v10, v8

    .line 272
    .line 273
    div-double v10, v10, v20

    .line 274
    .line 275
    .line 276
    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 277
    move-result-wide v2

    .line 278
    double-to-float v2, v2

    .line 279
    .line 280
    new-array v3, v1, [F

    .line 281
    .line 282
    aput v6, v3, p3

    .line 283
    .line 284
    aput v7, v3, v0

    .line 285
    .line 286
    aput v2, v3, v9

    .line 287
    .line 288
    aget v2, v3, p3

    .line 289
    .line 290
    const/high16 v6, 0x43c80000    # 400.0f

    .line 291
    .line 292
    mul-float v7, v2, v6

    .line 293
    .line 294
    .line 295
    const v8, 0x41d90a3d    # 27.13f

    .line 296
    add-float/2addr v2, v8

    .line 297
    div-float/2addr v7, v2

    .line 298
    .line 299
    aget v2, v3, v0

    .line 300
    .line 301
    mul-float v10, v2, v6

    .line 302
    add-float/2addr v2, v8

    .line 303
    div-float/2addr v10, v2

    .line 304
    .line 305
    aget v2, v3, v9

    .line 306
    mul-float/2addr v6, v2

    .line 307
    add-float/2addr v2, v8

    .line 308
    div-float/2addr v6, v2

    .line 309
    .line 310
    new-array v1, v1, [F

    .line 311
    .line 312
    aput v7, v1, p3

    .line 313
    .line 314
    aput v10, v1, v0

    .line 315
    .line 316
    aput v6, v1, v9

    .line 317
    .line 318
    const/high16 v2, 0x40000000    # 2.0f

    .line 319
    .line 320
    aget v3, v1, p3

    .line 321
    mul-float/2addr v3, v2

    .line 322
    .line 323
    aget v0, v1, v0

    .line 324
    add-float/2addr v3, v0

    .line 325
    .line 326
    .line 327
    const v0, 0x3d4ccccd    # 0.05f

    .line 328
    .line 329
    aget v1, v1, v9

    .line 330
    mul-float/2addr v1, v0

    .line 331
    add-float/2addr v3, v1

    .line 332
    .line 333
    mul-float v14, v3, v4

    .line 334
    .line 335
    new-instance v0, Landroidx/core/content/res/ViewingConditions;

    .line 336
    float-to-double v1, v12

    .line 337
    .line 338
    const-wide/high16 v6, 0x3fd0000000000000L    # 0.25

    .line 339
    .line 340
    .line 341
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 342
    move-result-wide v1

    .line 343
    double-to-float v1, v1

    .line 344
    .line 345
    move/from16 v16, v4

    .line 346
    .line 347
    move/from16 v21, v1

    .line 348
    move v15, v4

    .line 349
    .line 350
    move/from16 v18, v5

    .line 351
    .line 352
    move/from16 v20, v12

    .line 353
    move-object v12, v0

    .line 354
    .line 355
    .line 356
    invoke-direct/range {v12 .. v22}, Landroidx/core/content/res/ViewingConditions;-><init>(FFFFFF[FFFF)V

    .line 357
    return-object v12
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


# virtual methods
.method public getAw()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mAw:F

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
.end method

.method public getC()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mC:F

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
.end method

.method public getFl()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mFl:F

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
.end method

.method public getFlRoot()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mFlRoot:F

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
.end method

.method public getN()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mN:F

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
.end method

.method public getNbb()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mNbb:F

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
.end method

.method public getNc()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mNc:F

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
.end method

.method public getNcb()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mNcb:F

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
.end method

.method public getRgbD()[F
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/core/content/res/ViewingConditions;->mRgbD:[F

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
    .line 19
    .line 20
.end method

.method public getZ()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/core/content/res/ViewingConditions;->mZ:F

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
.end method
