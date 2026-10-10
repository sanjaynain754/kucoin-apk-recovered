.class public Lcom/wang/avi/indicators/BallPulseSyncIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallPulseSyncIndicator.java"


# instance fields
.field translateYFloats:[F


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
    iput-object v0, p0, Lcom/wang/avi/indicators/BallPulseSyncIndicator;->translateYFloats:[F

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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 7

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
    const/4 v4, 0x0

    .line 28
    :goto_0
    const/4 v5, 0x3

    .line 29
    .line 30
    if-ge v4, v5, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 34
    int-to-float v5, v4

    .line 35
    .line 36
    mul-float v6, v2, v5

    .line 37
    add-float/2addr v6, v1

    .line 38
    mul-float/2addr v5, v3

    .line 39
    add-float/2addr v6, v5

    .line 40
    .line 41
    iget-object v5, p0, Lcom/wang/avi/indicators/BallPulseSyncIndicator;->translateYFloats:[F

    .line 42
    .line 43
    aget v5, v5, v4

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 47
    const/4 v5, 0x0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v5, v5, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
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
.end method

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/animation/ValueAnimator;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x3

    .line 4
    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 12
    move-result v4

    .line 13
    int-to-float v4, v4

    .line 14
    .line 15
    const/high16 v5, 0x41000000    # 8.0f

    .line 16
    sub-float/2addr v4, v5

    .line 17
    .line 18
    const/high16 v5, 0x40c00000    # 6.0f

    .line 19
    div-float/2addr v4, v5

    .line 20
    .line 21
    const/16 v5, 0x8c

    .line 22
    .line 23
    const/16 v6, 0xd2

    .line 24
    .line 25
    const/16 v7, 0x46

    .line 26
    .line 27
    .line 28
    filled-new-array {v7, v5, v6}, [I

    .line 29
    move-result-object v5

    .line 30
    const/4 v6, 0x0

    .line 31
    move v7, v6

    .line 32
    .line 33
    :goto_0
    if-ge v7, v2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 37
    move-result v8

    .line 38
    div-int/2addr v8, v1

    .line 39
    int-to-float v8, v8

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 43
    move-result v9

    .line 44
    div-int/2addr v9, v1

    .line 45
    int-to-float v9, v9

    .line 46
    .line 47
    const/high16 v10, 0x40000000    # 2.0f

    .line 48
    mul-float/2addr v10, v4

    .line 49
    sub-float/2addr v9, v10

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 53
    move-result v10

    .line 54
    div-int/2addr v10, v1

    .line 55
    int-to-float v10, v10

    .line 56
    .line 57
    new-array v11, v2, [F

    .line 58
    .line 59
    aput v8, v11, v6

    .line 60
    .line 61
    aput v9, v11, v0

    .line 62
    .line 63
    aput v10, v11, v1

    .line 64
    .line 65
    .line 66
    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 67
    move-result-object v8

    .line 68
    .line 69
    const-wide/16 v9, 0x258

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v9, v10}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 73
    const/4 v9, -0x1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v9}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 77
    .line 78
    aget v9, v5, v7

    .line 79
    int-to-long v9, v9

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, v9, v10}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 83
    .line 84
    new-instance v9, Lcom/wang/avi/indicators/BallPulseSyncIndicator$1;

    .line 85
    .line 86
    .line 87
    invoke-direct {v9, p0, v7}, Lcom/wang/avi/indicators/BallPulseSyncIndicator$1;-><init>(Lcom/wang/avi/indicators/BallPulseSyncIndicator;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v8, v9}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    add-int/2addr v7, v0

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    return-object v3
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
.end method
