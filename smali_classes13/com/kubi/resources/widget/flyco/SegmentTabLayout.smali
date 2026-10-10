.class public Lcom/kubi/resources/widget/flyco/SegmentTabLayout;
.super Landroid/widget/FrameLayout;
.source "SegmentTabLayout.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;,
        Lcom/kubi/resources/widget/flyco/SegmentTabLayout$c;
    }
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:I

.field public H:I

.field public I:F

.field public J:I

.field public K:Landroid/animation/ValueAnimator;

.field public L:Landroid/view/animation/OvershootInterpolator;

.field public M:[F

.field public N:Z

.field public O:Landroid/graphics/Paint;

.field public P:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public Q:Lww/b;

.field public R:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

.field public S:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

.field public b:Landroid/content/Context;

.field public c:[Ljava/lang/String;

.field public d:Landroid/widget/LinearLayout;

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroid/graphics/Rect;

.field public i:Landroid/graphics/drawable/GradientDrawable;

.field public j:Landroid/graphics/drawable/GradientDrawable;

.field public k:Landroid/graphics/Paint;

.field public l:F

.field public m:Z

.field public n:F

.field public o:I

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:J

.field public w:Z

.field public x:Z

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->h:Landroid/graphics/Rect;

    .line 5
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 6
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/view/animation/OvershootInterpolator;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-direct {p3, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->L:Landroid/view/animation/OvershootInterpolator;

    const/16 p3, 0x8

    .line 9
    new-array p3, p3, [F

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->M:[F

    .line 10
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->N:Z

    .line 11
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->O:Landroid/graphics/Paint;

    .line 12
    new-instance p3, Landroid/util/SparseArray;

    invoke-direct {p3}, Landroid/util/SparseArray;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->P:Landroid/util/SparseArray;

    .line 13
    new-instance p3, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    invoke-direct {p3, p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;-><init>(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->R:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 14
    new-instance p3, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    invoke-direct {p3, p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;-><init>(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->S:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    const/4 p3, 0x0

    .line 15
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 16
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 17
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 18
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b:Landroid/content/Context;

    .line 19
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 20
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    const-string v0, "http://schemas.android.com/apk/res/android"

    const-string v1, "layout_height"

    invoke-interface {p2, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    const-string v1, "-2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x10100f5

    .line 25
    filled-new-array {v0}, [I

    move-result-object v0

    .line 26
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, -0x2

    .line 27
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->J:I

    .line 28
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    :goto_0
    new-instance p1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$c;

    invoke-direct {p1, p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$c;-><init>(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)V

    iget-object p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->S:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    iget-object p3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->R:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->K:Landroid/animation/ValueAnimator;

    .line 30
    invoke-virtual {p1, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 3
    return p0
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
.end method

.method public static synthetic b(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)Lww/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->Q:Lww/b;

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
.end method


# virtual methods
.method public final c(ILandroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/uikit/R$id;->tv_tab_title:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->c:[Ljava/lang/String;

    .line 11
    .line 12
    aget-object v1, v1, p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    new-instance v0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$a;-><init>(Lcom/kubi/resources/widget/flyco/SegmentTabLayout;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->m:Z

    .line 26
    const/4 v1, -0x1

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    const/high16 v3, 0x3f800000    # 1.0f

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v2, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 40
    const/4 v2, -0x2

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 44
    .line 45
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->n:F

    .line 46
    const/4 v3, 0x0

    .line 47
    .line 48
    cmpl-float v2, v2, v3

    .line 49
    .line 50
    if-lez v2, :cond_1

    .line 51
    .line 52
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->n:F

    .line 55
    float-to-int v2, v2

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 59
    .line 60
    :cond_1
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p2, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

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
.end method

.method public final d()V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->h:Landroid/graphics/Rect;

    .line 21
    float-to-int v1, v1

    .line 22
    .line 23
    iput v1, v2, Landroid/graphics/Rect;->left:I

    .line 24
    float-to-int v0, v0

    .line 25
    .line 26
    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->w:Z

    .line 29
    const/4 v1, 0x7

    .line 30
    const/4 v2, 0x6

    .line 31
    const/4 v3, 0x5

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 41
    const/4 v9, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->M:[F

    .line 46
    .line 47
    iget v10, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 48
    .line 49
    aput v10, v0, v7

    .line 50
    .line 51
    aput v10, v0, v8

    .line 52
    .line 53
    aput v9, v0, v6

    .line 54
    .line 55
    aput v9, v0, v5

    .line 56
    .line 57
    aput v9, v0, v4

    .line 58
    .line 59
    aput v9, v0, v3

    .line 60
    .line 61
    aput v10, v0, v2

    .line 62
    .line 63
    aput v10, v0, v1

    .line 64
    return-void

    .line 65
    .line 66
    :cond_0
    iget v10, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 67
    sub-int/2addr v10, v8

    .line 68
    .line 69
    if-ne v0, v10, :cond_1

    .line 70
    .line 71
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->M:[F

    .line 72
    .line 73
    aput v9, v0, v7

    .line 74
    .line 75
    aput v9, v0, v8

    .line 76
    .line 77
    iget v7, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 78
    .line 79
    aput v7, v0, v6

    .line 80
    .line 81
    aput v7, v0, v5

    .line 82
    .line 83
    aput v7, v0, v4

    .line 84
    .line 85
    aput v7, v0, v3

    .line 86
    .line 87
    aput v9, v0, v2

    .line 88
    .line 89
    aput v9, v0, v1

    .line 90
    return-void

    .line 91
    .line 92
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->M:[F

    .line 93
    .line 94
    aput v9, v0, v7

    .line 95
    .line 96
    aput v9, v0, v8

    .line 97
    .line 98
    aput v9, v0, v6

    .line 99
    .line 100
    aput v9, v0, v5

    .line 101
    .line 102
    aput v9, v0, v4

    .line 103
    .line 104
    aput v9, v0, v3

    .line 105
    .line 106
    aput v9, v0, v2

    .line 107
    .line 108
    aput v9, v0, v1

    .line 109
    return-void

    .line 110
    .line 111
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->M:[F

    .line 112
    .line 113
    iget v9, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 114
    .line 115
    aput v9, v0, v7

    .line 116
    .line 117
    aput v9, v0, v8

    .line 118
    .line 119
    aput v9, v0, v6

    .line 120
    .line 121
    aput v9, v0, v5

    .line 122
    .line 123
    aput v9, v0, v4

    .line 124
    .line 125
    aput v9, v0, v3

    .line 126
    .line 127
    aput v9, v0, v2

    .line 128
    .line 129
    aput v9, v0, v1

    .line 130
    return-void
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
.end method

.method public final e()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->R:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    .line 17
    iput v2, v1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->a:F

    .line 18
    .line 19
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->R:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    .line 26
    iput v0, v1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->b:F

    .line 27
    .line 28
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->S:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 40
    move-result v2

    .line 41
    int-to-float v2, v2

    .line 42
    .line 43
    iput v2, v1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->a:F

    .line 44
    .line 45
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->S:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 49
    move-result v0

    .line 50
    int-to-float v0, v0

    .line 51
    .line 52
    iput v0, v1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->b:F

    .line 53
    .line 54
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->S:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 55
    .line 56
    iget v1, v0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->a:F

    .line 57
    .line 58
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->R:Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 59
    .line 60
    iget v3, v2, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->a:F

    .line 61
    .line 62
    cmpl-float v1, v1, v3

    .line 63
    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    iget v1, v0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->b:F

    .line 67
    .line 68
    iget v3, v2, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->b:F

    .line 69
    .line 70
    cmpl-float v1, v1, v3

    .line 71
    .line 72
    if-nez v1, :cond_0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_0
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->K:Landroid/animation/ValueAnimator;

    .line 79
    .line 80
    .line 81
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->x:Z

    .line 88
    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->K:Landroid/animation/ValueAnimator;

    .line 92
    .line 93
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->L:Landroid/view/animation/OvershootInterpolator;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 97
    .line 98
    :cond_1
    iget-wide v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->v:J

    .line 99
    .line 100
    const-wide/16 v2, 0x0

    .line 101
    .line 102
    cmp-long v0, v0, v2

    .line 103
    .line 104
    if-gez v0, :cond_3

    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->x:Z

    .line 107
    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    const-wide/16 v0, 0x1f4

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :cond_2
    const-wide/16 v0, 0xfa

    .line 114
    .line 115
    :goto_0
    iput-wide v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->v:J

    .line 116
    .line 117
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->K:Landroid/animation/ValueAnimator;

    .line 118
    .line 119
    iget-wide v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->v:J

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->K:Landroid/animation/ValueAnimator;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 128
    return-void
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
.end method

.method public f(F)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 13
    mul-float/2addr p1, v0

    .line 14
    .line 15
    const/high16 v0, 0x3f000000    # 0.5f

    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
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
.end method

.method public g()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->c:[Ljava/lang/String;

    .line 8
    array-length v0, v0

    .line 9
    .line 10
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 14
    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b:Landroid/content/Context;

    .line 18
    .line 19
    sget v2, Lcom/kubi/uikit/R$layout;->layout_tab_segment:I

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->c(ILandroid/view/View;)V

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

    .line 41
    return-void
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
.end method

.method public getCurrentTab()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 3
    return v0
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
.end method

.method public getDividerColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->y:I

    .line 3
    return v0
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
.end method

.method public getDividerPadding()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->A:F

    .line 3
    return v0
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
.end method

.method public getDividerWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->z:F

    .line 3
    return v0
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
.end method

.method public getIndicatorAnimDuration()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->v:J

    .line 3
    return-wide v0
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
.end method

.method public getIndicatorColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 3
    return v0
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
.end method

.method public getIndicatorCornerRadius()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 3
    return v0
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
.end method

.method public getIndicatorHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginBottom()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->u:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginLeft()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->r:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginRight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->t:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginTop()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->s:F

    .line 3
    return v0
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
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 3
    return v0
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
.end method

.method public getTabPadding()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->l:F

    .line 3
    return v0
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
.end method

.method public getTabWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->n:F

    .line 3
    return v0
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
.end method

.method public getTextBold()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->E:I

    .line 3
    return v0
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
.end method

.method public getTextSelectColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->C:I

    .line 3
    return v0
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
.end method

.method public getTextUnselectColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->D:I

    .line 3
    return v0
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
.end method

.method public getTextsize()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->B:F

    .line 3
    return v0
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
.end method

.method public final h(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_color:I

    .line 9
    .line 10
    const-string v0, "#222831"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 18
    move-result p2

    .line 19
    .line 20
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 21
    .line 22
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_height:I

    .line 23
    .line 24
    const/high16 v0, -0x40800000    # -1.0f

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 28
    move-result p2

    .line 29
    .line 30
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 31
    .line 32
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_corner_radius:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 36
    move-result p2

    .line 37
    .line 38
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 39
    .line 40
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_margin_left:I

    .line 41
    const/4 v1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 45
    move-result v2

    .line 46
    int-to-float v2, v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 50
    move-result p2

    .line 51
    .line 52
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->r:F

    .line 53
    .line 54
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_margin_top:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 58
    move-result p2

    .line 59
    .line 60
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->s:F

    .line 61
    .line 62
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_margin_right:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 66
    move-result v2

    .line 67
    int-to-float v2, v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 71
    move-result p2

    .line 72
    .line 73
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->t:F

    .line 74
    .line 75
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_margin_bottom:I

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 79
    move-result p2

    .line 80
    .line 81
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->u:F

    .line 82
    .line 83
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_anim_enable:I

    .line 84
    const/4 v2, 0x0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 88
    move-result p2

    .line 89
    .line 90
    iput-boolean p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->w:Z

    .line 91
    .line 92
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_bounce_enable:I

    .line 93
    const/4 v3, 0x1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 97
    move-result p2

    .line 98
    .line 99
    iput-boolean p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->x:Z

    .line 100
    .line 101
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_indicator_anim_duration:I

    .line 102
    const/4 v4, -0x1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 106
    move-result p2

    .line 107
    int-to-long v5, p2

    .line 108
    .line 109
    iput-wide v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->v:J

    .line 110
    .line 111
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_divider_color:I

    .line 112
    .line 113
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 117
    move-result p2

    .line 118
    .line 119
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->y:I

    .line 120
    .line 121
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_divider_width:I

    .line 122
    .line 123
    const/high16 v5, 0x3f800000    # 1.0f

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 127
    move-result v6

    .line 128
    int-to-float v6, v6

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 132
    move-result p2

    .line 133
    .line 134
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->z:F

    .line 135
    .line 136
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_divider_padding:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 140
    move-result p2

    .line 141
    .line 142
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->A:F

    .line 143
    .line 144
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_textsize:I

    .line 145
    .line 146
    const/high16 v6, 0x41500000    # 13.0f

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v6}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i(F)I

    .line 150
    move-result v6

    .line 151
    int-to-float v6, v6

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 155
    move-result p2

    .line 156
    .line 157
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->B:F

    .line 158
    .line 159
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_textSelectColor:I

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 163
    move-result p2

    .line 164
    .line 165
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->C:I

    .line 166
    .line 167
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_textUnselectColor:I

    .line 168
    .line 169
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 173
    move-result p2

    .line 174
    .line 175
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->D:I

    .line 176
    .line 177
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_textBold:I

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 181
    move-result p2

    .line 182
    .line 183
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->E:I

    .line 184
    .line 185
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_textAllCaps:I

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 189
    move-result p2

    .line 190
    .line 191
    iput-boolean p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->F:Z

    .line 192
    .line 193
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_tab_space_equal:I

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 197
    move-result p2

    .line 198
    .line 199
    iput-boolean p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->m:Z

    .line 200
    .line 201
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_tab_width:I

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 205
    move-result v0

    .line 206
    int-to-float v0, v0

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 210
    move-result p2

    .line 211
    .line 212
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->n:F

    .line 213
    .line 214
    sget v0, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_tab_padding:I

    .line 215
    .line 216
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->m:Z

    .line 217
    .line 218
    if-nez v3, :cond_1

    .line 219
    .line 220
    cmpl-float p2, p2, v1

    .line 221
    .line 222
    if-lez p2, :cond_0

    .line 223
    goto :goto_1

    .line 224
    .line 225
    :cond_0
    const/high16 p2, 0x41200000    # 10.0f

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 229
    move-result p2

    .line 230
    :goto_0
    int-to-float p2, p2

    .line 231
    goto :goto_2

    .line 232
    .line 233
    .line 234
    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 235
    move-result p2

    .line 236
    goto :goto_0

    .line 237
    .line 238
    .line 239
    :goto_2
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 240
    move-result p2

    .line 241
    .line 242
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->l:F

    .line 243
    .line 244
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_bar_color:I

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 248
    move-result p2

    .line 249
    .line 250
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->G:I

    .line 251
    .line 252
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_bar_stroke_color:I

    .line 253
    .line 254
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 258
    move-result p2

    .line 259
    .line 260
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->H:I

    .line 261
    .line 262
    sget p2, Lcom/kubi/uikit/R$styleable;->SegmentTabLayout_tl_bar_stroke_width:I

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 266
    move-result v0

    .line 267
    int-to-float v0, v0

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 271
    move-result p2

    .line 272
    .line 273
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->I:F

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 277
    return-void
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
.end method

.method public i(F)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->b:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 13
    mul-float/2addr p1, v0

    .line 14
    .line 15
    const/high16 v0, 0x3f000000    # 0.5f

    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
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
.end method

.method public final j(I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    .line 15
    if-ne v1, p1, :cond_0

    .line 16
    move v4, v3

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move v4, v0

    .line 19
    .line 20
    :goto_1
    sget v5, Lcom/kubi/uikit/R$id;->tv_tab_title:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->C:I

    .line 31
    goto :goto_2

    .line 32
    .line 33
    :cond_1
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->D:I

    .line 34
    .line 35
    .line 36
    :goto_2
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->E:I

    .line 39
    .line 40
    if-ne v5, v3, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 48
    .line 49
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-void
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
.end method

.method public final k()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_4

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->l:F

    .line 15
    float-to-int v4, v3

    .line 16
    float-to-int v3, v3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v4, v0, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 20
    .line 21
    sget v3, Lcom/kubi/uikit/R$id;->tv_tab_title:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Landroid/widget/TextView;

    .line 28
    .line 29
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 30
    .line 31
    if-ne v1, v3, :cond_0

    .line 32
    .line 33
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->C:I

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_0
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->D:I

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 40
    .line 41
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->B:F

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 45
    .line 46
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->F:Z

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    :cond_1
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->E:I

    .line 66
    const/4 v4, 0x2

    .line 67
    .line 68
    if-ne v3, v4, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_2
    if-nez v3, :cond_3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 87
    .line 88
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    return-void
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
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->h:Landroid/graphics/Rect;

    .line 9
    .line 10
    iget v1, p1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->a:F

    .line 11
    float-to-int v1, v1

    .line 12
    .line 13
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    iget p1, p1, Lcom/kubi/resources/widget/flyco/SegmentTabLayout$b;->b:F

    .line 16
    float-to-int p1, p1

    .line 17
    .line 18
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 23
    move-result v1

    .line 24
    .line 25
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    cmpg-float v2, v2, v3

    .line 29
    .line 30
    if-gez v2, :cond_1

    .line 31
    int-to-float v2, v0

    .line 32
    .line 33
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->s:F

    .line 34
    sub-float/2addr v2, v4

    .line 35
    .line 36
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->u:F

    .line 37
    sub-float/2addr v2, v4

    .line 38
    .line 39
    iput v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 40
    .line 41
    :cond_1
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 42
    .line 43
    cmpg-float v4, v2, v3

    .line 44
    .line 45
    const/high16 v5, 0x40000000    # 2.0f

    .line 46
    .line 47
    if-ltz v4, :cond_2

    .line 48
    .line 49
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 50
    div-float/2addr v4, v5

    .line 51
    .line 52
    cmpl-float v2, v2, v4

    .line 53
    .line 54
    if-lez v2, :cond_3

    .line 55
    .line 56
    :cond_2
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 57
    div-float/2addr v2, v5

    .line 58
    .line 59
    iput v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 60
    .line 61
    :cond_3
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j:Landroid/graphics/drawable/GradientDrawable;

    .line 62
    .line 63
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->G:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 67
    .line 68
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j:Landroid/graphics/drawable/GradientDrawable;

    .line 69
    .line 70
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->I:F

    .line 71
    float-to-int v4, v4

    .line 72
    .line 73
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->H:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 77
    .line 78
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j:Landroid/graphics/drawable/GradientDrawable;

    .line 79
    .line 80
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 84
    .line 85
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j:Landroid/graphics/drawable/GradientDrawable;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 89
    move-result v4

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 93
    move-result v5

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 97
    move-result v6

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 101
    move-result v7

    .line 102
    sub-int/2addr v6, v7

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 106
    move-result v7

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 110
    move-result v8

    .line 111
    sub-int/2addr v7, v8

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v5, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 115
    .line 116
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j:Landroid/graphics/drawable/GradientDrawable;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 120
    .line 121
    iget-boolean v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->w:Z

    .line 122
    const/4 v4, 0x0

    .line 123
    .line 124
    if-nez v2, :cond_4

    .line 125
    .line 126
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->z:F

    .line 127
    .line 128
    cmpl-float v3, v2, v3

    .line 129
    .line 130
    if-lez v3, :cond_4

    .line 131
    .line 132
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k:Landroid/graphics/Paint;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 136
    .line 137
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k:Landroid/graphics/Paint;

    .line 138
    .line 139
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->y:I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 143
    move v2, v4

    .line 144
    .line 145
    :goto_0
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g:I

    .line 146
    .line 147
    add-int/lit8 v3, v3, -0x1

    .line 148
    .line 149
    if-ge v2, v3, :cond_4

    .line 150
    .line 151
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 159
    move-result v5

    .line 160
    add-int/2addr v5, v1

    .line 161
    int-to-float v7, v5

    .line 162
    .line 163
    iget v8, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->A:F

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 167
    move-result v3

    .line 168
    add-int/2addr v3, v1

    .line 169
    int-to-float v9, v3

    .line 170
    int-to-float v3, v0

    .line 171
    .line 172
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->A:F

    .line 173
    .line 174
    sub-float v10, v3, v5

    .line 175
    .line 176
    iget-object v11, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k:Landroid/graphics/Paint;

    .line 177
    move-object v6, p1

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 181
    .line 182
    add-int/lit8 v2, v2, 0x1

    .line 183
    goto :goto_0

    .line 184
    :cond_4
    move-object v6, p1

    .line 185
    .line 186
    iget-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->w:Z

    .line 187
    .line 188
    if-eqz p1, :cond_5

    .line 189
    .line 190
    iget-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->N:Z

    .line 191
    .line 192
    if-eqz p1, :cond_6

    .line 193
    .line 194
    iput-boolean v4, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->N:Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d()V

    .line 198
    goto :goto_1

    .line 199
    .line 200
    .line 201
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d()V

    .line 202
    .line 203
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 204
    .line 205
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 209
    .line 210
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 211
    .line 212
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->r:F

    .line 213
    float-to-int v0, v0

    .line 214
    add-int/2addr v0, v1

    .line 215
    .line 216
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->h:Landroid/graphics/Rect;

    .line 217
    .line 218
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 219
    add-int/2addr v0, v3

    .line 220
    .line 221
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->s:F

    .line 222
    float-to-int v4, v3

    .line 223
    .line 224
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 225
    add-int/2addr v1, v2

    .line 226
    int-to-float v1, v1

    .line 227
    .line 228
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->t:F

    .line 229
    sub-float/2addr v1, v2

    .line 230
    float-to-int v1, v1

    .line 231
    .line 232
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 233
    add-float/2addr v3, v2

    .line 234
    float-to-int v2, v3

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 238
    .line 239
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 240
    .line 241
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->M:[F

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 245
    .line 246
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v6}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 250
    :cond_7
    :goto_2
    return-void
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
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Landroid/os/Bundle;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroid/os/Bundle;

    .line 7
    .line 8
    const-string v0, "mCurrentTab"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 15
    .line 16
    const-string v0, "instanceState"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->d:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    move-result v0

    .line 31
    .line 32
    if-lez v0, :cond_0

    .line 33
    .line 34
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 41
    return-void
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
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    const-string v1, "instanceState"

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    const-string v1, "mCurrentTab"

    .line 17
    .line 18
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 22
    return-object v0
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
.end method

.method public setCurrentTab(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 3
    .line 4
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f:I

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->j(I)V

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->w:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->e()V

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    return-void
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
.end method

.method public setDividerColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->y:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    return-void
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
.end method

.method public setDividerPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->A:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setDividerWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->z:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setIndicatorAnimDuration(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->v:J

    .line 3
    return-void
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
.end method

.method public setIndicatorAnimEnable(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->w:Z

    .line 3
    return-void
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
.end method

.method public setIndicatorBounceEnable(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->x:Z

    .line 3
    return-void
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
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->o:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    return-void
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
.end method

.method public setIndicatorCornerRadius(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->q:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setIndicatorHeight(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->p:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setOnTabSelectListener(Lww/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->Q:Lww/b;

    .line 3
    return-void
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
.end method

.method public setTabData([Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    array-length v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->c:[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->g()V

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "Titles can not be NULL or EMPTY !"

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    throw p1
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
.end method

.method public setTabPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->l:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setTabSpaceEqual(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->m:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

    .line 6
    return-void
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
.end method

.method public setTabWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->f(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->n:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setTextAllCaps(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->F:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

    .line 6
    return-void
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
.end method

.method public setTextBold(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->E:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

    .line 6
    return-void
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
.end method

.method public setTextSelectColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->C:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

    .line 6
    return-void
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
.end method

.method public setTextUnselectColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->D:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

    .line 6
    return-void
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
.end method

.method public setTextsize(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->i(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->B:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SegmentTabLayout;->k()V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
