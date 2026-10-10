.class public Lcom/journeyapps/barcodescanner/ViewfinderView;
.super Landroid/view/View;
.source "ViewfinderView.java"


# static fields
.field public static final n:[I


# instance fields
.field public final b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Bitmap;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public h:I

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/zxing/ResultPoint;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/zxing/ResultPoint;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lcom/journeyapps/barcodescanner/CameraPreview;

.field public l:Landroid/graphics/Rect;

.field public m:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/journeyapps/barcodescanner/ViewfinderView;->n:[I

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 4
        0x0
        0x40
        0x80
        0xc0
        0xff
        0xc0
        0x80
        0x40
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/Paint;

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sget-object v1, Lcom/google/zxing/client/android/R$styleable;->zxing_finder:[I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    sget v0, Lcom/google/zxing/client/android/R$styleable;->zxing_finder_zxing_viewfinder_mask:I

    .line 28
    .line 29
    sget v1, Lcom/google/zxing/client/android/R$color;->zxing_viewfinder_mask:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 33
    move-result v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 37
    move-result v0

    .line 38
    .line 39
    iput v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->d:I

    .line 40
    .line 41
    sget v0, Lcom/google/zxing/client/android/R$styleable;->zxing_finder_zxing_result_view:I

    .line 42
    .line 43
    sget v1, Lcom/google/zxing/client/android/R$color;->zxing_result_view:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 51
    move-result v0

    .line 52
    .line 53
    iput v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->e:I

    .line 54
    .line 55
    sget v0, Lcom/google/zxing/client/android/R$styleable;->zxing_finder_zxing_viewfinder_laser:I

    .line 56
    .line 57
    sget v1, Lcom/google/zxing/client/android/R$color;->zxing_viewfinder_laser:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 61
    move-result v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 65
    move-result v0

    .line 66
    .line 67
    iput v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->f:I

    .line 68
    .line 69
    sget v0, Lcom/google/zxing/client/android/R$styleable;->zxing_finder_zxing_possible_result_points:I

    .line 70
    .line 71
    sget v1, Lcom/google/zxing/client/android/R$color;->zxing_possible_result_points:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 75
    move-result p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 79
    move-result p1

    .line 80
    .line 81
    iput p1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->g:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 85
    const/4 p1, 0x0

    .line 86
    .line 87
    iput p1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->h:I

    .line 88
    .line 89
    new-instance p1, Ljava/util/ArrayList;

    .line 90
    .line 91
    const/16 p2, 0x14

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 97
    .line 98
    new-instance p1, Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->j:Ljava/util/List;

    .line 104
    return-void
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
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
.end method


# virtual methods
.method public a(Lcom/google/zxing/ResultPoint;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x14

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->k:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/CameraPreview;->getFramingRect()Landroid/graphics/Rect;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->k:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/CameraPreview;->getPreviewFramingRect()Landroid/graphics/Rect;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->l:Landroid/graphics/Rect;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->m:Landroid/graphics/Rect;

    .line 24
    :cond_1
    :goto_0
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/ViewfinderView;->b()V

    .line 4
    .line 5
    iget-object v7, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->l:Landroid/graphics/Rect;

    .line 6
    .line 7
    if-eqz v7, :cond_7

    .line 8
    .line 9
    iget-object v8, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->m:Landroid/graphics/Rect;

    .line 10
    .line 11
    if-nez v8, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 21
    move-result v9

    .line 22
    .line 23
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->c:Landroid/graphics/Bitmap;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    iget v3, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->e:I

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    iget v3, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->d:I

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 36
    int-to-float v4, v1

    .line 37
    .line 38
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 39
    int-to-float v5, v1

    .line 40
    .line 41
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    move-object v1, p1

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 48
    move v10, v4

    .line 49
    .line 50
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 51
    int-to-float v3, v1

    .line 52
    .line 53
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 54
    int-to-float v4, v1

    .line 55
    .line 56
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    int-to-float v5, v1

    .line 60
    .line 61
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 62
    move-object v1, p1

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    int-to-float v2, v1

    .line 71
    .line 72
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 73
    int-to-float v3, v1

    .line 74
    .line 75
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 76
    .line 77
    add-int/lit8 v1, v1, 0x1

    .line 78
    int-to-float v5, v1

    .line 79
    .line 80
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 81
    move-object v1, p1

    .line 82
    move v4, v10

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 86
    .line 87
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    int-to-float v3, v1

    .line 91
    int-to-float v5, v9

    .line 92
    .line 93
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 94
    const/4 v2, 0x0

    .line 95
    move-object v1, p1

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 99
    .line 100
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->c:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    const/16 v9, 0xa0

    .line 103
    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 110
    .line 111
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->c:Landroid/graphics/Bitmap;

    .line 112
    const/4 v3, 0x0

    .line 113
    .line 114
    iget-object v4, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2, v3, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 118
    return-void

    .line 119
    .line 120
    :cond_2
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 121
    .line 122
    iget v3, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->f:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    .line 127
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 128
    .line 129
    sget-object v3, Lcom/journeyapps/barcodescanner/ViewfinderView;->n:[I

    .line 130
    .line 131
    iget v4, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->h:I

    .line 132
    .line 133
    aget v4, v3, v4

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 137
    .line 138
    iget v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->h:I

    .line 139
    .line 140
    add-int/lit8 v2, v2, 0x1

    .line 141
    array-length v3, v3

    .line 142
    rem-int/2addr v2, v3

    .line 143
    .line 144
    iput v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->h:I

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 148
    move-result v2

    .line 149
    .line 150
    div-int/lit8 v2, v2, 0x2

    .line 151
    .line 152
    iget v3, v7, Landroid/graphics/Rect;->top:I

    .line 153
    add-int/2addr v2, v3

    .line 154
    .line 155
    iget v3, v7, Landroid/graphics/Rect;->left:I

    .line 156
    .line 157
    add-int/lit8 v3, v3, 0x2

    .line 158
    int-to-float v3, v3

    .line 159
    .line 160
    add-int/lit8 v4, v2, -0x1

    .line 161
    int-to-float v4, v4

    .line 162
    .line 163
    iget v5, v7, Landroid/graphics/Rect;->right:I

    .line 164
    .line 165
    add-int/lit8 v5, v5, -0x1

    .line 166
    int-to-float v5, v5

    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x2

    .line 169
    int-to-float v2, v2

    .line 170
    .line 171
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 172
    move v1, v5

    .line 173
    move v5, v2

    .line 174
    move v2, v3

    .line 175
    move v3, v4

    .line 176
    move v4, v1

    .line 177
    move-object v1, p1

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 184
    move-result v2

    .line 185
    int-to-float v2, v2

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    .line 189
    move-result v3

    .line 190
    int-to-float v3, v3

    .line 191
    div-float/2addr v2, v3

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 195
    move-result v3

    .line 196
    int-to-float v3, v3

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    .line 200
    move-result v4

    .line 201
    int-to-float v4, v4

    .line 202
    div-float/2addr v3, v4

    .line 203
    .line 204
    iget v4, v7, Landroid/graphics/Rect;->left:I

    .line 205
    .line 206
    iget v5, v7, Landroid/graphics/Rect;->top:I

    .line 207
    .line 208
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->j:Ljava/util/List;

    .line 209
    .line 210
    .line 211
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 212
    move-result v6

    .line 213
    .line 214
    if-nez v6, :cond_4

    .line 215
    .line 216
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 217
    .line 218
    const/16 v8, 0x50

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 222
    .line 223
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 224
    .line 225
    iget v8, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->g:I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 229
    .line 230
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->j:Ljava/util/List;

    .line 231
    .line 232
    .line 233
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 234
    move-result-object v6

    .line 235
    .line 236
    .line 237
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    move-result v8

    .line 239
    .line 240
    if-eqz v8, :cond_3

    .line 241
    .line 242
    .line 243
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    move-result-object v8

    .line 245
    .line 246
    check-cast v8, Lcom/google/zxing/ResultPoint;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 250
    move-result v10

    .line 251
    mul-float/2addr v10, v2

    .line 252
    float-to-int v10, v10

    .line 253
    add-int/2addr v10, v4

    .line 254
    int-to-float v10, v10

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 258
    move-result v8

    .line 259
    mul-float/2addr v8, v3

    .line 260
    float-to-int v8, v8

    .line 261
    add-int/2addr v8, v5

    .line 262
    int-to-float v8, v8

    .line 263
    .line 264
    iget-object v11, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 265
    .line 266
    const/high16 v12, 0x40400000    # 3.0f

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, v10, v8, v12, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 270
    goto :goto_1

    .line 271
    .line 272
    :cond_3
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->j:Ljava/util/List;

    .line 273
    .line 274
    .line 275
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 276
    .line 277
    :cond_4
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 278
    .line 279
    .line 280
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 281
    move-result v6

    .line 282
    .line 283
    if-nez v6, :cond_6

    .line 284
    .line 285
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 289
    .line 290
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 291
    .line 292
    iget v8, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->g:I

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 296
    .line 297
    iget-object v6, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 298
    .line 299
    .line 300
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 301
    move-result-object v6

    .line 302
    .line 303
    .line 304
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    move-result v8

    .line 306
    .line 307
    if-eqz v8, :cond_5

    .line 308
    .line 309
    .line 310
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    move-result-object v8

    .line 312
    .line 313
    check-cast v8, Lcom/google/zxing/ResultPoint;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 317
    move-result v9

    .line 318
    mul-float/2addr v9, v2

    .line 319
    float-to-int v9, v9

    .line 320
    add-int/2addr v9, v4

    .line 321
    int-to-float v9, v9

    .line 322
    .line 323
    .line 324
    invoke-virtual {v8}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 325
    move-result v8

    .line 326
    mul-float/2addr v8, v3

    .line 327
    float-to-int v8, v8

    .line 328
    add-int/2addr v8, v5

    .line 329
    int-to-float v8, v8

    .line 330
    .line 331
    const/high16 v10, 0x40c00000    # 6.0f

    .line 332
    .line 333
    iget-object v11, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, v9, v8, v10, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 337
    goto :goto_2

    .line 338
    .line 339
    :cond_5
    iget-object v1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 340
    .line 341
    iget-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->j:Ljava/util/List;

    .line 342
    .line 343
    iput-object v2, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->i:Ljava/util/List;

    .line 344
    .line 345
    iput-object v1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->j:Ljava/util/List;

    .line 346
    .line 347
    .line 348
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 349
    .line 350
    :cond_6
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 351
    .line 352
    add-int/lit8 v3, v1, -0x6

    .line 353
    .line 354
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 355
    .line 356
    add-int/lit8 v4, v1, -0x6

    .line 357
    .line 358
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 359
    .line 360
    add-int/lit8 v5, v1, 0x6

    .line 361
    .line 362
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 363
    .line 364
    add-int/lit8 v6, v1, 0x6

    .line 365
    .line 366
    const-wide/16 v1, 0x50

    .line 367
    move-object v0, p0

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v0 .. v6}, Landroid/view/View;->postInvalidateDelayed(JIIII)V

    .line 371
    :cond_7
    :goto_3
    return-void
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
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
.end method

.method public setCameraPreview(Lcom/journeyapps/barcodescanner/CameraPreview;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/ViewfinderView;->k:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 3
    .line 4
    new-instance v0, Lcom/journeyapps/barcodescanner/ViewfinderView$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/journeyapps/barcodescanner/ViewfinderView$a;-><init>(Lcom/journeyapps/barcodescanner/ViewfinderView;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/journeyapps/barcodescanner/CameraPreview;->i(Lcom/journeyapps/barcodescanner/CameraPreview$f;)V

    .line 11
    return-void
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
.end method
