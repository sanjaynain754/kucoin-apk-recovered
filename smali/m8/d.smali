.class public Lm8/d;
.super Lcom/github/penfeizhou/animation/decode/a;
.source "AnimationFrame.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/penfeizhou/animation/decode/a<",
        "Ln8/a;",
        "Ln8/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Landroid/graphics/PorterDuffXfermode;

.field public static final g:Landroid/graphics/PorterDuffXfermode;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 3
    .line 4
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 8
    .line 9
    sput-object v0, Lm8/d;->f:Landroid/graphics/PorterDuffXfermode;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 12
    .line 13
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 17
    .line 18
    sput-object v0, Lm8/d;->g:Landroid/graphics/PorterDuffXfermode;

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(Ln8/a;Lm8/c;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/github/penfeizhou/animation/decode/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 4
    .line 5
    iget p1, p2, Lm8/c;->f:I

    .line 6
    .line 7
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 8
    .line 9
    iget p1, p2, Lm8/c;->g:I

    .line 10
    .line 11
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 12
    .line 13
    iget p1, p2, Lm8/c;->d:I

    .line 14
    .line 15
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 16
    .line 17
    iget p1, p2, Lm8/c;->e:I

    .line 18
    .line 19
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 20
    .line 21
    iget p1, p2, Lm8/c;->h:I

    .line 22
    .line 23
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const/16 p1, 0x64

    .line 28
    .line 29
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p2}, Lm8/c;->d()Z

    .line 33
    move-result p1

    .line 34
    .line 35
    iput-boolean p1, p0, Lm8/d;->c:Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lm8/c;->e()Z

    .line 39
    move-result p1

    .line 40
    .line 41
    iput-boolean p1, p0, Lm8/d;->d:Z

    .line 42
    .line 43
    iget p1, p2, Lm8/e;->c:I

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x18

    .line 46
    .line 47
    iput p1, p0, Lm8/d;->a:I

    .line 48
    .line 49
    iget p1, p2, Lm8/e;->b:I

    .line 50
    .line 51
    add-int/lit8 v0, p1, -0x10

    .line 52
    const/4 v1, 0x1

    .line 53
    and-int/2addr p1, v1

    .line 54
    add-int/2addr v0, p1

    .line 55
    .line 56
    iput v0, p0, Lm8/d;->b:I

    .line 57
    .line 58
    iget-object p1, p2, Lm8/c;->j:Lm8/a;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v1, 0x0

    .line 63
    .line 64
    :goto_0
    iput-boolean v1, p0, Lm8/d;->e:Z

    .line 65
    return-void
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Ln8/b;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 9
    .line 10
    iput p3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 14
    .line 15
    iput-object p4, v0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p5}, Lm8/d;->b(Ln8/b;)I

    .line 19
    move-result v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p5}, Lcom/github/penfeizhou/animation/io/b;->f()[B

    .line 23
    move-result-object p5

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-static {p5, v1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 27
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :catch_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 36
    .line 37
    iput p3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 38
    .line 39
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 40
    .line 41
    .line 42
    invoke-static {p5, v1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 43
    move-result-object p5

    .line 44
    .line 45
    :goto_0
    if-eqz p5, :cond_1

    .line 46
    .line 47
    iget-boolean p4, p0, Lm8/d;->c:Z

    .line 48
    .line 49
    if-eqz p4, :cond_0

    .line 50
    .line 51
    sget-object p4, Lm8/d;->g:Landroid/graphics/PorterDuffXfermode;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_0
    sget-object p4, Lm8/d;->f:Landroid/graphics/PorterDuffXfermode;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 61
    .line 62
    :goto_1
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 63
    .line 64
    iput v1, p4, Landroid/graphics/Rect;->left:I

    .line 65
    .line 66
    iput v1, p4, Landroid/graphics/Rect;->top:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 70
    move-result v0

    .line 71
    .line 72
    iput v0, p4, Landroid/graphics/Rect;->right:I

    .line 73
    .line 74
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 78
    move-result v0

    .line 79
    .line 80
    iput v0, p4, Landroid/graphics/Rect;->bottom:I

    .line 81
    .line 82
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 83
    .line 84
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 85
    int-to-float v1, v0

    .line 86
    .line 87
    const/high16 v2, 0x40000000    # 2.0f

    .line 88
    mul-float/2addr v1, v2

    .line 89
    int-to-float p3, p3

    .line 90
    div-float/2addr v1, p3

    .line 91
    float-to-int v1, v1

    .line 92
    .line 93
    iput v1, p4, Landroid/graphics/Rect;->left:I

    .line 94
    .line 95
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 96
    int-to-float v1, v1

    .line 97
    mul-float/2addr v1, v2

    .line 98
    div-float/2addr v1, p3

    .line 99
    float-to-int v1, v1

    .line 100
    .line 101
    iput v1, p4, Landroid/graphics/Rect;->top:I

    .line 102
    int-to-float v0, v0

    .line 103
    mul-float/2addr v0, v2

    .line 104
    div-float/2addr v0, p3

    .line 105
    .line 106
    .line 107
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 108
    move-result v1

    .line 109
    int-to-float v1, v1

    .line 110
    add-float/2addr v0, v1

    .line 111
    float-to-int v0, v0

    .line 112
    .line 113
    iput v0, p4, Landroid/graphics/Rect;->right:I

    .line 114
    .line 115
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 116
    .line 117
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 118
    int-to-float v0, v0

    .line 119
    mul-float/2addr v0, v2

    .line 120
    div-float/2addr v0, p3

    .line 121
    .line 122
    .line 123
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 124
    move-result p3

    .line 125
    int-to-float p3, p3

    .line 126
    add-float/2addr v0, p3

    .line 127
    float-to-int p3, v0

    .line 128
    .line 129
    iput p3, p4, Landroid/graphics/Rect;->bottom:I

    .line 130
    .line 131
    iget-object p3, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 132
    .line 133
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p5, p3, p4, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 137
    move-object p4, p5

    .line 138
    :cond_1
    return-object p4
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public final b(Ln8/b;)I
    .locals 4

    .line 1
    .line 2
    const/16 v0, 0x1e

    .line 3
    .line 4
    iget v1, p0, Lm8/d;->b:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/github/penfeizhou/animation/io/b;->d(I)V

    .line 9
    .line 10
    const-string v1, "RIFF"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ln8/b;->h(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ln8/b;->j(I)V

    .line 17
    .line 18
    const-string v1, "WEBP"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ln8/b;->h(Ljava/lang/String;)V

    .line 22
    .line 23
    sget v1, Lm8/k;->g:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ln8/b;->j(I)V

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ln8/b;->j(I)V

    .line 32
    .line 33
    iget-boolean v1, p0, Lm8/d;->e:Z

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const/16 v1, 0x10

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v1, v2

    .line 41
    :goto_0
    int-to-byte v1, v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Ln8/b;->i(I)V

    .line 48
    .line 49
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Ln8/b;->g(I)V

    .line 53
    .line 54
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ln8/b;->g(I)V

    .line 58
    .line 59
    :try_start_0
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 60
    .line 61
    check-cast v1, Ln8/a;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/github/penfeizhou/animation/io/c;->reset()V

    .line 65
    .line 66
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 67
    .line 68
    check-cast v1, Ln8/a;

    .line 69
    .line 70
    iget v2, p0, Lm8/d;->a:I

    .line 71
    int-to-long v2, v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2, v3}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 75
    .line 76
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 77
    .line 78
    check-cast v1, Ln8/a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/b;->f()[B

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/b;->a()I

    .line 86
    move-result p1

    .line 87
    .line 88
    iget v3, p0, Lm8/d;->b:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2, p1, v3}, Lcom/github/penfeizhou/animation/io/c;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    return v0

    .line 93
    :catch_0
    move-exception p1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    return v0
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
.end method

.method public bridge synthetic draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Lcom/github/penfeizhou/animation/io/e;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    .line 2
    check-cast p5, Ln8/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lm8/d;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Ln8/b;)Landroid/graphics/Bitmap;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method
