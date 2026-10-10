.class public Lcom/wang/avi/indicators/BallBeatIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallBeatIndicator.java"


# static fields
.field public static final ALPHA:I = 0xff

.field public static final SCALE:F = 1.0f


# instance fields
.field alphas:[I

.field private scaleFloats:[F


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
    iput-object v0, p0, Lcom/wang/avi/indicators/BallBeatIndicator;->scaleFloats:[F

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
    iput-object v0, p0, Lcom/wang/avi/indicators/BallBeatIndicator;->alphas:[I

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

.method public static synthetic access$000(Lcom/wang/avi/indicators/BallBeatIndicator;)[F
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/wang/avi/indicators/BallBeatIndicator;->scaleFloats:[F

    .line 3
    return-object p0
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
    int-to-float v0, v0

    .line 6
    .line 7
    const/high16 v1, 0x41000000    # 8.0f

    .line 8
    sub-float/2addr v0, v1

    .line 9
    .line 10
    const/high16 v1, 0x40c00000    # 6.0f

    .line 11
    div-float/2addr v0, v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 15
    move-result v1

    .line 16
    .line 17
    div-int/lit8 v1, v1, 0x2

    .line 18
    int-to-float v1, v1

    .line 19
    .line 20
    const/high16 v2, 0x40000000    # 2.0f

    .line 21
    mul-float/2addr v2, v0

    .line 22
    .line 23
    const/high16 v3, 0x40800000    # 4.0f

    .line 24
    .line 25
    add-float v4, v2, v3

    .line 26
    sub-float/2addr v1, v4

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 30
    move-result v4

    .line 31
    .line 32
    div-int/lit8 v4, v4, 0x2

    .line 33
    int-to-float v4, v4

    .line 34
    const/4 v5, 0x0

    .line 35
    :goto_0
    const/4 v6, 0x3

    .line 36
    .line 37
    if-ge v5, v6, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 41
    int-to-float v6, v5

    .line 42
    .line 43
    mul-float v7, v2, v6

    .line 44
    add-float/2addr v7, v1

    .line 45
    mul-float/2addr v6, v3

    .line 46
    add-float/2addr v7, v6

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 50
    .line 51
    iget-object v6, p0, Lcom/wang/avi/indicators/BallBeatIndicator;->scaleFloats:[F

    .line 52
    .line 53
    aget v6, v6, v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v6, v6}, Landroid/graphics/Canvas;->scale(FF)V

    .line 57
    .line 58
    iget-object v6, p0, Lcom/wang/avi/indicators/BallBeatIndicator;->alphas:[I

    .line 59
    .line 60
    aget v6, v6, v5

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 64
    const/4 v6, 0x0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v6, v6, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 71
    .line 72
    add-int/lit8 v5, v5, 0x1

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 10
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
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    const/16 v2, 0x15e

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    filled-new-array {v2, v3, v2}, [I

    .line 13
    move-result-object v2

    .line 14
    .line 15
    :goto_0
    if-ge v3, v0, :cond_0

    .line 16
    .line 17
    new-array v4, v0, [F

    .line 18
    .line 19
    .line 20
    fill-array-data v4, :array_0

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    const-wide/16 v5, 0x2bc

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 30
    const/4 v7, -0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v7}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 34
    .line 35
    aget v8, v2, v3

    .line 36
    int-to-long v8, v8

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v8, v9}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 40
    .line 41
    new-instance v8, Lcom/wang/avi/indicators/BallBeatIndicator$1;

    .line 42
    .line 43
    .line 44
    invoke-direct {v8, p0, v3}, Lcom/wang/avi/indicators/BallBeatIndicator$1;-><init>(Lcom/wang/avi/indicators/BallBeatIndicator;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v4, v8}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 48
    .line 49
    const/16 v8, 0x33

    .line 50
    .line 51
    const/16 v9, 0xff

    .line 52
    .line 53
    .line 54
    filled-new-array {v9, v8, v9}, [I

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 59
    move-result-object v8

    .line 60
    .line 61
    .line 62
    invoke-virtual {v8, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8, v7}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 66
    .line 67
    aget v5, v2, v3

    .line 68
    int-to-long v5, v5

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v5, v6}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 72
    .line 73
    new-instance v5, Lcom/wang/avi/indicators/BallBeatIndicator$2;

    .line 74
    .line 75
    .line 76
    invoke-direct {v5, p0, v3}, Lcom/wang/avi/indicators/BallBeatIndicator$2;-><init>(Lcom/wang/avi/indicators/BallBeatIndicator;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v8, v5}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    return-object v1

    .line 90
    nop

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
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
    .end array-data
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
.end method
