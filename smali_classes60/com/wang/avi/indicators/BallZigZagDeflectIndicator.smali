.class public Lcom/wang/avi/indicators/BallZigZagDeflectIndicator;
.super Lcom/wang/avi/indicators/BallZigZagIndicator;
.source "BallZigZagDeflectIndicator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/wang/avi/indicators/BallZigZagIndicator;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 16
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
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    .line 9
    new-instance v6, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 16
    move-result v7

    .line 17
    .line 18
    div-int/lit8 v7, v7, 0x6

    .line 19
    int-to-float v7, v7

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 23
    move-result v8

    .line 24
    .line 25
    div-int/lit8 v8, v8, 0x6

    .line 26
    int-to-float v8, v8

    .line 27
    const/4 v9, 0x0

    .line 28
    move v10, v9

    .line 29
    .line 30
    :goto_0
    if-ge v10, v4, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 34
    move-result v11

    .line 35
    int-to-float v11, v11

    .line 36
    sub-float/2addr v11, v7

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 40
    move-result v12

    .line 41
    int-to-float v12, v12

    .line 42
    sub-float/2addr v12, v7

    .line 43
    .line 44
    new-array v13, v3, [F

    .line 45
    .line 46
    aput v7, v13, v9

    .line 47
    .line 48
    aput v11, v13, v5

    .line 49
    .line 50
    aput v7, v13, v4

    .line 51
    .line 52
    aput v12, v13, v2

    .line 53
    .line 54
    aput v7, v13, v1

    .line 55
    .line 56
    .line 57
    invoke-static {v13}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 58
    move-result-object v11

    .line 59
    .line 60
    if-ne v10, v5, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 64
    move-result v11

    .line 65
    int-to-float v11, v11

    .line 66
    sub-float/2addr v11, v7

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 70
    move-result v12

    .line 71
    int-to-float v12, v12

    .line 72
    sub-float/2addr v12, v7

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 76
    move-result v13

    .line 77
    int-to-float v13, v13

    .line 78
    sub-float/2addr v13, v7

    .line 79
    .line 80
    new-array v14, v3, [F

    .line 81
    .line 82
    aput v11, v14, v9

    .line 83
    .line 84
    aput v7, v14, v5

    .line 85
    .line 86
    aput v12, v14, v4

    .line 87
    .line 88
    aput v7, v14, v2

    .line 89
    .line 90
    aput v13, v14, v1

    .line 91
    .line 92
    .line 93
    invoke-static {v14}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 94
    move-result-object v11

    .line 95
    .line 96
    .line 97
    :cond_0
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 98
    move-result v12

    .line 99
    int-to-float v12, v12

    .line 100
    sub-float/2addr v12, v8

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 104
    move-result v13

    .line 105
    int-to-float v13, v13

    .line 106
    sub-float/2addr v13, v8

    .line 107
    .line 108
    new-array v14, v3, [F

    .line 109
    .line 110
    aput v8, v14, v9

    .line 111
    .line 112
    aput v8, v14, v5

    .line 113
    .line 114
    aput v12, v14, v4

    .line 115
    .line 116
    aput v13, v14, v2

    .line 117
    .line 118
    aput v8, v14, v1

    .line 119
    .line 120
    .line 121
    invoke-static {v14}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 122
    move-result-object v12

    .line 123
    .line 124
    if-ne v10, v5, :cond_1

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 128
    move-result v12

    .line 129
    int-to-float v12, v12

    .line 130
    sub-float/2addr v12, v8

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 134
    move-result v13

    .line 135
    int-to-float v13, v13

    .line 136
    sub-float/2addr v13, v8

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 140
    move-result v14

    .line 141
    int-to-float v14, v14

    .line 142
    sub-float/2addr v14, v8

    .line 143
    .line 144
    new-array v15, v3, [F

    .line 145
    .line 146
    aput v12, v15, v9

    .line 147
    .line 148
    aput v13, v15, v5

    .line 149
    .line 150
    aput v8, v15, v4

    .line 151
    .line 152
    aput v8, v15, v2

    .line 153
    .line 154
    aput v14, v15, v1

    .line 155
    .line 156
    .line 157
    invoke-static {v15}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 158
    move-result-object v12

    .line 159
    .line 160
    :cond_1
    const-wide/16 v13, 0x7d0

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11, v13, v14}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 164
    .line 165
    new-instance v15, Landroid/view/animation/LinearInterpolator;

    .line 166
    .line 167
    .line 168
    invoke-direct {v15}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11, v15}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 172
    const/4 v15, -0x1

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11, v15}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 176
    .line 177
    new-instance v1, Lcom/wang/avi/indicators/BallZigZagDeflectIndicator$1;

    .line 178
    .line 179
    .line 180
    invoke-direct {v1, v0, v10}, Lcom/wang/avi/indicators/BallZigZagDeflectIndicator$1;-><init>(Lcom/wang/avi/indicators/BallZigZagDeflectIndicator;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v11, v1}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v13, v14}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 187
    .line 188
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 189
    .line 190
    .line 191
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v15}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 198
    .line 199
    new-instance v1, Lcom/wang/avi/indicators/BallZigZagDeflectIndicator$2;

    .line 200
    .line 201
    .line 202
    invoke-direct {v1, v0, v10}, Lcom/wang/avi/indicators/BallZigZagDeflectIndicator$2;-><init>(Lcom/wang/avi/indicators/BallZigZagDeflectIndicator;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v12, v1}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    add-int/2addr v10, v5

    .line 213
    const/4 v1, 0x4

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    :cond_2
    return-object v6
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
