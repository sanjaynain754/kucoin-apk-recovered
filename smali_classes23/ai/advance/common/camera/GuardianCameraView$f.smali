.class public Lai/advance/common/camera/GuardianCameraView$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai/advance/common/camera/GuardianCameraView;->k([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Lai/advance/common/camera/GuardianCameraView;


# direct methods
.method public constructor <init>(Lai/advance/common/camera/GuardianCameraView;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 3
    .line 4
    iput-object p2, p0, Lai/advance/common/camera/GuardianCameraView$f;->b:[B

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->b:[B

    .line 3
    .line 4
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 5
    .line 6
    iget-object v2, v1, Lai/advance/common/camera/GuardianCameraView;->e:Landroid/hardware/Camera$Size;

    .line 7
    move-object v3, v1

    .line 8
    .line 9
    iget v1, v2, Landroid/hardware/Camera$Size;->width:I

    .line 10
    .line 11
    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    .line 12
    move-object v4, v3

    .line 13
    .line 14
    iget v3, v4, Lai/advance/common/camera/GuardianCameraView;->j:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4}, Lai/advance/common/camera/GuardianCameraView;->s()Z

    .line 18
    move-result v4

    .line 19
    .line 20
    iget-object v5, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Lai/advance/common/camera/GuardianCameraView;->r()Z

    .line 24
    move-result v5

    .line 25
    .line 26
    .line 27
    invoke-static/range {v0 .. v5}, Lk/a;->i([BIIIZZ)Landroid/graphics/Bitmap;

    .line 28
    move-result-object v6

    .line 29
    .line 30
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 31
    .line 32
    iget-object v1, v0, Lai/advance/common/camera/GuardianCameraView;->z:Landroid/graphics/Rect;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, Lai/advance/common/camera/GuardianCameraView;->c:Landroid/app/Activity;

    .line 37
    .line 38
    new-instance v1, Lai/advance/common/camera/GuardianCameraView$f$a;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0, v6}, Lai/advance/common/camera/GuardianCameraView$f$a;-><init>(Lai/advance/common/camera/GuardianCameraView$f;Landroid/graphics/Bitmap;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 45
    return-void

    .line 46
    .line 47
    :cond_0
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 48
    int-to-float v1, v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getViewHeight()I

    .line 52
    move-result v0

    .line 53
    int-to-float v0, v0

    .line 54
    div-float/2addr v1, v0

    .line 55
    .line 56
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getCameraTransformHeightRatio()F

    .line 60
    move-result v0

    .line 61
    mul-float/2addr v1, v0

    .line 62
    .line 63
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 64
    .line 65
    iget-object v2, v0, Lai/advance/common/camera/GuardianCameraView;->z:Landroid/graphics/Rect;

    .line 66
    .line 67
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 68
    int-to-float v2, v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getViewWidth()I

    .line 72
    move-result v0

    .line 73
    int-to-float v0, v0

    .line 74
    div-float/2addr v2, v0

    .line 75
    .line 76
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getCameraTransformWidthRatio()F

    .line 80
    move-result v0

    .line 81
    mul-float/2addr v2, v0

    .line 82
    .line 83
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 84
    .line 85
    iget-object v3, v0, Lai/advance/common/camera/GuardianCameraView;->z:Landroid/graphics/Rect;

    .line 86
    .line 87
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 88
    int-to-float v3, v3

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getViewWidth()I

    .line 92
    move-result v0

    .line 93
    int-to-float v0, v0

    .line 94
    div-float/2addr v3, v0

    .line 95
    .line 96
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getCameraTransformWidthRatio()F

    .line 100
    move-result v0

    .line 101
    mul-float/2addr v3, v0

    .line 102
    .line 103
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 104
    .line 105
    iget-object v4, v0, Lai/advance/common/camera/GuardianCameraView;->z:Landroid/graphics/Rect;

    .line 106
    .line 107
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 108
    int-to-float v4, v4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getViewHeight()I

    .line 112
    move-result v0

    .line 113
    int-to-float v0, v0

    .line 114
    div-float/2addr v4, v0

    .line 115
    .line 116
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraView;->getCameraTransformHeightRatio()F

    .line 120
    move-result v0

    .line 121
    mul-float/2addr v4, v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 125
    move-result v0

    .line 126
    int-to-float v0, v0

    .line 127
    mul-float/2addr v0, v2

    .line 128
    float-to-int v0, v0

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 132
    move-result v5

    .line 133
    int-to-float v5, v5

    .line 134
    mul-float/2addr v5, v1

    .line 135
    float-to-int v8, v5

    .line 136
    .line 137
    sub-float v2, v3, v2

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 141
    move-result v5

    .line 142
    int-to-float v5, v5

    .line 143
    mul-float/2addr v2, v5

    .line 144
    float-to-int v2, v2

    .line 145
    sub-float/2addr v4, v1

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 149
    move-result v1

    .line 150
    int-to-float v1, v1

    .line 151
    mul-float/2addr v4, v1

    .line 152
    float-to-int v1, v4

    .line 153
    .line 154
    .line 155
    :try_start_0
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 156
    move-result v4

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 160
    move-result v5

    .line 161
    .line 162
    iget-object v7, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7}, Lai/advance/common/camera/GuardianCameraView;->r()Z

    .line 166
    move-result v7

    .line 167
    .line 168
    if-eqz v7, :cond_1

    .line 169
    .line 170
    const/high16 v0, 0x3f800000    # 1.0f

    .line 171
    sub-float/2addr v0, v3

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 175
    move-result v3

    .line 176
    int-to-float v3, v3

    .line 177
    mul-float/2addr v0, v3

    .line 178
    float-to-int v0, v0

    .line 179
    :cond_1
    move v7, v0

    .line 180
    .line 181
    add-int v0, v7, v2

    .line 182
    .line 183
    if-le v0, v4, :cond_2

    .line 184
    .line 185
    sub-int v2, v4, v7

    .line 186
    :cond_2
    move v9, v2

    .line 187
    .line 188
    add-int v0, v8, v1

    .line 189
    .line 190
    if-le v0, v5, :cond_3

    .line 191
    .line 192
    sub-int v1, v5, v8

    .line 193
    :cond_3
    move v10, v1

    .line 194
    const/4 v11, 0x0

    .line 195
    const/4 v12, 0x0

    .line 196
    .line 197
    .line 198
    invoke-static/range {v6 .. v12}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 203
    .line 204
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraView$f;->c:Lai/advance/common/camera/GuardianCameraView;

    .line 205
    .line 206
    iget-object v1, v1, Lai/advance/common/camera/GuardianCameraView;->c:Landroid/app/Activity;

    .line 207
    .line 208
    new-instance v2, Lai/advance/common/camera/GuardianCameraView$f$b;

    .line 209
    .line 210
    .line 211
    invoke-direct {v2, p0, v0}, Lai/advance/common/camera/GuardianCameraView$f$b;-><init>(Lai/advance/common/camera/GuardianCameraView$f;Landroid/graphics/Bitmap;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    :catch_0
    return-void
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
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method
