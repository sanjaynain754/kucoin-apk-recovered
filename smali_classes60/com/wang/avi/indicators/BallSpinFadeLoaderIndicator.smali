.class public Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallSpinFadeLoaderIndicator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;
    }
.end annotation


# static fields
.field public static final ALPHA:I = 0xff

.field public static final SCALE:F = 1.0f


# instance fields
.field alphas:[I

.field scaleFloats:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/wang/avi/Indicator;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    new-array v1, v0, [F

    .line 8
    .line 9
    .line 10
    fill-array-data v1, :array_0

    .line 11
    .line 12
    iput-object v1, p0, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;->scaleFloats:[F

    .line 13
    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    .line 17
    fill-array-data v0, :array_1

    .line 18
    .line 19
    iput-object v0, p0, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;->alphas:[I

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
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 41
    .line 42
    :array_1
    .array-data 4
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
    .end array-data
.end method


# virtual methods
.method public circleAt(IIFD)Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;
    .locals 6

    .line 1
    .line 2
    div-int/lit8 p1, p1, 0x2

    .line 3
    int-to-double v0, p1

    .line 4
    float-to-double v2, p3

    .line 5
    .line 6
    .line 7
    invoke-static {p4, p5}, Ljava/lang/Math;->cos(D)D

    .line 8
    move-result-wide v4

    .line 9
    mul-double/2addr v4, v2

    .line 10
    add-double/2addr v0, v4

    .line 11
    double-to-float p1, v0

    .line 12
    .line 13
    div-int/lit8 p2, p2, 0x2

    .line 14
    int-to-double p2, p2

    .line 15
    .line 16
    .line 17
    invoke-static {p4, p5}, Ljava/lang/Math;->sin(D)D

    .line 18
    move-result-wide p4

    .line 19
    mul-double/2addr v2, p4

    .line 20
    add-double/2addr p2, v2

    .line 21
    double-to-float p2, p2

    .line 22
    .line 23
    new-instance p3, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;

    .line 24
    .line 25
    .line 26
    invoke-direct {p3, p0, p1, p2}, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;-><init>(Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;FF)V

    .line 27
    return-object p3
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
.end method

.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    div-int/lit8 v0, v0, 0xa

    .line 7
    int-to-float v0, v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    :goto_0
    const/16 v2, 0x8

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 19
    move-result v4

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 23
    move-result v5

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 27
    move-result v2

    .line 28
    .line 29
    div-int/lit8 v2, v2, 0x2

    .line 30
    int-to-float v2, v2

    .line 31
    .line 32
    sub-float v6, v2, v0

    .line 33
    int-to-double v2, v1

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v7, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 39
    mul-double/2addr v7, v2

    .line 40
    move-object v3, p0

    .line 41
    .line 42
    .line 43
    invoke-virtual/range {v3 .. v8}, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;->circleAt(IIFD)Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    iget v4, v2, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;->x:F

    .line 47
    .line 48
    iget v2, v2, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$Point;->y:F

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 52
    .line 53
    iget-object v2, v3, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;->scaleFloats:[F

    .line 54
    .line 55
    aget v2, v2, v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 59
    .line 60
    iget-object v2, v3, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;->alphas:[I

    .line 61
    .line 62
    aget v2, v2, v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 66
    const/4 v2, 0x0

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2, v2, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object v3, p0

    .line 77
    return-void
    .line 78
.end method

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 9
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
    const/4 v1, 0x0

    .line 7
    .line 8
    const/16 v2, 0x9

    .line 9
    .line 10
    new-array v2, v2, [I

    .line 11
    .line 12
    .line 13
    fill-array-data v2, :array_0

    .line 14
    .line 15
    :goto_0
    const/16 v3, 0x8

    .line 16
    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    const/4 v3, 0x3

    .line 19
    .line 20
    new-array v3, v3, [F

    .line 21
    .line 22
    .line 23
    fill-array-data v3, :array_1

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    const-wide/16 v4, 0x3e8

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 33
    const/4 v6, -0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 37
    .line 38
    aget v7, v2, v1

    .line 39
    int-to-long v7, v7

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v7, v8}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 43
    .line 44
    new-instance v7, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$1;

    .line 45
    .line 46
    .line 47
    invoke-direct {v7, p0, v1}, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$1;-><init>(Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3, v7}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 51
    .line 52
    const/16 v7, 0x4d

    .line 53
    .line 54
    const/16 v8, 0xff

    .line 55
    .line 56
    .line 57
    filled-new-array {v8, v7, v8}, [I

    .line 58
    move-result-object v7

    .line 59
    .line 60
    .line 61
    invoke-static {v7}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 62
    move-result-object v7

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 69
    .line 70
    aget v4, v2, v1

    .line 71
    int-to-long v4, v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v4, v5}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 75
    .line 76
    new-instance v4, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$2;

    .line 77
    .line 78
    .line 79
    invoke-direct {v4, p0, v1}, Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator$2;-><init>(Lcom/wang/avi/indicators/BallSpinFadeLoaderIndicator;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7, v4}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    return-object v0

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
    :array_0
    .array-data 4
        0x0
        0x78
        0xf0
        0x168
        0x1e0
        0x258
        0x2d0
        0x30c
        0x348
    .end array-data

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
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3ecccccd    # 0.4f
        0x3f800000    # 1.0f
    .end array-data
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
