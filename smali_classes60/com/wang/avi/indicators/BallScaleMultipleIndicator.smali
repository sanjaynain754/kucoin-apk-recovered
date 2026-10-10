.class public Lcom/wang/avi/indicators/BallScaleMultipleIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallScaleMultipleIndicator.java"


# instance fields
.field alphaInts:[I

.field scaleFloats:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/wang/avi/Indicator;-><init>()V

    .line 4
    const/4 v0, 0x3

    .line 5
    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/wang/avi/indicators/BallScaleMultipleIndicator;->scaleFloats:[F

    .line 12
    .line 13
    const/16 v0, 0xff

    .line 14
    .line 15
    .line 16
    filled-new-array {v0, v0, v0}, [I

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/wang/avi/indicators/BallScaleMultipleIndicator;->alphaInts:[I

    .line 20
    return-void

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
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
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
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x3

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/wang/avi/indicators/BallScaleMultipleIndicator;->alphaInts:[I

    .line 7
    .line 8
    aget v1, v1, v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    .line 13
    iget-object v1, p0, Lcom/wang/avi/indicators/BallScaleMultipleIndicator;->scaleFloats:[F

    .line 14
    .line 15
    aget v1, v1, v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 19
    move-result v2

    .line 20
    .line 21
    div-int/lit8 v2, v2, 0x2

    .line 22
    int-to-float v2, v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 26
    move-result v3

    .line 27
    .line 28
    div-int/lit8 v3, v3, 0x2

    .line 29
    int-to-float v3, v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, v1, v2, v3}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 36
    move-result v1

    .line 37
    .line 38
    div-int/lit8 v1, v1, 0x2

    .line 39
    int-to-float v1, v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 43
    move-result v2

    .line 44
    .line 45
    div-int/lit8 v2, v2, 0x2

    .line 46
    int-to-float v2, v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 50
    move-result v3

    .line 51
    .line 52
    div-int/lit8 v3, v3, 0x2

    .line 53
    int-to-float v3, v3

    .line 54
    .line 55
    const/high16 v4, 0x40800000    # 4.0f

    .line 56
    sub-float/2addr v3, v4

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1, v2, v3, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
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
    .locals 11
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
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x3

    .line 7
    .line 8
    new-array v2, v1, [J

    .line 9
    .line 10
    .line 11
    fill-array-data v2, :array_0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    .line 15
    :goto_0
    if-ge v4, v1, :cond_0

    .line 16
    const/4 v5, 0x2

    .line 17
    .line 18
    new-array v5, v5, [F

    .line 19
    .line 20
    .line 21
    fill-array-data v5, :array_1

    .line 22
    .line 23
    .line 24
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 25
    move-result-object v5

    .line 26
    .line 27
    new-instance v6, Landroid/view/animation/LinearInterpolator;

    .line 28
    .line 29
    .line 30
    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 34
    .line 35
    const-wide/16 v6, 0x3e8

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 39
    const/4 v8, -0x1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v8}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 43
    .line 44
    new-instance v9, Lcom/wang/avi/indicators/BallScaleMultipleIndicator$1;

    .line 45
    .line 46
    .line 47
    invoke-direct {v9, p0, v4}, Lcom/wang/avi/indicators/BallScaleMultipleIndicator$1;-><init>(Lcom/wang/avi/indicators/BallScaleMultipleIndicator;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v5, v9}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 51
    .line 52
    aget-wide v9, v2, v4

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v9, v10}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 56
    .line 57
    const/16 v9, 0xff

    .line 58
    .line 59
    .line 60
    filled-new-array {v9, v3}, [I

    .line 61
    move-result-object v9

    .line 62
    .line 63
    .line 64
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 65
    move-result-object v9

    .line 66
    .line 67
    new-instance v10, Landroid/view/animation/LinearInterpolator;

    .line 68
    .line 69
    .line 70
    invoke-direct {v10}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v10}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, v8}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 80
    .line 81
    new-instance v6, Lcom/wang/avi/indicators/BallScaleMultipleIndicator$2;

    .line 82
    .line 83
    .line 84
    invoke-direct {v6, p0, v4}, Lcom/wang/avi/indicators/BallScaleMultipleIndicator$2;-><init>(Lcom/wang/avi/indicators/BallScaleMultipleIndicator;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v9, v6}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 88
    .line 89
    aget-wide v6, v2, v4

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-object v0

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
    :array_0
    .array-data 8
        0x0
        0xc8
        0x190
    .end array-data

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
.end method
