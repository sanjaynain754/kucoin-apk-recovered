.class public Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;
.super Lcom/wang/avi/Indicator;
.source "TriangleSkewSpinIndicator.java"


# instance fields
.field private mCamera:Landroid/graphics/Camera;

.field private mMatrix:Landroid/graphics/Matrix;

.field private rotateX:F

.field private rotateY:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/wang/avi/Indicator;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Camera;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mCamera:Landroid/graphics/Camera;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 18
    return-void
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

.method public static synthetic access$002(Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->rotateX:F

    .line 3
    return p1
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
.end method

.method public static synthetic access$102(Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->rotateY:F

    .line 3
    return p1
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mCamera:Landroid/graphics/Camera;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Camera;->save()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mCamera:Landroid/graphics/Camera;

    .line 13
    .line 14
    iget v1, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->rotateX:F

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->rotateX(F)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mCamera:Landroid/graphics/Camera;

    .line 20
    .line 21
    iget v1, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->rotateY:F

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->rotateY(F)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mCamera:Landroid/graphics/Camera;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mCamera:Landroid/graphics/Camera;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Camera;->restore()V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerX()I

    .line 42
    move-result v1

    .line 43
    neg-int v1, v1

    .line 44
    int-to-float v1, v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerY()I

    .line 48
    move-result v2

    .line 49
    neg-int v2, v2

    .line 50
    int-to-float v2, v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 54
    .line 55
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerX()I

    .line 59
    move-result v1

    .line 60
    int-to-float v1, v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerY()I

    .line 64
    move-result v2

    .line 65
    int-to-float v2, v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 69
    .line 70
    iget-object v0, p0, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 74
    .line 75
    new-instance v0, Landroid/graphics/Path;

    .line 76
    .line 77
    .line 78
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 82
    move-result v1

    .line 83
    .line 84
    div-int/lit8 v1, v1, 0x5

    .line 85
    int-to-float v1, v1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 89
    move-result v2

    .line 90
    .line 91
    mul-int/lit8 v2, v2, 0x4

    .line 92
    .line 93
    div-int/lit8 v2, v2, 0x5

    .line 94
    int-to-float v2, v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 101
    move-result v1

    .line 102
    .line 103
    mul-int/lit8 v1, v1, 0x4

    .line 104
    .line 105
    div-int/lit8 v1, v1, 0x5

    .line 106
    int-to-float v1, v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 110
    move-result v2

    .line 111
    .line 112
    mul-int/lit8 v2, v2, 0x4

    .line 113
    .line 114
    div-int/lit8 v2, v2, 0x5

    .line 115
    int-to-float v2, v2

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 122
    move-result v1

    .line 123
    .line 124
    div-int/lit8 v1, v1, 0x2

    .line 125
    int-to-float v1, v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 129
    move-result v2

    .line 130
    .line 131
    div-int/lit8 v2, v2, 0x5

    .line 132
    int-to-float v2, v2

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 142
    return-void
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
.end method

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 7
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
    const/4 v1, 0x5

    .line 7
    .line 8
    new-array v2, v1, [F

    .line 9
    .line 10
    .line 11
    fill-array-data v2, :array_0

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    new-instance v3, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator$1;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, p0}, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator$1;-><init>(Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2, v3}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 24
    .line 25
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 32
    const/4 v3, -0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 36
    .line 37
    const-wide/16 v4, 0x9c4

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    new-array v1, v1, [F

    .line 43
    .line 44
    .line 45
    fill-array-data v1, :array_1

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    new-instance v6, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator$2;

    .line 52
    .line 53
    .line 54
    invoke-direct {v6, p0}, Lcom/wang/avi/indicators/TriangleSkewSpinIndicator$2;-><init>(Lcom/wang/avi/indicators/TriangleSkewSpinIndicator;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, v6}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 58
    .line 59
    new-instance v6, Landroid/view/animation/LinearInterpolator;

    .line 60
    .line 61
    .line 62
    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    return-object v0

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
    :array_0
    .array-data 4
        0x0
        0x43340000    # 180.0f
        0x43340000    # 180.0f
        0x0
        0x0
    .end array-data

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
    :array_1
    .array-data 4
        0x0
        0x0
        0x43340000    # 180.0f
        0x43340000    # 180.0f
        0x0
    .end array-data
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
