.class public Lcom/wang/avi/indicators/BallZigZagIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallZigZagIndicator.java"


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
    const/4 v0, 0x2

    .line 5
    .line 6
    new-array v1, v0, [F

    .line 7
    .line 8
    iput-object v1, p0, Lcom/wang/avi/indicators/BallZigZagIndicator;->translateX:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    iput-object v0, p0, Lcom/wang/avi/indicators/BallZigZagIndicator;->translateY:[F

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
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/wang/avi/indicators/BallZigZagIndicator;->translateX:[F

    .line 10
    .line 11
    aget v1, v1, v0

    .line 12
    .line 13
    iget-object v2, p0, Lcom/wang/avi/indicators/BallZigZagIndicator;->translateY:[F

    .line 14
    .line 15
    aget v2, v2, v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 22
    move-result v1

    .line 23
    .line 24
    div-int/lit8 v1, v1, 0xa

    .line 25
    int-to-float v1, v1

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v2, v2, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
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
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x2

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
    div-int/lit8 v5, v5, 0x6

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
    div-int/lit8 v6, v6, 0x6

    .line 23
    int-to-float v6, v6

    .line 24
    const/4 v7, 0x0

    .line 25
    move v8, v7

    .line 26
    .line 27
    :goto_0
    if-ge v8, v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 31
    move-result v9

    .line 32
    int-to-float v9, v9

    .line 33
    sub-float/2addr v9, v5

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 37
    move-result v10

    .line 38
    div-int/2addr v10, v2

    .line 39
    int-to-float v10, v10

    .line 40
    .line 41
    new-array v11, v1, [F

    .line 42
    .line 43
    aput v5, v11, v7

    .line 44
    .line 45
    aput v9, v11, v3

    .line 46
    .line 47
    aput v10, v11, v2

    .line 48
    .line 49
    aput v5, v11, v0

    .line 50
    .line 51
    .line 52
    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 53
    move-result-object v9

    .line 54
    .line 55
    if-ne v8, v3, :cond_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 59
    move-result v9

    .line 60
    int-to-float v9, v9

    .line 61
    sub-float/2addr v9, v5

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 65
    move-result v10

    .line 66
    div-int/2addr v10, v2

    .line 67
    int-to-float v10, v10

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 71
    move-result v11

    .line 72
    int-to-float v11, v11

    .line 73
    sub-float/2addr v11, v5

    .line 74
    .line 75
    new-array v12, v1, [F

    .line 76
    .line 77
    aput v9, v12, v7

    .line 78
    .line 79
    aput v5, v12, v3

    .line 80
    .line 81
    aput v10, v12, v2

    .line 82
    .line 83
    aput v11, v12, v0

    .line 84
    .line 85
    .line 86
    invoke-static {v12}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 87
    move-result-object v9

    .line 88
    .line 89
    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 91
    move-result v10

    .line 92
    div-int/2addr v10, v2

    .line 93
    int-to-float v10, v10

    .line 94
    .line 95
    new-array v11, v1, [F

    .line 96
    .line 97
    aput v6, v11, v7

    .line 98
    .line 99
    aput v6, v11, v3

    .line 100
    .line 101
    aput v10, v11, v2

    .line 102
    .line 103
    aput v6, v11, v0

    .line 104
    .line 105
    .line 106
    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 107
    move-result-object v10

    .line 108
    .line 109
    if-ne v8, v3, :cond_1

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 113
    move-result v10

    .line 114
    int-to-float v10, v10

    .line 115
    sub-float/2addr v10, v6

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 119
    move-result v11

    .line 120
    int-to-float v11, v11

    .line 121
    sub-float/2addr v11, v6

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 125
    move-result v12

    .line 126
    div-int/2addr v12, v2

    .line 127
    int-to-float v12, v12

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 131
    move-result v13

    .line 132
    int-to-float v13, v13

    .line 133
    sub-float/2addr v13, v6

    .line 134
    .line 135
    new-array v14, v1, [F

    .line 136
    .line 137
    aput v10, v14, v7

    .line 138
    .line 139
    aput v11, v14, v3

    .line 140
    .line 141
    aput v12, v14, v2

    .line 142
    .line 143
    aput v13, v14, v0

    .line 144
    .line 145
    .line 146
    invoke-static {v14}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 147
    move-result-object v10

    .line 148
    .line 149
    :cond_1
    const-wide/16 v11, 0x3e8

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 153
    .line 154
    new-instance v13, Landroid/view/animation/LinearInterpolator;

    .line 155
    .line 156
    .line 157
    invoke-direct {v13}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v13}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 161
    const/4 v13, -0x1

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9, v13}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 165
    .line 166
    new-instance v14, Lcom/wang/avi/indicators/BallZigZagIndicator$1;

    .line 167
    .line 168
    .line 169
    invoke-direct {v14, p0, v8}, Lcom/wang/avi/indicators/BallZigZagIndicator$1;-><init>(Lcom/wang/avi/indicators/BallZigZagIndicator;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v9, v14}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 176
    .line 177
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    .line 178
    .line 179
    .line 180
    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v10, v13}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 187
    .line 188
    new-instance v11, Lcom/wang/avi/indicators/BallZigZagIndicator$2;

    .line 189
    .line 190
    .line 191
    invoke-direct {v11, p0, v8}, Lcom/wang/avi/indicators/BallZigZagIndicator$2;-><init>(Lcom/wang/avi/indicators/BallZigZagIndicator;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v10, v11}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    add-int/2addr v8, v3

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    :cond_2
    return-object v4
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
