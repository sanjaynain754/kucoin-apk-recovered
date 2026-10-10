.class public Lcom/blankj/utilcode/util/g0$c;
.super Lcom/blankj/utilcode/util/g0$b;
.source "ShadowUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final v:D


# instance fields
.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:Landroid/graphics/Paint;

.field public h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/RectF;

.field public j:F

.field public k:Landroid/graphics/Path;

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:Z

.field public final q:I

.field public final r:I

.field public s:Z

.field public t:F

.field public u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 13
    move-result-wide v0

    .line 14
    .line 15
    sput-wide v0, Lcom/blankj/utilcode/util/g0$c;->v:D

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;FFFIZ)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/g0$b;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    const/high16 p1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->c:F

    .line 8
    .line 9
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->d:F

    .line 10
    .line 11
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->e:F

    .line 12
    .line 13
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->f:F

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/g0$c;->p:Z

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/g0$c;->s:Z

    .line 20
    .line 21
    iput p5, p0, Lcom/blankj/utilcode/util/g0$c;->q:I

    .line 22
    .line 23
    .line 24
    const v1, 0xffffff

    .line 25
    and-int/2addr p5, v1

    .line 26
    .line 27
    iput p5, p0, Lcom/blankj/utilcode/util/g0$c;->r:I

    .line 28
    .line 29
    iput-boolean p6, p0, Lcom/blankj/utilcode/util/g0$c;->u:Z

    .line 30
    .line 31
    if-eqz p6, :cond_0

    .line 32
    .line 33
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->c:F

    .line 34
    .line 35
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->d:F

    .line 36
    .line 37
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->e:F

    .line 38
    .line 39
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->f:F

    .line 40
    .line 41
    :cond_0
    new-instance p1, Landroid/graphics/Paint;

    .line 42
    const/4 p5, 0x5

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p5}, Landroid/graphics/Paint;-><init>(I)V

    .line 46
    .line 47
    iput-object p1, p0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 48
    .line 49
    sget-object p5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 56
    move-result p1

    .line 57
    int-to-float p1, p1

    .line 58
    .line 59
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 60
    .line 61
    new-instance p1, Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 65
    .line 66
    iput-object p1, p0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 67
    .line 68
    new-instance p1, Landroid/graphics/Paint;

    .line 69
    .line 70
    iget-object p2, p0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 74
    .line 75
    iput-object p1, p0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p3, p4}, Lcom/blankj/utilcode/util/g0$c;->h(FF)V

    .line 82
    return-void
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
.end method

.method public static e(FFZ)F
    .locals 6

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    float-to-double v0, p0

    .line 4
    .line 5
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    sget-wide v4, Lcom/blankj/utilcode/util/g0$c;->v:D

    .line 8
    sub-double/2addr v2, v4

    .line 9
    float-to-double p0, p1

    .line 10
    mul-double/2addr v2, p0

    .line 11
    add-double/2addr v0, v2

    .line 12
    double-to-float p0, v0

    .line 13
    :cond_0
    return p0
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
.end method

.method public static i(F)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 4
    move-result p0

    .line 5
    .line 6
    rem-int/lit8 v0, p0, 0x2

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    sub-int/2addr p0, v1

    .line 11
    :cond_0
    return p0
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
.end method


# virtual methods
.method public bridge synthetic a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->a()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public bridge synthetic b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->b(Landroid/graphics/drawable/Drawable;)V

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
.end method

.method public final c(Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/blankj/utilcode/util/g0$c;->u:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 8
    move-result v0

    .line 9
    .line 10
    div-int/lit8 v0, v0, 0x2

    .line 11
    int-to-float v0, v0

    .line 12
    .line 13
    iput v0, p0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$c;->m:F

    .line 16
    .line 17
    iget v1, p0, Lcom/blankj/utilcode/util/g0$c;->c:F

    .line 18
    mul-float/2addr v1, v0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v3, p1, Landroid/graphics/Rect;->left:I

    .line 23
    int-to-float v3, v3

    .line 24
    add-float/2addr v3, v0

    .line 25
    .line 26
    iget v4, p1, Landroid/graphics/Rect;->top:I

    .line 27
    int-to-float v4, v4

    .line 28
    add-float/2addr v4, v1

    .line 29
    .line 30
    iget v5, p1, Landroid/graphics/Rect;->right:I

    .line 31
    int-to-float v5, v5

    .line 32
    sub-float/2addr v5, v0

    .line 33
    .line 34
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 35
    int-to-float p1, p1

    .line 36
    sub-float/2addr p1, v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3, v4, v5, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$c;->a()Landroid/graphics/drawable/Drawable;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iget-object v0, p0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 46
    .line 47
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 48
    float-to-int v1, v1

    .line 49
    .line 50
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 51
    float-to-int v2, v2

    .line 52
    .line 53
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 54
    float-to-int v3, v3

    .line 55
    .line 56
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 57
    float-to-int v0, v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/g0$c;->d()V

    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method

.method public final d()V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x3

    .line 6
    .line 7
    iget-boolean v4, v0, Lcom/blankj/utilcode/util/g0$c;->u:Z

    .line 8
    .line 9
    const/high16 v5, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/high16 v6, 0x43340000    # 180.0f

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 21
    move-result v4

    .line 22
    .line 23
    const/high16 v9, 0x40000000    # 2.0f

    .line 24
    div-float/2addr v4, v9

    .line 25
    sub-float/2addr v4, v5

    .line 26
    .line 27
    new-instance v9, Landroid/graphics/RectF;

    .line 28
    neg-float v10, v4

    .line 29
    .line 30
    .line 31
    invoke-direct {v9, v10, v10, v4, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 32
    .line 33
    new-instance v11, Landroid/graphics/RectF;

    .line 34
    .line 35
    .line 36
    invoke-direct {v11, v9}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 37
    .line 38
    iget v12, v0, Lcom/blankj/utilcode/util/g0$c;->n:F

    .line 39
    neg-float v13, v12

    .line 40
    neg-float v12, v12

    .line 41
    .line 42
    .line 43
    invoke-virtual {v11, v13, v12}, Landroid/graphics/RectF;->inset(FF)V

    .line 44
    .line 45
    iget-object v12, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 46
    .line 47
    if-nez v12, :cond_0

    .line 48
    .line 49
    new-instance v12, Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 53
    .line 54
    iput-object v12, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {v12}, Landroid/graphics/Path;->reset()V

    .line 59
    .line 60
    :goto_0
    iget-object v12, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 61
    .line 62
    sget-object v13, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v12, v13}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 66
    .line 67
    iget-object v12, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v12, v10, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 71
    .line 72
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 73
    .line 74
    iget v12, v0, Lcom/blankj/utilcode/util/g0$c;->n:F

    .line 75
    neg-float v12, v12

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10, v12, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 79
    .line 80
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v10, v11, v6, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 84
    .line 85
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v10, v11, v8, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 89
    .line 90
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10, v9, v6, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 94
    .line 95
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10, v9, v8, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 99
    .line 100
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 104
    .line 105
    iget v6, v11, Landroid/graphics/RectF;->top:F

    .line 106
    neg-float v12, v6

    .line 107
    .line 108
    cmpl-float v6, v12, v8

    .line 109
    .line 110
    if-lez v6, :cond_1

    .line 111
    div-float/2addr v4, v12

    .line 112
    .line 113
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 114
    .line 115
    new-instance v9, Landroid/graphics/RadialGradient;

    .line 116
    .line 117
    iget v10, v0, Lcom/blankj/utilcode/util/g0$c;->q:I

    .line 118
    .line 119
    iget v11, v0, Lcom/blankj/utilcode/util/g0$c;->r:I

    .line 120
    .line 121
    .line 122
    filled-new-array {v7, v10, v11}, [I

    .line 123
    move-result-object v13

    .line 124
    .line 125
    new-array v14, v3, [F

    .line 126
    .line 127
    aput v8, v14, v7

    .line 128
    .line 129
    aput v4, v14, v2

    .line 130
    .line 131
    aput v5, v14, v1

    .line 132
    .line 133
    sget-object v15, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    .line 137
    .line 138
    invoke-direct/range {v9 .. v15}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 142
    :cond_1
    return-void

    .line 143
    .line 144
    :cond_2
    new-instance v4, Landroid/graphics/RectF;

    .line 145
    .line 146
    iget v9, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 147
    neg-float v10, v9

    .line 148
    neg-float v11, v9

    .line 149
    .line 150
    .line 151
    invoke-direct {v4, v10, v11, v9, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 152
    .line 153
    new-instance v9, Landroid/graphics/RectF;

    .line 154
    .line 155
    .line 156
    invoke-direct {v9, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 157
    .line 158
    iget v10, v0, Lcom/blankj/utilcode/util/g0$c;->n:F

    .line 159
    neg-float v11, v10

    .line 160
    neg-float v10, v10

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v11, v10}, Landroid/graphics/RectF;->inset(FF)V

    .line 164
    .line 165
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 166
    .line 167
    if-nez v10, :cond_3

    .line 168
    .line 169
    new-instance v10, Landroid/graphics/Path;

    .line 170
    .line 171
    .line 172
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 173
    .line 174
    iput-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 175
    goto :goto_1

    .line 176
    .line 177
    .line 178
    :cond_3
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 179
    .line 180
    :goto_1
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 181
    .line 182
    sget-object v11, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10, v11}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 186
    .line 187
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 188
    .line 189
    iget v11, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 190
    neg-float v11, v11

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v11, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 194
    .line 195
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 196
    .line 197
    iget v11, v0, Lcom/blankj/utilcode/util/g0$c;->n:F

    .line 198
    neg-float v11, v11

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v11, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 202
    .line 203
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 204
    .line 205
    const/high16 v11, 0x42b40000    # 90.0f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10, v9, v6, v11, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 209
    .line 210
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 211
    .line 212
    const/high16 v10, 0x43870000    # 270.0f

    .line 213
    .line 214
    const/high16 v11, -0x3d4c0000    # -90.0f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, v4, v10, v11, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 218
    .line 219
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 223
    .line 224
    iget v6, v9, Landroid/graphics/RectF;->top:F

    .line 225
    neg-float v13, v6

    .line 226
    .line 227
    cmpl-float v6, v13, v8

    .line 228
    .line 229
    if-lez v6, :cond_4

    .line 230
    .line 231
    iget v6, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 232
    div-float/2addr v6, v13

    .line 233
    .line 234
    iget-object v10, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 235
    move-object v11, v10

    .line 236
    .line 237
    new-instance v10, Landroid/graphics/RadialGradient;

    .line 238
    .line 239
    iget v12, v0, Lcom/blankj/utilcode/util/g0$c;->q:I

    .line 240
    .line 241
    iget v14, v0, Lcom/blankj/utilcode/util/g0$c;->r:I

    .line 242
    .line 243
    .line 244
    filled-new-array {v7, v12, v14}, [I

    .line 245
    move-result-object v14

    .line 246
    .line 247
    new-array v15, v3, [F

    .line 248
    .line 249
    aput v8, v15, v7

    .line 250
    .line 251
    aput v6, v15, v2

    .line 252
    .line 253
    aput v5, v15, v1

    .line 254
    .line 255
    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 256
    move-object v1, v11

    .line 257
    const/4 v11, 0x0

    .line 258
    const/4 v12, 0x0

    .line 259
    .line 260
    .line 261
    invoke-direct/range {v10 .. v16}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 265
    .line 266
    :cond_4
    iget-object v1, v0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 267
    .line 268
    new-instance v10, Landroid/graphics/LinearGradient;

    .line 269
    .line 270
    iget v12, v4, Landroid/graphics/RectF;->top:F

    .line 271
    .line 272
    iget v14, v9, Landroid/graphics/RectF;->top:F

    .line 273
    .line 274
    iget v15, v0, Lcom/blankj/utilcode/util/g0$c;->q:I

    .line 275
    .line 276
    iget v2, v0, Lcom/blankj/utilcode/util/g0$c;->r:I

    .line 277
    .line 278
    sget-object v17, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 279
    const/4 v11, 0x0

    .line 280
    const/4 v13, 0x0

    .line 281
    .line 282
    move/from16 v16, v2

    .line 283
    .line 284
    .line 285
    invoke-direct/range {v10 .. v17}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 289
    .line 290
    iget-object v1, v0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 294
    return-void
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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/blankj/utilcode/util/g0$c;->p:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/blankj/utilcode/util/g0$c;->c(Landroid/graphics/Rect;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/g0$c;->p:Z

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/blankj/utilcode/util/g0$c;->g(Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->draw(Landroid/graphics/Canvas;)V

    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public final f(FFZ)F
    .locals 6

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    iget p3, p0, Lcom/blankj/utilcode/util/g0$c;->c:F

    .line 5
    mul-float/2addr p1, p3

    .line 6
    float-to-double v0, p1

    .line 7
    .line 8
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 9
    .line 10
    sget-wide v4, Lcom/blankj/utilcode/util/g0$c;->v:D

    .line 11
    sub-double/2addr v2, v4

    .line 12
    float-to-double p1, p2

    .line 13
    mul-double/2addr v2, p1

    .line 14
    add-double/2addr v0, v2

    .line 15
    double-to-float p1, v0

    .line 16
    return p1

    .line 17
    .line 18
    :cond_0
    iget p2, p0, Lcom/blankj/utilcode/util/g0$c;->c:F

    .line 19
    mul-float/2addr p1, p2

    .line 20
    return p1
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
.end method

.method public final g(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-boolean v2, v0, Lcom/blankj/utilcode/util/g0$c;->u:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 12
    move-result v2

    .line 13
    .line 14
    iget-object v3, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 18
    move-result v3

    .line 19
    .line 20
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 24
    move-result v4

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 28
    .line 29
    iget-object v3, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 30
    .line 31
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 42
    move-result v7

    .line 43
    .line 44
    iget v2, v0, Lcom/blankj/utilcode/util/g0$c;->t:F

    .line 45
    .line 46
    iget-object v3, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 50
    move-result v3

    .line 51
    .line 52
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 56
    move-result v4

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 60
    .line 61
    iget v8, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 62
    neg-float v2, v8

    .line 63
    .line 64
    iget v3, v0, Lcom/blankj/utilcode/util/g0$c;->n:F

    .line 65
    .line 66
    sub-float v3, v2, v3

    .line 67
    .line 68
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 72
    move-result v2

    .line 73
    .line 74
    const/high16 v4, 0x40000000    # 2.0f

    .line 75
    .line 76
    mul-float v9, v8, v4

    .line 77
    sub-float/2addr v2, v9

    .line 78
    const/4 v4, 0x0

    .line 79
    .line 80
    cmpl-float v2, v2, v4

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x1

    .line 83
    .line 84
    if-lez v2, :cond_1

    .line 85
    move v10, v6

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move v10, v5

    .line 88
    .line 89
    :goto_0
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 93
    move-result v2

    .line 94
    sub-float/2addr v2, v9

    .line 95
    .line 96
    cmpl-float v2, v2, v4

    .line 97
    .line 98
    if-lez v2, :cond_2

    .line 99
    move v11, v6

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move v11, v5

    .line 102
    .line 103
    :goto_1
    iget v2, v0, Lcom/blankj/utilcode/util/g0$c;->o:F

    .line 104
    .line 105
    iget v5, v0, Lcom/blankj/utilcode/util/g0$c;->d:F

    .line 106
    mul-float/2addr v5, v2

    .line 107
    .line 108
    sub-float v5, v2, v5

    .line 109
    .line 110
    iget v6, v0, Lcom/blankj/utilcode/util/g0$c;->e:F

    .line 111
    mul-float/2addr v6, v2

    .line 112
    .line 113
    sub-float v6, v2, v6

    .line 114
    .line 115
    iget v12, v0, Lcom/blankj/utilcode/util/g0$c;->f:F

    .line 116
    mul-float/2addr v12, v2

    .line 117
    sub-float/2addr v2, v12

    .line 118
    .line 119
    cmpl-float v4, v8, v4

    .line 120
    .line 121
    const/high16 v12, 0x3f800000    # 1.0f

    .line 122
    .line 123
    if-nez v4, :cond_3

    .line 124
    move v13, v12

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    add-float/2addr v6, v8

    .line 127
    .line 128
    div-float v6, v8, v6

    .line 129
    move v13, v6

    .line 130
    .line 131
    :goto_2
    if-nez v4, :cond_4

    .line 132
    move v14, v12

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    add-float/2addr v5, v8

    .line 135
    .line 136
    div-float v5, v8, v5

    .line 137
    move v14, v5

    .line 138
    .line 139
    :goto_3
    if-nez v4, :cond_5

    .line 140
    move v15, v12

    .line 141
    goto :goto_4

    .line 142
    :cond_5
    add-float/2addr v2, v8

    .line 143
    .line 144
    div-float v2, v8, v2

    .line 145
    move v15, v2

    .line 146
    .line 147
    .line 148
    :goto_4
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 149
    move-result v2

    .line 150
    .line 151
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 152
    .line 153
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 154
    add-float/2addr v5, v8

    .line 155
    .line 156
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 157
    add-float/2addr v4, v8

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->scale(FF)V

    .line 164
    .line 165
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 166
    .line 167
    iget-object v5, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 171
    .line 172
    if-eqz v10, :cond_6

    .line 173
    .line 174
    div-float v4, v12, v13

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v4, v12}, Landroid/graphics/Canvas;->scale(FF)V

    .line 178
    .line 179
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 183
    move-result v4

    .line 184
    sub-float/2addr v4, v9

    .line 185
    .line 186
    iget v5, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 187
    neg-float v5, v5

    .line 188
    .line 189
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 190
    .line 191
    move/from16 v16, v2

    .line 192
    const/4 v2, 0x0

    .line 193
    .line 194
    move/from16 v17, v12

    .line 195
    .line 196
    move/from16 v12, v16

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 200
    goto :goto_5

    .line 201
    .line 202
    :cond_6
    move/from16 v17, v12

    .line 203
    move v12, v2

    .line 204
    .line 205
    .line 206
    :goto_5
    invoke-virtual {v1, v12}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 210
    move-result v12

    .line 211
    .line 212
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 213
    .line 214
    iget v4, v2, Landroid/graphics/RectF;->right:F

    .line 215
    sub-float/2addr v4, v8

    .line 216
    .line 217
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 218
    sub-float/2addr v2, v8

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v13, v15}, Landroid/graphics/Canvas;->scale(FF)V

    .line 225
    .line 226
    const/high16 v2, 0x43340000    # 180.0f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 230
    .line 231
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 232
    .line 233
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 237
    .line 238
    if-eqz v10, :cond_7

    .line 239
    .line 240
    div-float v2, v17, v13

    .line 241
    .line 242
    move/from16 v4, v17

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 246
    .line 247
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 251
    move-result v2

    .line 252
    .line 253
    sub-float v4, v2, v9

    .line 254
    .line 255
    iget v2, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 256
    neg-float v5, v2

    .line 257
    .line 258
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 259
    const/4 v2, 0x0

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 263
    .line 264
    .line 265
    :cond_7
    invoke-virtual {v1, v12}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 269
    move-result v10

    .line 270
    .line 271
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 272
    .line 273
    iget v4, v2, Landroid/graphics/RectF;->left:F

    .line 274
    add-float/2addr v4, v8

    .line 275
    .line 276
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 277
    sub-float/2addr v2, v8

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v13, v15}, Landroid/graphics/Canvas;->scale(FF)V

    .line 284
    .line 285
    const/high16 v2, 0x43870000    # 270.0f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 289
    .line 290
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 291
    .line 292
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 296
    .line 297
    if-eqz v11, :cond_8

    .line 298
    .line 299
    const/high16 v4, 0x3f800000    # 1.0f

    .line 300
    .line 301
    div-float v12, v4, v15

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v12, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 305
    .line 306
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 310
    move-result v2

    .line 311
    .line 312
    sub-float v4, v2, v9

    .line 313
    .line 314
    iget v2, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 315
    neg-float v5, v2

    .line 316
    .line 317
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 318
    const/4 v2, 0x0

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 322
    .line 323
    .line 324
    :cond_8
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 328
    move-result v10

    .line 329
    .line 330
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 331
    .line 332
    iget v4, v2, Landroid/graphics/RectF;->right:F

    .line 333
    sub-float/2addr v4, v8

    .line 334
    .line 335
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 336
    add-float/2addr v2, v8

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->scale(FF)V

    .line 343
    .line 344
    const/high16 v2, 0x42b40000    # 90.0f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 348
    .line 349
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->k:Landroid/graphics/Path;

    .line 350
    .line 351
    iget-object v4, v0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 355
    .line 356
    if-eqz v11, :cond_9

    .line 357
    .line 358
    const/high16 v4, 0x3f800000    # 1.0f

    .line 359
    .line 360
    div-float v12, v4, v14

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v12, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 364
    .line 365
    iget-object v2, v0, Lcom/blankj/utilcode/util/g0$c;->i:Landroid/graphics/RectF;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 369
    move-result v2

    .line 370
    .line 371
    sub-float v4, v2, v9

    .line 372
    .line 373
    iget v2, v0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 374
    neg-float v5, v2

    .line 375
    .line 376
    iget-object v6, v0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 377
    const/4 v2, 0x0

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 381
    .line 382
    .line 383
    :cond_9
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 387
    return-void
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public bridge synthetic getChangingConfigurations()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getChangingConfigurations()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public bridge synthetic getCurrent()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public bridge synthetic getIntrinsicHeight()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getIntrinsicHeight()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public bridge synthetic getIntrinsicWidth()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getIntrinsicWidth()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public bridge synthetic getMinimumHeight()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getMinimumHeight()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public bridge synthetic getMinimumWidth()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getMinimumWidth()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
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
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/g0$c;->m:F

    .line 3
    .line 4
    iget v1, p0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/blankj/utilcode/util/g0$c;->s:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1, v2}, Lcom/blankj/utilcode/util/g0$c;->f(FFZ)F

    .line 10
    move-result v0

    .line 11
    float-to-double v0, v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 15
    move-result-wide v0

    .line 16
    double-to-int v0, v0

    .line 17
    .line 18
    iget v1, p0, Lcom/blankj/utilcode/util/g0$c;->m:F

    .line 19
    .line 20
    iget v2, p0, Lcom/blankj/utilcode/util/g0$c;->j:F

    .line 21
    .line 22
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/g0$c;->s:Z

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v3}, Lcom/blankj/utilcode/util/g0$c;->e(FFZ)F

    .line 26
    move-result v1

    .line 27
    float-to-double v1, v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 31
    move-result-wide v1

    .line 32
    double-to-int v1, v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1, v0, v1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 36
    const/4 p1, 0x1

    .line 37
    return p1
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
.end method

.method public bridge synthetic getState()[I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getState()[I

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public bridge synthetic getTransparentRegion()Landroid/graphics/Region;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->getTransparentRegion()Landroid/graphics/Region;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public h(FF)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpg-float v1, p1, v0

    .line 4
    .line 5
    if-ltz v1, :cond_2

    .line 6
    .line 7
    cmpg-float v0, p2, v0

    .line 8
    .line 9
    if-ltz v0, :cond_2

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/blankj/utilcode/util/g0$c;->i(F)I

    .line 13
    move-result p1

    .line 14
    int-to-float p1, p1

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lcom/blankj/utilcode/util/g0$c;->i(F)I

    .line 18
    move-result p2

    .line 19
    int-to-float p2, p2

    .line 20
    .line 21
    cmpl-float v0, p1, p2

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    move p1, p2

    .line 25
    .line 26
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/g0$c;->o:F

    .line 27
    .line 28
    cmpl-float v0, v0, p1

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget v0, p0, Lcom/blankj/utilcode/util/g0$c;->m:F

    .line 33
    .line 34
    cmpl-float v0, v0, p2

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    return-void

    .line 38
    .line 39
    :cond_1
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->o:F

    .line 40
    .line 41
    iput p2, p0, Lcom/blankj/utilcode/util/g0$c;->m:F

    .line 42
    .line 43
    iget v0, p0, Lcom/blankj/utilcode/util/g0$c;->c:F

    .line 44
    mul-float/2addr p1, v0

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 48
    move-result p1

    .line 49
    int-to-float p1, p1

    .line 50
    .line 51
    iput p1, p0, Lcom/blankj/utilcode/util/g0$c;->n:F

    .line 52
    .line 53
    iput p2, p0, Lcom/blankj/utilcode/util/g0$c;->l:F

    .line 54
    const/4 p1, 0x1

    .line 55
    .line 56
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/g0$c;->p:Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 60
    return-void

    .line 61
    .line 62
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string p2, "invalid shadow size"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1
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
.end method

.method public bridge synthetic invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

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
.end method

.method public bridge synthetic isAutoMirrored()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->isAutoMirrored()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public bridge synthetic isStateful()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->isStateful()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public bridge synthetic jumpToCurrentState()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/blankj/utilcode/util/g0$b;->jumpToCurrentState()V

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
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    .line 3
    iput-boolean p1, p0, Lcom/blankj/utilcode/util/g0$c;->p:Z

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
.end method

.method public bridge synthetic scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Lcom/blankj/utilcode/util/g0$b;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

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
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setAlpha(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/blankj/utilcode/util/g0$c;->g:Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/blankj/utilcode/util/g0$c;->h:Landroid/graphics/Paint;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public bridge synthetic setAutoMirrored(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setAutoMirrored(Z)V

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
.end method

.method public bridge synthetic setChangingConfigurations(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setChangingConfigurations(I)V

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
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setColorFilter(Landroid/graphics/ColorFilter;)V

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
.end method

.method public bridge synthetic setDither(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setDither(Z)V

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
.end method

.method public bridge synthetic setFilterBitmap(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setFilterBitmap(Z)V

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
.end method

.method public bridge synthetic setHotspot(FF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/blankj/utilcode/util/g0$b;->setHotspot(FF)V

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

.method public bridge synthetic setHotspotBounds(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Lcom/blankj/utilcode/util/g0$b;->setHotspotBounds(IIII)V

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
.end method

.method public bridge synthetic setState([I)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setState([I)Z

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public bridge synthetic setTint(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setTint(I)V

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
.end method

.method public bridge synthetic setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setTintList(Landroid/content/res/ColorStateList;)V

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
.end method

.method public bridge synthetic setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/blankj/utilcode/util/g0$b;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

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
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/blankj/utilcode/util/g0$b;->setVisible(ZZ)Z

    .line 4
    move-result p1

    .line 5
    return p1
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

.method public bridge synthetic unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/blankj/utilcode/util/g0$b;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

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
