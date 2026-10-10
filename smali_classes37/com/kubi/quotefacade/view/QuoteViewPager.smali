.class public final Lcom/kubi/quotefacade/view/QuoteViewPager;
.super Lcom/kubi/resources/widget/CustomViewPager;
.source "QuoteViewPager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/quotefacade/view/QuoteViewPager;",
        "Lcom/kubi/resources/widget/CustomViewPager;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "startX",
        "",
        "startY",
        "quoteMarketCurrentItem",
        "",
        "alphaMarketCurrentItem",
        "quoteChainCurrentItem",
        "quoteMarketPageSize",
        "alphaMarketPageSize",
        "scaledTouchSlop",
        "onInterceptTouchEvent",
        "",
        "ev",
        "Landroid/view/MotionEvent;",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public i:F

.field public j:F

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/CustomViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->k:I

    .line 3
    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->l:I

    .line 4
    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->m:I

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->p:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/kubi/resources/widget/CustomViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->k:I

    .line 8
    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->l:I

    .line 9
    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->m:I

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->p:I

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "ev"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 20
    move-result v0

    .line 21
    .line 22
    iget v1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->i:F

    .line 23
    sub-float/2addr v0, v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 27
    move-result v1

    .line 28
    .line 29
    iget v2, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->j:F

    .line 30
    sub-float/2addr v1, v2

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 38
    move-result v1

    .line 39
    .line 40
    cmpl-float v1, v2, v1

    .line 41
    .line 42
    if-lez v1, :cond_e

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 46
    move-result v1

    .line 47
    .line 48
    iget v2, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->p:I

    .line 49
    int-to-float v2, v2

    .line 50
    .line 51
    cmpl-float v1, v1, v2

    .line 52
    .line 53
    if-lez v1, :cond_e

    .line 54
    .line 55
    iget v1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->n:I

    .line 56
    const/4 v2, 0x0

    .line 57
    const/4 v3, 0x1

    .line 58
    .line 59
    if-lez v1, :cond_2

    .line 60
    .line 61
    cmpg-float v4, v0, v2

    .line 62
    .line 63
    if-gez v4, :cond_1

    .line 64
    .line 65
    iget v4, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->k:I

    .line 66
    sub-int/2addr v1, v3

    .line 67
    .line 68
    if-ne v4, v1, :cond_1

    .line 69
    return v3

    .line 70
    .line 71
    :cond_1
    cmpl-float v1, v0, v2

    .line 72
    .line 73
    if-lez v1, :cond_2

    .line 74
    .line 75
    iget v1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->k:I

    .line 76
    .line 77
    if-nez v1, :cond_2

    .line 78
    return v3

    .line 79
    .line 80
    :cond_2
    cmpl-float v1, v0, v2

    .line 81
    .line 82
    if-lez v1, :cond_3

    .line 83
    .line 84
    iget v4, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->m:I

    .line 85
    .line 86
    if-nez v4, :cond_3

    .line 87
    return v3

    .line 88
    .line 89
    :cond_3
    iget v4, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->o:I

    .line 90
    .line 91
    if-lez v4, :cond_e

    .line 92
    .line 93
    cmpg-float v0, v0, v2

    .line 94
    .line 95
    if-gez v0, :cond_4

    .line 96
    .line 97
    iget v0, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->l:I

    .line 98
    sub-int/2addr v4, v3

    .line 99
    .line 100
    if-ne v0, v4, :cond_4

    .line 101
    return v3

    .line 102
    .line 103
    :cond_4
    if-lez v1, :cond_e

    .line 104
    .line 105
    iget v0, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->l:I

    .line 106
    .line 107
    if-nez v0, :cond_e

    .line 108
    return v3

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 112
    move-result v0

    .line 113
    .line 114
    iput v0, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->i:F

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 118
    move-result v0

    .line 119
    .line 120
    iput v0, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->j:F

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 131
    move-result v1

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p0, v1}, Landroidx/viewpager/widget/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    instance-of v1, v0, Lcom/kubi/quotefacade/market/QuoteMarketFragment;

    .line 138
    const/4 v2, 0x0

    .line 139
    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    check-cast v0, Lcom/kubi/quotefacade/market/QuoteMarketFragment;

    .line 143
    goto :goto_0

    .line 144
    :cond_6
    move-object v0, v2

    .line 145
    :goto_0
    const/4 v1, -0x1

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/kubi/quotefacade/market/QuoteMarketFragment;->p3()Ljava/lang/Integer;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    if-eqz v3, :cond_7

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 157
    move-result v3

    .line 158
    goto :goto_1

    .line 159
    :cond_7
    move v3, v1

    .line 160
    .line 161
    :goto_1
    iput v3, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->k:I

    .line 162
    const/4 v3, 0x0

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/kubi/quotefacade/market/QuoteMarketFragment;->q3()I

    .line 168
    move-result v0

    .line 169
    goto :goto_2

    .line 170
    :cond_8
    move v0, v3

    .line 171
    .line 172
    :goto_2
    iput v0, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->n:I

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 176
    move-result-object v0

    .line 177
    .line 178
    .line 179
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 183
    move-result v4

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, p0, v4}, Landroidx/viewpager/widget/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    .line 187
    move-result-object v0

    .line 188
    .line 189
    instance-of v4, v0, Lcom/kubi/quotefacade/alpha/AlphaFragment;

    .line 190
    .line 191
    if-eqz v4, :cond_9

    .line 192
    .line 193
    check-cast v0, Lcom/kubi/quotefacade/alpha/AlphaFragment;

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    move-object v0, v2

    .line 196
    .line 197
    :goto_3
    if-eqz v0, :cond_a

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/AlphaFragment;->x3()Ljava/lang/Integer;

    .line 201
    move-result-object v4

    .line 202
    .line 203
    if-eqz v4, :cond_a

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 207
    move-result v4

    .line 208
    goto :goto_4

    .line 209
    :cond_a
    move v4, v1

    .line 210
    .line 211
    :goto_4
    iput v4, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->l:I

    .line 212
    .line 213
    if-eqz v0, :cond_b

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/AlphaFragment;->y3()I

    .line 217
    move-result v3

    .line 218
    .line 219
    :cond_b
    iput v3, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->o:I

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 230
    move-result v3

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p0, v3}, Landroidx/viewpager/widget/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    .line 234
    move-result-object v0

    .line 235
    .line 236
    instance-of v3, v0, Lcom/kubi/quotefacade/chain/ChainContainerFragment;

    .line 237
    .line 238
    if-eqz v3, :cond_c

    .line 239
    move-object v2, v0

    .line 240
    .line 241
    check-cast v2, Lcom/kubi/quotefacade/chain/ChainContainerFragment;

    .line 242
    .line 243
    :cond_c
    if-eqz v2, :cond_d

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Lcom/kubi/quotefacade/chain/ChainContainerFragment;->q3()Ljava/lang/Integer;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    if-eqz v0, :cond_d

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 253
    move-result v1

    .line 254
    .line 255
    :cond_d
    iput v1, p0, Lcom/kubi/quotefacade/view/QuoteViewPager;->m:I

    .line 256
    .line 257
    .line 258
    :cond_e
    :goto_5
    invoke-super {p0, p1}, Lcom/kubi/resources/widget/CustomViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 259
    move-result p1

    .line 260
    return p1
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
.end method
