.class public Lcom/wang/avi/indicators/CubeTransitionIndicator;
.super Lcom/wang/avi/Indicator;
.source "CubeTransitionIndicator.java"


# instance fields
.field degrees:F

.field scaleFloat:F

.field translateX:[F

.field translateY:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/wang/avi/Indicator;-><init>()V

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    new-array v1, v0, [F

    .line 7
    .line 8
    iput-object v1, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->translateX:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    iput-object v0, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->translateY:[F

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    iput v0, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->scaleFloat:F

    .line 17
    return-void
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    div-int/lit8 v0, v0, 0x5

    .line 7
    int-to-float v0, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 11
    move-result v1

    .line 12
    .line 13
    div-int/lit8 v1, v1, 0x5

    .line 14
    int-to-float v1, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    const/4 v3, 0x2

    .line 17
    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 22
    .line 23
    iget-object v3, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->translateX:[F

    .line 24
    .line 25
    aget v3, v3, v2

    .line 26
    .line 27
    iget-object v4, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->translateY:[F

    .line 28
    .line 29
    aget v4, v4, v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 33
    .line 34
    iget v3, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->degrees:F

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 38
    .line 39
    iget v3, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->scaleFloat:F

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v3, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 43
    .line 44
    new-instance v3, Landroid/graphics/RectF;

    .line 45
    neg-float v4, v0

    .line 46
    .line 47
    const/high16 v5, 0x40000000    # 2.0f

    .line 48
    div-float/2addr v4, v5

    .line 49
    neg-float v6, v1

    .line 50
    div-float/2addr v6, v5

    .line 51
    .line 52
    div-float v7, v0, v5

    .line 53
    .line 54
    div-float v5, v1, v5

    .line 55
    .line 56
    .line 57
    invoke-direct {v3, v4, v6, v7, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
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

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/animation/ValueAnimator;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x2

    .line 5
    const/4 v4, 0x1

    .line 6
    .line 7
    new-instance v5, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 14
    move-result v6

    .line 15
    const/4 v7, 0x5

    .line 16
    div-int/2addr v6, v7

    .line 17
    int-to-float v6, v6

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 21
    move-result v8

    .line 22
    div-int/2addr v8, v7

    .line 23
    int-to-float v8, v8

    .line 24
    const/4 v9, 0x0

    .line 25
    move v10, v9

    .line 26
    :goto_0
    const/4 v11, -0x1

    .line 27
    .line 28
    const-wide/16 v12, 0x640

    .line 29
    .line 30
    if-ge v10, v3, :cond_2

    .line 31
    .line 32
    iget-object v14, v0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->translateX:[F

    .line 33
    .line 34
    aput v6, v14, v10

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 38
    move-result v14

    .line 39
    int-to-float v14, v14

    .line 40
    sub-float/2addr v14, v6

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 44
    move-result v15

    .line 45
    int-to-float v15, v15

    .line 46
    sub-float/2addr v15, v6

    .line 47
    .line 48
    const/16 v16, 0x4

    .line 49
    .line 50
    new-array v1, v7, [F

    .line 51
    .line 52
    aput v6, v1, v9

    .line 53
    .line 54
    aput v14, v1, v4

    .line 55
    .line 56
    aput v15, v1, v3

    .line 57
    .line 58
    aput v6, v1, v2

    .line 59
    .line 60
    aput v6, v1, v16

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    if-ne v10, v4, :cond_0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 70
    move-result v1

    .line 71
    int-to-float v1, v1

    .line 72
    sub-float/2addr v1, v6

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 76
    move-result v14

    .line 77
    int-to-float v14, v14

    .line 78
    sub-float/2addr v14, v6

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 82
    move-result v15

    .line 83
    int-to-float v15, v15

    .line 84
    sub-float/2addr v15, v6

    .line 85
    .line 86
    move/from16 v17, v2

    .line 87
    .line 88
    new-array v2, v7, [F

    .line 89
    .line 90
    aput v1, v2, v9

    .line 91
    .line 92
    aput v6, v2, v4

    .line 93
    .line 94
    aput v6, v2, v3

    .line 95
    .line 96
    aput v14, v2, v17

    .line 97
    .line 98
    aput v15, v2, v16

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_0
    move/from16 v17, v2

    .line 106
    .line 107
    :goto_1
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 108
    .line 109
    .line 110
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v12, v13}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 120
    .line 121
    new-instance v2, Lcom/wang/avi/indicators/CubeTransitionIndicator$1;

    .line 122
    .line 123
    .line 124
    invoke-direct {v2, v0, v10}, Lcom/wang/avi/indicators/CubeTransitionIndicator$1;-><init>(Lcom/wang/avi/indicators/CubeTransitionIndicator;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 128
    .line 129
    iget-object v2, v0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->translateY:[F

    .line 130
    .line 131
    aput v8, v2, v10

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 135
    move-result v2

    .line 136
    int-to-float v2, v2

    .line 137
    sub-float/2addr v2, v8

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 141
    move-result v14

    .line 142
    int-to-float v14, v14

    .line 143
    sub-float/2addr v14, v8

    .line 144
    .line 145
    new-array v15, v7, [F

    .line 146
    .line 147
    aput v8, v15, v9

    .line 148
    .line 149
    aput v8, v15, v4

    .line 150
    .line 151
    aput v2, v15, v3

    .line 152
    .line 153
    aput v14, v15, v17

    .line 154
    .line 155
    aput v8, v15, v16

    .line 156
    .line 157
    .line 158
    invoke-static {v15}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    if-ne v10, v4, :cond_1

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 165
    move-result v2

    .line 166
    int-to-float v2, v2

    .line 167
    sub-float/2addr v2, v8

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 171
    move-result v14

    .line 172
    int-to-float v14, v14

    .line 173
    sub-float/2addr v14, v8

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 177
    move-result v15

    .line 178
    int-to-float v15, v15

    .line 179
    sub-float/2addr v15, v8

    .line 180
    .line 181
    move/from16 v18, v3

    .line 182
    .line 183
    new-array v3, v7, [F

    .line 184
    .line 185
    aput v2, v3, v9

    .line 186
    .line 187
    aput v14, v3, v4

    .line 188
    .line 189
    aput v8, v3, v18

    .line 190
    .line 191
    aput v8, v3, v17

    .line 192
    .line 193
    aput v15, v3, v16

    .line 194
    .line 195
    .line 196
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 197
    move-result-object v2

    .line 198
    goto :goto_2

    .line 199
    .line 200
    :cond_1
    move/from16 v18, v3

    .line 201
    .line 202
    .line 203
    :goto_2
    invoke-virtual {v2, v12, v13}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 204
    .line 205
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    .line 206
    .line 207
    .line 208
    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 215
    .line 216
    new-instance v3, Lcom/wang/avi/indicators/CubeTransitionIndicator$2;

    .line 217
    .line 218
    .line 219
    invoke-direct {v3, v0, v10}, Lcom/wang/avi/indicators/CubeTransitionIndicator$2;-><init>(Lcom/wang/avi/indicators/CubeTransitionIndicator;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v2, v3}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    add-int/2addr v10, v4

    .line 230
    .line 231
    move/from16 v2, v17

    .line 232
    .line 233
    move/from16 v3, v18

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_2
    new-array v1, v7, [F

    .line 238
    .line 239
    .line 240
    fill-array-data v1, :array_0

    .line 241
    .line 242
    .line 243
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 244
    move-result-object v1

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v12, v13}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 248
    .line 249
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 250
    .line 251
    .line 252
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 259
    .line 260
    new-instance v2, Lcom/wang/avi/indicators/CubeTransitionIndicator$3;

    .line 261
    .line 262
    .line 263
    invoke-direct {v2, v0}, Lcom/wang/avi/indicators/CubeTransitionIndicator$3;-><init>(Lcom/wang/avi/indicators/CubeTransitionIndicator;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1, v2}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 267
    .line 268
    new-array v2, v7, [F

    .line 269
    .line 270
    .line 271
    fill-array-data v2, :array_1

    .line 272
    .line 273
    .line 274
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 275
    move-result-object v2

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v12, v13}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 279
    .line 280
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    .line 281
    .line 282
    .line 283
    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 290
    .line 291
    new-instance v3, Lcom/wang/avi/indicators/CubeTransitionIndicator$4;

    .line 292
    .line 293
    .line 294
    invoke-direct {v3, v0}, Lcom/wang/avi/indicators/CubeTransitionIndicator$4;-><init>(Lcom/wang/avi/indicators/CubeTransitionIndicator;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v2, v3}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    return-object v5

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
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    :array_1
    .array-data 4
        0x0
        0x43340000    # 180.0f
        0x43b40000    # 360.0f
        0x44070000    # 540.0f
        0x44340000    # 720.0f
    .end array-data
.end method
