.class public final Lcom/kubi/resources/widget/KcLabelView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "KcLabelView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/KcLabelView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J0\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/resources/widget/KcLabelView;",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "setLevel",
        "",
        "tipsLevel",
        "",
        "cornerRadiusTopStartPx",
        "cornerRadiusTopEndPx",
        "cornerRadiusBottomStartPx",
        "cornerRadiusBottomRightPx",
        "Companion",
        "LComponent_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/kubi/resources/widget/KcLabelView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/resources/widget/KcLabelView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/resources/widget/KcLabelView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/resources/widget/KcLabelView;->b:Lcom/kubi/resources/widget/KcLabelView$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "attrs"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/sdk/res/R$styleable;->KcLabelView:[I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-string p2, "obtainStyledAttributes(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    sget p2, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_level:I

    .line 27
    const/4 v0, 0x3

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 31
    move-result v2

    .line 32
    .line 33
    sget p2, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_cornerRadius:I

    .line 34
    .line 35
    const/high16 v0, 0x41000000    # 8.0f

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 43
    move-result p2

    .line 44
    .line 45
    sget v1, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_cornerRadius_topLeft:I

    .line 46
    .line 47
    const/high16 v3, -0x40800000    # -1.0f

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v3}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 51
    move-result v4

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 55
    move-result v1

    .line 56
    .line 57
    sget v4, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_cornerRadius_topRight:I

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v3}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 61
    move-result v5

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 65
    move-result v4

    .line 66
    .line 67
    sget v5, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_cornerRadius_bottomLeft:I

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v3}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 71
    move-result v6

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 75
    move-result v5

    .line 76
    .line 77
    sget v6, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_cornerRadius_bottomRight:I

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v3}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 81
    move-result v3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 85
    move-result v3

    .line 86
    .line 87
    sget v6, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_paddingHorizontal:I

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 91
    move-result v0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 95
    move-result v0

    .line 96
    .line 97
    sget v6, Lcom/kubi/sdk/res/R$styleable;->KcLabelView_klv_paddingVertical:I

    .line 98
    .line 99
    const/high16 v7, 0x40800000    # 4.0f

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v7}, Lcom/kubi/utils/extensions/core/c;->c(Landroid/view/View;F)I

    .line 103
    move-result v7

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 107
    move-result v6

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0, v6, v0, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 114
    .line 115
    if-gez v1, :cond_0

    .line 116
    move v1, p2

    .line 117
    .line 118
    :cond_0
    if-gez v4, :cond_1

    .line 119
    move v4, p2

    .line 120
    .line 121
    :cond_1
    if-gez v5, :cond_2

    .line 122
    move v5, p2

    .line 123
    .line 124
    :cond_2
    if-gez v3, :cond_3

    .line 125
    move v6, p2

    .line 126
    :goto_0
    move v3, v1

    .line 127
    move-object v1, p0

    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move v6, v3

    .line 130
    goto :goto_0

    .line 131
    .line 132
    .line 133
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/resources/widget/KcLabelView;->b(IIIII)V

    .line 134
    return-void
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


# virtual methods
.method public final b(IIIII)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 10
    .line 11
    move/from16 v3, p2

    .line 12
    int-to-float v3, v3

    .line 13
    .line 14
    move/from16 v4, p3

    .line 15
    int-to-float v4, v4

    .line 16
    .line 17
    move/from16 v5, p5

    .line 18
    int-to-float v5, v5

    .line 19
    .line 20
    move/from16 v6, p4

    .line 21
    int-to-float v6, v6

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 25
    move-result v7

    .line 26
    const/4 v9, 0x6

    .line 27
    const/4 v10, 0x5

    .line 28
    .line 29
    const/16 v11, 0x8

    .line 30
    const/4 v12, 0x4

    .line 31
    const/4 v13, 0x3

    .line 32
    const/4 v14, 0x2

    .line 33
    const/4 v15, 0x0

    .line 34
    .line 35
    const/16 p2, 0x7

    .line 36
    const/4 v8, 0x1

    .line 37
    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    new-array v7, v11, [F

    .line 41
    .line 42
    aput v4, v7, v15

    .line 43
    .line 44
    aput v4, v7, v8

    .line 45
    .line 46
    aput v3, v7, v14

    .line 47
    .line 48
    aput v3, v7, v13

    .line 49
    .line 50
    aput v6, v7, v12

    .line 51
    .line 52
    aput v6, v7, v10

    .line 53
    .line 54
    aput v5, v7, v9

    .line 55
    .line 56
    aput v5, v7, p2

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_0
    new-array v7, v11, [F

    .line 60
    .line 61
    aput v3, v7, v15

    .line 62
    .line 63
    aput v3, v7, v8

    .line 64
    .line 65
    aput v4, v7, v14

    .line 66
    .line 67
    aput v4, v7, v13

    .line 68
    .line 69
    aput v5, v7, v12

    .line 70
    .line 71
    aput v5, v7, v10

    .line 72
    .line 73
    aput v6, v7, v9

    .line 74
    .line 75
    aput v6, v7, p2

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    sget v4, Lcom/kubi/sdk/res/R$color;->c_cover4:I

    .line 85
    .line 86
    .line 87
    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 88
    move-result v3

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    move-result-object v5

    .line 93
    .line 94
    sget v6, Lcom/kubi/sdk/res/R$color;->c_text40:I

    .line 95
    .line 96
    .line 97
    invoke-static {v5, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 98
    move-result v5

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    if-eq v1, v8, :cond_5

    .line 103
    .line 104
    if-eq v1, v14, :cond_4

    .line 105
    .line 106
    if-eq v1, v13, :cond_3

    .line 107
    .line 108
    if-eq v1, v12, :cond_1

    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    sget v4, Lcom/kubi/sdk/res/R$color;->light_green_aaff8d:I

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 120
    move-result v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 124
    move-result-object v5

    .line 125
    .line 126
    sget v6, Lcom/kubi/sdk/res/R$color;->light_green_7ffca7:I

    .line 127
    .line 128
    .line 129
    invoke-static {v5, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 130
    move-result v5

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 134
    move-result v7

    .line 135
    .line 136
    if-eqz v7, :cond_2

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 144
    move-result v1

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    .line 151
    invoke-static {v5, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 152
    move-result v5

    .line 153
    .line 154
    .line 155
    :cond_2
    filled-new-array {v1, v5}, [I

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 160
    .line 161
    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    sget v4, Lcom/kubi/sdk/res/R$color;->c_text_black:I

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 174
    move-result v5

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    sget v4, Lcom/kubi/sdk/res/R$font;->semi:I

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v4}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 188
    move v15, v8

    .line 189
    goto :goto_1

    .line 190
    .line 191
    .line 192
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 197
    move-result v3

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 201
    move-result-object v1

    .line 202
    .line 203
    .line 204
    invoke-static {v1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 205
    move-result v5

    .line 206
    goto :goto_1

    .line 207
    .line 208
    .line 209
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    sget v3, Lcom/kubi/sdk/res/R$color;->complementary8:I

    .line 213
    .line 214
    .line 215
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 216
    move-result v3

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 220
    move-result-object v1

    .line 221
    .line 222
    sget v4, Lcom/kubi/sdk/res/R$color;->complementary:I

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 226
    move-result v5

    .line 227
    goto :goto_1

    .line 228
    .line 229
    .line 230
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 231
    move-result-object v1

    .line 232
    .line 233
    sget v3, Lcom/kubi/sdk/res/R$color;->brandRed8:I

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 237
    move-result v3

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 241
    move-result-object v1

    .line 242
    .line 243
    sget v4, Lcom/kubi/sdk/res/R$color;->brandRed:I

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 247
    move-result v5

    .line 248
    goto :goto_1

    .line 249
    .line 250
    .line 251
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 252
    move-result-object v1

    .line 253
    .line 254
    sget v3, Lcom/kubi/sdk/res/R$color;->brandGreen8:I

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 258
    move-result v3

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    sget v4, Lcom/kubi/sdk/res/R$color;->brandGreen:I

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 268
    move-result v5

    .line 269
    .line 270
    :goto_1
    if-nez v15, :cond_7

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 274
    .line 275
    .line 276
    :cond_7
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 280
    return-void
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
.end method
