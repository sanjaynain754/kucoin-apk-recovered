.class public Lcom/wang/avi/indicators/BallTrianglePathIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallTrianglePathIndicator.java"


# instance fields
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
    const/4 v0, 0x3

    .line 5
    .line 6
    new-array v1, v0, [F

    .line 7
    .line 8
    iput-object v1, p0, Lcom/wang/avi/indicators/BallTrianglePathIndicator;->translateX:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    iput-object v0, p0, Lcom/wang/avi/indicators/BallTrianglePathIndicator;->translateY:[F

    .line 13
    return-void
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    .line 2
    const/high16 v0, 0x40400000    # 3.0f

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    const/4 v1, 0x3

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/wang/avi/indicators/BallTrianglePathIndicator;->translateX:[F

    .line 20
    .line 21
    aget v1, v1, v0

    .line 22
    .line 23
    iget-object v2, p0, Lcom/wang/avi/indicators/BallTrianglePathIndicator;->translateY:[F

    .line 24
    .line 25
    aget v2, v2, v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 32
    move-result v1

    .line 33
    .line 34
    div-int/lit8 v1, v1, 0xa

    .line 35
    int-to-float v1, v1

    .line 36
    const/4 v2, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v2, v2, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
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

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/animation/ValueAnimator;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x1

    .line 5
    .line 6
    new-instance v4, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 13
    move-result v5

    .line 14
    .line 15
    div-int/lit8 v5, v5, 0x5

    .line 16
    int-to-float v5, v5

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 20
    move-result v6

    .line 21
    .line 22
    div-int/lit8 v6, v6, 0x5

    .line 23
    int-to-float v6, v6

    .line 24
    const/4 v7, 0x0

    .line 25
    move v8, v7

    .line 26
    .line 27
    :goto_0
    if-ge v8, v2, :cond_4

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 31
    move-result v9

    .line 32
    div-int/2addr v9, v1

    .line 33
    int-to-float v9, v9

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 37
    move-result v10

    .line 38
    int-to-float v10, v10

    .line 39
    sub-float/2addr v10, v5

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 43
    move-result v11

    .line 44
    div-int/2addr v11, v1

    .line 45
    int-to-float v11, v11

    .line 46
    .line 47
    new-array v12, v0, [F

    .line 48
    .line 49
    aput v9, v12, v7

    .line 50
    .line 51
    aput v10, v12, v3

    .line 52
    .line 53
    aput v5, v12, v1

    .line 54
    .line 55
    aput v11, v12, v2

    .line 56
    .line 57
    .line 58
    invoke-static {v12}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 59
    move-result-object v9

    .line 60
    .line 61
    if-ne v8, v3, :cond_0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 65
    move-result v9

    .line 66
    int-to-float v9, v9

    .line 67
    sub-float/2addr v9, v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 71
    move-result v10

    .line 72
    div-int/2addr v10, v1

    .line 73
    int-to-float v10, v10

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 77
    move-result v11

    .line 78
    int-to-float v11, v11

    .line 79
    sub-float/2addr v11, v5

    .line 80
    .line 81
    new-array v12, v0, [F

    .line 82
    .line 83
    aput v9, v12, v7

    .line 84
    .line 85
    aput v5, v12, v3

    .line 86
    .line 87
    aput v10, v12, v1

    .line 88
    .line 89
    aput v11, v12, v2

    .line 90
    .line 91
    .line 92
    invoke-static {v12}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 93
    move-result-object v9

    .line 94
    goto :goto_1

    .line 95
    .line 96
    :cond_0
    if-ne v8, v1, :cond_1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 100
    move-result v9

    .line 101
    div-int/2addr v9, v1

    .line 102
    int-to-float v9, v9

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 106
    move-result v10

    .line 107
    int-to-float v10, v10

    .line 108
    sub-float/2addr v10, v5

    .line 109
    .line 110
    new-array v11, v0, [F

    .line 111
    .line 112
    aput v5, v11, v7

    .line 113
    .line 114
    aput v9, v11, v3

    .line 115
    .line 116
    aput v10, v11, v1

    .line 117
    .line 118
    aput v5, v11, v2

    .line 119
    .line 120
    .line 121
    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 122
    move-result-object v9

    .line 123
    .line 124
    .line 125
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 126
    move-result v10

    .line 127
    int-to-float v10, v10

    .line 128
    sub-float/2addr v10, v6

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 132
    move-result v11

    .line 133
    int-to-float v11, v11

    .line 134
    sub-float/2addr v11, v6

    .line 135
    .line 136
    new-array v12, v0, [F

    .line 137
    .line 138
    aput v6, v12, v7

    .line 139
    .line 140
    aput v10, v12, v3

    .line 141
    .line 142
    aput v11, v12, v1

    .line 143
    .line 144
    aput v6, v12, v2

    .line 145
    .line 146
    .line 147
    invoke-static {v12}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 148
    move-result-object v10

    .line 149
    .line 150
    if-ne v8, v3, :cond_2

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 154
    move-result v10

    .line 155
    int-to-float v10, v10

    .line 156
    sub-float/2addr v10, v6

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 160
    move-result v11

    .line 161
    int-to-float v11, v11

    .line 162
    sub-float/2addr v11, v6

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 166
    move-result v12

    .line 167
    int-to-float v12, v12

    .line 168
    sub-float/2addr v12, v6

    .line 169
    .line 170
    new-array v13, v0, [F

    .line 171
    .line 172
    aput v10, v13, v7

    .line 173
    .line 174
    aput v11, v13, v3

    .line 175
    .line 176
    aput v6, v13, v1

    .line 177
    .line 178
    aput v12, v13, v2

    .line 179
    .line 180
    .line 181
    invoke-static {v13}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 182
    move-result-object v10

    .line 183
    goto :goto_2

    .line 184
    .line 185
    :cond_2
    if-ne v8, v1, :cond_3

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 189
    move-result v10

    .line 190
    int-to-float v10, v10

    .line 191
    sub-float/2addr v10, v6

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 195
    move-result v11

    .line 196
    int-to-float v11, v11

    .line 197
    sub-float/2addr v11, v6

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 201
    move-result v12

    .line 202
    int-to-float v12, v12

    .line 203
    sub-float/2addr v12, v6

    .line 204
    .line 205
    new-array v13, v0, [F

    .line 206
    .line 207
    aput v10, v13, v7

    .line 208
    .line 209
    aput v6, v13, v3

    .line 210
    .line 211
    aput v11, v13, v1

    .line 212
    .line 213
    aput v12, v13, v2

    .line 214
    .line 215
    .line 216
    invoke-static {v13}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 217
    move-result-object v10

    .line 218
    .line 219
    :cond_3
    :goto_2
    const-wide/16 v11, 0x7d0

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 223
    .line 224
    new-instance v13, Landroid/view/animation/LinearInterpolator;

    .line 225
    .line 226
    .line 227
    invoke-direct {v13}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9, v13}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 231
    const/4 v13, -0x1

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9, v13}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 235
    .line 236
    new-instance v14, Lcom/wang/avi/indicators/BallTrianglePathIndicator$1;

    .line 237
    .line 238
    .line 239
    invoke-direct {v14, p0, v8}, Lcom/wang/avi/indicators/BallTrianglePathIndicator$1;-><init>(Lcom/wang/avi/indicators/BallTrianglePathIndicator;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v9, v14}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 246
    .line 247
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    .line 248
    .line 249
    .line 250
    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v10, v13}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 257
    .line 258
    new-instance v11, Lcom/wang/avi/indicators/BallTrianglePathIndicator$2;

    .line 259
    .line 260
    .line 261
    invoke-direct {v11, p0, v8}, Lcom/wang/avi/indicators/BallTrianglePathIndicator$2;-><init>(Lcom/wang/avi/indicators/BallTrianglePathIndicator;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, v10, v11}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    add-int/2addr v8, v3

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    :cond_4
    return-object v4
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
.end method
