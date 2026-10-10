.class public Lcom/wang/avi/indicators/BallPulseRiseIndicator;
.super Lcom/wang/avi/Indicator;
.source "BallPulseRiseIndicator.java"


# instance fields
.field private degress:F

.field private mCamera:Landroid/graphics/Camera;

.field private mMatrix:Landroid/graphics/Matrix;


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
    iput-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mCamera:Landroid/graphics/Camera;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mMatrix:Landroid/graphics/Matrix;

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

.method public static synthetic access$002(Lcom/wang/avi/indicators/BallPulseRiseIndicator;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->degress:F

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
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mCamera:Landroid/graphics/Camera;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Camera;->save()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mCamera:Landroid/graphics/Camera;

    .line 13
    .line 14
    iget v1, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->degress:F

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->rotateX(F)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mCamera:Landroid/graphics/Camera;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mCamera:Landroid/graphics/Camera;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/Camera;->restore()V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerX()I

    .line 35
    move-result v1

    .line 36
    neg-int v1, v1

    .line 37
    int-to-float v1, v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerY()I

    .line 41
    move-result v2

    .line 42
    neg-int v2, v2

    .line 43
    int-to-float v2, v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 47
    .line 48
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerX()I

    .line 52
    move-result v1

    .line 53
    int-to-float v1, v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->centerY()I

    .line 57
    move-result v2

    .line 58
    int-to-float v2, v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 62
    .line 63
    iget-object v0, p0, Lcom/wang/avi/indicators/BallPulseRiseIndicator;->mMatrix:Landroid/graphics/Matrix;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 70
    move-result v0

    .line 71
    .line 72
    div-int/lit8 v0, v0, 0xa

    .line 73
    int-to-float v0, v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 77
    move-result v1

    .line 78
    .line 79
    div-int/lit8 v1, v1, 0x4

    .line 80
    int-to-float v1, v1

    .line 81
    .line 82
    const/high16 v2, 0x40000000    # 2.0f

    .line 83
    mul-float/2addr v2, v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1, v2, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 90
    move-result v1

    .line 91
    .line 92
    mul-int/lit8 v1, v1, 0x3

    .line 93
    .line 94
    div-int/lit8 v1, v1, 0x4

    .line 95
    int-to-float v1, v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1, v2, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 102
    move-result v1

    .line 103
    int-to-float v1, v1

    .line 104
    sub-float/2addr v1, v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0, v1, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 111
    move-result v1

    .line 112
    .line 113
    div-int/lit8 v1, v1, 0x2

    .line 114
    int-to-float v1, v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 118
    move-result v3

    .line 119
    int-to-float v3, v3

    .line 120
    sub-float/2addr v3, v2

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v1, v3, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getWidth()I

    .line 127
    move-result v1

    .line 128
    int-to-float v1, v1

    .line 129
    sub-float/2addr v1, v0

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/wang/avi/Indicator;->getHeight()I

    .line 133
    move-result v3

    .line 134
    int-to-float v3, v3

    .line 135
    sub-float/2addr v3, v2

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v1, v3, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 139
    return-void
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
    .line 342
    .line 343
.end method

.method public onCreateAnimators()Ljava/util/ArrayList;
    .locals 4
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
    const/4 v1, 0x2

    .line 7
    .line 8
    new-array v1, v1, [F

    .line 9
    .line 10
    .line 11
    fill-array-data v1, :array_0

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    new-instance v2, Lcom/wang/avi/indicators/BallPulseRiseIndicator$1;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, p0}, Lcom/wang/avi/indicators/BallPulseRiseIndicator$1;-><init>(Lcom/wang/avi/indicators/BallPulseRiseIndicator;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1, v2}, Lcom/wang/avi/Indicator;->addUpdateListener(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 24
    .line 25
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 32
    const/4 v2, -0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 36
    .line 37
    const-wide/16 v2, 0x5dc

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    return-object v0

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
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
.end method
